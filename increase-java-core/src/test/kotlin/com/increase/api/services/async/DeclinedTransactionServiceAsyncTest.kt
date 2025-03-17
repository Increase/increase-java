// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import com.increase.api.models.declinedtransactions.DeclinedTransactionRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class DeclinedTransactionServiceAsyncTest {

    @Test
    fun retrieve() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val declinedTransactionServiceAsync = client.declinedTransactions()

        val declinedTransactionFuture =
            declinedTransactionServiceAsync.retrieve(
                DeclinedTransactionRetrieveParams.builder()
                    .declinedTransactionId("declined_transaction_17jbn0yyhvkt4v4ooym8")
                    .build()
            )

        val declinedTransaction = declinedTransactionFuture.get()
        declinedTransaction.validate()
    }

    @Test
    fun list() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val declinedTransactionServiceAsync = client.declinedTransactions()

        val pageFuture = declinedTransactionServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }
}
