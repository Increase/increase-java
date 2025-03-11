// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.simulations.accounttransfers

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AccountTransferCompleteParamsTest {

    @Test
    fun create() {
      AccountTransferCompleteParams.builder()
          .accountTransferId("account_transfer_7k9qe1ysdgqztnt63l7n")
          .build()
    }

    @Test
    fun getPathParam() {
      val params = AccountTransferCompleteParams.builder()
          .accountTransferId("account_transfer_7k9qe1ysdgqztnt63l7n")
          .build()
      assertThat(params).isNotNull
      // path param "accountTransferId"
      assertThat(params.getPathParam(0)).isEqualTo("account_transfer_7k9qe1ysdgqztnt63l7n")
      // out-of-bound path param
      assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
