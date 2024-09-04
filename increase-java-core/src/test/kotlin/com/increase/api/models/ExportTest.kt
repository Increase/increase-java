// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.UUID
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat
import com.increase.api.core.JsonNull
import com.increase.api.core.JsonString
import com.increase.api.core.JsonValue
import com.increase.api.models.Export

class ExportTest {

    @Test
    fun createExport() {
      val export = Export.builder()
          .id("id")
          .category(Export.Category.ACCOUNT_STATEMENT_OFX)
          .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .fileDownloadUrl("file_download_url")
          .fileId("file_id")
          .idempotencyKey("idempotency_key")
          .status(Export.Status.PENDING)
          .type(Export.Type.EXPORT)
          .build()
      assertThat(export).isNotNull
      assertThat(export.id()).isEqualTo("id")
      assertThat(export.category()).isEqualTo(Export.Category.ACCOUNT_STATEMENT_OFX)
      assertThat(export.createdAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
      assertThat(export.fileDownloadUrl()).contains("file_download_url")
      assertThat(export.fileId()).contains("file_id")
      assertThat(export.idempotencyKey()).contains("idempotency_key")
      assertThat(export.status()).isEqualTo(Export.Status.PENDING)
      assertThat(export.type()).isEqualTo(Export.Type.EXPORT)
    }
}
