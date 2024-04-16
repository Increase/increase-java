// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.increase.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class WireDrawdownRequestListParamsTest {

    @Test
    fun createWireDrawdownRequestListParams() {
        WireDrawdownRequestListParams.builder()
            .cursor("string")
            .idempotencyKey("x")
            .limit(123L)
            .status(WireDrawdownRequestListParams.Status.PENDING_SUBMISSION)
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            WireDrawdownRequestListParams.builder()
                .cursor("string")
                .idempotencyKey("x")
                .limit(123L)
                .status(WireDrawdownRequestListParams.Status.PENDING_SUBMISSION)
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("cursor", listOf("string"))
        expected.put("idempotency_key", listOf("x"))
        expected.put("limit", listOf("123"))
        expected.put(
            "status",
            listOf(WireDrawdownRequestListParams.Status.PENDING_SUBMISSION.toString())
        )
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = WireDrawdownRequestListParams.builder().build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }
}
