// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.increase.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SimulationAchTransferSubmitParamsTest {

    @Test
    fun createSimulationAchTransferSubmitParams() {
        SimulationAchTransferSubmitParams.builder().achTransferId("string").build()
    }

    @Test
    fun getPathParam() {
        val params = SimulationAchTransferSubmitParams.builder().achTransferId("string").build()
        assertThat(params).isNotNull
        // path param "achTransferId"
        assertThat(params.getPathParam(0)).isEqualTo("string")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
