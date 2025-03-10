// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.cardpurchasesupplements

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CardPurchaseSupplementRetrieveParamsTest {

    @Test
    fun create() {
        CardPurchaseSupplementRetrieveParams.builder()
            .cardPurchaseSupplementId("card_purchase_supplement_ijuc45iym4jchnh2sfk3")
            .build()
    }

    @Test
    fun getPathParam() {
        val params =
            CardPurchaseSupplementRetrieveParams.builder()
                .cardPurchaseSupplementId("card_purchase_supplement_ijuc45iym4jchnh2sfk3")
                .build()
        assertThat(params).isNotNull
        // path param "cardPurchaseSupplementId"
        assertThat(params.getPathParam(0))
            .isEqualTo("card_purchase_supplement_ijuc45iym4jchnh2sfk3")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
