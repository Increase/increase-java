// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.checkdeposits.CheckDepositCreateParams
import com.increase.api.models.checkdeposits.CheckDepositRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class CheckDepositServiceTest {

    @Test
    fun create() {
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

        checkDeposit.validate()
    }

    @Test
    fun retrieve() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val checkDepositService = client.checkDeposits()

        val checkDeposit =
            checkDepositService.retrieve(
                CheckDepositRetrieveParams.builder()
                    .checkDepositId("check_deposit_f06n9gpg7sxn8t19lfc1")
                    .build()
            )

        checkDeposit.validate()
    }

    @Test
    fun list() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val checkDepositService = client.checkDeposits()

        val page = checkDepositService.list()

        page.response().validate()
    }
}
