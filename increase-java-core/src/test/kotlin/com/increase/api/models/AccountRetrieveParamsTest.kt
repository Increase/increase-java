// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.increase.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AccountRetrieveParamsTest {

    @Test
    fun createAccountRetrieveParams() {
        AccountRetrieveParams.builder().accountId("string").build()
    }

    @Test
    fun getPathParam() {
        val params = AccountRetrieveParams.builder().accountId("string").build()
        assertThat(params).isNotNull
        // path param "accountId"
        assertThat(params.getPathParam(0)).isEqualTo("string")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
