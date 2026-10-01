// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.realtimepaymentsrequestsforpayment

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.increase.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RealTimePaymentsRequestForPaymentTest {

    @Test
    fun create() {
        val realTimePaymentsRequestForPayment =
            RealTimePaymentsRequestForPayment.builder()
                .id("real_time_payments_request_for_payment_28kcliz1oevcnqyn9qp7")
                .accountId("account_in71c4amph0vgo2qllky")
                .accountNumberId("account_number_v18nkfqm6afpsrvy82b2")
                .amount(100L)
                .cancellation(
                    RealTimePaymentsRequestForPayment.Cancellation.builder()
                        .additionalInformation(null)
                        .canceledAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .reason(
                            RealTimePaymentsRequestForPayment.Cancellation.Reason
                                .REQUESTED_BY_CUSTOMER
                        )
                        .build()
                )
                .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                .creditorName("National Phonograph Company")
                .currency(RealTimePaymentsRequestForPayment.Currency.USD)
                .debtor(
                    RealTimePaymentsRequestForPayment.Debtor.builder()
                        .address(
                            RealTimePaymentsRequestForPayment.Debtor.Address.builder()
                                .addressLine2("Unit 2")
                                .buildingNumber("33")
                                .city("New York")
                                .country("US")
                                .postalCode("10045")
                                .state("NY")
                                .streetName("Liberty Street")
                                .build()
                        )
                        .name("Ian Crease")
                        .build()
                )
                .debtorAccountNumber("987654321")
                .debtorRoutingNumber("101050001")
                .expiresAt(OffsetDateTime.parse("2020-02-14T23:59:59Z"))
                .fulfillmentInboundRealTimePaymentsTransferId(null)
                .idempotencyKey(null)
                .refusal(
                    RealTimePaymentsRequestForPayment.Refusal.builder()
                        .refusalReasonAdditionalInformation(null)
                        .refusalReasonCode(
                            RealTimePaymentsRequestForPayment.Refusal.RefusalReasonCode
                                .ACCOUNT_BLOCKED
                        )
                        .refusedAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .build()
                )
                .rejection(
                    RealTimePaymentsRequestForPayment.Rejection.builder()
                        .rejectReasonAdditionalInformation(null)
                        .rejectReasonCode(
                            RealTimePaymentsRequestForPayment.Rejection.RejectReasonCode
                                .ACCOUNT_CLOSED
                        )
                        .rejectedAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .build()
                )
                .requestedExecutionAt(OffsetDateTime.parse("2020-02-07T23:59:59Z"))
                .status(RealTimePaymentsRequestForPayment.Status.PENDING_RESPONSE)
                .submission(
                    RealTimePaymentsRequestForPayment.Submission.builder()
                        .paymentInformationIdentification("20220501234567891T1BSLZO01745013025")
                        .build()
                )
                .type(RealTimePaymentsRequestForPayment.Type.REAL_TIME_PAYMENTS_REQUEST_FOR_PAYMENT)
                .unstructuredRemittanceInformation("Invoice 29582")
                .build()

        assertThat(realTimePaymentsRequestForPayment.id())
            .isEqualTo("real_time_payments_request_for_payment_28kcliz1oevcnqyn9qp7")
        assertThat(realTimePaymentsRequestForPayment.accountId())
            .isEqualTo("account_in71c4amph0vgo2qllky")
        assertThat(realTimePaymentsRequestForPayment.accountNumberId())
            .isEqualTo("account_number_v18nkfqm6afpsrvy82b2")
        assertThat(realTimePaymentsRequestForPayment.amount()).isEqualTo(100L)
        assertThat(realTimePaymentsRequestForPayment.cancellation())
            .contains(
                RealTimePaymentsRequestForPayment.Cancellation.builder()
                    .additionalInformation(null)
                    .canceledAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                    .reason(
                        RealTimePaymentsRequestForPayment.Cancellation.Reason.REQUESTED_BY_CUSTOMER
                    )
                    .build()
            )
        assertThat(realTimePaymentsRequestForPayment.createdAt())
            .isEqualTo(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
        assertThat(realTimePaymentsRequestForPayment.creditorName())
            .isEqualTo("National Phonograph Company")
        assertThat(realTimePaymentsRequestForPayment.currency())
            .isEqualTo(RealTimePaymentsRequestForPayment.Currency.USD)
        assertThat(realTimePaymentsRequestForPayment.debtor())
            .isEqualTo(
                RealTimePaymentsRequestForPayment.Debtor.builder()
                    .address(
                        RealTimePaymentsRequestForPayment.Debtor.Address.builder()
                            .addressLine2("Unit 2")
                            .buildingNumber("33")
                            .city("New York")
                            .country("US")
                            .postalCode("10045")
                            .state("NY")
                            .streetName("Liberty Street")
                            .build()
                    )
                    .name("Ian Crease")
                    .build()
            )
        assertThat(realTimePaymentsRequestForPayment.debtorAccountNumber()).isEqualTo("987654321")
        assertThat(realTimePaymentsRequestForPayment.debtorRoutingNumber()).isEqualTo("101050001")
        assertThat(realTimePaymentsRequestForPayment.expiresAt())
            .isEqualTo(OffsetDateTime.parse("2020-02-14T23:59:59Z"))
        assertThat(realTimePaymentsRequestForPayment.fulfillmentInboundRealTimePaymentsTransferId())
            .isEmpty
        assertThat(realTimePaymentsRequestForPayment.idempotencyKey()).isEmpty
        assertThat(realTimePaymentsRequestForPayment.refusal())
            .contains(
                RealTimePaymentsRequestForPayment.Refusal.builder()
                    .refusalReasonAdditionalInformation(null)
                    .refusalReasonCode(
                        RealTimePaymentsRequestForPayment.Refusal.RefusalReasonCode.ACCOUNT_BLOCKED
                    )
                    .refusedAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                    .build()
            )
        assertThat(realTimePaymentsRequestForPayment.rejection())
            .contains(
                RealTimePaymentsRequestForPayment.Rejection.builder()
                    .rejectReasonAdditionalInformation(null)
                    .rejectReasonCode(
                        RealTimePaymentsRequestForPayment.Rejection.RejectReasonCode.ACCOUNT_CLOSED
                    )
                    .rejectedAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                    .build()
            )
        assertThat(realTimePaymentsRequestForPayment.requestedExecutionAt())
            .contains(OffsetDateTime.parse("2020-02-07T23:59:59Z"))
        assertThat(realTimePaymentsRequestForPayment.status())
            .isEqualTo(RealTimePaymentsRequestForPayment.Status.PENDING_RESPONSE)
        assertThat(realTimePaymentsRequestForPayment.submission())
            .contains(
                RealTimePaymentsRequestForPayment.Submission.builder()
                    .paymentInformationIdentification("20220501234567891T1BSLZO01745013025")
                    .build()
            )
        assertThat(realTimePaymentsRequestForPayment.type())
            .isEqualTo(
                RealTimePaymentsRequestForPayment.Type.REAL_TIME_PAYMENTS_REQUEST_FOR_PAYMENT
            )
        assertThat(realTimePaymentsRequestForPayment.unstructuredRemittanceInformation())
            .isEqualTo("Invoice 29582")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val realTimePaymentsRequestForPayment =
            RealTimePaymentsRequestForPayment.builder()
                .id("real_time_payments_request_for_payment_28kcliz1oevcnqyn9qp7")
                .accountId("account_in71c4amph0vgo2qllky")
                .accountNumberId("account_number_v18nkfqm6afpsrvy82b2")
                .amount(100L)
                .cancellation(
                    RealTimePaymentsRequestForPayment.Cancellation.builder()
                        .additionalInformation(null)
                        .canceledAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .reason(
                            RealTimePaymentsRequestForPayment.Cancellation.Reason
                                .REQUESTED_BY_CUSTOMER
                        )
                        .build()
                )
                .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                .creditorName("National Phonograph Company")
                .currency(RealTimePaymentsRequestForPayment.Currency.USD)
                .debtor(
                    RealTimePaymentsRequestForPayment.Debtor.builder()
                        .address(
                            RealTimePaymentsRequestForPayment.Debtor.Address.builder()
                                .addressLine2("Unit 2")
                                .buildingNumber("33")
                                .city("New York")
                                .country("US")
                                .postalCode("10045")
                                .state("NY")
                                .streetName("Liberty Street")
                                .build()
                        )
                        .name("Ian Crease")
                        .build()
                )
                .debtorAccountNumber("987654321")
                .debtorRoutingNumber("101050001")
                .expiresAt(OffsetDateTime.parse("2020-02-14T23:59:59Z"))
                .fulfillmentInboundRealTimePaymentsTransferId(null)
                .idempotencyKey(null)
                .refusal(
                    RealTimePaymentsRequestForPayment.Refusal.builder()
                        .refusalReasonAdditionalInformation(null)
                        .refusalReasonCode(
                            RealTimePaymentsRequestForPayment.Refusal.RefusalReasonCode
                                .ACCOUNT_BLOCKED
                        )
                        .refusedAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .build()
                )
                .rejection(
                    RealTimePaymentsRequestForPayment.Rejection.builder()
                        .rejectReasonAdditionalInformation(null)
                        .rejectReasonCode(
                            RealTimePaymentsRequestForPayment.Rejection.RejectReasonCode
                                .ACCOUNT_CLOSED
                        )
                        .rejectedAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .build()
                )
                .requestedExecutionAt(OffsetDateTime.parse("2020-02-07T23:59:59Z"))
                .status(RealTimePaymentsRequestForPayment.Status.PENDING_RESPONSE)
                .submission(
                    RealTimePaymentsRequestForPayment.Submission.builder()
                        .paymentInformationIdentification("20220501234567891T1BSLZO01745013025")
                        .build()
                )
                .type(RealTimePaymentsRequestForPayment.Type.REAL_TIME_PAYMENTS_REQUEST_FOR_PAYMENT)
                .unstructuredRemittanceInformation("Invoice 29582")
                .build()

        val roundtrippedRealTimePaymentsRequestForPayment =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(realTimePaymentsRequestForPayment),
                jacksonTypeRef<RealTimePaymentsRequestForPayment>(),
            )

        assertThat(roundtrippedRealTimePaymentsRequestForPayment)
            .isEqualTo(realTimePaymentsRequestForPayment)
    }
}
