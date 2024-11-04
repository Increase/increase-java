// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.increase.api.core.JsonNull
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PendingTransactionTest {

    @Test
    fun createPendingTransaction() {
        val pendingTransaction =
            PendingTransaction.builder()
                .id("id")
                .accountId("account_id")
                .amount(123L)
                .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currency(PendingTransaction.Currency.CAD)
                .description("description")
                .routeId("route_id")
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
                                .transferId("transfer_id")
                                .build()
                        )
                        .achTransferInstruction(
                            PendingTransaction.Source.AchTransferInstruction.builder()
                                .amount(123L)
                                .transferId("transfer_id")
                                .build()
                        )
                        .cardAuthorization(
                            PendingTransaction.Source.CardAuthorization.builder()
                                .id("id")
                                .actioner(PendingTransaction.Source.CardAuthorization.Actioner.USER)
                                .amount(123L)
                                .cardPaymentId("card_payment_id")
                                .currency(PendingTransaction.Source.CardAuthorization.Currency.CAD)
                                .digitalWalletTokenId("digital_wallet_token_id")
                                .direction(
                                    PendingTransaction.Source.CardAuthorization.Direction.SETTLEMENT
                                )
                                .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .merchantAcceptorId("merchant_acceptor_id")
                                .merchantCategoryCode("merchant_category_code")
                                .merchantCity("merchant_city")
                                .merchantCountry("merchant_country")
                                .merchantDescriptor("merchant_descriptor")
                                .merchantPostalCode("merchant_postal_code")
                                .merchantState("merchant_state")
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
                                                .standInProcessingReason(
                                                    PendingTransaction.Source.CardAuthorization
                                                        .NetworkDetails
                                                        .Visa
                                                        .StandInProcessingReason
                                                        .ISSUER_ERROR
                                                )
                                                .build()
                                        )
                                        .build()
                                )
                                .networkIdentifiers(
                                    PendingTransaction.Source.CardAuthorization.NetworkIdentifiers
                                        .builder()
                                        .retrievalReferenceNumber("retrieval_reference_number")
                                        .traceNumber("trace_number")
                                        .transactionId("transaction_id")
                                        .build()
                                )
                                .networkRiskScore(123L)
                                .pendingTransactionId("pending_transaction_id")
                                .physicalCardId("physical_card_id")
                                .presentmentAmount(123L)
                                .presentmentCurrency("presentment_currency")
                                .processingCategory(
                                    PendingTransaction.Source.CardAuthorization.ProcessingCategory
                                        .ACCOUNT_FUNDING
                                )
                                .realTimeDecisionId("real_time_decision_id")
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
                                                .actualLine1("actual_line1")
                                                .actualPostalCode("actual_postal_code")
                                                .providedLine1("provided_line1")
                                                .providedPostalCode("provided_postal_code")
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
                                .backImageFileId("back_image_file_id")
                                .checkDepositId("check_deposit_id")
                                .currency(
                                    PendingTransaction.Source.CheckDepositInstruction.Currency.CAD
                                )
                                .frontImageFileId("front_image_file_id")
                                .build()
                        )
                        .checkTransferInstruction(
                            PendingTransaction.Source.CheckTransferInstruction.builder()
                                .amount(123L)
                                .currency(
                                    PendingTransaction.Source.CheckTransferInstruction.Currency.CAD
                                )
                                .transferId("transfer_id")
                                .build()
                        )
                        .inboundFundsHold(
                            PendingTransaction.Source.InboundFundsHold.builder()
                                .id("id")
                                .amount(123L)
                                .automaticallyReleasesAt(
                                    OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                )
                                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .currency(PendingTransaction.Source.InboundFundsHold.Currency.CAD)
                                .heldTransactionId("held_transaction_id")
                                .pendingTransactionId("pending_transaction_id")
                                .releasedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .status(PendingTransaction.Source.InboundFundsHold.Status.HELD)
                                .type(
                                    PendingTransaction.Source.InboundFundsHold.Type
                                        .INBOUND_FUNDS_HOLD
                                )
                                .build()
                        )
                        .other(JsonNull.of())
                        .realTimePaymentsTransferInstruction(
                            PendingTransaction.Source.RealTimePaymentsTransferInstruction.builder()
                                .amount(123L)
                                .transferId("transfer_id")
                                .build()
                        )
                        .wireTransferInstruction(
                            PendingTransaction.Source.WireTransferInstruction.builder()
                                .accountNumber("account_number")
                                .amount(123L)
                                .messageToRecipient("message_to_recipient")
                                .routingNumber("routing_number")
                                .transferId("transfer_id")
                                .build()
                        )
                        .build()
                )
                .status(PendingTransaction.Status.PENDING)
                .type(PendingTransaction.Type.PENDING_TRANSACTION)
                .build()
        assertThat(pendingTransaction).isNotNull
        assertThat(pendingTransaction.id()).isEqualTo("id")
        assertThat(pendingTransaction.accountId()).isEqualTo("account_id")
        assertThat(pendingTransaction.amount()).isEqualTo(123L)
        assertThat(pendingTransaction.completedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(pendingTransaction.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(pendingTransaction.currency()).isEqualTo(PendingTransaction.Currency.CAD)
        assertThat(pendingTransaction.description()).isEqualTo("description")
        assertThat(pendingTransaction.routeId()).contains("route_id")
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
                            .transferId("transfer_id")
                            .build()
                    )
                    .achTransferInstruction(
                        PendingTransaction.Source.AchTransferInstruction.builder()
                            .amount(123L)
                            .transferId("transfer_id")
                            .build()
                    )
                    .cardAuthorization(
                        PendingTransaction.Source.CardAuthorization.builder()
                            .id("id")
                            .actioner(PendingTransaction.Source.CardAuthorization.Actioner.USER)
                            .amount(123L)
                            .cardPaymentId("card_payment_id")
                            .currency(PendingTransaction.Source.CardAuthorization.Currency.CAD)
                            .digitalWalletTokenId("digital_wallet_token_id")
                            .direction(
                                PendingTransaction.Source.CardAuthorization.Direction.SETTLEMENT
                            )
                            .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .merchantAcceptorId("merchant_acceptor_id")
                            .merchantCategoryCode("merchant_category_code")
                            .merchantCity("merchant_city")
                            .merchantCountry("merchant_country")
                            .merchantDescriptor("merchant_descriptor")
                            .merchantPostalCode("merchant_postal_code")
                            .merchantState("merchant_state")
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
                                            .standInProcessingReason(
                                                PendingTransaction.Source.CardAuthorization
                                                    .NetworkDetails
                                                    .Visa
                                                    .StandInProcessingReason
                                                    .ISSUER_ERROR
                                            )
                                            .build()
                                    )
                                    .build()
                            )
                            .networkIdentifiers(
                                PendingTransaction.Source.CardAuthorization.NetworkIdentifiers
                                    .builder()
                                    .retrievalReferenceNumber("retrieval_reference_number")
                                    .traceNumber("trace_number")
                                    .transactionId("transaction_id")
                                    .build()
                            )
                            .networkRiskScore(123L)
                            .pendingTransactionId("pending_transaction_id")
                            .physicalCardId("physical_card_id")
                            .presentmentAmount(123L)
                            .presentmentCurrency("presentment_currency")
                            .processingCategory(
                                PendingTransaction.Source.CardAuthorization.ProcessingCategory
                                    .ACCOUNT_FUNDING
                            )
                            .realTimeDecisionId("real_time_decision_id")
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
                                            .actualLine1("actual_line1")
                                            .actualPostalCode("actual_postal_code")
                                            .providedLine1("provided_line1")
                                            .providedPostalCode("provided_postal_code")
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
                            .backImageFileId("back_image_file_id")
                            .checkDepositId("check_deposit_id")
                            .currency(
                                PendingTransaction.Source.CheckDepositInstruction.Currency.CAD
                            )
                            .frontImageFileId("front_image_file_id")
                            .build()
                    )
                    .checkTransferInstruction(
                        PendingTransaction.Source.CheckTransferInstruction.builder()
                            .amount(123L)
                            .currency(
                                PendingTransaction.Source.CheckTransferInstruction.Currency.CAD
                            )
                            .transferId("transfer_id")
                            .build()
                    )
                    .inboundFundsHold(
                        PendingTransaction.Source.InboundFundsHold.builder()
                            .id("id")
                            .amount(123L)
                            .automaticallyReleasesAt(
                                OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                            )
                            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .currency(PendingTransaction.Source.InboundFundsHold.Currency.CAD)
                            .heldTransactionId("held_transaction_id")
                            .pendingTransactionId("pending_transaction_id")
                            .releasedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .status(PendingTransaction.Source.InboundFundsHold.Status.HELD)
                            .type(
                                PendingTransaction.Source.InboundFundsHold.Type.INBOUND_FUNDS_HOLD
                            )
                            .build()
                    )
                    .other(JsonNull.of())
                    .realTimePaymentsTransferInstruction(
                        PendingTransaction.Source.RealTimePaymentsTransferInstruction.builder()
                            .amount(123L)
                            .transferId("transfer_id")
                            .build()
                    )
                    .wireTransferInstruction(
                        PendingTransaction.Source.WireTransferInstruction.builder()
                            .accountNumber("account_number")
                            .amount(123L)
                            .messageToRecipient("message_to_recipient")
                            .routingNumber("routing_number")
                            .transferId("transfer_id")
                            .build()
                    )
                    .build()
            )
        assertThat(pendingTransaction.status()).isEqualTo(PendingTransaction.Status.PENDING)
        assertThat(pendingTransaction.type()).isEqualTo(PendingTransaction.Type.PENDING_TRANSACTION)
    }
}
