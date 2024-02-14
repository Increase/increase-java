// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.increase.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class EntitySupplementalDocumentListParamsTest {

    @Test
    fun createEntitySupplementalDocumentListParams() {
        EntitySupplementalDocumentListParams.builder()
            .entityId("string")
            .cursor("string")
            .idempotencyKey("x")
            .limit(123L)
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            EntitySupplementalDocumentListParams.builder()
                .entityId("string")
                .cursor("string")
                .idempotencyKey("x")
                .limit(123L)
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("entity_id", listOf("string"))
        expected.put("cursor", listOf("string"))
        expected.put("idempotency_key", listOf("x"))
        expected.put("limit", listOf("123"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = EntitySupplementalDocumentListParams.builder().entityId("string").build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("entity_id", listOf("string"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }
}
