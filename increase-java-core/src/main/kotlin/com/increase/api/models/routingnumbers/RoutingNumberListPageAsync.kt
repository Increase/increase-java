// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.routingnumbers

import com.increase.api.core.AutoPagerAsync
import com.increase.api.core.PageAsync
import com.increase.api.core.checkRequired
import com.increase.api.services.async.RoutingNumberServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see [RoutingNumberServiceAsync.list] */
class RoutingNumberListPageAsync
private constructor(
    private val service: RoutingNumberServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: RoutingNumberListParams,
    private val response: RoutingNumberListPageResponse,
) : PageAsync<RoutingNumberListResponse> {

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

    override fun items(): List<RoutingNumberListResponse> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor().isPresent

    fun nextPageParams(): RoutingNumberListParams {
        val nextCursor =
            nextCursor().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<RoutingNumberListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<RoutingNumberListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

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
         * .streamHandlerExecutor()
         * .params()
         * .response()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RoutingNumberListPageAsync]. */
    class Builder internal constructor() {

        private var service: RoutingNumberServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: RoutingNumberListParams? = null
        private var response: RoutingNumberListPageResponse? = null

        @JvmSynthetic
        internal fun from(routingNumberListPageAsync: RoutingNumberListPageAsync) = apply {
            service = routingNumberListPageAsync.service
            streamHandlerExecutor = routingNumberListPageAsync.streamHandlerExecutor
            params = routingNumberListPageAsync.params
            response = routingNumberListPageAsync.response
        }

        fun service(service: RoutingNumberServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

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
         * .streamHandlerExecutor()
         * .params()
         * .response()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): RoutingNumberListPageAsync =
            RoutingNumberListPageAsync(
                checkRequired("service", service),
                checkRequired("streamHandlerExecutor", streamHandlerExecutor),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is RoutingNumberListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, response) /* spotless:on */

    override fun toString() =
        "RoutingNumberListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
