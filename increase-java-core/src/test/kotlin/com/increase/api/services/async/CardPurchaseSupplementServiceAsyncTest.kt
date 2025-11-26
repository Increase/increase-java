// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CardPurchaseSupplementServiceAsyncTest {

    @Test
    fun retrieve() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val cardPurchaseSupplementServiceAsync = client.cardPurchaseSupplements()

        val cardPurchaseSupplementFuture =
            cardPurchaseSupplementServiceAsync.retrieve(
                "card_purchase_supplement_ijuc45iym4jchnh2sfk3"
            )

        val cardPurchaseSupplement = cardPurchaseSupplementFuture.get()
        cardPurchaseSupplement.validate()
    }

    @Test
    fun list() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val cardPurchaseSupplementServiceAsync = client.cardPurchaseSupplements()

        val pageFuture = cardPurchaseSupplementServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }
}
