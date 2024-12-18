// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CardPaymentRetrieveParamsTest {

    @Test
    fun createCardPaymentRetrieveParams() {
        CardPaymentRetrieveParams.builder().cardPaymentId("card_payment_id").build()
    }

    @Test
    fun getPathParam() {
        val params = CardPaymentRetrieveParams.builder().cardPaymentId("card_payment_id").build()
        assertThat(params).isNotNull
        // path param "cardPaymentId"
        assertThat(params.getPathParam(0)).isEqualTo("card_payment_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
