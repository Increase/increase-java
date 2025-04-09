// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.physicalcardprofiles

import com.increase.api.services.blocking.PhysicalCardProfileService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** List Physical Card Profiles */
class PhysicalCardProfileListPage
private constructor(
    private val physicalCardProfilesService: PhysicalCardProfileService,
    private val params: PhysicalCardProfileListParams,
    private val response: PhysicalCardProfileListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): PhysicalCardProfileListPageResponse = response

    /**
     * Delegates to [PhysicalCardProfileListPageResponse], but gracefully handles missing data.
     *
     * @see [PhysicalCardProfileListPageResponse.data]
     */
    fun data(): List<PhysicalCardProfile> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [PhysicalCardProfileListPageResponse], but gracefully handles missing data.
     *
     * @see [PhysicalCardProfileListPageResponse.nextCursor]
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PhysicalCardProfileListPage && physicalCardProfilesService == other.physicalCardProfilesService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(physicalCardProfilesService, params, response) /* spotless:on */

    override fun toString() =
        "PhysicalCardProfileListPage{physicalCardProfilesService=$physicalCardProfilesService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor().isPresent

    fun getNextPageParams(): Optional<PhysicalCardProfileListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextCursor().ifPresent { cursor(it) } }.build()
        )
    }

    fun getNextPage(): Optional<PhysicalCardProfileListPage> {
        return getNextPageParams().map { physicalCardProfilesService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            physicalCardProfilesService: PhysicalCardProfileService,
            params: PhysicalCardProfileListParams,
            response: PhysicalCardProfileListPageResponse,
        ) = PhysicalCardProfileListPage(physicalCardProfilesService, params, response)
    }

    class AutoPager(private val firstPage: PhysicalCardProfileListPage) :
        Iterable<PhysicalCardProfile> {

        override fun iterator(): Iterator<PhysicalCardProfile> = iterator {
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

        fun stream(): Stream<PhysicalCardProfile> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
