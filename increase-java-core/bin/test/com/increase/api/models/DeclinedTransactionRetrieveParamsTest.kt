// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.increase.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DeclinedTransactionRetrieveParamsTest {

    @Test
    fun createDeclinedTransactionRetrieveParams() {
        DeclinedTransactionRetrieveParams.builder()
            .declinedTransactionId("declined_transaction_id")
            .build()
    }

    @Test
    fun getPathParam() {
        val params =
            DeclinedTransactionRetrieveParams.builder()
                .declinedTransactionId("declined_transaction_id")
                .build()
        assertThat(params).isNotNull
        // path param "declinedTransactionId"
        assertThat(params.getPathParam(0)).isEqualTo("declined_transaction_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
