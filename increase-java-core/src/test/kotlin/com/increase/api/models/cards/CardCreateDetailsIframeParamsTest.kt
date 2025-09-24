// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.cards

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CardCreateDetailsIframeParamsTest {

    @Test
    fun create() {
        CardCreateDetailsIframeParams.builder()
            .cardId("card_oubs0hwk5rn6knuecxg2")
            .physicalCardId("physical_card_id")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            CardCreateDetailsIframeParams.builder().cardId("card_oubs0hwk5rn6knuecxg2").build()

        assertThat(params._pathParam(0)).isEqualTo("card_oubs0hwk5rn6knuecxg2")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            CardCreateDetailsIframeParams.builder()
                .cardId("card_oubs0hwk5rn6knuecxg2")
                .physicalCardId("physical_card_id")
                .build()

        val body = params._body()

        assertThat(body.physicalCardId()).contains("physical_card_id")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            CardCreateDetailsIframeParams.builder().cardId("card_oubs0hwk5rn6knuecxg2").build()

        val body = params._body()
    }
}
