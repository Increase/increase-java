// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.increase.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SimulationAchTransferSettleParamsTest {

    @Test
    fun createSimulationAchTransferSettleParams() {
        SimulationAchTransferSettleParams.builder().achTransferId("ach_transfer_id").build()
    }

    @Test
    fun getPathParam() {
        val params =
            SimulationAchTransferSettleParams.builder().achTransferId("ach_transfer_id").build()
        assertThat(params).isNotNull
        // path param "achTransferId"
        assertThat(params.getPathParam(0)).isEqualTo("ach_transfer_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}