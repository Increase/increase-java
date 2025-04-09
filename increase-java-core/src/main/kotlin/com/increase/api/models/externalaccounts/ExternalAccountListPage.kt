// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.externalaccounts

import com.increase.api.services.blocking.ExternalAccountService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** List External Accounts */
class ExternalAccountListPage
private constructor(
    private val externalAccountsService: ExternalAccountService,
    private val params: ExternalAccountListParams,
    private val response: ExternalAccountListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): ExternalAccountListPageResponse = response

    /**
     * Delegates to [ExternalAccountListPageResponse], but gracefully handles missing data.
     *
     * @see [ExternalAccountListPageResponse.data]
     */
    fun data(): List<ExternalAccount> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [ExternalAccountListPageResponse], but gracefully handles missing data.
     *
     * @see [ExternalAccountListPageResponse.nextCursor]
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ExternalAccountListPage && externalAccountsService == other.externalAccountsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(externalAccountsService, params, response) /* spotless:on */

    override fun toString() =
        "ExternalAccountListPage{externalAccountsService=$externalAccountsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor().isPresent

    fun getNextPageParams(): Optional<ExternalAccountListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextCursor().ifPresent { cursor(it) } }.build()
        )
    }

    fun getNextPage(): Optional<ExternalAccountListPage> {
        return getNextPageParams().map { externalAccountsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            externalAccountsService: ExternalAccountService,
            params: ExternalAccountListParams,
            response: ExternalAccountListPageResponse,
        ) = ExternalAccountListPage(externalAccountsService, params, response)
    }

    class AutoPager(private val firstPage: ExternalAccountListPage) : Iterable<ExternalAccount> {

        override fun iterator(): Iterator<ExternalAccount> = iterator {
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

        fun stream(): Stream<ExternalAccount> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
