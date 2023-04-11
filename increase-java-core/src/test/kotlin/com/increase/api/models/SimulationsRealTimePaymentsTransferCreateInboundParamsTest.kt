package com.increase.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.UUID
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat
import com.increase.api.models.*
import com.increase.api.models.SimulationsRealTimePaymentsTransferCreateInboundParams.SimulationsRealTimePaymentsTransferCreateInboundBody

class SimulationsRealTimePaymentsTransferCreateInboundParamsTest {

    @Test
    fun createSimulationsRealTimePaymentsTransferCreateInboundParams() {
      SimulationsRealTimePaymentsTransferCreateInboundParams.builder()
          .accountNumberId("string")
          .amount(123L)
          .requestForPaymentId("string")
          .debtorName("x")
          .debtorAccountNumber("x")
          .debtorRoutingNumber("xxxxxxxxx")
          .remittanceInformation("x")
          .build()
    }

    @Test
    fun getBody() {
      val params = SimulationsRealTimePaymentsTransferCreateInboundParams.builder()
          .accountNumberId("string")
          .amount(123L)
          .requestForPaymentId("string")
          .debtorName("x")
          .debtorAccountNumber("x")
          .debtorRoutingNumber("xxxxxxxxx")
          .remittanceInformation("x")
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
      assertThat(body.accountNumberId()).isEqualTo("string")
      assertThat(body.amount()).isEqualTo(123L)
      assertThat(body.requestForPaymentId()).isEqualTo("string")
      assertThat(body.debtorName()).isEqualTo("x")
      assertThat(body.debtorAccountNumber()).isEqualTo("x")
      assertThat(body.debtorRoutingNumber()).isEqualTo("xxxxxxxxx")
      assertThat(body.remittanceInformation()).isEqualTo("x")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
      val params = SimulationsRealTimePaymentsTransferCreateInboundParams.builder()
          .accountNumberId("string")
          .amount(123L)
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
      assertThat(body.accountNumberId()).isEqualTo("string")
      assertThat(body.amount()).isEqualTo(123L)
    }
}
