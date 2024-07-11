// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.increase.api.models.*
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ExportListParamsTest {

    @Test
    fun createExportListParams() {
        ExportListParams.builder()
            .category(
                ExportListParams.Category.builder()
                    .in_(listOf(ExportListParams.Category.In.ACCOUNT_STATEMENT_OFX))
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
            .limit(123L)
            .status(
                ExportListParams.Status.builder()
                    .in_(listOf(ExportListParams.Status.In.PENDING))
                    .build()
            )
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            ExportListParams.builder()
                .category(
                    ExportListParams.Category.builder()
                        .in_(listOf(ExportListParams.Category.In.ACCOUNT_STATEMENT_OFX))
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
                .limit(123L)
                .status(
                    ExportListParams.Status.builder()
                        .in_(listOf(ExportListParams.Status.In.PENDING))
                        .build()
                )
                .build()
        val expected = mutableMapOf<String, List<String>>()
        ExportListParams.Category.builder()
            .in_(listOf(ExportListParams.Category.In.ACCOUNT_STATEMENT_OFX))
            .build()
            .forEachQueryParam { key, values -> expected.put("category.$key", values) }
        ExportListParams.CreatedAt.builder()
            .after(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .before(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .onOrAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .onOrBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .build()
            .forEachQueryParam { key, values -> expected.put("created_at.$key", values) }
        expected.put("cursor", listOf("cursor"))
        expected.put("idempotency_key", listOf("x"))
        expected.put("limit", listOf("123"))
        ExportListParams.Status.builder()
            .in_(listOf(ExportListParams.Status.In.PENDING))
            .build()
            .forEachQueryParam { key, values -> expected.put("status.$key", values) }
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = ExportListParams.builder().build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }
}
