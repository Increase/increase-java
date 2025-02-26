// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking.simulations

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.SimulationPhysicalCardAdvanceShipmentParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class PhysicalCardServiceTest {

    @Test
    fun advanceShipment() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val physicalCardService = client.simulations().physicalCards()

        val physicalCard =
            physicalCardService.advanceShipment(
                SimulationPhysicalCardAdvanceShipmentParams.builder()
                    .physicalCardId("physical_card_ode8duyq5v2ynhjoharl")
                    .shipmentStatus(
                        SimulationPhysicalCardAdvanceShipmentParams.ShipmentStatus.PENDING
                    )
                    .build()
            )

        physicalCard.validate()
    }
}
