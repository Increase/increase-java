// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.physicalcards

import com.increase.api.services.blocking.PhysicalCardService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** List Physical Cards */
class PhysicalCardListPage
private constructor(
    private val physicalCardsService: PhysicalCardService,
    private val params: PhysicalCardListParams,
    private val response: PhysicalCardListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): PhysicalCardListPageResponse = response

    /**
     * Delegates to [PhysicalCardListPageResponse], but gracefully handles missing data.
     *
     * @see [PhysicalCardListPageResponse.data]
     */
    fun data(): List<PhysicalCard> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [PhysicalCardListPageResponse], but gracefully handles missing data.
     *
     * @see [PhysicalCardListPageResponse.nextCursor]
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PhysicalCardListPage && physicalCardsService == other.physicalCardsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(physicalCardsService, params, response) /* spotless:on */

    override fun toString() =
        "PhysicalCardListPage{physicalCardsService=$physicalCardsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor().isPresent

    fun getNextPageParams(): Optional<PhysicalCardListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextCursor().ifPresent { cursor(it) } }.build()
        )
    }

    fun getNextPage(): Optional<PhysicalCardListPage> {
        return getNextPageParams().map { physicalCardsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            physicalCardsService: PhysicalCardService,
            params: PhysicalCardListParams,
            response: PhysicalCardListPageResponse,
        ) = PhysicalCardListPage(physicalCardsService, params, response)
    }

    class AutoPager(private val firstPage: PhysicalCardListPage) : Iterable<PhysicalCard> {

        override fun iterator(): Iterator<PhysicalCard> = iterator {
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

        fun stream(): Stream<PhysicalCard> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
