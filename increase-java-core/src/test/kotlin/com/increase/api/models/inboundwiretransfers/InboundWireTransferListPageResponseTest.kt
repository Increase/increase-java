// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.inboundwiretransfers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.increase.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InboundWireTransferListPageResponseTest {

    @Test
    fun create() {
        val inboundWireTransferListPageResponse =
            InboundWireTransferListPageResponse.builder()
                .addData(
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
                        .status(InboundWireTransfer.Status.ACCEPTED)
                        .type(InboundWireTransfer.Type.INBOUND_WIRE_TRANSFER)
                        .build()
                )
                .nextCursor("v57w5d")
                .build()

        assertThat(inboundWireTransferListPageResponse.data())
            .containsExactly(
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
                    .status(InboundWireTransfer.Status.ACCEPTED)
                    .type(InboundWireTransfer.Type.INBOUND_WIRE_TRANSFER)
                    .build()
            )
        assertThat(inboundWireTransferListPageResponse.nextCursor()).contains("v57w5d")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val inboundWireTransferListPageResponse =
            InboundWireTransferListPageResponse.builder()
                .addData(
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
                        .status(InboundWireTransfer.Status.ACCEPTED)
                        .type(InboundWireTransfer.Type.INBOUND_WIRE_TRANSFER)
                        .build()
                )
                .nextCursor("v57w5d")
                .build()

        val roundtrippedInboundWireTransferListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(inboundWireTransferListPageResponse),
                jacksonTypeRef<InboundWireTransferListPageResponse>(),
            )

        assertThat(roundtrippedInboundWireTransferListPageResponse)
            .isEqualTo(inboundWireTransferListPageResponse)
    }
}
