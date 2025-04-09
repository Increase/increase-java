// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.digitalcardprofiles

import com.increase.api.services.blocking.DigitalCardProfileService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** List Card Profiles */
class DigitalCardProfileListPage
private constructor(
    private val digitalCardProfilesService: DigitalCardProfileService,
    private val params: DigitalCardProfileListParams,
    private val response: DigitalCardProfileListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): DigitalCardProfileListPageResponse = response

    /**
     * Delegates to [DigitalCardProfileListPageResponse], but gracefully handles missing data.
     *
     * @see [DigitalCardProfileListPageResponse.data]
     */
    fun data(): List<DigitalCardProfile> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [DigitalCardProfileListPageResponse], but gracefully handles missing data.
     *
     * @see [DigitalCardProfileListPageResponse.nextCursor]
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is DigitalCardProfileListPage && digitalCardProfilesService == other.digitalCardProfilesService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(digitalCardProfilesService, params, response) /* spotless:on */

    override fun toString() =
        "DigitalCardProfileListPage{digitalCardProfilesService=$digitalCardProfilesService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor().isPresent

    fun getNextPageParams(): Optional<DigitalCardProfileListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextCursor().ifPresent { cursor(it) } }.build()
        )
    }

    fun getNextPage(): Optional<DigitalCardProfileListPage> {
        return getNextPageParams().map { digitalCardProfilesService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            digitalCardProfilesService: DigitalCardProfileService,
            params: DigitalCardProfileListParams,
            response: DigitalCardProfileListPageResponse,
        ) = DigitalCardProfileListPage(digitalCardProfilesService, params, response)
    }

    class AutoPager(private val firstPage: DigitalCardProfileListPage) :
        Iterable<DigitalCardProfile> {

        override fun iterator(): Iterator<DigitalCardProfile> = iterator {
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

        fun stream(): Stream<DigitalCardProfile> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
