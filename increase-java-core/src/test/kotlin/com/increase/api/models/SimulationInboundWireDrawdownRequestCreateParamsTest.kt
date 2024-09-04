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
import com.increase.api.models.SimulationInboundWireDrawdownRequestCreateParams
import com.increase.api.models.SimulationInboundWireDrawdownRequestCreateParams.SimulationInboundWireDrawdownRequestCreateBody

class SimulationInboundWireDrawdownRequestCreateParamsTest {

    @Test
    fun createSimulationInboundWireDrawdownRequestCreateParams() {
      SimulationInboundWireDrawdownRequestCreateParams.builder()
          .amount(123L)
          .beneficiaryAccountNumber("x")
          .beneficiaryRoutingNumber("x")
          .currency("x")
          .messageToRecipient("x")
          .originatorAccountNumber("x")
          .originatorRoutingNumber("x")
          .recipientAccountNumberId("recipient_account_number_id")
          .beneficiaryAddressLine1("x")
          .beneficiaryAddressLine2("x")
          .beneficiaryAddressLine3("x")
          .beneficiaryName("x")
          .originatorAddressLine1("x")
          .originatorAddressLine2("x")
          .originatorAddressLine3("x")
          .originatorName("x")
          .originatorToBeneficiaryInformationLine1("x")
          .originatorToBeneficiaryInformationLine2("x")
          .originatorToBeneficiaryInformationLine3("x")
          .originatorToBeneficiaryInformationLine4("x")
          .build()
    }

    @Test
    fun getBody() {
      val params = SimulationInboundWireDrawdownRequestCreateParams.builder()
          .amount(123L)
          .beneficiaryAccountNumber("x")
          .beneficiaryRoutingNumber("x")
          .currency("x")
          .messageToRecipient("x")
          .originatorAccountNumber("x")
          .originatorRoutingNumber("x")
          .recipientAccountNumberId("recipient_account_number_id")
          .beneficiaryAddressLine1("x")
          .beneficiaryAddressLine2("x")
          .beneficiaryAddressLine3("x")
          .beneficiaryName("x")
          .originatorAddressLine1("x")
          .originatorAddressLine2("x")
          .originatorAddressLine3("x")
          .originatorName("x")
          .originatorToBeneficiaryInformationLine1("x")
          .originatorToBeneficiaryInformationLine2("x")
          .originatorToBeneficiaryInformationLine3("x")
          .originatorToBeneficiaryInformationLine4("x")
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
      assertThat(body.amount()).isEqualTo(123L)
      assertThat(body.beneficiaryAccountNumber()).isEqualTo("x")
      assertThat(body.beneficiaryRoutingNumber()).isEqualTo("x")
      assertThat(body.currency()).isEqualTo("x")
      assertThat(body.messageToRecipient()).isEqualTo("x")
      assertThat(body.originatorAccountNumber()).isEqualTo("x")
      assertThat(body.originatorRoutingNumber()).isEqualTo("x")
      assertThat(body.recipientAccountNumberId()).isEqualTo("recipient_account_number_id")
      assertThat(body.beneficiaryAddressLine1()).isEqualTo("x")
      assertThat(body.beneficiaryAddressLine2()).isEqualTo("x")
      assertThat(body.beneficiaryAddressLine3()).isEqualTo("x")
      assertThat(body.beneficiaryName()).isEqualTo("x")
      assertThat(body.originatorAddressLine1()).isEqualTo("x")
      assertThat(body.originatorAddressLine2()).isEqualTo("x")
      assertThat(body.originatorAddressLine3()).isEqualTo("x")
      assertThat(body.originatorName()).isEqualTo("x")
      assertThat(body.originatorToBeneficiaryInformationLine1()).isEqualTo("x")
      assertThat(body.originatorToBeneficiaryInformationLine2()).isEqualTo("x")
      assertThat(body.originatorToBeneficiaryInformationLine3()).isEqualTo("x")
      assertThat(body.originatorToBeneficiaryInformationLine4()).isEqualTo("x")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
      val params = SimulationInboundWireDrawdownRequestCreateParams.builder()
          .amount(123L)
          .beneficiaryAccountNumber("x")
          .beneficiaryRoutingNumber("x")
          .currency("x")
          .messageToRecipient("x")
          .originatorAccountNumber("x")
          .originatorRoutingNumber("x")
          .recipientAccountNumberId("recipient_account_number_id")
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
      assertThat(body.amount()).isEqualTo(123L)
      assertThat(body.beneficiaryAccountNumber()).isEqualTo("x")
      assertThat(body.beneficiaryRoutingNumber()).isEqualTo("x")
      assertThat(body.currency()).isEqualTo("x")
      assertThat(body.messageToRecipient()).isEqualTo("x")
      assertThat(body.originatorAccountNumber()).isEqualTo("x")
      assertThat(body.originatorRoutingNumber()).isEqualTo("x")
      assertThat(body.recipientAccountNumberId()).isEqualTo("recipient_account_number_id")
    }
}
