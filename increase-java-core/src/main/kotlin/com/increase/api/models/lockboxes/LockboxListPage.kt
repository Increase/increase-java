// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.lockboxes

import com.increase.api.services.blocking.LockboxService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** List Lockboxes */
class LockboxListPage
private constructor(
    private val lockboxesService: LockboxService,
    private val params: LockboxListParams,
    private val response: LockboxListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): LockboxListPageResponse = response

    /**
     * Delegates to [LockboxListPageResponse], but gracefully handles missing data.
     *
     * @see [LockboxListPageResponse.data]
     */
    fun data(): List<Lockbox> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [LockboxListPageResponse], but gracefully handles missing data.
     *
     * @see [LockboxListPageResponse.nextCursor]
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is LockboxListPage && lockboxesService == other.lockboxesService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(lockboxesService, params, response) /* spotless:on */

    override fun toString() =
        "LockboxListPage{lockboxesService=$lockboxesService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor().isPresent

    fun getNextPageParams(): Optional<LockboxListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextCursor().ifPresent { cursor(it) } }.build()
        )
    }

    fun getNextPage(): Optional<LockboxListPage> {
        return getNextPageParams().map { lockboxesService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            lockboxesService: LockboxService,
            params: LockboxListParams,
            response: LockboxListPageResponse,
        ) = LockboxListPage(lockboxesService, params, response)
    }

    class AutoPager(private val firstPage: LockboxListPage) : Iterable<Lockbox> {

        override fun iterator(): Iterator<Lockbox> = iterator {
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

        fun stream(): Stream<Lockbox> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
