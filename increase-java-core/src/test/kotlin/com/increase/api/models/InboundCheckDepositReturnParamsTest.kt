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
import com.increase.api.models.InboundCheckDepositReturnParams
import com.increase.api.models.InboundCheckDepositReturnParams.InboundCheckDepositReturnBody

class InboundCheckDepositReturnParamsTest {

    @Test
    fun createInboundCheckDepositReturnParams() {
      InboundCheckDepositReturnParams.builder()
          .inboundCheckDepositId("inbound_check_deposit_id")
          .reason(InboundCheckDepositReturnParams.Reason.ALTERED_OR_FICTITIOUS)
          .build()
    }

    @Test
    fun getBody() {
      val params = InboundCheckDepositReturnParams.builder()
          .inboundCheckDepositId("inbound_check_deposit_id")
          .reason(InboundCheckDepositReturnParams.Reason.ALTERED_OR_FICTITIOUS)
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
      assertThat(body.reason()).isEqualTo(InboundCheckDepositReturnParams.Reason.ALTERED_OR_FICTITIOUS)
    }

    @Test
    fun getBodyWithoutOptionalFields() {
      val params = InboundCheckDepositReturnParams.builder()
          .inboundCheckDepositId("inbound_check_deposit_id")
          .reason(InboundCheckDepositReturnParams.Reason.ALTERED_OR_FICTITIOUS)
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
      assertThat(body.reason()).isEqualTo(InboundCheckDepositReturnParams.Reason.ALTERED_OR_FICTITIOUS)
    }

    @Test
    fun getPathParam() {
      val params = InboundCheckDepositReturnParams.builder()
          .inboundCheckDepositId("inbound_check_deposit_id")
          .reason(InboundCheckDepositReturnParams.Reason.ALTERED_OR_FICTITIOUS)
          .build()
      assertThat(params).isNotNull
      // path param "inboundCheckDepositId"
      assertThat(params.getPathParam(0)).isEqualTo("inbound_check_deposit_id")
      // out-of-bound path param
      assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
