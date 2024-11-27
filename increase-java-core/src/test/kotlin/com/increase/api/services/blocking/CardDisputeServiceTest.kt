// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.*
import com.increase.api.models.CardDisputeListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class CardDisputeServiceTest {

    @Test
    fun callCreate() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val cardDisputeService = client.cardDisputes()
        val cardDispute =
            cardDisputeService.create(
                CardDisputeCreateParams.builder()
                    .disputedTransactionId("disputed_transaction_id")
                    .explanation("x")
                    .amount(1L)
                    .build()
            )
        println(cardDispute)
        cardDispute.validate()
    }

    @Test
    fun callRetrieve() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val cardDisputeService = client.cardDisputes()
        val cardDispute =
            cardDisputeService.retrieve(
                CardDisputeRetrieveParams.builder().cardDisputeId("card_dispute_id").build()
            )
        println(cardDispute)
        cardDispute.validate()
    }

    @Test
    fun callList() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val cardDisputeService = client.cardDisputes()
        val cardDisputeList = cardDisputeService.list(CardDisputeListParams.builder().build())
        println(cardDisputeList)
        cardDisputeList.data().forEach { it.validate() }
    }
}
