package com.increase.api.models

import com.increase.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AccountTransferCreateParamsTest {

    @Test
    fun createAccountTransferCreateParams() {
        AccountTransferCreateParams.builder()
            .accountId("string")
            .amount(123L)
            .description("x")
            .destinationAccountId("string")
            .requireApproval(true)
            .build()
    }

    @Test
    fun getBody() {
        val params =
            AccountTransferCreateParams.builder()
                .accountId("string")
                .amount(123L)
                .description("x")
                .destinationAccountId("string")
                .requireApproval(true)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.accountId()).isEqualTo("string")
        assertThat(body.amount()).isEqualTo(123L)
        assertThat(body.description()).isEqualTo("x")
        assertThat(body.destinationAccountId()).isEqualTo("string")
        assertThat(body.requireApproval()).isEqualTo(true)
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            AccountTransferCreateParams.builder()
                .accountId("string")
                .amount(123L)
                .description("x")
                .destinationAccountId("string")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.accountId()).isEqualTo("string")
        assertThat(body.amount()).isEqualTo(123L)
        assertThat(body.description()).isEqualTo("x")
        assertThat(body.destinationAccountId()).isEqualTo("string")
    }
}
