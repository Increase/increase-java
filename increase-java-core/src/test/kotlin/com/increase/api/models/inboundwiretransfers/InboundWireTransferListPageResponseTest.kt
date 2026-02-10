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
                        .acceptance(
                            InboundWireTransfer.Acceptance.builder()
                                .acceptedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .transactionId("transaction_id")
                                .build()
                        )
                        .accountId("account_in71c4amph0vgo2qllky")
                        .accountNumberId("account_number_v18nkfqm6afpsrvy82b2")
                        .amount(100L)
                        .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .creditorAddressLine1(null)
                        .creditorAddressLine2(null)
                        .creditorAddressLine3(null)
                        .creditorName(null)
                        .debtorAddressLine1(null)
                        .debtorAddressLine2(null)
                        .debtorAddressLine3(null)
                        .debtorName(null)
                        .description("Inbound wire transfer")
                        .endToEndIdentification(null)
                        .inputMessageAccountabilityData(null)
                        .instructingAgentRoutingNumber(null)
                        .instructionIdentification(null)
                        .reversal(
                            InboundWireTransfer.Reversal.builder()
                                .reason(InboundWireTransfer.Reversal.Reason.DUPLICATE)
                                .reversedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .build()
                        )
                        .status(InboundWireTransfer.Status.ACCEPTED)
                        .type(InboundWireTransfer.Type.INBOUND_WIRE_TRANSFER)
                        .uniqueEndToEndTransactionReference(null)
                        .unstructuredRemittanceInformation(null)
                        .wireDrawdownRequestId(null)
                        .build()
                )
                .nextCursor("v57w5d")
                .build()

        assertThat(inboundWireTransferListPageResponse.data())
            .containsExactly(
                InboundWireTransfer.builder()
                    .id("inbound_wire_transfer_f228m6bmhtcxjco9pwp0")
                    .acceptance(
                        InboundWireTransfer.Acceptance.builder()
                            .acceptedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .transactionId("transaction_id")
                            .build()
                    )
                    .accountId("account_in71c4amph0vgo2qllky")
                    .accountNumberId("account_number_v18nkfqm6afpsrvy82b2")
                    .amount(100L)
                    .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                    .creditorAddressLine1(null)
                    .creditorAddressLine2(null)
                    .creditorAddressLine3(null)
                    .creditorName(null)
                    .debtorAddressLine1(null)
                    .debtorAddressLine2(null)
                    .debtorAddressLine3(null)
                    .debtorName(null)
                    .description("Inbound wire transfer")
                    .endToEndIdentification(null)
                    .inputMessageAccountabilityData(null)
                    .instructingAgentRoutingNumber(null)
                    .instructionIdentification(null)
                    .reversal(
                        InboundWireTransfer.Reversal.builder()
                            .reason(InboundWireTransfer.Reversal.Reason.DUPLICATE)
                            .reversedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .status(InboundWireTransfer.Status.ACCEPTED)
                    .type(InboundWireTransfer.Type.INBOUND_WIRE_TRANSFER)
                    .uniqueEndToEndTransactionReference(null)
                    .unstructuredRemittanceInformation(null)
                    .wireDrawdownRequestId(null)
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
                        .acceptance(
                            InboundWireTransfer.Acceptance.builder()
                                .acceptedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .transactionId("transaction_id")
                                .build()
                        )
                        .accountId("account_in71c4amph0vgo2qllky")
                        .accountNumberId("account_number_v18nkfqm6afpsrvy82b2")
                        .amount(100L)
                        .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .creditorAddressLine1(null)
                        .creditorAddressLine2(null)
                        .creditorAddressLine3(null)
                        .creditorName(null)
                        .debtorAddressLine1(null)
                        .debtorAddressLine2(null)
                        .debtorAddressLine3(null)
                        .debtorName(null)
                        .description("Inbound wire transfer")
                        .endToEndIdentification(null)
                        .inputMessageAccountabilityData(null)
                        .instructingAgentRoutingNumber(null)
                        .instructionIdentification(null)
                        .reversal(
                            InboundWireTransfer.Reversal.builder()
                                .reason(InboundWireTransfer.Reversal.Reason.DUPLICATE)
                                .reversedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .build()
                        )
                        .status(InboundWireTransfer.Status.ACCEPTED)
                        .type(InboundWireTransfer.Type.INBOUND_WIRE_TRANSFER)
                        .uniqueEndToEndTransactionReference(null)
                        .unstructuredRemittanceInformation(null)
                        .wireDrawdownRequestId(null)
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
