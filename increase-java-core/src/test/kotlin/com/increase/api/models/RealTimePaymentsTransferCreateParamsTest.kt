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
import com.increase.api.models.RealTimePaymentsTransferCreateParams
import com.increase.api.models.RealTimePaymentsTransferCreateParams.RealTimePaymentsTransferCreateBody

class RealTimePaymentsTransferCreateParamsTest {

    @Test
    fun createRealTimePaymentsTransferCreateParams() {
      RealTimePaymentsTransferCreateParams.builder()
          .amount(123L)
          .creditorName("x")
          .remittanceInformation("x")
          .sourceAccountNumberId("source_account_number_id")
          .debtorName("x")
          .destinationAccountNumber("x")
          .destinationRoutingNumber("xxxxxxxxx")
          .externalAccountId("external_account_id")
          .requireApproval(true)
          .ultimateCreditorName("x")
          .ultimateDebtorName("x")
          .build()
    }

    @Test
    fun getBody() {
      val params = RealTimePaymentsTransferCreateParams.builder()
          .amount(123L)
          .creditorName("x")
          .remittanceInformation("x")
          .sourceAccountNumberId("source_account_number_id")
          .debtorName("x")
          .destinationAccountNumber("x")
          .destinationRoutingNumber("xxxxxxxxx")
          .externalAccountId("external_account_id")
          .requireApproval(true)
          .ultimateCreditorName("x")
          .ultimateDebtorName("x")
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
      assertThat(body.amount()).isEqualTo(123L)
      assertThat(body.creditorName()).isEqualTo("x")
      assertThat(body.remittanceInformation()).isEqualTo("x")
      assertThat(body.sourceAccountNumberId()).isEqualTo("source_account_number_id")
      assertThat(body.debtorName()).isEqualTo("x")
      assertThat(body.destinationAccountNumber()).isEqualTo("x")
      assertThat(body.destinationRoutingNumber()).isEqualTo("xxxxxxxxx")
      assertThat(body.externalAccountId()).isEqualTo("external_account_id")
      assertThat(body.requireApproval()).isEqualTo(true)
      assertThat(body.ultimateCreditorName()).isEqualTo("x")
      assertThat(body.ultimateDebtorName()).isEqualTo("x")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
      val params = RealTimePaymentsTransferCreateParams.builder()
          .amount(123L)
          .creditorName("x")
          .remittanceInformation("x")
          .sourceAccountNumberId("source_account_number_id")
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
      assertThat(body.amount()).isEqualTo(123L)
      assertThat(body.creditorName()).isEqualTo("x")
      assertThat(body.remittanceInformation()).isEqualTo("x")
      assertThat(body.sourceAccountNumberId()).isEqualTo("source_account_number_id")
    }
}
