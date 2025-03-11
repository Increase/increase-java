// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.cards

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CardRetrieveParamsTest {

    @Test
    fun create() {
        CardRetrieveParams.builder().cardId("card_oubs0hwk5rn6knuecxg2").build()
    }

    @Test
    fun getPathParam() {
        val params = CardRetrieveParams.builder().cardId("card_oubs0hwk5rn6knuecxg2").build()
        assertThat(params).isNotNull
        // path param "cardId"
        assertThat(params.getPathParam(0)).isEqualTo("card_oubs0hwk5rn6knuecxg2")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
