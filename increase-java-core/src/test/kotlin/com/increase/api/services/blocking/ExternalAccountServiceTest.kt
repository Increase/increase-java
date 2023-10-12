// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.*
import com.increase.api.models.ExternalAccountListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class ExternalAccountServiceTest {

    @Test
    fun callCreate() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val externalAccountService = client.externalAccounts()
        val externalAccount =
            externalAccountService.create(
                ExternalAccountCreateParams.builder()
                    .accountNumber("x")
                    .description("x")
                    .routingNumber("xxxxxxxxx")
                    .funding(ExternalAccountCreateParams.Funding.CHECKING)
                    .build()
            )
        println(externalAccount)
        externalAccount.validate()
    }

    @Test
    fun callRetrieve() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val externalAccountService = client.externalAccounts()
        val externalAccount =
            externalAccountService.retrieve(
                ExternalAccountRetrieveParams.builder().externalAccountId("string").build()
            )
        println(externalAccount)
        externalAccount.validate()
    }

    @Test
    fun callUpdate() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val externalAccountService = client.externalAccounts()
        val externalAccount =
            externalAccountService.update(
                ExternalAccountUpdateParams.builder()
                    .externalAccountId("string")
                    .description("x")
                    .status(ExternalAccountUpdateParams.Status.ACTIVE)
                    .build()
            )
        println(externalAccount)
        externalAccount.validate()
    }

    @Test
    fun callList() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val externalAccountService = client.externalAccounts()
        val externalAccountList =
            externalAccountService.list(ExternalAccountListParams.builder().build())
        println(externalAccountList)
        externalAccountList.data().forEach { it.validate() }
    }
}
