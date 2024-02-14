// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.increase.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PhysicalCardProfileCreateParamsTest {

    @Test
    fun createPhysicalCardProfileCreateParams() {
        PhysicalCardProfileCreateParams.builder()
            .carrierImageFileId("string")
            .contactPhone("x")
            .description("x")
            .frontImageFileId("string")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            PhysicalCardProfileCreateParams.builder()
                .carrierImageFileId("string")
                .contactPhone("x")
                .description("x")
                .frontImageFileId("string")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.carrierImageFileId()).isEqualTo("string")
        assertThat(body.contactPhone()).isEqualTo("x")
        assertThat(body.description()).isEqualTo("x")
        assertThat(body.frontImageFileId()).isEqualTo("string")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            PhysicalCardProfileCreateParams.builder()
                .carrierImageFileId("string")
                .contactPhone("x")
                .description("x")
                .frontImageFileId("string")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.carrierImageFileId()).isEqualTo("string")
        assertThat(body.contactPhone()).isEqualTo("x")
        assertThat(body.description()).isEqualTo("x")
        assertThat(body.frontImageFileId()).isEqualTo("string")
    }
}
