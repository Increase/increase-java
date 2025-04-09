// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.cardpayments

import com.increase.api.services.async.CardPaymentServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/** List Card Payments */
class CardPaymentListPageAsync
private constructor(
    private val cardPaymentsService: CardPaymentServiceAsync,
    private val params: CardPaymentListParams,
    private val response: CardPaymentListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): CardPaymentListPageResponse = response

    /**
     * Delegates to [CardPaymentListPageResponse], but gracefully handles missing data.
     *
     * @see [CardPaymentListPageResponse.data]
     */
    fun data(): List<CardPayment> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [CardPaymentListPageResponse], but gracefully handles missing data.
     *
     * @see [CardPaymentListPageResponse.nextCursor]
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CardPaymentListPageAsync && cardPaymentsService == other.cardPaymentsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(cardPaymentsService, params, response) /* spotless:on */

    override fun toString() =
        "CardPaymentListPageAsync{cardPaymentsService=$cardPaymentsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor().isPresent

    fun getNextPageParams(): Optional<CardPaymentListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextCursor().ifPresent { cursor(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<CardPaymentListPageAsync>> {
        return getNextPageParams()
            .map { cardPaymentsService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            cardPaymentsService: CardPaymentServiceAsync,
            params: CardPaymentListParams,
            response: CardPaymentListPageResponse,
        ) = CardPaymentListPageAsync(cardPaymentsService, params, response)
    }

    class AutoPager(private val firstPage: CardPaymentListPageAsync) {

        fun forEach(action: Predicate<CardPayment>, executor: Executor): CompletableFuture<Void> {
            fun CompletableFuture<Optional<CardPaymentListPageAsync>>.forEach(
                action: (CardPayment) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<CardPayment>> {
            val values = mutableListOf<CardPayment>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
