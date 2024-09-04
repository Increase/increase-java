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
import com.increase.api.models.EntityUpdateIndustryCodeParams
import com.increase.api.models.EntityUpdateIndustryCodeParams.EntityUpdateIndustryCodeBody

class EntityUpdateIndustryCodeParamsTest {

    @Test
    fun createEntityUpdateIndustryCodeParams() {
      EntityUpdateIndustryCodeParams.builder()
          .entityId("entity_id")
          .industryCode("x")
          .build()
    }

    @Test
    fun getBody() {
      val params = EntityUpdateIndustryCodeParams.builder()
          .entityId("entity_id")
          .industryCode("x")
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
      assertThat(body.industryCode()).isEqualTo("x")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
      val params = EntityUpdateIndustryCodeParams.builder()
          .entityId("entity_id")
          .industryCode("x")
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
      assertThat(body.industryCode()).isEqualTo("x")
    }

    @Test
    fun getPathParam() {
      val params = EntityUpdateIndustryCodeParams.builder()
          .entityId("entity_id")
          .industryCode("x")
          .build()
      assertThat(params).isNotNull
      // path param "entityId"
      assertThat(params.getPathParam(0)).isEqualTo("entity_id")
      // out-of-bound path param
      assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
