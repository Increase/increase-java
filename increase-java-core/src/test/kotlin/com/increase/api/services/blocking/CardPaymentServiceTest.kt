package com.increase.api.services.blocking

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.*
import com.increase.api.models.CardPaymentListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class CardPaymentServiceTest {

    @Test
    fun callRetrieve() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .build()
        val cardPaymentService = client.cardPayments()
        val cardPayment =
            cardPaymentService.retrieve(
                CardPaymentRetrieveParams.builder().cardPaymentId("string").build()
            )
        println(cardPayment)
        cardPayment.validate()
    }

    @Test
    fun callList() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .build()
        val cardPaymentService = client.cardPayments()
        val cardPaymentList = cardPaymentService.list(CardPaymentListParams.builder().build())
        println(cardPaymentList)
        cardPaymentList.data().forEach { it.validate() }
    }
}
