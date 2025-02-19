// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SimulationDigitalWalletTokenRequestCreateParamsTest {

    @Test
    fun create() {
        SimulationDigitalWalletTokenRequestCreateParams.builder()
            .cardId("card_oubs0hwk5rn6knuecxg2")
            .build()
    }

    @Test
    fun body() {
        val params =
            SimulationDigitalWalletTokenRequestCreateParams.builder()
                .cardId("card_oubs0hwk5rn6knuecxg2")
                .build()

        val body = params._body()

        assertThat(body).isNotNull
        assertThat(body.cardId()).isEqualTo("card_oubs0hwk5rn6knuecxg2")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            SimulationDigitalWalletTokenRequestCreateParams.builder()
                .cardId("card_oubs0hwk5rn6knuecxg2")
                .build()

        val body = params._body()

        assertThat(body).isNotNull
        assertThat(body.cardId()).isEqualTo("card_oubs0hwk5rn6knuecxg2")
    }
}
