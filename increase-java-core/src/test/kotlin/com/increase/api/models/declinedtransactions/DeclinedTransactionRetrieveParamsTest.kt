// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.declinedtransactions

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DeclinedTransactionRetrieveParamsTest {

    @Test
    fun create() {
        DeclinedTransactionRetrieveParams.builder()
            .declinedTransactionId("declined_transaction_17jbn0yyhvkt4v4ooym8")
            .build()
    }

    @Test
    fun getPathParam() {
        val params =
            DeclinedTransactionRetrieveParams.builder()
                .declinedTransactionId("declined_transaction_17jbn0yyhvkt4v4ooym8")
                .build()
        assertThat(params).isNotNull
        // path param "declinedTransactionId"
        assertThat(params.getPathParam(0)).isEqualTo("declined_transaction_17jbn0yyhvkt4v4ooym8")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
