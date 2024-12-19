// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.CardPaymentListParams
import com.increase.api.models.CardPaymentRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class CardPaymentServiceTest {

    @Test
    fun callRetrieve() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val cardPaymentService = client.cardPayments()
        val cardPayment =
            cardPaymentService.retrieve(
                CardPaymentRetrieveParams.builder()
                    .cardPaymentId("card_payment_nd3k2kacrqjli8482ave")
                    .build()
            )
        println(cardPayment)
        cardPayment.validate()
    }

    @Test
    fun callList() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val cardPaymentService = client.cardPayments()
        val cardPaymentList = cardPaymentService.list(CardPaymentListParams.builder().build())
        println(cardPaymentList)
        cardPaymentList.data().forEach { it.validate() }
    }
}
