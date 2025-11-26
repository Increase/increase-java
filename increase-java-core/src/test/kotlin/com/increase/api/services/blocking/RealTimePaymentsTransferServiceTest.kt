// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.realtimepaymentstransfers.RealTimePaymentsTransferCreateParams
import com.increase.api.models.realtimepaymentstransfers.RealTimePaymentsTransferListParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class RealTimePaymentsTransferServiceTest {

    @Test
    fun create() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val realTimePaymentsTransferService = client.realTimePaymentsTransfers()

        val realTimePaymentsTransfer =
            realTimePaymentsTransferService.create(
                RealTimePaymentsTransferCreateParams.builder()
                    .amount(100L)
                    .creditorName("Ian Crease")
                    .remittanceInformation("Invoice 29582")
                    .sourceAccountNumberId("account_number_v18nkfqm6afpsrvy82b2")
                    .debtorName("x")
                    .destinationAccountNumber("987654321")
                    .destinationRoutingNumber("101050001")
                    .externalAccountId("external_account_id")
                    .requireApproval(true)
                    .ultimateCreditorName("x")
                    .ultimateDebtorName("x")
                    .build()
            )

        realTimePaymentsTransfer.validate()
    }

    @Test
    fun retrieve() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val realTimePaymentsTransferService = client.realTimePaymentsTransfers()

        val realTimePaymentsTransfer =
            realTimePaymentsTransferService.retrieve(
                "real_time_payments_transfer_iyuhl5kdn7ssmup83mvq"
            )

        realTimePaymentsTransfer.validate()
    }

    @Test
    fun list() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val realTimePaymentsTransferService = client.realTimePaymentsTransfers()

        val realTimePaymentsTransfers =
            realTimePaymentsTransferService.list(
                RealTimePaymentsTransferListParams.builder()
                    .accountId("account_id")
                    .createdAt(
                        RealTimePaymentsTransferListParams.CreatedAt.builder()
                            .after(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .before(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .onOrAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .onOrBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .cursor("cursor")
                    .externalAccountId("external_account_id")
                    .idempotencyKey("x")
                    .limit(1L)
                    .status(
                        RealTimePaymentsTransferListParams.Status.builder()
                            .addIn(RealTimePaymentsTransferListParams.Status.In.PENDING_APPROVAL)
                            .build()
                    )
                    .build()
            )

        realTimePaymentsTransfers.validate()
    }

    @Test
    fun approve() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val realTimePaymentsTransferService = client.realTimePaymentsTransfers()

        val realTimePaymentsTransfer =
            realTimePaymentsTransferService.approve(
                "real_time_payments_transfer_iyuhl5kdn7ssmup83mvq"
            )

        realTimePaymentsTransfer.validate()
    }

    @Test
    fun cancel() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val realTimePaymentsTransferService = client.realTimePaymentsTransfers()

        val realTimePaymentsTransfer =
            realTimePaymentsTransferService.cancel(
                "real_time_payments_transfer_iyuhl5kdn7ssmup83mvq"
            )

        realTimePaymentsTransfer.validate()
    }
}
