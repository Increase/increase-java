// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.externalaccounts

import com.increase.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExternalAccountListParamsTest {

    @Test
    fun create() {
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
    fun queryParams() {
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

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("cursor", "cursor")
                    .put("idempotency_key", "x")
                    .put("limit", "1")
                    .put("routing_number", "xxxxxxxxx")
                    .put("status.in", listOf("active").joinToString(","))
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = ExternalAccountListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
