// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.increase.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class WireDrawdownRequestListParamsTest {

    @Test
    fun createWireDrawdownRequestListParams() {
        WireDrawdownRequestListParams.builder()
            .cursor("cursor")
            .idempotencyKey("x")
            .limit(1L)
            .status(WireDrawdownRequestListParams.Status.PENDING_SUBMISSION)
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            WireDrawdownRequestListParams.builder()
                .cursor("cursor")
                .idempotencyKey("x")
                .limit(1L)
                .status(WireDrawdownRequestListParams.Status.PENDING_SUBMISSION)
                .build()
        val expected = QueryParams.builder()
        expected.put("cursor", "cursor")
        expected.put("idempotency_key", "x")
        expected.put("limit", "1")
        expected.put("status", WireDrawdownRequestListParams.Status.PENDING_SUBMISSION.toString())
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = WireDrawdownRequestListParams.builder().build()
        val expected = QueryParams.builder()
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }
}
