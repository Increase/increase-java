// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class InboundWireTransferTest {

    @Test
    fun createInboundWireTransfer() {
        val inboundWireTransfer =
            InboundWireTransfer.builder()
                .id("id")
                .accountId("account_id")
                .accountNumberId("account_number_id")
                .amount(123L)
                .beneficiaryAddressLine1("beneficiary_address_line1")
                .beneficiaryAddressLine2("beneficiary_address_line2")
                .beneficiaryAddressLine3("beneficiary_address_line3")
                .beneficiaryName("beneficiary_name")
                .beneficiaryReference("beneficiary_reference")
                .description("description")
                .inputMessageAccountabilityData("input_message_accountability_data")
                .originatorAddressLine1("originator_address_line1")
                .originatorAddressLine2("originator_address_line2")
                .originatorAddressLine3("originator_address_line3")
                .originatorName("originator_name")
                .originatorRoutingNumber("originator_routing_number")
                .originatorToBeneficiaryInformation("originator_to_beneficiary_information")
                .originatorToBeneficiaryInformationLine1(
                    "originator_to_beneficiary_information_line1"
                )
                .originatorToBeneficiaryInformationLine2(
                    "originator_to_beneficiary_information_line2"
                )
                .originatorToBeneficiaryInformationLine3(
                    "originator_to_beneficiary_information_line3"
                )
                .originatorToBeneficiaryInformationLine4(
                    "originator_to_beneficiary_information_line4"
                )
                .status(InboundWireTransfer.Status.PENDING)
                .type(InboundWireTransfer.Type.INBOUND_WIRE_TRANSFER)
                .build()
        assertThat(inboundWireTransfer).isNotNull
        assertThat(inboundWireTransfer.id()).isEqualTo("id")
        assertThat(inboundWireTransfer.accountId()).isEqualTo("account_id")
        assertThat(inboundWireTransfer.accountNumberId()).isEqualTo("account_number_id")
        assertThat(inboundWireTransfer.amount()).isEqualTo(123L)
        assertThat(inboundWireTransfer.beneficiaryAddressLine1())
            .contains("beneficiary_address_line1")
        assertThat(inboundWireTransfer.beneficiaryAddressLine2())
            .contains("beneficiary_address_line2")
        assertThat(inboundWireTransfer.beneficiaryAddressLine3())
            .contains("beneficiary_address_line3")
        assertThat(inboundWireTransfer.beneficiaryName()).contains("beneficiary_name")
        assertThat(inboundWireTransfer.beneficiaryReference()).contains("beneficiary_reference")
        assertThat(inboundWireTransfer.description()).isEqualTo("description")
        assertThat(inboundWireTransfer.inputMessageAccountabilityData())
            .contains("input_message_accountability_data")
        assertThat(inboundWireTransfer.originatorAddressLine1())
            .contains("originator_address_line1")
        assertThat(inboundWireTransfer.originatorAddressLine2())
            .contains("originator_address_line2")
        assertThat(inboundWireTransfer.originatorAddressLine3())
            .contains("originator_address_line3")
        assertThat(inboundWireTransfer.originatorName()).contains("originator_name")
        assertThat(inboundWireTransfer.originatorRoutingNumber())
            .contains("originator_routing_number")
        assertThat(inboundWireTransfer.originatorToBeneficiaryInformation())
            .contains("originator_to_beneficiary_information")
        assertThat(inboundWireTransfer.originatorToBeneficiaryInformationLine1())
            .contains("originator_to_beneficiary_information_line1")
        assertThat(inboundWireTransfer.originatorToBeneficiaryInformationLine2())
            .contains("originator_to_beneficiary_information_line2")
        assertThat(inboundWireTransfer.originatorToBeneficiaryInformationLine3())
            .contains("originator_to_beneficiary_information_line3")
        assertThat(inboundWireTransfer.originatorToBeneficiaryInformationLine4())
            .contains("originator_to_beneficiary_information_line4")
        assertThat(inboundWireTransfer.status()).isEqualTo(InboundWireTransfer.Status.PENDING)
        assertThat(inboundWireTransfer.type())
            .isEqualTo(InboundWireTransfer.Type.INBOUND_WIRE_TRANSFER)
    }
}
