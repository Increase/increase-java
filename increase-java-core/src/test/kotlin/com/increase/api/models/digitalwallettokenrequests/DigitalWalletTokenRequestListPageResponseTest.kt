// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.digitalwallettokenrequests

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.increase.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DigitalWalletTokenRequestListPageResponseTest {

    @Test
    fun create() {
        val digitalWalletTokenRequestListPageResponse =
            DigitalWalletTokenRequestListPageResponse.builder()
                .addData(
                    DigitalWalletTokenRequest.builder()
                        .id("digital_wallet_token_request_dlsq0yabf7ev4xvke6ek")
                        .cardId("card_oubs0hwk5rn6knuecxg2")
                        .cardholder(
                            DigitalWalletTokenRequest.Cardholder.builder()
                                .name("Ian Crease")
                                .build()
                        )
                        .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .declined(
                            DigitalWalletTokenRequest.Declined.builder()
                                .reason(DigitalWalletTokenRequest.Declined.Reason.CARD_NOT_ACTIVE)
                                .build()
                        )
                        .device(
                            DigitalWalletTokenRequest.Device.builder()
                                .deviceType(
                                    DigitalWalletTokenRequest.Device.DeviceType.MOBILE_PHONE
                                )
                                .identifier("04393EADF4149002225811273840459271E36516DA4875FF")
                                .ipAddress("1.2.3.4")
                                .name("My Work Phone")
                                .build()
                        )
                        .network(DigitalWalletTokenRequest.Network.VISA)
                        .outcome(DigitalWalletTokenRequest.Outcome.PROVISIONED)
                        .provisioned(
                            DigitalWalletTokenRequest.Provisioned.builder()
                                .digitalWalletTokenId("digital_wallet_token_izi62go3h51p369jrie0")
                                .build()
                        )
                        .tokenReferenceIdentifier("DNITHE000000000000000000000")
                        .tokenRequestor(DigitalWalletTokenRequest.TokenRequestor.APPLE_PAY)
                        .tokenRequestorDetails(
                            DigitalWalletTokenRequest.TokenRequestorDetails.builder()
                                .identifier("40010030273")
                                .name("Apple Inc.")
                                .build()
                        )
                        .type(DigitalWalletTokenRequest.Type.DIGITAL_WALLET_TOKEN_REQUEST)
                        .verification(
                            DigitalWalletTokenRequest.Verification.builder()
                                .cardholderAddress(
                                    DigitalWalletTokenRequest.Verification.CardholderAddress
                                        .builder()
                                        .actualLine1("33 Liberty Street")
                                        .actualPostalCode("94132")
                                        .providedLine1("33 Liberty Street")
                                        .providedPostalCode("94132")
                                        .result(
                                            DigitalWalletTokenRequest.Verification.CardholderAddress
                                                .Result
                                                .MATCH
                                        )
                                        .build()
                                )
                                .build()
                        )
                        .visa(
                            DigitalWalletTokenRequest.Visa.builder()
                                .networkRiskScore(26L)
                                .provisioningRiskScore(7L)
                                .build()
                        )
                        .wallet(
                            DigitalWalletTokenRequest.Wallet.builder()
                                .accountEmailAgeDays(720L)
                                .accountIdentifier("0E51EC2F85C4ABF0")
                                .accountScore(5L)
                                .deviceScore(5L)
                                .emailHash(
                                    "0E51EC2F85C4ABF067DFE4B0D30A5F60899C6ACEFD700D3171E7330D542E0834"
                                )
                                .build()
                        )
                        .build()
                )
                .nextCursor("v57w5d")
                .build()

        assertThat(digitalWalletTokenRequestListPageResponse.data())
            .containsExactly(
                DigitalWalletTokenRequest.builder()
                    .id("digital_wallet_token_request_dlsq0yabf7ev4xvke6ek")
                    .cardId("card_oubs0hwk5rn6knuecxg2")
                    .cardholder(
                        DigitalWalletTokenRequest.Cardholder.builder().name("Ian Crease").build()
                    )
                    .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                    .declined(
                        DigitalWalletTokenRequest.Declined.builder()
                            .reason(DigitalWalletTokenRequest.Declined.Reason.CARD_NOT_ACTIVE)
                            .build()
                    )
                    .device(
                        DigitalWalletTokenRequest.Device.builder()
                            .deviceType(DigitalWalletTokenRequest.Device.DeviceType.MOBILE_PHONE)
                            .identifier("04393EADF4149002225811273840459271E36516DA4875FF")
                            .ipAddress("1.2.3.4")
                            .name("My Work Phone")
                            .build()
                    )
                    .network(DigitalWalletTokenRequest.Network.VISA)
                    .outcome(DigitalWalletTokenRequest.Outcome.PROVISIONED)
                    .provisioned(
                        DigitalWalletTokenRequest.Provisioned.builder()
                            .digitalWalletTokenId("digital_wallet_token_izi62go3h51p369jrie0")
                            .build()
                    )
                    .tokenReferenceIdentifier("DNITHE000000000000000000000")
                    .tokenRequestor(DigitalWalletTokenRequest.TokenRequestor.APPLE_PAY)
                    .tokenRequestorDetails(
                        DigitalWalletTokenRequest.TokenRequestorDetails.builder()
                            .identifier("40010030273")
                            .name("Apple Inc.")
                            .build()
                    )
                    .type(DigitalWalletTokenRequest.Type.DIGITAL_WALLET_TOKEN_REQUEST)
                    .verification(
                        DigitalWalletTokenRequest.Verification.builder()
                            .cardholderAddress(
                                DigitalWalletTokenRequest.Verification.CardholderAddress.builder()
                                    .actualLine1("33 Liberty Street")
                                    .actualPostalCode("94132")
                                    .providedLine1("33 Liberty Street")
                                    .providedPostalCode("94132")
                                    .result(
                                        DigitalWalletTokenRequest.Verification.CardholderAddress
                                            .Result
                                            .MATCH
                                    )
                                    .build()
                            )
                            .build()
                    )
                    .visa(
                        DigitalWalletTokenRequest.Visa.builder()
                            .networkRiskScore(26L)
                            .provisioningRiskScore(7L)
                            .build()
                    )
                    .wallet(
                        DigitalWalletTokenRequest.Wallet.builder()
                            .accountEmailAgeDays(720L)
                            .accountIdentifier("0E51EC2F85C4ABF0")
                            .accountScore(5L)
                            .deviceScore(5L)
                            .emailHash(
                                "0E51EC2F85C4ABF067DFE4B0D30A5F60899C6ACEFD700D3171E7330D542E0834"
                            )
                            .build()
                    )
                    .build()
            )
        assertThat(digitalWalletTokenRequestListPageResponse.nextCursor()).contains("v57w5d")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val digitalWalletTokenRequestListPageResponse =
            DigitalWalletTokenRequestListPageResponse.builder()
                .addData(
                    DigitalWalletTokenRequest.builder()
                        .id("digital_wallet_token_request_dlsq0yabf7ev4xvke6ek")
                        .cardId("card_oubs0hwk5rn6knuecxg2")
                        .cardholder(
                            DigitalWalletTokenRequest.Cardholder.builder()
                                .name("Ian Crease")
                                .build()
                        )
                        .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .declined(
                            DigitalWalletTokenRequest.Declined.builder()
                                .reason(DigitalWalletTokenRequest.Declined.Reason.CARD_NOT_ACTIVE)
                                .build()
                        )
                        .device(
                            DigitalWalletTokenRequest.Device.builder()
                                .deviceType(
                                    DigitalWalletTokenRequest.Device.DeviceType.MOBILE_PHONE
                                )
                                .identifier("04393EADF4149002225811273840459271E36516DA4875FF")
                                .ipAddress("1.2.3.4")
                                .name("My Work Phone")
                                .build()
                        )
                        .network(DigitalWalletTokenRequest.Network.VISA)
                        .outcome(DigitalWalletTokenRequest.Outcome.PROVISIONED)
                        .provisioned(
                            DigitalWalletTokenRequest.Provisioned.builder()
                                .digitalWalletTokenId("digital_wallet_token_izi62go3h51p369jrie0")
                                .build()
                        )
                        .tokenReferenceIdentifier("DNITHE000000000000000000000")
                        .tokenRequestor(DigitalWalletTokenRequest.TokenRequestor.APPLE_PAY)
                        .tokenRequestorDetails(
                            DigitalWalletTokenRequest.TokenRequestorDetails.builder()
                                .identifier("40010030273")
                                .name("Apple Inc.")
                                .build()
                        )
                        .type(DigitalWalletTokenRequest.Type.DIGITAL_WALLET_TOKEN_REQUEST)
                        .verification(
                            DigitalWalletTokenRequest.Verification.builder()
                                .cardholderAddress(
                                    DigitalWalletTokenRequest.Verification.CardholderAddress
                                        .builder()
                                        .actualLine1("33 Liberty Street")
                                        .actualPostalCode("94132")
                                        .providedLine1("33 Liberty Street")
                                        .providedPostalCode("94132")
                                        .result(
                                            DigitalWalletTokenRequest.Verification.CardholderAddress
                                                .Result
                                                .MATCH
                                        )
                                        .build()
                                )
                                .build()
                        )
                        .visa(
                            DigitalWalletTokenRequest.Visa.builder()
                                .networkRiskScore(26L)
                                .provisioningRiskScore(7L)
                                .build()
                        )
                        .wallet(
                            DigitalWalletTokenRequest.Wallet.builder()
                                .accountEmailAgeDays(720L)
                                .accountIdentifier("0E51EC2F85C4ABF0")
                                .accountScore(5L)
                                .deviceScore(5L)
                                .emailHash(
                                    "0E51EC2F85C4ABF067DFE4B0D30A5F60899C6ACEFD700D3171E7330D542E0834"
                                )
                                .build()
                        )
                        .build()
                )
                .nextCursor("v57w5d")
                .build()

        val roundtrippedDigitalWalletTokenRequestListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(digitalWalletTokenRequestListPageResponse),
                jacksonTypeRef<DigitalWalletTokenRequestListPageResponse>(),
            )

        assertThat(roundtrippedDigitalWalletTokenRequestListPageResponse)
            .isEqualTo(digitalWalletTokenRequestListPageResponse)
    }
}
