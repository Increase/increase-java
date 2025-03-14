// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking.simulations

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.SimulationAchTransferAcknowledgeParams
import com.increase.api.models.SimulationAchTransferCreateNotificationOfChangeParams
import com.increase.api.models.SimulationAchTransferReturnParams
import com.increase.api.models.SimulationAchTransferSettleParams
import com.increase.api.models.SimulationAchTransferSubmitParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class AchTransferServiceTest {

    @Test
    fun acknowledge() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val achTransferService = client.simulations().achTransfers()

        val achTransfer =
            achTransferService.acknowledge(
                SimulationAchTransferAcknowledgeParams.builder()
                    .achTransferId("ach_transfer_uoxatyh3lt5evrsdvo7q")
                    .build()
            )

        achTransfer.validate()
    }

    @Test
    fun createNotificationOfChange() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val achTransferService = client.simulations().achTransfers()

        val achTransfer =
            achTransferService.createNotificationOfChange(
                SimulationAchTransferCreateNotificationOfChangeParams.builder()
                    .achTransferId("ach_transfer_uoxatyh3lt5evrsdvo7q")
                    .changeCode(
                        SimulationAchTransferCreateNotificationOfChangeParams.ChangeCode
                            .INCORRECT_ACCOUNT_NUMBER
                    )
                    .correctedData("123456789")
                    .build()
            )

        achTransfer.validate()
    }

    @Test
    fun return_() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val achTransferService = client.simulations().achTransfers()

        val achTransfer =
            achTransferService.return_(
                SimulationAchTransferReturnParams.builder()
                    .achTransferId("ach_transfer_uoxatyh3lt5evrsdvo7q")
                    .reason(SimulationAchTransferReturnParams.Reason.INSUFFICIENT_FUND)
                    .build()
            )

        achTransfer.validate()
    }

    @Test
    fun settle() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val achTransferService = client.simulations().achTransfers()

        val achTransfer =
            achTransferService.settle(
                SimulationAchTransferSettleParams.builder()
                    .achTransferId("ach_transfer_uoxatyh3lt5evrsdvo7q")
                    .build()
            )

        achTransfer.validate()
    }

    @Test
    fun submit() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val achTransferService = client.simulations().achTransfers()

        val achTransfer =
            achTransferService.submit(
                SimulationAchTransferSubmitParams.builder()
                    .achTransferId("ach_transfer_uoxatyh3lt5evrsdvo7q")
                    .build()
            )

        achTransfer.validate()
    }
}
