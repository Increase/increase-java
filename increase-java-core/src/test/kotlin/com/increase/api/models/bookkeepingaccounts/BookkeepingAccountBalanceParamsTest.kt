// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.bookkeepingaccounts

import com.increase.api.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BookkeepingAccountBalanceParamsTest {

    @Test
    fun create() {
        BookkeepingAccountBalanceParams.builder()
            .bookkeepingAccountId("bookkeeping_account_e37p1f1iuocw5intf35v")
            .atTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            BookkeepingAccountBalanceParams.builder()
                .bookkeepingAccountId("bookkeeping_account_e37p1f1iuocw5intf35v")
                .atTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("at_time", "2019-12-27T18:11:19.117Z").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            BookkeepingAccountBalanceParams.builder()
                .bookkeepingAccountId("bookkeeping_account_e37p1f1iuocw5intf35v")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }

    @Test
    fun getPathParam() {
        val params =
            BookkeepingAccountBalanceParams.builder()
                .bookkeepingAccountId("bookkeeping_account_e37p1f1iuocw5intf35v")
                .build()
        assertThat(params).isNotNull
        // path param "bookkeepingAccountId"
        assertThat(params.getPathParam(0)).isEqualTo("bookkeeping_account_e37p1f1iuocw5intf35v")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
