// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.bookkeepingaccounts

import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BookkeepingAccountUpdateParamsTest {

    @Test
    fun create() {
        BookkeepingAccountUpdateParams.builder()
            .bookkeepingAccountId("bookkeeping_account_e37p1f1iuocw5intf35v")
            .name("Deprecated Account")
            .build()
    }

    @Test
    fun body() {
        val params =
            BookkeepingAccountUpdateParams.builder()
                .bookkeepingAccountId("bookkeeping_account_e37p1f1iuocw5intf35v")
                .name("Deprecated Account")
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.name()).isEqualTo("Deprecated Account")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            BookkeepingAccountUpdateParams.builder()
                .bookkeepingAccountId("bookkeeping_account_e37p1f1iuocw5intf35v")
                .name("Deprecated Account")
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.name()).isEqualTo("Deprecated Account")
    }

    @Test
    fun getPathParam() {
        val params =
            BookkeepingAccountUpdateParams.builder()
                .bookkeepingAccountId("bookkeeping_account_e37p1f1iuocw5intf35v")
                .name("Deprecated Account")
                .build()
        assertThat(params).isNotNull
        // path param "bookkeepingAccountId"
        assertThat(params.getPathParam(0)).isEqualTo("bookkeeping_account_e37p1f1iuocw5intf35v")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
