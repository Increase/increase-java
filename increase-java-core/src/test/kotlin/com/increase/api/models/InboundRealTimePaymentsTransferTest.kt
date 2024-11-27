// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class InboundRealTimePaymentsTransferTest {

    @Test
    fun createInboundRealTimePaymentsTransfer() {
        val inboundRealTimePaymentsTransfer =
            InboundRealTimePaymentsTransfer.builder()
                .id("id")
                .accountId("account_id")
                .accountNumberId("account_number_id")
                .amount(0L)
                .confirmation(
                    InboundRealTimePaymentsTransfer.Confirmation.builder()
                        .confirmedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .transactionId("transaction_id")
                        .build()
                )
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .creditorName("creditor_name")
                .currency(InboundRealTimePaymentsTransfer.Currency.CAD)
                .debtorAccountNumber("debtor_account_number")
                .debtorName("debtor_name")
                .debtorRoutingNumber("debtor_routing_number")
                .decline(
                    InboundRealTimePaymentsTransfer.Decline.builder()
                        .declinedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .declinedTransactionId("declined_transaction_id")
                        .reason(
                            InboundRealTimePaymentsTransfer.Decline.Reason.ACCOUNT_NUMBER_CANCELED
                        )
                        .build()
                )
                .remittanceInformation("remittance_information")
                .status(InboundRealTimePaymentsTransfer.Status.PENDING_CONFIRMING)
                .transactionIdentification("transaction_identification")
                .type(InboundRealTimePaymentsTransfer.Type.INBOUND_REAL_TIME_PAYMENTS_TRANSFER)
                .build()
        assertThat(inboundRealTimePaymentsTransfer).isNotNull
        assertThat(inboundRealTimePaymentsTransfer.id()).isEqualTo("id")
        assertThat(inboundRealTimePaymentsTransfer.accountId()).isEqualTo("account_id")
        assertThat(inboundRealTimePaymentsTransfer.accountNumberId()).isEqualTo("account_number_id")
        assertThat(inboundRealTimePaymentsTransfer.amount()).isEqualTo(0L)
        assertThat(inboundRealTimePaymentsTransfer.confirmation())
            .contains(
                InboundRealTimePaymentsTransfer.Confirmation.builder()
                    .confirmedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .transactionId("transaction_id")
                    .build()
            )
        assertThat(inboundRealTimePaymentsTransfer.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(inboundRealTimePaymentsTransfer.creditorName()).isEqualTo("creditor_name")
        assertThat(inboundRealTimePaymentsTransfer.currency())
            .isEqualTo(InboundRealTimePaymentsTransfer.Currency.CAD)
        assertThat(inboundRealTimePaymentsTransfer.debtorAccountNumber())
            .isEqualTo("debtor_account_number")
        assertThat(inboundRealTimePaymentsTransfer.debtorName()).isEqualTo("debtor_name")
        assertThat(inboundRealTimePaymentsTransfer.debtorRoutingNumber())
            .isEqualTo("debtor_routing_number")
        assertThat(inboundRealTimePaymentsTransfer.decline())
            .contains(
                InboundRealTimePaymentsTransfer.Decline.builder()
                    .declinedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .declinedTransactionId("declined_transaction_id")
                    .reason(InboundRealTimePaymentsTransfer.Decline.Reason.ACCOUNT_NUMBER_CANCELED)
                    .build()
            )
        assertThat(inboundRealTimePaymentsTransfer.remittanceInformation())
            .contains("remittance_information")
        assertThat(inboundRealTimePaymentsTransfer.status())
            .isEqualTo(InboundRealTimePaymentsTransfer.Status.PENDING_CONFIRMING)
        assertThat(inboundRealTimePaymentsTransfer.transactionIdentification())
            .isEqualTo("transaction_identification")
        assertThat(inboundRealTimePaymentsTransfer.type())
            .isEqualTo(InboundRealTimePaymentsTransfer.Type.INBOUND_REAL_TIME_PAYMENTS_TRANSFER)
    }
}
