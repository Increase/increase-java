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
                .outcome(DigitalWalletTokenRequest.Outcome.PROVISIONED)
                .provisioned(
                    DigitalWalletTokenRequest.Provisioned.builder()
                        .digitalWalletTokenId("digital_wallet_token_izi62go3h51p369jrie0")
                        .build()
                )
                .tokenReferenceIdentifier("DNITHE000000000000000000000")
                .tokenRequestor(DigitalWalletTokenRequest.TokenRequestor.APPLE_PAY)
                .type(DigitalWalletTokenRequest.Type.DIGITAL_WALLET_TOKEN_REQUEST)
                .build()

        assertThat(digitalWalletTokenRequest.id())
            .isEqualTo("digital_wallet_token_request_dlsq0yabf7ev4xvke6ek")
        assertThat(digitalWalletTokenRequest.cardId()).isEqualTo("card_oubs0hwk5rn6knuecxg2")
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
        assertThat(digitalWalletTokenRequest.outcome())
            .isEqualTo(DigitalWalletTokenRequest.Outcome.PROVISIONED)
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
        assertThat(digitalWalletTokenRequest.type())
            .isEqualTo(DigitalWalletTokenRequest.Type.DIGITAL_WALLET_TOKEN_REQUEST)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val digitalWalletTokenRequest =
            DigitalWalletTokenRequest.builder()
                .id("digital_wallet_token_request_dlsq0yabf7ev4xvke6ek")
                .cardId("card_oubs0hwk5rn6knuecxg2")
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
                .outcome(DigitalWalletTokenRequest.Outcome.PROVISIONED)
                .provisioned(
                    DigitalWalletTokenRequest.Provisioned.builder()
                        .digitalWalletTokenId("digital_wallet_token_izi62go3h51p369jrie0")
                        .build()
                )
                .tokenReferenceIdentifier("DNITHE000000000000000000000")
                .tokenRequestor(DigitalWalletTokenRequest.TokenRequestor.APPLE_PAY)
                .type(DigitalWalletTokenRequest.Type.DIGITAL_WALLET_TOKEN_REQUEST)
                .build()

        val roundtrippedDigitalWalletTokenRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(digitalWalletTokenRequest),
                jacksonTypeRef<DigitalWalletTokenRequest>(),
            )

        assertThat(roundtrippedDigitalWalletTokenRequest).isEqualTo(digitalWalletTokenRequest)
    }
}
