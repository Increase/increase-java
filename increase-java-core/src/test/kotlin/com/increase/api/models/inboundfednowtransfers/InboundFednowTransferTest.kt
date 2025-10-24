// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.inboundfednowtransfers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.increase.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InboundFednowTransferTest {

    @Test
    fun create() {
        val inboundFednowTransfer =
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

        assertThat(inboundFednowTransfer.id())
            .isEqualTo("inbound_fednow_transfer_ctxxbc07oh5ke5w1hk20")
        assertThat(inboundFednowTransfer.accountId()).isEqualTo("account_in71c4amph0vgo2qllky")
        assertThat(inboundFednowTransfer.accountNumberId())
            .isEqualTo("account_number_v18nkfqm6afpsrvy82b2")
        assertThat(inboundFednowTransfer.amount()).isEqualTo(100L)
        assertThat(inboundFednowTransfer.confirmation())
            .contains(
                InboundFednowTransfer.Confirmation.builder()
                    .transferId("inbound_fednow_transfer_ctxxbc07oh5ke5w1hk20")
                    .build()
            )
        assertThat(inboundFednowTransfer.createdAt())
            .isEqualTo(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
        assertThat(inboundFednowTransfer.creditorName()).isEqualTo("Ian Crease")
        assertThat(inboundFednowTransfer.currency()).isEqualTo(InboundFednowTransfer.Currency.USD)
        assertThat(inboundFednowTransfer.debtorAccountNumber()).isEqualTo("987654321")
        assertThat(inboundFednowTransfer.debtorName()).isEqualTo("National Phonograph Company")
        assertThat(inboundFednowTransfer.debtorRoutingNumber()).isEqualTo("101050001")
        assertThat(inboundFednowTransfer.decline())
            .contains(
                InboundFednowTransfer.Decline.builder()
                    .reason(InboundFednowTransfer.Decline.Reason.ACCOUNT_NUMBER_DISABLED)
                    .transferId("inbound_fednow_transfer_ctxxbc07oh5ke5w1hk20")
                    .build()
            )
        assertThat(inboundFednowTransfer.status()).isEqualTo(InboundFednowTransfer.Status.CONFIRMED)
        assertThat(inboundFednowTransfer.transactionId())
            .contains("transaction_uyrp7fld2ium70oa7oi")
        assertThat(inboundFednowTransfer.type())
            .isEqualTo(InboundFednowTransfer.Type.INBOUND_FEDNOW_TRANSFER)
        assertThat(inboundFednowTransfer.unstructuredRemittanceInformation())
            .contains("Invoice 29582")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val inboundFednowTransfer =
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

        val roundtrippedInboundFednowTransfer =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(inboundFednowTransfer),
                jacksonTypeRef<InboundFednowTransfer>(),
            )

        assertThat(roundtrippedInboundFednowTransfer).isEqualTo(inboundFednowTransfer)
    }
}
