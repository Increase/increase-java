// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.increase.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class RealTimePaymentsRequestForPaymentRetrieveParamsTest {

    @Test
    fun createRealTimePaymentsRequestForPaymentRetrieveParams() {
        RealTimePaymentsRequestForPaymentRetrieveParams.builder()
            .requestForPaymentId("request_for_payment_id")
            .build()
    }

    @Test
    fun getPathParam() {
        val params =
            RealTimePaymentsRequestForPaymentRetrieveParams.builder()
                .requestForPaymentId("request_for_payment_id")
                .build()
        assertThat(params).isNotNull
        // path param "requestForPaymentId"
        assertThat(params.getPathParam(0)).isEqualTo("request_for_payment_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
