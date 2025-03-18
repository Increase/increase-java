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
    fun pathParams() {
        val params =
            DeclinedTransactionRetrieveParams.builder()
                .declinedTransactionId("declined_transaction_17jbn0yyhvkt4v4ooym8")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("declined_transaction_17jbn0yyhvkt4v4ooym8")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
