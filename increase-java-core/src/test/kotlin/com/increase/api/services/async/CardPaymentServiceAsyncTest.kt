// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import com.increase.api.models.CardPaymentRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class CardPaymentServiceAsyncTest {

    @Test
    fun retrieve() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val cardPaymentServiceAsync = client.cardPayments()

        val cardPaymentFuture =
            cardPaymentServiceAsync.retrieve(
                CardPaymentRetrieveParams.builder()
                    .cardPaymentId("card_payment_nd3k2kacrqjli8482ave")
                    .build()
            )

        val cardPayment = cardPaymentFuture.get()
        cardPayment.validate()
    }

    @Test
    fun list() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val cardPaymentServiceAsync = client.cardPayments()

        val pageFuture = cardPaymentServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }
}
