// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.inboundachtransfers

import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class InboundAchTransferDeclineParamsTest {

    @Test
    fun create() {
      InboundAchTransferDeclineParams.builder()
          .inboundAchTransferId("inbound_ach_transfer_tdrwqr3fq9gnnq49odev")
          .reason(InboundAchTransferDeclineParams.Reason.INSUFFICIENT_FUNDS)
          .build()
    }

    @Test
    fun body() {
      val params = InboundAchTransferDeclineParams.builder()
          .inboundAchTransferId("inbound_ach_transfer_tdrwqr3fq9gnnq49odev")
          .reason(InboundAchTransferDeclineParams.Reason.INSUFFICIENT_FUNDS)
          .build()

      val body = params._body()

      assertNotNull(body)
      assertThat(body.reason()).contains(InboundAchTransferDeclineParams.Reason.INSUFFICIENT_FUNDS)
    }

    @Test
    fun bodyWithoutOptionalFields() {
      val params = InboundAchTransferDeclineParams.builder()
          .inboundAchTransferId("inbound_ach_transfer_tdrwqr3fq9gnnq49odev")
          .build()

      val body = params._body()

      assertNotNull(body)
    }

    @Test
    fun getPathParam() {
      val params = InboundAchTransferDeclineParams.builder()
          .inboundAchTransferId("inbound_ach_transfer_tdrwqr3fq9gnnq49odev")
          .build()
      assertThat(params).isNotNull
      // path param "inboundAchTransferId"
      assertThat(params.getPathParam(0)).isEqualTo("inbound_ach_transfer_tdrwqr3fq9gnnq49odev")
      // out-of-bound path param
      assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
