// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.*
import com.increase.api.models.DeclinedTransactionListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class DeclinedTransactionServiceTest {

    @Test
    fun callRetrieve() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .build()
        val declinedTransactionService = client.declinedTransactions()
        val declinedTransaction =
            declinedTransactionService.retrieve(
                DeclinedTransactionRetrieveParams.builder().declinedTransactionId("string").build()
            )
        println(declinedTransaction)
        declinedTransaction.validate()
    }

    @Test
    fun callList() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .build()
        val declinedTransactionService = client.declinedTransactions()
        val declinedTransactionList =
            declinedTransactionService.list(DeclinedTransactionListParams.builder().build())
        println(declinedTransactionList)
        declinedTransactionList.data().forEach { it.validate() }
    }
}
