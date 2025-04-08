// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.inboundrealtimepaymentstransfers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.increase.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InboundRealTimePaymentsTransferTest {

    @Test
    fun create() {
        val inboundRealTimePaymentsTransfer =
            InboundRealTimePaymentsTransfer.builder()
                .id("inbound_real_time_payments_transfer_63hlz498vcxg644hcrzr")
                .accountId("account_in71c4amph0vgo2qllky")
                .accountNumberId("account_number_v18nkfqm6afpsrvy82b2")
                .amount(100L)
                .confirmation(
                    InboundRealTimePaymentsTransfer.Confirmation.builder()
                        .confirmedAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .transactionId("transaction_uyrp7fld2ium70oa7oi")
                        .build()
                )
                .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                .creditorName("Ian Crease")
                .currency(InboundRealTimePaymentsTransfer.Currency.USD)
                .debtorAccountNumber("987654321")
                .debtorName("National Phonograph Company")
                .debtorRoutingNumber("101050001")
                .decline(
                    InboundRealTimePaymentsTransfer.Decline.builder()
                        .declinedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .declinedTransactionId("declined_transaction_id")
                        .reason(
                            InboundRealTimePaymentsTransfer.Decline.Reason.ACCOUNT_NUMBER_CANCELED
                        )
                        .build()
                )
                .remittanceInformation("Invoice 29582")
                .status(InboundRealTimePaymentsTransfer.Status.CONFIRMED)
                .transactionIdentification("20220501234567891T1BSLZO01745013025")
                .type(InboundRealTimePaymentsTransfer.Type.INBOUND_REAL_TIME_PAYMENTS_TRANSFER)
                .build()

        assertThat(inboundRealTimePaymentsTransfer.id())
            .isEqualTo("inbound_real_time_payments_transfer_63hlz498vcxg644hcrzr")
        assertThat(inboundRealTimePaymentsTransfer.accountId())
            .isEqualTo("account_in71c4amph0vgo2qllky")
        assertThat(inboundRealTimePaymentsTransfer.accountNumberId())
            .isEqualTo("account_number_v18nkfqm6afpsrvy82b2")
        assertThat(inboundRealTimePaymentsTransfer.amount()).isEqualTo(100L)
        assertThat(inboundRealTimePaymentsTransfer.confirmation())
            .contains(
                InboundRealTimePaymentsTransfer.Confirmation.builder()
                    .confirmedAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                    .transactionId("transaction_uyrp7fld2ium70oa7oi")
                    .build()
            )
        assertThat(inboundRealTimePaymentsTransfer.createdAt())
            .isEqualTo(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
        assertThat(inboundRealTimePaymentsTransfer.creditorName()).isEqualTo("Ian Crease")
        assertThat(inboundRealTimePaymentsTransfer.currency())
            .isEqualTo(InboundRealTimePaymentsTransfer.Currency.USD)
        assertThat(inboundRealTimePaymentsTransfer.debtorAccountNumber()).isEqualTo("987654321")
        assertThat(inboundRealTimePaymentsTransfer.debtorName())
            .isEqualTo("National Phonograph Company")
        assertThat(inboundRealTimePaymentsTransfer.debtorRoutingNumber()).isEqualTo("101050001")
        assertThat(inboundRealTimePaymentsTransfer.decline())
            .contains(
                InboundRealTimePaymentsTransfer.Decline.builder()
                    .declinedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .declinedTransactionId("declined_transaction_id")
                    .reason(InboundRealTimePaymentsTransfer.Decline.Reason.ACCOUNT_NUMBER_CANCELED)
                    .build()
            )
        assertThat(inboundRealTimePaymentsTransfer.remittanceInformation())
            .contains("Invoice 29582")
        assertThat(inboundRealTimePaymentsTransfer.status())
            .isEqualTo(InboundRealTimePaymentsTransfer.Status.CONFIRMED)
        assertThat(inboundRealTimePaymentsTransfer.transactionIdentification())
            .isEqualTo("20220501234567891T1BSLZO01745013025")
        assertThat(inboundRealTimePaymentsTransfer.type())
            .isEqualTo(InboundRealTimePaymentsTransfer.Type.INBOUND_REAL_TIME_PAYMENTS_TRANSFER)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val inboundRealTimePaymentsTransfer =
            InboundRealTimePaymentsTransfer.builder()
                .id("inbound_real_time_payments_transfer_63hlz498vcxg644hcrzr")
                .accountId("account_in71c4amph0vgo2qllky")
                .accountNumberId("account_number_v18nkfqm6afpsrvy82b2")
                .amount(100L)
                .confirmation(
                    InboundRealTimePaymentsTransfer.Confirmation.builder()
                        .confirmedAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .transactionId("transaction_uyrp7fld2ium70oa7oi")
                        .build()
                )
                .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                .creditorName("Ian Crease")
                .currency(InboundRealTimePaymentsTransfer.Currency.USD)
                .debtorAccountNumber("987654321")
                .debtorName("National Phonograph Company")
                .debtorRoutingNumber("101050001")
                .decline(
                    InboundRealTimePaymentsTransfer.Decline.builder()
                        .declinedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .declinedTransactionId("declined_transaction_id")
                        .reason(
                            InboundRealTimePaymentsTransfer.Decline.Reason.ACCOUNT_NUMBER_CANCELED
                        )
                        .build()
                )
                .remittanceInformation("Invoice 29582")
                .status(InboundRealTimePaymentsTransfer.Status.CONFIRMED)
                .transactionIdentification("20220501234567891T1BSLZO01745013025")
                .type(InboundRealTimePaymentsTransfer.Type.INBOUND_REAL_TIME_PAYMENTS_TRANSFER)
                .build()

        val roundtrippedInboundRealTimePaymentsTransfer =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(inboundRealTimePaymentsTransfer),
                jacksonTypeRef<InboundRealTimePaymentsTransfer>(),
            )

        assertThat(roundtrippedInboundRealTimePaymentsTransfer)
            .isEqualTo(inboundRealTimePaymentsTransfer)
    }
}
