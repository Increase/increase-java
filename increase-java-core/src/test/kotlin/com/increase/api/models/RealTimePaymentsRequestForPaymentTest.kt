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
                .id("real_time_payments_request_for_payment_28kcliz1oevcnqyn9qp7")
                .amount(100L)
                .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                .currency(RealTimePaymentsRequestForPayment.Currency.CAD)
                .debtorName("Ian Crease")
                .destinationAccountNumberId("account_number_v18nkfqm6afpsrvy82b2")
                .expiresAt(LocalDate.parse("2026-12-31"))
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
                .remittanceInformation("Invoice 29582")
                .sourceAccountNumber("987654321")
                .sourceRoutingNumber("101050001")
                .status(RealTimePaymentsRequestForPayment.Status.PENDING_SUBMISSION)
                .submission(
                    RealTimePaymentsRequestForPayment.Submission.builder()
                        .paymentInformationIdentification("payment_information_identification")
                        .build()
                )
                .type(RealTimePaymentsRequestForPayment.Type.REAL_TIME_PAYMENTS_REQUEST_FOR_PAYMENT)
                .build()
        assertThat(realTimePaymentsRequestForPayment).isNotNull
        assertThat(realTimePaymentsRequestForPayment.id())
            .isEqualTo("real_time_payments_request_for_payment_28kcliz1oevcnqyn9qp7")
        assertThat(realTimePaymentsRequestForPayment.amount()).isEqualTo(100L)
        assertThat(realTimePaymentsRequestForPayment.createdAt())
            .isEqualTo(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
        assertThat(realTimePaymentsRequestForPayment.currency())
            .isEqualTo(RealTimePaymentsRequestForPayment.Currency.CAD)
        assertThat(realTimePaymentsRequestForPayment.debtorName()).isEqualTo("Ian Crease")
        assertThat(realTimePaymentsRequestForPayment.destinationAccountNumberId())
            .isEqualTo("account_number_v18nkfqm6afpsrvy82b2")
        assertThat(realTimePaymentsRequestForPayment.expiresAt())
            .isEqualTo(LocalDate.parse("2026-12-31"))
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
        assertThat(realTimePaymentsRequestForPayment.remittanceInformation())
            .isEqualTo("Invoice 29582")
        assertThat(realTimePaymentsRequestForPayment.sourceAccountNumber()).isEqualTo("987654321")
        assertThat(realTimePaymentsRequestForPayment.sourceRoutingNumber()).isEqualTo("101050001")
        assertThat(realTimePaymentsRequestForPayment.status())
            .isEqualTo(RealTimePaymentsRequestForPayment.Status.PENDING_SUBMISSION)
        assertThat(realTimePaymentsRequestForPayment.submission())
            .contains(
                RealTimePaymentsRequestForPayment.Submission.builder()
                    .paymentInformationIdentification("payment_information_identification")
                    .build()
            )
        assertThat(realTimePaymentsRequestForPayment.type())
            .isEqualTo(
                RealTimePaymentsRequestForPayment.Type.REAL_TIME_PAYMENTS_REQUEST_FOR_PAYMENT
            )
    }
}
