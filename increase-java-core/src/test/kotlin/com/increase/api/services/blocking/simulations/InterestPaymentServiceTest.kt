// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking.simulations

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.*
import java.time.OffsetDateTime
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
                    .periodEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .periodStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        println(interestPaymentSimulationResult)
        interestPaymentSimulationResult.validate()
    }
}
