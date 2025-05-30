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
    fun pathParams() {
        val params =
            AccountBalanceParams.builder().accountId("account_in71c4amph0vgo2qllky").build()

        assertThat(params._pathParam(0)).isEqualTo("account_in71c4amph0vgo2qllky")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            AccountBalanceParams.builder()
                .accountId("account_in71c4amph0vgo2qllky")
                .atTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("at_time", "2019-12-27T18:11:19.117Z").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            AccountBalanceParams.builder().accountId("account_in71c4amph0vgo2qllky").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
