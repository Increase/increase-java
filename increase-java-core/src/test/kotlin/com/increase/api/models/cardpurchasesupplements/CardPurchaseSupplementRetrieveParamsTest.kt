// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.cardpurchasesupplements

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CardPurchaseSupplementRetrieveParamsTest {

    @Test
    fun create() {
        CardPurchaseSupplementRetrieveParams.builder()
            .cardPurchaseSupplementId("card_purchase_supplement_ijuc45iym4jchnh2sfk3")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            CardPurchaseSupplementRetrieveParams.builder()
                .cardPurchaseSupplementId("card_purchase_supplement_ijuc45iym4jchnh2sfk3")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("card_purchase_supplement_ijuc45iym4jchnh2sfk3")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
