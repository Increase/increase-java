// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.lockboxes

import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LockboxCreateParamsTest {

    @Test
    fun create() {
      LockboxCreateParams.builder()
          .accountId("account_in71c4amph0vgo2qllky")
          .description("Rent payments")
          .recipientName("x")
          .build()
    }

    @Test
    fun body() {
      val params = LockboxCreateParams.builder()
          .accountId("account_in71c4amph0vgo2qllky")
          .description("Rent payments")
          .recipientName("x")
          .build()

      val body = params._body()

      assertNotNull(body)
      assertThat(body.accountId()).isEqualTo("account_in71c4amph0vgo2qllky")
      assertThat(body.description()).contains("Rent payments")
      assertThat(body.recipientName()).contains("x")
    }

    @Test
    fun bodyWithoutOptionalFields() {
      val params = LockboxCreateParams.builder()
          .accountId("account_in71c4amph0vgo2qllky")
          .build()

      val body = params._body()

      assertNotNull(body)
      assertThat(body.accountId()).isEqualTo("account_in71c4amph0vgo2qllky")
    }
}
