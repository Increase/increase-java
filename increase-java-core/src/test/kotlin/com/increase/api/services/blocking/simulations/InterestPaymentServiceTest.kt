package com.increase.api.services.blocking.simulations

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class InterestPaymentServiceTest {

    @Test
    fun callCreate() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .build()
        val interestPaymentService = client.simulations().interestPayments()
        val interestPaymentSimulationResult =
            interestPaymentService.create(
                SimulationInterestPaymentCreateParams.builder()
                    .accountId("string")
                    .amount(123L)
                    .build()
            )
        println(interestPaymentSimulationResult)
        interestPaymentSimulationResult.validate()
    }
}
