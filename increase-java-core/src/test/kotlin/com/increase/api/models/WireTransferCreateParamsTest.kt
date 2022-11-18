package com.increase.api.models

import com.increase.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class WireTransferCreateParamsTest {

    @Test
    fun createWireTransferCreateParams() {
        WireTransferCreateParams.builder()
            .accountId("string")
            .accountNumber("x")
            .routingNumber("xxxxxxxxx")
            .externalAccountId("string")
            .amount(123L)
            .messageToRecipient("x")
            .beneficiaryName("x")
            .beneficiaryAddressLine1("x")
            .beneficiaryAddressLine2("x")
            .beneficiaryAddressLine3("x")
            .requireApproval(true)
            .build()
    }

    @Test
    fun getBody() {
        val params =
            WireTransferCreateParams.builder()
                .accountId("string")
                .accountNumber("x")
                .routingNumber("xxxxxxxxx")
                .externalAccountId("string")
                .amount(123L)
                .messageToRecipient("x")
                .beneficiaryName("x")
                .beneficiaryAddressLine1("x")
                .beneficiaryAddressLine2("x")
                .beneficiaryAddressLine3("x")
                .requireApproval(true)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.accountId()).isEqualTo("string")
        assertThat(body.accountNumber()).isEqualTo("x")
        assertThat(body.routingNumber()).isEqualTo("xxxxxxxxx")
        assertThat(body.externalAccountId()).isEqualTo("string")
        assertThat(body.amount()).isEqualTo(123L)
        assertThat(body.messageToRecipient()).isEqualTo("x")
        assertThat(body.beneficiaryName()).isEqualTo("x")
        assertThat(body.beneficiaryAddressLine1()).isEqualTo("x")
        assertThat(body.beneficiaryAddressLine2()).isEqualTo("x")
        assertThat(body.beneficiaryAddressLine3()).isEqualTo("x")
        assertThat(body.requireApproval()).isEqualTo(true)
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            WireTransferCreateParams.builder()
                .accountId("string")
                .amount(123L)
                .messageToRecipient("x")
                .beneficiaryName("x")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.accountId()).isEqualTo("string")
        assertThat(body.amount()).isEqualTo(123L)
        assertThat(body.messageToRecipient()).isEqualTo("x")
        assertThat(body.beneficiaryName()).isEqualTo("x")
    }
}
