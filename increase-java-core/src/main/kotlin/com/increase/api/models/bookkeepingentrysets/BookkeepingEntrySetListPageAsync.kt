// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.bookkeepingentrysets

import com.increase.api.services.async.BookkeepingEntrySetServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/** List Bookkeeping Entry Sets */
class BookkeepingEntrySetListPageAsync
private constructor(
    private val bookkeepingEntrySetsService: BookkeepingEntrySetServiceAsync,
    private val params: BookkeepingEntrySetListParams,
    private val response: BookkeepingEntrySetListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): BookkeepingEntrySetListPageResponse = response

    /**
     * Delegates to [BookkeepingEntrySetListPageResponse], but gracefully handles missing data.
     *
     * @see [BookkeepingEntrySetListPageResponse.data]
     */
    fun data(): List<BookkeepingEntrySet> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [BookkeepingEntrySetListPageResponse], but gracefully handles missing data.
     *
     * @see [BookkeepingEntrySetListPageResponse.nextCursor]
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is BookkeepingEntrySetListPageAsync && bookkeepingEntrySetsService == other.bookkeepingEntrySetsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(bookkeepingEntrySetsService, params, response) /* spotless:on */

    override fun toString() =
        "BookkeepingEntrySetListPageAsync{bookkeepingEntrySetsService=$bookkeepingEntrySetsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor().isPresent

    fun getNextPageParams(): Optional<BookkeepingEntrySetListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextCursor().ifPresent { cursor(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<BookkeepingEntrySetListPageAsync>> {
        return getNextPageParams()
            .map { bookkeepingEntrySetsService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            bookkeepingEntrySetsService: BookkeepingEntrySetServiceAsync,
            params: BookkeepingEntrySetListParams,
            response: BookkeepingEntrySetListPageResponse,
        ) = BookkeepingEntrySetListPageAsync(bookkeepingEntrySetsService, params, response)
    }

    class AutoPager(private val firstPage: BookkeepingEntrySetListPageAsync) {

        fun forEach(
            action: Predicate<BookkeepingEntrySet>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<BookkeepingEntrySetListPageAsync>>.forEach(
                action: (BookkeepingEntrySet) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<BookkeepingEntrySet>> {
            val values = mutableListOf<BookkeepingEntrySet>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
