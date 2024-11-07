// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.increase.api.core.http.QueryParams
import com.increase.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class IntrafiExclusionListParamsTest {

    @Test
    fun createIntrafiExclusionListParams() {
        IntrafiExclusionListParams.builder()
            .cursor("cursor")
            .entityId("entity_id")
            .idempotencyKey("x")
            .limit(123L)
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            IntrafiExclusionListParams.builder()
                .cursor("cursor")
                .entityId("entity_id")
                .idempotencyKey("x")
                .limit(123L)
                .build()
        val expected = QueryParams.builder()
        expected.put("cursor", "cursor")
        expected.put("entity_id", "entity_id")
        expected.put("idempotency_key", "x")
        expected.put("limit", "123")
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = IntrafiExclusionListParams.builder().build()
        val expected = QueryParams.builder()
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }
}
