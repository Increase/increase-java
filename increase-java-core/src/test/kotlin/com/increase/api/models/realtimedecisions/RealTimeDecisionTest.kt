// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.realtimedecisions

import com.increase.api.core.JsonValue
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RealTimeDecisionTest {

    @Test
    fun createRealTimeDecision() {
        val realTimeDecision =
            RealTimeDecision.builder()
                .id("real_time_decision_j76n2e810ezcg3zh5qtn")
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
                        .accountId("account_in71c4amph0vgo2qllky")
                        .cardId("card_oubs0hwk5rn6knuecxg2")
                        .decision(RealTimeDecision.CardAuthorization.Decision.APPROVE)
                        .digitalWalletTokenId(null)
                        .direction(RealTimeDecision.CardAuthorization.Direction.SETTLEMENT)
                        .merchantAcceptorId("5665270011000168")
                        .merchantCategoryCode("5734")
                        .merchantCity("New York")
                        .merchantCountry("US")
                        .merchantDescriptor("AMAZON.COM")
                        .merchantPostalCode("10045")
                        .merchantState("NY")
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
                                .retrievalReferenceNumber("785867080153")
                                .traceNumber("487941")
                                .transactionId("627199945183184")
                                .build()
                        )
                        .networkRiskScore(10L)
                        .physicalCardId(null)
                        .presentmentAmount(100L)
                        .presentmentCurrency("USD")
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
                                .initialAuthorization(JsonValue.from(mapOf<String, Any>()))
                                .build()
                        )
                        .settlementAmount(100L)
                        .settlementCurrency("USD")
                        .terminalId("RCN5VNXS")
                        .upcomingCardPaymentId("card_payment_nd3k2kacrqjli8482ave")
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
                                        .actualLine1("33 Liberty Street")
                                        .actualPostalCode("94131")
                                        .providedLine1("33 Liberty Street")
                                        .providedPostalCode("94132")
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
                .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
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
                .timeoutAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                .type(RealTimeDecision.Type.REAL_TIME_DECISION)
                .build()
        assertThat(realTimeDecision).isNotNull
        assertThat(realTimeDecision.id()).isEqualTo("real_time_decision_j76n2e810ezcg3zh5qtn")
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
                    .accountId("account_in71c4amph0vgo2qllky")
                    .cardId("card_oubs0hwk5rn6knuecxg2")
                    .decision(RealTimeDecision.CardAuthorization.Decision.APPROVE)
                    .digitalWalletTokenId(null)
                    .direction(RealTimeDecision.CardAuthorization.Direction.SETTLEMENT)
                    .merchantAcceptorId("5665270011000168")
                    .merchantCategoryCode("5734")
                    .merchantCity("New York")
                    .merchantCountry("US")
                    .merchantDescriptor("AMAZON.COM")
                    .merchantPostalCode("10045")
                    .merchantState("NY")
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
                            .retrievalReferenceNumber("785867080153")
                            .traceNumber("487941")
                            .transactionId("627199945183184")
                            .build()
                    )
                    .networkRiskScore(10L)
                    .physicalCardId(null)
                    .presentmentAmount(100L)
                    .presentmentCurrency("USD")
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
                            .initialAuthorization(JsonValue.from(mapOf<String, Any>()))
                            .build()
                    )
                    .settlementAmount(100L)
                    .settlementCurrency("USD")
                    .terminalId("RCN5VNXS")
                    .upcomingCardPaymentId("card_payment_nd3k2kacrqjli8482ave")
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
                                    .actualLine1("33 Liberty Street")
                                    .actualPostalCode("94131")
                                    .providedLine1("33 Liberty Street")
                                    .providedPostalCode("94132")
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
            .isEqualTo(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
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
            .isEqualTo(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
        assertThat(realTimeDecision.type()).isEqualTo(RealTimeDecision.Type.REAL_TIME_DECISION)
    }
}
