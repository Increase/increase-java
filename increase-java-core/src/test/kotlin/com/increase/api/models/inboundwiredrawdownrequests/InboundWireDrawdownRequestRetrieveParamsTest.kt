// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.inboundwiredrawdownrequests

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InboundWireDrawdownRequestRetrieveParamsTest {

    @Test
    fun create() {
        InboundWireDrawdownRequestRetrieveParams.builder()
            .inboundWireDrawdownRequestId("inbound_wire_drawdown_request_u5a92ikqhz1ytphn799e")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            InboundWireDrawdownRequestRetrieveParams.builder()
                .inboundWireDrawdownRequestId("inbound_wire_drawdown_request_u5a92ikqhz1ytphn799e")
                .build()

        assertThat(params._pathParam(0))
            .isEqualTo("inbound_wire_drawdown_request_u5a92ikqhz1ytphn799e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
