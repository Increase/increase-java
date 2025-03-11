// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.simulations.inboundwiretransfers

import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class InboundWireTransferCreateParamsTest {

    @Test
    fun create() {
        InboundWireTransferCreateParams.builder()
            .accountNumberId("account_number_v18nkfqm6afpsrvy82b2")
            .amount(1000L)
            .beneficiaryAddressLine1("x")
            .beneficiaryAddressLine2("x")
            .beneficiaryAddressLine3("x")
            .beneficiaryName("x")
            .beneficiaryReference("x")
            .originatorAddressLine1("x")
            .originatorAddressLine2("x")
            .originatorAddressLine3("x")
            .originatorName("x")
            .originatorRoutingNumber("x")
            .originatorToBeneficiaryInformationLine1("x")
            .originatorToBeneficiaryInformationLine2("x")
            .originatorToBeneficiaryInformationLine3("x")
            .originatorToBeneficiaryInformationLine4("x")
            .senderReference("x")
            .build()
    }

    @Test
    fun body() {
        val params =
            InboundWireTransferCreateParams.builder()
                .accountNumberId("account_number_v18nkfqm6afpsrvy82b2")
                .amount(1000L)
                .beneficiaryAddressLine1("x")
                .beneficiaryAddressLine2("x")
                .beneficiaryAddressLine3("x")
                .beneficiaryName("x")
                .beneficiaryReference("x")
                .originatorAddressLine1("x")
                .originatorAddressLine2("x")
                .originatorAddressLine3("x")
                .originatorName("x")
                .originatorRoutingNumber("x")
                .originatorToBeneficiaryInformationLine1("x")
                .originatorToBeneficiaryInformationLine2("x")
                .originatorToBeneficiaryInformationLine3("x")
                .originatorToBeneficiaryInformationLine4("x")
                .senderReference("x")
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.accountNumberId()).isEqualTo("account_number_v18nkfqm6afpsrvy82b2")
        assertThat(body.amount()).isEqualTo(1000L)
        assertThat(body.beneficiaryAddressLine1()).contains("x")
        assertThat(body.beneficiaryAddressLine2()).contains("x")
        assertThat(body.beneficiaryAddressLine3()).contains("x")
        assertThat(body.beneficiaryName()).contains("x")
        assertThat(body.beneficiaryReference()).contains("x")
        assertThat(body.originatorAddressLine1()).contains("x")
        assertThat(body.originatorAddressLine2()).contains("x")
        assertThat(body.originatorAddressLine3()).contains("x")
        assertThat(body.originatorName()).contains("x")
        assertThat(body.originatorRoutingNumber()).contains("x")
        assertThat(body.originatorToBeneficiaryInformationLine1()).contains("x")
        assertThat(body.originatorToBeneficiaryInformationLine2()).contains("x")
        assertThat(body.originatorToBeneficiaryInformationLine3()).contains("x")
        assertThat(body.originatorToBeneficiaryInformationLine4()).contains("x")
        assertThat(body.senderReference()).contains("x")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            InboundWireTransferCreateParams.builder()
                .accountNumberId("account_number_v18nkfqm6afpsrvy82b2")
                .amount(1000L)
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.accountNumberId()).isEqualTo("account_number_v18nkfqm6afpsrvy82b2")
        assertThat(body.amount()).isEqualTo(1000L)
    }
}
