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
import com.increase.api.services.blocking.simulations.RealTimePaymentsTransferService
import com.increase.api.models.*

@ExtendWith(TestServerExtension::class)
class RealTimePaymentsTransferServiceTest {

    @Test
    fun callCreateInbound() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("test-api-key")
          .build()
      val realTimePaymentsTransferService = client.simulations().realTimePaymentsTransfers()
      val inboundRealTimePaymentsTransferSimulationResult = realTimePaymentsTransferService.createInbound(SimulationsRealTimePaymentsTransferCreateInboundParams.builder()
          .accountNumberId("string")
          .amount(123L)
          .requestForPaymentId("string")
          .debtorName("x")
          .debtorAccountNumber("x")
          .debtorRoutingNumber("xxxxxxxxx")
          .remittanceInformation("x")
          .build())
      println(inboundRealTimePaymentsTransferSimulationResult)
      inboundRealTimePaymentsTransferSimulationResult.validate()
    }
}
