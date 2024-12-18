// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.AccountNumberCreateParams
import com.increase.api.models.AccountNumberListParams
import com.increase.api.models.AccountNumberRetrieveParams
import com.increase.api.models.AccountNumberUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class AccountNumberServiceTest {

    @Test
    fun callCreate() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val accountNumberService = client.accountNumbers()
        val accountNumber =
            accountNumberService.create(
                AccountNumberCreateParams.builder()
                    .accountId("account_id")
                    .name("x")
                    .inboundAch(
                        AccountNumberCreateParams.InboundAch.builder()
                            .debitStatus(AccountNumberCreateParams.InboundAch.DebitStatus.ALLOWED)
                            .build()
                    )
                    .inboundChecks(
                        AccountNumberCreateParams.InboundChecks.builder()
                            .status(AccountNumberCreateParams.InboundChecks.Status.ALLOWED)
                            .build()
                    )
                    .build()
            )
        println(accountNumber)
        accountNumber.validate()
    }

    @Test
    fun callRetrieve() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val accountNumberService = client.accountNumbers()
        val accountNumber =
            accountNumberService.retrieve(
                AccountNumberRetrieveParams.builder().accountNumberId("account_number_id").build()
            )
        println(accountNumber)
        accountNumber.validate()
    }

    @Test
    fun callUpdate() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val accountNumberService = client.accountNumbers()
        val accountNumber =
            accountNumberService.update(
                AccountNumberUpdateParams.builder()
                    .accountNumberId("account_number_id")
                    .inboundAch(
                        AccountNumberUpdateParams.InboundAch.builder()
                            .debitStatus(AccountNumberUpdateParams.InboundAch.DebitStatus.ALLOWED)
                            .build()
                    )
                    .inboundChecks(
                        AccountNumberUpdateParams.InboundChecks.builder()
                            .status(AccountNumberUpdateParams.InboundChecks.Status.ALLOWED)
                            .build()
                    )
                    .name("x")
                    .status(AccountNumberUpdateParams.Status.ACTIVE)
                    .build()
            )
        println(accountNumber)
        accountNumber.validate()
    }

    @Test
    fun callList() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val accountNumberService = client.accountNumbers()
        val accountNumberList = accountNumberService.list(AccountNumberListParams.builder().build())
        println(accountNumberList)
        accountNumberList.data().forEach { it.validate() }
    }
}
