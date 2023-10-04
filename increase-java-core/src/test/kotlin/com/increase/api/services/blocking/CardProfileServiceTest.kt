// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.*
import com.increase.api.models.CardProfileListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class CardProfileServiceTest {

    @Test
    fun callCreate() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .build()
        val cardProfileService = client.cardProfiles()
        val cardProfile =
            cardProfileService.create(
                CardProfileCreateParams.builder()
                    .description("x")
                    .digitalWallets(
                        CardProfileCreateParams.DigitalWallets.builder()
                            .appIconFileId("string")
                            .backgroundImageFileId("string")
                            .cardDescription("x")
                            .issuerName("x")
                            .contactEmail("x")
                            .contactPhone("x")
                            .contactWebsite("string")
                            .textColor(
                                CardProfileCreateParams.DigitalWallets.TextColor.builder()
                                    .blue(123L)
                                    .green(123L)
                                    .red(123L)
                                    .build()
                            )
                            .build()
                    )
                    .physicalCards(
                        CardProfileCreateParams.PhysicalCards.builder()
                            .carrierImageFileId("string")
                            .contactPhone("x")
                            .frontImageFileId("string")
                            .build()
                    )
                    .build()
            )
        println(cardProfile)
        cardProfile.validate()
    }

    @Test
    fun callRetrieve() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .build()
        val cardProfileService = client.cardProfiles()
        val cardProfile =
            cardProfileService.retrieve(
                CardProfileRetrieveParams.builder().cardProfileId("string").build()
            )
        println(cardProfile)
        cardProfile.validate()
    }

    @Test
    fun callList() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .build()
        val cardProfileService = client.cardProfiles()
        val cardProfileList = cardProfileService.list(CardProfileListParams.builder().build())
        println(cardProfileList)
        cardProfileList.data().forEach { it.validate() }
    }

    @Test
    fun callArchive() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .build()
        val cardProfileService = client.cardProfiles()
        val cardProfile =
            cardProfileService.archive(
                CardProfileArchiveParams.builder().cardProfileId("string").build()
            )
        println(cardProfile)
        cardProfile.validate()
    }
}
