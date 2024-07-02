// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class InboundCheckDepositTest {

    @Test
    fun createInboundCheckDeposit() {
        val inboundCheckDeposit =
            InboundCheckDeposit.builder()
                .id("string")
                .acceptedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .accountId("string")
                .accountNumberId("string")
                .amount(123L)
                .backImageFileId("string")
                .bankOfFirstDepositRoutingNumber("string")
                .checkNumber("string")
                .checkTransferId("string")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currency(InboundCheckDeposit.Currency.CAD)
                .declinedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .declinedTransactionId("string")
                .depositReturn(
                    InboundCheckDeposit.DepositReturn.builder()
                        .returnedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .transactionId("string")
                        .build()
                )
                .frontImageFileId("string")
                .status(InboundCheckDeposit.Status.PENDING)
                .transactionId("string")
                .type(InboundCheckDeposit.Type.INBOUND_CHECK_DEPOSIT)
                .build()
        assertThat(inboundCheckDeposit).isNotNull
        assertThat(inboundCheckDeposit.id()).isEqualTo("string")
        assertThat(inboundCheckDeposit.acceptedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(inboundCheckDeposit.accountId()).isEqualTo("string")
        assertThat(inboundCheckDeposit.accountNumberId()).contains("string")
        assertThat(inboundCheckDeposit.amount()).isEqualTo(123L)
        assertThat(inboundCheckDeposit.backImageFileId()).contains("string")
        assertThat(inboundCheckDeposit.bankOfFirstDepositRoutingNumber()).contains("string")
        assertThat(inboundCheckDeposit.checkNumber()).contains("string")
        assertThat(inboundCheckDeposit.checkTransferId()).contains("string")
        assertThat(inboundCheckDeposit.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(inboundCheckDeposit.currency()).isEqualTo(InboundCheckDeposit.Currency.CAD)
        assertThat(inboundCheckDeposit.declinedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(inboundCheckDeposit.declinedTransactionId()).contains("string")
        assertThat(inboundCheckDeposit.depositReturn())
            .contains(
                InboundCheckDeposit.DepositReturn.builder()
                    .returnedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .transactionId("string")
                    .build()
            )
        assertThat(inboundCheckDeposit.frontImageFileId()).contains("string")
        assertThat(inboundCheckDeposit.status()).isEqualTo(InboundCheckDeposit.Status.PENDING)
        assertThat(inboundCheckDeposit.transactionId()).contains("string")
        assertThat(inboundCheckDeposit.type())
            .isEqualTo(InboundCheckDeposit.Type.INBOUND_CHECK_DEPOSIT)
    }
}
