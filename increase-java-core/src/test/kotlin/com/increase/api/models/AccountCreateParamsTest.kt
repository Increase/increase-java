package com.increase.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.UUID
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat
import com.increase.api.models.*
import com.increase.api.models.AccountCreateParams.AccountCreateBody

class AccountCreateParamsTest {

    @Test
    fun createAccountCreateParams() {
      AccountCreateParams.builder()
          .entityId("string")
          .programId("string")
          .informationalEntityId("string")
          .name("x")
          .build()
    }

    @Test
    fun getBody() {
      val params = AccountCreateParams.builder()
          .entityId("string")
          .programId("string")
          .informationalEntityId("string")
          .name("x")
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
      assertThat(body.entityId()).isEqualTo("string")
      assertThat(body.programId()).isEqualTo("string")
      assertThat(body.informationalEntityId()).isEqualTo("string")
      assertThat(body.name()).isEqualTo("x")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
      val params = AccountCreateParams.builder()
          .name("x")
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
      assertThat(body.name()).isEqualTo("x")
    }
}
