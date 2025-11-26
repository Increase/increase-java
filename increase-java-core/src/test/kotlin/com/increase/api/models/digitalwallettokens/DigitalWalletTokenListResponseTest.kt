// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.digitalwallettokens

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.increase.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DigitalWalletTokenListResponseTest {

    @Test
    fun create() {
        val digitalWalletTokenListResponse =
            DigitalWalletTokenListResponse.builder()
                .addData(
                    DigitalWalletToken.builder()
                        .id("digital_wallet_token_izi62go3h51p369jrie0")
                        .cardId("card_oubs0hwk5rn6knuecxg2")
                        .cardholder(
                            DigitalWalletToken.Cardholder.builder().name("John Smith").build()
                        )
                        .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .device(
                            DigitalWalletToken.Device.builder()
                                .deviceType(DigitalWalletToken.Device.DeviceType.MOBILE_PHONE)
                                .identifier("04393EADF4149002225811273840459271E36516DA4875FF")
                                .ipAddress("1.2.3.4")
                                .name("My Work Phone")
                                .build()
                        )
                        .status(DigitalWalletToken.Status.ACTIVE)
                        .tokenRequestor(DigitalWalletToken.TokenRequestor.APPLE_PAY)
                        .type(DigitalWalletToken.Type.DIGITAL_WALLET_TOKEN)
                        .addUpdate(
                            DigitalWalletToken.Update.builder()
                                .status(DigitalWalletToken.Update.Status.INACTIVE)
                                .timestamp(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                                .build()
                        )
                        .build()
                )
                .nextCursor("v57w5d")
                .build()

        assertThat(digitalWalletTokenListResponse.data())
            .containsExactly(
                DigitalWalletToken.builder()
                    .id("digital_wallet_token_izi62go3h51p369jrie0")
                    .cardId("card_oubs0hwk5rn6knuecxg2")
                    .cardholder(DigitalWalletToken.Cardholder.builder().name("John Smith").build())
                    .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                    .device(
                        DigitalWalletToken.Device.builder()
                            .deviceType(DigitalWalletToken.Device.DeviceType.MOBILE_PHONE)
                            .identifier("04393EADF4149002225811273840459271E36516DA4875FF")
                            .ipAddress("1.2.3.4")
                            .name("My Work Phone")
                            .build()
                    )
                    .status(DigitalWalletToken.Status.ACTIVE)
                    .tokenRequestor(DigitalWalletToken.TokenRequestor.APPLE_PAY)
                    .type(DigitalWalletToken.Type.DIGITAL_WALLET_TOKEN)
                    .addUpdate(
                        DigitalWalletToken.Update.builder()
                            .status(DigitalWalletToken.Update.Status.INACTIVE)
                            .timestamp(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                            .build()
                    )
                    .build()
            )
        assertThat(digitalWalletTokenListResponse.nextCursor()).contains("v57w5d")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val digitalWalletTokenListResponse =
            DigitalWalletTokenListResponse.builder()
                .addData(
                    DigitalWalletToken.builder()
                        .id("digital_wallet_token_izi62go3h51p369jrie0")
                        .cardId("card_oubs0hwk5rn6knuecxg2")
                        .cardholder(
                            DigitalWalletToken.Cardholder.builder().name("John Smith").build()
                        )
                        .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .device(
                            DigitalWalletToken.Device.builder()
                                .deviceType(DigitalWalletToken.Device.DeviceType.MOBILE_PHONE)
                                .identifier("04393EADF4149002225811273840459271E36516DA4875FF")
                                .ipAddress("1.2.3.4")
                                .name("My Work Phone")
                                .build()
                        )
                        .status(DigitalWalletToken.Status.ACTIVE)
                        .tokenRequestor(DigitalWalletToken.TokenRequestor.APPLE_PAY)
                        .type(DigitalWalletToken.Type.DIGITAL_WALLET_TOKEN)
                        .addUpdate(
                            DigitalWalletToken.Update.builder()
                                .status(DigitalWalletToken.Update.Status.INACTIVE)
                                .timestamp(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                                .build()
                        )
                        .build()
                )
                .nextCursor("v57w5d")
                .build()

        val roundtrippedDigitalWalletTokenListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(digitalWalletTokenListResponse),
                jacksonTypeRef<DigitalWalletTokenListResponse>(),
            )

        assertThat(roundtrippedDigitalWalletTokenListResponse)
            .isEqualTo(digitalWalletTokenListResponse)
    }
}
