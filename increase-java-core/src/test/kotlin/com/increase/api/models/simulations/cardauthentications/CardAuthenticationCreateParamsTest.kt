// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.simulations.cardauthentications

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CardAuthenticationCreateParamsTest {

    @Test
    fun create() {
        CardAuthenticationCreateParams.builder()
            .cardId("card_oubs0hwk5rn6knuecxg2")
            .category(CardAuthenticationCreateParams.Category.PAYMENT_AUTHENTICATION)
            .deviceChannel(CardAuthenticationCreateParams.DeviceChannel.APP)
            .merchantAcceptorId("5665270011000168")
            .merchantCategoryCode("5734")
            .merchantCountry("US")
            .merchantName("x")
            .purchaseAmount(1000L)
            .build()
    }

    @Test
    fun body() {
        val params =
            CardAuthenticationCreateParams.builder()
                .cardId("card_oubs0hwk5rn6knuecxg2")
                .category(CardAuthenticationCreateParams.Category.PAYMENT_AUTHENTICATION)
                .deviceChannel(CardAuthenticationCreateParams.DeviceChannel.APP)
                .merchantAcceptorId("5665270011000168")
                .merchantCategoryCode("5734")
                .merchantCountry("US")
                .merchantName("x")
                .purchaseAmount(1000L)
                .build()

        val body = params._body()

        assertThat(body.cardId()).isEqualTo("card_oubs0hwk5rn6knuecxg2")
        assertThat(body.category())
            .contains(CardAuthenticationCreateParams.Category.PAYMENT_AUTHENTICATION)
        assertThat(body.deviceChannel()).contains(CardAuthenticationCreateParams.DeviceChannel.APP)
        assertThat(body.merchantAcceptorId()).contains("5665270011000168")
        assertThat(body.merchantCategoryCode()).contains("5734")
        assertThat(body.merchantCountry()).contains("US")
        assertThat(body.merchantName()).contains("x")
        assertThat(body.purchaseAmount()).contains(1000L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            CardAuthenticationCreateParams.builder().cardId("card_oubs0hwk5rn6knuecxg2").build()

        val body = params._body()

        assertThat(body.cardId()).isEqualTo("card_oubs0hwk5rn6knuecxg2")
    }
}
