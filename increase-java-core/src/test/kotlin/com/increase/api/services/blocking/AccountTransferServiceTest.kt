// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.*
import com.increase.api.models.AccountTransferListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class AccountTransferServiceTest {

    @Test
    fun callCreate() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val accountTransferService = client.accountTransfers()
        val accountTransfer =
            accountTransferService.create(
                AccountTransferCreateParams.builder()
                    .accountId("string")
                    .amount(123L)
                    .description("x")
                    .destinationAccountId("string")
                    .requireApproval(true)
                    .build()
            )
        println(accountTransfer)
        accountTransfer.validate()
    }

    @Test
    fun callRetrieve() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val accountTransferService = client.accountTransfers()
        val accountTransfer =
            accountTransferService.retrieve(
                AccountTransferRetrieveParams.builder().accountTransferId("string").build()
            )
        println(accountTransfer)
        accountTransfer.validate()
    }

    @Test
    fun callList() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val accountTransferService = client.accountTransfers()
        val accountTransferList =
            accountTransferService.list(AccountTransferListParams.builder().build())
        println(accountTransferList)
        accountTransferList.data().forEach { it.validate() }
    }

    @Test
    fun callApprove() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val accountTransferService = client.accountTransfers()
        val accountTransfer =
            accountTransferService.approve(
                AccountTransferApproveParams.builder().accountTransferId("string").build()
            )
        println(accountTransfer)
        accountTransfer.validate()
    }

    @Test
    fun callCancel() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val accountTransferService = client.accountTransfers()
        val accountTransfer =
            accountTransferService.cancel(
                AccountTransferCancelParams.builder().accountTransferId("string").build()
            )
        println(accountTransfer)
        accountTransfer.validate()
    }
}
