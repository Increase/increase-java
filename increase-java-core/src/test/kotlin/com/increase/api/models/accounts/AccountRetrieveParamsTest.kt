// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.accounts

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AccountRetrieveParamsTest {

    @Test
    fun create() {
      AccountRetrieveParams.builder()
          .accountId("account_in71c4amph0vgo2qllky")
          .build()
    }

    @Test
    fun getPathParam() {
      val params = AccountRetrieveParams.builder()
          .accountId("account_in71c4amph0vgo2qllky")
          .build()
      assertThat(params).isNotNull
      // path param "accountId"
      assertThat(params.getPathParam(0)).isEqualTo("account_in71c4amph0vgo2qllky")
      // out-of-bound path param
      assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
