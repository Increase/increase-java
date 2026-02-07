// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.checktransfers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.increase.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CheckTransferTest {

    @Test
    fun create() {
        val checkTransfer =
            CheckTransfer.builder()
                .id("check_transfer_30b43acfu9vw8fyc4f5")
                .accountId("account_in71c4amph0vgo2qllky")
                .accountNumber("987654321")
                .amount(1000L)
                .approval(
                    CheckTransfer.Approval.builder()
                        .approvedAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .approvedBy(null)
                        .build()
                )
                .approvedInboundCheckDepositId("inbound_check_deposit_zoshvqybq0cjjm31mra")
                .balanceCheck(null)
                .cancellation(
                    CheckTransfer.Cancellation.builder()
                        .canceledAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .canceledBy(null)
                        .build()
                )
                .checkNumber("123")
                .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                .createdBy(
                    CheckTransfer.CreatedBy.builder()
                        .category(CheckTransfer.CreatedBy.Category.USER)
                        .apiKey(
                            CheckTransfer.CreatedBy.ApiKey.builder()
                                .description("description")
                                .build()
                        )
                        .oauthApplication(
                            CheckTransfer.CreatedBy.OAuthApplication.builder().name("name").build()
                        )
                        .user(
                            CheckTransfer.CreatedBy.User.builder().email("user@example.com").build()
                        )
                        .build()
                )
                .currency(CheckTransfer.Currency.USD)
                .fulfillmentMethod(CheckTransfer.FulfillmentMethod.PHYSICAL_CHECK)
                .idempotencyKey(null)
                .mailing(
                    CheckTransfer.Mailing.builder()
                        .mailedAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .build()
                )
                .pendingTransactionId("pending_transaction_k1sfetcau2qbvjbzgju4")
                .physicalCheck(
                    CheckTransfer.PhysicalCheck.builder()
                        .attachmentFileId(null)
                        .checkVoucherImageFileId(null)
                        .mailingAddress(
                            CheckTransfer.PhysicalCheck.MailingAddress.builder()
                                .city("New York")
                                .line1("33 Liberty Street")
                                .line2(null)
                                .name("Ian Crease")
                                .phone("+16505046304")
                                .postalCode("10045")
                                .state("NY")
                                .build()
                        )
                        .memo("Invoice 29582")
                        .note(null)
                        .payer(
                            listOf(
                                CheckTransfer.PhysicalCheck.Payer.builder()
                                    .contents("Ian Crease")
                                    .build(),
                                CheckTransfer.PhysicalCheck.Payer.builder()
                                    .contents("33 Liberty Street")
                                    .build(),
                                CheckTransfer.PhysicalCheck.Payer.builder()
                                    .contents("New York, NY 10045")
                                    .build(),
                            )
                        )
                        .recipientName("Ian Crease")
                        .returnAddress(
                            CheckTransfer.PhysicalCheck.ReturnAddress.builder()
                                .city("New York")
                                .line1("33 Liberty Street")
                                .line2(null)
                                .name("Ian Crease")
                                .phone("+16505046304")
                                .postalCode("10045")
                                .state("NY")
                                .build()
                        )
                        .shippingMethod(null)
                        .signatureText(null)
                        .addTrackingUpdate(
                            CheckTransfer.PhysicalCheck.TrackingUpdate.builder()
                                .category(
                                    CheckTransfer.PhysicalCheck.TrackingUpdate.Category.IN_TRANSIT
                                )
                                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .postalCode("postal_code")
                                .build()
                        )
                        .build()
                )
                .routingNumber("101050001")
                .sourceAccountNumberId("account_number_v18nkfqm6afpsrvy82b2")
                .status(CheckTransfer.Status.MAILED)
                .stopPaymentRequest(
                    CheckTransfer.StopPaymentRequest.builder()
                        .reason(CheckTransfer.StopPaymentRequest.Reason.MAIL_DELIVERY_FAILED)
                        .requestedAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .transferId("check_transfer_30b43acfu9vw8fyc4f5")
                        .type(
                            CheckTransfer.StopPaymentRequest.Type
                                .CHECK_TRANSFER_STOP_PAYMENT_REQUEST
                        )
                        .build()
                )
                .submission(
                    CheckTransfer.Submission.builder()
                        .previewFileId(null)
                        .submittedAddress(
                            CheckTransfer.Submission.SubmittedAddress.builder()
                                .city("NEW YORK")
                                .line1("33 LIBERTY STREET")
                                .line2(null)
                                .recipientName("IAN CREASE")
                                .state("NY")
                                .zip("10045")
                                .build()
                        )
                        .submittedAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .trackingNumber(null)
                        .build()
                )
                .thirdParty(
                    CheckTransfer.ThirdParty.builder().recipientName("recipient_name").build()
                )
                .type(CheckTransfer.Type.CHECK_TRANSFER)
                .validUntilDate(null)
                .build()

        assertThat(checkTransfer.id()).isEqualTo("check_transfer_30b43acfu9vw8fyc4f5")
        assertThat(checkTransfer.accountId()).isEqualTo("account_in71c4amph0vgo2qllky")
        assertThat(checkTransfer.accountNumber()).isEqualTo("987654321")
        assertThat(checkTransfer.amount()).isEqualTo(1000L)
        assertThat(checkTransfer.approval())
            .contains(
                CheckTransfer.Approval.builder()
                    .approvedAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                    .approvedBy(null)
                    .build()
            )
        assertThat(checkTransfer.approvedInboundCheckDepositId())
            .contains("inbound_check_deposit_zoshvqybq0cjjm31mra")
        assertThat(checkTransfer.balanceCheck()).isEmpty
        assertThat(checkTransfer.cancellation())
            .contains(
                CheckTransfer.Cancellation.builder()
                    .canceledAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                    .canceledBy(null)
                    .build()
            )
        assertThat(checkTransfer.checkNumber()).isEqualTo("123")
        assertThat(checkTransfer.createdAt())
            .isEqualTo(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
        assertThat(checkTransfer.createdBy())
            .contains(
                CheckTransfer.CreatedBy.builder()
                    .category(CheckTransfer.CreatedBy.Category.USER)
                    .apiKey(
                        CheckTransfer.CreatedBy.ApiKey.builder().description("description").build()
                    )
                    .oauthApplication(
                        CheckTransfer.CreatedBy.OAuthApplication.builder().name("name").build()
                    )
                    .user(CheckTransfer.CreatedBy.User.builder().email("user@example.com").build())
                    .build()
            )
        assertThat(checkTransfer.currency()).isEqualTo(CheckTransfer.Currency.USD)
        assertThat(checkTransfer.fulfillmentMethod())
            .isEqualTo(CheckTransfer.FulfillmentMethod.PHYSICAL_CHECK)
        assertThat(checkTransfer.idempotencyKey()).isEmpty
        assertThat(checkTransfer.mailing())
            .contains(
                CheckTransfer.Mailing.builder()
                    .mailedAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                    .build()
            )
        assertThat(checkTransfer.pendingTransactionId())
            .contains("pending_transaction_k1sfetcau2qbvjbzgju4")
        assertThat(checkTransfer.physicalCheck())
            .contains(
                CheckTransfer.PhysicalCheck.builder()
                    .attachmentFileId(null)
                    .checkVoucherImageFileId(null)
                    .mailingAddress(
                        CheckTransfer.PhysicalCheck.MailingAddress.builder()
                            .city("New York")
                            .line1("33 Liberty Street")
                            .line2(null)
                            .name("Ian Crease")
                            .phone("+16505046304")
                            .postalCode("10045")
                            .state("NY")
                            .build()
                    )
                    .memo("Invoice 29582")
                    .note(null)
                    .payer(
                        listOf(
                            CheckTransfer.PhysicalCheck.Payer.builder()
                                .contents("Ian Crease")
                                .build(),
                            CheckTransfer.PhysicalCheck.Payer.builder()
                                .contents("33 Liberty Street")
                                .build(),
                            CheckTransfer.PhysicalCheck.Payer.builder()
                                .contents("New York, NY 10045")
                                .build(),
                        )
                    )
                    .recipientName("Ian Crease")
                    .returnAddress(
                        CheckTransfer.PhysicalCheck.ReturnAddress.builder()
                            .city("New York")
                            .line1("33 Liberty Street")
                            .line2(null)
                            .name("Ian Crease")
                            .phone("+16505046304")
                            .postalCode("10045")
                            .state("NY")
                            .build()
                    )
                    .shippingMethod(null)
                    .signatureText(null)
                    .addTrackingUpdate(
                        CheckTransfer.PhysicalCheck.TrackingUpdate.builder()
                            .category(
                                CheckTransfer.PhysicalCheck.TrackingUpdate.Category.IN_TRANSIT
                            )
                            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .postalCode("postal_code")
                            .build()
                    )
                    .build()
            )
        assertThat(checkTransfer.routingNumber()).isEqualTo("101050001")
        assertThat(checkTransfer.sourceAccountNumberId())
            .contains("account_number_v18nkfqm6afpsrvy82b2")
        assertThat(checkTransfer.status()).isEqualTo(CheckTransfer.Status.MAILED)
        assertThat(checkTransfer.stopPaymentRequest())
            .contains(
                CheckTransfer.StopPaymentRequest.builder()
                    .reason(CheckTransfer.StopPaymentRequest.Reason.MAIL_DELIVERY_FAILED)
                    .requestedAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                    .transferId("check_transfer_30b43acfu9vw8fyc4f5")
                    .type(CheckTransfer.StopPaymentRequest.Type.CHECK_TRANSFER_STOP_PAYMENT_REQUEST)
                    .build()
            )
        assertThat(checkTransfer.submission())
            .contains(
                CheckTransfer.Submission.builder()
                    .previewFileId(null)
                    .submittedAddress(
                        CheckTransfer.Submission.SubmittedAddress.builder()
                            .city("NEW YORK")
                            .line1("33 LIBERTY STREET")
                            .line2(null)
                            .recipientName("IAN CREASE")
                            .state("NY")
                            .zip("10045")
                            .build()
                    )
                    .submittedAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                    .trackingNumber(null)
                    .build()
            )
        assertThat(checkTransfer.thirdParty())
            .contains(CheckTransfer.ThirdParty.builder().recipientName("recipient_name").build())
        assertThat(checkTransfer.type()).isEqualTo(CheckTransfer.Type.CHECK_TRANSFER)
        assertThat(checkTransfer.validUntilDate()).isEmpty
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val checkTransfer =
            CheckTransfer.builder()
                .id("check_transfer_30b43acfu9vw8fyc4f5")
                .accountId("account_in71c4amph0vgo2qllky")
                .accountNumber("987654321")
                .amount(1000L)
                .approval(
                    CheckTransfer.Approval.builder()
                        .approvedAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .approvedBy(null)
                        .build()
                )
                .approvedInboundCheckDepositId("inbound_check_deposit_zoshvqybq0cjjm31mra")
                .balanceCheck(null)
                .cancellation(
                    CheckTransfer.Cancellation.builder()
                        .canceledAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .canceledBy(null)
                        .build()
                )
                .checkNumber("123")
                .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                .createdBy(
                    CheckTransfer.CreatedBy.builder()
                        .category(CheckTransfer.CreatedBy.Category.USER)
                        .apiKey(
                            CheckTransfer.CreatedBy.ApiKey.builder()
                                .description("description")
                                .build()
                        )
                        .oauthApplication(
                            CheckTransfer.CreatedBy.OAuthApplication.builder().name("name").build()
                        )
                        .user(
                            CheckTransfer.CreatedBy.User.builder().email("user@example.com").build()
                        )
                        .build()
                )
                .currency(CheckTransfer.Currency.USD)
                .fulfillmentMethod(CheckTransfer.FulfillmentMethod.PHYSICAL_CHECK)
                .idempotencyKey(null)
                .mailing(
                    CheckTransfer.Mailing.builder()
                        .mailedAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .build()
                )
                .pendingTransactionId("pending_transaction_k1sfetcau2qbvjbzgju4")
                .physicalCheck(
                    CheckTransfer.PhysicalCheck.builder()
                        .attachmentFileId(null)
                        .checkVoucherImageFileId(null)
                        .mailingAddress(
                            CheckTransfer.PhysicalCheck.MailingAddress.builder()
                                .city("New York")
                                .line1("33 Liberty Street")
                                .line2(null)
                                .name("Ian Crease")
                                .phone("+16505046304")
                                .postalCode("10045")
                                .state("NY")
                                .build()
                        )
                        .memo("Invoice 29582")
                        .note(null)
                        .payer(
                            listOf(
                                CheckTransfer.PhysicalCheck.Payer.builder()
                                    .contents("Ian Crease")
                                    .build(),
                                CheckTransfer.PhysicalCheck.Payer.builder()
                                    .contents("33 Liberty Street")
                                    .build(),
                                CheckTransfer.PhysicalCheck.Payer.builder()
                                    .contents("New York, NY 10045")
                                    .build(),
                            )
                        )
                        .recipientName("Ian Crease")
                        .returnAddress(
                            CheckTransfer.PhysicalCheck.ReturnAddress.builder()
                                .city("New York")
                                .line1("33 Liberty Street")
                                .line2(null)
                                .name("Ian Crease")
                                .phone("+16505046304")
                                .postalCode("10045")
                                .state("NY")
                                .build()
                        )
                        .shippingMethod(null)
                        .signatureText(null)
                        .addTrackingUpdate(
                            CheckTransfer.PhysicalCheck.TrackingUpdate.builder()
                                .category(
                                    CheckTransfer.PhysicalCheck.TrackingUpdate.Category.IN_TRANSIT
                                )
                                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .postalCode("postal_code")
                                .build()
                        )
                        .build()
                )
                .routingNumber("101050001")
                .sourceAccountNumberId("account_number_v18nkfqm6afpsrvy82b2")
                .status(CheckTransfer.Status.MAILED)
                .stopPaymentRequest(
                    CheckTransfer.StopPaymentRequest.builder()
                        .reason(CheckTransfer.StopPaymentRequest.Reason.MAIL_DELIVERY_FAILED)
                        .requestedAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .transferId("check_transfer_30b43acfu9vw8fyc4f5")
                        .type(
                            CheckTransfer.StopPaymentRequest.Type
                                .CHECK_TRANSFER_STOP_PAYMENT_REQUEST
                        )
                        .build()
                )
                .submission(
                    CheckTransfer.Submission.builder()
                        .previewFileId(null)
                        .submittedAddress(
                            CheckTransfer.Submission.SubmittedAddress.builder()
                                .city("NEW YORK")
                                .line1("33 LIBERTY STREET")
                                .line2(null)
                                .recipientName("IAN CREASE")
                                .state("NY")
                                .zip("10045")
                                .build()
                        )
                        .submittedAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .trackingNumber(null)
                        .build()
                )
                .thirdParty(
                    CheckTransfer.ThirdParty.builder().recipientName("recipient_name").build()
                )
                .type(CheckTransfer.Type.CHECK_TRANSFER)
                .validUntilDate(null)
                .build()

        val roundtrippedCheckTransfer =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(checkTransfer),
                jacksonTypeRef<CheckTransfer>(),
            )

        assertThat(roundtrippedCheckTransfer).isEqualTo(checkTransfer)
    }
}
