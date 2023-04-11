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
import com.increase.api.services.blocking.simulations.CheckTransferService
import com.increase.api.models.*

@ExtendWith(TestServerExtension::class)
class CheckTransferServiceTest {

    @Test
    fun callDeposit() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("test-api-key")
          .build()
      val checkTransferService = client.simulations().checkTransfers()
      val checkTransfer = checkTransferService.deposit(SimulationsCheckTransferDepositParams.builder()
          .checkTransferId("string")
          .build())
      println(checkTransfer)
      checkTransfer.validate()
    }

    @Disabled("Prism incorrectly returns an invalid JSON error")
    @Test
    fun callMail() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("test-api-key")
          .build()
      val checkTransferService = client.simulations().checkTransfers()
      val checkTransfer = checkTransferService.mail(SimulationsCheckTransferMailParams.builder()
          .checkTransferId("string")
          .build())
      println(checkTransfer)
      checkTransfer.validate()
    }

    @Test
    fun callReturn() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("test-api-key")
          .build()
      val checkTransferService = client.simulations().checkTransfers()
      val checkTransfer = checkTransferService.return_(SimulationsCheckTransferReturnParams.builder()
          .checkTransferId("string")
          .reason(SimulationsCheckTransferReturnParams.Reason.MAIL_DELIVERY_FAILURE)
          .build())
      println(checkTransfer)
      checkTransfer.validate()
    }
}
