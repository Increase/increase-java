// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.fednowtransfers

import com.increase.api.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FednowTransferListParamsTest {

    @Test
    fun create() {
        FednowTransferListParams.builder()
            .accountId("account_id")
            .createdAt(
                FednowTransferListParams.CreatedAt.builder()
                    .after(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .before(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .onOrAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .onOrBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
            .cursor("cursor")
            .externalAccountId("external_account_id")
            .idempotencyKey("x")
            .limit(1L)
            .status(
                FednowTransferListParams.Status.builder()
                    .addIn(FednowTransferListParams.Status.In.PENDING_REVIEWING)
                    .build()
            )
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            FednowTransferListParams.builder()
                .accountId("account_id")
                .createdAt(
                    FednowTransferListParams.CreatedAt.builder()
                        .after(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .before(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .onOrAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .onOrBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .cursor("cursor")
                .externalAccountId("external_account_id")
                .idempotencyKey("x")
                .limit(1L)
                .status(
                    FednowTransferListParams.Status.builder()
                        .addIn(FednowTransferListParams.Status.In.PENDING_REVIEWING)
                        .build()
                )
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("account_id", "account_id")
                    .put("created_at.after", "2019-12-27T18:11:19.117Z")
                    .put("created_at.before", "2019-12-27T18:11:19.117Z")
                    .put("created_at.on_or_after", "2019-12-27T18:11:19.117Z")
                    .put("created_at.on_or_before", "2019-12-27T18:11:19.117Z")
                    .put("cursor", "cursor")
                    .put("external_account_id", "external_account_id")
                    .put("idempotency_key", "x")
                    .put("limit", "1")
                    .put("status.in", listOf("pending_reviewing").joinToString(","))
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = FednowTransferListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
