// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.accounts

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AccountUpdateParamsTest {

    @Test
    fun create() {
        AccountUpdateParams.builder()
            .accountId("account_in71c4amph0vgo2qllky")
            .creditLimit(0L)
            .name("My renamed account")
            .build()
    }

    @Test
    fun pathParams() {
        val params = AccountUpdateParams.builder().accountId("account_in71c4amph0vgo2qllky").build()

        assertThat(params._pathParam(0)).isEqualTo("account_in71c4amph0vgo2qllky")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            AccountUpdateParams.builder()
                .accountId("account_in71c4amph0vgo2qllky")
                .creditLimit(0L)
                .name("My renamed account")
                .build()

        val body = params._body()

        assertThat(body.creditLimit()).contains(0L)
        assertThat(body.name()).contains("My renamed account")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = AccountUpdateParams.builder().accountId("account_in71c4amph0vgo2qllky").build()

        val body = params._body()
    }
}
