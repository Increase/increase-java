// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.bookkeepingentries

import com.increase.api.services.blocking.BookkeepingEntryService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** List Bookkeeping Entries */
class BookkeepingEntryListPage
private constructor(
    private val bookkeepingEntriesService: BookkeepingEntryService,
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

        return /* spotless:off */ other is BookkeepingEntryListPage && bookkeepingEntriesService == other.bookkeepingEntriesService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(bookkeepingEntriesService, params, response) /* spotless:on */

    override fun toString() =
        "BookkeepingEntryListPage{bookkeepingEntriesService=$bookkeepingEntriesService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor().isPresent

    fun getNextPageParams(): Optional<BookkeepingEntryListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextCursor().ifPresent { cursor(it) } }.build()
        )
    }

    fun getNextPage(): Optional<BookkeepingEntryListPage> {
        return getNextPageParams().map { bookkeepingEntriesService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            bookkeepingEntriesService: BookkeepingEntryService,
            params: BookkeepingEntryListParams,
            response: BookkeepingEntryListPageResponse,
        ) = BookkeepingEntryListPage(bookkeepingEntriesService, params, response)
    }

    class AutoPager(private val firstPage: BookkeepingEntryListPage) : Iterable<BookkeepingEntry> {

        override fun iterator(): Iterator<BookkeepingEntry> = iterator {
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

        fun stream(): Stream<BookkeepingEntry> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
