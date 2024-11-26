// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.increase.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AccountTransferCreateParamsTest {

    @Test
    fun createAccountTransferCreateParams() {
        AccountTransferCreateParams.builder()
            .accountId("account_id")
            .amount(1L)
            .description("x")
            .destinationAccountId("destination_account_id")
            .requireApproval(true)
            .build()
    }

    @Test
    fun getBody() {
        val params =
            AccountTransferCreateParams.builder()
                .accountId("account_id")
                .amount(1L)
                .description("x")
                .destinationAccountId("destination_account_id")
                .requireApproval(true)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.accountId()).isEqualTo("account_id")
        assertThat(body.amount()).isEqualTo(1L)
        assertThat(body.description()).isEqualTo("x")
        assertThat(body.destinationAccountId()).isEqualTo("destination_account_id")
        assertThat(body.requireApproval()).isEqualTo(true)
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            AccountTransferCreateParams.builder()
                .accountId("account_id")
                .amount(1L)
                .description("x")
                .destinationAccountId("destination_account_id")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.accountId()).isEqualTo("account_id")
        assertThat(body.amount()).isEqualTo(1L)
        assertThat(body.description()).isEqualTo("x")
        assertThat(body.destinationAccountId()).isEqualTo("destination_account_id")
    }
}
