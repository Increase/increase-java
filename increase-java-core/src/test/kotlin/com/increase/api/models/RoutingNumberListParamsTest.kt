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
import com.increase.api.models.RoutingNumberListParams

class RoutingNumberListParamsTest {

    @Test
    fun createRoutingNumberListParams() {
      RoutingNumberListParams.builder()
          .routingNumber("xxxxxxxxx")
          .cursor("cursor")
          .limit(123L)
          .build()
    }

    @Test
    fun getQueryParams() {
      val params = RoutingNumberListParams.builder()
          .routingNumber("xxxxxxxxx")
          .cursor("cursor")
          .limit(123L)
          .build()
      val expected = mutableMapOf<String, List<String>>()
      expected.put("routing_number", listOf("xxxxxxxxx"))
      expected.put("cursor", listOf("cursor"))
      expected.put("limit", listOf("123"))
      assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
      val params = RoutingNumberListParams.builder()
          .routingNumber("xxxxxxxxx")
          .build()
      val expected = mutableMapOf<String, List<String>>()
      expected.put("routing_number", listOf("xxxxxxxxx"))
      assertThat(params.getQueryParams()).isEqualTo(expected)
    }
}
