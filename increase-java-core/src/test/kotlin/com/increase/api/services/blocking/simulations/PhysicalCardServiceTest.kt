// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking.simulations

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class PhysicalCardServiceTest {

    @Test
    fun callShipmentAdvance() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val physicalCardService = client.simulations().physicalCards()
        val physicalCard =
            physicalCardService.shipmentAdvance(
                SimulationPhysicalCardShipmentAdvanceParams.builder()
                    .physicalCardId("string")
                    .shipmentStatus(
                        SimulationPhysicalCardShipmentAdvanceParams.ShipmentStatus.PENDING
                    )
                    .build()
            )
        println(physicalCard)
        physicalCard.validate()
    }
}
