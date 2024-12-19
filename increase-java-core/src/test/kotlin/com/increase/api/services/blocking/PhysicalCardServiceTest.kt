// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.PhysicalCardCreateParams
import com.increase.api.models.PhysicalCardListParams
import com.increase.api.models.PhysicalCardRetrieveParams
import com.increase.api.models.PhysicalCardUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class PhysicalCardServiceTest {

    @Test
    fun callCreate() {
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
                            .build()
                    )
                    .physicalCardProfileId("physical_card_profile_id")
                    .build()
            )
        println(physicalCard)
        physicalCard.validate()
    }

    @Test
    fun callRetrieve() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val physicalCardService = client.physicalCards()
        val physicalCard =
            physicalCardService.retrieve(
                PhysicalCardRetrieveParams.builder()
                    .physicalCardId("physical_card_ode8duyq5v2ynhjoharl")
                    .build()
            )
        println(physicalCard)
        physicalCard.validate()
    }

    @Test
    fun callUpdate() {
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
                    .status(PhysicalCardUpdateParams.Status.ACTIVE)
                    .build()
            )
        println(physicalCard)
        physicalCard.validate()
    }

    @Test
    fun callList() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val physicalCardService = client.physicalCards()
        val physicalCardList = physicalCardService.list(PhysicalCardListParams.builder().build())
        println(physicalCardList)
        physicalCardList.data().forEach { it.validate() }
    }
}
