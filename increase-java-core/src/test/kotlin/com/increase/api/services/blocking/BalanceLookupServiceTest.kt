package com.increase.api.services.blocking

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class BalanceLookupServiceTest {

    @Test
    fun callLookup() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .build()
        val balanceLookupService = client.balanceLookups()
        val balanceLookupLookupResponse =
            balanceLookupService.lookup(
                BalanceLookupLookupParams.builder().accountId("string").build()
            )
        println(balanceLookupLookupResponse)
        balanceLookupLookupResponse.validate()
    }
}
