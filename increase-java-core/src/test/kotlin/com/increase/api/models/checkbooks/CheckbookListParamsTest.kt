// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.checkbooks

import com.increase.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CheckbookListParamsTest {

    @Test
    fun create() {
        CheckbookListParams.builder()
            .accountNumberId("account_number_id")
            .cursor("cursor")
            .idempotencyKey("x")
            .limit(1L)
            .status(
                CheckbookListParams.Status.builder()
                    .addIn(CheckbookListParams.Status.In.PENDING_SUBMISSION)
                    .build()
            )
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            CheckbookListParams.builder()
                .accountNumberId("account_number_id")
                .cursor("cursor")
                .idempotencyKey("x")
                .limit(1L)
                .status(
                    CheckbookListParams.Status.builder()
                        .addIn(CheckbookListParams.Status.In.PENDING_SUBMISSION)
                        .build()
                )
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("account_number_id", "account_number_id")
                    .put("cursor", "cursor")
                    .put("idempotency_key", "x")
                    .put("limit", "1")
                    .put("status.in", listOf("pending_submission").joinToString(","))
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = CheckbookListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
