package com.increase.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CardDetailsTest {

    @Test
    fun createCardDetails() {
        val cardDetails =
            CardDetails.builder()
                .cardId("string")
                .primaryAccountNumber("string")
                .expirationMonth(123L)
                .expirationYear(123L)
                .verificationCode("string")
                .type(CardDetails.Type.CARD_DETAILS)
                .build()
        assertThat(cardDetails).isNotNull
        assertThat(cardDetails.cardId()).isEqualTo("string")
        assertThat(cardDetails.primaryAccountNumber()).isEqualTo("string")
        assertThat(cardDetails.expirationMonth()).isEqualTo(123L)
        assertThat(cardDetails.expirationYear()).isEqualTo(123L)
        assertThat(cardDetails.verificationCode()).isEqualTo("string")
        assertThat(cardDetails.type()).isEqualTo(CardDetails.Type.CARD_DETAILS)
    }
}
