// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.cardpayments.CardPaymentListParams
import com.increase.api.models.cardpayments.CardPaymentRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class CardPaymentServiceTest {

    @Test
    fun retrieve() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val cardPaymentService = client.cardPayments()

      val cardPayment = cardPaymentService.retrieve(CardPaymentRetrieveParams.builder()
          .cardPaymentId("card_payment_nd3k2kacrqjli8482ave")
          .build())

      cardPayment.validate()
    }

    @Test
    fun list() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val cardPaymentService = client.cardPayments()

      val page = cardPaymentService.list()

      page.response().validate()
    }
}
