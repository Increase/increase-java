// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SimulationProgramCreateParamsTest {

    @Test
    fun create() {
        SimulationProgramCreateParams.builder().name("For Benefit Of").build()
    }

    @Test
    fun body() {
        val params = SimulationProgramCreateParams.builder().name("For Benefit Of").build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.name()).isEqualTo("For Benefit Of")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = SimulationProgramCreateParams.builder().name("For Benefit Of").build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.name()).isEqualTo("For Benefit Of")
    }
}
