// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.increase.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SimulationInboundFundsHoldReleaseParamsTest {

    @Test
    fun createSimulationInboundFundsHoldReleaseParams() {
        SimulationInboundFundsHoldReleaseParams.builder()
            .inboundFundsHoldId("inbound_funds_hold_id")
            .build()
    }

    @Test
    fun getPathParam() {
        val params =
            SimulationInboundFundsHoldReleaseParams.builder()
                .inboundFundsHoldId("inbound_funds_hold_id")
                .build()
        assertThat(params).isNotNull
        // path param "inboundFundsHoldId"
        assertThat(params.getPathParam(0)).isEqualTo("inbound_funds_hold_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
