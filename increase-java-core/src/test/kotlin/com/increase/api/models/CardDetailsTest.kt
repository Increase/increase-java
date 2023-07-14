package com.increase.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CardDetailsTest {

    @Test
    fun createCardDetails() {
        val cardDetails =
            CardDetails.builder()
                .cardId("string")
                .expirationMonth(123L)
                .expirationYear(123L)
                .primaryAccountNumber("string")
                .type(CardDetails.Type.CARD_DETAILS)
                .verificationCode("string")
                .build()
        assertThat(cardDetails).isNotNull
        assertThat(cardDetails.cardId()).isEqualTo("string")
        assertThat(cardDetails.expirationMonth()).isEqualTo(123L)
        assertThat(cardDetails.expirationYear()).isEqualTo(123L)
        assertThat(cardDetails.primaryAccountNumber()).isEqualTo("string")
        assertThat(cardDetails.type()).isEqualTo(CardDetails.Type.CARD_DETAILS)
        assertThat(cardDetails.verificationCode()).isEqualTo("string")
    }
}
