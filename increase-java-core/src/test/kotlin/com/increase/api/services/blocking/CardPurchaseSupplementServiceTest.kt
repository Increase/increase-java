// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.CardPurchaseSupplementRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class CardPurchaseSupplementServiceTest {

    @Test
    fun retrieve() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val cardPurchaseSupplementService = client.cardPurchaseSupplements()

        val cardPurchaseSupplement =
            cardPurchaseSupplementService.retrieve(
                CardPurchaseSupplementRetrieveParams.builder()
                    .cardPurchaseSupplementId("card_purchase_supplement_ijuc45iym4jchnh2sfk3")
                    .build()
            )

        cardPurchaseSupplement.validate()
    }

    @Test
    fun list() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val cardPurchaseSupplementService = client.cardPurchaseSupplements()

        val page = cardPurchaseSupplementService.list()

        page.response().validate()
    }
}
