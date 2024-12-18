// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class EntityUpdateIndustryCodeParamsTest {

    @Test
    fun createEntityUpdateIndustryCodeParams() {
        EntityUpdateIndustryCodeParams.builder().entityId("entity_id").industryCode("x").build()
    }

    @Test
    fun getBody() {
        val params =
            EntityUpdateIndustryCodeParams.builder().entityId("entity_id").industryCode("x").build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.industryCode()).isEqualTo("x")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            EntityUpdateIndustryCodeParams.builder().entityId("entity_id").industryCode("x").build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.industryCode()).isEqualTo("x")
    }

    @Test
    fun getPathParam() {
        val params =
            EntityUpdateIndustryCodeParams.builder().entityId("entity_id").industryCode("x").build()
        assertThat(params).isNotNull
        // path param "entityId"
        assertThat(params.getPathParam(0)).isEqualTo("entity_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
