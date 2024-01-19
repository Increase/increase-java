// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class InboundWireTransferTest {

    @Test
    fun createInboundWireTransfer() {
        val inboundWireTransfer =
            InboundWireTransfer.builder()
                .id("string")
                .amount(123L)
                .beneficiaryAddressLine1("string")
                .beneficiaryAddressLine2("string")
                .beneficiaryAddressLine3("string")
                .beneficiaryName("string")
                .beneficiaryReference("string")
                .description("string")
                .inputMessageAccountabilityData("string")
                .originatorAddressLine1("string")
                .originatorAddressLine2("string")
                .originatorAddressLine3("string")
                .originatorName("string")
                .originatorRoutingNumber("string")
                .originatorToBeneficiaryInformation("string")
                .originatorToBeneficiaryInformationLine1("string")
                .originatorToBeneficiaryInformationLine2("string")
                .originatorToBeneficiaryInformationLine3("string")
                .originatorToBeneficiaryInformationLine4("string")
                .transferId("string")
                .type(InboundWireTransfer.Type.INBOUND_WIRE_TRANSFER)
                .build()
        assertThat(inboundWireTransfer).isNotNull
        assertThat(inboundWireTransfer.id()).isEqualTo("string")
        assertThat(inboundWireTransfer.amount()).isEqualTo(123L)
        assertThat(inboundWireTransfer.beneficiaryAddressLine1()).contains("string")
        assertThat(inboundWireTransfer.beneficiaryAddressLine2()).contains("string")
        assertThat(inboundWireTransfer.beneficiaryAddressLine3()).contains("string")
        assertThat(inboundWireTransfer.beneficiaryName()).contains("string")
        assertThat(inboundWireTransfer.beneficiaryReference()).contains("string")
        assertThat(inboundWireTransfer.description()).isEqualTo("string")
        assertThat(inboundWireTransfer.inputMessageAccountabilityData()).contains("string")
        assertThat(inboundWireTransfer.originatorAddressLine1()).contains("string")
        assertThat(inboundWireTransfer.originatorAddressLine2()).contains("string")
        assertThat(inboundWireTransfer.originatorAddressLine3()).contains("string")
        assertThat(inboundWireTransfer.originatorName()).contains("string")
        assertThat(inboundWireTransfer.originatorRoutingNumber()).contains("string")
        assertThat(inboundWireTransfer.originatorToBeneficiaryInformation()).contains("string")
        assertThat(inboundWireTransfer.originatorToBeneficiaryInformationLine1()).contains("string")
        assertThat(inboundWireTransfer.originatorToBeneficiaryInformationLine2()).contains("string")
        assertThat(inboundWireTransfer.originatorToBeneficiaryInformationLine3()).contains("string")
        assertThat(inboundWireTransfer.originatorToBeneficiaryInformationLine4()).contains("string")
        assertThat(inboundWireTransfer.transferId()).isEqualTo("string")
        assertThat(inboundWireTransfer.type())
            .isEqualTo(InboundWireTransfer.Type.INBOUND_WIRE_TRANSFER)
    }
}
