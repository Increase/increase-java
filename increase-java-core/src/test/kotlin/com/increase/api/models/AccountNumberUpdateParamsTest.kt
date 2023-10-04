// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.increase.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AccountNumberUpdateParamsTest {

    @Test
    fun createAccountNumberUpdateParams() {
        AccountNumberUpdateParams.builder()
            .accountNumberId("string")
            .inboundAch(
                AccountNumberUpdateParams.InboundAch.builder()
                    .debitStatus(AccountNumberUpdateParams.InboundAch.DebitStatus.ALLOWED)
                    .build()
            )
            .name("x")
            .status(AccountNumberUpdateParams.Status.ACTIVE)
            .build()
    }

    @Test
    fun getBody() {
        val params =
            AccountNumberUpdateParams.builder()
                .accountNumberId("string")
                .inboundAch(
                    AccountNumberUpdateParams.InboundAch.builder()
                        .debitStatus(AccountNumberUpdateParams.InboundAch.DebitStatus.ALLOWED)
                        .build()
                )
                .name("x")
                .status(AccountNumberUpdateParams.Status.ACTIVE)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.inboundAch())
            .isEqualTo(
                AccountNumberUpdateParams.InboundAch.builder()
                    .debitStatus(AccountNumberUpdateParams.InboundAch.DebitStatus.ALLOWED)
                    .build()
            )
        assertThat(body.name()).isEqualTo("x")
        assertThat(body.status()).isEqualTo(AccountNumberUpdateParams.Status.ACTIVE)
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = AccountNumberUpdateParams.builder().accountNumberId("string").build()
        val body = params.getBody()
        assertThat(body).isNotNull
    }

    @Test
    fun getPathParam() {
        val params = AccountNumberUpdateParams.builder().accountNumberId("string").build()
        assertThat(params).isNotNull
        // path param "accountNumberId"
        assertThat(params.getPathParam(0)).isEqualTo("string")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
