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
import com.increase.api.models.SimulationInboundAchTransferCreateParams
import com.increase.api.models.SimulationInboundAchTransferCreateParams.SimulationInboundAchTransferCreateBody

class SimulationInboundAchTransferCreateParamsTest {

    @Test
    fun createSimulationInboundAchTransferCreateParams() {
      SimulationInboundAchTransferCreateParams.builder()
          .accountNumberId("account_number_id")
          .amount(123L)
          .companyDescriptiveDate("x")
          .companyDiscretionaryData("x")
          .companyEntryDescription("x")
          .companyId("x")
          .companyName("x")
          .receiverIdNumber("x")
          .receiverName("x")
          .resolveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .standardEntryClassCode(SimulationInboundAchTransferCreateParams.StandardEntryClassCode.CORPORATE_CREDIT_OR_DEBIT)
          .build()
    }

    @Test
    fun getBody() {
      val params = SimulationInboundAchTransferCreateParams.builder()
          .accountNumberId("account_number_id")
          .amount(123L)
          .companyDescriptiveDate("x")
          .companyDiscretionaryData("x")
          .companyEntryDescription("x")
          .companyId("x")
          .companyName("x")
          .receiverIdNumber("x")
          .receiverName("x")
          .resolveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .standardEntryClassCode(SimulationInboundAchTransferCreateParams.StandardEntryClassCode.CORPORATE_CREDIT_OR_DEBIT)
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
      assertThat(body.accountNumberId()).isEqualTo("account_number_id")
      assertThat(body.amount()).isEqualTo(123L)
      assertThat(body.companyDescriptiveDate()).isEqualTo("x")
      assertThat(body.companyDiscretionaryData()).isEqualTo("x")
      assertThat(body.companyEntryDescription()).isEqualTo("x")
      assertThat(body.companyId()).isEqualTo("x")
      assertThat(body.companyName()).isEqualTo("x")
      assertThat(body.receiverIdNumber()).isEqualTo("x")
      assertThat(body.receiverName()).isEqualTo("x")
      assertThat(body.resolveAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
      assertThat(body.standardEntryClassCode()).isEqualTo(SimulationInboundAchTransferCreateParams.StandardEntryClassCode.CORPORATE_CREDIT_OR_DEBIT)
    }

    @Test
    fun getBodyWithoutOptionalFields() {
      val params = SimulationInboundAchTransferCreateParams.builder()
          .accountNumberId("account_number_id")
          .amount(123L)
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
      assertThat(body.accountNumberId()).isEqualTo("account_number_id")
      assertThat(body.amount()).isEqualTo(123L)
    }
}
