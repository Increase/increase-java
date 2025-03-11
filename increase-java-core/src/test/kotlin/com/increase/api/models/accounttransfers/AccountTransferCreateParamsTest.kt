// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.accounttransfers

import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AccountTransferCreateParamsTest {

    @Test
    fun create() {
      AccountTransferCreateParams.builder()
          .accountId("account_in71c4amph0vgo2qllky")
          .amount(100L)
          .description("Creating liquidity")
          .destinationAccountId("account_uf16sut2ct5bevmq3eh")
          .requireApproval(true)
          .build()
    }

    @Test
    fun body() {
      val params = AccountTransferCreateParams.builder()
          .accountId("account_in71c4amph0vgo2qllky")
          .amount(100L)
          .description("Creating liquidity")
          .destinationAccountId("account_uf16sut2ct5bevmq3eh")
          .requireApproval(true)
          .build()

      val body = params._body()

      assertNotNull(body)
      assertThat(body.accountId()).isEqualTo("account_in71c4amph0vgo2qllky")
      assertThat(body.amount()).isEqualTo(100L)
      assertThat(body.description()).isEqualTo("Creating liquidity")
      assertThat(body.destinationAccountId()).isEqualTo("account_uf16sut2ct5bevmq3eh")
      assertThat(body.requireApproval()).contains(true)
    }

    @Test
    fun bodyWithoutOptionalFields() {
      val params = AccountTransferCreateParams.builder()
          .accountId("account_in71c4amph0vgo2qllky")
          .amount(100L)
          .description("Creating liquidity")
          .destinationAccountId("account_uf16sut2ct5bevmq3eh")
          .build()

      val body = params._body()

      assertNotNull(body)
      assertThat(body.accountId()).isEqualTo("account_in71c4amph0vgo2qllky")
      assertThat(body.amount()).isEqualTo(100L)
      assertThat(body.description()).isEqualTo("Creating liquidity")
      assertThat(body.destinationAccountId()).isEqualTo("account_uf16sut2ct5bevmq3eh")
    }
}
