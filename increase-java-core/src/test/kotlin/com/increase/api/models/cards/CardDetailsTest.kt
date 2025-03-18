// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.cards

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CardDetailsTest {

    @Test
    fun create() {
        val cardDetails =
            CardDetails.builder()
                .cardId("card_oubs0hwk5rn6knuecxg2")
                .expirationMonth(7L)
                .expirationYear(2025L)
                .primaryAccountNumber("4242424242424242")
                .type(CardDetails.Type.CARD_DETAILS)
                .verificationCode("123")
                .build()

        assertThat(cardDetails.cardId()).isEqualTo("card_oubs0hwk5rn6knuecxg2")
        assertThat(cardDetails.expirationMonth()).isEqualTo(7L)
        assertThat(cardDetails.expirationYear()).isEqualTo(2025L)
        assertThat(cardDetails.primaryAccountNumber()).isEqualTo("4242424242424242")
        assertThat(cardDetails.type()).isEqualTo(CardDetails.Type.CARD_DETAILS)
        assertThat(cardDetails.verificationCode()).isEqualTo("123")
    }
}
