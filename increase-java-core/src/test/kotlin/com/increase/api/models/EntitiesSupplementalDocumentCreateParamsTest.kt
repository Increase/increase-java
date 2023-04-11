package com.increase.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.UUID
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat
import com.increase.api.models.*
import com.increase.api.models.EntitiesSupplementalDocumentCreateParams.EntitiesSupplementalDocumentCreateBody

class EntitiesSupplementalDocumentCreateParamsTest {

    @Test
    fun createEntitiesSupplementalDocumentCreateParams() {
      EntitiesSupplementalDocumentCreateParams.builder()
          .entityId("string")
          .fileId("string")
          .build()
    }

    @Test
    fun getBody() {
      val params = EntitiesSupplementalDocumentCreateParams.builder()
          .entityId("string")
          .fileId("string")
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
      assertThat(body.fileId()).isEqualTo("string")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
      val params = EntitiesSupplementalDocumentCreateParams.builder()
          .entityId("string")
          .fileId("string")
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
      assertThat(body.fileId()).isEqualTo("string")
    }

    @Test
    fun getPathParam() {
      val params = EntitiesSupplementalDocumentCreateParams.builder()
          .entityId("string")
          .fileId("string")
          .build()
      assertThat(params).isNotNull
      // path param "entityId"
      assertThat(params.getPathParam(0)).isEqualTo("string")
      // out-of-bound path param
      assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
