// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.increase.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ExternalAccountListParamsTest {

    @Test
    fun createExternalAccountListParams() {
        ExternalAccountListParams.builder()
            .cursor("cursor")
            .idempotencyKey("x")
            .limit(1L)
            .routingNumber("xxxxxxxxx")
            .status(
                ExternalAccountListParams.Status.builder()
                    .addIn(ExternalAccountListParams.Status.In.ACTIVE)
                    .build()
            )
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            ExternalAccountListParams.builder()
                .cursor("cursor")
                .idempotencyKey("x")
                .limit(1L)
                .routingNumber("xxxxxxxxx")
                .status(
                    ExternalAccountListParams.Status.builder()
                        .addIn(ExternalAccountListParams.Status.In.ACTIVE)
                        .build()
                )
                .build()
        val expected = QueryParams.builder()
        expected.put("cursor", "cursor")
        expected.put("idempotency_key", "x")
        expected.put("limit", "1")
        expected.put("routing_number", "xxxxxxxxx")
        ExternalAccountListParams.Status.builder()
            .addIn(ExternalAccountListParams.Status.In.ACTIVE)
            .build()
            .forEachQueryParam { key, values -> expected.put("status.$key", values) }
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = ExternalAccountListParams.builder().build()
        val expected = QueryParams.builder()
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }
}
