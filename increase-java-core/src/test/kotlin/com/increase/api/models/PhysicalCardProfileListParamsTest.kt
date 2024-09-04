// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.increase.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PhysicalCardProfileListParamsTest {

    @Test
    fun createPhysicalCardProfileListParams() {
        PhysicalCardProfileListParams.builder()
            .cursor("cursor")
            .idempotencyKey("x")
            .limit(123L)
            .status(
                PhysicalCardProfileListParams.Status.builder()
                    .in_(listOf(PhysicalCardProfileListParams.Status.In.PENDING_CREATING))
                    .build()
            )
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            PhysicalCardProfileListParams.builder()
                .cursor("cursor")
                .idempotencyKey("x")
                .limit(123L)
                .status(
                    PhysicalCardProfileListParams.Status.builder()
                        .in_(listOf(PhysicalCardProfileListParams.Status.In.PENDING_CREATING))
                        .build()
                )
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("cursor", listOf("cursor"))
        expected.put("idempotency_key", listOf("x"))
        expected.put("limit", listOf("123"))
        PhysicalCardProfileListParams.Status.builder()
            .in_(listOf(PhysicalCardProfileListParams.Status.In.PENDING_CREATING))
            .build()
            .forEachQueryParam { key, values -> expected.put("status.$key", values) }
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = PhysicalCardProfileListParams.builder().build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }
}
