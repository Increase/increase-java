// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.cards

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.increase.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CardDetailsTokenTest {

    @Test
    fun create() {
        val cardDetailsToken =
            CardDetailsToken.builder()
                .token("0f3d2a1b4c5e6f708192a3b4c5d6e7f8")
                .expiresAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                .type(CardDetailsToken.Type.CARD_DETAILS_TOKEN)
                .build()

        assertThat(cardDetailsToken.token()).isEqualTo("0f3d2a1b4c5e6f708192a3b4c5d6e7f8")
        assertThat(cardDetailsToken.expiresAt())
            .isEqualTo(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
        assertThat(cardDetailsToken.type()).isEqualTo(CardDetailsToken.Type.CARD_DETAILS_TOKEN)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val cardDetailsToken =
            CardDetailsToken.builder()
                .token("0f3d2a1b4c5e6f708192a3b4c5d6e7f8")
                .expiresAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                .type(CardDetailsToken.Type.CARD_DETAILS_TOKEN)
                .build()

        val roundtrippedCardDetailsToken =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cardDetailsToken),
                jacksonTypeRef<CardDetailsToken>(),
            )

        assertThat(roundtrippedCardDetailsToken).isEqualTo(cardDetailsToken)
    }
}
