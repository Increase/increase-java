// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.increase.api.core.JsonNull
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class RealTimeDecisionTest {

    @Test
    fun createRealTimeDecision() {
        val realTimeDecision =
            RealTimeDecision.builder()
                .id("id")
                .cardAuthentication(
                    RealTimeDecision.CardAuthentication.builder()
                        .accountId("account_id")
                        .cardId("card_id")
                        .decision(RealTimeDecision.CardAuthentication.Decision.APPROVE)
                        .upcomingCardPaymentId("upcoming_card_payment_id")
                        .build()
                )
                .cardAuthenticationChallenge(
                    RealTimeDecision.CardAuthenticationChallenge.builder()
                        .accountId("account_id")
                        .cardId("card_id")
                        .cardPaymentId("card_payment_id")
                        .oneTimeCode("one_time_code")
                        .result(RealTimeDecision.CardAuthenticationChallenge.Result.SUCCESS)
                        .build()
                )
                .cardAuthorization(
                    RealTimeDecision.CardAuthorization.builder()
                        .accountId("account_id")
                        .cardId("card_id")
                        .decision(RealTimeDecision.CardAuthorization.Decision.APPROVE)
                        .digitalWalletTokenId("digital_wallet_token_id")
                        .direction(RealTimeDecision.CardAuthorization.Direction.SETTLEMENT)
                        .merchantAcceptorId("merchant_acceptor_id")
                        .merchantCategoryCode("merchant_category_code")
                        .merchantCity("merchant_city")
                        .merchantCountry("merchant_country")
                        .merchantDescriptor("merchant_descriptor")
                        .merchantPostalCode("merchant_postal_code")
                        .merchantState("merchant_state")
                        .networkDetails(
                            RealTimeDecision.CardAuthorization.NetworkDetails.builder()
                                .category(
                                    RealTimeDecision.CardAuthorization.NetworkDetails.Category.VISA
                                )
                                .visa(
                                    RealTimeDecision.CardAuthorization.NetworkDetails.Visa.builder()
                                        .electronicCommerceIndicator(
                                            RealTimeDecision.CardAuthorization.NetworkDetails.Visa
                                                .ElectronicCommerceIndicator
                                                .MAIL_PHONE_ORDER
                                        )
                                        .pointOfServiceEntryMode(
                                            RealTimeDecision.CardAuthorization.NetworkDetails.Visa
                                                .PointOfServiceEntryMode
                                                .UNKNOWN
                                        )
                                        .standInProcessingReason(
                                            RealTimeDecision.CardAuthorization.NetworkDetails.Visa
                                                .StandInProcessingReason
                                                .ISSUER_ERROR
                                        )
                                        .build()
                                )
                                .build()
                        )
                        .networkIdentifiers(
                            RealTimeDecision.CardAuthorization.NetworkIdentifiers.builder()
                                .retrievalReferenceNumber("retrieval_reference_number")
                                .traceNumber("trace_number")
                                .transactionId("transaction_id")
                                .build()
                        )
                        .networkRiskScore(123L)
                        .physicalCardId("physical_card_id")
                        .presentmentAmount(123L)
                        .presentmentCurrency("presentment_currency")
                        .processingCategory(
                            RealTimeDecision.CardAuthorization.ProcessingCategory.ACCOUNT_FUNDING
                        )
                        .requestDetails(
                            RealTimeDecision.CardAuthorization.RequestDetails.builder()
                                .category(
                                    RealTimeDecision.CardAuthorization.RequestDetails.Category
                                        .INITIAL_AUTHORIZATION
                                )
                                .incrementalAuthorization(
                                    RealTimeDecision.CardAuthorization.RequestDetails
                                        .IncrementalAuthorization
                                        .builder()
                                        .cardPaymentId("card_payment_id")
                                        .originalCardAuthorizationId(
                                            "original_card_authorization_id"
                                        )
                                        .build()
                                )
                                .initialAuthorization(JsonNull.of())
                                .build()
                        )
                        .settlementAmount(123L)
                        .settlementCurrency("settlement_currency")
                        .upcomingCardPaymentId("upcoming_card_payment_id")
                        .verification(
                            RealTimeDecision.CardAuthorization.Verification.builder()
                                .cardVerificationCode(
                                    RealTimeDecision.CardAuthorization.Verification
                                        .CardVerificationCode
                                        .builder()
                                        .result(
                                            RealTimeDecision.CardAuthorization.Verification
                                                .CardVerificationCode
                                                .Result
                                                .NOT_CHECKED
                                        )
                                        .build()
                                )
                                .cardholderAddress(
                                    RealTimeDecision.CardAuthorization.Verification
                                        .CardholderAddress
                                        .builder()
                                        .actualLine1("actual_line1")
                                        .actualPostalCode("actual_postal_code")
                                        .providedLine1("provided_line1")
                                        .providedPostalCode("provided_postal_code")
                                        .result(
                                            RealTimeDecision.CardAuthorization.Verification
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
                .category(RealTimeDecision.Category.CARD_AUTHORIZATION_REQUESTED)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .digitalWalletAuthentication(
                    RealTimeDecision.DigitalWalletAuthentication.builder()
                        .cardId("card_id")
                        .channel(RealTimeDecision.DigitalWalletAuthentication.Channel.SMS)
                        .digitalWallet(
                            RealTimeDecision.DigitalWalletAuthentication.DigitalWallet.APPLE_PAY
                        )
                        .email("email")
                        .oneTimePasscode("one_time_passcode")
                        .phone("phone")
                        .result(RealTimeDecision.DigitalWalletAuthentication.Result.SUCCESS)
                        .build()
                )
                .digitalWalletToken(
                    RealTimeDecision.DigitalWalletToken.builder()
                        .cardId("card_id")
                        .cardProfileId("card_profile_id")
                        .decision(RealTimeDecision.DigitalWalletToken.Decision.APPROVE)
                        .digitalWallet(RealTimeDecision.DigitalWalletToken.DigitalWallet.APPLE_PAY)
                        .build()
                )
                .status(RealTimeDecision.Status.PENDING)
                .timeoutAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .type(RealTimeDecision.Type.REAL_TIME_DECISION)
                .build()
        assertThat(realTimeDecision).isNotNull
        assertThat(realTimeDecision.id()).isEqualTo("id")
        assertThat(realTimeDecision.cardAuthentication())
            .contains(
                RealTimeDecision.CardAuthentication.builder()
                    .accountId("account_id")
                    .cardId("card_id")
                    .decision(RealTimeDecision.CardAuthentication.Decision.APPROVE)
                    .upcomingCardPaymentId("upcoming_card_payment_id")
                    .build()
            )
        assertThat(realTimeDecision.cardAuthenticationChallenge())
            .contains(
                RealTimeDecision.CardAuthenticationChallenge.builder()
                    .accountId("account_id")
                    .cardId("card_id")
                    .cardPaymentId("card_payment_id")
                    .oneTimeCode("one_time_code")
                    .result(RealTimeDecision.CardAuthenticationChallenge.Result.SUCCESS)
                    .build()
            )
        assertThat(realTimeDecision.cardAuthorization())
            .contains(
                RealTimeDecision.CardAuthorization.builder()
                    .accountId("account_id")
                    .cardId("card_id")
                    .decision(RealTimeDecision.CardAuthorization.Decision.APPROVE)
                    .digitalWalletTokenId("digital_wallet_token_id")
                    .direction(RealTimeDecision.CardAuthorization.Direction.SETTLEMENT)
                    .merchantAcceptorId("merchant_acceptor_id")
                    .merchantCategoryCode("merchant_category_code")
                    .merchantCity("merchant_city")
                    .merchantCountry("merchant_country")
                    .merchantDescriptor("merchant_descriptor")
                    .merchantPostalCode("merchant_postal_code")
                    .merchantState("merchant_state")
                    .networkDetails(
                        RealTimeDecision.CardAuthorization.NetworkDetails.builder()
                            .category(
                                RealTimeDecision.CardAuthorization.NetworkDetails.Category.VISA
                            )
                            .visa(
                                RealTimeDecision.CardAuthorization.NetworkDetails.Visa.builder()
                                    .electronicCommerceIndicator(
                                        RealTimeDecision.CardAuthorization.NetworkDetails.Visa
                                            .ElectronicCommerceIndicator
                                            .MAIL_PHONE_ORDER
                                    )
                                    .pointOfServiceEntryMode(
                                        RealTimeDecision.CardAuthorization.NetworkDetails.Visa
                                            .PointOfServiceEntryMode
                                            .UNKNOWN
                                    )
                                    .standInProcessingReason(
                                        RealTimeDecision.CardAuthorization.NetworkDetails.Visa
                                            .StandInProcessingReason
                                            .ISSUER_ERROR
                                    )
                                    .build()
                            )
                            .build()
                    )
                    .networkIdentifiers(
                        RealTimeDecision.CardAuthorization.NetworkIdentifiers.builder()
                            .retrievalReferenceNumber("retrieval_reference_number")
                            .traceNumber("trace_number")
                            .transactionId("transaction_id")
                            .build()
                    )
                    .networkRiskScore(123L)
                    .physicalCardId("physical_card_id")
                    .presentmentAmount(123L)
                    .presentmentCurrency("presentment_currency")
                    .processingCategory(
                        RealTimeDecision.CardAuthorization.ProcessingCategory.ACCOUNT_FUNDING
                    )
                    .requestDetails(
                        RealTimeDecision.CardAuthorization.RequestDetails.builder()
                            .category(
                                RealTimeDecision.CardAuthorization.RequestDetails.Category
                                    .INITIAL_AUTHORIZATION
                            )
                            .incrementalAuthorization(
                                RealTimeDecision.CardAuthorization.RequestDetails
                                    .IncrementalAuthorization
                                    .builder()
                                    .cardPaymentId("card_payment_id")
                                    .originalCardAuthorizationId("original_card_authorization_id")
                                    .build()
                            )
                            .initialAuthorization(JsonNull.of())
                            .build()
                    )
                    .settlementAmount(123L)
                    .settlementCurrency("settlement_currency")
                    .upcomingCardPaymentId("upcoming_card_payment_id")
                    .verification(
                        RealTimeDecision.CardAuthorization.Verification.builder()
                            .cardVerificationCode(
                                RealTimeDecision.CardAuthorization.Verification.CardVerificationCode
                                    .builder()
                                    .result(
                                        RealTimeDecision.CardAuthorization.Verification
                                            .CardVerificationCode
                                            .Result
                                            .NOT_CHECKED
                                    )
                                    .build()
                            )
                            .cardholderAddress(
                                RealTimeDecision.CardAuthorization.Verification.CardholderAddress
                                    .builder()
                                    .actualLine1("actual_line1")
                                    .actualPostalCode("actual_postal_code")
                                    .providedLine1("provided_line1")
                                    .providedPostalCode("provided_postal_code")
                                    .result(
                                        RealTimeDecision.CardAuthorization.Verification
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
        assertThat(realTimeDecision.category())
            .isEqualTo(RealTimeDecision.Category.CARD_AUTHORIZATION_REQUESTED)
        assertThat(realTimeDecision.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(realTimeDecision.digitalWalletAuthentication())
            .contains(
                RealTimeDecision.DigitalWalletAuthentication.builder()
                    .cardId("card_id")
                    .channel(RealTimeDecision.DigitalWalletAuthentication.Channel.SMS)
                    .digitalWallet(
                        RealTimeDecision.DigitalWalletAuthentication.DigitalWallet.APPLE_PAY
                    )
                    .email("email")
                    .oneTimePasscode("one_time_passcode")
                    .phone("phone")
                    .result(RealTimeDecision.DigitalWalletAuthentication.Result.SUCCESS)
                    .build()
            )
        assertThat(realTimeDecision.digitalWalletToken())
            .contains(
                RealTimeDecision.DigitalWalletToken.builder()
                    .cardId("card_id")
                    .cardProfileId("card_profile_id")
                    .decision(RealTimeDecision.DigitalWalletToken.Decision.APPROVE)
                    .digitalWallet(RealTimeDecision.DigitalWalletToken.DigitalWallet.APPLE_PAY)
                    .build()
            )
        assertThat(realTimeDecision.status()).isEqualTo(RealTimeDecision.Status.PENDING)
        assertThat(realTimeDecision.timeoutAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(realTimeDecision.type()).isEqualTo(RealTimeDecision.Type.REAL_TIME_DECISION)
    }
}