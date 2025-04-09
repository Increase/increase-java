// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.bookkeepingentries

import com.increase.api.services.async.BookkeepingEntryServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/** List Bookkeeping Entries */
class BookkeepingEntryListPageAsync
private constructor(
    private val bookkeepingEntriesService: BookkeepingEntryServiceAsync,
    private val params: BookkeepingEntryListParams,
    private val response: BookkeepingEntryListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): BookkeepingEntryListPageResponse = response

    /**
     * Delegates to [BookkeepingEntryListPageResponse], but gracefully handles missing data.
     *
     * @see [BookkeepingEntryListPageResponse.data]
     */
    fun data(): List<BookkeepingEntry> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [BookkeepingEntryListPageResponse], but gracefully handles missing data.
     *
     * @see [BookkeepingEntryListPageResponse.nextCursor]
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is BookkeepingEntryListPageAsync && bookkeepingEntriesService == other.bookkeepingEntriesService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(bookkeepingEntriesService, params, response) /* spotless:on */

    override fun toString() =
        "BookkeepingEntryListPageAsync{bookkeepingEntriesService=$bookkeepingEntriesService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor().isPresent

    fun getNextPageParams(): Optional<BookkeepingEntryListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextCursor().ifPresent { cursor(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<BookkeepingEntryListPageAsync>> {
        return getNextPageParams()
            .map { bookkeepingEntriesService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            bookkeepingEntriesService: BookkeepingEntryServiceAsync,
            params: BookkeepingEntryListParams,
            response: BookkeepingEntryListPageResponse,
        ) = BookkeepingEntryListPageAsync(bookkeepingEntriesService, params, response)
    }

    class AutoPager(private val firstPage: BookkeepingEntryListPageAsync) {

        fun forEach(
            action: Predicate<BookkeepingEntry>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<BookkeepingEntryListPageAsync>>.forEach(
                action: (BookkeepingEntry) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<BookkeepingEntry>> {
            val values = mutableListOf<BookkeepingEntry>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
