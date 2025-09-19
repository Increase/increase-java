// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking.simulations

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.simulations.physicalcards.PhysicalCardAdvanceShipmentParams
import com.increase.api.models.simulations.physicalcards.PhysicalCardCreateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PhysicalCardServiceTest {

    @Test
    fun create() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val physicalCardService = client.simulations().physicalCards()

        val physicalCard =
            physicalCardService.create(
                PhysicalCardCreateParams.builder()
                    .physicalCardId("physical_card_ode8duyq5v2ynhjoharl")
                    .category(PhysicalCardCreateParams.Category.DELIVERED)
                    .carrierEstimatedDeliveryAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .city("New York")
                    .postalCode("10045")
                    .state("NY")
                    .build()
            )

        physicalCard.validate()
    }

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
                PhysicalCardAdvanceShipmentParams.builder()
                    .physicalCardId("physical_card_ode8duyq5v2ynhjoharl")
                    .shipmentStatus(PhysicalCardAdvanceShipmentParams.ShipmentStatus.SHIPPED)
                    .build()
            )

        physicalCard.validate()
    }
}
