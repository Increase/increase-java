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
    fun pathParams() {
        val params =
            PendingTransactionRetrieveParams.builder()
                .pendingTransactionId("pending_transaction_k1sfetcau2qbvjbzgju4")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("pending_transaction_k1sfetcau2qbvjbzgju4")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
