// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.pendingtransactions

import com.increase.api.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PendingTransactionListParamsTest {

    @Test
    fun create() {
        PendingTransactionListParams.builder()
            .accountId("account_id")
            .category(
                PendingTransactionListParams.Category.builder()
                    .addIn(PendingTransactionListParams.Category.In.ACCOUNT_TRANSFER_INSTRUCTION)
                    .build()
            )
            .createdAt(
                PendingTransactionListParams.CreatedAt.builder()
                    .after(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .before(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .onOrAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .onOrBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
            .cursor("cursor")
            .limit(1L)
            .routeId("route_id")
            .status(
                PendingTransactionListParams.Status.builder()
                    .addIn(PendingTransactionListParams.Status.In.PENDING)
                    .build()
            )
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            PendingTransactionListParams.builder()
                .accountId("account_id")
                .category(
                    PendingTransactionListParams.Category.builder()
                        .addIn(
                            PendingTransactionListParams.Category.In.ACCOUNT_TRANSFER_INSTRUCTION
                        )
                        .build()
                )
                .createdAt(
                    PendingTransactionListParams.CreatedAt.builder()
                        .after(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .before(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .onOrAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .onOrBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .cursor("cursor")
                .limit(1L)
                .routeId("route_id")
                .status(
                    PendingTransactionListParams.Status.builder()
                        .addIn(PendingTransactionListParams.Status.In.PENDING)
                        .build()
                )
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("account_id", "account_id")
                    .put("category.in", listOf("account_transfer_instruction").joinToString(","))
                    .put("created_at.after", "2019-12-27T18:11:19.117Z")
                    .put("created_at.before", "2019-12-27T18:11:19.117Z")
                    .put("created_at.on_or_after", "2019-12-27T18:11:19.117Z")
                    .put("created_at.on_or_before", "2019-12-27T18:11:19.117Z")
                    .put("cursor", "cursor")
                    .put("limit", "1")
                    .put("route_id", "route_id")
                    .put("status.in", listOf("pending").joinToString(","))
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = PendingTransactionListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
