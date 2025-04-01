// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.exports

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.increase.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExportTest {

    @Test
    fun create() {
        val export =
            Export.builder()
                .id("export_8s4m48qz3bclzje0zwh9")
                .category(Export.Category.ACCOUNT_STATEMENT_OFX)
                .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                .fileDownloadUrl("https://example.com/file")
                .fileId("file_makxrc67oh9l6sg7w9yc")
                .idempotencyKey(null)
                .status(Export.Status.PENDING)
                .type(Export.Type.EXPORT)
                .build()

        assertThat(export.id()).isEqualTo("export_8s4m48qz3bclzje0zwh9")
        assertThat(export.category()).isEqualTo(Export.Category.ACCOUNT_STATEMENT_OFX)
        assertThat(export.createdAt()).isEqualTo(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
        assertThat(export.fileDownloadUrl()).contains("https://example.com/file")
        assertThat(export.fileId()).contains("file_makxrc67oh9l6sg7w9yc")
        assertThat(export.idempotencyKey()).isEmpty
        assertThat(export.status()).isEqualTo(Export.Status.PENDING)
        assertThat(export.type()).isEqualTo(Export.Type.EXPORT)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val export =
            Export.builder()
                .id("export_8s4m48qz3bclzje0zwh9")
                .category(Export.Category.ACCOUNT_STATEMENT_OFX)
                .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                .fileDownloadUrl("https://example.com/file")
                .fileId("file_makxrc67oh9l6sg7w9yc")
                .idempotencyKey(null)
                .status(Export.Status.PENDING)
                .type(Export.Type.EXPORT)
                .build()

        val roundtrippedExport =
            jsonMapper.readValue(jsonMapper.writeValueAsString(export), jacksonTypeRef<Export>())

        assertThat(roundtrippedExport).isEqualTo(export)
    }
}
