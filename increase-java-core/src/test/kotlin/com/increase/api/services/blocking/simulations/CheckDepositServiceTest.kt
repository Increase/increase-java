// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking.simulations

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.SimulationCheckDepositRejectParams
import com.increase.api.models.SimulationCheckDepositReturnParams
import com.increase.api.models.SimulationCheckDepositSubmitParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class CheckDepositServiceTest {

    @Test
    fun callReject() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val checkDepositService = client.simulations().checkDeposits()
        val checkDeposit =
            checkDepositService.reject(
                SimulationCheckDepositRejectParams.builder()
                    .checkDepositId("check_deposit_id")
                    .build()
            )
        println(checkDeposit)
        checkDeposit.validate()
    }

    @Test
    fun callReturn() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val checkDepositService = client.simulations().checkDeposits()
        val checkDeposit =
            checkDepositService.return_(
                SimulationCheckDepositReturnParams.builder()
                    .checkDepositId("check_deposit_id")
                    .build()
            )
        println(checkDeposit)
        checkDeposit.validate()
    }

    @Test
    fun callSubmit() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val checkDepositService = client.simulations().checkDeposits()
        val checkDeposit =
            checkDepositService.submit(
                SimulationCheckDepositSubmitParams.builder()
                    .checkDepositId("check_deposit_id")
                    .build()
            )
        println(checkDeposit)
        checkDeposit.validate()
    }
}
