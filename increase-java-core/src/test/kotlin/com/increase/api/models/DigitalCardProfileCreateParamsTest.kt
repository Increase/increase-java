// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DigitalCardProfileCreateParamsTest {

    @Test
    fun create() {
        DigitalCardProfileCreateParams.builder()
            .appIconFileId("file_8zxqkwlh43wo144u8yec")
            .backgroundImageFileId("file_1ai913suu1zfn1pdetru")
            .cardDescription("MyBank Signature Card")
            .description("My Card Profile")
            .issuerName("MyBank")
            .contactEmail("user@example.com")
            .contactPhone("+18885551212")
            .contactWebsite("https://example.com")
            .textColor(
                DigitalCardProfileCreateParams.TextColor.builder()
                    .blue(59L)
                    .green(43L)
                    .red(26L)
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            DigitalCardProfileCreateParams.builder()
                .appIconFileId("file_8zxqkwlh43wo144u8yec")
                .backgroundImageFileId("file_1ai913suu1zfn1pdetru")
                .cardDescription("MyBank Signature Card")
                .description("My Card Profile")
                .issuerName("MyBank")
                .contactEmail("user@example.com")
                .contactPhone("+18885551212")
                .contactWebsite("https://example.com")
                .textColor(
                    DigitalCardProfileCreateParams.TextColor.builder()
                        .blue(59L)
                        .green(43L)
                        .red(26L)
                        .build()
                )
                .build()
        val body = params._body()
        assertThat(body).isNotNull
        assertThat(body.appIconFileId()).isEqualTo("file_8zxqkwlh43wo144u8yec")
        assertThat(body.backgroundImageFileId()).isEqualTo("file_1ai913suu1zfn1pdetru")
        assertThat(body.cardDescription()).isEqualTo("MyBank Signature Card")
        assertThat(body.description()).isEqualTo("My Card Profile")
        assertThat(body.issuerName()).isEqualTo("MyBank")
        assertThat(body.contactEmail()).contains("user@example.com")
        assertThat(body.contactPhone()).contains("+18885551212")
        assertThat(body.contactWebsite()).contains("https://example.com")
        assertThat(body.textColor())
            .contains(
                DigitalCardProfileCreateParams.TextColor.builder()
                    .blue(59L)
                    .green(43L)
                    .red(26L)
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            DigitalCardProfileCreateParams.builder()
                .appIconFileId("file_8zxqkwlh43wo144u8yec")
                .backgroundImageFileId("file_1ai913suu1zfn1pdetru")
                .cardDescription("MyBank Signature Card")
                .description("My Card Profile")
                .issuerName("MyBank")
                .build()
        val body = params._body()
        assertThat(body).isNotNull
        assertThat(body.appIconFileId()).isEqualTo("file_8zxqkwlh43wo144u8yec")
        assertThat(body.backgroundImageFileId()).isEqualTo("file_1ai913suu1zfn1pdetru")
        assertThat(body.cardDescription()).isEqualTo("MyBank Signature Card")
        assertThat(body.description()).isEqualTo("My Card Profile")
        assertThat(body.issuerName()).isEqualTo("MyBank")
    }
}
