// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.increase.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PhysicalCardProfileListParamsTest {

    @Test
    fun create() {
        PhysicalCardProfileListParams.builder()
            .cursor("cursor")
            .idempotencyKey("x")
            .limit(1L)
            .status(
                PhysicalCardProfileListParams.Status.builder()
                    .addIn(PhysicalCardProfileListParams.Status.In.PENDING_CREATING)
                    .build()
            )
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            PhysicalCardProfileListParams.builder()
                .cursor("cursor")
                .idempotencyKey("x")
                .limit(1L)
                .status(
                    PhysicalCardProfileListParams.Status.builder()
                        .addIn(PhysicalCardProfileListParams.Status.In.PENDING_CREATING)
                        .build()
                )
                .build()
        val expected = QueryParams.builder()
        expected.put("cursor", "cursor")
        expected.put("idempotency_key", "x")
        expected.put("limit", "1")
        PhysicalCardProfileListParams.Status.builder()
            .addIn(PhysicalCardProfileListParams.Status.In.PENDING_CREATING)
            .build()
            .forEachQueryParam { key, values -> expected.put("status.$key", values) }
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = PhysicalCardProfileListParams.builder().build()
        val expected = QueryParams.builder()
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }
}
