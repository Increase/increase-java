// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class InboundWireDrawdownRequestRetrieveParamsTest {

    @Test
    fun createInboundWireDrawdownRequestRetrieveParams() {
        InboundWireDrawdownRequestRetrieveParams.builder()
            .inboundWireDrawdownRequestId("inbound_wire_drawdown_request_id")
            .build()
    }

    @Test
    fun getPathParam() {
        val params =
            InboundWireDrawdownRequestRetrieveParams.builder()
                .inboundWireDrawdownRequestId("inbound_wire_drawdown_request_id")
                .build()
        assertThat(params).isNotNull
        // path param "inboundWireDrawdownRequestId"
        assertThat(params.getPathParam(0)).isEqualTo("inbound_wire_drawdown_request_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
