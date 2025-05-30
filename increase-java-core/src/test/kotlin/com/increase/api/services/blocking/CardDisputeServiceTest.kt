// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.carddisputes.CardDisputeCreateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CardDisputeServiceTest {

    @Test
    fun create() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val cardDisputeService = client.cardDisputes()

        val cardDispute =
            cardDisputeService.create(
                CardDisputeCreateParams.builder()
                    .disputedTransactionId("transaction_uyrp7fld2ium70oa7oi")
                    .explanation("Unauthorized recurring transaction.")
                    .amount(1L)
                    .build()
            )

        cardDispute.validate()
    }

    @Test
    fun retrieve() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val cardDisputeService = client.cardDisputes()

        val cardDispute = cardDisputeService.retrieve("card_dispute_h9sc95nbl1cgltpp7men")

        cardDispute.validate()
    }

    @Test
    fun list() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val cardDisputeService = client.cardDisputes()

        val page = cardDisputeService.list()

        page.response().validate()
    }
}
