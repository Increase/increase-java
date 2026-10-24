// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.digitalcardprofiles

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DigitalCardProfileCloneParamsTest {

    @Test
    fun create() {
        DigitalCardProfileCloneParams.builder()
            .digitalCardProfileId("digital_card_profile_s3puplu90f04xhcwkiga")
            .appIconFileId("app_icon_file_id")
            .applePay(
                DigitalCardProfileCloneParams.ApplePay.builder()
                    .addAssociatedApplicationIdentifier(
                        DigitalCardProfileCloneParams.ApplePay.AssociatedApplicationIdentifier
                            .builder()
                            .identifier(
                                "210B9798AD.---aH0O-6L.8tjDQ-3.-K-h.8asJ.WN--u-kX-Q.l3VU-F.-i-5p54n-N"
                            )
                            .build()
                    )
                    .addAssociatedStoreIdentifier(
                        DigitalCardProfileCloneParams.ApplePay.AssociatedStoreIdentifier.builder()
                            .identifier("26")
                            .build()
                    )
                    .build()
            )
            .backgroundImageFileId("file_1ai913suu1zfn1pdetru")
            .cardDescription("x")
            .contactEmail("dev@stainless.com")
            .contactName("x")
            .contactPhone("x")
            .contactWebsite("contact_website")
            .description("x")
            .textColor(
                DigitalCardProfileCloneParams.TextColor.builder().blue(0L).green(0L).red(0L).build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            DigitalCardProfileCloneParams.builder()
                .digitalCardProfileId("digital_card_profile_s3puplu90f04xhcwkiga")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("digital_card_profile_s3puplu90f04xhcwkiga")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            DigitalCardProfileCloneParams.builder()
                .digitalCardProfileId("digital_card_profile_s3puplu90f04xhcwkiga")
                .appIconFileId("app_icon_file_id")
                .applePay(
                    DigitalCardProfileCloneParams.ApplePay.builder()
                        .addAssociatedApplicationIdentifier(
                            DigitalCardProfileCloneParams.ApplePay.AssociatedApplicationIdentifier
                                .builder()
                                .identifier(
                                    "210B9798AD.---aH0O-6L.8tjDQ-3.-K-h.8asJ.WN--u-kX-Q.l3VU-F.-i-5p54n-N"
                                )
                                .build()
                        )
                        .addAssociatedStoreIdentifier(
                            DigitalCardProfileCloneParams.ApplePay.AssociatedStoreIdentifier
                                .builder()
                                .identifier("26")
                                .build()
                        )
                        .build()
                )
                .backgroundImageFileId("file_1ai913suu1zfn1pdetru")
                .cardDescription("x")
                .contactEmail("dev@stainless.com")
                .contactName("x")
                .contactPhone("x")
                .contactWebsite("contact_website")
                .description("x")
                .textColor(
                    DigitalCardProfileCloneParams.TextColor.builder()
                        .blue(0L)
                        .green(0L)
                        .red(0L)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.appIconFileId()).contains("app_icon_file_id")
        assertThat(body.applePay())
            .contains(
                DigitalCardProfileCloneParams.ApplePay.builder()
                    .addAssociatedApplicationIdentifier(
                        DigitalCardProfileCloneParams.ApplePay.AssociatedApplicationIdentifier
                            .builder()
                            .identifier(
                                "210B9798AD.---aH0O-6L.8tjDQ-3.-K-h.8asJ.WN--u-kX-Q.l3VU-F.-i-5p54n-N"
                            )
                            .build()
                    )
                    .addAssociatedStoreIdentifier(
                        DigitalCardProfileCloneParams.ApplePay.AssociatedStoreIdentifier.builder()
                            .identifier("26")
                            .build()
                    )
                    .build()
            )
        assertThat(body.backgroundImageFileId()).contains("file_1ai913suu1zfn1pdetru")
        assertThat(body.cardDescription()).contains("x")
        assertThat(body.contactEmail()).contains("dev@stainless.com")
        assertThat(body.contactName()).contains("x")
        assertThat(body.contactPhone()).contains("x")
        assertThat(body.contactWebsite()).contains("contact_website")
        assertThat(body.description()).contains("x")
        assertThat(body.textColor())
            .contains(
                DigitalCardProfileCloneParams.TextColor.builder().blue(0L).green(0L).red(0L).build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            DigitalCardProfileCloneParams.builder()
                .digitalCardProfileId("digital_card_profile_s3puplu90f04xhcwkiga")
                .build()

        val body = params._body()
    }
}
