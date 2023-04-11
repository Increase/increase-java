package com.increase.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.UUID
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat
import com.increase.api.models.*

class PendingTransactionListParamsTest {

    @Test
    fun createPendingTransactionListParams() {
      PendingTransactionListParams.builder()
          .cursor("string")
          .limit(123L)
          .accountId("string")
          .routeId("string")
          .sourceId("string")
          .status(PendingTransactionListParams.Status.builder()
              .in_(listOf(PendingTransactionListParams.Status.In.PENDING))
              .build())
          .build()
    }

    @Test
    fun getQueryParams() {
      val params = PendingTransactionListParams.builder()
          .cursor("string")
          .limit(123L)
          .accountId("string")
          .routeId("string")
          .sourceId("string")
          .status(PendingTransactionListParams.Status.builder()
              .in_(listOf(PendingTransactionListParams.Status.In.PENDING))
              .build())
          .build()
      val expected = mutableMapOf<String, List<String>>()
      expected.put("cursor", listOf("string"))
      expected.put("limit", listOf("123"))
      expected.put("account_id", listOf("string"))
      expected.put("route_id", listOf("string"))
      expected.put("source_id", listOf("string"))
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
