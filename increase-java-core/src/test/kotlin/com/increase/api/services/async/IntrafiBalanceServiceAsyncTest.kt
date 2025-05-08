// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class IntrafiBalanceServiceAsyncTest {

    @Test
    fun intrafiBalance() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val intrafiBalanceServiceAsync = client.intrafiBalances()

        val intrafiBalanceFuture =
            intrafiBalanceServiceAsync.intrafiBalance("account_in71c4amph0vgo2qllky")

        val intrafiBalance = intrafiBalanceFuture.get()
        intrafiBalance.validate()
    }
}
