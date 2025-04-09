// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.bookkeepingaccounts

import com.increase.api.services.blocking.BookkeepingAccountService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** List Bookkeeping Accounts */
class BookkeepingAccountListPage
private constructor(
    private val bookkeepingAccountsService: BookkeepingAccountService,
    private val params: BookkeepingAccountListParams,
    private val response: BookkeepingAccountListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): BookkeepingAccountListPageResponse = response

    /**
     * Delegates to [BookkeepingAccountListPageResponse], but gracefully handles missing data.
     *
     * @see [BookkeepingAccountListPageResponse.data]
     */
    fun data(): List<BookkeepingAccount> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [BookkeepingAccountListPageResponse], but gracefully handles missing data.
     *
     * @see [BookkeepingAccountListPageResponse.nextCursor]
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is BookkeepingAccountListPage && bookkeepingAccountsService == other.bookkeepingAccountsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(bookkeepingAccountsService, params, response) /* spotless:on */

    override fun toString() =
        "BookkeepingAccountListPage{bookkeepingAccountsService=$bookkeepingAccountsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor().isPresent

    fun getNextPageParams(): Optional<BookkeepingAccountListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextCursor().ifPresent { cursor(it) } }.build()
        )
    }

    fun getNextPage(): Optional<BookkeepingAccountListPage> {
        return getNextPageParams().map { bookkeepingAccountsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            bookkeepingAccountsService: BookkeepingAccountService,
            params: BookkeepingAccountListParams,
            response: BookkeepingAccountListPageResponse,
        ) = BookkeepingAccountListPage(bookkeepingAccountsService, params, response)
    }

    class AutoPager(private val firstPage: BookkeepingAccountListPage) :
        Iterable<BookkeepingAccount> {

        override fun iterator(): Iterator<BookkeepingAccount> = iterator {
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

        fun stream(): Stream<BookkeepingAccount> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
