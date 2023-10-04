// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CheckDepositTest {

    @Test
    fun createCheckDeposit() {
        val checkDeposit =
            CheckDeposit.builder()
                .id("string")
                .accountId("string")
                .amount(123L)
                .backImageFileId("string")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currency(CheckDeposit.Currency.CAD)
                .depositAcceptance(
                    CheckDeposit.DepositAcceptance.builder()
                        .accountNumber("string")
                        .amount(123L)
                        .auxiliaryOnUs("string")
                        .checkDepositId("string")
                        .currency(CheckDeposit.DepositAcceptance.Currency.CAD)
                        .routingNumber("string")
                        .serialNumber("string")
                        .build()
                )
                .depositRejection(
                    CheckDeposit.DepositRejection.builder()
                        .amount(123L)
                        .currency(CheckDeposit.DepositRejection.Currency.CAD)
                        .reason(CheckDeposit.DepositRejection.Reason.INCOMPLETE_IMAGE)
                        .rejectedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .depositReturn(
                    CheckDeposit.DepositReturn.builder()
                        .amount(123L)
                        .checkDepositId("string")
                        .currency(CheckDeposit.DepositReturn.Currency.CAD)
                        .returnReason(
                            CheckDeposit.DepositReturn.ReturnReason.ACH_CONVERSION_NOT_SUPPORTED
                        )
                        .returnedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .transactionId("string")
                        .build()
                )
                .frontImageFileId("string")
                .status(CheckDeposit.Status.PENDING)
                .transactionId("string")
                .type(CheckDeposit.Type.CHECK_DEPOSIT)
                .build()
        assertThat(checkDeposit).isNotNull
        assertThat(checkDeposit.id()).isEqualTo("string")
        assertThat(checkDeposit.accountId()).isEqualTo("string")
        assertThat(checkDeposit.amount()).isEqualTo(123L)
        assertThat(checkDeposit.backImageFileId()).contains("string")
        assertThat(checkDeposit.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(checkDeposit.currency()).isEqualTo(CheckDeposit.Currency.CAD)
        assertThat(checkDeposit.depositAcceptance())
            .contains(
                CheckDeposit.DepositAcceptance.builder()
                    .accountNumber("string")
                    .amount(123L)
                    .auxiliaryOnUs("string")
                    .checkDepositId("string")
                    .currency(CheckDeposit.DepositAcceptance.Currency.CAD)
                    .routingNumber("string")
                    .serialNumber("string")
                    .build()
            )
        assertThat(checkDeposit.depositRejection())
            .contains(
                CheckDeposit.DepositRejection.builder()
                    .amount(123L)
                    .currency(CheckDeposit.DepositRejection.Currency.CAD)
                    .reason(CheckDeposit.DepositRejection.Reason.INCOMPLETE_IMAGE)
                    .rejectedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(checkDeposit.depositReturn())
            .contains(
                CheckDeposit.DepositReturn.builder()
                    .amount(123L)
                    .checkDepositId("string")
                    .currency(CheckDeposit.DepositReturn.Currency.CAD)
                    .returnReason(
                        CheckDeposit.DepositReturn.ReturnReason.ACH_CONVERSION_NOT_SUPPORTED
                    )
                    .returnedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .transactionId("string")
                    .build()
            )
        assertThat(checkDeposit.frontImageFileId()).isEqualTo("string")
        assertThat(checkDeposit.status()).isEqualTo(CheckDeposit.Status.PENDING)
        assertThat(checkDeposit.transactionId()).contains("string")
        assertThat(checkDeposit.type()).isEqualTo(CheckDeposit.Type.CHECK_DEPOSIT)
    }
}
