// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.increase.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class EntityIndustryCodeCreateParamsTest {

    @Test
    fun createEntityIndustryCodeCreateParams() {
        EntityIndustryCodeCreateParams.builder().entityId("string").industryCode("x").build()
    }

    @Test
    fun getBody() {
        val params =
            EntityIndustryCodeCreateParams.builder().entityId("string").industryCode("x").build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.industryCode()).isEqualTo("x")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            EntityIndustryCodeCreateParams.builder().entityId("string").industryCode("x").build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.industryCode()).isEqualTo("x")
    }

    @Test
    fun getPathParam() {
        val params =
            EntityIndustryCodeCreateParams.builder().entityId("string").industryCode("x").build()
        assertThat(params).isNotNull
        // path param "entityId"
        assertThat(params.getPathParam(0)).isEqualTo("string")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
