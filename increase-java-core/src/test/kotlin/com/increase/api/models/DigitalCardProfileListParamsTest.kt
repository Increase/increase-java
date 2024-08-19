// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.increase.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DigitalCardProfileListParamsTest {

    @Test
    fun createDigitalCardProfileListParams() {
        DigitalCardProfileListParams.builder()
            .cursor("cursor")
            .idempotencyKey("x")
            .limit(123L)
            .status(
                DigitalCardProfileListParams.Status.builder()
                    .in_(listOf(DigitalCardProfileListParams.Status.In.PENDING))
                    .build()
            )
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            DigitalCardProfileListParams.builder()
                .cursor("cursor")
                .idempotencyKey("x")
                .limit(123L)
                .status(
                    DigitalCardProfileListParams.Status.builder()
                        .in_(listOf(DigitalCardProfileListParams.Status.In.PENDING))
                        .build()
                )
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("cursor", listOf("cursor"))
        expected.put("idempotency_key", listOf("x"))
        expected.put("limit", listOf("123"))
        DigitalCardProfileListParams.Status.builder()
            .in_(listOf(DigitalCardProfileListParams.Status.In.PENDING))
            .build()
            .forEachQueryParam { key, values -> expected.put("status.$key", values) }
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = DigitalCardProfileListParams.builder().build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }
}
