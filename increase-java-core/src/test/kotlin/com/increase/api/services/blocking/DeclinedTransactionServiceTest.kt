// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.DeclinedTransactionRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class DeclinedTransactionServiceTest {

    @Test
    fun callRetrieve() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val declinedTransactionService = client.declinedTransactions()
        val declinedTransaction =
            declinedTransactionService.retrieve(
                DeclinedTransactionRetrieveParams.builder()
                    .declinedTransactionId("declined_transaction_17jbn0yyhvkt4v4ooym8")
                    .build()
            )
        println(declinedTransaction)
        declinedTransaction.validate()
    }

    @Test
    fun callList() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val declinedTransactionService = client.declinedTransactions()
        val declinedTransactionList = declinedTransactionService.list()
        println(declinedTransactionList)
        declinedTransactionList.data().forEach { it.validate() }
    }
}
