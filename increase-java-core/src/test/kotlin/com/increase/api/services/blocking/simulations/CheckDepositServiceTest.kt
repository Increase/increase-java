// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking.simulations

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.simulations.checkdeposits.CheckDepositRejectParams
import com.increase.api.models.simulations.checkdeposits.CheckDepositReturnParams
import com.increase.api.models.simulations.checkdeposits.CheckDepositSubmitParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class CheckDepositServiceTest {

    @Test
    fun reject() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val checkDepositService = client.simulations().checkDeposits()

      val checkDeposit = checkDepositService.reject(CheckDepositRejectParams.builder()
          .checkDepositId("check_deposit_f06n9gpg7sxn8t19lfc1")
          .build())

      checkDeposit.validate()
    }

    @Test
    fun return_() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val checkDepositService = client.simulations().checkDeposits()

      val checkDeposit = checkDepositService.return_(CheckDepositReturnParams.builder()
          .checkDepositId("check_deposit_f06n9gpg7sxn8t19lfc1")
          .build())

      checkDeposit.validate()
    }

    @Test
    fun submit() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val checkDepositService = client.simulations().checkDeposits()

      val checkDeposit = checkDepositService.submit(CheckDepositSubmitParams.builder()
          .checkDepositId("check_deposit_f06n9gpg7sxn8t19lfc1")
          .build())

      checkDeposit.validate()
    }
}
