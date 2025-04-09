// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.cardpurchasesupplements

import com.increase.api.services.blocking.CardPurchaseSupplementService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** List Card Purchase Supplements */
class CardPurchaseSupplementListPage
private constructor(
    private val cardPurchaseSupplementsService: CardPurchaseSupplementService,
    private val params: CardPurchaseSupplementListParams,
    private val response: CardPurchaseSupplementListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): CardPurchaseSupplementListPageResponse = response

    /**
     * Delegates to [CardPurchaseSupplementListPageResponse], but gracefully handles missing data.
     *
     * @see [CardPurchaseSupplementListPageResponse.data]
     */
    fun data(): List<CardPurchaseSupplement> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [CardPurchaseSupplementListPageResponse], but gracefully handles missing data.
     *
     * @see [CardPurchaseSupplementListPageResponse.nextCursor]
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CardPurchaseSupplementListPage && cardPurchaseSupplementsService == other.cardPurchaseSupplementsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(cardPurchaseSupplementsService, params, response) /* spotless:on */

    override fun toString() =
        "CardPurchaseSupplementListPage{cardPurchaseSupplementsService=$cardPurchaseSupplementsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor().isPresent

    fun getNextPageParams(): Optional<CardPurchaseSupplementListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextCursor().ifPresent { cursor(it) } }.build()
        )
    }

    fun getNextPage(): Optional<CardPurchaseSupplementListPage> {
        return getNextPageParams().map { cardPurchaseSupplementsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            cardPurchaseSupplementsService: CardPurchaseSupplementService,
            params: CardPurchaseSupplementListParams,
            response: CardPurchaseSupplementListPageResponse,
        ) = CardPurchaseSupplementListPage(cardPurchaseSupplementsService, params, response)
    }

    class AutoPager(private val firstPage: CardPurchaseSupplementListPage) :
        Iterable<CardPurchaseSupplement> {

        override fun iterator(): Iterator<CardPurchaseSupplement> = iterator {
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

        fun stream(): Stream<CardPurchaseSupplement> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
