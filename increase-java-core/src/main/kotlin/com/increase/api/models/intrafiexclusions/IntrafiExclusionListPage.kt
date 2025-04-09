// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.intrafiexclusions

import com.increase.api.services.blocking.IntrafiExclusionService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** List IntraFi Exclusions */
class IntrafiExclusionListPage
private constructor(
    private val intrafiExclusionsService: IntrafiExclusionService,
    private val params: IntrafiExclusionListParams,
    private val response: IntrafiExclusionListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): IntrafiExclusionListPageResponse = response

    /**
     * Delegates to [IntrafiExclusionListPageResponse], but gracefully handles missing data.
     *
     * @see [IntrafiExclusionListPageResponse.data]
     */
    fun data(): List<IntrafiExclusion> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [IntrafiExclusionListPageResponse], but gracefully handles missing data.
     *
     * @see [IntrafiExclusionListPageResponse.nextCursor]
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is IntrafiExclusionListPage && intrafiExclusionsService == other.intrafiExclusionsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(intrafiExclusionsService, params, response) /* spotless:on */

    override fun toString() =
        "IntrafiExclusionListPage{intrafiExclusionsService=$intrafiExclusionsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor().isPresent

    fun getNextPageParams(): Optional<IntrafiExclusionListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextCursor().ifPresent { cursor(it) } }.build()
        )
    }

    fun getNextPage(): Optional<IntrafiExclusionListPage> {
        return getNextPageParams().map { intrafiExclusionsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            intrafiExclusionsService: IntrafiExclusionService,
            params: IntrafiExclusionListParams,
            response: IntrafiExclusionListPageResponse,
        ) = IntrafiExclusionListPage(intrafiExclusionsService, params, response)
    }

    class AutoPager(private val firstPage: IntrafiExclusionListPage) : Iterable<IntrafiExclusion> {

        override fun iterator(): Iterator<IntrafiExclusion> = iterator {
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

        fun stream(): Stream<IntrafiExclusion> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
