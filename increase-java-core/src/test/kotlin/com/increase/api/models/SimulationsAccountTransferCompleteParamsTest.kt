package com.increase.api.models

import com.increase.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SimulationsAccountTransferCompleteParamsTest {

    @Test
    fun createSimulationsAccountTransferCompleteParams() {
        SimulationsAccountTransferCompleteParams.builder().accountTransferId("string").build()
    }

    @Test
    fun getPathParam() {
        val params =
            SimulationsAccountTransferCompleteParams.builder().accountTransferId("string").build()
        assertThat(params).isNotNull
        // path param "accountTransferId"
        assertThat(params.getPathParam(0)).isEqualTo("string")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
