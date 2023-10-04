// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class InboundWireDrawdownRequestTest {

    @Test
    fun createInboundWireDrawdownRequest() {
        val inboundWireDrawdownRequest =
            InboundWireDrawdownRequest.builder()
                .id("string")
                .amount(123L)
                .beneficiaryAccountNumber("string")
                .beneficiaryAddressLine1("string")
                .beneficiaryAddressLine2("string")
                .beneficiaryAddressLine3("string")
                .beneficiaryName("string")
                .beneficiaryRoutingNumber("string")
                .currency("string")
                .messageToRecipient("string")
                .originatorAccountNumber("string")
                .originatorAddressLine1("string")
                .originatorAddressLine2("string")
                .originatorAddressLine3("string")
                .originatorName("string")
                .originatorRoutingNumber("string")
                .originatorToBeneficiaryInformationLine1("string")
                .originatorToBeneficiaryInformationLine2("string")
                .originatorToBeneficiaryInformationLine3("string")
                .originatorToBeneficiaryInformationLine4("string")
                .recipientAccountNumberId("string")
                .type(InboundWireDrawdownRequest.Type.INBOUND_WIRE_DRAWDOWN_REQUEST)
                .build()
        assertThat(inboundWireDrawdownRequest).isNotNull
        assertThat(inboundWireDrawdownRequest.id()).isEqualTo("string")
        assertThat(inboundWireDrawdownRequest.amount()).isEqualTo(123L)
        assertThat(inboundWireDrawdownRequest.beneficiaryAccountNumber()).isEqualTo("string")
        assertThat(inboundWireDrawdownRequest.beneficiaryAddressLine1()).contains("string")
        assertThat(inboundWireDrawdownRequest.beneficiaryAddressLine2()).contains("string")
        assertThat(inboundWireDrawdownRequest.beneficiaryAddressLine3()).contains("string")
        assertThat(inboundWireDrawdownRequest.beneficiaryName()).contains("string")
        assertThat(inboundWireDrawdownRequest.beneficiaryRoutingNumber()).isEqualTo("string")
        assertThat(inboundWireDrawdownRequest.currency()).isEqualTo("string")
        assertThat(inboundWireDrawdownRequest.messageToRecipient()).contains("string")
        assertThat(inboundWireDrawdownRequest.originatorAccountNumber()).isEqualTo("string")
        assertThat(inboundWireDrawdownRequest.originatorAddressLine1()).contains("string")
        assertThat(inboundWireDrawdownRequest.originatorAddressLine2()).contains("string")
        assertThat(inboundWireDrawdownRequest.originatorAddressLine3()).contains("string")
        assertThat(inboundWireDrawdownRequest.originatorName()).contains("string")
        assertThat(inboundWireDrawdownRequest.originatorRoutingNumber()).isEqualTo("string")
        assertThat(inboundWireDrawdownRequest.originatorToBeneficiaryInformationLine1())
            .contains("string")
        assertThat(inboundWireDrawdownRequest.originatorToBeneficiaryInformationLine2())
            .contains("string")
        assertThat(inboundWireDrawdownRequest.originatorToBeneficiaryInformationLine3())
            .contains("string")
        assertThat(inboundWireDrawdownRequest.originatorToBeneficiaryInformationLine4())
            .contains("string")
        assertThat(inboundWireDrawdownRequest.recipientAccountNumberId()).isEqualTo("string")
        assertThat(inboundWireDrawdownRequest.type())
            .isEqualTo(InboundWireDrawdownRequest.Type.INBOUND_WIRE_DRAWDOWN_REQUEST)
    }
}
