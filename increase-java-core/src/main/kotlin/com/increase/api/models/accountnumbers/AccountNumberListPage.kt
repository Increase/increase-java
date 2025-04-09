// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.accountnumbers

import com.increase.api.services.blocking.AccountNumberService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** List Account Numbers */
class AccountNumberListPage
private constructor(
    private val accountNumbersService: AccountNumberService,
    private val params: AccountNumberListParams,
    private val response: AccountNumberListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): AccountNumberListPageResponse = response

    /**
     * Delegates to [AccountNumberListPageResponse], but gracefully handles missing data.
     *
     * @see [AccountNumberListPageResponse.data]
     */
    fun data(): List<AccountNumber> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [AccountNumberListPageResponse], but gracefully handles missing data.
     *
     * @see [AccountNumberListPageResponse.nextCursor]
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AccountNumberListPage && accountNumbersService == other.accountNumbersService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(accountNumbersService, params, response) /* spotless:on */

    override fun toString() =
        "AccountNumberListPage{accountNumbersService=$accountNumbersService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor().isPresent

    fun getNextPageParams(): Optional<AccountNumberListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextCursor().ifPresent { cursor(it) } }.build()
        )
    }

    fun getNextPage(): Optional<AccountNumberListPage> {
        return getNextPageParams().map { accountNumbersService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            accountNumbersService: AccountNumberService,
            params: AccountNumberListParams,
            response: AccountNumberListPageResponse,
        ) = AccountNumberListPage(accountNumbersService, params, response)
    }

    class AutoPager(private val firstPage: AccountNumberListPage) : Iterable<AccountNumber> {

        override fun iterator(): Iterator<AccountNumber> = iterator {
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

        fun stream(): Stream<AccountNumber> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
