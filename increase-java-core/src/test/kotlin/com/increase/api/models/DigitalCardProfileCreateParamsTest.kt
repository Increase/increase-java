// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DigitalCardProfileCreateParamsTest {

    @Test
    fun createDigitalCardProfileCreateParams() {
        DigitalCardProfileCreateParams.builder()
            .appIconFileId("app_icon_file_id")
            .backgroundImageFileId("background_image_file_id")
            .cardDescription("x")
            .description("x")
            .issuerName("x")
            .contactEmail("x")
            .contactPhone("x")
            .contactWebsite("contact_website")
            .textColor(
                DigitalCardProfileCreateParams.TextColor.builder()
                    .blue(0L)
                    .green(0L)
                    .red(0L)
                    .build()
            )
            .build()
    }

    @Test
    fun getBody() {
        val params =
            DigitalCardProfileCreateParams.builder()
                .appIconFileId("app_icon_file_id")
                .backgroundImageFileId("background_image_file_id")
                .cardDescription("x")
                .description("x")
                .issuerName("x")
                .contactEmail("x")
                .contactPhone("x")
                .contactWebsite("contact_website")
                .textColor(
                    DigitalCardProfileCreateParams.TextColor.builder()
                        .blue(0L)
                        .green(0L)
                        .red(0L)
                        .build()
                )
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.appIconFileId()).isEqualTo("app_icon_file_id")
        assertThat(body.backgroundImageFileId()).isEqualTo("background_image_file_id")
        assertThat(body.cardDescription()).isEqualTo("x")
        assertThat(body.description()).isEqualTo("x")
        assertThat(body.issuerName()).isEqualTo("x")
        assertThat(body.contactEmail()).isEqualTo("x")
        assertThat(body.contactPhone()).isEqualTo("x")
        assertThat(body.contactWebsite()).isEqualTo("contact_website")
        assertThat(body.textColor())
            .isEqualTo(
                DigitalCardProfileCreateParams.TextColor.builder()
                    .blue(0L)
                    .green(0L)
                    .red(0L)
                    .build()
            )
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            DigitalCardProfileCreateParams.builder()
                .appIconFileId("app_icon_file_id")
                .backgroundImageFileId("background_image_file_id")
                .cardDescription("x")
                .description("x")
                .issuerName("x")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.appIconFileId()).isEqualTo("app_icon_file_id")
        assertThat(body.backgroundImageFileId()).isEqualTo("background_image_file_id")
        assertThat(body.cardDescription()).isEqualTo("x")
        assertThat(body.description()).isEqualTo("x")
        assertThat(body.issuerName()).isEqualTo("x")
    }
}
