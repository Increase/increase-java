// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.realtimepaymentsrequestsforpayment

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RealTimePaymentsRequestsForPaymentRetrieveParamsTest {

    @Test
    fun create() {
        RealTimePaymentsRequestsForPaymentRetrieveParams.builder()
            .realTimePaymentsRequestForPaymentId(
                "real_time_payments_request_for_payment_28kcliz1oevcnqyn9qp7"
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            RealTimePaymentsRequestsForPaymentRetrieveParams.builder()
                .realTimePaymentsRequestForPaymentId(
                    "real_time_payments_request_for_payment_28kcliz1oevcnqyn9qp7"
                )
                .build()

        assertThat(params._pathParam(0))
            .isEqualTo("real_time_payments_request_for_payment_28kcliz1oevcnqyn9qp7")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
