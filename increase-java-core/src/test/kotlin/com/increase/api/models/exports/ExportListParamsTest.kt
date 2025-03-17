// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.exports

import com.increase.api.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExportListParamsTest {

    @Test
    fun create() {
        ExportListParams.builder()
            .category(
                ExportListParams.Category.builder()
                    .addIn(ExportListParams.Category.In.ACCOUNT_STATEMENT_OFX)
                    .build()
            )
            .createdAt(
                ExportListParams.CreatedAt.builder()
                    .after(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .before(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .onOrAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .onOrBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
            .cursor("cursor")
            .idempotencyKey("x")
            .limit(1L)
            .status(
                ExportListParams.Status.builder().addIn(ExportListParams.Status.In.PENDING).build()
            )
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            ExportListParams.builder()
                .category(
                    ExportListParams.Category.builder()
                        .addIn(ExportListParams.Category.In.ACCOUNT_STATEMENT_OFX)
                        .build()
                )
                .createdAt(
                    ExportListParams.CreatedAt.builder()
                        .after(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .before(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .onOrAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .onOrBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .cursor("cursor")
                .idempotencyKey("x")
                .limit(1L)
                .status(
                    ExportListParams.Status.builder()
                        .addIn(ExportListParams.Status.In.PENDING)
                        .build()
                )
                .build()
        val expected = QueryParams.builder()
        ExportListParams.Category.builder()
            .addIn(ExportListParams.Category.In.ACCOUNT_STATEMENT_OFX)
            .build()
            .forEachQueryParam { key, values -> expected.put("category.$key", values) }
        ExportListParams.CreatedAt.builder()
            .after(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .before(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .onOrAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .onOrBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .build()
            .forEachQueryParam { key, values -> expected.put("created_at.$key", values) }
        expected.put("cursor", "cursor")
        expected.put("idempotency_key", "x")
        expected.put("limit", "1")
        ExportListParams.Status.builder()
            .addIn(ExportListParams.Status.In.PENDING)
            .build()
            .forEachQueryParam { key, values -> expected.put("status.$key", values) }
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = ExportListParams.builder().build()
        val expected = QueryParams.builder()
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }
}
