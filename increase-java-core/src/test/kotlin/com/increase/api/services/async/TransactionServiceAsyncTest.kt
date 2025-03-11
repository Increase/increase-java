// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import com.increase.api.models.transactions.TransactionListParams
import com.increase.api.models.transactions.TransactionRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class TransactionServiceAsyncTest {

    @Test
    fun retrieve() {
      val client = IncreaseOkHttpClientAsync.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val transactionServiceAsync = client.transactions()

      val transactionFuture = transactionServiceAsync.retrieve(TransactionRetrieveParams.builder()
          .transactionId("transaction_uyrp7fld2ium70oa7oi")
          .build())

      val transaction = transactionFuture.get()
      transaction.validate()
    }

    @Test
    fun list() {
      val client = IncreaseOkHttpClientAsync.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val transactionServiceAsync = client.transactions()

      val pageFuture = transactionServiceAsync.list()

      val page = pageFuture.get()
      page.response().validate()
    }
}
