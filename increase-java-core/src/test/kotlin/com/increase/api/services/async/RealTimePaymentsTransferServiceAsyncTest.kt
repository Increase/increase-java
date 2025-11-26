// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import com.increase.api.models.realtimepaymentstransfers.RealTimePaymentsTransferCreateParams
import com.increase.api.models.realtimepaymentstransfers.RealTimePaymentsTransferListParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class RealTimePaymentsTransferServiceAsyncTest {

    @Test
    fun create() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val realTimePaymentsTransferServiceAsync = client.realTimePaymentsTransfers()

        val realTimePaymentsTransferFuture =
            realTimePaymentsTransferServiceAsync.create(
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

        val realTimePaymentsTransfer = realTimePaymentsTransferFuture.get()
        realTimePaymentsTransfer.validate()
    }

    @Test
    fun retrieve() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val realTimePaymentsTransferServiceAsync = client.realTimePaymentsTransfers()

        val realTimePaymentsTransferFuture =
            realTimePaymentsTransferServiceAsync.retrieve(
                "real_time_payments_transfer_iyuhl5kdn7ssmup83mvq"
            )

        val realTimePaymentsTransfer = realTimePaymentsTransferFuture.get()
        realTimePaymentsTransfer.validate()
    }

    @Test
    fun list() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val realTimePaymentsTransferServiceAsync = client.realTimePaymentsTransfers()

        val realTimePaymentsTransfersFuture =
            realTimePaymentsTransferServiceAsync.list(
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

        val realTimePaymentsTransfers = realTimePaymentsTransfersFuture.get()
        realTimePaymentsTransfers.validate()
    }

    @Test
    fun approve() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val realTimePaymentsTransferServiceAsync = client.realTimePaymentsTransfers()

        val realTimePaymentsTransferFuture =
            realTimePaymentsTransferServiceAsync.approve(
                "real_time_payments_transfer_iyuhl5kdn7ssmup83mvq"
            )

        val realTimePaymentsTransfer = realTimePaymentsTransferFuture.get()
        realTimePaymentsTransfer.validate()
    }

    @Test
    fun cancel() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val realTimePaymentsTransferServiceAsync = client.realTimePaymentsTransfers()

        val realTimePaymentsTransferFuture =
            realTimePaymentsTransferServiceAsync.cancel(
                "real_time_payments_transfer_iyuhl5kdn7ssmup83mvq"
            )

        val realTimePaymentsTransfer = realTimePaymentsTransferFuture.get()
        realTimePaymentsTransfer.validate()
    }
}
