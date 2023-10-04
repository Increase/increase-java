// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.*
import com.increase.api.models.PhysicalCardListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class PhysicalCardServiceTest {

    @Test
    fun callCreate() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .build()
        val physicalCardService = client.physicalCards()
        val physicalCard =
            physicalCardService.create(
                PhysicalCardCreateParams.builder()
                    .cardId("string")
                    .cardProfileId("string")
                    .cardholder(
                        PhysicalCardCreateParams.Cardholder.builder()
                            .firstName("x")
                            .lastName("x")
                            .build()
                    )
                    .shipment(
                        PhysicalCardCreateParams.Shipment.builder()
                            .address(
                                PhysicalCardCreateParams.Shipment.Address.builder()
                                    .city("x")
                                    .line1("x")
                                    .name("x")
                                    .postalCode("x")
                                    .state("x")
                                    .line2("x")
                                    .line3("x")
                                    .phoneNumber("x")
                                    .build()
                            )
                            .method(PhysicalCardCreateParams.Shipment.Method.USPS)
                            .build()
                    )
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
                .apiKey("test-api-key")
                .build()
        val physicalCardService = client.physicalCards()
        val physicalCard =
            physicalCardService.retrieve(
                PhysicalCardRetrieveParams.builder().physicalCardId("string").build()
            )
        println(physicalCard)
        physicalCard.validate()
    }

    @Test
    fun callUpdate() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .build()
        val physicalCardService = client.physicalCards()
        val physicalCard =
            physicalCardService.update(
                PhysicalCardUpdateParams.builder()
                    .physicalCardId("string")
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
                .apiKey("test-api-key")
                .build()
        val physicalCardService = client.physicalCards()
        val physicalCardList = physicalCardService.list(PhysicalCardListParams.builder().build())
        println(physicalCardList)
        physicalCardList.data().forEach { it.validate() }
    }
}