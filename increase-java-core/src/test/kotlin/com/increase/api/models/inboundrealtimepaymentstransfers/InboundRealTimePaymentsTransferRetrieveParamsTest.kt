// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.inboundrealtimepaymentstransfers

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InboundRealTimePaymentsTransferRetrieveParamsTest {

    @Test
    fun create() {
        InboundRealTimePaymentsTransferRetrieveParams.builder()
            .inboundRealTimePaymentsTransferId(
                "inbound_real_time_payments_transfer_63hlz498vcxg644hcrzr"
            )
            .build()
    }

    @Test
    fun getPathParam() {
        val params =
            InboundRealTimePaymentsTransferRetrieveParams.builder()
                .inboundRealTimePaymentsTransferId(
                    "inbound_real_time_payments_transfer_63hlz498vcxg644hcrzr"
                )
                .build()
        assertThat(params).isNotNull
        // path param "inboundRealTimePaymentsTransferId"
        assertThat(params.getPathParam(0))
            .isEqualTo("inbound_real_time_payments_transfer_63hlz498vcxg644hcrzr")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
