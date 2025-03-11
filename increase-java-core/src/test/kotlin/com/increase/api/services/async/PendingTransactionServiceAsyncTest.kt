// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import com.increase.api.models.pendingtransactions.PendingTransactionListParams
import com.increase.api.models.pendingtransactions.PendingTransactionRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class PendingTransactionServiceAsyncTest {

    @Test
    fun retrieve() {
      val client = IncreaseOkHttpClientAsync.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val pendingTransactionServiceAsync = client.pendingTransactions()

      val pendingTransactionFuture = pendingTransactionServiceAsync.retrieve(PendingTransactionRetrieveParams.builder()
          .pendingTransactionId("pending_transaction_k1sfetcau2qbvjbzgju4")
          .build())

      val pendingTransaction = pendingTransactionFuture.get()
      pendingTransaction.validate()
    }

    @Test
    fun list() {
      val client = IncreaseOkHttpClientAsync.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val pendingTransactionServiceAsync = client.pendingTransactions()

      val pageFuture = pendingTransactionServiceAsync.list()

      val page = pageFuture.get()
      page.response().validate()
    }
}
