// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.transactions

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TransactionRetrieveParamsTest {

    @Test
    fun create() {
        TransactionRetrieveParams.builder().transactionId("transaction_uyrp7fld2ium70oa7oi").build()
    }

    @Test
    fun pathParams() {
        val params =
            TransactionRetrieveParams.builder()
                .transactionId("transaction_uyrp7fld2ium70oa7oi")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("transaction_uyrp7fld2ium70oa7oi")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
