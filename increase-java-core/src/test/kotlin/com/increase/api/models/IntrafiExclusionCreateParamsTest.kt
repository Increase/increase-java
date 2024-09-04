// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.increase.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class IntrafiExclusionCreateParamsTest {

    @Test
    fun createIntrafiExclusionCreateParams() {
        IntrafiExclusionCreateParams.builder().bankName("x").entityId("entity_id").build()
    }

    @Test
    fun getBody() {
        val params =
            IntrafiExclusionCreateParams.builder().bankName("x").entityId("entity_id").build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.bankName()).isEqualTo("x")
        assertThat(body.entityId()).isEqualTo("entity_id")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            IntrafiExclusionCreateParams.builder().bankName("x").entityId("entity_id").build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.bankName()).isEqualTo("x")
        assertThat(body.entityId()).isEqualTo("entity_id")
    }
}
