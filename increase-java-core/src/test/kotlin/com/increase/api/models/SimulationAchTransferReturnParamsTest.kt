package com.increase.api.models

import com.increase.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SimulationAchTransferReturnParamsTest {

    @Test
    fun createSimulationAchTransferReturnParams() {
        SimulationAchTransferReturnParams.builder()
            .achTransferId("string")
            .reason(SimulationAchTransferReturnParams.Reason.INSUFFICIENT_FUND)
            .build()
    }

    @Test
    fun getBody() {
        val params =
            SimulationAchTransferReturnParams.builder()
                .achTransferId("string")
                .reason(SimulationAchTransferReturnParams.Reason.INSUFFICIENT_FUND)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.reason())
            .isEqualTo(SimulationAchTransferReturnParams.Reason.INSUFFICIENT_FUND)
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = SimulationAchTransferReturnParams.builder().achTransferId("string").build()
        val body = params.getBody()
        assertThat(body).isNotNull
    }

    @Test
    fun getPathParam() {
        val params = SimulationAchTransferReturnParams.builder().achTransferId("string").build()
        assertThat(params).isNotNull
        // path param "achTransferId"
        assertThat(params.getPathParam(0)).isEqualTo("string")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
