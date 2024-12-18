// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class InboundRealTimePaymentsTransferRetrieveParamsTest {

    @Test
    fun createInboundRealTimePaymentsTransferRetrieveParams() {
        InboundRealTimePaymentsTransferRetrieveParams.builder()
            .inboundRealTimePaymentsTransferId("inbound_real_time_payments_transfer_id")
            .build()
    }

    @Test
    fun getPathParam() {
        val params =
            InboundRealTimePaymentsTransferRetrieveParams.builder()
                .inboundRealTimePaymentsTransferId("inbound_real_time_payments_transfer_id")
                .build()
        assertThat(params).isNotNull
        // path param "inboundRealTimePaymentsTransferId"
        assertThat(params.getPathParam(0)).isEqualTo("inbound_real_time_payments_transfer_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
