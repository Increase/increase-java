// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.carddetails

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.increase.api.core.jsonMapper
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
                .pin("1234")
                .primaryAccountNumber("4242424242424242")
                .type(CardDetails.Type.CARD_DETAILS)
                .verificationCode("123")
                .build()

        assertThat(cardDetails.cardId()).isEqualTo("card_oubs0hwk5rn6knuecxg2")
        assertThat(cardDetails.expirationMonth()).isEqualTo(7L)
        assertThat(cardDetails.expirationYear()).isEqualTo(2025L)
        assertThat(cardDetails.pin()).isEqualTo("1234")
        assertThat(cardDetails.primaryAccountNumber()).isEqualTo("4242424242424242")
        assertThat(cardDetails.type()).isEqualTo(CardDetails.Type.CARD_DETAILS)
        assertThat(cardDetails.verificationCode()).isEqualTo("123")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val cardDetails =
            CardDetails.builder()
                .cardId("card_oubs0hwk5rn6knuecxg2")
                .expirationMonth(7L)
                .expirationYear(2025L)
                .pin("1234")
                .primaryAccountNumber("4242424242424242")
                .type(CardDetails.Type.CARD_DETAILS)
                .verificationCode("123")
                .build()

        val roundtrippedCardDetails =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cardDetails),
                jacksonTypeRef<CardDetails>(),
            )

        assertThat(roundtrippedCardDetails).isEqualTo(cardDetails)
    }
}
