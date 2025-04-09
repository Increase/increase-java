// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.accounttransfers

import com.increase.api.services.blocking.AccountTransferService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** List Account Transfers */
class AccountTransferListPage
private constructor(
    private val accountTransfersService: AccountTransferService,
    private val params: AccountTransferListParams,
    private val response: AccountTransferListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): AccountTransferListPageResponse = response

    /**
     * Delegates to [AccountTransferListPageResponse], but gracefully handles missing data.
     *
     * @see [AccountTransferListPageResponse.data]
     */
    fun data(): List<AccountTransfer> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [AccountTransferListPageResponse], but gracefully handles missing data.
     *
     * @see [AccountTransferListPageResponse.nextCursor]
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AccountTransferListPage && accountTransfersService == other.accountTransfersService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(accountTransfersService, params, response) /* spotless:on */

    override fun toString() =
        "AccountTransferListPage{accountTransfersService=$accountTransfersService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor().isPresent

    fun getNextPageParams(): Optional<AccountTransferListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextCursor().ifPresent { cursor(it) } }.build()
        )
    }

    fun getNextPage(): Optional<AccountTransferListPage> {
        return getNextPageParams().map { accountTransfersService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            accountTransfersService: AccountTransferService,
            params: AccountTransferListParams,
            response: AccountTransferListPageResponse,
        ) = AccountTransferListPage(accountTransfersService, params, response)
    }

    class AutoPager(private val firstPage: AccountTransferListPage) : Iterable<AccountTransfer> {

        override fun iterator(): Iterator<AccountTransfer> = iterator {
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

        fun stream(): Stream<AccountTransfer> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
