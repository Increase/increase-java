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
import com.increase.api.models.DigitalCardProfileListParams

class DigitalCardProfileListParamsTest {

    @Test
    fun createDigitalCardProfileListParams() {
      DigitalCardProfileListParams.builder()
          .cursor("cursor")
          .idempotencyKey("x")
          .limit(123L)
          .status(DigitalCardProfileListParams.Status.builder()
              .in_(listOf(DigitalCardProfileListParams.Status.In.PENDING))
              .build())
          .build()
    }

    @Test
    fun getQueryParams() {
      val params = DigitalCardProfileListParams.builder()
          .cursor("cursor")
          .idempotencyKey("x")
          .limit(123L)
          .status(DigitalCardProfileListParams.Status.builder()
              .in_(listOf(DigitalCardProfileListParams.Status.In.PENDING))
              .build())
          .build()
      val expected = mutableMapOf<String, List<String>>()
      expected.put("cursor", listOf("cursor"))
      expected.put("idempotency_key", listOf("x"))
      expected.put("limit", listOf("123"))
      DigitalCardProfileListParams.Status.builder()
          .in_(listOf(DigitalCardProfileListParams.Status.In.PENDING))
          .build().forEachQueryParam { key, values -> 
          expected.put("status.$key", values)
      }
      assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
      val params = DigitalCardProfileListParams.builder().build()
      val expected = mutableMapOf<String, List<String>>()
      assertThat(params.getQueryParams()).isEqualTo(expected)
    }
}
