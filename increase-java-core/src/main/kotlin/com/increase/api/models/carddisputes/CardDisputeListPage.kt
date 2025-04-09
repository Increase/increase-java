// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.carddisputes

import com.increase.api.services.blocking.CardDisputeService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** List Card Disputes */
class CardDisputeListPage
private constructor(
    private val cardDisputesService: CardDisputeService,
    private val params: CardDisputeListParams,
    private val response: CardDisputeListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): CardDisputeListPageResponse = response

    /**
     * Delegates to [CardDisputeListPageResponse], but gracefully handles missing data.
     *
     * @see [CardDisputeListPageResponse.data]
     */
    fun data(): List<CardDispute> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [CardDisputeListPageResponse], but gracefully handles missing data.
     *
     * @see [CardDisputeListPageResponse.nextCursor]
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CardDisputeListPage && cardDisputesService == other.cardDisputesService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(cardDisputesService, params, response) /* spotless:on */

    override fun toString() =
        "CardDisputeListPage{cardDisputesService=$cardDisputesService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor().isPresent

    fun getNextPageParams(): Optional<CardDisputeListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextCursor().ifPresent { cursor(it) } }.build()
        )
    }

    fun getNextPage(): Optional<CardDisputeListPage> {
        return getNextPageParams().map { cardDisputesService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            cardDisputesService: CardDisputeService,
            params: CardDisputeListParams,
            response: CardDisputeListPageResponse,
        ) = CardDisputeListPage(cardDisputesService, params, response)
    }

    class AutoPager(private val firstPage: CardDisputeListPage) : Iterable<CardDispute> {

        override fun iterator(): Iterator<CardDispute> = iterator {
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

        fun stream(): Stream<CardDispute> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
