// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.cards

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CardUpdatePinParamsTest {

    @Test
    fun create() {
        CardUpdatePinParams.builder().cardId("card_oubs0hwk5rn6knuecxg2").pin("1234").build()
    }

    @Test
    fun pathParams() {
        val params =
            CardUpdatePinParams.builder().cardId("card_oubs0hwk5rn6knuecxg2").pin("1234").build()

        assertThat(params._pathParam(0)).isEqualTo("card_oubs0hwk5rn6knuecxg2")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            CardUpdatePinParams.builder().cardId("card_oubs0hwk5rn6knuecxg2").pin("1234").build()

        val body = params._body()

        assertThat(body.pin()).isEqualTo("1234")
    }
}
