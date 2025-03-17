// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.simulations.digitalwallettokenrequests

import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DigitalWalletTokenRequestCreateParamsTest {

    @Test
    fun create() {
        DigitalWalletTokenRequestCreateParams.builder().cardId("card_oubs0hwk5rn6knuecxg2").build()
    }

    @Test
    fun body() {
        val params =
            DigitalWalletTokenRequestCreateParams.builder()
                .cardId("card_oubs0hwk5rn6knuecxg2")
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.cardId()).isEqualTo("card_oubs0hwk5rn6knuecxg2")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            DigitalWalletTokenRequestCreateParams.builder()
                .cardId("card_oubs0hwk5rn6knuecxg2")
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.cardId()).isEqualTo("card_oubs0hwk5rn6knuecxg2")
    }
}
