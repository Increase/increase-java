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
                        .acceptedAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .transactionId("transaction_uyrp7fld2ium70oa7oi")
                        .build()
                )
                .accountId("account_in71c4amph0vgo2qllky")
                .accountNumberId("account_number_v18nkfqm6afpsrvy82b2")
                .amount(100L)
                .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                .creditorAddressLine1("33 Liberty Street")
                .creditorAddressLine2("New York, NY, 10045")
                .creditorAddressLine3(null)
                .creditorName("National Phonograph Company")
                .debtorAddressLine1("33 Liberty Street")
                .debtorAddressLine2("New York, NY, 10045")
                .debtorAddressLine3(null)
                .debtorName("Ian Crease")
                .description("Inbound wire transfer")
                .endToEndIdentification("Invoice 29582")
                .inputMessageAccountabilityData("20220118MMQFMP0P000001")
                .instructingAgentRoutingNumber("101050001")
                .instructionIdentification("202201180000001")
                .purpose("CASH")
                .reversal(
                    InboundWireTransfer.Reversal.builder()
                        .reason(InboundWireTransfer.Reversal.Reason.DUPLICATE)
                        .reversedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .status(InboundWireTransfer.Status.ACCEPTED)
                .type(InboundWireTransfer.Type.INBOUND_WIRE_TRANSFER)
                .uniqueEndToEndTransactionReference("9a21e10a-7600-4a24-8ff3-2cbc5943c27a")
                .unstructuredRemittanceInformation("INVOICE 2468")
                .wireDrawdownRequestId(null)
                .build()

        assertThat(inboundWireTransfer.id()).isEqualTo("inbound_wire_transfer_f228m6bmhtcxjco9pwp0")
        assertThat(inboundWireTransfer.acceptance())
            .contains(
                InboundWireTransfer.Acceptance.builder()
                    .acceptedAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                    .transactionId("transaction_uyrp7fld2ium70oa7oi")
                    .build()
            )
        assertThat(inboundWireTransfer.accountId()).isEqualTo("account_in71c4amph0vgo2qllky")
        assertThat(inboundWireTransfer.accountNumberId())
            .isEqualTo("account_number_v18nkfqm6afpsrvy82b2")
        assertThat(inboundWireTransfer.amount()).isEqualTo(100L)
        assertThat(inboundWireTransfer.createdAt())
            .isEqualTo(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
        assertThat(inboundWireTransfer.creditorAddressLine1()).contains("33 Liberty Street")
        assertThat(inboundWireTransfer.creditorAddressLine2()).contains("New York, NY, 10045")
        assertThat(inboundWireTransfer.creditorAddressLine3()).isEmpty
        assertThat(inboundWireTransfer.creditorName()).contains("National Phonograph Company")
        assertThat(inboundWireTransfer.debtorAddressLine1()).contains("33 Liberty Street")
        assertThat(inboundWireTransfer.debtorAddressLine2()).contains("New York, NY, 10045")
        assertThat(inboundWireTransfer.debtorAddressLine3()).isEmpty
        assertThat(inboundWireTransfer.debtorName()).contains("Ian Crease")
        assertThat(inboundWireTransfer.description()).isEqualTo("Inbound wire transfer")
        assertThat(inboundWireTransfer.endToEndIdentification()).contains("Invoice 29582")
        assertThat(inboundWireTransfer.inputMessageAccountabilityData())
            .contains("20220118MMQFMP0P000001")
        assertThat(inboundWireTransfer.instructingAgentRoutingNumber()).contains("101050001")
        assertThat(inboundWireTransfer.instructionIdentification()).contains("202201180000001")
        assertThat(inboundWireTransfer.purpose()).contains("CASH")
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
        assertThat(inboundWireTransfer.uniqueEndToEndTransactionReference())
            .contains("9a21e10a-7600-4a24-8ff3-2cbc5943c27a")
        assertThat(inboundWireTransfer.unstructuredRemittanceInformation()).contains("INVOICE 2468")
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
                        .acceptedAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .transactionId("transaction_uyrp7fld2ium70oa7oi")
                        .build()
                )
                .accountId("account_in71c4amph0vgo2qllky")
                .accountNumberId("account_number_v18nkfqm6afpsrvy82b2")
                .amount(100L)
                .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                .creditorAddressLine1("33 Liberty Street")
                .creditorAddressLine2("New York, NY, 10045")
                .creditorAddressLine3(null)
                .creditorName("National Phonograph Company")
                .debtorAddressLine1("33 Liberty Street")
                .debtorAddressLine2("New York, NY, 10045")
                .debtorAddressLine3(null)
                .debtorName("Ian Crease")
                .description("Inbound wire transfer")
                .endToEndIdentification("Invoice 29582")
                .inputMessageAccountabilityData("20220118MMQFMP0P000001")
                .instructingAgentRoutingNumber("101050001")
                .instructionIdentification("202201180000001")
                .purpose("CASH")
                .reversal(
                    InboundWireTransfer.Reversal.builder()
                        .reason(InboundWireTransfer.Reversal.Reason.DUPLICATE)
                        .reversedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .status(InboundWireTransfer.Status.ACCEPTED)
                .type(InboundWireTransfer.Type.INBOUND_WIRE_TRANSFER)
                .uniqueEndToEndTransactionReference("9a21e10a-7600-4a24-8ff3-2cbc5943c27a")
                .unstructuredRemittanceInformation("INVOICE 2468")
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
