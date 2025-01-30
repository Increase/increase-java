// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SimulationProgramCreateParamsTest {

    @Test
    fun createSimulationProgramCreateParams() {
        SimulationProgramCreateParams.builder().name("For Benefit Of").build()
    }

    @Test
    fun body() {
        val params = SimulationProgramCreateParams.builder().name("For Benefit Of").build()
        val body = params._body()
        assertThat(body).isNotNull
        assertThat(body.name()).isEqualTo("For Benefit Of")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = SimulationProgramCreateParams.builder().name("For Benefit Of").build()
        val body = params._body()
        assertThat(body).isNotNull
        assertThat(body.name()).isEqualTo("For Benefit Of")
    }
}
