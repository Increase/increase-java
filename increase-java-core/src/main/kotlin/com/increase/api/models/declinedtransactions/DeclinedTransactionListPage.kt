// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.declinedtransactions

import com.increase.api.services.blocking.DeclinedTransactionService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** List Declined Transactions */
class DeclinedTransactionListPage
private constructor(
    private val declinedTransactionsService: DeclinedTransactionService,
    private val params: DeclinedTransactionListParams,
    private val response: DeclinedTransactionListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): DeclinedTransactionListPageResponse = response

    /**
     * Delegates to [DeclinedTransactionListPageResponse], but gracefully handles missing data.
     *
     * @see [DeclinedTransactionListPageResponse.data]
     */
    fun data(): List<DeclinedTransaction> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [DeclinedTransactionListPageResponse], but gracefully handles missing data.
     *
     * @see [DeclinedTransactionListPageResponse.nextCursor]
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is DeclinedTransactionListPage && declinedTransactionsService == other.declinedTransactionsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(declinedTransactionsService, params, response) /* spotless:on */

    override fun toString() =
        "DeclinedTransactionListPage{declinedTransactionsService=$declinedTransactionsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor().isPresent

    fun getNextPageParams(): Optional<DeclinedTransactionListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextCursor().ifPresent { cursor(it) } }.build()
        )
    }

    fun getNextPage(): Optional<DeclinedTransactionListPage> {
        return getNextPageParams().map { declinedTransactionsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            declinedTransactionsService: DeclinedTransactionService,
            params: DeclinedTransactionListParams,
            response: DeclinedTransactionListPageResponse,
        ) = DeclinedTransactionListPage(declinedTransactionsService, params, response)
    }

    class AutoPager(private val firstPage: DeclinedTransactionListPage) :
        Iterable<DeclinedTransaction> {

        override fun iterator(): Iterator<DeclinedTransaction> = iterator {
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

        fun stream(): Stream<DeclinedTransaction> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
