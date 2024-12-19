// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class RealTimePaymentsRequestForPaymentRetrieveParamsTest {

    @Test
    fun createRealTimePaymentsRequestForPaymentRetrieveParams() {
        RealTimePaymentsRequestForPaymentRetrieveParams.builder()
            .requestForPaymentId("real_time_payments_transfer_iyuhl5kdn7ssmup83mvq")
            .build()
    }

    @Test
    fun getPathParam() {
        val params =
            RealTimePaymentsRequestForPaymentRetrieveParams.builder()
                .requestForPaymentId("real_time_payments_transfer_iyuhl5kdn7ssmup83mvq")
                .build()
        assertThat(params).isNotNull
        // path param "requestForPaymentId"
        assertThat(params.getPathParam(0))
            .isEqualTo("real_time_payments_transfer_iyuhl5kdn7ssmup83mvq")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
