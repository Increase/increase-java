// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.inboundfednowtransfers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.increase.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InboundFednowTransferListPageResponseTest {

    @Test
    fun create() {
        val inboundFednowTransferListPageResponse =
            InboundFednowTransferListPageResponse.builder()
                .addData(
                    InboundFednowTransfer.builder()
                        .id("inbound_fednow_transfer_ctxxbc07oh5ke5w1hk20")
                        .accountId("account_in71c4amph0vgo2qllky")
                        .accountNumberId("account_number_v18nkfqm6afpsrvy82b2")
                        .amount(100L)
                        .confirmation(
                            InboundFednowTransfer.Confirmation.builder()
                                .transferId("inbound_fednow_transfer_ctxxbc07oh5ke5w1hk20")
                                .build()
                        )
                        .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .creditorName("Ian Crease")
                        .currency(InboundFednowTransfer.Currency.USD)
                        .debtorAccountNumber("987654321")
                        .debtorName("National Phonograph Company")
                        .debtorRoutingNumber("101050001")
                        .decline(
                            InboundFednowTransfer.Decline.builder()
                                .reason(
                                    InboundFednowTransfer.Decline.Reason.ACCOUNT_NUMBER_DISABLED
                                )
                                .transferId("inbound_fednow_transfer_ctxxbc07oh5ke5w1hk20")
                                .build()
                        )
                        .status(InboundFednowTransfer.Status.CONFIRMED)
                        .transactionId("transaction_uyrp7fld2ium70oa7oi")
                        .type(InboundFednowTransfer.Type.INBOUND_FEDNOW_TRANSFER)
                        .unstructuredRemittanceInformation("Invoice 29582")
                        .build()
                )
                .nextCursor("v57w5d")
                .build()

        assertThat(inboundFednowTransferListPageResponse.data())
            .containsExactly(
                InboundFednowTransfer.builder()
                    .id("inbound_fednow_transfer_ctxxbc07oh5ke5w1hk20")
                    .accountId("account_in71c4amph0vgo2qllky")
                    .accountNumberId("account_number_v18nkfqm6afpsrvy82b2")
                    .amount(100L)
                    .confirmation(
                        InboundFednowTransfer.Confirmation.builder()
                            .transferId("inbound_fednow_transfer_ctxxbc07oh5ke5w1hk20")
                            .build()
                    )
                    .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                    .creditorName("Ian Crease")
                    .currency(InboundFednowTransfer.Currency.USD)
                    .debtorAccountNumber("987654321")
                    .debtorName("National Phonograph Company")
                    .debtorRoutingNumber("101050001")
                    .decline(
                        InboundFednowTransfer.Decline.builder()
                            .reason(InboundFednowTransfer.Decline.Reason.ACCOUNT_NUMBER_DISABLED)
                            .transferId("inbound_fednow_transfer_ctxxbc07oh5ke5w1hk20")
                            .build()
                    )
                    .status(InboundFednowTransfer.Status.CONFIRMED)
                    .transactionId("transaction_uyrp7fld2ium70oa7oi")
                    .type(InboundFednowTransfer.Type.INBOUND_FEDNOW_TRANSFER)
                    .unstructuredRemittanceInformation("Invoice 29582")
                    .build()
            )
        assertThat(inboundFednowTransferListPageResponse.nextCursor()).contains("v57w5d")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val inboundFednowTransferListPageResponse =
            InboundFednowTransferListPageResponse.builder()
                .addData(
                    InboundFednowTransfer.builder()
                        .id("inbound_fednow_transfer_ctxxbc07oh5ke5w1hk20")
                        .accountId("account_in71c4amph0vgo2qllky")
                        .accountNumberId("account_number_v18nkfqm6afpsrvy82b2")
                        .amount(100L)
                        .confirmation(
                            InboundFednowTransfer.Confirmation.builder()
                                .transferId("inbound_fednow_transfer_ctxxbc07oh5ke5w1hk20")
                                .build()
                        )
                        .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .creditorName("Ian Crease")
                        .currency(InboundFednowTransfer.Currency.USD)
                        .debtorAccountNumber("987654321")
                        .debtorName("National Phonograph Company")
                        .debtorRoutingNumber("101050001")
                        .decline(
                            InboundFednowTransfer.Decline.builder()
                                .reason(
                                    InboundFednowTransfer.Decline.Reason.ACCOUNT_NUMBER_DISABLED
                                )
                                .transferId("inbound_fednow_transfer_ctxxbc07oh5ke5w1hk20")
                                .build()
                        )
                        .status(InboundFednowTransfer.Status.CONFIRMED)
                        .transactionId("transaction_uyrp7fld2ium70oa7oi")
                        .type(InboundFednowTransfer.Type.INBOUND_FEDNOW_TRANSFER)
                        .unstructuredRemittanceInformation("Invoice 29582")
                        .build()
                )
                .nextCursor("v57w5d")
                .build()

        val roundtrippedInboundFednowTransferListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(inboundFednowTransferListPageResponse),
                jacksonTypeRef<InboundFednowTransferListPageResponse>(),
            )

        assertThat(roundtrippedInboundFednowTransferListPageResponse)
            .isEqualTo(inboundFednowTransferListPageResponse)
    }
}
