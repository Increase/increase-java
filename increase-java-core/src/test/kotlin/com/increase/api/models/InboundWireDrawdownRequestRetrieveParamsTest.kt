// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class InboundWireDrawdownRequestRetrieveParamsTest {

    @Test
    fun create() {
        InboundWireDrawdownRequestRetrieveParams.builder()
            .inboundWireDrawdownRequestId("inbound_wire_drawdown_request_u5a92ikqhz1ytphn799e")
            .build()
    }

    @Test
    fun getPathParam() {
        val params =
            InboundWireDrawdownRequestRetrieveParams.builder()
                .inboundWireDrawdownRequestId("inbound_wire_drawdown_request_u5a92ikqhz1ytphn799e")
                .build()
        assertThat(params).isNotNull
        // path param "inboundWireDrawdownRequestId"
        assertThat(params.getPathParam(0))
            .isEqualTo("inbound_wire_drawdown_request_u5a92ikqhz1ytphn799e")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
