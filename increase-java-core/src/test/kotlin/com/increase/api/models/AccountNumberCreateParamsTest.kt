// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AccountNumberCreateParamsTest {

    @Test
    fun createAccountNumberCreateParams() {
        AccountNumberCreateParams.builder()
            .accountId("account_in71c4amph0vgo2qllky")
            .name("Rent payments")
            .inboundAch(
                AccountNumberCreateParams.InboundAch.builder()
                    .debitStatus(AccountNumberCreateParams.InboundAch.DebitStatus.ALLOWED)
                    .build()
            )
            .inboundChecks(
                AccountNumberCreateParams.InboundChecks.builder()
                    .status(AccountNumberCreateParams.InboundChecks.Status.ALLOWED)
                    .build()
            )
            .build()
    }

    @Test
    fun getBody() {
        val params =
            AccountNumberCreateParams.builder()
                .accountId("account_in71c4amph0vgo2qllky")
                .name("Rent payments")
                .inboundAch(
                    AccountNumberCreateParams.InboundAch.builder()
                        .debitStatus(AccountNumberCreateParams.InboundAch.DebitStatus.ALLOWED)
                        .build()
                )
                .inboundChecks(
                    AccountNumberCreateParams.InboundChecks.builder()
                        .status(AccountNumberCreateParams.InboundChecks.Status.ALLOWED)
                        .build()
                )
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.accountId()).isEqualTo("account_in71c4amph0vgo2qllky")
        assertThat(body.name()).isEqualTo("Rent payments")
        assertThat(body.inboundAch())
            .isEqualTo(
                AccountNumberCreateParams.InboundAch.builder()
                    .debitStatus(AccountNumberCreateParams.InboundAch.DebitStatus.ALLOWED)
                    .build()
            )
        assertThat(body.inboundChecks())
            .isEqualTo(
                AccountNumberCreateParams.InboundChecks.builder()
                    .status(AccountNumberCreateParams.InboundChecks.Status.ALLOWED)
                    .build()
            )
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            AccountNumberCreateParams.builder()
                .accountId("account_in71c4amph0vgo2qllky")
                .name("Rent payments")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.accountId()).isEqualTo("account_in71c4amph0vgo2qllky")
        assertThat(body.name()).isEqualTo("Rent payments")
    }
}
