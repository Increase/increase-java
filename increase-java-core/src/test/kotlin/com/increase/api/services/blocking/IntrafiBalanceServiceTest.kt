// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.IntrafiBalanceRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class IntrafiBalanceServiceTest {

    @Test
    fun callRetrieve() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val intrafiBalanceService = client.intrafiBalances()
        val intrafiBalance =
            intrafiBalanceService.retrieve(
                IntrafiBalanceRetrieveParams.builder().accountId("account_id").build()
            )
        println(intrafiBalance)
        intrafiBalance.validate()
    }
}
