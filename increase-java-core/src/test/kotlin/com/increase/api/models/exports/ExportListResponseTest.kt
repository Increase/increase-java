// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.exports

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.increase.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExportListResponseTest {

    @Test
    fun create() {
        val exportListResponse =
            ExportListResponse.builder()
                .addData(
                    Export.builder()
                        .id("export_8s4m48qz3bclzje0zwh9")
                        .category(Export.Category.TRANSACTION_CSV)
                        .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .fileDownloadUrl("https://example.com/file")
                        .fileId("file_makxrc67oh9l6sg7w9yc")
                        .idempotencyKey(null)
                        .status(Export.Status.COMPLETE)
                        .type(Export.Type.EXPORT)
                        .build()
                )
                .nextCursor("v57w5d")
                .build()

        assertThat(exportListResponse.data())
            .containsExactly(
                Export.builder()
                    .id("export_8s4m48qz3bclzje0zwh9")
                    .category(Export.Category.TRANSACTION_CSV)
                    .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                    .fileDownloadUrl("https://example.com/file")
                    .fileId("file_makxrc67oh9l6sg7w9yc")
                    .idempotencyKey(null)
                    .status(Export.Status.COMPLETE)
                    .type(Export.Type.EXPORT)
                    .build()
            )
        assertThat(exportListResponse.nextCursor()).contains("v57w5d")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val exportListResponse =
            ExportListResponse.builder()
                .addData(
                    Export.builder()
                        .id("export_8s4m48qz3bclzje0zwh9")
                        .category(Export.Category.TRANSACTION_CSV)
                        .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .fileDownloadUrl("https://example.com/file")
                        .fileId("file_makxrc67oh9l6sg7w9yc")
                        .idempotencyKey(null)
                        .status(Export.Status.COMPLETE)
                        .type(Export.Type.EXPORT)
                        .build()
                )
                .nextCursor("v57w5d")
                .build()

        val roundtrippedExportListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(exportListResponse),
                jacksonTypeRef<ExportListResponse>(),
            )

        assertThat(roundtrippedExportListResponse).isEqualTo(exportListResponse)
    }
}
