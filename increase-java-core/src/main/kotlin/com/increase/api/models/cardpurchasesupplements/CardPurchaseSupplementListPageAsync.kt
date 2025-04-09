// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.cardpurchasesupplements

import com.increase.api.services.async.CardPurchaseSupplementServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/** List Card Purchase Supplements */
class CardPurchaseSupplementListPageAsync
private constructor(
    private val cardPurchaseSupplementsService: CardPurchaseSupplementServiceAsync,
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

        return /* spotless:off */ other is CardPurchaseSupplementListPageAsync && cardPurchaseSupplementsService == other.cardPurchaseSupplementsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(cardPurchaseSupplementsService, params, response) /* spotless:on */

    override fun toString() =
        "CardPurchaseSupplementListPageAsync{cardPurchaseSupplementsService=$cardPurchaseSupplementsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor().isPresent

    fun getNextPageParams(): Optional<CardPurchaseSupplementListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextCursor().ifPresent { cursor(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<CardPurchaseSupplementListPageAsync>> {
        return getNextPageParams()
            .map { cardPurchaseSupplementsService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            cardPurchaseSupplementsService: CardPurchaseSupplementServiceAsync,
            params: CardPurchaseSupplementListParams,
            response: CardPurchaseSupplementListPageResponse,
        ) = CardPurchaseSupplementListPageAsync(cardPurchaseSupplementsService, params, response)
    }

    class AutoPager(private val firstPage: CardPurchaseSupplementListPageAsync) {

        fun forEach(
            action: Predicate<CardPurchaseSupplement>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<CardPurchaseSupplementListPageAsync>>.forEach(
                action: (CardPurchaseSupplement) -> Boolean,
                executor: Executor,
            ): CompletableFuture<Void> =
                thenComposeAsync(
                    { page ->
                        page
                            .filter { it.data().all(action) }
                            .map { it.getNextPage().forEach(action, executor) }
                            .orElseGet { CompletableFuture.completedFuture(null) }
                    },
                    executor,
                )
            return CompletableFuture.completedFuture(Optional.of(firstPage))
                .forEach(action::test, executor)
        }

        fun toList(executor: Executor): CompletableFuture<List<CardPurchaseSupplement>> {
            val values = mutableListOf<CardPurchaseSupplement>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
