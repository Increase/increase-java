package com.increase.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class RealTimeDecisionTest {

    @Test
    fun createRealTimeDecision() {
        val realTimeDecision =
            RealTimeDecision.builder()
                .id("string")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .timeoutAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(RealTimeDecision.Status.PENDING)
                .category(RealTimeDecision.Category.CARD_AUTHORIZATION_REQUESTED)
                .cardAuthorization(
                    RealTimeDecision.CardAuthorization.builder()
                        .merchantAcceptorId("string")
                        .merchantDescriptor("string")
                        .merchantCategoryCode("string")
                        .merchantCity("string")
                        .merchantCountry("string")
                        .network(RealTimeDecision.CardAuthorization.Network.VISA)
                        .networkDetails(
                            RealTimeDecision.CardAuthorization.NetworkDetails.builder()
                                .visa(
                                    RealTimeDecision.CardAuthorization.NetworkDetails.Visa.builder()
                                        .electronicCommerceIndicator(
                                            RealTimeDecision.CardAuthorization.NetworkDetails.Visa
                                                .ElectronicCommerceIndicator
                                                .MAIL_PHONE_ORDER
                                        )
                                        .pointOfServiceEntryMode(PointOfServiceEntryMode.MANUAL)
                                        .build()
                                )
                                .build()
                        )
                        .decision(RealTimeDecision.CardAuthorization.Decision.APPROVE)
                        .cardId("string")
                        .accountId("string")
                        .presentmentAmount(123L)
                        .presentmentCurrency("string")
                        .settlementAmount(123L)
                        .settlementCurrency("string")
                        .build()
                )
                .digitalWalletToken(
                    RealTimeDecision.DigitalWalletToken.builder()
                        .decision(RealTimeDecision.DigitalWalletToken.Decision.APPROVE)
                        .cardId("string")
                        .digitalWallet(RealTimeDecision.DigitalWalletToken.DigitalWallet.APPLE_PAY)
                        .cardProfileId("string")
                        .build()
                )
                .digitalWalletAuthentication(
                    RealTimeDecision.DigitalWalletAuthentication.builder()
                        .result(RealTimeDecision.DigitalWalletAuthentication.Result.SUCCESS)
                        .cardId("string")
                        .digitalWallet(
                            RealTimeDecision.DigitalWalletAuthentication.DigitalWallet.APPLE_PAY
                        )
                        .channel(RealTimeDecision.DigitalWalletAuthentication.Channel.SMS)
                        .oneTimePasscode("string")
                        .phone("string")
                        .email("string")
                        .build()
                )
                .type(RealTimeDecision.Type.REAL_TIME_DECISION)
                .build()
        assertThat(realTimeDecision).isNotNull
        assertThat(realTimeDecision.id()).isEqualTo("string")
        assertThat(realTimeDecision.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(realTimeDecision.timeoutAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(realTimeDecision.status()).isEqualTo(RealTimeDecision.Status.PENDING)
        assertThat(realTimeDecision.category())
            .isEqualTo(RealTimeDecision.Category.CARD_AUTHORIZATION_REQUESTED)
        assertThat(realTimeDecision.cardAuthorization())
            .contains(
                RealTimeDecision.CardAuthorization.builder()
                    .merchantAcceptorId("string")
                    .merchantDescriptor("string")
                    .merchantCategoryCode("string")
                    .merchantCity("string")
                    .merchantCountry("string")
                    .network(RealTimeDecision.CardAuthorization.Network.VISA)
                    .networkDetails(
                        RealTimeDecision.CardAuthorization.NetworkDetails.builder()
                            .visa(
                                RealTimeDecision.CardAuthorization.NetworkDetails.Visa.builder()
                                    .electronicCommerceIndicator(
                                        RealTimeDecision.CardAuthorization.NetworkDetails.Visa
                                            .ElectronicCommerceIndicator
                                            .MAIL_PHONE_ORDER
                                    )
                                    .pointOfServiceEntryMode(PointOfServiceEntryMode.MANUAL)
                                    .build()
                            )
                            .build()
                    )
                    .decision(RealTimeDecision.CardAuthorization.Decision.APPROVE)
                    .cardId("string")
                    .accountId("string")
                    .presentmentAmount(123L)
                    .presentmentCurrency("string")
                    .settlementAmount(123L)
                    .settlementCurrency("string")
                    .build()
            )
        assertThat(realTimeDecision.digitalWalletToken())
            .contains(
                RealTimeDecision.DigitalWalletToken.builder()
                    .decision(RealTimeDecision.DigitalWalletToken.Decision.APPROVE)
                    .cardId("string")
                    .digitalWallet(RealTimeDecision.DigitalWalletToken.DigitalWallet.APPLE_PAY)
                    .cardProfileId("string")
                    .build()
            )
        assertThat(realTimeDecision.digitalWalletAuthentication())
            .contains(
                RealTimeDecision.DigitalWalletAuthentication.builder()
                    .result(RealTimeDecision.DigitalWalletAuthentication.Result.SUCCESS)
                    .cardId("string")
                    .digitalWallet(
                        RealTimeDecision.DigitalWalletAuthentication.DigitalWallet.APPLE_PAY
                    )
                    .channel(RealTimeDecision.DigitalWalletAuthentication.Channel.SMS)
                    .oneTimePasscode("string")
                    .phone("string")
                    .email("string")
                    .build()
            )
        assertThat(realTimeDecision.type()).isEqualTo(RealTimeDecision.Type.REAL_TIME_DECISION)
    }
}
