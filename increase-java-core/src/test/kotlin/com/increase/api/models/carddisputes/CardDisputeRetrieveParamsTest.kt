// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.carddisputes

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CardDisputeRetrieveParamsTest {

    @Test
    fun create() {
        CardDisputeRetrieveParams.builder()
            .cardDisputeId("card_dispute_h9sc95nbl1cgltpp7men")
            .build()
    }

    @Test
    fun getPathParam() {
        val params =
            CardDisputeRetrieveParams.builder()
                .cardDisputeId("card_dispute_h9sc95nbl1cgltpp7men")
                .build()
        assertThat(params).isNotNull
        // path param "cardDisputeId"
        assertThat(params.getPathParam(0)).isEqualTo("card_dispute_h9sc95nbl1cgltpp7men")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
