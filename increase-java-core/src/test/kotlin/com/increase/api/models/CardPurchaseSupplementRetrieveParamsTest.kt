package com.increase.api.models

import com.increase.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CardPurchaseSupplementRetrieveParamsTest {

    @Test
    fun createCardPurchaseSupplementRetrieveParams() {
        CardPurchaseSupplementRetrieveParams.builder().cardPurchaseSupplementId("string").build()
    }

    @Test
    fun getPathParam() {
        val params =
            CardPurchaseSupplementRetrieveParams.builder()
                .cardPurchaseSupplementId("string")
                .build()
        assertThat(params).isNotNull
        // path param "cardPurchaseSupplementId"
        assertThat(params.getPathParam(0)).isEqualTo("string")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
