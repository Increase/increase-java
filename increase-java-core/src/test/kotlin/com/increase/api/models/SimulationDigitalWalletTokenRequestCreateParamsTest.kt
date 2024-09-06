// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.increase.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SimulationDigitalWalletTokenRequestCreateParamsTest {

    @Test
    fun createSimulationDigitalWalletTokenRequestCreateParams() {
        SimulationDigitalWalletTokenRequestCreateParams.builder().cardId("card_id").build()
    }

    @Test
    fun getBody() {
        val params =
            SimulationDigitalWalletTokenRequestCreateParams.builder().cardId("card_id").build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.cardId()).isEqualTo("card_id")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            SimulationDigitalWalletTokenRequestCreateParams.builder().cardId("card_id").build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.cardId()).isEqualTo("card_id")
    }
}
