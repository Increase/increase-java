// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.increase.api.core.http.QueryParams
import com.increase.api.models.*
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class BookkeepingAccountBalanceParamsTest {

    @Test
    fun createBookkeepingAccountBalanceParams() {
        BookkeepingAccountBalanceParams.builder()
            .bookkeepingAccountId("bookkeeping_account_id")
            .atTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            BookkeepingAccountBalanceParams.builder()
                .bookkeepingAccountId("bookkeeping_account_id")
                .atTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()
        val expected = QueryParams.builder()
        expected.put("at_time", "2019-12-27T18:11:19.117Z")
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params =
            BookkeepingAccountBalanceParams.builder()
                .bookkeepingAccountId("bookkeeping_account_id")
                .build()
        val expected = QueryParams.builder()
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getPathParam() {
        val params =
            BookkeepingAccountBalanceParams.builder()
                .bookkeepingAccountId("bookkeeping_account_id")
                .build()
        assertThat(params).isNotNull
        // path param "bookkeepingAccountId"
        assertThat(params.getPathParam(0)).isEqualTo("bookkeeping_account_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
