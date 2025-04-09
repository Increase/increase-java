// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.routingnumbers

import com.increase.api.core.checkRequired
import com.increase.api.services.async.RoutingNumberServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/** @see [RoutingNumberServiceAsync.list] */
class RoutingNumberListPageAsync
private constructor(
    private val service: RoutingNumberServiceAsync,
    private val params: RoutingNumberListParams,
    private val response: RoutingNumberListPageResponse,
) {

    /**
     * Delegates to [RoutingNumberListPageResponse], but gracefully handles missing data.
     *
     * @see [RoutingNumberListPageResponse.data]
     */
    fun data(): List<RoutingNumberListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [RoutingNumberListPageResponse], but gracefully handles missing data.
     *
     * @see [RoutingNumberListPageResponse.nextCursor]
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor().isPresent

    fun getNextPageParams(): Optional<RoutingNumberListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextCursor().ifPresent { cursor(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<RoutingNumberListPageAsync>> =
        getNextPageParams()
            .map { service.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): RoutingNumberListParams = params

    /** The response that this page was parsed from. */
    fun response(): RoutingNumberListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [RoutingNumberListPageAsync].
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

    /** A builder for [RoutingNumberListPageAsync]. */
    class Builder internal constructor() {

        private var service: RoutingNumberServiceAsync? = null
        private var params: RoutingNumberListParams? = null
        private var response: RoutingNumberListPageResponse? = null

        @JvmSynthetic
        internal fun from(routingNumberListPageAsync: RoutingNumberListPageAsync) = apply {
            service = routingNumberListPageAsync.service
            params = routingNumberListPageAsync.params
            response = routingNumberListPageAsync.response
        }

        fun service(service: RoutingNumberServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: RoutingNumberListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: RoutingNumberListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [RoutingNumberListPageAsync].
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
        fun build(): RoutingNumberListPageAsync =
            RoutingNumberListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: RoutingNumberListPageAsync) {

        fun forEach(
            action: Predicate<RoutingNumberListResponse>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<RoutingNumberListPageAsync>>.forEach(
                action: (RoutingNumberListResponse) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<RoutingNumberListResponse>> {
            val values = mutableListOf<RoutingNumberListResponse>()
            return forEach(values::add, executor).thenApply { values }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is RoutingNumberListPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "RoutingNumberListPageAsync{service=$service, params=$params, response=$response}"
}
