package com.increase.api.models

import com.increase.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class WireTransferCreateParamsTest {

    @Test
    fun createWireTransferCreateParams() {
        WireTransferCreateParams.builder()
            .accountId("string")
            .amount(123L)
            .beneficiaryName("x")
            .messageToRecipient("x")
            .accountNumber("x")
            .beneficiaryAddressLine1("x")
            .beneficiaryAddressLine2("x")
            .beneficiaryAddressLine3("x")
            .externalAccountId("string")
            .requireApproval(true)
            .routingNumber("xxxxxxxxx")
            .uniqueIdentifier("x")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            WireTransferCreateParams.builder()
                .accountId("string")
                .amount(123L)
                .beneficiaryName("x")
                .messageToRecipient("x")
                .accountNumber("x")
                .beneficiaryAddressLine1("x")
                .beneficiaryAddressLine2("x")
                .beneficiaryAddressLine3("x")
                .externalAccountId("string")
                .requireApproval(true)
                .routingNumber("xxxxxxxxx")
                .uniqueIdentifier("x")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.accountId()).isEqualTo("string")
        assertThat(body.amount()).isEqualTo(123L)
        assertThat(body.beneficiaryName()).isEqualTo("x")
        assertThat(body.messageToRecipient()).isEqualTo("x")
        assertThat(body.accountNumber()).isEqualTo("x")
        assertThat(body.beneficiaryAddressLine1()).isEqualTo("x")
        assertThat(body.beneficiaryAddressLine2()).isEqualTo("x")
        assertThat(body.beneficiaryAddressLine3()).isEqualTo("x")
        assertThat(body.externalAccountId()).isEqualTo("string")
        assertThat(body.requireApproval()).isEqualTo(true)
        assertThat(body.routingNumber()).isEqualTo("xxxxxxxxx")
        assertThat(body.uniqueIdentifier()).isEqualTo("x")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            WireTransferCreateParams.builder()
                .accountId("string")
                .amount(123L)
                .beneficiaryName("x")
                .messageToRecipient("x")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.accountId()).isEqualTo("string")
        assertThat(body.amount()).isEqualTo(123L)
        assertThat(body.beneficiaryName()).isEqualTo("x")
        assertThat(body.messageToRecipient()).isEqualTo("x")
    }
}
