// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AccountUpdateParamsTest {

    @Test
    fun create() {
        AccountUpdateParams.builder()
            .accountId("account_in71c4amph0vgo2qllky")
            .name("My renamed account")
            .build()
    }

    @Test
    fun body() {
        val params =
            AccountUpdateParams.builder()
                .accountId("account_in71c4amph0vgo2qllky")
                .name("My renamed account")
                .build()
        val body = params._body()
        assertThat(body).isNotNull
        assertThat(body.name()).contains("My renamed account")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = AccountUpdateParams.builder().accountId("account_in71c4amph0vgo2qllky").build()
        val body = params._body()
        assertThat(body).isNotNull
    }

    @Test
    fun getPathParam() {
        val params = AccountUpdateParams.builder().accountId("account_in71c4amph0vgo2qllky").build()
        assertThat(params).isNotNull
        // path param "accountId"
        assertThat(params.getPathParam(0)).isEqualTo("account_in71c4amph0vgo2qllky")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
