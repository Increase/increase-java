// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.increase.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CardDisputeRetrieveParamsTest {

    @Test
    fun createCardDisputeRetrieveParams() {
        CardDisputeRetrieveParams.builder().cardDisputeId("card_dispute_id").build()
    }

    @Test
    fun getPathParam() {
        val params = CardDisputeRetrieveParams.builder().cardDisputeId("card_dispute_id").build()
        assertThat(params).isNotNull
        // path param "cardDisputeId"
        assertThat(params.getPathParam(0)).isEqualTo("card_dispute_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
