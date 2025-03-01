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
            .status(
                WireDrawdownRequestListParams.Status.builder()
                    .addIn(WireDrawdownRequestListParams.Status.In.PENDING_SUBMISSION)
                    .build()
            )
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            WireDrawdownRequestListParams.builder()
                .cursor("cursor")
                .idempotencyKey("x")
                .limit(1L)
                .status(
                    WireDrawdownRequestListParams.Status.builder()
                        .addIn(WireDrawdownRequestListParams.Status.In.PENDING_SUBMISSION)
                        .build()
                )
                .build()
        val expected = QueryParams.builder()
        expected.put("cursor", "cursor")
        expected.put("idempotency_key", "x")
        expected.put("limit", "1")
        WireDrawdownRequestListParams.Status.builder()
            .addIn(WireDrawdownRequestListParams.Status.In.PENDING_SUBMISSION)
            .build()
            .forEachQueryParam { key, values -> expected.put("status.$key", values) }
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = WireDrawdownRequestListParams.builder().build()
        val expected = QueryParams.builder()
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }
}
