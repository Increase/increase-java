// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.increase.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CardProfileCreateParamsTest {

    @Test
    fun createCardProfileCreateParams() {
        CardProfileCreateParams.builder()
            .description("x")
            .digitalWallets(
                CardProfileCreateParams.DigitalWallets.builder()
                    .appIconFileId("string")
                    .backgroundImageFileId("string")
                    .cardDescription("x")
                    .issuerName("x")
                    .contactEmail("x")
                    .contactPhone("x")
                    .contactWebsite("string")
                    .textColor(
                        CardProfileCreateParams.DigitalWallets.TextColor.builder()
                            .blue(123L)
                            .green(123L)
                            .red(123L)
                            .build()
                    )
                    .build()
            )
            .physicalCards(
                CardProfileCreateParams.PhysicalCards.builder()
                    .carrierImageFileId("string")
                    .contactPhone("x")
                    .frontImageFileId("string")
                    .build()
            )
            .build()
    }

    @Test
    fun getBody() {
        val params =
            CardProfileCreateParams.builder()
                .description("x")
                .digitalWallets(
                    CardProfileCreateParams.DigitalWallets.builder()
                        .appIconFileId("string")
                        .backgroundImageFileId("string")
                        .cardDescription("x")
                        .issuerName("x")
                        .contactEmail("x")
                        .contactPhone("x")
                        .contactWebsite("string")
                        .textColor(
                            CardProfileCreateParams.DigitalWallets.TextColor.builder()
                                .blue(123L)
                                .green(123L)
                                .red(123L)
                                .build()
                        )
                        .build()
                )
                .physicalCards(
                    CardProfileCreateParams.PhysicalCards.builder()
                        .carrierImageFileId("string")
                        .contactPhone("x")
                        .frontImageFileId("string")
                        .build()
                )
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.description()).isEqualTo("x")
        assertThat(body.digitalWallets())
            .isEqualTo(
                CardProfileCreateParams.DigitalWallets.builder()
                    .appIconFileId("string")
                    .backgroundImageFileId("string")
                    .cardDescription("x")
                    .issuerName("x")
                    .contactEmail("x")
                    .contactPhone("x")
                    .contactWebsite("string")
                    .textColor(
                        CardProfileCreateParams.DigitalWallets.TextColor.builder()
                            .blue(123L)
                            .green(123L)
                            .red(123L)
                            .build()
                    )
                    .build()
            )
        assertThat(body.physicalCards())
            .isEqualTo(
                CardProfileCreateParams.PhysicalCards.builder()
                    .carrierImageFileId("string")
                    .contactPhone("x")
                    .frontImageFileId("string")
                    .build()
            )
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            CardProfileCreateParams.builder()
                .description("x")
                .digitalWallets(
                    CardProfileCreateParams.DigitalWallets.builder()
                        .appIconFileId("string")
                        .backgroundImageFileId("string")
                        .cardDescription("x")
                        .issuerName("x")
                        .build()
                )
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.description()).isEqualTo("x")
        assertThat(body.digitalWallets())
            .isEqualTo(
                CardProfileCreateParams.DigitalWallets.builder()
                    .appIconFileId("string")
                    .backgroundImageFileId("string")
                    .cardDescription("x")
                    .issuerName("x")
                    .build()
            )
    }
}
