package com.increase.api.services.blocking

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.*
import com.increase.api.models.AccountListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class AccountServiceTest {

    @Test
    fun callCreate() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .build()
        val accountService = client.accounts()
        val account =
            accountService.create(
                AccountCreateParams.builder()
                    .entityId("string")
                    .informationalEntityId("string")
                    .name("x")
                    .build()
            )
        println(account)
        account.validate()
    }

    @Test
    fun callRetrieve() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .build()
        val accountService = client.accounts()
        val account =
            accountService.retrieve(AccountRetrieveParams.builder().accountId("string").build())
        println(account)
        account.validate()
    }

    @Test
    fun callUpdate() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .build()
        val accountService = client.accounts()
        val account =
            accountService.update(
                AccountUpdateParams.builder().accountId("string").name("x").build()
            )
        println(account)
        account.validate()
    }

    @Test
    fun callList() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .build()
        val accountService = client.accounts()
        val accountList = accountService.list(AccountListParams.builder().build())
        println(accountList)
        accountList.data().forEach { it.validate() }
    }

    @Disabled("Prism tests are broken")
    @Test
    fun callClose() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .build()
        val accountService = client.accounts()
        val account = accountService.close(AccountCloseParams.builder().accountId("string").build())
        println(account)
        account.validate()
    }
}
