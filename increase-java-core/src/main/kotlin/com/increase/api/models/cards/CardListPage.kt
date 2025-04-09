// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.cards

import com.increase.api.services.blocking.CardService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** List Cards */
class CardListPage
private constructor(
    private val cardsService: CardService,
    private val params: CardListParams,
    private val response: CardListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): CardListPageResponse = response

    /**
     * Delegates to [CardListPageResponse], but gracefully handles missing data.
     *
     * @see [CardListPageResponse.data]
     */
    fun data(): List<Card> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [CardListPageResponse], but gracefully handles missing data.
     *
     * @see [CardListPageResponse.nextCursor]
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CardListPage && cardsService == other.cardsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(cardsService, params, response) /* spotless:on */

    override fun toString() =
        "CardListPage{cardsService=$cardsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor().isPresent

    fun getNextPageParams(): Optional<CardListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextCursor().ifPresent { cursor(it) } }.build()
        )
    }

    fun getNextPage(): Optional<CardListPage> {
        return getNextPageParams().map { cardsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(cardsService: CardService, params: CardListParams, response: CardListPageResponse) =
            CardListPage(cardsService, params, response)
    }

    class AutoPager(private val firstPage: CardListPage) : Iterable<Card> {

        override fun iterator(): Iterator<Card> = iterator {
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

        fun stream(): Stream<Card> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
