package com.increase.api.services.blocking.simulations

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class CardServiceTest {

    @Test
    fun callAuthorize() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .build()
        val cardService = client.simulations().cards()
        val cardAuthorizationSimulation =
            cardService.authorize(
                SimulationsCardAuthorizeParams.builder()
                    .amount(123L)
                    .cardId("string")
                    .digitalWalletTokenId("string")
                    .build()
            )
        println(cardAuthorizationSimulation)
        cardAuthorizationSimulation.validate()
    }

    @Test
    fun callSettlement() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .build()
        val cardService = client.simulations().cards()
        val transaction =
            cardService.settlement(
                SimulationsCardSettlementParams.builder()
                    .cardId("string")
                    .pendingTransactionId("string")
                    .amount(123L)
                    .build()
            )
        println(transaction)
        transaction.validate()
    }
}
