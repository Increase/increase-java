// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.physicalcards.PhysicalCardCreateParams
import com.increase.api.models.physicalcards.PhysicalCardUpdateParams
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
        val physicalCardService = client.physicalCards()

        val physicalCard =
            physicalCardService.create(
                PhysicalCardCreateParams.builder()
                    .cardId("card_oubs0hwk5rn6knuecxg2")
                    .cardholder(
                        PhysicalCardCreateParams.Cardholder.builder()
                            .firstName("Ian")
                            .lastName("Crease")
                            .build()
                    )
                    .shipment(
                        PhysicalCardCreateParams.Shipment.builder()
                            .address(
                                PhysicalCardCreateParams.Shipment.Address.builder()
                                    .city("New York")
                                    .line1("33 Liberty Street")
                                    .name("Ian Crease")
                                    .postalCode("10045")
                                    .state("NY")
                                    .line2("Unit 2")
                                    .line3("x")
                                    .phoneNumber("x")
                                    .build()
                            )
                            .method(PhysicalCardCreateParams.Shipment.Method.USPS)
                            .schedule(PhysicalCardCreateParams.Shipment.Schedule.NEXT_DAY)
                            .build()
                    )
                    .physicalCardProfileId("physical_card_profile_id")
                    .build()
            )

        physicalCard.validate()
    }

    @Test
    fun retrieve() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val physicalCardService = client.physicalCards()

        val physicalCard = physicalCardService.retrieve("physical_card_ode8duyq5v2ynhjoharl")

        physicalCard.validate()
    }

    @Test
    fun update() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val physicalCardService = client.physicalCards()

        val physicalCard =
            physicalCardService.update(
                PhysicalCardUpdateParams.builder()
                    .physicalCardId("physical_card_ode8duyq5v2ynhjoharl")
                    .status(PhysicalCardUpdateParams.Status.DISABLED)
                    .build()
            )

        physicalCard.validate()
    }

    @Test
    fun list() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val physicalCardService = client.physicalCards()

        val page = physicalCardService.list()

        page.response().validate()
    }
}
