// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.increase.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class IntrafiExclusionListParamsTest {

    @Test
    fun create() {
        IntrafiExclusionListParams.builder()
            .cursor("cursor")
            .entityId("entity_id")
            .idempotencyKey("x")
            .limit(1L)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            IntrafiExclusionListParams.builder()
                .cursor("cursor")
                .entityId("entity_id")
                .idempotencyKey("x")
                .limit(1L)
                .build()
        val expected = QueryParams.builder()
        expected.put("cursor", "cursor")
        expected.put("entity_id", "entity_id")
        expected.put("idempotency_key", "x")
        expected.put("limit", "1")
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = IntrafiExclusionListParams.builder().build()
        val expected = QueryParams.builder()
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }
}
