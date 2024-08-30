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
import com.increase.api.models.BookkeepingAccountBalanceParams

class BookkeepingAccountBalanceParamsTest {

    @Test
    fun createBookkeepingAccountBalanceParams() {
      BookkeepingAccountBalanceParams.builder()
          .bookkeepingAccountId("bookkeeping_account_id")
          .atTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .build()
    }

    @Test
    fun getQueryParams() {
      val params = BookkeepingAccountBalanceParams.builder()
          .bookkeepingAccountId("bookkeeping_account_id")
          .atTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .build()
      val expected = mutableMapOf<String, List<String>>()
      expected.put("at_time", listOf("2019-12-27T18:11:19.117Z"))
      assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
      val params = BookkeepingAccountBalanceParams.builder()
          .bookkeepingAccountId("bookkeeping_account_id")
          .build()
      val expected = mutableMapOf<String, List<String>>()
      assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getPathParam() {
      val params = BookkeepingAccountBalanceParams.builder()
          .bookkeepingAccountId("bookkeeping_account_id")
          .build()
      assertThat(params).isNotNull
      // path param "bookkeepingAccountId"
      assertThat(params.getPathParam(0)).isEqualTo("bookkeeping_account_id")
      // out-of-bound path param
      assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
