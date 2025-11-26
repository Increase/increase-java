// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.inboundcheckdeposits

import com.increase.api.core.AutoPagerAsync
import com.increase.api.core.PageAsync
import com.increase.api.core.checkRequired
import com.increase.api.services.async.InboundCheckDepositServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see InboundCheckDepositServiceAsync.list */
class InboundCheckDepositListPageAsync
private constructor(
    private val service: InboundCheckDepositServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: InboundCheckDepositListParams,
    private val response: InboundCheckDepositListPageResponse,
) : PageAsync<InboundCheckDeposit> {

    /**
     * Delegates to [InboundCheckDepositListPageResponse], but gracefully handles missing data.
     *
     * @see InboundCheckDepositListPageResponse.data
     */
    fun data(): List<InboundCheckDeposit> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [InboundCheckDepositListPageResponse], but gracefully handles missing data.
     *
     * @see InboundCheckDepositListPageResponse.nextCursor
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun items(): List<InboundCheckDeposit> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor().isPresent

    fun nextPageParams(): InboundCheckDepositListParams {
        val nextCursor =
            nextCursor().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<InboundCheckDepositListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<InboundCheckDeposit> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): InboundCheckDepositListParams = params

    /** The response that this page was parsed from. */
    fun response(): InboundCheckDepositListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [InboundCheckDepositListPageAsync].
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

    /** A builder for [InboundCheckDepositListPageAsync]. */
    class Builder internal constructor() {

        private var service: InboundCheckDepositServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: InboundCheckDepositListParams? = null
        private var response: InboundCheckDepositListPageResponse? = null

        @JvmSynthetic
        internal fun from(inboundCheckDepositListPageAsync: InboundCheckDepositListPageAsync) =
            apply {
                service = inboundCheckDepositListPageAsync.service
                streamHandlerExecutor = inboundCheckDepositListPageAsync.streamHandlerExecutor
                params = inboundCheckDepositListPageAsync.params
                response = inboundCheckDepositListPageAsync.response
            }

        fun service(service: InboundCheckDepositServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: InboundCheckDepositListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: InboundCheckDepositListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [InboundCheckDepositListPageAsync].
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
        fun build(): InboundCheckDepositListPageAsync =
            InboundCheckDepositListPageAsync(
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

        return other is InboundCheckDepositListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "InboundCheckDepositListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
