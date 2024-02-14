// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.increase.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DigitalCardProfileCloneParamsTest {

    @Test
    fun createDigitalCardProfileCloneParams() {
        DigitalCardProfileCloneParams.builder()
            .digitalCardProfileId("string")
            .appIconFileId("string")
            .backgroundImageFileId("string")
            .cardDescription("x")
            .contactEmail("x")
            .contactPhone("x")
            .contactWebsite("string")
            .description("x")
            .issuerName("x")
            .textColor(
                DigitalCardProfileCloneParams.TextColor.builder()
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
            DigitalCardProfileCloneParams.builder()
                .digitalCardProfileId("string")
                .appIconFileId("string")
                .backgroundImageFileId("string")
                .cardDescription("x")
                .contactEmail("x")
                .contactPhone("x")
                .contactWebsite("string")
                .description("x")
                .issuerName("x")
                .textColor(
                    DigitalCardProfileCloneParams.TextColor.builder()
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
        assertThat(body.contactEmail()).isEqualTo("x")
        assertThat(body.contactPhone()).isEqualTo("x")
        assertThat(body.contactWebsite()).isEqualTo("string")
        assertThat(body.description()).isEqualTo("x")
        assertThat(body.issuerName()).isEqualTo("x")
        assertThat(body.textColor())
            .isEqualTo(
                DigitalCardProfileCloneParams.TextColor.builder()
                    .blue(123L)
                    .green(123L)
                    .red(123L)
                    .build()
            )
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = DigitalCardProfileCloneParams.builder().digitalCardProfileId("string").build()
        val body = params.getBody()
        assertThat(body).isNotNull
    }

    @Test
    fun getPathParam() {
        val params = DigitalCardProfileCloneParams.builder().digitalCardProfileId("string").build()
        assertThat(params).isNotNull
        // path param "digitalCardProfileId"
        assertThat(params.getPathParam(0)).isEqualTo("string")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
