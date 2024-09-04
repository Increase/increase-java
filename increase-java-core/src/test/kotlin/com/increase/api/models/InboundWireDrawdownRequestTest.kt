// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.UUID
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat
import com.increase.api.core.JsonNull
import com.increase.api.core.JsonString
import com.increase.api.core.JsonValue
import com.increase.api.models.InboundWireDrawdownRequest

class InboundWireDrawdownRequestTest {

    @Test
    fun createInboundWireDrawdownRequest() {
      val inboundWireDrawdownRequest = InboundWireDrawdownRequest.builder()
          .id("id")
          .amount(123L)
          .beneficiaryAccountNumber("beneficiary_account_number")
          .beneficiaryAddressLine1("beneficiary_address_line1")
          .beneficiaryAddressLine2("beneficiary_address_line2")
          .beneficiaryAddressLine3("beneficiary_address_line3")
          .beneficiaryName("beneficiary_name")
          .beneficiaryRoutingNumber("beneficiary_routing_number")
          .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .currency("currency")
          .messageToRecipient("message_to_recipient")
          .originatorAccountNumber("originator_account_number")
          .originatorAddressLine1("originator_address_line1")
          .originatorAddressLine2("originator_address_line2")
          .originatorAddressLine3("originator_address_line3")
          .originatorName("originator_name")
          .originatorRoutingNumber("originator_routing_number")
          .originatorToBeneficiaryInformationLine1("originator_to_beneficiary_information_line1")
          .originatorToBeneficiaryInformationLine2("originator_to_beneficiary_information_line2")
          .originatorToBeneficiaryInformationLine3("originator_to_beneficiary_information_line3")
          .originatorToBeneficiaryInformationLine4("originator_to_beneficiary_information_line4")
          .recipientAccountNumberId("recipient_account_number_id")
          .type(InboundWireDrawdownRequest.Type.INBOUND_WIRE_DRAWDOWN_REQUEST)
          .build()
      assertThat(inboundWireDrawdownRequest).isNotNull
      assertThat(inboundWireDrawdownRequest.id()).isEqualTo("id")
      assertThat(inboundWireDrawdownRequest.amount()).isEqualTo(123L)
      assertThat(inboundWireDrawdownRequest.beneficiaryAccountNumber()).isEqualTo("beneficiary_account_number")
      assertThat(inboundWireDrawdownRequest.beneficiaryAddressLine1()).contains("beneficiary_address_line1")
      assertThat(inboundWireDrawdownRequest.beneficiaryAddressLine2()).contains("beneficiary_address_line2")
      assertThat(inboundWireDrawdownRequest.beneficiaryAddressLine3()).contains("beneficiary_address_line3")
      assertThat(inboundWireDrawdownRequest.beneficiaryName()).contains("beneficiary_name")
      assertThat(inboundWireDrawdownRequest.beneficiaryRoutingNumber()).isEqualTo("beneficiary_routing_number")
      assertThat(inboundWireDrawdownRequest.createdAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
      assertThat(inboundWireDrawdownRequest.currency()).isEqualTo("currency")
      assertThat(inboundWireDrawdownRequest.messageToRecipient()).contains("message_to_recipient")
      assertThat(inboundWireDrawdownRequest.originatorAccountNumber()).isEqualTo("originator_account_number")
      assertThat(inboundWireDrawdownRequest.originatorAddressLine1()).contains("originator_address_line1")
      assertThat(inboundWireDrawdownRequest.originatorAddressLine2()).contains("originator_address_line2")
      assertThat(inboundWireDrawdownRequest.originatorAddressLine3()).contains("originator_address_line3")
      assertThat(inboundWireDrawdownRequest.originatorName()).contains("originator_name")
      assertThat(inboundWireDrawdownRequest.originatorRoutingNumber()).isEqualTo("originator_routing_number")
      assertThat(inboundWireDrawdownRequest.originatorToBeneficiaryInformationLine1()).contains("originator_to_beneficiary_information_line1")
      assertThat(inboundWireDrawdownRequest.originatorToBeneficiaryInformationLine2()).contains("originator_to_beneficiary_information_line2")
      assertThat(inboundWireDrawdownRequest.originatorToBeneficiaryInformationLine3()).contains("originator_to_beneficiary_information_line3")
      assertThat(inboundWireDrawdownRequest.originatorToBeneficiaryInformationLine4()).contains("originator_to_beneficiary_information_line4")
      assertThat(inboundWireDrawdownRequest.recipientAccountNumberId()).isEqualTo("recipient_account_number_id")
      assertThat(inboundWireDrawdownRequest.type()).isEqualTo(InboundWireDrawdownRequest.Type.INBOUND_WIRE_DRAWDOWN_REQUEST)
    }
}
