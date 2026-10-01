// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.realtimepaymentsrequestsforpayment

import com.increase.api.core.AutoPagerAsync
import com.increase.api.core.PageAsync
import com.increase.api.core.checkRequired
import com.increase.api.services.async.RealTimePaymentsRequestsForPaymentServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see RealTimePaymentsRequestsForPaymentServiceAsync.list */
class RealTimePaymentsRequestsForPaymentListPageAsync
private constructor(
    private val service: RealTimePaymentsRequestsForPaymentServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: RealTimePaymentsRequestsForPaymentListParams,
    private val response: RealTimePaymentsRequestsForPaymentListPageResponse,
) : PageAsync<RealTimePaymentsRequestForPayment> {

    /**
     * Delegates to [RealTimePaymentsRequestsForPaymentListPageResponse], but gracefully handles
     * missing data.
     *
     * @see RealTimePaymentsRequestsForPaymentListPageResponse.data
     */
    fun data(): List<RealTimePaymentsRequestForPayment> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [RealTimePaymentsRequestsForPaymentListPageResponse], but gracefully handles
     * missing data.
     *
     * @see RealTimePaymentsRequestsForPaymentListPageResponse.nextCursor
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun items(): List<RealTimePaymentsRequestForPayment> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor().isPresent

    fun nextPageParams(): RealTimePaymentsRequestsForPaymentListParams {
        val nextCursor =
            nextCursor().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<RealTimePaymentsRequestsForPaymentListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<RealTimePaymentsRequestForPayment> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): RealTimePaymentsRequestsForPaymentListParams = params

    /** The response that this page was parsed from. */
    fun response(): RealTimePaymentsRequestsForPaymentListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [RealTimePaymentsRequestsForPaymentListPageAsync].
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

    /** A builder for [RealTimePaymentsRequestsForPaymentListPageAsync]. */
    class Builder internal constructor() {

        private var service: RealTimePaymentsRequestsForPaymentServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: RealTimePaymentsRequestsForPaymentListParams? = null
        private var response: RealTimePaymentsRequestsForPaymentListPageResponse? = null

        @JvmSynthetic
        internal fun from(
            realTimePaymentsRequestsForPaymentListPageAsync:
                RealTimePaymentsRequestsForPaymentListPageAsync
        ) = apply {
            service = realTimePaymentsRequestsForPaymentListPageAsync.service
            streamHandlerExecutor =
                realTimePaymentsRequestsForPaymentListPageAsync.streamHandlerExecutor
            params = realTimePaymentsRequestsForPaymentListPageAsync.params
            response = realTimePaymentsRequestsForPaymentListPageAsync.response
        }

        fun service(service: RealTimePaymentsRequestsForPaymentServiceAsync) = apply {
            this.service = service
        }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: RealTimePaymentsRequestsForPaymentListParams) = apply {
            this.params = params
        }

        /** The response that this page was parsed from. */
        fun response(response: RealTimePaymentsRequestsForPaymentListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [RealTimePaymentsRequestsForPaymentListPageAsync].
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
        fun build(): RealTimePaymentsRequestsForPaymentListPageAsync =
            RealTimePaymentsRequestsForPaymentListPageAsync(
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

        return other is RealTimePaymentsRequestsForPaymentListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "RealTimePaymentsRequestsForPaymentListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
