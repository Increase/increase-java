// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.increase.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DigitalCardProfileListParamsTest {

    @Test
    fun create() {
        DigitalCardProfileListParams.builder()
            .cursor("cursor")
            .idempotencyKey("x")
            .limit(1L)
            .status(
                DigitalCardProfileListParams.Status.builder()
                    .addIn(DigitalCardProfileListParams.Status.In.PENDING)
                    .build()
            )
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            DigitalCardProfileListParams.builder()
                .cursor("cursor")
                .idempotencyKey("x")
                .limit(1L)
                .status(
                    DigitalCardProfileListParams.Status.builder()
                        .addIn(DigitalCardProfileListParams.Status.In.PENDING)
                        .build()
                )
                .build()
        val expected = QueryParams.builder()
        expected.put("cursor", "cursor")
        expected.put("idempotency_key", "x")
        expected.put("limit", "1")
        DigitalCardProfileListParams.Status.builder()
            .addIn(DigitalCardProfileListParams.Status.In.PENDING)
            .build()
            .forEachQueryParam { key, values -> expected.put("status.$key", values) }
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = DigitalCardProfileListParams.builder().build()
        val expected = QueryParams.builder()
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }
}
