// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class EntityUpdateIndustryCodeParamsTest {

    @Test
    fun create() {
        EntityUpdateIndustryCodeParams.builder()
            .entityId("entity_n8y8tnk2p9339ti393yi")
            .industryCode("5132")
            .build()
    }

    @Test
    fun body() {
        val params =
            EntityUpdateIndustryCodeParams.builder()
                .entityId("entity_n8y8tnk2p9339ti393yi")
                .industryCode("5132")
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.industryCode()).isEqualTo("5132")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            EntityUpdateIndustryCodeParams.builder()
                .entityId("entity_n8y8tnk2p9339ti393yi")
                .industryCode("5132")
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.industryCode()).isEqualTo("5132")
    }

    @Test
    fun getPathParam() {
        val params =
            EntityUpdateIndustryCodeParams.builder()
                .entityId("entity_n8y8tnk2p9339ti393yi")
                .industryCode("5132")
                .build()
        assertThat(params).isNotNull
        // path param "entityId"
        assertThat(params.getPathParam(0)).isEqualTo("entity_n8y8tnk2p9339ti393yi")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
