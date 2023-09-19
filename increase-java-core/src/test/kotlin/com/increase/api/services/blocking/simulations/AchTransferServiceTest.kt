package com.increase.api.services.blocking.simulations

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.*
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class AchTransferServiceTest {

    @Test
    fun callCreateInbound() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .build()
        val achTransferService = client.simulations().achTransfers()
        val achTransferSimulation =
            achTransferService.createInbound(
                SimulationAchTransferCreateInboundParams.builder()
                    .accountNumberId("string")
                    .amount(123L)
                    .companyDescriptiveDate("x")
                    .companyDiscretionaryData("x")
                    .companyEntryDescription("x")
                    .companyId("x")
                    .companyName("x")
                    .resolveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        println(achTransferSimulation)
        achTransferSimulation.validate()
    }

    @Disabled("Prism incorrectly returns an invalid JSON error")
    @Test
    fun callReturn() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .build()
        val achTransferService = client.simulations().achTransfers()
        val achTransfer =
            achTransferService.return_(
                SimulationAchTransferReturnParams.builder()
                    .achTransferId("string")
                    .reason(SimulationAchTransferReturnParams.Reason.INSUFFICIENT_FUND)
                    .build()
            )
        println(achTransfer)
        achTransfer.validate()
    }

    @Disabled("Prism incorrectly returns an invalid JSON error")
    @Test
    fun callSubmit() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .build()
        val achTransferService = client.simulations().achTransfers()
        val achTransfer =
            achTransferService.submit(
                SimulationAchTransferSubmitParams.builder().achTransferId("string").build()
            )
        println(achTransfer)
        achTransfer.validate()
    }
}
