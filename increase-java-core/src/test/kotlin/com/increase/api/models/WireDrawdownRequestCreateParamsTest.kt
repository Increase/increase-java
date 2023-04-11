package com.increase.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.UUID
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat
import com.increase.api.models.*
import com.increase.api.models.WireDrawdownRequestCreateParams.WireDrawdownRequestCreateBody

class WireDrawdownRequestCreateParamsTest {

    @Test
    fun createWireDrawdownRequestCreateParams() {
      WireDrawdownRequestCreateParams.builder()
          .accountNumberId("string")
          .amount(123L)
          .messageToRecipient("x")
          .recipientAccountNumber("x")
          .recipientRoutingNumber("x")
          .recipientName("x")
          .recipientAddressLine1("x")
          .recipientAddressLine2("x")
          .recipientAddressLine3("x")
          .build()
    }

    @Test
    fun getBody() {
      val params = WireDrawdownRequestCreateParams.builder()
          .accountNumberId("string")
          .amount(123L)
          .messageToRecipient("x")
          .recipientAccountNumber("x")
          .recipientRoutingNumber("x")
          .recipientName("x")
          .recipientAddressLine1("x")
          .recipientAddressLine2("x")
          .recipientAddressLine3("x")
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
      assertThat(body.accountNumberId()).isEqualTo("string")
      assertThat(body.amount()).isEqualTo(123L)
      assertThat(body.messageToRecipient()).isEqualTo("x")
      assertThat(body.recipientAccountNumber()).isEqualTo("x")
      assertThat(body.recipientRoutingNumber()).isEqualTo("x")
      assertThat(body.recipientName()).isEqualTo("x")
      assertThat(body.recipientAddressLine1()).isEqualTo("x")
      assertThat(body.recipientAddressLine2()).isEqualTo("x")
      assertThat(body.recipientAddressLine3()).isEqualTo("x")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
      val params = WireDrawdownRequestCreateParams.builder()
          .accountNumberId("string")
          .amount(123L)
          .messageToRecipient("x")
          .recipientAccountNumber("x")
          .recipientRoutingNumber("x")
          .recipientName("x")
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
      assertThat(body.accountNumberId()).isEqualTo("string")
      assertThat(body.amount()).isEqualTo(123L)
      assertThat(body.messageToRecipient()).isEqualTo("x")
      assertThat(body.recipientAccountNumber()).isEqualTo("x")
      assertThat(body.recipientRoutingNumber()).isEqualTo("x")
      assertThat(body.recipientName()).isEqualTo("x")
    }
}
