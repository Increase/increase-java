package com.increase.api.services.blocking.simulations

import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Base64
import java.util.Optional
import java.util.UUID
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.extension.ExtendWith
import com.increase.api.TestServerExtension
import com.increase.api.client.IncreaseClient
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.services.blocking.simulations.CheckDepositService
import com.increase.api.models.*

@ExtendWith(TestServerExtension::class)
class CheckDepositServiceTest {

    @Disabled("Prism incorrectly returns an invalid JSON error")
    @Test
    fun callReject() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("test-api-key")
          .build()
      val checkDepositService = client.simulations().checkDeposits()
      val checkDeposit = checkDepositService.reject(SimulationsCheckDepositRejectParams.builder()
          .checkDepositId("string")
          .build())
      println(checkDeposit)
      checkDeposit.validate()
    }

    @Test
    fun callReturn() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("test-api-key")
          .build()
      val checkDepositService = client.simulations().checkDeposits()
      val checkDeposit = checkDepositService.return_(SimulationsCheckDepositReturnParams.builder()
          .checkDepositId("string")
          .build())
      println(checkDeposit)
      checkDeposit.validate()
    }

    @Disabled("Prism incorrectly returns an invalid JSON error")
    @Test
    fun callSubmit() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("test-api-key")
          .build()
      val checkDepositService = client.simulations().checkDeposits()
      val checkDeposit = checkDepositService.submit(SimulationsCheckDepositSubmitParams.builder()
          .checkDepositId("string")
          .build())
      println(checkDeposit)
      checkDeposit.validate()
    }
}
