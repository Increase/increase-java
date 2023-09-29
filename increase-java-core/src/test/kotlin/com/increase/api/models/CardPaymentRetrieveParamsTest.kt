package com.increase.api.models

import com.increase.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CardPaymentRetrieveParamsTest {

    @Test
    fun createCardPaymentRetrieveParams() {
        CardPaymentRetrieveParams.builder().cardPaymentId("string").build()
    }

    @Test
    fun getPathParam() {
        val params = CardPaymentRetrieveParams.builder().cardPaymentId("string").build()
        assertThat(params).isNotNull
        // path param "cardPaymentId"
        assertThat(params.getPathParam(0)).isEqualTo("string")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
