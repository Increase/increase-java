// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.digitalwallettokenrequests

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.increase.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DigitalWalletTokenRequestTest {

    @Test
    fun create() {
        val digitalWalletTokenRequest =
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
                .primaryAccountNumberSource(
                    DigitalWalletTokenRequest.PrimaryAccountNumberSource.KEY_ENTERED
                )
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
                                    DigitalWalletTokenRequest.Verification.CardholderAddress.Result
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

        assertThat(digitalWalletTokenRequest.id())
            .isEqualTo("digital_wallet_token_request_dlsq0yabf7ev4xvke6ek")
        assertThat(digitalWalletTokenRequest.cardId()).isEqualTo("card_oubs0hwk5rn6knuecxg2")
        assertThat(digitalWalletTokenRequest.cardholder())
            .isEqualTo(DigitalWalletTokenRequest.Cardholder.builder().name("Ian Crease").build())
        assertThat(digitalWalletTokenRequest.createdAt())
            .isEqualTo(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
        assertThat(digitalWalletTokenRequest.declined())
            .contains(
                DigitalWalletTokenRequest.Declined.builder()
                    .reason(DigitalWalletTokenRequest.Declined.Reason.CARD_NOT_ACTIVE)
                    .build()
            )
        assertThat(digitalWalletTokenRequest.device())
            .isEqualTo(
                DigitalWalletTokenRequest.Device.builder()
                    .deviceType(DigitalWalletTokenRequest.Device.DeviceType.MOBILE_PHONE)
                    .identifier("04393EADF4149002225811273840459271E36516DA4875FF")
                    .ipAddress("1.2.3.4")
                    .name("My Work Phone")
                    .build()
            )
        assertThat(digitalWalletTokenRequest.network())
            .isEqualTo(DigitalWalletTokenRequest.Network.VISA)
        assertThat(digitalWalletTokenRequest.outcome())
            .isEqualTo(DigitalWalletTokenRequest.Outcome.PROVISIONED)
        assertThat(digitalWalletTokenRequest.primaryAccountNumberSource())
            .contains(DigitalWalletTokenRequest.PrimaryAccountNumberSource.KEY_ENTERED)
        assertThat(digitalWalletTokenRequest.provisioned())
            .contains(
                DigitalWalletTokenRequest.Provisioned.builder()
                    .digitalWalletTokenId("digital_wallet_token_izi62go3h51p369jrie0")
                    .build()
            )
        assertThat(digitalWalletTokenRequest.tokenReferenceIdentifier())
            .isEqualTo("DNITHE000000000000000000000")
        assertThat(digitalWalletTokenRequest.tokenRequestor())
            .isEqualTo(DigitalWalletTokenRequest.TokenRequestor.APPLE_PAY)
        assertThat(digitalWalletTokenRequest.tokenRequestorDetails())
            .isEqualTo(
                DigitalWalletTokenRequest.TokenRequestorDetails.builder()
                    .identifier("40010030273")
                    .name("Apple Inc.")
                    .build()
            )
        assertThat(digitalWalletTokenRequest.type())
            .isEqualTo(DigitalWalletTokenRequest.Type.DIGITAL_WALLET_TOKEN_REQUEST)
        assertThat(digitalWalletTokenRequest.verification())
            .isEqualTo(
                DigitalWalletTokenRequest.Verification.builder()
                    .cardholderAddress(
                        DigitalWalletTokenRequest.Verification.CardholderAddress.builder()
                            .actualLine1("33 Liberty Street")
                            .actualPostalCode("94132")
                            .providedLine1("33 Liberty Street")
                            .providedPostalCode("94132")
                            .result(
                                DigitalWalletTokenRequest.Verification.CardholderAddress.Result
                                    .MATCH
                            )
                            .build()
                    )
                    .build()
            )
        assertThat(digitalWalletTokenRequest.visa())
            .contains(
                DigitalWalletTokenRequest.Visa.builder()
                    .networkRiskScore(26L)
                    .provisioningRiskScore(7L)
                    .build()
            )
        assertThat(digitalWalletTokenRequest.wallet())
            .isEqualTo(
                DigitalWalletTokenRequest.Wallet.builder()
                    .accountEmailAgeDays(720L)
                    .accountIdentifier("0E51EC2F85C4ABF0")
                    .accountScore(5L)
                    .deviceScore(5L)
                    .emailHash("0E51EC2F85C4ABF067DFE4B0D30A5F60899C6ACEFD700D3171E7330D542E0834")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val digitalWalletTokenRequest =
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
                .primaryAccountNumberSource(
                    DigitalWalletTokenRequest.PrimaryAccountNumberSource.KEY_ENTERED
                )
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
                                    DigitalWalletTokenRequest.Verification.CardholderAddress.Result
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

        val roundtrippedDigitalWalletTokenRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(digitalWalletTokenRequest),
                jacksonTypeRef<DigitalWalletTokenRequest>(),
            )

        assertThat(roundtrippedDigitalWalletTokenRequest).isEqualTo(digitalWalletTokenRequest)
    }
}
