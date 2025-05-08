// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking.simulations

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.simulations.achtransfers.AchTransferCreateNotificationOfChangeParams
import com.increase.api.models.simulations.achtransfers.AchTransferReturnParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AchTransferServiceTest {

    @Test
    fun acknowledge() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val achTransferService = client.simulations().achTransfers()

        val achTransfer = achTransferService.acknowledge("ach_transfer_uoxatyh3lt5evrsdvo7q")

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
                AchTransferCreateNotificationOfChangeParams.builder()
                    .achTransferId("ach_transfer_uoxatyh3lt5evrsdvo7q")
                    .changeCode(
                        AchTransferCreateNotificationOfChangeParams.ChangeCode
                            .INCORRECT_ROUTING_NUMBER
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
                AchTransferReturnParams.builder()
                    .achTransferId("ach_transfer_uoxatyh3lt5evrsdvo7q")
                    .reason(AchTransferReturnParams.Reason.INSUFFICIENT_FUND)
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

        val achTransfer = achTransferService.settle("ach_transfer_uoxatyh3lt5evrsdvo7q")

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

        val achTransfer = achTransferService.submit("ach_transfer_uoxatyh3lt5evrsdvo7q")

        achTransfer.validate()
    }
}
