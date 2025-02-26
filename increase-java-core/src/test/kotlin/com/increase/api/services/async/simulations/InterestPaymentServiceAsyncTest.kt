// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async.simulations

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import com.increase.api.models.SimulationInterestPaymentCreateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class InterestPaymentServiceAsyncTest {

    @Test
    fun create() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val interestPaymentServiceAsync = client.simulations().interestPayments()

        val transactionFuture =
            interestPaymentServiceAsync.create(
                SimulationInterestPaymentCreateParams.builder()
                    .accountId("account_in71c4amph0vgo2qllky")
                    .amount(1000L)
                    .periodEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .periodStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )

        val transaction = transactionFuture.get()
        transaction.validate()
    }
}
