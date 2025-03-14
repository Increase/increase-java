// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SimulationWireTransferReverseParamsTest {

    @Test
    fun create() {
        SimulationWireTransferReverseParams.builder()
            .wireTransferId("wire_transfer_5akynk7dqsq25qwk9q2u")
            .build()
    }

    @Test
    fun getPathParam() {
        val params =
            SimulationWireTransferReverseParams.builder()
                .wireTransferId("wire_transfer_5akynk7dqsq25qwk9q2u")
                .build()
        assertThat(params).isNotNull
        // path param "wireTransferId"
        assertThat(params.getPathParam(0)).isEqualTo("wire_transfer_5akynk7dqsq25qwk9q2u")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
