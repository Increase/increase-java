// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PhysicalCardProfileCreateParamsTest {

    @Test
    fun createPhysicalCardProfileCreateParams() {
        PhysicalCardProfileCreateParams.builder()
            .carrierImageFileId("carrier_image_file_id")
            .contactPhone("x")
            .description("x")
            .frontImageFileId("front_image_file_id")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            PhysicalCardProfileCreateParams.builder()
                .carrierImageFileId("carrier_image_file_id")
                .contactPhone("x")
                .description("x")
                .frontImageFileId("front_image_file_id")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.carrierImageFileId()).isEqualTo("carrier_image_file_id")
        assertThat(body.contactPhone()).isEqualTo("x")
        assertThat(body.description()).isEqualTo("x")
        assertThat(body.frontImageFileId()).isEqualTo("front_image_file_id")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            PhysicalCardProfileCreateParams.builder()
                .carrierImageFileId("carrier_image_file_id")
                .contactPhone("x")
                .description("x")
                .frontImageFileId("front_image_file_id")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.carrierImageFileId()).isEqualTo("carrier_image_file_id")
        assertThat(body.contactPhone()).isEqualTo("x")
        assertThat(body.description()).isEqualTo("x")
        assertThat(body.frontImageFileId()).isEqualTo("front_image_file_id")
    }
}
