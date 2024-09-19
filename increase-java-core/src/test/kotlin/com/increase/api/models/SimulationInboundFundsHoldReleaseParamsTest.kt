// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.UUID
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat
import org.apache.hc.core5.http.ContentType
import com.increase.api.core.ContentTypes
import com.increase.api.core.JsonNull
import com.increase.api.core.JsonString
import com.increase.api.core.JsonValue
import com.increase.api.core.MultipartFormValue
import com.increase.api.models.*
import com.increase.api.models.SimulationInboundFundsHoldReleaseParams

class SimulationInboundFundsHoldReleaseParamsTest {

    @Test
    fun createSimulationInboundFundsHoldReleaseParams() {
      SimulationInboundFundsHoldReleaseParams.builder()
          .inboundFundsHoldId("inbound_funds_hold_id")
          .build()
    }

    @Test
    fun getPathParam() {
      val params = SimulationInboundFundsHoldReleaseParams.builder()
          .inboundFundsHoldId("inbound_funds_hold_id")
          .build()
      assertThat(params).isNotNull
      // path param "inboundFundsHoldId"
      assertThat(params.getPathParam(0)).isEqualTo("inbound_funds_hold_id")
      // out-of-bound path param
      assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
