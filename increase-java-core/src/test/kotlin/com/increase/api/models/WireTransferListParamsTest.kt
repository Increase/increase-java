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
import com.increase.api.models.WireTransferListParams

class WireTransferListParamsTest {

    @Test
    fun createWireTransferListParams() {
      WireTransferListParams.builder()
          .accountId("account_id")
          .createdAt(WireTransferListParams.CreatedAt.builder()
              .after(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .before(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .onOrAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .onOrBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .build())
          .cursor("cursor")
          .externalAccountId("external_account_id")
          .idempotencyKey("x")
          .limit(123L)
          .build()
    }

    @Test
    fun getQueryParams() {
      val params = WireTransferListParams.builder()
          .accountId("account_id")
          .createdAt(WireTransferListParams.CreatedAt.builder()
              .after(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .before(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .onOrAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .onOrBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .build())
          .cursor("cursor")
          .externalAccountId("external_account_id")
          .idempotencyKey("x")
          .limit(123L)
          .build()
      val expected = mutableMapOf<String, List<String>>()
      expected.put("account_id", listOf("account_id"))
      WireTransferListParams.CreatedAt.builder()
          .after(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .before(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .onOrAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .onOrBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .build().forEachQueryParam { key, values -> 
          expected.put("created_at.$key", values)
      }
      expected.put("cursor", listOf("cursor"))
      expected.put("external_account_id", listOf("external_account_id"))
      expected.put("idempotency_key", listOf("x"))
      expected.put("limit", listOf("123"))
      assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
      val params = WireTransferListParams.builder().build()
      val expected = mutableMapOf<String, List<String>>()
      assertThat(params.getQueryParams()).isEqualTo(expected)
    }
}
