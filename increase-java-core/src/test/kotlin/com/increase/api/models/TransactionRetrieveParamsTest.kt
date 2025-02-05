// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class TransactionRetrieveParamsTest {

    @Test
    fun create() {
        TransactionRetrieveParams.builder().transactionId("transaction_uyrp7fld2ium70oa7oi").build()
    }

    @Test
    fun getPathParam() {
        val params =
            TransactionRetrieveParams.builder()
                .transactionId("transaction_uyrp7fld2ium70oa7oi")
                .build()
        assertThat(params).isNotNull
        // path param "transactionId"
        assertThat(params.getPathParam(0)).isEqualTo("transaction_uyrp7fld2ium70oa7oi")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
