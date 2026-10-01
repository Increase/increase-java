// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.realtimepaymentsrequestsforpayment

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RealTimePaymentsRequestsForPaymentCancelParamsTest {

    @Test
    fun create() {
        RealTimePaymentsRequestsForPaymentCancelParams.builder()
            .realTimePaymentsRequestForPaymentId(
                "real_time_payments_request_for_payment_28kcliz1oevcnqyn9qp7"
            )
            .additionalInformation("x")
            .reason(RealTimePaymentsRequestsForPaymentCancelParams.Reason.REQUESTED_BY_CUSTOMER)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            RealTimePaymentsRequestsForPaymentCancelParams.builder()
                .realTimePaymentsRequestForPaymentId(
                    "real_time_payments_request_for_payment_28kcliz1oevcnqyn9qp7"
                )
                .build()

        assertThat(params._pathParam(0))
            .isEqualTo("real_time_payments_request_for_payment_28kcliz1oevcnqyn9qp7")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            RealTimePaymentsRequestsForPaymentCancelParams.builder()
                .realTimePaymentsRequestForPaymentId(
                    "real_time_payments_request_for_payment_28kcliz1oevcnqyn9qp7"
                )
                .additionalInformation("x")
                .reason(RealTimePaymentsRequestsForPaymentCancelParams.Reason.REQUESTED_BY_CUSTOMER)
                .build()

        val body = params._body()

        assertThat(body.additionalInformation()).contains("x")
        assertThat(body.reason())
            .contains(RealTimePaymentsRequestsForPaymentCancelParams.Reason.REQUESTED_BY_CUSTOMER)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            RealTimePaymentsRequestsForPaymentCancelParams.builder()
                .realTimePaymentsRequestForPaymentId(
                    "real_time_payments_request_for_payment_28kcliz1oevcnqyn9qp7"
                )
                .build()

        val body = params._body()
    }
}
