// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.bookkeepingentrysets

import com.increase.api.services.blocking.BookkeepingEntrySetService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** List Bookkeeping Entry Sets */
class BookkeepingEntrySetListPage
private constructor(
    private val bookkeepingEntrySetsService: BookkeepingEntrySetService,
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

        return /* spotless:off */ other is BookkeepingEntrySetListPage && bookkeepingEntrySetsService == other.bookkeepingEntrySetsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(bookkeepingEntrySetsService, params, response) /* spotless:on */

    override fun toString() =
        "BookkeepingEntrySetListPage{bookkeepingEntrySetsService=$bookkeepingEntrySetsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor().isPresent

    fun getNextPageParams(): Optional<BookkeepingEntrySetListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextCursor().ifPresent { cursor(it) } }.build()
        )
    }

    fun getNextPage(): Optional<BookkeepingEntrySetListPage> {
        return getNextPageParams().map { bookkeepingEntrySetsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            bookkeepingEntrySetsService: BookkeepingEntrySetService,
            params: BookkeepingEntrySetListParams,
            response: BookkeepingEntrySetListPageResponse,
        ) = BookkeepingEntrySetListPage(bookkeepingEntrySetsService, params, response)
    }

    class AutoPager(private val firstPage: BookkeepingEntrySetListPage) :
        Iterable<BookkeepingEntrySet> {

        override fun iterator(): Iterator<BookkeepingEntrySet> = iterator {
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

        fun stream(): Stream<BookkeepingEntrySet> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
