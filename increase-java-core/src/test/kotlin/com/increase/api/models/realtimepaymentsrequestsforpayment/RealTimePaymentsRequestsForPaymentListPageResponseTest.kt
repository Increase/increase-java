// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.realtimepaymentsrequestsforpayment

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.increase.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RealTimePaymentsRequestsForPaymentListPageResponseTest {

    @Test
    fun create() {
        val realTimePaymentsRequestsForPaymentListPageResponse =
            RealTimePaymentsRequestsForPaymentListPageResponse.builder()
                .addData(
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
                                .paymentInformationIdentification(
                                    "20220501234567891T1BSLZO01745013025"
                                )
                                .build()
                        )
                        .type(
                            RealTimePaymentsRequestForPayment.Type
                                .REAL_TIME_PAYMENTS_REQUEST_FOR_PAYMENT
                        )
                        .unstructuredRemittanceInformation("Invoice 29582")
                        .build()
                )
                .nextCursor("v57w5d")
                .build()

        assertThat(realTimePaymentsRequestsForPaymentListPageResponse.data())
            .containsExactly(
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
                    .type(
                        RealTimePaymentsRequestForPayment.Type
                            .REAL_TIME_PAYMENTS_REQUEST_FOR_PAYMENT
                    )
                    .unstructuredRemittanceInformation("Invoice 29582")
                    .build()
            )
        assertThat(realTimePaymentsRequestsForPaymentListPageResponse.nextCursor())
            .contains("v57w5d")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val realTimePaymentsRequestsForPaymentListPageResponse =
            RealTimePaymentsRequestsForPaymentListPageResponse.builder()
                .addData(
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
                                .paymentInformationIdentification(
                                    "20220501234567891T1BSLZO01745013025"
                                )
                                .build()
                        )
                        .type(
                            RealTimePaymentsRequestForPayment.Type
                                .REAL_TIME_PAYMENTS_REQUEST_FOR_PAYMENT
                        )
                        .unstructuredRemittanceInformation("Invoice 29582")
                        .build()
                )
                .nextCursor("v57w5d")
                .build()

        val roundtrippedRealTimePaymentsRequestsForPaymentListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(realTimePaymentsRequestsForPaymentListPageResponse),
                jacksonTypeRef<RealTimePaymentsRequestsForPaymentListPageResponse>(),
            )

        assertThat(roundtrippedRealTimePaymentsRequestsForPaymentListPageResponse)
            .isEqualTo(realTimePaymentsRequestsForPaymentListPageResponse)
    }
}
