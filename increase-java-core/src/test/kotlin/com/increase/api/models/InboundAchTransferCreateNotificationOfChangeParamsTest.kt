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
import com.increase.api.models.InboundAchTransferCreateNotificationOfChangeParams
import com.increase.api.models.InboundAchTransferCreateNotificationOfChangeParams.InboundAchTransferCreateNotificationOfChangeBody

class InboundAchTransferCreateNotificationOfChangeParamsTest {

    @Test
    fun createInboundAchTransferCreateNotificationOfChangeParams() {
      InboundAchTransferCreateNotificationOfChangeParams.builder()
          .inboundAchTransferId("inbound_ach_transfer_id")
          .updatedAccountNumber("x")
          .updatedRoutingNumber("x")
          .build()
    }

    @Test
    fun getBody() {
      val params = InboundAchTransferCreateNotificationOfChangeParams.builder()
          .inboundAchTransferId("inbound_ach_transfer_id")
          .updatedAccountNumber("x")
          .updatedRoutingNumber("x")
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
      assertThat(body.updatedAccountNumber()).isEqualTo("x")
      assertThat(body.updatedRoutingNumber()).isEqualTo("x")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
      val params = InboundAchTransferCreateNotificationOfChangeParams.builder()
          .inboundAchTransferId("inbound_ach_transfer_id")
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
    }

    @Test
    fun getPathParam() {
      val params = InboundAchTransferCreateNotificationOfChangeParams.builder()
          .inboundAchTransferId("inbound_ach_transfer_id")
          .build()
      assertThat(params).isNotNull
      // path param "inboundAchTransferId"
      assertThat(params.getPathParam(0)).isEqualTo("inbound_ach_transfer_id")
      // out-of-bound path param
      assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
