// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.inboundwiretransfers

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class InboundWireTransferTest {

    @Test
    fun createInboundWireTransfer() {
        val inboundWireTransfer =
            InboundWireTransfer.builder()
                .id("inbound_wire_transfer_f228m6bmhtcxjco9pwp0")
                .accountId("account_in71c4amph0vgo2qllky")
                .accountNumberId("account_number_v18nkfqm6afpsrvy82b2")
                .amount(100L)
                .beneficiaryAddressLine1(null)
                .beneficiaryAddressLine2(null)
                .beneficiaryAddressLine3(null)
                .beneficiaryName(null)
                .beneficiaryReference(null)
                .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                .description("Inbound wire transfer")
                .inputMessageAccountabilityData(null)
                .originatorAddressLine1(null)
                .originatorAddressLine2(null)
                .originatorAddressLine3(null)
                .originatorName(null)
                .originatorRoutingNumber(null)
                .originatorToBeneficiaryInformation(null)
                .originatorToBeneficiaryInformationLine1(null)
                .originatorToBeneficiaryInformationLine2(null)
                .originatorToBeneficiaryInformationLine3(null)
                .originatorToBeneficiaryInformationLine4(null)
                .senderReference(null)
                .status(InboundWireTransfer.Status.PENDING)
                .type(InboundWireTransfer.Type.INBOUND_WIRE_TRANSFER)
                .build()
        assertThat(inboundWireTransfer).isNotNull
        assertThat(inboundWireTransfer.id()).isEqualTo("inbound_wire_transfer_f228m6bmhtcxjco9pwp0")
        assertThat(inboundWireTransfer.accountId()).isEqualTo("account_in71c4amph0vgo2qllky")
        assertThat(inboundWireTransfer.accountNumberId())
            .isEqualTo("account_number_v18nkfqm6afpsrvy82b2")
        assertThat(inboundWireTransfer.amount()).isEqualTo(100L)
        assertThat(inboundWireTransfer.beneficiaryAddressLine1()).isEmpty
        assertThat(inboundWireTransfer.beneficiaryAddressLine2()).isEmpty
        assertThat(inboundWireTransfer.beneficiaryAddressLine3()).isEmpty
        assertThat(inboundWireTransfer.beneficiaryName()).isEmpty
        assertThat(inboundWireTransfer.beneficiaryReference()).isEmpty
        assertThat(inboundWireTransfer.createdAt())
            .isEqualTo(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
        assertThat(inboundWireTransfer.description()).isEqualTo("Inbound wire transfer")
        assertThat(inboundWireTransfer.inputMessageAccountabilityData()).isEmpty
        assertThat(inboundWireTransfer.originatorAddressLine1()).isEmpty
        assertThat(inboundWireTransfer.originatorAddressLine2()).isEmpty
        assertThat(inboundWireTransfer.originatorAddressLine3()).isEmpty
        assertThat(inboundWireTransfer.originatorName()).isEmpty
        assertThat(inboundWireTransfer.originatorRoutingNumber()).isEmpty
        assertThat(inboundWireTransfer.originatorToBeneficiaryInformation()).isEmpty
        assertThat(inboundWireTransfer.originatorToBeneficiaryInformationLine1()).isEmpty
        assertThat(inboundWireTransfer.originatorToBeneficiaryInformationLine2()).isEmpty
        assertThat(inboundWireTransfer.originatorToBeneficiaryInformationLine3()).isEmpty
        assertThat(inboundWireTransfer.originatorToBeneficiaryInformationLine4()).isEmpty
        assertThat(inboundWireTransfer.senderReference()).isEmpty
        assertThat(inboundWireTransfer.status()).isEqualTo(InboundWireTransfer.Status.PENDING)
        assertThat(inboundWireTransfer.type())
            .isEqualTo(InboundWireTransfer.Type.INBOUND_WIRE_TRANSFER)
    }
}
