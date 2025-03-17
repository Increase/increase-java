// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.accounts

import com.increase.api.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AccountBalanceParamsTest {

    @Test
    fun create() {
        AccountBalanceParams.builder()
            .accountId("account_in71c4amph0vgo2qllky")
            .atTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            AccountBalanceParams.builder()
                .accountId("account_in71c4amph0vgo2qllky")
                .atTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()
        val expected = QueryParams.builder()
        expected.put("at_time", "2019-12-27T18:11:19.117Z")
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            AccountBalanceParams.builder().accountId("account_in71c4amph0vgo2qllky").build()
        val expected = QueryParams.builder()
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getPathParam() {
        val params =
            AccountBalanceParams.builder().accountId("account_in71c4amph0vgo2qllky").build()
        assertThat(params).isNotNull
        // path param "accountId"
        assertThat(params.getPathParam(0)).isEqualTo("account_in71c4amph0vgo2qllky")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
