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
import com.increase.api.models.AccountTransferCreateParams
import com.increase.api.models.AccountTransferCreateParams.AccountTransferCreateBody

class AccountTransferCreateParamsTest {

    @Test
    fun createAccountTransferCreateParams() {
      AccountTransferCreateParams.builder()
          .accountId("account_id")
          .amount(123L)
          .description("x")
          .destinationAccountId("destination_account_id")
          .requireApproval(true)
          .build()
    }

    @Test
    fun getBody() {
      val params = AccountTransferCreateParams.builder()
          .accountId("account_id")
          .amount(123L)
          .description("x")
          .destinationAccountId("destination_account_id")
          .requireApproval(true)
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
      assertThat(body.accountId()).isEqualTo("account_id")
      assertThat(body.amount()).isEqualTo(123L)
      assertThat(body.description()).isEqualTo("x")
      assertThat(body.destinationAccountId()).isEqualTo("destination_account_id")
      assertThat(body.requireApproval()).isEqualTo(true)
    }

    @Test
    fun getBodyWithoutOptionalFields() {
      val params = AccountTransferCreateParams.builder()
          .accountId("account_id")
          .amount(123L)
          .description("x")
          .destinationAccountId("destination_account_id")
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
      assertThat(body.accountId()).isEqualTo("account_id")
      assertThat(body.amount()).isEqualTo(123L)
      assertThat(body.description()).isEqualTo("x")
      assertThat(body.destinationAccountId()).isEqualTo("destination_account_id")
    }
}
