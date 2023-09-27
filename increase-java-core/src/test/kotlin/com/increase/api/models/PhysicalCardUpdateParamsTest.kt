package com.increase.api.models

import com.increase.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PhysicalCardUpdateParamsTest {

    @Test
    fun createPhysicalCardUpdateParams() {
        PhysicalCardUpdateParams.builder()
            .physicalCardId("string")
            .status(PhysicalCardUpdateParams.Status.ACTIVE)
            .build()
    }

    @Test
    fun getBody() {
        val params =
            PhysicalCardUpdateParams.builder()
                .physicalCardId("string")
                .status(PhysicalCardUpdateParams.Status.ACTIVE)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.status()).isEqualTo(PhysicalCardUpdateParams.Status.ACTIVE)
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            PhysicalCardUpdateParams.builder()
                .physicalCardId("string")
                .status(PhysicalCardUpdateParams.Status.ACTIVE)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.status()).isEqualTo(PhysicalCardUpdateParams.Status.ACTIVE)
    }

    @Test
    fun getPathParam() {
        val params =
            PhysicalCardUpdateParams.builder()
                .physicalCardId("string")
                .status(PhysicalCardUpdateParams.Status.ACTIVE)
                .build()
        assertThat(params).isNotNull
        // path param "physicalCardId"
        assertThat(params.getPathParam(0)).isEqualTo("string")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
