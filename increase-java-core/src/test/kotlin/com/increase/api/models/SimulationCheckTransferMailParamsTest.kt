// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SimulationCheckTransferMailParamsTest {

    @Test
    fun createSimulationCheckTransferMailParams() {
        SimulationCheckTransferMailParams.builder().checkTransferId("check_transfer_id").build()
    }

    @Test
    fun getPathParam() {
        val params =
            SimulationCheckTransferMailParams.builder().checkTransferId("check_transfer_id").build()
        assertThat(params).isNotNull
        // path param "checkTransferId"
        assertThat(params.getPathParam(0)).isEqualTo("check_transfer_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
