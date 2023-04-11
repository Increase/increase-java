package com.increase.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.UUID
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat
import com.increase.api.models.*
import com.increase.api.models.AccountNumberCreateParams.AccountNumberCreateBody

class AccountNumberCreateParamsTest {

    @Test
    fun createAccountNumberCreateParams() {
      AccountNumberCreateParams.builder()
          .accountId("string")
          .name("x")
          .build()
    }

    @Test
    fun getBody() {
      val params = AccountNumberCreateParams.builder()
          .accountId("string")
          .name("x")
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
      assertThat(body.accountId()).isEqualTo("string")
      assertThat(body.name()).isEqualTo("x")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
      val params = AccountNumberCreateParams.builder()
          .accountId("string")
          .name("x")
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
      assertThat(body.accountId()).isEqualTo("string")
      assertThat(body.name()).isEqualTo("x")
    }
}
