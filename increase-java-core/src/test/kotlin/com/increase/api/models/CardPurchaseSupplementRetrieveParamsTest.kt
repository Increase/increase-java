// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CardPurchaseSupplementRetrieveParamsTest {

    @Test
    fun createCardPurchaseSupplementRetrieveParams() {
        CardPurchaseSupplementRetrieveParams.builder()
            .cardPurchaseSupplementId("card_purchase_supplement_id")
            .build()
    }

    @Test
    fun getPathParam() {
        val params =
            CardPurchaseSupplementRetrieveParams.builder()
                .cardPurchaseSupplementId("card_purchase_supplement_id")
                .build()
        assertThat(params).isNotNull
        // path param "cardPurchaseSupplementId"
        assertThat(params.getPathParam(0)).isEqualTo("card_purchase_supplement_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
