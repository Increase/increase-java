// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.simulations.feepayments

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FeePaymentCreateParamsTest {

    @Test
    fun create() {
        FeePaymentCreateParams.builder()
            .accountId("account_in71c4amph0vgo2qllky")
            .amount(1000L)
            .build()
    }

    @Test
    fun body() {
        val params =
            FeePaymentCreateParams.builder()
                .accountId("account_in71c4amph0vgo2qllky")
                .amount(1000L)
                .build()

        val body = params._body()

        assertThat(body.accountId()).isEqualTo("account_in71c4amph0vgo2qllky")
        assertThat(body.amount()).isEqualTo(1000L)
    }
}
