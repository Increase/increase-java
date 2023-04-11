package com.increase.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.UUID
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat
import com.increase.api.models.*

class AccountNumberListParamsTest {

    @Test
    fun createAccountNumberListParams() {
      AccountNumberListParams.builder()
          .cursor("string")
          .limit(123L)
          .status(AccountNumberListParams.Status.ACTIVE)
          .accountId("string")
          .build()
    }

    @Test
    fun getQueryParams() {
      val params = AccountNumberListParams.builder()
          .cursor("string")
          .limit(123L)
          .status(AccountNumberListParams.Status.ACTIVE)
          .accountId("string")
          .build()
      val expected = mutableMapOf<String, List<String>>()
      expected.put("cursor", listOf("string"))
      expected.put("limit", listOf("123"))
      expected.put("status", listOf(AccountNumberListParams.Status.ACTIVE.toString()))
      expected.put("account_id", listOf("string"))
      assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
      val params = AccountNumberListParams.builder().build()
      val expected = mutableMapOf<String, List<String>>()
      assertThat(params.getQueryParams()).isEqualTo(expected)
    }
}
