package com.increase.api.services.blocking

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.*
import com.increase.api.models.PendingTransactionListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class PendingTransactionServiceTest {

    @Test
    fun callRetrieve() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .build()
        val pendingTransactionService = client.pendingTransactions()
        val pendingTransaction =
            pendingTransactionService.retrieve(
                PendingTransactionRetrieveParams.builder().pendingTransactionId("string").build()
            )
        println(pendingTransaction)
        pendingTransaction.validate()
    }

    @Test
    fun callList() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .build()
        val pendingTransactionService = client.pendingTransactions()
        val pendingTransactionList =
            pendingTransactionService.list(PendingTransactionListParams.builder().build())
        println(pendingTransactionList)
        pendingTransactionList.data().forEach { it.validate() }
    }
}
