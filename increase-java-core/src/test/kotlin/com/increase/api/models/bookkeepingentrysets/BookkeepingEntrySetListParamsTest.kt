// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.bookkeepingentrysets

import com.increase.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BookkeepingEntrySetListParamsTest {

    @Test
    fun create() {
        BookkeepingEntrySetListParams.builder()
            .cursor("cursor")
            .idempotencyKey("x")
            .limit(1L)
            .transactionId("transaction_id")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            BookkeepingEntrySetListParams.builder()
                .cursor("cursor")
                .idempotencyKey("x")
                .limit(1L)
                .transactionId("transaction_id")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("cursor", "cursor")
                    .put("idempotency_key", "x")
                    .put("limit", "1")
                    .put("transaction_id", "transaction_id")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = BookkeepingEntrySetListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
