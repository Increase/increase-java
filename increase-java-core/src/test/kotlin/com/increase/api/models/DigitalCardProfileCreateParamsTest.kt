// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.increase.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DigitalCardProfileCreateParamsTest {

    @Test
    fun createDigitalCardProfileCreateParams() {
        DigitalCardProfileCreateParams.builder()
            .appIconFileId("string")
            .backgroundImageFileId("string")
            .cardDescription("x")
            .description("x")
            .issuerName("x")
            .contactEmail("x")
            .contactPhone("x")
            .contactWebsite("string")
            .textColor(
                DigitalCardProfileCreateParams.TextColor.builder()
                    .blue(123L)
                    .green(123L)
                    .red(123L)
                    .build()
            )
            .build()
    }

    @Test
    fun getBody() {
        val params =
            DigitalCardProfileCreateParams.builder()
                .appIconFileId("string")
                .backgroundImageFileId("string")
                .cardDescription("x")
                .description("x")
                .issuerName("x")
                .contactEmail("x")
                .contactPhone("x")
                .contactWebsite("string")
                .textColor(
                    DigitalCardProfileCreateParams.TextColor.builder()
                        .blue(123L)
                        .green(123L)
                        .red(123L)
                        .build()
                )
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.appIconFileId()).isEqualTo("string")
        assertThat(body.backgroundImageFileId()).isEqualTo("string")
        assertThat(body.cardDescription()).isEqualTo("x")
        assertThat(body.description()).isEqualTo("x")
        assertThat(body.issuerName()).isEqualTo("x")
        assertThat(body.contactEmail()).isEqualTo("x")
        assertThat(body.contactPhone()).isEqualTo("x")
        assertThat(body.contactWebsite()).isEqualTo("string")
        assertThat(body.textColor())
            .isEqualTo(
                DigitalCardProfileCreateParams.TextColor.builder()
                    .blue(123L)
                    .green(123L)
                    .red(123L)
                    .build()
            )
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            DigitalCardProfileCreateParams.builder()
                .appIconFileId("string")
                .backgroundImageFileId("string")
                .cardDescription("x")
                .description("x")
                .issuerName("x")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.appIconFileId()).isEqualTo("string")
        assertThat(body.backgroundImageFileId()).isEqualTo("string")
        assertThat(body.cardDescription()).isEqualTo("x")
        assertThat(body.description()).isEqualTo("x")
        assertThat(body.issuerName()).isEqualTo("x")
    }
}
