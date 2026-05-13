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
                )
                .nextCursor("v57w5d")
                .build()

        assertThat(inboundWireTransferListPageResponse.data())
            .containsExactly(
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
