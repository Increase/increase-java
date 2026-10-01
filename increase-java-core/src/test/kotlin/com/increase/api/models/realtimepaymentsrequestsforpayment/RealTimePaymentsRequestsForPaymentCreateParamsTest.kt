// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.realtimepaymentsrequestsforpayment

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RealTimePaymentsRequestsForPaymentCreateParamsTest {

    @Test
    fun create() {
        RealTimePaymentsRequestsForPaymentCreateParams.builder()
            .accountNumberId("account_number_v18nkfqm6afpsrvy82b2")
            .amount(100L)
            .debtor(
                RealTimePaymentsRequestsForPaymentCreateParams.Debtor.builder()
                    .address(
                        RealTimePaymentsRequestsForPaymentCreateParams.Debtor.Address.builder()
                            .country("US")
                            .addressLine2("x")
                            .buildingNumber("x")
                            .city("x")
                            .postalCode("x")
                            .state("xx")
                            .streetName("Liberty Street")
                            .build()
                    )
                    .name("Ian Crease")
                    .build()
            )
            .debtorAccountNumber("987654321")
            .debtorRoutingNumber("101050001")
            .expiresAt(OffsetDateTime.parse("2020-02-14T23:59:59Z"))
            .requestedExecutionAt(OffsetDateTime.parse("2020-02-07T23:59:59Z"))
            .unstructuredRemittanceInformation("Invoice 29582")
            .creditorName("National Phonograph Company")
            .build()
    }

    @Test
    fun body() {
        val params =
            RealTimePaymentsRequestsForPaymentCreateParams.builder()
                .accountNumberId("account_number_v18nkfqm6afpsrvy82b2")
                .amount(100L)
                .debtor(
                    RealTimePaymentsRequestsForPaymentCreateParams.Debtor.builder()
                        .address(
                            RealTimePaymentsRequestsForPaymentCreateParams.Debtor.Address.builder()
                                .country("US")
                                .addressLine2("x")
                                .buildingNumber("x")
                                .city("x")
                                .postalCode("x")
                                .state("xx")
                                .streetName("Liberty Street")
                                .build()
                        )
                        .name("Ian Crease")
                        .build()
                )
                .debtorAccountNumber("987654321")
                .debtorRoutingNumber("101050001")
                .expiresAt(OffsetDateTime.parse("2020-02-14T23:59:59Z"))
                .requestedExecutionAt(OffsetDateTime.parse("2020-02-07T23:59:59Z"))
                .unstructuredRemittanceInformation("Invoice 29582")
                .creditorName("National Phonograph Company")
                .build()

        val body = params._body()

        assertThat(body.accountNumberId()).isEqualTo("account_number_v18nkfqm6afpsrvy82b2")
        assertThat(body.amount()).isEqualTo(100L)
        assertThat(body.debtor())
            .isEqualTo(
                RealTimePaymentsRequestsForPaymentCreateParams.Debtor.builder()
                    .address(
                        RealTimePaymentsRequestsForPaymentCreateParams.Debtor.Address.builder()
                            .country("US")
                            .addressLine2("x")
                            .buildingNumber("x")
                            .city("x")
                            .postalCode("x")
                            .state("xx")
                            .streetName("Liberty Street")
                            .build()
                    )
                    .name("Ian Crease")
                    .build()
            )
        assertThat(body.debtorAccountNumber()).isEqualTo("987654321")
        assertThat(body.debtorRoutingNumber()).isEqualTo("101050001")
        assertThat(body.expiresAt()).isEqualTo(OffsetDateTime.parse("2020-02-14T23:59:59Z"))
        assertThat(body.requestedExecutionAt())
            .isEqualTo(OffsetDateTime.parse("2020-02-07T23:59:59Z"))
        assertThat(body.unstructuredRemittanceInformation()).isEqualTo("Invoice 29582")
        assertThat(body.creditorName()).contains("National Phonograph Company")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            RealTimePaymentsRequestsForPaymentCreateParams.builder()
                .accountNumberId("account_number_v18nkfqm6afpsrvy82b2")
                .amount(100L)
                .debtor(
                    RealTimePaymentsRequestsForPaymentCreateParams.Debtor.builder()
                        .address(
                            RealTimePaymentsRequestsForPaymentCreateParams.Debtor.Address.builder()
                                .country("US")
                                .build()
                        )
                        .name("Ian Crease")
                        .build()
                )
                .debtorAccountNumber("987654321")
                .debtorRoutingNumber("101050001")
                .expiresAt(OffsetDateTime.parse("2020-02-14T23:59:59Z"))
                .requestedExecutionAt(OffsetDateTime.parse("2020-02-07T23:59:59Z"))
                .unstructuredRemittanceInformation("Invoice 29582")
                .build()

        val body = params._body()

        assertThat(body.accountNumberId()).isEqualTo("account_number_v18nkfqm6afpsrvy82b2")
        assertThat(body.amount()).isEqualTo(100L)
        assertThat(body.debtor())
            .isEqualTo(
                RealTimePaymentsRequestsForPaymentCreateParams.Debtor.builder()
                    .address(
                        RealTimePaymentsRequestsForPaymentCreateParams.Debtor.Address.builder()
                            .country("US")
                            .build()
                    )
                    .name("Ian Crease")
                    .build()
            )
        assertThat(body.debtorAccountNumber()).isEqualTo("987654321")
        assertThat(body.debtorRoutingNumber()).isEqualTo("101050001")
        assertThat(body.expiresAt()).isEqualTo(OffsetDateTime.parse("2020-02-14T23:59:59Z"))
        assertThat(body.requestedExecutionAt())
            .isEqualTo(OffsetDateTime.parse("2020-02-07T23:59:59Z"))
        assertThat(body.unstructuredRemittanceInformation()).isEqualTo("Invoice 29582")
    }
}
