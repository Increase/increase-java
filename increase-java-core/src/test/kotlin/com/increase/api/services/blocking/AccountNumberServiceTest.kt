// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.accountnumbers.AccountNumberCreateParams
import com.increase.api.models.accountnumbers.AccountNumberRetrieveParams
import com.increase.api.models.accountnumbers.AccountNumberUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AccountNumberServiceTest {

    @Test
    fun create() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val accountNumberService = client.accountNumbers()

        val accountNumber =
            accountNumberService.create(
                AccountNumberCreateParams.builder()
                    .accountId("account_in71c4amph0vgo2qllky")
                    .name("Rent payments")
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

        accountNumber.validate()
    }

    @Test
    fun retrieve() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val accountNumberService = client.accountNumbers()

        val accountNumber =
            accountNumberService.retrieve(
                AccountNumberRetrieveParams.builder()
                    .accountNumberId("account_number_v18nkfqm6afpsrvy82b2")
                    .build()
            )

        accountNumber.validate()
    }

    @Test
    fun update() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val accountNumberService = client.accountNumbers()

        val accountNumber =
            accountNumberService.update(
                AccountNumberUpdateParams.builder()
                    .accountNumberId("account_number_v18nkfqm6afpsrvy82b2")
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

        accountNumber.validate()
    }

    @Test
    fun list() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val accountNumberService = client.accountNumbers()

        val page = accountNumberService.list()

        page.response().validate()
    }
}
