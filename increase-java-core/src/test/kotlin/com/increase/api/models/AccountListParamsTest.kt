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
import com.increase.api.models.AccountListParams

class AccountListParamsTest {

    @Test
    fun createAccountListParams() {
      AccountListParams.builder()
          .createdAt(AccountListParams.CreatedAt.builder()
              .after(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .before(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .onOrAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .onOrBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .build())
          .cursor("cursor")
          .entityId("entity_id")
          .idempotencyKey("x")
          .informationalEntityId("informational_entity_id")
          .limit(123L)
          .status(AccountListParams.Status.OPEN)
          .build()
    }

    @Test
    fun getQueryParams() {
      val params = AccountListParams.builder()
          .createdAt(AccountListParams.CreatedAt.builder()
              .after(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .before(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .onOrAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .onOrBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .build())
          .cursor("cursor")
          .entityId("entity_id")
          .idempotencyKey("x")
          .informationalEntityId("informational_entity_id")
          .limit(123L)
          .status(AccountListParams.Status.OPEN)
          .build()
      val expected = mutableMapOf<String, List<String>>()
      AccountListParams.CreatedAt.builder()
          .after(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .before(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .onOrAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .onOrBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .build().forEachQueryParam { key, values -> 
          expected.put("created_at.$key", values)
      }
      expected.put("cursor", listOf("cursor"))
      expected.put("entity_id", listOf("entity_id"))
      expected.put("idempotency_key", listOf("x"))
      expected.put("informational_entity_id", listOf("informational_entity_id"))
      expected.put("limit", listOf("123"))
      expected.put("status", listOf(AccountListParams.Status.OPEN.toString()))
      assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
      val params = AccountListParams.builder().build()
      val expected = mutableMapOf<String, List<String>>()
      assertThat(params.getQueryParams()).isEqualTo(expected)
    }
}
