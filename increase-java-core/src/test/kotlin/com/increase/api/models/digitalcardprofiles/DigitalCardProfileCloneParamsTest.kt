// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.digitalcardprofiles

import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DigitalCardProfileCloneParamsTest {

    @Test
    fun create() {
        DigitalCardProfileCloneParams.builder()
            .digitalCardProfileId("digital_card_profile_s3puplu90f04xhcwkiga")
            .appIconFileId("app_icon_file_id")
            .backgroundImageFileId("file_1ai913suu1zfn1pdetru")
            .cardDescription("x")
            .contactEmail("x")
            .contactPhone("x")
            .contactWebsite("contact_website")
            .description("x")
            .issuerName("x")
            .textColor(
                DigitalCardProfileCloneParams.TextColor.builder().blue(0L).green(0L).red(0L).build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            DigitalCardProfileCloneParams.builder()
                .digitalCardProfileId("digital_card_profile_s3puplu90f04xhcwkiga")
                .appIconFileId("app_icon_file_id")
                .backgroundImageFileId("file_1ai913suu1zfn1pdetru")
                .cardDescription("x")
                .contactEmail("x")
                .contactPhone("x")
                .contactWebsite("contact_website")
                .description("x")
                .issuerName("x")
                .textColor(
                    DigitalCardProfileCloneParams.TextColor.builder()
                        .blue(0L)
                        .green(0L)
                        .red(0L)
                        .build()
                )
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.appIconFileId()).contains("app_icon_file_id")
        assertThat(body.backgroundImageFileId()).contains("file_1ai913suu1zfn1pdetru")
        assertThat(body.cardDescription()).contains("x")
        assertThat(body.contactEmail()).contains("x")
        assertThat(body.contactPhone()).contains("x")
        assertThat(body.contactWebsite()).contains("contact_website")
        assertThat(body.description()).contains("x")
        assertThat(body.issuerName()).contains("x")
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

        assertNotNull(body)
    }

    @Test
    fun getPathParam() {
        val params =
            DigitalCardProfileCloneParams.builder()
                .digitalCardProfileId("digital_card_profile_s3puplu90f04xhcwkiga")
                .build()
        assertThat(params).isNotNull
        // path param "digitalCardProfileId"
        assertThat(params.getPathParam(0)).isEqualTo("digital_card_profile_s3puplu90f04xhcwkiga")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
