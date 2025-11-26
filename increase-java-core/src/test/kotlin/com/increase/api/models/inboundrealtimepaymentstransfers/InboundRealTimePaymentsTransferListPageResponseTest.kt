// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.inboundrealtimepaymentstransfers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.increase.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InboundRealTimePaymentsTransferListPageResponseTest {

    @Test
    fun create() {
        val inboundRealTimePaymentsTransferListPageResponse =
            InboundRealTimePaymentsTransferListPageResponse.builder()
                .addData(
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
                                    InboundRealTimePaymentsTransfer.Decline.Reason
                                        .ACCOUNT_NUMBER_CANCELED
                                )
                                .build()
                        )
                        .remittanceInformation("Invoice 29582")
                        .status(InboundRealTimePaymentsTransfer.Status.CONFIRMED)
                        .transactionIdentification("20220501234567891T1BSLZO01745013025")
                        .type(
                            InboundRealTimePaymentsTransfer.Type.INBOUND_REAL_TIME_PAYMENTS_TRANSFER
                        )
                        .build()
                )
                .nextCursor("v57w5d")
                .build()

        assertThat(inboundRealTimePaymentsTransferListPageResponse.data())
            .containsExactly(
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
                                InboundRealTimePaymentsTransfer.Decline.Reason
                                    .ACCOUNT_NUMBER_CANCELED
                            )
                            .build()
                    )
                    .remittanceInformation("Invoice 29582")
                    .status(InboundRealTimePaymentsTransfer.Status.CONFIRMED)
                    .transactionIdentification("20220501234567891T1BSLZO01745013025")
                    .type(InboundRealTimePaymentsTransfer.Type.INBOUND_REAL_TIME_PAYMENTS_TRANSFER)
                    .build()
            )
        assertThat(inboundRealTimePaymentsTransferListPageResponse.nextCursor()).contains("v57w5d")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val inboundRealTimePaymentsTransferListPageResponse =
            InboundRealTimePaymentsTransferListPageResponse.builder()
                .addData(
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
                                    InboundRealTimePaymentsTransfer.Decline.Reason
                                        .ACCOUNT_NUMBER_CANCELED
                                )
                                .build()
                        )
                        .remittanceInformation("Invoice 29582")
                        .status(InboundRealTimePaymentsTransfer.Status.CONFIRMED)
                        .transactionIdentification("20220501234567891T1BSLZO01745013025")
                        .type(
                            InboundRealTimePaymentsTransfer.Type.INBOUND_REAL_TIME_PAYMENTS_TRANSFER
                        )
                        .build()
                )
                .nextCursor("v57w5d")
                .build()

        val roundtrippedInboundRealTimePaymentsTransferListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(inboundRealTimePaymentsTransferListPageResponse),
                jacksonTypeRef<InboundRealTimePaymentsTransferListPageResponse>(),
            )

        assertThat(roundtrippedInboundRealTimePaymentsTransferListPageResponse)
            .isEqualTo(inboundRealTimePaymentsTransferListPageResponse)
    }
}
