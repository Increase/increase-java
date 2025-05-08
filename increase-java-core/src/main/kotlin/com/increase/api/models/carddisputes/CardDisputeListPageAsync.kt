// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.carddisputes

import com.increase.api.core.AutoPagerAsync
import com.increase.api.core.PageAsync
import com.increase.api.core.checkRequired
import com.increase.api.services.async.CardDisputeServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see [CardDisputeServiceAsync.list] */
class CardDisputeListPageAsync
private constructor(
    private val service: CardDisputeServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: CardDisputeListParams,
    private val response: CardDisputeListPageResponse,
) : PageAsync<CardDispute> {

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

    override fun items(): List<CardDispute> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor().isPresent

    fun nextPageParams(): CardDisputeListParams {
        val nextCursor =
            nextCursor().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<CardDisputeListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<CardDispute> = AutoPagerAsync.from(this, streamHandlerExecutor)

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
         * .streamHandlerExecutor()
         * .params()
         * .response()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CardDisputeListPageAsync]. */
    class Builder internal constructor() {

        private var service: CardDisputeServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: CardDisputeListParams? = null
        private var response: CardDisputeListPageResponse? = null

        @JvmSynthetic
        internal fun from(cardDisputeListPageAsync: CardDisputeListPageAsync) = apply {
            service = cardDisputeListPageAsync.service
            streamHandlerExecutor = cardDisputeListPageAsync.streamHandlerExecutor
            params = cardDisputeListPageAsync.params
            response = cardDisputeListPageAsync.response
        }

        fun service(service: CardDisputeServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

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
         * .streamHandlerExecutor()
         * .params()
         * .response()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CardDisputeListPageAsync =
            CardDisputeListPageAsync(
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

        return /* spotless:off */ other is CardDisputeListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, response) /* spotless:on */

    override fun toString() =
        "CardDisputeListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
