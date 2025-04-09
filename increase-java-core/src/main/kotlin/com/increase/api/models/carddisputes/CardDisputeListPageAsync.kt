// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.carddisputes

import com.increase.api.services.async.CardDisputeServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/** List Card Disputes */
class CardDisputeListPageAsync
private constructor(
    private val cardDisputesService: CardDisputeServiceAsync,
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

        return /* spotless:off */ other is CardDisputeListPageAsync && cardDisputesService == other.cardDisputesService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(cardDisputesService, params, response) /* spotless:on */

    override fun toString() =
        "CardDisputeListPageAsync{cardDisputesService=$cardDisputesService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor().isPresent

    fun getNextPageParams(): Optional<CardDisputeListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextCursor().ifPresent { cursor(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<CardDisputeListPageAsync>> {
        return getNextPageParams()
            .map { cardDisputesService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            cardDisputesService: CardDisputeServiceAsync,
            params: CardDisputeListParams,
            response: CardDisputeListPageResponse,
        ) = CardDisputeListPageAsync(cardDisputesService, params, response)
    }

    class AutoPager(private val firstPage: CardDisputeListPageAsync) {

        fun forEach(action: Predicate<CardDispute>, executor: Executor): CompletableFuture<Void> {
            fun CompletableFuture<Optional<CardDisputeListPageAsync>>.forEach(
                action: (CardDispute) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<CardDispute>> {
            val values = mutableListOf<CardDispute>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
