package com.increase.api.services.blocking.simulations

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.*
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class CheckDepositServiceTest {

    @Disabled("Prism incorrectly returns an invalid JSON error")
    @Test
    fun callReject() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .build()
        val checkDepositService = client.simulations().checkDeposits()
        val checkDeposit =
            checkDepositService.reject(
                SimulationsCheckDepositRejectParams.builder().checkDepositId("string").build()
            )
        println(checkDeposit)
        checkDeposit.validate()
    }

    @Test
    fun callReturn() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .build()
        val checkDepositService = client.simulations().checkDeposits()
        val checkDeposit =
            checkDepositService.return_(
                SimulationsCheckDepositReturnParams.builder().checkDepositId("string").build()
            )
        println(checkDeposit)
        checkDeposit.validate()
    }

    @Disabled("Prism incorrectly returns an invalid JSON error")
    @Test
    fun callSubmit() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .build()
        val checkDepositService = client.simulations().checkDeposits()
        val checkDeposit =
            checkDepositService.submit(
                SimulationsCheckDepositSubmitParams.builder().checkDepositId("string").build()
            )
        println(checkDeposit)
        checkDeposit.validate()
    }
}
