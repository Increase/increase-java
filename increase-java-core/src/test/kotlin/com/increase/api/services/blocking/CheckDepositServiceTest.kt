// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.*
import com.increase.api.models.CheckDepositListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class CheckDepositServiceTest {

    @Test
    fun callCreate() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .build()
        val checkDepositService = client.checkDeposits()
        val checkDeposit =
            checkDepositService.create(
                CheckDepositCreateParams.builder()
                    .accountId("string")
                    .amount(123L)
                    .backImageFileId("string")
                    .currency("x")
                    .frontImageFileId("string")
                    .build()
            )
        println(checkDeposit)
        checkDeposit.validate()
    }

    @Test
    fun callRetrieve() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .build()
        val checkDepositService = client.checkDeposits()
        val checkDeposit =
            checkDepositService.retrieve(
                CheckDepositRetrieveParams.builder().checkDepositId("string").build()
            )
        println(checkDeposit)
        checkDeposit.validate()
    }

    @Test
    fun callList() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .build()
        val checkDepositService = client.checkDeposits()
        val checkDepositList = checkDepositService.list(CheckDepositListParams.builder().build())
        println(checkDepositList)
        checkDepositList.data().forEach { it.validate() }
    }
}
