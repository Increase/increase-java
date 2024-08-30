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
import com.increase.api.models.InboundMailItemListParams

class InboundMailItemListParamsTest {

    @Test
    fun createInboundMailItemListParams() {
      InboundMailItemListParams.builder()
          .createdAt(InboundMailItemListParams.CreatedAt.builder()
              .after(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .before(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .onOrAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .onOrBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .build())
          .cursor("cursor")
          .limit(123L)
          .lockboxId("lockbox_id")
          .build()
    }

    @Test
    fun getQueryParams() {
      val params = InboundMailItemListParams.builder()
          .createdAt(InboundMailItemListParams.CreatedAt.builder()
              .after(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .before(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .onOrAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .onOrBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .build())
          .cursor("cursor")
          .limit(123L)
          .lockboxId("lockbox_id")
          .build()
      val expected = mutableMapOf<String, List<String>>()
      InboundMailItemListParams.CreatedAt.builder()
          .after(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .before(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .onOrAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .onOrBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .build().forEachQueryParam { key, values -> 
          expected.put("created_at.$key", values)
      }
      expected.put("cursor", listOf("cursor"))
      expected.put("limit", listOf("123"))
      expected.put("lockbox_id", listOf("lockbox_id"))
      assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
      val params = InboundMailItemListParams.builder().build()
      val expected = mutableMapOf<String, List<String>>()
      assertThat(params.getQueryParams()).isEqualTo(expected)
    }
}
