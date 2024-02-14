// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ExportTest {

    @Test
    fun createExport() {
        val export =
            Export.builder()
                .id("string")
                .category(Export.Category.ACCOUNT_STATEMENT_OFX)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .fileDownloadUrl("string")
                .fileId("string")
                .idempotencyKey("string")
                .status(Export.Status.PENDING)
                .type(Export.Type.EXPORT)
                .build()
        assertThat(export).isNotNull
        assertThat(export.id()).isEqualTo("string")
        assertThat(export.category()).isEqualTo(Export.Category.ACCOUNT_STATEMENT_OFX)
        assertThat(export.createdAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(export.fileDownloadUrl()).contains("string")
        assertThat(export.fileId()).contains("string")
        assertThat(export.idempotencyKey()).contains("string")
        assertThat(export.status()).isEqualTo(Export.Status.PENDING)
        assertThat(export.type()).isEqualTo(Export.Type.EXPORT)
    }
}
