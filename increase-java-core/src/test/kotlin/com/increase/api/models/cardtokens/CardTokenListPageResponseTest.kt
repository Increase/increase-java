// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.cardtokens

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.increase.api.core.jsonMapper
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CardTokenListPageResponseTest {

    @Test
    fun create() {
        val cardTokenListPageResponse =
            CardTokenListPageResponse.builder()
                .addData(
                    CardToken.builder()
                        .id("outbound_card_token_zlt0ml6youq3q7vcdlg0")
                        .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .expirationDate(LocalDate.parse("2020-01-31"))
                        .last4("1234")
                        .length(16L)
                        .prefix("46637100")
                        .type(CardToken.Type.CARD_TOKEN)
                        .build()
                )
                .nextCursor("v57w5d")
                .build()

        assertThat(cardTokenListPageResponse.data())
            .containsExactly(
                CardToken.builder()
                    .id("outbound_card_token_zlt0ml6youq3q7vcdlg0")
                    .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                    .expirationDate(LocalDate.parse("2020-01-31"))
                    .last4("1234")
                    .length(16L)
                    .prefix("46637100")
                    .type(CardToken.Type.CARD_TOKEN)
                    .build()
            )
        assertThat(cardTokenListPageResponse.nextCursor()).contains("v57w5d")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val cardTokenListPageResponse =
            CardTokenListPageResponse.builder()
                .addData(
                    CardToken.builder()
                        .id("outbound_card_token_zlt0ml6youq3q7vcdlg0")
                        .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .expirationDate(LocalDate.parse("2020-01-31"))
                        .last4("1234")
                        .length(16L)
                        .prefix("46637100")
                        .type(CardToken.Type.CARD_TOKEN)
                        .build()
                )
                .nextCursor("v57w5d")
                .build()

        val roundtrippedCardTokenListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cardTokenListPageResponse),
                jacksonTypeRef<CardTokenListPageResponse>(),
            )

        assertThat(roundtrippedCardTokenListPageResponse).isEqualTo(cardTokenListPageResponse)
    }
}
