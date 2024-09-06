// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.increase.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AccountNumberRetrieveParamsTest {

    @Test
    fun createAccountNumberRetrieveParams() {
        AccountNumberRetrieveParams.builder().accountNumberId("account_number_id").build()
    }

    @Test
    fun getPathParam() {
        val params =
            AccountNumberRetrieveParams.builder().accountNumberId("account_number_id").build()
        assertThat(params).isNotNull
        // path param "accountNumberId"
        assertThat(params.getPathParam(0)).isEqualTo("account_number_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
