// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.declinedtransactions

import com.increase.api.services.async.DeclinedTransactionServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/** List Declined Transactions */
class DeclinedTransactionListPageAsync
private constructor(
    private val declinedTransactionsService: DeclinedTransactionServiceAsync,
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

        return /* spotless:off */ other is DeclinedTransactionListPageAsync && declinedTransactionsService == other.declinedTransactionsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(declinedTransactionsService, params, response) /* spotless:on */

    override fun toString() =
        "DeclinedTransactionListPageAsync{declinedTransactionsService=$declinedTransactionsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor().isPresent

    fun getNextPageParams(): Optional<DeclinedTransactionListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextCursor().ifPresent { cursor(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<DeclinedTransactionListPageAsync>> {
        return getNextPageParams()
            .map { declinedTransactionsService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            declinedTransactionsService: DeclinedTransactionServiceAsync,
            params: DeclinedTransactionListParams,
            response: DeclinedTransactionListPageResponse,
        ) = DeclinedTransactionListPageAsync(declinedTransactionsService, params, response)
    }

    class AutoPager(private val firstPage: DeclinedTransactionListPageAsync) {

        fun forEach(
            action: Predicate<DeclinedTransaction>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<DeclinedTransactionListPageAsync>>.forEach(
                action: (DeclinedTransaction) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<DeclinedTransaction>> {
            val values = mutableListOf<DeclinedTransaction>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
