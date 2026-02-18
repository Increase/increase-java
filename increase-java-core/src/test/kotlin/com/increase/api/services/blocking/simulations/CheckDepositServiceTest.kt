// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking.simulations

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.simulations.checkdeposits.CheckDepositSubmitParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CheckDepositServiceTest {

    @Test
    fun reject() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val checkDepositService = client.simulations().checkDeposits()

        val checkDeposit = checkDepositService.reject("check_deposit_f06n9gpg7sxn8t19lfc1")

        checkDeposit.validate()
    }

    @Test
    fun return_() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val checkDepositService = client.simulations().checkDeposits()

        val checkDeposit = checkDepositService.return_("check_deposit_f06n9gpg7sxn8t19lfc1")

        checkDeposit.validate()
    }

    @Test
    fun submit() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val checkDepositService = client.simulations().checkDeposits()

        val checkDeposit =
            checkDepositService.submit(
                CheckDepositSubmitParams.builder()
                    .checkDepositId("check_deposit_f06n9gpg7sxn8t19lfc1")
                    .scan(
                        CheckDepositSubmitParams.Scan.builder()
                            .accountNumber("x")
                            .routingNumber("x")
                            .auxiliaryOnUs("x")
                            .build()
                    )
                    .build()
            )

        checkDeposit.validate()
    }
}
