// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async.simulations

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import com.increase.api.models.simulations.cardsettlements.CardSettlementCreateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class CardSettlementServiceAsyncTest {

    @Test
    fun create() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val cardSettlementServiceAsync = client.simulations().cardSettlements()

        val transactionFuture =
            cardSettlementServiceAsync.create(
                CardSettlementCreateParams.builder()
                    .cardId("card_oubs0hwk5rn6knuecxg2")
                    .pendingTransactionId("pending_transaction_k1sfetcau2qbvjbzgju4")
                    .amount(1L)
                    .build()
            )

        val transaction = transactionFuture.get()
        transaction.validate()
    }
}
