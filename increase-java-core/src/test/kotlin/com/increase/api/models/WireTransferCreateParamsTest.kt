// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class WireTransferCreateParamsTest {

    @Test
    fun createWireTransferCreateParams() {
        WireTransferCreateParams.builder()
            .accountId("account_id")
            .amount(1L)
            .beneficiaryName("x")
            .messageToRecipient("x")
            .accountNumber("x")
            .beneficiaryAddressLine1("x")
            .beneficiaryAddressLine2("x")
            .beneficiaryAddressLine3("x")
            .externalAccountId("external_account_id")
            .originatorAddressLine1("x")
            .originatorAddressLine2("x")
            .originatorAddressLine3("x")
            .originatorName("x")
            .requireApproval(true)
            .routingNumber("xxxxxxxxx")
            .sourceAccountNumberId("source_account_number_id")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            WireTransferCreateParams.builder()
                .accountId("account_id")
                .amount(1L)
                .beneficiaryName("x")
                .messageToRecipient("x")
                .accountNumber("x")
                .beneficiaryAddressLine1("x")
                .beneficiaryAddressLine2("x")
                .beneficiaryAddressLine3("x")
                .externalAccountId("external_account_id")
                .originatorAddressLine1("x")
                .originatorAddressLine2("x")
                .originatorAddressLine3("x")
                .originatorName("x")
                .requireApproval(true)
                .routingNumber("xxxxxxxxx")
                .sourceAccountNumberId("source_account_number_id")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.accountId()).isEqualTo("account_id")
        assertThat(body.amount()).isEqualTo(1L)
        assertThat(body.beneficiaryName()).isEqualTo("x")
        assertThat(body.messageToRecipient()).isEqualTo("x")
        assertThat(body.accountNumber()).isEqualTo("x")
        assertThat(body.beneficiaryAddressLine1()).isEqualTo("x")
        assertThat(body.beneficiaryAddressLine2()).isEqualTo("x")
        assertThat(body.beneficiaryAddressLine3()).isEqualTo("x")
        assertThat(body.externalAccountId()).isEqualTo("external_account_id")
        assertThat(body.originatorAddressLine1()).isEqualTo("x")
        assertThat(body.originatorAddressLine2()).isEqualTo("x")
        assertThat(body.originatorAddressLine3()).isEqualTo("x")
        assertThat(body.originatorName()).isEqualTo("x")
        assertThat(body.requireApproval()).isEqualTo(true)
        assertThat(body.routingNumber()).isEqualTo("xxxxxxxxx")
        assertThat(body.sourceAccountNumberId()).isEqualTo("source_account_number_id")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            WireTransferCreateParams.builder()
                .accountId("account_id")
                .amount(1L)
                .beneficiaryName("x")
                .messageToRecipient("x")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.accountId()).isEqualTo("account_id")
        assertThat(body.amount()).isEqualTo(1L)
        assertThat(body.beneficiaryName()).isEqualTo("x")
        assertThat(body.messageToRecipient()).isEqualTo("x")
    }
}
