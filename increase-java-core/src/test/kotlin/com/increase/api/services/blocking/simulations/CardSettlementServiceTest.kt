// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking.simulations

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.SimulationCardSettlementCreateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class CardSettlementServiceTest {

    @Test
    fun callCreate() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val cardSettlementService = client.simulations().cardSettlements()
        val transaction =
            cardSettlementService.create(
                SimulationCardSettlementCreateParams.builder()
                    .cardId("card_oubs0hwk5rn6knuecxg2")
                    .pendingTransactionId("pending_transaction_k1sfetcau2qbvjbzgju4")
                    .amount(1L)
                    .build()
            )
        println(transaction)
        transaction.validate()
    }
}
