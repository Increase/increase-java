// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.CardDisputeCreateParams
import com.increase.api.models.CardDisputeListParams
import com.increase.api.models.CardDisputeRetrieveParams
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
                    .disputedTransactionId("transaction_uyrp7fld2ium70oa7oi")
                    .explanation("Unauthorized recurring transaction.")
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
                CardDisputeRetrieveParams.builder()
                    .cardDisputeId("card_dispute_h9sc95nbl1cgltpp7men")
                    .build()
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
