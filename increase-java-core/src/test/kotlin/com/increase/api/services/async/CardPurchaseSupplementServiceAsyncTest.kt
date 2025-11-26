// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import com.increase.api.models.cardpurchasesupplements.CardPurchaseSupplementListParams
import java.time.OffsetDateTime
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

        val cardPurchaseSupplementsFuture =
            cardPurchaseSupplementServiceAsync.list(
                CardPurchaseSupplementListParams.builder()
                    .cardPaymentId("card_payment_id")
                    .createdAt(
                        CardPurchaseSupplementListParams.CreatedAt.builder()
                            .after(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .before(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .onOrAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .onOrBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .cursor("cursor")
                    .limit(1L)
                    .build()
            )

        val cardPurchaseSupplements = cardPurchaseSupplementsFuture.get()
        cardPurchaseSupplements.validate()
    }
}
