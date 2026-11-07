// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.accountnumbers

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AccountNumberCreateParamsTest {

    @Test
    fun create() {
        AccountNumberCreateParams.builder()
            .accountId("account_in71c4amph0vgo2qllky")
            .name("Rent payments")
            .inboundAchDebits(AccountNumberCreateParams.InboundAchDebits.ALLOWED)
            .unregisteredInboundChecks(AccountNumberCreateParams.UnregisteredInboundChecks.ALLOWED)
            .build()
    }

    @Test
    fun body() {
        val params =
            AccountNumberCreateParams.builder()
                .accountId("account_in71c4amph0vgo2qllky")
                .name("Rent payments")
                .inboundAchDebits(AccountNumberCreateParams.InboundAchDebits.ALLOWED)
                .unregisteredInboundChecks(
                    AccountNumberCreateParams.UnregisteredInboundChecks.ALLOWED
                )
                .build()

        val body = params._body()

        assertThat(body.accountId()).isEqualTo("account_in71c4amph0vgo2qllky")
        assertThat(body.name()).isEqualTo("Rent payments")
        assertThat(body.inboundAchDebits())
            .contains(AccountNumberCreateParams.InboundAchDebits.ALLOWED)
        assertThat(body.unregisteredInboundChecks())
            .contains(AccountNumberCreateParams.UnregisteredInboundChecks.ALLOWED)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            AccountNumberCreateParams.builder()
                .accountId("account_in71c4amph0vgo2qllky")
                .name("Rent payments")
                .build()

        val body = params._body()

        assertThat(body.accountId()).isEqualTo("account_in71c4amph0vgo2qllky")
        assertThat(body.name()).isEqualTo("Rent payments")
    }
}
