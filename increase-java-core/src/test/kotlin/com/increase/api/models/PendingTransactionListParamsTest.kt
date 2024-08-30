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
import com.increase.api.models.PendingTransactionListParams

class PendingTransactionListParamsTest {

    @Test
    fun createPendingTransactionListParams() {
      PendingTransactionListParams.builder()
          .accountId("account_id")
          .category(PendingTransactionListParams.Category.builder()
              .in_(listOf(PendingTransactionListParams.Category.In.ACCOUNT_TRANSFER_INSTRUCTION))
              .build())
          .createdAt(PendingTransactionListParams.CreatedAt.builder()
              .after(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .before(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .onOrAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .onOrBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .build())
          .cursor("cursor")
          .limit(123L)
          .routeId("route_id")
          .status(PendingTransactionListParams.Status.builder()
              .in_(listOf(PendingTransactionListParams.Status.In.PENDING))
              .build())
          .build()
    }

    @Test
    fun getQueryParams() {
      val params = PendingTransactionListParams.builder()
          .accountId("account_id")
          .category(PendingTransactionListParams.Category.builder()
              .in_(listOf(PendingTransactionListParams.Category.In.ACCOUNT_TRANSFER_INSTRUCTION))
              .build())
          .createdAt(PendingTransactionListParams.CreatedAt.builder()
              .after(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .before(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .onOrAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .onOrBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .build())
          .cursor("cursor")
          .limit(123L)
          .routeId("route_id")
          .status(PendingTransactionListParams.Status.builder()
              .in_(listOf(PendingTransactionListParams.Status.In.PENDING))
              .build())
          .build()
      val expected = mutableMapOf<String, List<String>>()
      expected.put("account_id", listOf("account_id"))
      PendingTransactionListParams.Category.builder()
          .in_(listOf(PendingTransactionListParams.Category.In.ACCOUNT_TRANSFER_INSTRUCTION))
          .build().forEachQueryParam { key, values -> 
          expected.put("category.$key", values)
      }
      PendingTransactionListParams.CreatedAt.builder()
          .after(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .before(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .onOrAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .onOrBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .build().forEachQueryParam { key, values -> 
          expected.put("created_at.$key", values)
      }
      expected.put("cursor", listOf("cursor"))
      expected.put("limit", listOf("123"))
      expected.put("route_id", listOf("route_id"))
      PendingTransactionListParams.Status.builder()
          .in_(listOf(PendingTransactionListParams.Status.In.PENDING))
          .build().forEachQueryParam { key, values -> 
          expected.put("status.$key", values)
      }
      assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
      val params = PendingTransactionListParams.builder().build()
      val expected = mutableMapOf<String, List<String>>()
      assertThat(params.getQueryParams()).isEqualTo(expected)
    }
}
