// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async.simulations

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import com.increase.api.models.simulations.fednowtransfers.FednowTransferCompleteParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class FednowTransferServiceAsyncTest {

    @Test
    fun complete() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val fednowTransferServiceAsync = client.simulations().fednowTransfers()

        val fednowTransferFuture =
            fednowTransferServiceAsync.complete(
                FednowTransferCompleteParams.builder()
                    .fednowTransferId("fednow_transfer_4i0mptrdu1mueg1196bg")
                    .rejection(
                        FednowTransferCompleteParams.Rejection.builder()
                            .rejectReasonCode(
                                FednowTransferCompleteParams.Rejection.RejectReasonCode
                                    .ACCOUNT_CLOSED
                            )
                            .build()
                    )
                    .build()
            )

        val fednowTransfer = fednowTransferFuture.get()
        fednowTransfer.validate()
    }
}
