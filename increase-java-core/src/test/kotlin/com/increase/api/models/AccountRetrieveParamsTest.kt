// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AccountRetrieveParamsTest {

    @Test
    fun createAccountRetrieveParams() {
        AccountRetrieveParams.builder().accountId("account_id").build()
    }

    @Test
    fun getPathParam() {
        val params = AccountRetrieveParams.builder().accountId("account_id").build()
        assertThat(params).isNotNull
        // path param "accountId"
        assertThat(params.getPathParam(0)).isEqualTo("account_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
