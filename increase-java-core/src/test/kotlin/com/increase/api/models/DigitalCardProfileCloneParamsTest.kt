// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DigitalCardProfileCloneParamsTest {

    @Test
    fun createDigitalCardProfileCloneParams() {
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
    fun getBody() {
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
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.appIconFileId()).isEqualTo("app_icon_file_id")
        assertThat(body.backgroundImageFileId()).isEqualTo("file_1ai913suu1zfn1pdetru")
        assertThat(body.cardDescription()).isEqualTo("x")
        assertThat(body.contactEmail()).isEqualTo("x")
        assertThat(body.contactPhone()).isEqualTo("x")
        assertThat(body.contactWebsite()).isEqualTo("contact_website")
        assertThat(body.description()).isEqualTo("x")
        assertThat(body.issuerName()).isEqualTo("x")
        assertThat(body.textColor())
            .isEqualTo(
                DigitalCardProfileCloneParams.TextColor.builder().blue(0L).green(0L).red(0L).build()
            )
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            DigitalCardProfileCloneParams.builder()
                .digitalCardProfileId("digital_card_profile_s3puplu90f04xhcwkiga")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
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
