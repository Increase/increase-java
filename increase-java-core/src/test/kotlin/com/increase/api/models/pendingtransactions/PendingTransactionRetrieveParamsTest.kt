// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.pendingtransactions

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PendingTransactionRetrieveParamsTest {

    @Test
    fun create() {
        PendingTransactionRetrieveParams.builder()
            .pendingTransactionId("pending_transaction_k1sfetcau2qbvjbzgju4")
            .build()
    }

    @Test
    fun getPathParam() {
        val params =
            PendingTransactionRetrieveParams.builder()
                .pendingTransactionId("pending_transaction_k1sfetcau2qbvjbzgju4")
                .build()
        assertThat(params).isNotNull
        // path param "pendingTransactionId"
        assertThat(params.getPathParam(0)).isEqualTo("pending_transaction_k1sfetcau2qbvjbzgju4")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
