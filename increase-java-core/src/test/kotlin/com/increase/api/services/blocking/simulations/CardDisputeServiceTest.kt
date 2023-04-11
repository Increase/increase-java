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
import com.increase.api.services.blocking.simulations.CardDisputeService
import com.increase.api.models.*

@ExtendWith(TestServerExtension::class)
class CardDisputeServiceTest {

    @Test
    fun callAction() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("test-api-key")
          .build()
      val cardDisputeService = client.simulations().cardDisputes()
      val cardDispute = cardDisputeService.action(SimulationsCardDisputeActionParams.builder()
          .cardDisputeId("string")
          .status(SimulationsCardDisputeActionParams.Status.ACCEPTED)
          .explanation("x")
          .build())
      println(cardDispute)
      cardDispute.validate()
    }
}
