package com.increase.api.models

import com.increase.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SimulationDigitalWalletTokenRequestCreateParamsTest {

    @Test
    fun createSimulationDigitalWalletTokenRequestCreateParams() {
        SimulationDigitalWalletTokenRequestCreateParams.builder().cardId("string").build()
    }

    @Test
    fun getBody() {
        val params =
            SimulationDigitalWalletTokenRequestCreateParams.builder().cardId("string").build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.cardId()).isEqualTo("string")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            SimulationDigitalWalletTokenRequestCreateParams.builder().cardId("string").build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.cardId()).isEqualTo("string")
    }
}
