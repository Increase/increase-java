// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.UUID
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat
import org.apache.hc.core5.http.ContentType
import com.increase.api.core.ContentTypes
import com.increase.api.core.JsonNull
import com.increase.api.core.JsonString
import com.increase.api.core.JsonValue
import com.increase.api.core.MultipartFormValue
import com.increase.api.models.*
import com.increase.api.models.SupplementalDocumentCreateParams
import com.increase.api.models.SupplementalDocumentCreateParams.SupplementalDocumentCreateBody

class SupplementalDocumentCreateParamsTest {

    @Test
    fun createSupplementalDocumentCreateParams() {
      SupplementalDocumentCreateParams.builder()
          .entityId("entity_id")
          .fileId("file_id")
          .build()
    }

    @Test
    fun getBody() {
      val params = SupplementalDocumentCreateParams.builder()
          .entityId("entity_id")
          .fileId("file_id")
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
      assertThat(body.entityId()).isEqualTo("entity_id")
      assertThat(body.fileId()).isEqualTo("file_id")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
      val params = SupplementalDocumentCreateParams.builder()
          .entityId("entity_id")
          .fileId("file_id")
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
      assertThat(body.entityId()).isEqualTo("entity_id")
      assertThat(body.fileId()).isEqualTo("file_id")
    }
}
