package com.increase.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.UUID
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat
import com.increase.api.models.*
import com.increase.api.models.SimulationsAchTransferCreateInboundParams.SimulationsAchTransferCreateInboundBody

class SimulationsAchTransferCreateInboundParamsTest {

    @Test
    fun createSimulationsAchTransferCreateInboundParams() {
      SimulationsAchTransferCreateInboundParams.builder()
          .accountNumberId("string")
          .amount(123L)
          .companyDescriptiveDate("x")
          .companyDiscretionaryData("x")
          .companyEntryDescription("x")
          .companyName("x")
          .companyId("x")
          .build()
    }

    @Test
    fun getBody() {
      val params = SimulationsAchTransferCreateInboundParams.builder()
          .accountNumberId("string")
          .amount(123L)
          .companyDescriptiveDate("x")
          .companyDiscretionaryData("x")
          .companyEntryDescription("x")
          .companyName("x")
          .companyId("x")
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
      assertThat(body.accountNumberId()).isEqualTo("string")
      assertThat(body.amount()).isEqualTo(123L)
      assertThat(body.companyDescriptiveDate()).isEqualTo("x")
      assertThat(body.companyDiscretionaryData()).isEqualTo("x")
      assertThat(body.companyEntryDescription()).isEqualTo("x")
      assertThat(body.companyName()).isEqualTo("x")
      assertThat(body.companyId()).isEqualTo("x")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
      val params = SimulationsAchTransferCreateInboundParams.builder()
          .accountNumberId("string")
          .amount(123L)
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
      assertThat(body.accountNumberId()).isEqualTo("string")
      assertThat(body.amount()).isEqualTo(123L)
    }
}
