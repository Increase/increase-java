// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import com.increase.api.models.carddisputes.CardDisputeCreateParams
import com.increase.api.models.carddisputes.CardDisputeListParams
import com.increase.api.models.carddisputes.CardDisputeRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class CardDisputeServiceAsyncTest {

    @Test
    fun create() {
      val client = IncreaseOkHttpClientAsync.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val cardDisputeServiceAsync = client.cardDisputes()

      val cardDisputeFuture = cardDisputeServiceAsync.create(CardDisputeCreateParams.builder()
          .disputedTransactionId("transaction_uyrp7fld2ium70oa7oi")
          .explanation("Unauthorized recurring transaction.")
          .amount(1L)
          .build())

      val cardDispute = cardDisputeFuture.get()
      cardDispute.validate()
    }

    @Test
    fun retrieve() {
      val client = IncreaseOkHttpClientAsync.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val cardDisputeServiceAsync = client.cardDisputes()

      val cardDisputeFuture = cardDisputeServiceAsync.retrieve(CardDisputeRetrieveParams.builder()
          .cardDisputeId("card_dispute_h9sc95nbl1cgltpp7men")
          .build())

      val cardDispute = cardDisputeFuture.get()
      cardDispute.validate()
    }

    @Test
    fun list() {
      val client = IncreaseOkHttpClientAsync.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val cardDisputeServiceAsync = client.cardDisputes()

      val pageFuture = cardDisputeServiceAsync.list()

      val page = pageFuture.get()
      page.response().validate()
    }
}
