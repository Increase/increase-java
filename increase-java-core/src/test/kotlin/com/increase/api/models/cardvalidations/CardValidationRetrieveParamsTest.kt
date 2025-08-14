// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.cardvalidations

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CardValidationRetrieveParamsTest {

    @Test
    fun create() {
        CardValidationRetrieveParams.builder()
            .cardValidationId("outbound_card_validation_qqlzagpc6v1x2gcdhe24")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            CardValidationRetrieveParams.builder()
                .cardValidationId("outbound_card_validation_qqlzagpc6v1x2gcdhe24")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("outbound_card_validation_qqlzagpc6v1x2gcdhe24")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
