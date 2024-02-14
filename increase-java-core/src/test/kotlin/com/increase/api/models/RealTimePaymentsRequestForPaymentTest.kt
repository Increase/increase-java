// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class RealTimePaymentsRequestForPaymentTest {

    @Test
    fun createRealTimePaymentsRequestForPayment() {
        val realTimePaymentsRequestForPayment =
            RealTimePaymentsRequestForPayment.builder()
                .id("string")
                .amount(123L)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currency(RealTimePaymentsRequestForPayment.Currency.CAD)
                .debtorName("string")
                .destinationAccountNumberId("string")
                .expiresAt(LocalDate.parse("2019-12-27"))
                .fulfillmentTransactionId("string")
                .idempotencyKey("string")
                .refusal(
                    RealTimePaymentsRequestForPayment.Refusal.builder()
                        .refusalReasonCode(
                            RealTimePaymentsRequestForPayment.Refusal.RefusalReasonCode
                                .ACCOUNT_BLOCKED
                        )
                        .build()
                )
                .rejection(
                    RealTimePaymentsRequestForPayment.Rejection.builder()
                        .rejectReasonCode(
                            RealTimePaymentsRequestForPayment.Rejection.RejectReasonCode
                                .ACCOUNT_CLOSED
                        )
                        .build()
                )
                .remittanceInformation("string")
                .sourceAccountNumber("string")
                .sourceRoutingNumber("string")
                .status(RealTimePaymentsRequestForPayment.Status.PENDING_SUBMISSION)
                .submission(
                    RealTimePaymentsRequestForPayment.Submission.builder()
                        .paymentInformationIdentification("string")
                        .build()
                )
                .type(RealTimePaymentsRequestForPayment.Type.REAL_TIME_PAYMENTS_REQUEST_FOR_PAYMENT)
                .build()
        assertThat(realTimePaymentsRequestForPayment).isNotNull
        assertThat(realTimePaymentsRequestForPayment.id()).isEqualTo("string")
        assertThat(realTimePaymentsRequestForPayment.amount()).isEqualTo(123L)
        assertThat(realTimePaymentsRequestForPayment.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(realTimePaymentsRequestForPayment.currency())
            .isEqualTo(RealTimePaymentsRequestForPayment.Currency.CAD)
        assertThat(realTimePaymentsRequestForPayment.debtorName()).isEqualTo("string")
        assertThat(realTimePaymentsRequestForPayment.destinationAccountNumberId())
            .isEqualTo("string")
        assertThat(realTimePaymentsRequestForPayment.expiresAt())
            .isEqualTo(LocalDate.parse("2019-12-27"))
        assertThat(realTimePaymentsRequestForPayment.fulfillmentTransactionId()).contains("string")
        assertThat(realTimePaymentsRequestForPayment.idempotencyKey()).contains("string")
        assertThat(realTimePaymentsRequestForPayment.refusal())
            .contains(
                RealTimePaymentsRequestForPayment.Refusal.builder()
                    .refusalReasonCode(
                        RealTimePaymentsRequestForPayment.Refusal.RefusalReasonCode.ACCOUNT_BLOCKED
                    )
                    .build()
            )
        assertThat(realTimePaymentsRequestForPayment.rejection())
            .contains(
                RealTimePaymentsRequestForPayment.Rejection.builder()
                    .rejectReasonCode(
                        RealTimePaymentsRequestForPayment.Rejection.RejectReasonCode.ACCOUNT_CLOSED
                    )
                    .build()
            )
        assertThat(realTimePaymentsRequestForPayment.remittanceInformation()).isEqualTo("string")
        assertThat(realTimePaymentsRequestForPayment.sourceAccountNumber()).isEqualTo("string")
        assertThat(realTimePaymentsRequestForPayment.sourceRoutingNumber()).isEqualTo("string")
        assertThat(realTimePaymentsRequestForPayment.status())
            .isEqualTo(RealTimePaymentsRequestForPayment.Status.PENDING_SUBMISSION)
        assertThat(realTimePaymentsRequestForPayment.submission())
            .contains(
                RealTimePaymentsRequestForPayment.Submission.builder()
                    .paymentInformationIdentification("string")
                    .build()
            )
        assertThat(realTimePaymentsRequestForPayment.type())
            .isEqualTo(
                RealTimePaymentsRequestForPayment.Type.REAL_TIME_PAYMENTS_REQUEST_FOR_PAYMENT
            )
    }
}
