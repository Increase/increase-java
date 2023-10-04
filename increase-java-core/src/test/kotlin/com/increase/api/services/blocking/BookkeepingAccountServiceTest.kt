// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.*
import com.increase.api.models.BookkeepingAccountListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class BookkeepingAccountServiceTest {

    @Test
    fun callCreate() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .build()
        val bookkeepingAccountService = client.bookkeepingAccounts()
        val bookkeepingAccount =
            bookkeepingAccountService.create(
                BookkeepingAccountCreateParams.builder()
                    .name("x")
                    .accountId("string")
                    .complianceCategory(
                        BookkeepingAccountCreateParams.ComplianceCategory.COMMINGLED_CASH
                    )
                    .entityId("string")
                    .build()
            )
        println(bookkeepingAccount)
        bookkeepingAccount.validate()
    }

    @Test
    fun callList() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .build()
        val bookkeepingAccountService = client.bookkeepingAccounts()
        val bookkeepingAccountList =
            bookkeepingAccountService.list(BookkeepingAccountListParams.builder().build())
        println(bookkeepingAccountList)
        bookkeepingAccountList.data().forEach { it.validate() }
    }
}
