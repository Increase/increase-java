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
    fun pathParams() {
        val params =
            BookkeepingAccountUpdateParams.builder()
                .bookkeepingAccountId("bookkeeping_account_e37p1f1iuocw5intf35v")
                .name("Deprecated Account")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("bookkeeping_account_e37p1f1iuocw5intf35v")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
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
}
