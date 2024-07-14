// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.*
import com.increase.api.models.AccountStatementListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class AccountStatementServiceTest {

    @Test
    fun callRetrieve() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val accountStatementService = client.accountStatements()
        val accountStatement =
            accountStatementService.retrieve(
                AccountStatementRetrieveParams.builder()
                    .accountStatementId("account_statement_id")
                    .build()
            )
        println(accountStatement)
        accountStatement.validate()
    }

    @Test
    fun callList() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val accountStatementService = client.accountStatements()
        val accountStatementList =
            accountStatementService.list(AccountStatementListParams.builder().build())
        println(accountStatementList)
        accountStatementList.data().forEach { it.validate() }
    }
}
