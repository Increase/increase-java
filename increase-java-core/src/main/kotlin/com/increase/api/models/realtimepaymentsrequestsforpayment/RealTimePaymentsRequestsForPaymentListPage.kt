// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.realtimepaymentsrequestsforpayment

import com.increase.api.core.AutoPager
import com.increase.api.core.Page
import com.increase.api.core.checkRequired
import com.increase.api.services.blocking.RealTimePaymentsRequestsForPaymentService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see RealTimePaymentsRequestsForPaymentService.list */
class RealTimePaymentsRequestsForPaymentListPage
private constructor(
    private val service: RealTimePaymentsRequestsForPaymentService,
    private val params: RealTimePaymentsRequestsForPaymentListParams,
    private val response: RealTimePaymentsRequestsForPaymentListPageResponse,
) : Page<RealTimePaymentsRequestForPayment> {

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

    override fun nextPage(): RealTimePaymentsRequestsForPaymentListPage =
        service.list(nextPageParams())

    fun autoPager(): AutoPager<RealTimePaymentsRequestForPayment> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): RealTimePaymentsRequestsForPaymentListParams = params

    /** The response that this page was parsed from. */
    fun response(): RealTimePaymentsRequestsForPaymentListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [RealTimePaymentsRequestsForPaymentListPage].
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

    /** A builder for [RealTimePaymentsRequestsForPaymentListPage]. */
    class Builder internal constructor() {

        private var service: RealTimePaymentsRequestsForPaymentService? = null
        private var params: RealTimePaymentsRequestsForPaymentListParams? = null
        private var response: RealTimePaymentsRequestsForPaymentListPageResponse? = null

        @JvmSynthetic
        internal fun from(
            realTimePaymentsRequestsForPaymentListPage: RealTimePaymentsRequestsForPaymentListPage
        ) = apply {
            service = realTimePaymentsRequestsForPaymentListPage.service
            params = realTimePaymentsRequestsForPaymentListPage.params
            response = realTimePaymentsRequestsForPaymentListPage.response
        }

        fun service(service: RealTimePaymentsRequestsForPaymentService) = apply {
            this.service = service
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
         * Returns an immutable instance of [RealTimePaymentsRequestsForPaymentListPage].
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
        fun build(): RealTimePaymentsRequestsForPaymentListPage =
            RealTimePaymentsRequestsForPaymentListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RealTimePaymentsRequestsForPaymentListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "RealTimePaymentsRequestsForPaymentListPage{service=$service, params=$params, response=$response}"
}
