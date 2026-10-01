// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.inboundrealtimepaymentsrequestsforpayment

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.increase.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InboundRealTimePaymentsRequestForPaymentTest {

    @Test
    fun create() {
        val inboundRealTimePaymentsRequestForPayment =
            InboundRealTimePaymentsRequestForPayment.builder()
                .id("inbound_real_time_payments_request_for_payment_j9c5rm4hr6qf34en8tky")
                .accountId("account_in71c4amph0vgo2qllky")
                .accountNumberId("account_number_v18nkfqm6afpsrvy82b2")
                .amount(100L)
                .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                .creditor(
                    InboundRealTimePaymentsRequestForPayment.Creditor.builder()
                        .accountName("National Phonograph Company")
                        .address(
                            InboundRealTimePaymentsRequestForPayment.Creditor.Address.builder()
                                .addressLine2("Unit 2")
                                .buildingNumber("33")
                                .city("New York")
                                .country("US")
                                .postalCode("10045")
                                .state("NY")
                                .streetName("Liberty Street")
                                .build()
                        )
                        .name("National Phonograph Company")
                        .build()
                )
                .creditorAccountNumber("987654321")
                .creditorRoutingNumber("101050001")
                .currency(InboundRealTimePaymentsRequestForPayment.Currency.USD)
                .debtorName("Ian Crease")
                .endToEndIdentification("Invoice 29582")
                .expiresAt(OffsetDateTime.parse("2020-02-07T23:59:59Z"))
                .fulfillmentRealTimePaymentsTransferId(null)
                .invoicerIdentification(null)
                .paymentInformationIdentification("20220501234567891T1BSLZO01745013025")
                .requestedExecutionAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                .type(
                    InboundRealTimePaymentsRequestForPayment.Type
                        .INBOUND_REAL_TIME_PAYMENTS_REQUEST_FOR_PAYMENT
                )
                .unstructuredRemittanceInformation("Invoice 29582")
                .build()

        assertThat(inboundRealTimePaymentsRequestForPayment.id())
            .isEqualTo("inbound_real_time_payments_request_for_payment_j9c5rm4hr6qf34en8tky")
        assertThat(inboundRealTimePaymentsRequestForPayment.accountId())
            .isEqualTo("account_in71c4amph0vgo2qllky")
        assertThat(inboundRealTimePaymentsRequestForPayment.accountNumberId())
            .isEqualTo("account_number_v18nkfqm6afpsrvy82b2")
        assertThat(inboundRealTimePaymentsRequestForPayment.amount()).isEqualTo(100L)
        assertThat(inboundRealTimePaymentsRequestForPayment.createdAt())
            .isEqualTo(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
        assertThat(inboundRealTimePaymentsRequestForPayment.creditor())
            .isEqualTo(
                InboundRealTimePaymentsRequestForPayment.Creditor.builder()
                    .accountName("National Phonograph Company")
                    .address(
                        InboundRealTimePaymentsRequestForPayment.Creditor.Address.builder()
                            .addressLine2("Unit 2")
                            .buildingNumber("33")
                            .city("New York")
                            .country("US")
                            .postalCode("10045")
                            .state("NY")
                            .streetName("Liberty Street")
                            .build()
                    )
                    .name("National Phonograph Company")
                    .build()
            )
        assertThat(inboundRealTimePaymentsRequestForPayment.creditorAccountNumber())
            .isEqualTo("987654321")
        assertThat(inboundRealTimePaymentsRequestForPayment.creditorRoutingNumber())
            .isEqualTo("101050001")
        assertThat(inboundRealTimePaymentsRequestForPayment.currency())
            .isEqualTo(InboundRealTimePaymentsRequestForPayment.Currency.USD)
        assertThat(inboundRealTimePaymentsRequestForPayment.debtorName()).isEqualTo("Ian Crease")
        assertThat(inboundRealTimePaymentsRequestForPayment.endToEndIdentification())
            .isEqualTo("Invoice 29582")
        assertThat(inboundRealTimePaymentsRequestForPayment.expiresAt())
            .isEqualTo(OffsetDateTime.parse("2020-02-07T23:59:59Z"))
        assertThat(inboundRealTimePaymentsRequestForPayment.fulfillmentRealTimePaymentsTransferId())
            .isEmpty
        assertThat(inboundRealTimePaymentsRequestForPayment.invoicerIdentification()).isEmpty
        assertThat(inboundRealTimePaymentsRequestForPayment.paymentInformationIdentification())
            .isEqualTo("20220501234567891T1BSLZO01745013025")
        assertThat(inboundRealTimePaymentsRequestForPayment.requestedExecutionAt())
            .contains(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
        assertThat(inboundRealTimePaymentsRequestForPayment.type())
            .isEqualTo(
                InboundRealTimePaymentsRequestForPayment.Type
                    .INBOUND_REAL_TIME_PAYMENTS_REQUEST_FOR_PAYMENT
            )
        assertThat(inboundRealTimePaymentsRequestForPayment.unstructuredRemittanceInformation())
            .contains("Invoice 29582")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val inboundRealTimePaymentsRequestForPayment =
            InboundRealTimePaymentsRequestForPayment.builder()
                .id("inbound_real_time_payments_request_for_payment_j9c5rm4hr6qf34en8tky")
                .accountId("account_in71c4amph0vgo2qllky")
                .accountNumberId("account_number_v18nkfqm6afpsrvy82b2")
                .amount(100L)
                .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                .creditor(
                    InboundRealTimePaymentsRequestForPayment.Creditor.builder()
                        .accountName("National Phonograph Company")
                        .address(
                            InboundRealTimePaymentsRequestForPayment.Creditor.Address.builder()
                                .addressLine2("Unit 2")
                                .buildingNumber("33")
                                .city("New York")
                                .country("US")
                                .postalCode("10045")
                                .state("NY")
                                .streetName("Liberty Street")
                                .build()
                        )
                        .name("National Phonograph Company")
                        .build()
                )
                .creditorAccountNumber("987654321")
                .creditorRoutingNumber("101050001")
                .currency(InboundRealTimePaymentsRequestForPayment.Currency.USD)
                .debtorName("Ian Crease")
                .endToEndIdentification("Invoice 29582")
                .expiresAt(OffsetDateTime.parse("2020-02-07T23:59:59Z"))
                .fulfillmentRealTimePaymentsTransferId(null)
                .invoicerIdentification(null)
                .paymentInformationIdentification("20220501234567891T1BSLZO01745013025")
                .requestedExecutionAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                .type(
                    InboundRealTimePaymentsRequestForPayment.Type
                        .INBOUND_REAL_TIME_PAYMENTS_REQUEST_FOR_PAYMENT
                )
                .unstructuredRemittanceInformation("Invoice 29582")
                .build()

        val roundtrippedInboundRealTimePaymentsRequestForPayment =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(inboundRealTimePaymentsRequestForPayment),
                jacksonTypeRef<InboundRealTimePaymentsRequestForPayment>(),
            )

        assertThat(roundtrippedInboundRealTimePaymentsRequestForPayment)
            .isEqualTo(inboundRealTimePaymentsRequestForPayment)
    }
}
