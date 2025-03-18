// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async.simulations

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import com.increase.api.models.simulations.physicalcards.PhysicalCardAdvanceShipmentParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PhysicalCardServiceAsyncTest {

    @Test
    fun advanceShipment() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val physicalCardServiceAsync = client.simulations().physicalCards()

        val physicalCardFuture =
            physicalCardServiceAsync.advanceShipment(
                PhysicalCardAdvanceShipmentParams.builder()
                    .physicalCardId("physical_card_ode8duyq5v2ynhjoharl")
                    .shipmentStatus(PhysicalCardAdvanceShipmentParams.ShipmentStatus.PENDING)
                    .build()
            )

        val physicalCard = physicalCardFuture.get()
        physicalCard.validate()
    }
}
