// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.CheckDepositCreateParams
import com.increase.api.models.CheckDepositListParams
import com.increase.api.models.CheckDepositRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class CheckDepositServiceTest {

    @Test
    fun callCreate() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val checkDepositService = client.checkDeposits()
        val checkDeposit =
            checkDepositService.create(
                CheckDepositCreateParams.builder()
                    .accountId("account_in71c4amph0vgo2qllky")
                    .amount(1000L)
                    .backImageFileId("file_26khfk98mzfz90a11oqx")
                    .frontImageFileId("file_hkv175ovmc2tb2v2zbrm")
                    .description("Vendor payment")
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
                .apiKey("My API Key")
                .build()
        val checkDepositService = client.checkDeposits()
        val checkDeposit =
            checkDepositService.retrieve(
                CheckDepositRetrieveParams.builder()
                    .checkDepositId("check_deposit_instruction_q2shv7x9qhevfm71kor8")
                    .build()
            )
        println(checkDeposit)
        checkDeposit.validate()
    }

    @Test
    fun callList() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val checkDepositService = client.checkDeposits()
        val checkDepositList = checkDepositService.list(CheckDepositListParams.builder().build())
        println(checkDepositList)
        checkDepositList.data().forEach { it.validate() }
    }
}
