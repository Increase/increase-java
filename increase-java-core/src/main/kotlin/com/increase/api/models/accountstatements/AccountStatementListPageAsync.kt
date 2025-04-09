// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.accountstatements

import com.increase.api.services.async.AccountStatementServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/** List Account Statements */
class AccountStatementListPageAsync
private constructor(
    private val accountStatementsService: AccountStatementServiceAsync,
    private val params: AccountStatementListParams,
    private val response: AccountStatementListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): AccountStatementListPageResponse = response

    /**
     * Delegates to [AccountStatementListPageResponse], but gracefully handles missing data.
     *
     * @see [AccountStatementListPageResponse.data]
     */
    fun data(): List<AccountStatement> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [AccountStatementListPageResponse], but gracefully handles missing data.
     *
     * @see [AccountStatementListPageResponse.nextCursor]
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AccountStatementListPageAsync && accountStatementsService == other.accountStatementsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(accountStatementsService, params, response) /* spotless:on */

    override fun toString() =
        "AccountStatementListPageAsync{accountStatementsService=$accountStatementsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor().isPresent

    fun getNextPageParams(): Optional<AccountStatementListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextCursor().ifPresent { cursor(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<AccountStatementListPageAsync>> {
        return getNextPageParams()
            .map { accountStatementsService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            accountStatementsService: AccountStatementServiceAsync,
            params: AccountStatementListParams,
            response: AccountStatementListPageResponse,
        ) = AccountStatementListPageAsync(accountStatementsService, params, response)
    }

    class AutoPager(private val firstPage: AccountStatementListPageAsync) {

        fun forEach(
            action: Predicate<AccountStatement>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<AccountStatementListPageAsync>>.forEach(
                action: (AccountStatement) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<AccountStatement>> {
            val values = mutableListOf<AccountStatement>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
