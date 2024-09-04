// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.*
import com.increase.api.models.RealTimePaymentsTransferListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class RealTimePaymentsTransferServiceTest {

    @Test
    fun callCreate() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val realTimePaymentsTransferService = client.realTimePaymentsTransfers()
        val realTimePaymentsTransfer =
            realTimePaymentsTransferService.create(
                RealTimePaymentsTransferCreateParams.builder()
                    .amount(123L)
                    .creditorName("x")
                    .remittanceInformation("x")
                    .sourceAccountNumberId("source_account_number_id")
                    .debtorName("x")
                    .destinationAccountNumber("x")
                    .destinationRoutingNumber("xxxxxxxxx")
                    .externalAccountId("external_account_id")
                    .requireApproval(true)
                    .ultimateCreditorName("x")
                    .ultimateDebtorName("x")
                    .build()
            )
        println(realTimePaymentsTransfer)
        realTimePaymentsTransfer.validate()
    }

    @Test
    fun callRetrieve() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val realTimePaymentsTransferService = client.realTimePaymentsTransfers()
        val realTimePaymentsTransfer =
            realTimePaymentsTransferService.retrieve(
                RealTimePaymentsTransferRetrieveParams.builder()
                    .realTimePaymentsTransferId("real_time_payments_transfer_id")
                    .build()
            )
        println(realTimePaymentsTransfer)
        realTimePaymentsTransfer.validate()
    }

    @Test
    fun callList() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val realTimePaymentsTransferService = client.realTimePaymentsTransfers()
        val realTimePaymentsTransferList =
            realTimePaymentsTransferService.list(
                RealTimePaymentsTransferListParams.builder().build()
            )
        println(realTimePaymentsTransferList)
        realTimePaymentsTransferList.data().forEach { it.validate() }
    }
}
