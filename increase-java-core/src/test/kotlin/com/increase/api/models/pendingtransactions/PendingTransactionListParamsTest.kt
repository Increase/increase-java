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
        val expected = QueryParams.builder()
        expected.put("account_id", "account_id")
        PendingTransactionListParams.Category.builder()
            .addIn(PendingTransactionListParams.Category.In.ACCOUNT_TRANSFER_INSTRUCTION)
            .build()
            .forEachQueryParam { key, values -> expected.put("category.$key", values) }
        PendingTransactionListParams.CreatedAt.builder()
            .after(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .before(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .onOrAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .onOrBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .build()
            .forEachQueryParam { key, values -> expected.put("created_at.$key", values) }
        expected.put("cursor", "cursor")
        expected.put("limit", "1")
        expected.put("route_id", "route_id")
        PendingTransactionListParams.Status.builder()
            .addIn(PendingTransactionListParams.Status.In.PENDING)
            .build()
            .forEachQueryParam { key, values -> expected.put("status.$key", values) }
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = PendingTransactionListParams.builder().build()
        val expected = QueryParams.builder()
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }
}
