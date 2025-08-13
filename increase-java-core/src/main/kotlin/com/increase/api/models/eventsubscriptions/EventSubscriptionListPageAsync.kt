// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.eventsubscriptions

import com.increase.api.core.AutoPagerAsync
import com.increase.api.core.PageAsync
import com.increase.api.core.checkRequired
import com.increase.api.services.async.EventSubscriptionServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see EventSubscriptionServiceAsync.list */
class EventSubscriptionListPageAsync
private constructor(
    private val service: EventSubscriptionServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: EventSubscriptionListParams,
    private val response: EventSubscriptionListPageResponse,
) : PageAsync<EventSubscription> {

    /**
     * Delegates to [EventSubscriptionListPageResponse], but gracefully handles missing data.
     *
     * @see EventSubscriptionListPageResponse.data
     */
    fun data(): List<EventSubscription> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [EventSubscriptionListPageResponse], but gracefully handles missing data.
     *
     * @see EventSubscriptionListPageResponse.nextCursor
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun items(): List<EventSubscription> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor().isPresent

    fun nextPageParams(): EventSubscriptionListParams {
        val nextCursor =
            nextCursor().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<EventSubscriptionListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<EventSubscription> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): EventSubscriptionListParams = params

    /** The response that this page was parsed from. */
    fun response(): EventSubscriptionListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [EventSubscriptionListPageAsync].
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

    /** A builder for [EventSubscriptionListPageAsync]. */
    class Builder internal constructor() {

        private var service: EventSubscriptionServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: EventSubscriptionListParams? = null
        private var response: EventSubscriptionListPageResponse? = null

        @JvmSynthetic
        internal fun from(eventSubscriptionListPageAsync: EventSubscriptionListPageAsync) = apply {
            service = eventSubscriptionListPageAsync.service
            streamHandlerExecutor = eventSubscriptionListPageAsync.streamHandlerExecutor
            params = eventSubscriptionListPageAsync.params
            response = eventSubscriptionListPageAsync.response
        }

        fun service(service: EventSubscriptionServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: EventSubscriptionListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: EventSubscriptionListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [EventSubscriptionListPageAsync].
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
        fun build(): EventSubscriptionListPageAsync =
            EventSubscriptionListPageAsync(
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

        return other is EventSubscriptionListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "EventSubscriptionListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
