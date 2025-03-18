// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.wiredrawdownrequests

import com.increase.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WireDrawdownRequestListParamsTest {

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

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("cursor", "cursor")
                    .put("idempotency_key", "x")
                    .put("limit", "1")
                    .put("status.in", listOf("pending_submission").joinToString(","))
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = WireDrawdownRequestListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
