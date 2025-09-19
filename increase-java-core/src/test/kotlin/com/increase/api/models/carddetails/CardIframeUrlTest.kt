// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.carddetails

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.increase.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CardIframeUrlTest {

    @Test
    fun create() {
        val cardIframeUrl =
            CardIframeUrl.builder()
                .expiresAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                .iframeUrl("https://increase.com/card_details_iframe/index.html?token=0")
                .type(CardIframeUrl.Type.CARD_IFRAME_URL)
                .build()

        assertThat(cardIframeUrl.expiresAt())
            .isEqualTo(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
        assertThat(cardIframeUrl.iframeUrl())
            .isEqualTo("https://increase.com/card_details_iframe/index.html?token=0")
        assertThat(cardIframeUrl.type()).isEqualTo(CardIframeUrl.Type.CARD_IFRAME_URL)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val cardIframeUrl =
            CardIframeUrl.builder()
                .expiresAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                .iframeUrl("https://increase.com/card_details_iframe/index.html?token=0")
                .type(CardIframeUrl.Type.CARD_IFRAME_URL)
                .build()

        val roundtrippedCardIframeUrl =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cardIframeUrl),
                jacksonTypeRef<CardIframeUrl>(),
            )

        assertThat(roundtrippedCardIframeUrl).isEqualTo(cardIframeUrl)
    }
}
