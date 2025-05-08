// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PendingTransactionServiceTest {

    @Test
    fun retrieve() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val pendingTransactionService = client.pendingTransactions()

        val pendingTransaction =
            pendingTransactionService.retrieve("pending_transaction_k1sfetcau2qbvjbzgju4")

        pendingTransaction.validate()
    }

    @Test
    fun list() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val pendingTransactionService = client.pendingTransactions()

        val page = pendingTransactionService.list()

        page.response().validate()
    }
}
