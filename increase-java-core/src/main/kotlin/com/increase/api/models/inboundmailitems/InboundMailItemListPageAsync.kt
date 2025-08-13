// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.inboundmailitems

import com.increase.api.core.AutoPagerAsync
import com.increase.api.core.PageAsync
import com.increase.api.core.checkRequired
import com.increase.api.services.async.InboundMailItemServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see InboundMailItemServiceAsync.list */
class InboundMailItemListPageAsync
private constructor(
    private val service: InboundMailItemServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: InboundMailItemListParams,
    private val response: InboundMailItemListPageResponse,
) : PageAsync<InboundMailItem> {

    /**
     * Delegates to [InboundMailItemListPageResponse], but gracefully handles missing data.
     *
     * @see InboundMailItemListPageResponse.data
     */
    fun data(): List<InboundMailItem> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [InboundMailItemListPageResponse], but gracefully handles missing data.
     *
     * @see InboundMailItemListPageResponse.nextCursor
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun items(): List<InboundMailItem> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor().isPresent

    fun nextPageParams(): InboundMailItemListParams {
        val nextCursor =
            nextCursor().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<InboundMailItemListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<InboundMailItem> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): InboundMailItemListParams = params

    /** The response that this page was parsed from. */
    fun response(): InboundMailItemListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [InboundMailItemListPageAsync].
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

    /** A builder for [InboundMailItemListPageAsync]. */
    class Builder internal constructor() {

        private var service: InboundMailItemServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: InboundMailItemListParams? = null
        private var response: InboundMailItemListPageResponse? = null

        @JvmSynthetic
        internal fun from(inboundMailItemListPageAsync: InboundMailItemListPageAsync) = apply {
            service = inboundMailItemListPageAsync.service
            streamHandlerExecutor = inboundMailItemListPageAsync.streamHandlerExecutor
            params = inboundMailItemListPageAsync.params
            response = inboundMailItemListPageAsync.response
        }

        fun service(service: InboundMailItemServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: InboundMailItemListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: InboundMailItemListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [InboundMailItemListPageAsync].
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
        fun build(): InboundMailItemListPageAsync =
            InboundMailItemListPageAsync(
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

        return other is InboundMailItemListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "InboundMailItemListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
