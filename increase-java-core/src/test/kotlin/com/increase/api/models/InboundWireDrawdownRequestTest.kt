package com.increase.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.UUID
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat
import com.increase.api.models.InboundWireDrawdownRequest

class InboundWireDrawdownRequestTest {

    @Test
    fun createInboundWireDrawdownRequest() {
      val inboundWireDrawdownRequest = InboundWireDrawdownRequest.builder()
          .type(InboundWireDrawdownRequest.Type.INBOUND_WIRE_DRAWDOWN_REQUEST)
          .id("string")
          .recipientAccountNumberId("string")
          .originatorAccountNumber("string")
          .originatorRoutingNumber("string")
          .beneficiaryAccountNumber("string")
          .beneficiaryRoutingNumber("string")
          .amount(123L)
          .currency("string")
          .messageToRecipient("string")
          .originatorToBeneficiaryInformationLine1("string")
          .originatorToBeneficiaryInformationLine2("string")
          .originatorToBeneficiaryInformationLine3("string")
          .originatorToBeneficiaryInformationLine4("string")
          .originatorName("string")
          .originatorAddressLine1("string")
          .originatorAddressLine2("string")
          .originatorAddressLine3("string")
          .beneficiaryName("string")
          .beneficiaryAddressLine1("string")
          .beneficiaryAddressLine2("string")
          .beneficiaryAddressLine3("string")
          .build()
      assertThat(inboundWireDrawdownRequest).isNotNull
      assertThat(inboundWireDrawdownRequest.type()).isEqualTo(InboundWireDrawdownRequest.Type.INBOUND_WIRE_DRAWDOWN_REQUEST)
      assertThat(inboundWireDrawdownRequest.id()).isEqualTo("string")
      assertThat(inboundWireDrawdownRequest.recipientAccountNumberId()).isEqualTo("string")
      assertThat(inboundWireDrawdownRequest.originatorAccountNumber()).isEqualTo("string")
      assertThat(inboundWireDrawdownRequest.originatorRoutingNumber()).isEqualTo("string")
      assertThat(inboundWireDrawdownRequest.beneficiaryAccountNumber()).isEqualTo("string")
      assertThat(inboundWireDrawdownRequest.beneficiaryRoutingNumber()).isEqualTo("string")
      assertThat(inboundWireDrawdownRequest.amount()).isEqualTo(123L)
      assertThat(inboundWireDrawdownRequest.currency()).isEqualTo("string")
      assertThat(inboundWireDrawdownRequest.messageToRecipient()).contains("string")
      assertThat(inboundWireDrawdownRequest.originatorToBeneficiaryInformationLine1()).contains("string")
      assertThat(inboundWireDrawdownRequest.originatorToBeneficiaryInformationLine2()).contains("string")
      assertThat(inboundWireDrawdownRequest.originatorToBeneficiaryInformationLine3()).contains("string")
      assertThat(inboundWireDrawdownRequest.originatorToBeneficiaryInformationLine4()).contains("string")
      assertThat(inboundWireDrawdownRequest.originatorName()).contains("string")
      assertThat(inboundWireDrawdownRequest.originatorAddressLine1()).contains("string")
      assertThat(inboundWireDrawdownRequest.originatorAddressLine2()).contains("string")
      assertThat(inboundWireDrawdownRequest.originatorAddressLine3()).contains("string")
      assertThat(inboundWireDrawdownRequest.beneficiaryName()).contains("string")
      assertThat(inboundWireDrawdownRequest.beneficiaryAddressLine1()).contains("string")
      assertThat(inboundWireDrawdownRequest.beneficiaryAddressLine2()).contains("string")
      assertThat(inboundWireDrawdownRequest.beneficiaryAddressLine3()).contains("string")
    }
}
