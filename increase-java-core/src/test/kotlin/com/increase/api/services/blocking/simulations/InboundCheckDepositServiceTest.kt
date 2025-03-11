// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking.simulations

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.simulations.inboundcheckdeposits.InboundCheckDepositCreateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class InboundCheckDepositServiceTest {

    @Test
    fun create() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val inboundCheckDepositService = client.simulations().inboundCheckDeposits()

      val inboundCheckDeposit = inboundCheckDepositService.create(InboundCheckDepositCreateParams.builder()
          .accountNumberId("account_number_v18nkfqm6afpsrvy82b2")
          .amount(1000L)
          .checkNumber("1234567890")
          .build())

      inboundCheckDeposit.validate()
    }
}
