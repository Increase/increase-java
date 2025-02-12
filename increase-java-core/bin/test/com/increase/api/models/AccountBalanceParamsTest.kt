// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.increase.api.core.http.QueryParams
import com.increase.api.models.*
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AccountBalanceParamsTest {

    @Test
    fun createAccountBalanceParams() {
        AccountBalanceParams.builder()
            .accountId("account_id")
            .atTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            AccountBalanceParams.builder()
                .accountId("account_id")
                .atTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()
        val expected = QueryParams.builder()
        expected.put("at_time", "2019-12-27T18:11:19.117Z")
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = AccountBalanceParams.builder().accountId("account_id").build()
        val expected = QueryParams.builder()
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getPathParam() {
        val params = AccountBalanceParams.builder().accountId("account_id").build()
        assertThat(params).isNotNull
        // path param "accountId"
        assertThat(params.getPathParam(0)).isEqualTo("account_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
