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
import com.increase.api.services.blocking.simulations.AchTransferService
import com.increase.api.models.*

@ExtendWith(TestServerExtension::class)
class AchTransferServiceTest {

    @Test
    fun callCreateInbound() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("test-api-key")
          .build()
      val achTransferService = client.simulations().achTransfers()
      val achTransferSimulation = achTransferService.createInbound(SimulationsAchTransferCreateInboundParams.builder()
          .accountNumberId("string")
          .amount(123L)
          .companyDescriptiveDate("x")
          .companyDiscretionaryData("x")
          .companyEntryDescription("x")
          .companyName("x")
          .companyId("x")
          .build())
      println(achTransferSimulation)
      achTransferSimulation.validate()
    }

    @Disabled("Prism incorrectly returns an invalid JSON error")
    @Test
    fun callReturn() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("test-api-key")
          .build()
      val achTransferService = client.simulations().achTransfers()
      val achTransfer = achTransferService.return_(SimulationsAchTransferReturnParams.builder()
          .achTransferId("string")
          .reason(SimulationsAchTransferReturnParams.Reason.INSUFFICIENT_FUND)
          .build())
      println(achTransfer)
      achTransfer.validate()
    }

    @Disabled("Prism incorrectly returns an invalid JSON error")
    @Test
    fun callSubmit() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("test-api-key")
          .build()
      val achTransferService = client.simulations().achTransfers()
      val achTransfer = achTransferService.submit(SimulationsAchTransferSubmitParams.builder()
          .achTransferId("string")
          .build())
      println(achTransfer)
      achTransfer.validate()
    }
}
