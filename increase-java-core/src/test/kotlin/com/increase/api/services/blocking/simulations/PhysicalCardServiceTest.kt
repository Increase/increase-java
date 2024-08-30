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
import com.increase.api.services.blocking.simulations.PhysicalCardService
import com.increase.api.models.*

@ExtendWith(TestServerExtension::class)
class PhysicalCardServiceTest {

    @Test
    fun callAdvanceShipment() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val physicalCardService = client.simulations().physicalCards()
      val physicalCard = physicalCardService.advanceShipment(SimulationPhysicalCardAdvanceShipmentParams.builder()
          .physicalCardId("physical_card_id")
          .shipmentStatus(SimulationPhysicalCardAdvanceShipmentParams.ShipmentStatus.PENDING)
          .build())
      println(physicalCard)
      physicalCard.validate()
    }
}
