// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PendingTransactionTest {

    @Test
    fun createPendingTransaction() {
        val pendingTransaction =
            PendingTransaction.builder()
                .id("string")
                .accountId("string")
                .amount(123L)
                .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currency(PendingTransaction.Currency.CAD)
                .description("string")
                .routeId("string")
                .routeType(PendingTransaction.RouteType.ACCOUNT_NUMBER)
                .source(
                    PendingTransaction.Source.builder()
                        .accountTransferInstruction(
                            PendingTransaction.Source.AccountTransferInstruction.builder()
                                .amount(123L)
                                .currency(
                                    PendingTransaction.Source.AccountTransferInstruction.Currency
                                        .CAD
                                )
                                .transferId("string")
                                .build()
                        )
                        .achTransferInstruction(
                            PendingTransaction.Source.AchTransferInstruction.builder()
                                .amount(123L)
                                .transferId("string")
                                .build()
                        )
                        .cardAuthorization(
                            PendingTransaction.Source.CardAuthorization.builder()
                                .id("string")
                                .actioner(PendingTransaction.Source.CardAuthorization.Actioner.USER)
                                .amount(123L)
                                .cardPaymentId("string")
                                .currency(PendingTransaction.Source.CardAuthorization.Currency.CAD)
                                .digitalWalletTokenId("string")
                                .direction(
                                    PendingTransaction.Source.CardAuthorization.Direction.SETTLEMENT
                                )
                                .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .merchantAcceptorId("string")
                                .merchantCategoryCode("string")
                                .merchantCity("string")
                                .merchantCountry("string")
                                .merchantDescriptor("string")
                                .networkDetails(
                                    PendingTransaction.Source.CardAuthorization.NetworkDetails
                                        .builder()
                                        .category(
                                            PendingTransaction.Source.CardAuthorization
                                                .NetworkDetails
                                                .Category
                                                .VISA
                                        )
                                        .visa(
                                            PendingTransaction.Source.CardAuthorization
                                                .NetworkDetails
                                                .Visa
                                                .builder()
                                                .electronicCommerceIndicator(
                                                    PendingTransaction.Source.CardAuthorization
                                                        .NetworkDetails
                                                        .Visa
                                                        .ElectronicCommerceIndicator
                                                        .MAIL_PHONE_ORDER
                                                )
                                                .pointOfServiceEntryMode(
                                                    PendingTransaction.Source.CardAuthorization
                                                        .NetworkDetails
                                                        .Visa
                                                        .PointOfServiceEntryMode
                                                        .UNKNOWN
                                                )
                                                .build()
                                        )
                                        .build()
                                )
                                .networkIdentifiers(
                                    PendingTransaction.Source.CardAuthorization.NetworkIdentifiers
                                        .builder()
                                        .retrievalReferenceNumber("string")
                                        .traceNumber("string")
                                        .transactionId("string")
                                        .build()
                                )
                                .networkRiskScore(123L)
                                .pendingTransactionId("string")
                                .physicalCardId("string")
                                .presentmentAmount(123L)
                                .presentmentCurrency("string")
                                .processingCategory(
                                    PendingTransaction.Source.CardAuthorization.ProcessingCategory
                                        .ACCOUNT_FUNDING
                                )
                                .realTimeDecisionId("string")
                                .type(
                                    PendingTransaction.Source.CardAuthorization.Type
                                        .CARD_AUTHORIZATION
                                )
                                .verification(
                                    PendingTransaction.Source.CardAuthorization.Verification
                                        .builder()
                                        .cardVerificationCode(
                                            PendingTransaction.Source.CardAuthorization.Verification
                                                .CardVerificationCode
                                                .builder()
                                                .result(
                                                    PendingTransaction.Source.CardAuthorization
                                                        .Verification
                                                        .CardVerificationCode
                                                        .Result
                                                        .NOT_CHECKED
                                                )
                                                .build()
                                        )
                                        .cardholderAddress(
                                            PendingTransaction.Source.CardAuthorization.Verification
                                                .CardholderAddress
                                                .builder()
                                                .actualLine1("string")
                                                .actualPostalCode("string")
                                                .providedLine1("string")
                                                .providedPostalCode("string")
                                                .result(
                                                    PendingTransaction.Source.CardAuthorization
                                                        .Verification
                                                        .CardholderAddress
                                                        .Result
                                                        .NOT_CHECKED
                                                )
                                                .build()
                                        )
                                        .build()
                                )
                                .build()
                        )
                        .category(PendingTransaction.Source.Category.ACCOUNT_TRANSFER_INSTRUCTION)
                        .checkDepositInstruction(
                            PendingTransaction.Source.CheckDepositInstruction.builder()
                                .amount(123L)
                                .backImageFileId("string")
                                .checkDepositId("string")
                                .currency(
                                    PendingTransaction.Source.CheckDepositInstruction.Currency.CAD
                                )
                                .frontImageFileId("string")
                                .build()
                        )
                        .checkTransferInstruction(
                            PendingTransaction.Source.CheckTransferInstruction.builder()
                                .amount(123L)
                                .currency(
                                    PendingTransaction.Source.CheckTransferInstruction.Currency.CAD
                                )
                                .transferId("string")
                                .build()
                        )
                        .inboundFundsHold(
                            PendingTransaction.Source.InboundFundsHold.builder()
                                .id("string")
                                .amount(123L)
                                .automaticallyReleasesAt(
                                    OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                )
                                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .currency(PendingTransaction.Source.InboundFundsHold.Currency.CAD)
                                .heldTransactionId("string")
                                .pendingTransactionId("string")
                                .releasedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .status(PendingTransaction.Source.InboundFundsHold.Status.HELD)
                                .type(
                                    PendingTransaction.Source.InboundFundsHold.Type
                                        .INBOUND_FUNDS_HOLD
                                )
                                .build()
                        )
                        .realTimePaymentsTransferInstruction(
                            PendingTransaction.Source.RealTimePaymentsTransferInstruction.builder()
                                .amount(123L)
                                .transferId("string")
                                .build()
                        )
                        .wireTransferInstruction(
                            PendingTransaction.Source.WireTransferInstruction.builder()
                                .accountNumber("string")
                                .amount(123L)
                                .messageToRecipient("string")
                                .routingNumber("string")
                                .transferId("string")
                                .build()
                        )
                        .build()
                )
                .status(PendingTransaction.Status.PENDING)
                .type(PendingTransaction.Type.PENDING_TRANSACTION)
                .build()
        assertThat(pendingTransaction).isNotNull
        assertThat(pendingTransaction.id()).isEqualTo("string")
        assertThat(pendingTransaction.accountId()).isEqualTo("string")
        assertThat(pendingTransaction.amount()).isEqualTo(123L)
        assertThat(pendingTransaction.completedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(pendingTransaction.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(pendingTransaction.currency()).isEqualTo(PendingTransaction.Currency.CAD)
        assertThat(pendingTransaction.description()).isEqualTo("string")
        assertThat(pendingTransaction.routeId()).contains("string")
        assertThat(pendingTransaction.routeType())
            .contains(PendingTransaction.RouteType.ACCOUNT_NUMBER)
        assertThat(pendingTransaction.source())
            .isEqualTo(
                PendingTransaction.Source.builder()
                    .accountTransferInstruction(
                        PendingTransaction.Source.AccountTransferInstruction.builder()
                            .amount(123L)
                            .currency(
                                PendingTransaction.Source.AccountTransferInstruction.Currency.CAD
                            )
                            .transferId("string")
                            .build()
                    )
                    .achTransferInstruction(
                        PendingTransaction.Source.AchTransferInstruction.builder()
                            .amount(123L)
                            .transferId("string")
                            .build()
                    )
                    .cardAuthorization(
                        PendingTransaction.Source.CardAuthorization.builder()
                            .id("string")
                            .actioner(PendingTransaction.Source.CardAuthorization.Actioner.USER)
                            .amount(123L)
                            .cardPaymentId("string")
                            .currency(PendingTransaction.Source.CardAuthorization.Currency.CAD)
                            .digitalWalletTokenId("string")
                            .direction(
                                PendingTransaction.Source.CardAuthorization.Direction.SETTLEMENT
                            )
                            .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .merchantAcceptorId("string")
                            .merchantCategoryCode("string")
                            .merchantCity("string")
                            .merchantCountry("string")
                            .merchantDescriptor("string")
                            .networkDetails(
                                PendingTransaction.Source.CardAuthorization.NetworkDetails.builder()
                                    .category(
                                        PendingTransaction.Source.CardAuthorization.NetworkDetails
                                            .Category
                                            .VISA
                                    )
                                    .visa(
                                        PendingTransaction.Source.CardAuthorization.NetworkDetails
                                            .Visa
                                            .builder()
                                            .electronicCommerceIndicator(
                                                PendingTransaction.Source.CardAuthorization
                                                    .NetworkDetails
                                                    .Visa
                                                    .ElectronicCommerceIndicator
                                                    .MAIL_PHONE_ORDER
                                            )
                                            .pointOfServiceEntryMode(
                                                PendingTransaction.Source.CardAuthorization
                                                    .NetworkDetails
                                                    .Visa
                                                    .PointOfServiceEntryMode
                                                    .UNKNOWN
                                            )
                                            .build()
                                    )
                                    .build()
                            )
                            .networkIdentifiers(
                                PendingTransaction.Source.CardAuthorization.NetworkIdentifiers
                                    .builder()
                                    .retrievalReferenceNumber("string")
                                    .traceNumber("string")
                                    .transactionId("string")
                                    .build()
                            )
                            .networkRiskScore(123L)
                            .pendingTransactionId("string")
                            .physicalCardId("string")
                            .presentmentAmount(123L)
                            .presentmentCurrency("string")
                            .processingCategory(
                                PendingTransaction.Source.CardAuthorization.ProcessingCategory
                                    .ACCOUNT_FUNDING
                            )
                            .realTimeDecisionId("string")
                            .type(
                                PendingTransaction.Source.CardAuthorization.Type.CARD_AUTHORIZATION
                            )
                            .verification(
                                PendingTransaction.Source.CardAuthorization.Verification.builder()
                                    .cardVerificationCode(
                                        PendingTransaction.Source.CardAuthorization.Verification
                                            .CardVerificationCode
                                            .builder()
                                            .result(
                                                PendingTransaction.Source.CardAuthorization
                                                    .Verification
                                                    .CardVerificationCode
                                                    .Result
                                                    .NOT_CHECKED
                                            )
                                            .build()
                                    )
                                    .cardholderAddress(
                                        PendingTransaction.Source.CardAuthorization.Verification
                                            .CardholderAddress
                                            .builder()
                                            .actualLine1("string")
                                            .actualPostalCode("string")
                                            .providedLine1("string")
                                            .providedPostalCode("string")
                                            .result(
                                                PendingTransaction.Source.CardAuthorization
                                                    .Verification
                                                    .CardholderAddress
                                                    .Result
                                                    .NOT_CHECKED
                                            )
                                            .build()
                                    )
                                    .build()
                            )
                            .build()
                    )
                    .category(PendingTransaction.Source.Category.ACCOUNT_TRANSFER_INSTRUCTION)
                    .checkDepositInstruction(
                        PendingTransaction.Source.CheckDepositInstruction.builder()
                            .amount(123L)
                            .backImageFileId("string")
                            .checkDepositId("string")
                            .currency(
                                PendingTransaction.Source.CheckDepositInstruction.Currency.CAD
                            )
                            .frontImageFileId("string")
                            .build()
                    )
                    .checkTransferInstruction(
                        PendingTransaction.Source.CheckTransferInstruction.builder()
                            .amount(123L)
                            .currency(
                                PendingTransaction.Source.CheckTransferInstruction.Currency.CAD
                            )
                            .transferId("string")
                            .build()
                    )
                    .inboundFundsHold(
                        PendingTransaction.Source.InboundFundsHold.builder()
                            .id("string")
                            .amount(123L)
                            .automaticallyReleasesAt(
                                OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                            )
                            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .currency(PendingTransaction.Source.InboundFundsHold.Currency.CAD)
                            .heldTransactionId("string")
                            .pendingTransactionId("string")
                            .releasedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .status(PendingTransaction.Source.InboundFundsHold.Status.HELD)
                            .type(
                                PendingTransaction.Source.InboundFundsHold.Type.INBOUND_FUNDS_HOLD
                            )
                            .build()
                    )
                    .realTimePaymentsTransferInstruction(
                        PendingTransaction.Source.RealTimePaymentsTransferInstruction.builder()
                            .amount(123L)
                            .transferId("string")
                            .build()
                    )
                    .wireTransferInstruction(
                        PendingTransaction.Source.WireTransferInstruction.builder()
                            .accountNumber("string")
                            .amount(123L)
                            .messageToRecipient("string")
                            .routingNumber("string")
                            .transferId("string")
                            .build()
                    )
                    .build()
            )
        assertThat(pendingTransaction.status()).isEqualTo(PendingTransaction.Status.PENDING)
        assertThat(pendingTransaction.type()).isEqualTo(PendingTransaction.Type.PENDING_TRANSACTION)
    }
}
