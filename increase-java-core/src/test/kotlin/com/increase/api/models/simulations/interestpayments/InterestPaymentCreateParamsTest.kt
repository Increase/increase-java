// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.simulations.interestpayments

import java.time.OffsetDateTime
import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class InterestPaymentCreateParamsTest {

    @Test
    fun create() {
        InterestPaymentCreateParams.builder()
            .accountId("account_in71c4amph0vgo2qllky")
            .amount(1000L)
            .accruedOnAccountId("accrued_on_account_id")
            .periodEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .periodStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .build()
    }

    @Test
    fun body() {
        val params =
            InterestPaymentCreateParams.builder()
                .accountId("account_in71c4amph0vgo2qllky")
                .amount(1000L)
                .accruedOnAccountId("accrued_on_account_id")
                .periodEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .periodStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.accountId()).isEqualTo("account_in71c4amph0vgo2qllky")
        assertThat(body.amount()).isEqualTo(1000L)
        assertThat(body.accruedOnAccountId()).contains("accrued_on_account_id")
        assertThat(body.periodEnd()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.periodStart()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            InterestPaymentCreateParams.builder()
                .accountId("account_in71c4amph0vgo2qllky")
                .amount(1000L)
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.accountId()).isEqualTo("account_in71c4amph0vgo2qllky")
        assertThat(body.amount()).isEqualTo(1000L)
    }
}
