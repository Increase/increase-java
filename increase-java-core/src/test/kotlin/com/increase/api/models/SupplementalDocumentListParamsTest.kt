// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.increase.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SupplementalDocumentListParamsTest {

    @Test
    fun createSupplementalDocumentListParams() {
        SupplementalDocumentListParams.builder()
            .entityId("entity_id")
            .cursor("cursor")
            .idempotencyKey("x")
            .limit(1L)
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            SupplementalDocumentListParams.builder()
                .entityId("entity_id")
                .cursor("cursor")
                .idempotencyKey("x")
                .limit(1L)
                .build()
        val expected = QueryParams.builder()
        expected.put("entity_id", "entity_id")
        expected.put("cursor", "cursor")
        expected.put("idempotency_key", "x")
        expected.put("limit", "1")
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = SupplementalDocumentListParams.builder().entityId("entity_id").build()
        val expected = QueryParams.builder()
        expected.put("entity_id", "entity_id")
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }
}
