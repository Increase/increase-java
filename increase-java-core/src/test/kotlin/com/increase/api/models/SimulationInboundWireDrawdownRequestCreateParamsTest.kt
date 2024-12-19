// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SimulationInboundWireDrawdownRequestCreateParamsTest {

    @Test
    fun createSimulationInboundWireDrawdownRequestCreateParams() {
        SimulationInboundWireDrawdownRequestCreateParams.builder()
            .amount(10000L)
            .beneficiaryAccountNumber("987654321")
            .beneficiaryRoutingNumber("101050001")
            .currency("USD")
            .messageToRecipient("Invoice 29582")
            .originatorAccountNumber("987654321")
            .originatorRoutingNumber("101050001")
            .recipientAccountNumberId("account_number_v18nkfqm6afpsrvy82b2")
            .beneficiaryAddressLine1("33 Liberty Street")
            .beneficiaryAddressLine2("New York, NY, 10045")
            .beneficiaryAddressLine3("x")
            .beneficiaryName("Ian Crease")
            .originatorAddressLine1("33 Liberty Street")
            .originatorAddressLine2("New York, NY, 10045")
            .originatorAddressLine3("x")
            .originatorName("Ian Crease")
            .originatorToBeneficiaryInformationLine1("x")
            .originatorToBeneficiaryInformationLine2("x")
            .originatorToBeneficiaryInformationLine3("x")
            .originatorToBeneficiaryInformationLine4("x")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            SimulationInboundWireDrawdownRequestCreateParams.builder()
                .amount(10000L)
                .beneficiaryAccountNumber("987654321")
                .beneficiaryRoutingNumber("101050001")
                .currency("USD")
                .messageToRecipient("Invoice 29582")
                .originatorAccountNumber("987654321")
                .originatorRoutingNumber("101050001")
                .recipientAccountNumberId("account_number_v18nkfqm6afpsrvy82b2")
                .beneficiaryAddressLine1("33 Liberty Street")
                .beneficiaryAddressLine2("New York, NY, 10045")
                .beneficiaryAddressLine3("x")
                .beneficiaryName("Ian Crease")
                .originatorAddressLine1("33 Liberty Street")
                .originatorAddressLine2("New York, NY, 10045")
                .originatorAddressLine3("x")
                .originatorName("Ian Crease")
                .originatorToBeneficiaryInformationLine1("x")
                .originatorToBeneficiaryInformationLine2("x")
                .originatorToBeneficiaryInformationLine3("x")
                .originatorToBeneficiaryInformationLine4("x")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.amount()).isEqualTo(10000L)
        assertThat(body.beneficiaryAccountNumber()).isEqualTo("987654321")
        assertThat(body.beneficiaryRoutingNumber()).isEqualTo("101050001")
        assertThat(body.currency()).isEqualTo("USD")
        assertThat(body.messageToRecipient()).isEqualTo("Invoice 29582")
        assertThat(body.originatorAccountNumber()).isEqualTo("987654321")
        assertThat(body.originatorRoutingNumber()).isEqualTo("101050001")
        assertThat(body.recipientAccountNumberId()).isEqualTo("account_number_v18nkfqm6afpsrvy82b2")
        assertThat(body.beneficiaryAddressLine1()).isEqualTo("33 Liberty Street")
        assertThat(body.beneficiaryAddressLine2()).isEqualTo("New York, NY, 10045")
        assertThat(body.beneficiaryAddressLine3()).isEqualTo("x")
        assertThat(body.beneficiaryName()).isEqualTo("Ian Crease")
        assertThat(body.originatorAddressLine1()).isEqualTo("33 Liberty Street")
        assertThat(body.originatorAddressLine2()).isEqualTo("New York, NY, 10045")
        assertThat(body.originatorAddressLine3()).isEqualTo("x")
        assertThat(body.originatorName()).isEqualTo("Ian Crease")
        assertThat(body.originatorToBeneficiaryInformationLine1()).isEqualTo("x")
        assertThat(body.originatorToBeneficiaryInformationLine2()).isEqualTo("x")
        assertThat(body.originatorToBeneficiaryInformationLine3()).isEqualTo("x")
        assertThat(body.originatorToBeneficiaryInformationLine4()).isEqualTo("x")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            SimulationInboundWireDrawdownRequestCreateParams.builder()
                .amount(10000L)
                .beneficiaryAccountNumber("987654321")
                .beneficiaryRoutingNumber("101050001")
                .currency("USD")
                .messageToRecipient("Invoice 29582")
                .originatorAccountNumber("987654321")
                .originatorRoutingNumber("101050001")
                .recipientAccountNumberId("account_number_v18nkfqm6afpsrvy82b2")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.amount()).isEqualTo(10000L)
        assertThat(body.beneficiaryAccountNumber()).isEqualTo("987654321")
        assertThat(body.beneficiaryRoutingNumber()).isEqualTo("101050001")
        assertThat(body.currency()).isEqualTo("USD")
        assertThat(body.messageToRecipient()).isEqualTo("Invoice 29582")
        assertThat(body.originatorAccountNumber()).isEqualTo("987654321")
        assertThat(body.originatorRoutingNumber()).isEqualTo("101050001")
        assertThat(body.recipientAccountNumberId()).isEqualTo("account_number_v18nkfqm6afpsrvy82b2")
    }
}
