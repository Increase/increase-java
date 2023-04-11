package com.increase.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.UUID
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat
import com.increase.api.models.*
import com.increase.api.models.SimulationsInboundWireDrawdownRequestCreateParams.SimulationsInboundWireDrawdownRequestCreateBody

class SimulationsInboundWireDrawdownRequestCreateParamsTest {

    @Test
    fun createSimulationsInboundWireDrawdownRequestCreateParams() {
      SimulationsInboundWireDrawdownRequestCreateParams.builder()
          .recipientAccountNumberId("string")
          .originatorAccountNumber("x")
          .originatorRoutingNumber("x")
          .beneficiaryAccountNumber("x")
          .beneficiaryRoutingNumber("x")
          .amount(123L)
          .currency("x")
          .messageToRecipient("x")
          .originatorToBeneficiaryInformationLine1("x")
          .originatorToBeneficiaryInformationLine2("x")
          .originatorToBeneficiaryInformationLine3("x")
          .originatorToBeneficiaryInformationLine4("x")
          .originatorName("x")
          .originatorAddressLine1("x")
          .originatorAddressLine2("x")
          .originatorAddressLine3("x")
          .beneficiaryName("x")
          .beneficiaryAddressLine1("x")
          .beneficiaryAddressLine2("x")
          .beneficiaryAddressLine3("x")
          .build()
    }

    @Test
    fun getBody() {
      val params = SimulationsInboundWireDrawdownRequestCreateParams.builder()
          .recipientAccountNumberId("string")
          .originatorAccountNumber("x")
          .originatorRoutingNumber("x")
          .beneficiaryAccountNumber("x")
          .beneficiaryRoutingNumber("x")
          .amount(123L)
          .currency("x")
          .messageToRecipient("x")
          .originatorToBeneficiaryInformationLine1("x")
          .originatorToBeneficiaryInformationLine2("x")
          .originatorToBeneficiaryInformationLine3("x")
          .originatorToBeneficiaryInformationLine4("x")
          .originatorName("x")
          .originatorAddressLine1("x")
          .originatorAddressLine2("x")
          .originatorAddressLine3("x")
          .beneficiaryName("x")
          .beneficiaryAddressLine1("x")
          .beneficiaryAddressLine2("x")
          .beneficiaryAddressLine3("x")
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
      assertThat(body.recipientAccountNumberId()).isEqualTo("string")
      assertThat(body.originatorAccountNumber()).isEqualTo("x")
      assertThat(body.originatorRoutingNumber()).isEqualTo("x")
      assertThat(body.beneficiaryAccountNumber()).isEqualTo("x")
      assertThat(body.beneficiaryRoutingNumber()).isEqualTo("x")
      assertThat(body.amount()).isEqualTo(123L)
      assertThat(body.currency()).isEqualTo("x")
      assertThat(body.messageToRecipient()).isEqualTo("x")
      assertThat(body.originatorToBeneficiaryInformationLine1()).isEqualTo("x")
      assertThat(body.originatorToBeneficiaryInformationLine2()).isEqualTo("x")
      assertThat(body.originatorToBeneficiaryInformationLine3()).isEqualTo("x")
      assertThat(body.originatorToBeneficiaryInformationLine4()).isEqualTo("x")
      assertThat(body.originatorName()).isEqualTo("x")
      assertThat(body.originatorAddressLine1()).isEqualTo("x")
      assertThat(body.originatorAddressLine2()).isEqualTo("x")
      assertThat(body.originatorAddressLine3()).isEqualTo("x")
      assertThat(body.beneficiaryName()).isEqualTo("x")
      assertThat(body.beneficiaryAddressLine1()).isEqualTo("x")
      assertThat(body.beneficiaryAddressLine2()).isEqualTo("x")
      assertThat(body.beneficiaryAddressLine3()).isEqualTo("x")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
      val params = SimulationsInboundWireDrawdownRequestCreateParams.builder()
          .recipientAccountNumberId("string")
          .originatorAccountNumber("x")
          .originatorRoutingNumber("x")
          .beneficiaryAccountNumber("x")
          .beneficiaryRoutingNumber("x")
          .amount(123L)
          .currency("x")
          .messageToRecipient("x")
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
      assertThat(body.recipientAccountNumberId()).isEqualTo("string")
      assertThat(body.originatorAccountNumber()).isEqualTo("x")
      assertThat(body.originatorRoutingNumber()).isEqualTo("x")
      assertThat(body.beneficiaryAccountNumber()).isEqualTo("x")
      assertThat(body.beneficiaryRoutingNumber()).isEqualTo("x")
      assertThat(body.amount()).isEqualTo(123L)
      assertThat(body.currency()).isEqualTo("x")
      assertThat(body.messageToRecipient()).isEqualTo("x")
    }
}
