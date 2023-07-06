package com.increase.api.services.blocking.simulations

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.*
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class CheckTransferServiceTest {

    @Test
    fun callDeposit() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .build()
        val checkTransferService = client.simulations().checkTransfers()
        val checkTransfer =
            checkTransferService.deposit(
                SimulationCheckTransferDepositParams.builder().checkTransferId("string").build()
            )
        println(checkTransfer)
        checkTransfer.validate()
    }

    @Disabled("Prism incorrectly returns an invalid JSON error")
    @Test
    fun callMail() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .build()
        val checkTransferService = client.simulations().checkTransfers()
        val checkTransfer =
            checkTransferService.mail(
                SimulationCheckTransferMailParams.builder().checkTransferId("string").build()
            )
        println(checkTransfer)
        checkTransfer.validate()
    }
}
