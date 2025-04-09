// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.carddisputes

import com.increase.api.core.checkRequired
import com.increase.api.services.async.CardDisputeServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/** @see [CardDisputeServiceAsync.list] */
class CardDisputeListPageAsync
private constructor(
    private val service: CardDisputeServiceAsync,
    private val params: CardDisputeListParams,
    private val response: CardDisputeListPageResponse,
) {

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

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor().isPresent

    fun getNextPageParams(): Optional<CardDisputeListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextCursor().ifPresent { cursor(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<CardDisputeListPageAsync>> =
        getNextPageParams()
            .map { service.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): CardDisputeListParams = params

    /** The response that this page was parsed from. */
    fun response(): CardDisputeListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CardDisputeListPageAsync].
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

    /** A builder for [CardDisputeListPageAsync]. */
    class Builder internal constructor() {

        private var service: CardDisputeServiceAsync? = null
        private var params: CardDisputeListParams? = null
        private var response: CardDisputeListPageResponse? = null

        @JvmSynthetic
        internal fun from(cardDisputeListPageAsync: CardDisputeListPageAsync) = apply {
            service = cardDisputeListPageAsync.service
            params = cardDisputeListPageAsync.params
            response = cardDisputeListPageAsync.response
        }

        fun service(service: CardDisputeServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: CardDisputeListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CardDisputeListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [CardDisputeListPageAsync].
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
        fun build(): CardDisputeListPageAsync =
            CardDisputeListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CardDisputeListPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "CardDisputeListPageAsync{service=$service, params=$params, response=$response}"
}
