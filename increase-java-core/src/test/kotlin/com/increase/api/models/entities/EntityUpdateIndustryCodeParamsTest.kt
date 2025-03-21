// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.entities

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EntityUpdateIndustryCodeParamsTest {

    @Test
    fun create() {
        EntityUpdateIndustryCodeParams.builder()
            .entityId("entity_n8y8tnk2p9339ti393yi")
            .industryCode("5132")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            EntityUpdateIndustryCodeParams.builder()
                .entityId("entity_n8y8tnk2p9339ti393yi")
                .industryCode("5132")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("entity_n8y8tnk2p9339ti393yi")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            EntityUpdateIndustryCodeParams.builder()
                .entityId("entity_n8y8tnk2p9339ti393yi")
                .industryCode("5132")
                .build()

        val body = params._body()

        assertThat(body.industryCode()).isEqualTo("5132")
    }
}
