// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.pendingtransactions

import com.increase.api.services.blocking.PendingTransactionService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** List Pending Transactions */
class PendingTransactionListPage
private constructor(
    private val pendingTransactionsService: PendingTransactionService,
    private val params: PendingTransactionListParams,
    private val response: PendingTransactionListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): PendingTransactionListPageResponse = response

    /**
     * Delegates to [PendingTransactionListPageResponse], but gracefully handles missing data.
     *
     * @see [PendingTransactionListPageResponse.data]
     */
    fun data(): List<PendingTransaction> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [PendingTransactionListPageResponse], but gracefully handles missing data.
     *
     * @see [PendingTransactionListPageResponse.nextCursor]
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PendingTransactionListPage && pendingTransactionsService == other.pendingTransactionsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(pendingTransactionsService, params, response) /* spotless:on */

    override fun toString() =
        "PendingTransactionListPage{pendingTransactionsService=$pendingTransactionsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor().isPresent

    fun getNextPageParams(): Optional<PendingTransactionListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextCursor().ifPresent { cursor(it) } }.build()
        )
    }

    fun getNextPage(): Optional<PendingTransactionListPage> {
        return getNextPageParams().map { pendingTransactionsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            pendingTransactionsService: PendingTransactionService,
            params: PendingTransactionListParams,
            response: PendingTransactionListPageResponse,
        ) = PendingTransactionListPage(pendingTransactionsService, params, response)
    }

    class AutoPager(private val firstPage: PendingTransactionListPage) :
        Iterable<PendingTransaction> {

        override fun iterator(): Iterator<PendingTransaction> = iterator {
            var page = firstPage
            var index = 0
            while (true) {
                while (index < page.data().size) {
                    yield(page.data()[index++])
                }
                page = page.getNextPage().getOrNull() ?: break
                index = 0
            }
        }

        fun stream(): Stream<PendingTransaction> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
