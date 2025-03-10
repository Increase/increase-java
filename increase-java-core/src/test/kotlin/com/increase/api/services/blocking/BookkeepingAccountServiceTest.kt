// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.bookkeepingaccounts.BookkeepingAccountBalanceParams
import com.increase.api.models.bookkeepingaccounts.BookkeepingAccountCreateParams
import com.increase.api.models.bookkeepingaccounts.BookkeepingAccountUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class BookkeepingAccountServiceTest {

    @Test
    fun create() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val bookkeepingAccountService = client.bookkeepingAccounts()

        val bookkeepingAccount =
            bookkeepingAccountService.create(
                BookkeepingAccountCreateParams.builder()
                    .name("New Account!")
                    .accountId("account_id")
                    .complianceCategory(
                        BookkeepingAccountCreateParams.ComplianceCategory.COMMINGLED_CASH
                    )
                    .entityId("entity_id")
                    .build()
            )

        bookkeepingAccount.validate()
    }

    @Test
    fun update() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val bookkeepingAccountService = client.bookkeepingAccounts()

        val bookkeepingAccount =
            bookkeepingAccountService.update(
                BookkeepingAccountUpdateParams.builder()
                    .bookkeepingAccountId("bookkeeping_account_e37p1f1iuocw5intf35v")
                    .name("Deprecated Account")
                    .build()
            )

        bookkeepingAccount.validate()
    }

    @Test
    fun list() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val bookkeepingAccountService = client.bookkeepingAccounts()

        val page = bookkeepingAccountService.list()

        page.response().validate()
    }

    @Test
    fun balance() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val bookkeepingAccountService = client.bookkeepingAccounts()

        val bookkeepingBalanceLookup =
            bookkeepingAccountService.balance(
                BookkeepingAccountBalanceParams.builder()
                    .bookkeepingAccountId("bookkeeping_account_e37p1f1iuocw5intf35v")
                    .atTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )

        bookkeepingBalanceLookup.validate()
    }
}
