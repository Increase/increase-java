package com.increase.api.services.blocking.simulations

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class DigitalWalletTokenRequestServiceTest {

    @Test
    fun callCreate() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .build()
        val digitalWalletTokenRequestService = client.simulations().digitalWalletTokenRequests()
        val digitalWalletTokenRequestCreateResponse =
            digitalWalletTokenRequestService.create(
                SimulationDigitalWalletTokenRequestCreateParams.builder().cardId("string").build()
            )
        println(digitalWalletTokenRequestCreateResponse)
        digitalWalletTokenRequestCreateResponse.validate()
    }
}
