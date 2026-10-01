// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.inboundrealtimepaymentsrequestsforpayment

import com.increase.api.core.AutoPager
import com.increase.api.core.Page
import com.increase.api.core.checkRequired
import com.increase.api.services.blocking.InboundRealTimePaymentsRequestsForPaymentService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see InboundRealTimePaymentsRequestsForPaymentService.list */
class InboundRealTimePaymentsRequestsForPaymentListPage
private constructor(
    private val service: InboundRealTimePaymentsRequestsForPaymentService,
    private val params: InboundRealTimePaymentsRequestsForPaymentListParams,
    private val response: InboundRealTimePaymentsRequestsForPaymentListPageResponse,
) : Page<InboundRealTimePaymentsRequestForPayment> {

    /**
     * Delegates to [InboundRealTimePaymentsRequestsForPaymentListPageResponse], but gracefully
     * handles missing data.
     *
     * @see InboundRealTimePaymentsRequestsForPaymentListPageResponse.data
     */
    fun data(): List<InboundRealTimePaymentsRequestForPayment> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [InboundRealTimePaymentsRequestsForPaymentListPageResponse], but gracefully
     * handles missing data.
     *
     * @see InboundRealTimePaymentsRequestsForPaymentListPageResponse.nextCursor
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun items(): List<InboundRealTimePaymentsRequestForPayment> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor().isPresent

    fun nextPageParams(): InboundRealTimePaymentsRequestsForPaymentListParams {
        val nextCursor =
            nextCursor().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): InboundRealTimePaymentsRequestsForPaymentListPage =
        service.list(nextPageParams())

    fun autoPager(): AutoPager<InboundRealTimePaymentsRequestForPayment> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): InboundRealTimePaymentsRequestsForPaymentListParams = params

    /** The response that this page was parsed from. */
    fun response(): InboundRealTimePaymentsRequestsForPaymentListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [InboundRealTimePaymentsRequestsForPaymentListPage].
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

    /** A builder for [InboundRealTimePaymentsRequestsForPaymentListPage]. */
    class Builder internal constructor() {

        private var service: InboundRealTimePaymentsRequestsForPaymentService? = null
        private var params: InboundRealTimePaymentsRequestsForPaymentListParams? = null
        private var response: InboundRealTimePaymentsRequestsForPaymentListPageResponse? = null

        @JvmSynthetic
        internal fun from(
            inboundRealTimePaymentsRequestsForPaymentListPage:
                InboundRealTimePaymentsRequestsForPaymentListPage
        ) = apply {
            service = inboundRealTimePaymentsRequestsForPaymentListPage.service
            params = inboundRealTimePaymentsRequestsForPaymentListPage.params
            response = inboundRealTimePaymentsRequestsForPaymentListPage.response
        }

        fun service(service: InboundRealTimePaymentsRequestsForPaymentService) = apply {
            this.service = service
        }

        /** The parameters that were used to request this page. */
        fun params(params: InboundRealTimePaymentsRequestsForPaymentListParams) = apply {
            this.params = params
        }

        /** The response that this page was parsed from. */
        fun response(response: InboundRealTimePaymentsRequestsForPaymentListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [InboundRealTimePaymentsRequestsForPaymentListPage].
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
        fun build(): InboundRealTimePaymentsRequestsForPaymentListPage =
            InboundRealTimePaymentsRequestsForPaymentListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InboundRealTimePaymentsRequestsForPaymentListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "InboundRealTimePaymentsRequestsForPaymentListPage{service=$service, params=$params, response=$response}"
}
