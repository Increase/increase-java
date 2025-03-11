// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.simulations.programs

import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ProgramCreateParamsTest {

    @Test
    fun create() {
      ProgramCreateParams.builder()
          .name("For Benefit Of")
          .build()
    }

    @Test
    fun body() {
      val params = ProgramCreateParams.builder()
          .name("For Benefit Of")
          .build()

      val body = params._body()

      assertNotNull(body)
      assertThat(body.name()).isEqualTo("For Benefit Of")
    }

    @Test
    fun bodyWithoutOptionalFields() {
      val params = ProgramCreateParams.builder()
          .name("For Benefit Of")
          .build()

      val body = params._body()

      assertNotNull(body)
      assertThat(body.name()).isEqualTo("For Benefit Of")
    }
}
