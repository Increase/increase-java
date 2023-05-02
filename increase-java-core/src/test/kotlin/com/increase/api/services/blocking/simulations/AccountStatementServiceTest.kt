package com.increase.api.services.blocking.simulations

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class AccountStatementServiceTest {

    @Test
    fun callCreate() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .build()
        val accountStatementService = client.simulations().accountStatements()
        val accountStatement =
            accountStatementService.create(
                SimulationAccountStatementCreateParams.builder().accountId("string").build()
            )
        println(accountStatement)
        accountStatement.validate()
    }
}
