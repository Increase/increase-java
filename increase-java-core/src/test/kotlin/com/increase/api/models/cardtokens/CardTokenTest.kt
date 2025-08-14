// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.cardtokens

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.increase.api.core.jsonMapper
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CardTokenTest {

    @Test
    fun create() {
        val cardToken =
            CardToken.builder()
                .id("outbound_card_token_zlt0ml6youq3q7vcdlg0")
                .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                .expirationDate(LocalDate.parse("2020-01-31"))
                .last4("1234")
                .length(16L)
                .prefix("46637100")
                .type(CardToken.Type.CARD_TOKEN)
                .build()

        assertThat(cardToken.id()).isEqualTo("outbound_card_token_zlt0ml6youq3q7vcdlg0")
        assertThat(cardToken.createdAt()).isEqualTo(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
        assertThat(cardToken.expirationDate()).isEqualTo(LocalDate.parse("2020-01-31"))
        assertThat(cardToken.last4()).isEqualTo("1234")
        assertThat(cardToken.length()).isEqualTo(16L)
        assertThat(cardToken.prefix()).isEqualTo("46637100")
        assertThat(cardToken.type()).isEqualTo(CardToken.Type.CARD_TOKEN)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val cardToken =
            CardToken.builder()
                .id("outbound_card_token_zlt0ml6youq3q7vcdlg0")
                .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                .expirationDate(LocalDate.parse("2020-01-31"))
                .last4("1234")
                .length(16L)
                .prefix("46637100")
                .type(CardToken.Type.CARD_TOKEN)
                .build()

        val roundtrippedCardToken =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cardToken),
                jacksonTypeRef<CardToken>(),
            )

        assertThat(roundtrippedCardToken).isEqualTo(cardToken)
    }
}
