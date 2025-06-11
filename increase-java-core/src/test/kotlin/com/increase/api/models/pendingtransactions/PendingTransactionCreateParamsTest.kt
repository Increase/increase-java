// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.pendingtransactions

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PendingTransactionCreateParamsTest {

    @Test
    fun create() {
        PendingTransactionCreateParams.builder()
            .accountId("account_in71c4amph0vgo2qllky")
            .amount(-1000L)
            .description("Hold for pending transaction")
            .build()
    }

    @Test
    fun body() {
        val params =
            PendingTransactionCreateParams.builder()
                .accountId("account_in71c4amph0vgo2qllky")
                .amount(-1000L)
                .description("Hold for pending transaction")
                .build()

        val body = params._body()

        assertThat(body.accountId()).isEqualTo("account_in71c4amph0vgo2qllky")
        assertThat(body.amount()).isEqualTo(-1000L)
        assertThat(body.description()).contains("Hold for pending transaction")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            PendingTransactionCreateParams.builder()
                .accountId("account_in71c4amph0vgo2qllky")
                .amount(-1000L)
                .build()

        val body = params._body()

        assertThat(body.accountId()).isEqualTo("account_in71c4amph0vgo2qllky")
        assertThat(body.amount()).isEqualTo(-1000L)
    }
}
