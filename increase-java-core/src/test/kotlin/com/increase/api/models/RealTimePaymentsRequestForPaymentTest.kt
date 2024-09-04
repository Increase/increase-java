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
import com.increase.api.models.RealTimePaymentsRequestForPayment

class RealTimePaymentsRequestForPaymentTest {

    @Test
    fun createRealTimePaymentsRequestForPayment() {
      val realTimePaymentsRequestForPayment = RealTimePaymentsRequestForPayment.builder()
          .id("id")
          .amount(123L)
          .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .currency(RealTimePaymentsRequestForPayment.Currency.CAD)
          .debtorName("debtor_name")
          .destinationAccountNumberId("destination_account_number_id")
          .expiresAt(LocalDate.parse("2019-12-27"))
          .fulfillmentTransactionId("fulfillment_transaction_id")
          .idempotencyKey("idempotency_key")
          .refusal(RealTimePaymentsRequestForPayment.Refusal.builder()
              .refusalReasonCode(RealTimePaymentsRequestForPayment.Refusal.RefusalReasonCode.ACCOUNT_BLOCKED)
              .build())
          .rejection(RealTimePaymentsRequestForPayment.Rejection.builder()
              .rejectReasonCode(RealTimePaymentsRequestForPayment.Rejection.RejectReasonCode.ACCOUNT_CLOSED)
              .build())
          .remittanceInformation("remittance_information")
          .sourceAccountNumber("source_account_number")
          .sourceRoutingNumber("source_routing_number")
          .status(RealTimePaymentsRequestForPayment.Status.PENDING_SUBMISSION)
          .submission(RealTimePaymentsRequestForPayment.Submission.builder()
              .paymentInformationIdentification("payment_information_identification")
              .build())
          .type(RealTimePaymentsRequestForPayment.Type.REAL_TIME_PAYMENTS_REQUEST_FOR_PAYMENT)
          .build()
      assertThat(realTimePaymentsRequestForPayment).isNotNull
      assertThat(realTimePaymentsRequestForPayment.id()).isEqualTo("id")
      assertThat(realTimePaymentsRequestForPayment.amount()).isEqualTo(123L)
      assertThat(realTimePaymentsRequestForPayment.createdAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
      assertThat(realTimePaymentsRequestForPayment.currency()).isEqualTo(RealTimePaymentsRequestForPayment.Currency.CAD)
      assertThat(realTimePaymentsRequestForPayment.debtorName()).isEqualTo("debtor_name")
      assertThat(realTimePaymentsRequestForPayment.destinationAccountNumberId()).isEqualTo("destination_account_number_id")
      assertThat(realTimePaymentsRequestForPayment.expiresAt()).isEqualTo(LocalDate.parse("2019-12-27"))
      assertThat(realTimePaymentsRequestForPayment.fulfillmentTransactionId()).contains("fulfillment_transaction_id")
      assertThat(realTimePaymentsRequestForPayment.idempotencyKey()).contains("idempotency_key")
      assertThat(realTimePaymentsRequestForPayment.refusal()).contains(RealTimePaymentsRequestForPayment.Refusal.builder()
          .refusalReasonCode(RealTimePaymentsRequestForPayment.Refusal.RefusalReasonCode.ACCOUNT_BLOCKED)
          .build())
      assertThat(realTimePaymentsRequestForPayment.rejection()).contains(RealTimePaymentsRequestForPayment.Rejection.builder()
          .rejectReasonCode(RealTimePaymentsRequestForPayment.Rejection.RejectReasonCode.ACCOUNT_CLOSED)
          .build())
      assertThat(realTimePaymentsRequestForPayment.remittanceInformation()).isEqualTo("remittance_information")
      assertThat(realTimePaymentsRequestForPayment.sourceAccountNumber()).isEqualTo("source_account_number")
      assertThat(realTimePaymentsRequestForPayment.sourceRoutingNumber()).isEqualTo("source_routing_number")
      assertThat(realTimePaymentsRequestForPayment.status()).isEqualTo(RealTimePaymentsRequestForPayment.Status.PENDING_SUBMISSION)
      assertThat(realTimePaymentsRequestForPayment.submission()).contains(RealTimePaymentsRequestForPayment.Submission.builder()
          .paymentInformationIdentification("payment_information_identification")
          .build())
      assertThat(realTimePaymentsRequestForPayment.type()).isEqualTo(RealTimePaymentsRequestForPayment.Type.REAL_TIME_PAYMENTS_REQUEST_FOR_PAYMENT)
    }
}
