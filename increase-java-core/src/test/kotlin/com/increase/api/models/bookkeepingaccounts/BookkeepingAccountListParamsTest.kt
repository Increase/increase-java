// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.bookkeepingaccounts

import com.increase.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BookkeepingAccountListParamsTest {

    @Test
    fun create() {
        BookkeepingAccountListParams.builder()
            .cursor("cursor")
            .idempotencyKey("x")
            .limit(1L)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            BookkeepingAccountListParams.builder()
                .cursor("cursor")
                .idempotencyKey("x")
                .limit(1L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("cursor", "cursor")
                    .put("idempotency_key", "x")
                    .put("limit", "1")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = BookkeepingAccountListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
