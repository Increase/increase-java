// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.cardtokens

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.increase.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CardTokenCapabilitiesTest {

    @Test
    fun create() {
        val cardTokenCapabilities =
            CardTokenCapabilities.builder()
                .addRoute(
                    CardTokenCapabilities.Route.builder()
                        .crossBorderPushTransfers(
                            CardTokenCapabilities.Route.CrossBorderPushTransfers.NOT_SUPPORTED
                        )
                        .domesticPushTransfers(
                            CardTokenCapabilities.Route.DomesticPushTransfers.SUPPORTED
                        )
                        .route(CardTokenCapabilities.Route.InnerRoute.VISA)
                        .build()
                )
                .type(CardTokenCapabilities.Type.CARD_TOKEN_CAPABILITIES)
                .build()

        assertThat(cardTokenCapabilities.routes())
            .containsExactly(
                CardTokenCapabilities.Route.builder()
                    .crossBorderPushTransfers(
                        CardTokenCapabilities.Route.CrossBorderPushTransfers.NOT_SUPPORTED
                    )
                    .domesticPushTransfers(
                        CardTokenCapabilities.Route.DomesticPushTransfers.SUPPORTED
                    )
                    .route(CardTokenCapabilities.Route.InnerRoute.VISA)
                    .build()
            )
        assertThat(cardTokenCapabilities.type())
            .isEqualTo(CardTokenCapabilities.Type.CARD_TOKEN_CAPABILITIES)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val cardTokenCapabilities =
            CardTokenCapabilities.builder()
                .addRoute(
                    CardTokenCapabilities.Route.builder()
                        .crossBorderPushTransfers(
                            CardTokenCapabilities.Route.CrossBorderPushTransfers.NOT_SUPPORTED
                        )
                        .domesticPushTransfers(
                            CardTokenCapabilities.Route.DomesticPushTransfers.SUPPORTED
                        )
                        .route(CardTokenCapabilities.Route.InnerRoute.VISA)
                        .build()
                )
                .type(CardTokenCapabilities.Type.CARD_TOKEN_CAPABILITIES)
                .build()

        val roundtrippedCardTokenCapabilities =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cardTokenCapabilities),
                jacksonTypeRef<CardTokenCapabilities>(),
            )

        assertThat(roundtrippedCardTokenCapabilities).isEqualTo(cardTokenCapabilities)
    }
}
