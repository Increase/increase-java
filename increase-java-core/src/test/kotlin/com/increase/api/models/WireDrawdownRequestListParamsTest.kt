// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.increase.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class WireDrawdownRequestListParamsTest {

    @Test
    fun create() {
        WireDrawdownRequestListParams.builder()
            .cursor("cursor")
            .idempotencyKey("x")
            .limit(1L)
            .status(WireDrawdownRequestListParams.Status.PENDING_SUBMISSION)
            .build()
    }

    @Test
    fun queryParams() {
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
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = WireDrawdownRequestListParams.builder().build()
        val expected = QueryParams.builder()
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }
}
