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
import com.increase.api.models.AccountNumberCreateParams
import com.increase.api.models.AccountNumberCreateParams.AccountNumberCreateBody

class AccountNumberCreateParamsTest {

    @Test
    fun createAccountNumberCreateParams() {
      AccountNumberCreateParams.builder()
          .accountId("account_id")
          .name("x")
          .inboundAch(AccountNumberCreateParams.InboundAch.builder()
              .debitStatus(AccountNumberCreateParams.InboundAch.DebitStatus.ALLOWED)
              .build())
          .inboundChecks(AccountNumberCreateParams.InboundChecks.builder()
              .status(AccountNumberCreateParams.InboundChecks.Status.ALLOWED)
              .build())
          .build()
    }

    @Test
    fun getBody() {
      val params = AccountNumberCreateParams.builder()
          .accountId("account_id")
          .name("x")
          .inboundAch(AccountNumberCreateParams.InboundAch.builder()
              .debitStatus(AccountNumberCreateParams.InboundAch.DebitStatus.ALLOWED)
              .build())
          .inboundChecks(AccountNumberCreateParams.InboundChecks.builder()
              .status(AccountNumberCreateParams.InboundChecks.Status.ALLOWED)
              .build())
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
      assertThat(body.accountId()).isEqualTo("account_id")
      assertThat(body.name()).isEqualTo("x")
      assertThat(body.inboundAch()).isEqualTo(AccountNumberCreateParams.InboundAch.builder()
          .debitStatus(AccountNumberCreateParams.InboundAch.DebitStatus.ALLOWED)
          .build())
      assertThat(body.inboundChecks()).isEqualTo(AccountNumberCreateParams.InboundChecks.builder()
          .status(AccountNumberCreateParams.InboundChecks.Status.ALLOWED)
          .build())
    }

    @Test
    fun getBodyWithoutOptionalFields() {
      val params = AccountNumberCreateParams.builder()
          .accountId("account_id")
          .name("x")
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
      assertThat(body.accountId()).isEqualTo("account_id")
      assertThat(body.name()).isEqualTo("x")
    }
}
