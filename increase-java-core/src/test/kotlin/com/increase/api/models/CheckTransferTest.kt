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
import com.increase.api.models.CheckTransfer

class CheckTransferTest {

    @Test
    fun createCheckTransfer() {
      val checkTransfer = CheckTransfer.builder()
          .id("id")
          .accountId("account_id")
          .accountNumber("account_number")
          .amount(123L)
          .approval(CheckTransfer.Approval.builder()
              .approvedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .approvedBy("approved_by")
              .build())
          .approvedInboundCheckDepositId("approved_inbound_check_deposit_id")
          .cancellation(CheckTransfer.Cancellation.builder()
              .canceledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .canceledBy("canceled_by")
              .build())
          .checkNumber("check_number")
          .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .createdBy(CheckTransfer.CreatedBy.builder()
              .apiKey(CheckTransfer.CreatedBy.ApiKey.builder()
                  .description("description")
                  .build())
              .category(CheckTransfer.CreatedBy.Category.API_KEY)
              .oauthApplication(CheckTransfer.CreatedBy.OAuthApplication.builder()
                  .name("name")
                  .build())
              .user(CheckTransfer.CreatedBy.User.builder()
                  .email("email")
                  .build())
              .build())
          .currency(CheckTransfer.Currency.CAD)
          .fulfillmentMethod(CheckTransfer.FulfillmentMethod.PHYSICAL_CHECK)
          .idempotencyKey("idempotency_key")
          .mailing(CheckTransfer.Mailing.builder()
              .imageId("image_id")
              .mailedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .build())
          .pendingTransactionId("pending_transaction_id")
          .physicalCheck(CheckTransfer.PhysicalCheck.builder()
              .mailingAddress(CheckTransfer.PhysicalCheck.MailingAddress.builder()
                  .city("city")
                  .line1("line1")
                  .line2("line2")
                  .name("name")
                  .postalCode("postal_code")
                  .state("state")
                  .build())
              .memo("memo")
              .note("note")
              .recipientName("recipient_name")
              .returnAddress(CheckTransfer.PhysicalCheck.ReturnAddress.builder()
                  .city("city")
                  .line1("line1")
                  .line2("line2")
                  .name("name")
                  .postalCode("postal_code")
                  .state("state")
                  .build())
              .signatureText("signature_text")
              .trackingUpdates(listOf(CheckTransfer.PhysicalCheck.TrackingUpdate.builder()
                  .category(CheckTransfer.PhysicalCheck.TrackingUpdate.Category.RETURNED_TO_SENDER)
                  .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                  .build()))
              .build())
          .routingNumber("routing_number")
          .sourceAccountNumberId("source_account_number_id")
          .status(CheckTransfer.Status.PENDING_APPROVAL)
          .stopPaymentRequest(CheckTransfer.StopPaymentRequest.builder()
              .reason(CheckTransfer.StopPaymentRequest.Reason.MAIL_DELIVERY_FAILED)
              .requestedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .transferId("transfer_id")
              .type(CheckTransfer.StopPaymentRequest.Type.CHECK_TRANSFER_STOP_PAYMENT_REQUEST)
              .build())
          .submission(CheckTransfer.Submission.builder()
              .submittedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .build())
          .thirdParty(CheckTransfer.ThirdParty.builder()
              .checkNumber("check_number")
              .build())
          .type(CheckTransfer.Type.CHECK_TRANSFER)
          .build()
      assertThat(checkTransfer).isNotNull
      assertThat(checkTransfer.id()).isEqualTo("id")
      assertThat(checkTransfer.accountId()).isEqualTo("account_id")
      assertThat(checkTransfer.accountNumber()).isEqualTo("account_number")
      assertThat(checkTransfer.amount()).isEqualTo(123L)
      assertThat(checkTransfer.approval()).contains(CheckTransfer.Approval.builder()
          .approvedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .approvedBy("approved_by")
          .build())
      assertThat(checkTransfer.approvedInboundCheckDepositId()).contains("approved_inbound_check_deposit_id")
      assertThat(checkTransfer.cancellation()).contains(CheckTransfer.Cancellation.builder()
          .canceledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .canceledBy("canceled_by")
          .build())
      assertThat(checkTransfer.checkNumber()).isEqualTo("check_number")
      assertThat(checkTransfer.createdAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
      assertThat(checkTransfer.createdBy()).contains(CheckTransfer.CreatedBy.builder()
          .apiKey(CheckTransfer.CreatedBy.ApiKey.builder()
              .description("description")
              .build())
          .category(CheckTransfer.CreatedBy.Category.API_KEY)
          .oauthApplication(CheckTransfer.CreatedBy.OAuthApplication.builder()
              .name("name")
              .build())
          .user(CheckTransfer.CreatedBy.User.builder()
              .email("email")
              .build())
          .build())
      assertThat(checkTransfer.currency()).isEqualTo(CheckTransfer.Currency.CAD)
      assertThat(checkTransfer.fulfillmentMethod()).isEqualTo(CheckTransfer.FulfillmentMethod.PHYSICAL_CHECK)
      assertThat(checkTransfer.idempotencyKey()).contains("idempotency_key")
      assertThat(checkTransfer.mailing()).contains(CheckTransfer.Mailing.builder()
          .imageId("image_id")
          .mailedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .build())
      assertThat(checkTransfer.pendingTransactionId()).contains("pending_transaction_id")
      assertThat(checkTransfer.physicalCheck()).contains(CheckTransfer.PhysicalCheck.builder()
          .mailingAddress(CheckTransfer.PhysicalCheck.MailingAddress.builder()
              .city("city")
              .line1("line1")
              .line2("line2")
              .name("name")
              .postalCode("postal_code")
              .state("state")
              .build())
          .memo("memo")
          .note("note")
          .recipientName("recipient_name")
          .returnAddress(CheckTransfer.PhysicalCheck.ReturnAddress.builder()
              .city("city")
              .line1("line1")
              .line2("line2")
              .name("name")
              .postalCode("postal_code")
              .state("state")
              .build())
          .signatureText("signature_text")
          .trackingUpdates(listOf(CheckTransfer.PhysicalCheck.TrackingUpdate.builder()
              .category(CheckTransfer.PhysicalCheck.TrackingUpdate.Category.RETURNED_TO_SENDER)
              .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .build()))
          .build())
      assertThat(checkTransfer.routingNumber()).isEqualTo("routing_number")
      assertThat(checkTransfer.sourceAccountNumberId()).contains("source_account_number_id")
      assertThat(checkTransfer.status()).isEqualTo(CheckTransfer.Status.PENDING_APPROVAL)
      assertThat(checkTransfer.stopPaymentRequest()).contains(CheckTransfer.StopPaymentRequest.builder()
          .reason(CheckTransfer.StopPaymentRequest.Reason.MAIL_DELIVERY_FAILED)
          .requestedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .transferId("transfer_id")
          .type(CheckTransfer.StopPaymentRequest.Type.CHECK_TRANSFER_STOP_PAYMENT_REQUEST)
          .build())
      assertThat(checkTransfer.submission()).contains(CheckTransfer.Submission.builder()
          .submittedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .build())
      assertThat(checkTransfer.thirdParty()).contains(CheckTransfer.ThirdParty.builder()
          .checkNumber("check_number")
          .build())
      assertThat(checkTransfer.type()).isEqualTo(CheckTransfer.Type.CHECK_TRANSFER)
    }
}
