// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.inboundwiretransfers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.increase.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InboundWireTransferTest {

    @Test
    fun create() {
        val inboundWireTransfer =
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

        assertThat(inboundWireTransfer.id()).isEqualTo("inbound_wire_transfer_f228m6bmhtcxjco9pwp0")
        assertThat(inboundWireTransfer.acceptance())
            .contains(
                InboundWireTransfer.Acceptance.builder()
                    .acceptedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .transactionId("transaction_id")
                    .build()
            )
        assertThat(inboundWireTransfer.accountId()).isEqualTo("account_in71c4amph0vgo2qllky")
        assertThat(inboundWireTransfer.accountNumberId())
            .isEqualTo("account_number_v18nkfqm6afpsrvy82b2")
        assertThat(inboundWireTransfer.amount()).isEqualTo(100L)
        assertThat(inboundWireTransfer.createdAt())
            .isEqualTo(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
        assertThat(inboundWireTransfer.creditorAddressLine1()).isEmpty
        assertThat(inboundWireTransfer.creditorAddressLine2()).isEmpty
        assertThat(inboundWireTransfer.creditorAddressLine3()).isEmpty
        assertThat(inboundWireTransfer.creditorName()).isEmpty
        assertThat(inboundWireTransfer.debtorAddressLine1()).isEmpty
        assertThat(inboundWireTransfer.debtorAddressLine2()).isEmpty
        assertThat(inboundWireTransfer.debtorAddressLine3()).isEmpty
        assertThat(inboundWireTransfer.debtorName()).isEmpty
        assertThat(inboundWireTransfer.description()).isEqualTo("Inbound wire transfer")
        assertThat(inboundWireTransfer.endToEndIdentification()).isEmpty
        assertThat(inboundWireTransfer.inputMessageAccountabilityData()).isEmpty
        assertThat(inboundWireTransfer.instructingAgentRoutingNumber()).isEmpty
        assertThat(inboundWireTransfer.instructionIdentification()).isEmpty
        assertThat(inboundWireTransfer.reversal())
            .contains(
                InboundWireTransfer.Reversal.builder()
                    .reason(InboundWireTransfer.Reversal.Reason.DUPLICATE)
                    .reversedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(inboundWireTransfer.status()).isEqualTo(InboundWireTransfer.Status.ACCEPTED)
        assertThat(inboundWireTransfer.type())
            .isEqualTo(InboundWireTransfer.Type.INBOUND_WIRE_TRANSFER)
        assertThat(inboundWireTransfer.uniqueEndToEndTransactionReference()).isEmpty
        assertThat(inboundWireTransfer.unstructuredRemittanceInformation()).isEmpty
        assertThat(inboundWireTransfer.wireDrawdownRequestId()).isEmpty
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val inboundWireTransfer =
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

        val roundtrippedInboundWireTransfer =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(inboundWireTransfer),
                jacksonTypeRef<InboundWireTransfer>(),
            )

        assertThat(roundtrippedInboundWireTransfer).isEqualTo(inboundWireTransfer)
    }
}
