// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.cardpurchasesupplements.CardPurchaseSupplementListParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CardPurchaseSupplementServiceTest {

    @Test
    fun retrieve() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val cardPurchaseSupplementService = client.cardPurchaseSupplements()

        val cardPurchaseSupplement =
            cardPurchaseSupplementService.retrieve("card_purchase_supplement_ijuc45iym4jchnh2sfk3")

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

        val cardPurchaseSupplements =
            cardPurchaseSupplementService.list(
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

        cardPurchaseSupplements.validate()
    }
}
