// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking.simulations

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.simulations.realtimepaymentstransfers.RealTimePaymentsTransferCompleteParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class RealTimePaymentsTransferServiceTest {

    @Test
    fun complete() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val realTimePaymentsTransferService = client.simulations().realTimePaymentsTransfers()

      val realTimePaymentsTransfer = realTimePaymentsTransferService.complete(RealTimePaymentsTransferCompleteParams.builder()
          .realTimePaymentsTransferId("real_time_payments_transfer_iyuhl5kdn7ssmup83mvq")
          .rejection(RealTimePaymentsTransferCompleteParams.Rejection.builder()
              .rejectReasonCode(RealTimePaymentsTransferCompleteParams.Rejection.RejectReasonCode.ACCOUNT_CLOSED)
              .build())
          .build())

      realTimePaymentsTransfer.validate()
    }
}
