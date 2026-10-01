// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.inboundrealtimepaymentsrequestsforpayment

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InboundRealTimePaymentsRequestsForPaymentRetrieveParamsTest {

    @Test
    fun create() {
        InboundRealTimePaymentsRequestsForPaymentRetrieveParams.builder()
            .inboundRealTimePaymentsRequestForPaymentId(
                "inbound_real_time_payments_request_for_payment_j9c5rm4hr6qf34en8tky"
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            InboundRealTimePaymentsRequestsForPaymentRetrieveParams.builder()
                .inboundRealTimePaymentsRequestForPaymentId(
                    "inbound_real_time_payments_request_for_payment_j9c5rm4hr6qf34en8tky"
                )
                .build()

        assertThat(params._pathParam(0))
            .isEqualTo("inbound_real_time_payments_request_for_payment_j9c5rm4hr6qf34en8tky")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
