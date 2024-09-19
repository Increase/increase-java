// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking.simulations

import java.time.LocalDate
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Base64
import java.util.Optional
import java.util.UUID
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.extension.ExtendWith
import org.junit.jupiter.api.BeforeEach
import com.increase.api.TestServerExtension
import com.increase.api.client.IncreaseClient
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.core.JsonNull
import com.increase.api.core.JsonString
import com.increase.api.core.JsonValue
import com.increase.api.core.http.BinaryResponseContent
import com.increase.api.services.blocking.simulations.CardAuthorizationService
import com.increase.api.models.*

@ExtendWith(TestServerExtension::class)
class CardAuthorizationServiceTest {

    @Test
    fun callCreate() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val cardAuthorizationService = client.simulations().cardAuthorizations()
      val simulationCardAuthorizationCreateResponse = cardAuthorizationService.create(SimulationCardAuthorizationCreateParams.builder()
          .amount(123L)
          .cardId("card_id")
          .digitalWalletTokenId("digital_wallet_token_id")
          .eventSubscriptionId("event_subscription_id")
          .merchantAcceptorId("x")
          .merchantCategoryCode("x")
          .merchantCity("x")
          .merchantCountry("x")
          .merchantDescriptor("x")
          .physicalCardId("physical_card_id")
          .build())
      println(simulationCardAuthorizationCreateResponse)
      simulationCardAuthorizationCreateResponse.validate()
    }
}
