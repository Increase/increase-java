// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AccountNumberUpdateParamsTest {

    @Test
    fun create() {
        AccountNumberUpdateParams.builder()
            .accountNumberId("account_number_v18nkfqm6afpsrvy82b2")
            .inboundAch(
                AccountNumberUpdateParams.InboundAch.builder()
                    .debitStatus(AccountNumberUpdateParams.InboundAch.DebitStatus.ALLOWED)
                    .build()
            )
            .inboundChecks(
                AccountNumberUpdateParams.InboundChecks.builder()
                    .status(AccountNumberUpdateParams.InboundChecks.Status.ALLOWED)
                    .build()
            )
            .name("x")
            .status(AccountNumberUpdateParams.Status.ACTIVE)
            .build()
    }

    @Test
    fun body() {
        val params =
            AccountNumberUpdateParams.builder()
                .accountNumberId("account_number_v18nkfqm6afpsrvy82b2")
                .inboundAch(
                    AccountNumberUpdateParams.InboundAch.builder()
                        .debitStatus(AccountNumberUpdateParams.InboundAch.DebitStatus.ALLOWED)
                        .build()
                )
                .inboundChecks(
                    AccountNumberUpdateParams.InboundChecks.builder()
                        .status(AccountNumberUpdateParams.InboundChecks.Status.ALLOWED)
                        .build()
                )
                .name("x")
                .status(AccountNumberUpdateParams.Status.ACTIVE)
                .build()
        val body = params._body()
        assertThat(body).isNotNull
        assertThat(body.inboundAch())
            .contains(
                AccountNumberUpdateParams.InboundAch.builder()
                    .debitStatus(AccountNumberUpdateParams.InboundAch.DebitStatus.ALLOWED)
                    .build()
            )
        assertThat(body.inboundChecks())
            .contains(
                AccountNumberUpdateParams.InboundChecks.builder()
                    .status(AccountNumberUpdateParams.InboundChecks.Status.ALLOWED)
                    .build()
            )
        assertThat(body.name()).contains("x")
        assertThat(body.status()).contains(AccountNumberUpdateParams.Status.ACTIVE)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            AccountNumberUpdateParams.builder()
                .accountNumberId("account_number_v18nkfqm6afpsrvy82b2")
                .build()
        val body = params._body()
        assertThat(body).isNotNull
    }

    @Test
    fun getPathParam() {
        val params =
            AccountNumberUpdateParams.builder()
                .accountNumberId("account_number_v18nkfqm6afpsrvy82b2")
                .build()
        assertThat(params).isNotNull
        // path param "accountNumberId"
        assertThat(params.getPathParam(0)).isEqualTo("account_number_v18nkfqm6afpsrvy82b2")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
