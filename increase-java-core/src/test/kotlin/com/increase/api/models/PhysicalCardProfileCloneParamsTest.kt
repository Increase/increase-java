// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.increase.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PhysicalCardProfileCloneParamsTest {

    @Test
    fun createPhysicalCardProfileCloneParams() {
        PhysicalCardProfileCloneParams.builder()
            .physicalCardProfileId("string")
            .carrierImageFileId("string")
            .contactPhone("x")
            .description("x")
            .frontImageFileId("string")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            PhysicalCardProfileCloneParams.builder()
                .physicalCardProfileId("string")
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
            PhysicalCardProfileCloneParams.builder().physicalCardProfileId("string").build()
        val body = params.getBody()
        assertThat(body).isNotNull
    }

    @Test
    fun getPathParam() {
        val params =
            PhysicalCardProfileCloneParams.builder().physicalCardProfileId("string").build()
        assertThat(params).isNotNull
        // path param "physicalCardProfileId"
        assertThat(params.getPathParam(0)).isEqualTo("string")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
