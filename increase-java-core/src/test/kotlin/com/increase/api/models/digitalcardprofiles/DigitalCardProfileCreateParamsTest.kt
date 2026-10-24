// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.digitalcardprofiles

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DigitalCardProfileCreateParamsTest {

    @Test
    fun create() {
        DigitalCardProfileCreateParams.builder()
            .appIconFileId("file_8zxqkwlh43wo144u8yec")
            .backgroundImageFileId("file_1ai913suu1zfn1pdetru")
            .cardDescription("National Phonograph Card")
            .description("My Card Profile")
            .applePay(
                DigitalCardProfileCreateParams.ApplePay.builder()
                    .addAssociatedApplicationIdentifier(
                        DigitalCardProfileCreateParams.ApplePay.AssociatedApplicationIdentifier
                            .builder()
                            .identifier(
                                "210B9798AD.---aH0O-6L.8tjDQ-3.-K-h.8asJ.WN--u-kX-Q.l3VU-F.-i-5p54n-N"
                            )
                            .build()
                    )
                    .addAssociatedStoreIdentifier(
                        DigitalCardProfileCreateParams.ApplePay.AssociatedStoreIdentifier.builder()
                            .identifier("26")
                            .build()
                    )
                    .build()
            )
            .contactEmail("user@example.com")
            .contactName("National Phonograph Company")
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
                .cardDescription("National Phonograph Card")
                .description("My Card Profile")
                .applePay(
                    DigitalCardProfileCreateParams.ApplePay.builder()
                        .addAssociatedApplicationIdentifier(
                            DigitalCardProfileCreateParams.ApplePay.AssociatedApplicationIdentifier
                                .builder()
                                .identifier(
                                    "210B9798AD.---aH0O-6L.8tjDQ-3.-K-h.8asJ.WN--u-kX-Q.l3VU-F.-i-5p54n-N"
                                )
                                .build()
                        )
                        .addAssociatedStoreIdentifier(
                            DigitalCardProfileCreateParams.ApplePay.AssociatedStoreIdentifier
                                .builder()
                                .identifier("26")
                                .build()
                        )
                        .build()
                )
                .contactEmail("user@example.com")
                .contactName("National Phonograph Company")
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

        assertThat(body.appIconFileId()).isEqualTo("file_8zxqkwlh43wo144u8yec")
        assertThat(body.backgroundImageFileId()).isEqualTo("file_1ai913suu1zfn1pdetru")
        assertThat(body.cardDescription()).isEqualTo("National Phonograph Card")
        assertThat(body.description()).isEqualTo("My Card Profile")
        assertThat(body.applePay())
            .contains(
                DigitalCardProfileCreateParams.ApplePay.builder()
                    .addAssociatedApplicationIdentifier(
                        DigitalCardProfileCreateParams.ApplePay.AssociatedApplicationIdentifier
                            .builder()
                            .identifier(
                                "210B9798AD.---aH0O-6L.8tjDQ-3.-K-h.8asJ.WN--u-kX-Q.l3VU-F.-i-5p54n-N"
                            )
                            .build()
                    )
                    .addAssociatedStoreIdentifier(
                        DigitalCardProfileCreateParams.ApplePay.AssociatedStoreIdentifier.builder()
                            .identifier("26")
                            .build()
                    )
                    .build()
            )
        assertThat(body.contactEmail()).contains("user@example.com")
        assertThat(body.contactName()).contains("National Phonograph Company")
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
                .cardDescription("National Phonograph Card")
                .description("My Card Profile")
                .build()

        val body = params._body()

        assertThat(body.appIconFileId()).isEqualTo("file_8zxqkwlh43wo144u8yec")
        assertThat(body.backgroundImageFileId()).isEqualTo("file_1ai913suu1zfn1pdetru")
        assertThat(body.cardDescription()).isEqualTo("National Phonograph Card")
        assertThat(body.description()).isEqualTo("My Card Profile")
    }
}
