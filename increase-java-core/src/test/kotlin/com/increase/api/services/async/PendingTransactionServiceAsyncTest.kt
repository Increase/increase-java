// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import com.increase.api.models.pendingtransactions.PendingTransactionCreateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PendingTransactionServiceAsyncTest {

    @Test
    fun create() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val pendingTransactionServiceAsync = client.pendingTransactions()

        val pendingTransactionFuture =
            pendingTransactionServiceAsync.create(
                PendingTransactionCreateParams.builder()
                    .accountId("account_in71c4amph0vgo2qllky")
                    .amount(-1000L)
                    .description("Hold for pending transaction")
                    .build()
            )

        val pendingTransaction = pendingTransactionFuture.get()
        pendingTransaction.validate()
    }

    @Test
    fun retrieve() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val pendingTransactionServiceAsync = client.pendingTransactions()

        val pendingTransactionFuture =
            pendingTransactionServiceAsync.retrieve("pending_transaction_k1sfetcau2qbvjbzgju4")

        val pendingTransaction = pendingTransactionFuture.get()
        pendingTransaction.validate()
    }

    @Test
    fun list() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val pendingTransactionServiceAsync = client.pendingTransactions()

        val pageFuture = pendingTransactionServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Test
    fun release() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val pendingTransactionServiceAsync = client.pendingTransactions()

        val pendingTransactionFuture =
            pendingTransactionServiceAsync.release("pending_transaction_k1sfetcau2qbvjbzgju4")

        val pendingTransaction = pendingTransactionFuture.get()
        pendingTransaction.validate()
    }
}
