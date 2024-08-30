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
import com.increase.api.models.EntityArchiveBeneficialOwnerParams
import com.increase.api.models.EntityArchiveBeneficialOwnerParams.EntityArchiveBeneficialOwnerBody

class EntityArchiveBeneficialOwnerParamsTest {

    @Test
    fun createEntityArchiveBeneficialOwnerParams() {
      EntityArchiveBeneficialOwnerParams.builder()
          .entityId("entity_id")
          .beneficialOwnerId("beneficial_owner_id")
          .build()
    }

    @Test
    fun getBody() {
      val params = EntityArchiveBeneficialOwnerParams.builder()
          .entityId("entity_id")
          .beneficialOwnerId("beneficial_owner_id")
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
      assertThat(body.beneficialOwnerId()).isEqualTo("beneficial_owner_id")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
      val params = EntityArchiveBeneficialOwnerParams.builder()
          .entityId("entity_id")
          .beneficialOwnerId("beneficial_owner_id")
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
      assertThat(body.beneficialOwnerId()).isEqualTo("beneficial_owner_id")
    }

    @Test
    fun getPathParam() {
      val params = EntityArchiveBeneficialOwnerParams.builder()
          .entityId("entity_id")
          .beneficialOwnerId("beneficial_owner_id")
          .build()
      assertThat(params).isNotNull
      // path param "entityId"
      assertThat(params.getPathParam(0)).isEqualTo("entity_id")
      // out-of-bound path param
      assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
