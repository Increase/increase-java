// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async.simulations

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import com.increase.api.models.SimulationCheckDepositRejectParams
import com.increase.api.models.SimulationCheckDepositReturnParams
import com.increase.api.models.SimulationCheckDepositSubmitParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class CheckDepositServiceAsyncTest {

    @Test
    fun reject() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val checkDepositServiceAsync = client.simulations().checkDeposits()

        val checkDepositFuture =
            checkDepositServiceAsync.reject(
                SimulationCheckDepositRejectParams.builder()
                    .checkDepositId("check_deposit_f06n9gpg7sxn8t19lfc1")
                    .build()
            )

        val checkDeposit = checkDepositFuture.get()
        checkDeposit.validate()
    }

    @Test
    fun return_() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val checkDepositServiceAsync = client.simulations().checkDeposits()

        val checkDepositFuture =
            checkDepositServiceAsync.return_(
                SimulationCheckDepositReturnParams.builder()
                    .checkDepositId("check_deposit_f06n9gpg7sxn8t19lfc1")
                    .build()
            )

        val checkDeposit = checkDepositFuture.get()
        checkDeposit.validate()
    }

    @Test
    fun submit() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val checkDepositServiceAsync = client.simulations().checkDeposits()

        val checkDepositFuture =
            checkDepositServiceAsync.submit(
                SimulationCheckDepositSubmitParams.builder()
                    .checkDepositId("check_deposit_f06n9gpg7sxn8t19lfc1")
                    .build()
            )

        val checkDeposit = checkDepositFuture.get()
        checkDeposit.validate()
    }
}
