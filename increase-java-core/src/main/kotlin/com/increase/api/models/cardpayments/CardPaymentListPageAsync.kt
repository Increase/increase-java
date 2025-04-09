// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.cardpayments

import com.increase.api.core.checkRequired
import com.increase.api.services.async.CardPaymentServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/** @see [CardPaymentServiceAsync.list] */
class CardPaymentListPageAsync
private constructor(
    private val service: CardPaymentServiceAsync,
    private val params: CardPaymentListParams,
    private val response: CardPaymentListPageResponse,
) {

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

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor().isPresent

    fun getNextPageParams(): Optional<CardPaymentListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextCursor().ifPresent { cursor(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<CardPaymentListPageAsync>> =
        getNextPageParams()
            .map { service.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): CardPaymentListParams = params

    /** The response that this page was parsed from. */
    fun response(): CardPaymentListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CardPaymentListPageAsync].
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .response()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CardPaymentListPageAsync]. */
    class Builder internal constructor() {

        private var service: CardPaymentServiceAsync? = null
        private var params: CardPaymentListParams? = null
        private var response: CardPaymentListPageResponse? = null

        @JvmSynthetic
        internal fun from(cardPaymentListPageAsync: CardPaymentListPageAsync) = apply {
            service = cardPaymentListPageAsync.service
            params = cardPaymentListPageAsync.params
            response = cardPaymentListPageAsync.response
        }

        fun service(service: CardPaymentServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: CardPaymentListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CardPaymentListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [CardPaymentListPageAsync].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .response()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CardPaymentListPageAsync =
            CardPaymentListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CardPaymentListPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "CardPaymentListPageAsync{service=$service, params=$params, response=$response}"
}
