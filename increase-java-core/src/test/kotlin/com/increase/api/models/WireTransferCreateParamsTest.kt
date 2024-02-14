// File generated from our OpenAPI spec by Stainless.

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
            .originatorAddressLine1("x")
            .originatorAddressLine2("x")
            .originatorAddressLine3("x")
            .originatorName("x")
            .requireApproval(true)
            .routingNumber("xxxxxxxxx")
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
                .originatorAddressLine1("x")
                .originatorAddressLine2("x")
                .originatorAddressLine3("x")
                .originatorName("x")
                .requireApproval(true)
                .routingNumber("xxxxxxxxx")
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
        assertThat(body.originatorAddressLine1()).isEqualTo("x")
        assertThat(body.originatorAddressLine2()).isEqualTo("x")
        assertThat(body.originatorAddressLine3()).isEqualTo("x")
        assertThat(body.originatorName()).isEqualTo("x")
        assertThat(body.requireApproval()).isEqualTo(true)
        assertThat(body.routingNumber()).isEqualTo("xxxxxxxxx")
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
