package com.increase.api.models

import com.increase.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AccountNumberCreateParamsTest {

    @Test
    fun createAccountNumberCreateParams() {
        AccountNumberCreateParams.builder().accountId("string").name("x").build()
    }

    @Test
    fun getBody() {
        val params = AccountNumberCreateParams.builder().accountId("string").name("x").build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.accountId()).isEqualTo("string")
        assertThat(body.name()).isEqualTo("x")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = AccountNumberCreateParams.builder().accountId("string").name("x").build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.accountId()).isEqualTo("string")
        assertThat(body.name()).isEqualTo("x")
    }
}
