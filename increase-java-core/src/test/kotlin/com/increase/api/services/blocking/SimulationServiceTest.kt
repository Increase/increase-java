// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class SimulationServiceTest {

    @Test
    fun callCardAuthorizationExpirations() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val simulationService = client.simulations()
        val cardPayment =
            simulationService.cardAuthorizationExpirations(
                SimulationCardAuthorizationExpirationsParams.builder()
                    .cardPaymentId("card_payment_id")
                    .build()
            )
        println(cardPayment)
        cardPayment.validate()
    }

    @Test
    fun callCardFuelConfirmations() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val simulationService = client.simulations()
        val cardPayment =
            simulationService.cardFuelConfirmations(
                SimulationCardFuelConfirmationsParams.builder()
                    .amount(123L)
                    .cardPaymentId("card_payment_id")
                    .build()
            )
        println(cardPayment)
        cardPayment.validate()
    }

    @Test
    fun callCardIncrements() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val simulationService = client.simulations()
        val cardPayment =
            simulationService.cardIncrements(
                SimulationCardIncrementsParams.builder()
                    .amount(123L)
                    .cardPaymentId("card_payment_id")
                    .eventSubscriptionId("event_subscription_id")
                    .build()
            )
        println(cardPayment)
        cardPayment.validate()
    }

    @Test
    fun callCardReversals() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val simulationService = client.simulations()
        val cardPayment =
            simulationService.cardReversals(
                SimulationCardReversalsParams.builder()
                    .cardPaymentId("card_payment_id")
                    .amount(123L)
                    .build()
            )
        println(cardPayment)
        cardPayment.validate()
    }
}
