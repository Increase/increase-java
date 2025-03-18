// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async.simulations

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import com.increase.api.models.simulations.realtimepaymentstransfers.RealTimePaymentsTransferCompleteParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class RealTimePaymentsTransferServiceAsyncTest {

    @Test
    fun complete() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val realTimePaymentsTransferServiceAsync = client.simulations().realTimePaymentsTransfers()

        val realTimePaymentsTransferFuture =
            realTimePaymentsTransferServiceAsync.complete(
                RealTimePaymentsTransferCompleteParams.builder()
                    .realTimePaymentsTransferId("real_time_payments_transfer_iyuhl5kdn7ssmup83mvq")
                    .rejection(
                        RealTimePaymentsTransferCompleteParams.Rejection.builder()
                            .rejectReasonCode(
                                RealTimePaymentsTransferCompleteParams.Rejection.RejectReasonCode
                                    .ACCOUNT_CLOSED
                            )
                            .build()
                    )
                    .build()
            )

        val realTimePaymentsTransfer = realTimePaymentsTransferFuture.get()
        realTimePaymentsTransfer.validate()
    }
}
