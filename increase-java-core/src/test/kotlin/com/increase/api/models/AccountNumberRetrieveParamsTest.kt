package com.increase.api.models

import com.increase.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AccountNumberRetrieveParamsTest {

    @Test
    fun createAccountNumberRetrieveParams() {
        AccountNumberRetrieveParams.builder().accountNumberId("string").build()
    }

    @Test
    fun getPathParam() {
        val params = AccountNumberRetrieveParams.builder().accountNumberId("string").build()
        assertThat(params).isNotNull
        // path param "accountNumberId"
        assertThat(params.getPathParam(0)).isEqualTo("string")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
