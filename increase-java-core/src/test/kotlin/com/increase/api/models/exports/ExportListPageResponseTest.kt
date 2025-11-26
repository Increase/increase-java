// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.exports

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.increase.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExportListPageResponseTest {

    @Test
    fun create() {
        val exportListPageResponse =
            ExportListPageResponse.builder()
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

        assertThat(exportListPageResponse.data())
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
        assertThat(exportListPageResponse.nextCursor()).contains("v57w5d")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val exportListPageResponse =
            ExportListPageResponse.builder()
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

        val roundtrippedExportListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(exportListPageResponse),
                jacksonTypeRef<ExportListPageResponse>(),
            )

        assertThat(roundtrippedExportListPageResponse).isEqualTo(exportListPageResponse)
    }
}
