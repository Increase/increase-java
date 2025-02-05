// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AccountTransferRetrieveParamsTest {

    @Test
    fun create() {
        AccountTransferRetrieveParams.builder()
            .accountTransferId("account_transfer_7k9qe1ysdgqztnt63l7n")
            .build()
    }

    @Test
    fun getPathParam() {
        val params =
            AccountTransferRetrieveParams.builder()
                .accountTransferId("account_transfer_7k9qe1ysdgqztnt63l7n")
                .build()
        assertThat(params).isNotNull
        // path param "accountTransferId"
        assertThat(params.getPathParam(0)).isEqualTo("account_transfer_7k9qe1ysdgqztnt63l7n")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
