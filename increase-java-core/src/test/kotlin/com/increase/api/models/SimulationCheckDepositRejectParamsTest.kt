// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.increase.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SimulationCheckDepositRejectParamsTest {

    @Test
    fun createSimulationCheckDepositRejectParams() {
        SimulationCheckDepositRejectParams.builder().checkDepositId("string").build()
    }

    @Test
    fun getPathParam() {
        val params = SimulationCheckDepositRejectParams.builder().checkDepositId("string").build()
        assertThat(params).isNotNull
        // path param "checkDepositId"
        assertThat(params.getPathParam(0)).isEqualTo("string")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
