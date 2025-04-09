// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.accountnumbers

import com.increase.api.services.async.AccountNumberServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/** List Account Numbers */
class AccountNumberListPageAsync
private constructor(
    private val accountNumbersService: AccountNumberServiceAsync,
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

        return /* spotless:off */ other is AccountNumberListPageAsync && accountNumbersService == other.accountNumbersService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(accountNumbersService, params, response) /* spotless:on */

    override fun toString() =
        "AccountNumberListPageAsync{accountNumbersService=$accountNumbersService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor().isPresent

    fun getNextPageParams(): Optional<AccountNumberListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextCursor().ifPresent { cursor(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<AccountNumberListPageAsync>> {
        return getNextPageParams()
            .map { accountNumbersService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            accountNumbersService: AccountNumberServiceAsync,
            params: AccountNumberListParams,
            response: AccountNumberListPageResponse,
        ) = AccountNumberListPageAsync(accountNumbersService, params, response)
    }

    class AutoPager(private val firstPage: AccountNumberListPageAsync) {

        fun forEach(action: Predicate<AccountNumber>, executor: Executor): CompletableFuture<Void> {
            fun CompletableFuture<Optional<AccountNumberListPageAsync>>.forEach(
                action: (AccountNumber) -> Boolean,
                executor: Executor,
            ): CompletableFuture<Void> =
                thenComposeAsync(
                    { page ->
                        page
                            .filter { it.data().all(action) }
                            .map { it.getNextPage().forEach(action, executor) }
                            .orElseGet { CompletableFuture.completedFuture(null) }
                    },
                    executor,
                )
            return CompletableFuture.completedFuture(Optional.of(firstPage))
                .forEach(action::test, executor)
        }

        fun toList(executor: Executor): CompletableFuture<List<AccountNumber>> {
            val values = mutableListOf<AccountNumber>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
