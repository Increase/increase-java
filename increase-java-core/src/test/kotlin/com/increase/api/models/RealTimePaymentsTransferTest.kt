// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class RealTimePaymentsTransferTest {

    @Test
    fun createRealTimePaymentsTransfer() {
        val realTimePaymentsTransfer =
            RealTimePaymentsTransfer.builder()
                .id("real_time_payments_transfer_iyuhl5kdn7ssmup83mvq")
                .accountId("account_in71c4amph0vgo2qllky")
                .acknowledgement(
                    RealTimePaymentsTransfer.Acknowledgement.builder()
                        .acknowledgedAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .build()
                )
                .amount(100L)
                .approval(
                    RealTimePaymentsTransfer.Approval.builder()
                        .approvedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .approvedBy("approved_by")
                        .build()
                )
                .cancellation(
                    RealTimePaymentsTransfer.Cancellation.builder()
                        .canceledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .canceledBy("canceled_by")
                        .build()
                )
                .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                .createdBy(
                    RealTimePaymentsTransfer.CreatedBy.builder()
                        .apiKey(
                            RealTimePaymentsTransfer.CreatedBy.ApiKey.builder()
                                .description("description")
                                .build()
                        )
                        .category(RealTimePaymentsTransfer.CreatedBy.Category.API_KEY)
                        .oauthApplication(
                            RealTimePaymentsTransfer.CreatedBy.OAuthApplication.builder()
                                .name("name")
                                .build()
                        )
                        .user(
                            RealTimePaymentsTransfer.CreatedBy.User.builder()
                                .email("user@example.com")
                                .build()
                        )
                        .build()
                )
                .creditorName("Ian Crease")
                .currency(RealTimePaymentsTransfer.Currency.CAD)
                .destinationAccountNumber("987654321")
                .destinationRoutingNumber("101050001")
                .rejection(
                    RealTimePaymentsTransfer.Rejection.builder()
                        .rejectReasonAdditionalInformation("reject_reason_additional_information")
                        .rejectReasonCode(
                            RealTimePaymentsTransfer.Rejection.RejectReasonCode.ACCOUNT_CLOSED
                        )
                        .rejectedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .remittanceInformation("Invoice 29582")
                .sourceAccountNumberId("account_number_v18nkfqm6afpsrvy82b2")
                .status(RealTimePaymentsTransfer.Status.PENDING_APPROVAL)
                .submission(
                    RealTimePaymentsTransfer.Submission.builder()
                        .submittedAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .transactionIdentification("20220501234567891T1BSLZO01745013025")
                        .build()
                )
                .transactionId("transaction_uyrp7fld2ium70oa7oi")
                .type(RealTimePaymentsTransfer.Type.REAL_TIME_PAYMENTS_TRANSFER)
                .build()
        assertThat(realTimePaymentsTransfer).isNotNull
        assertThat(realTimePaymentsTransfer.id())
            .isEqualTo("real_time_payments_transfer_iyuhl5kdn7ssmup83mvq")
        assertThat(realTimePaymentsTransfer.accountId()).isEqualTo("account_in71c4amph0vgo2qllky")
        assertThat(realTimePaymentsTransfer.acknowledgement())
            .contains(
                RealTimePaymentsTransfer.Acknowledgement.builder()
                    .acknowledgedAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                    .build()
            )
        assertThat(realTimePaymentsTransfer.amount()).isEqualTo(100L)
        assertThat(realTimePaymentsTransfer.approval())
            .contains(
                RealTimePaymentsTransfer.Approval.builder()
                    .approvedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .approvedBy("approved_by")
                    .build()
            )
        assertThat(realTimePaymentsTransfer.cancellation())
            .contains(
                RealTimePaymentsTransfer.Cancellation.builder()
                    .canceledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .canceledBy("canceled_by")
                    .build()
            )
        assertThat(realTimePaymentsTransfer.createdAt())
            .isEqualTo(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
        assertThat(realTimePaymentsTransfer.createdBy())
            .contains(
                RealTimePaymentsTransfer.CreatedBy.builder()
                    .apiKey(
                        RealTimePaymentsTransfer.CreatedBy.ApiKey.builder()
                            .description("description")
                            .build()
                    )
                    .category(RealTimePaymentsTransfer.CreatedBy.Category.API_KEY)
                    .oauthApplication(
                        RealTimePaymentsTransfer.CreatedBy.OAuthApplication.builder()
                            .name("name")
                            .build()
                    )
                    .user(
                        RealTimePaymentsTransfer.CreatedBy.User.builder()
                            .email("user@example.com")
                            .build()
                    )
                    .build()
            )
        assertThat(realTimePaymentsTransfer.creditorName()).isEqualTo("Ian Crease")
        assertThat(realTimePaymentsTransfer.currency())
            .isEqualTo(RealTimePaymentsTransfer.Currency.CAD)
        assertThat(realTimePaymentsTransfer.destinationAccountNumber()).isEqualTo("987654321")
        assertThat(realTimePaymentsTransfer.destinationRoutingNumber()).isEqualTo("101050001")
        assertThat(realTimePaymentsTransfer.rejection())
            .contains(
                RealTimePaymentsTransfer.Rejection.builder()
                    .rejectReasonAdditionalInformation("reject_reason_additional_information")
                    .rejectReasonCode(
                        RealTimePaymentsTransfer.Rejection.RejectReasonCode.ACCOUNT_CLOSED
                    )
                    .rejectedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(realTimePaymentsTransfer.remittanceInformation()).isEqualTo("Invoice 29582")
        assertThat(realTimePaymentsTransfer.sourceAccountNumberId())
            .isEqualTo("account_number_v18nkfqm6afpsrvy82b2")
        assertThat(realTimePaymentsTransfer.status())
            .isEqualTo(RealTimePaymentsTransfer.Status.PENDING_APPROVAL)
        assertThat(realTimePaymentsTransfer.submission())
            .contains(
                RealTimePaymentsTransfer.Submission.builder()
                    .submittedAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                    .transactionIdentification("20220501234567891T1BSLZO01745013025")
                    .build()
            )
        assertThat(realTimePaymentsTransfer.transactionId())
            .contains("transaction_uyrp7fld2ium70oa7oi")
        assertThat(realTimePaymentsTransfer.type())
            .isEqualTo(RealTimePaymentsTransfer.Type.REAL_TIME_PAYMENTS_TRANSFER)
    }
}
