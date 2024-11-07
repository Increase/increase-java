// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.increase.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SimulationInboundWireTransferCreateParamsTest {

    @Test
    fun createSimulationInboundWireTransferCreateParams() {
        SimulationInboundWireTransferCreateParams.builder()
            .accountNumberId("account_number_id")
            .amount(123L)
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
    fun getBody() {
        val params =
            SimulationInboundWireTransferCreateParams.builder()
                .accountNumberId("account_number_id")
                .amount(123L)
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
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.accountNumberId()).isEqualTo("account_number_id")
        assertThat(body.amount()).isEqualTo(123L)
        assertThat(body.beneficiaryAddressLine1()).isEqualTo("x")
        assertThat(body.beneficiaryAddressLine2()).isEqualTo("x")
        assertThat(body.beneficiaryAddressLine3()).isEqualTo("x")
        assertThat(body.beneficiaryName()).isEqualTo("x")
        assertThat(body.beneficiaryReference()).isEqualTo("x")
        assertThat(body.originatorAddressLine1()).isEqualTo("x")
        assertThat(body.originatorAddressLine2()).isEqualTo("x")
        assertThat(body.originatorAddressLine3()).isEqualTo("x")
        assertThat(body.originatorName()).isEqualTo("x")
        assertThat(body.originatorRoutingNumber()).isEqualTo("x")
        assertThat(body.originatorToBeneficiaryInformationLine1()).isEqualTo("x")
        assertThat(body.originatorToBeneficiaryInformationLine2()).isEqualTo("x")
        assertThat(body.originatorToBeneficiaryInformationLine3()).isEqualTo("x")
        assertThat(body.originatorToBeneficiaryInformationLine4()).isEqualTo("x")
        assertThat(body.senderReference()).isEqualTo("x")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            SimulationInboundWireTransferCreateParams.builder()
                .accountNumberId("account_number_id")
                .amount(123L)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.accountNumberId()).isEqualTo("account_number_id")
        assertThat(body.amount()).isEqualTo(123L)
    }
}
