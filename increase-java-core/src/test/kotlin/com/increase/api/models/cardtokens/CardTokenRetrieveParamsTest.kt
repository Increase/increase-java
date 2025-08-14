// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.cardtokens

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CardTokenRetrieveParamsTest {

    @Test
    fun create() {
        CardTokenRetrieveParams.builder()
            .cardTokenId("outbound_card_token_zlt0ml6youq3q7vcdlg0")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            CardTokenRetrieveParams.builder()
                .cardTokenId("outbound_card_token_zlt0ml6youq3q7vcdlg0")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("outbound_card_token_zlt0ml6youq3q7vcdlg0")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
