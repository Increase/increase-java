// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class RealTimePaymentsRequestForPaymentCreateParamsTest {

    @Test
    fun create() {
        RealTimePaymentsRequestForPaymentCreateParams.builder()
            .amount(100L)
            .debtor(
                RealTimePaymentsRequestForPaymentCreateParams.Debtor.builder()
                    .address(
                        RealTimePaymentsRequestForPaymentCreateParams.Debtor.Address.builder()
                            .country("US")
                            .city("x")
                            .postCode("x")
                            .streetName("Liberty Street")
                            .build()
                    )
                    .name("Ian Crease")
                    .build()
            )
            .destinationAccountNumberId("account_number_v18nkfqm6afpsrvy82b2")
            .expiresAt(LocalDate.parse("2026-12-31"))
            .remittanceInformation("Invoice 29582")
            .sourceAccountNumber("987654321")
            .sourceRoutingNumber("101050001")
            .build()
    }

    @Test
    fun body() {
        val params =
            RealTimePaymentsRequestForPaymentCreateParams.builder()
                .amount(100L)
                .debtor(
                    RealTimePaymentsRequestForPaymentCreateParams.Debtor.builder()
                        .address(
                            RealTimePaymentsRequestForPaymentCreateParams.Debtor.Address.builder()
                                .country("US")
                                .city("x")
                                .postCode("x")
                                .streetName("Liberty Street")
                                .build()
                        )
                        .name("Ian Crease")
                        .build()
                )
                .destinationAccountNumberId("account_number_v18nkfqm6afpsrvy82b2")
                .expiresAt(LocalDate.parse("2026-12-31"))
                .remittanceInformation("Invoice 29582")
                .sourceAccountNumber("987654321")
                .sourceRoutingNumber("101050001")
                .build()
        val body = params._body()
        assertThat(body).isNotNull
        assertThat(body.amount()).isEqualTo(100L)
        assertThat(body.debtor())
            .isEqualTo(
                RealTimePaymentsRequestForPaymentCreateParams.Debtor.builder()
                    .address(
                        RealTimePaymentsRequestForPaymentCreateParams.Debtor.Address.builder()
                            .country("US")
                            .city("x")
                            .postCode("x")
                            .streetName("Liberty Street")
                            .build()
                    )
                    .name("Ian Crease")
                    .build()
            )
        assertThat(body.destinationAccountNumberId())
            .isEqualTo("account_number_v18nkfqm6afpsrvy82b2")
        assertThat(body.expiresAt()).isEqualTo(LocalDate.parse("2026-12-31"))
        assertThat(body.remittanceInformation()).isEqualTo("Invoice 29582")
        assertThat(body.sourceAccountNumber()).isEqualTo("987654321")
        assertThat(body.sourceRoutingNumber()).isEqualTo("101050001")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            RealTimePaymentsRequestForPaymentCreateParams.builder()
                .amount(100L)
                .debtor(
                    RealTimePaymentsRequestForPaymentCreateParams.Debtor.builder()
                        .address(
                            RealTimePaymentsRequestForPaymentCreateParams.Debtor.Address.builder()
                                .country("US")
                                .build()
                        )
                        .name("Ian Crease")
                        .build()
                )
                .destinationAccountNumberId("account_number_v18nkfqm6afpsrvy82b2")
                .expiresAt(LocalDate.parse("2026-12-31"))
                .remittanceInformation("Invoice 29582")
                .sourceAccountNumber("987654321")
                .sourceRoutingNumber("101050001")
                .build()
        val body = params._body()
        assertThat(body).isNotNull
        assertThat(body.amount()).isEqualTo(100L)
        assertThat(body.debtor())
            .isEqualTo(
                RealTimePaymentsRequestForPaymentCreateParams.Debtor.builder()
                    .address(
                        RealTimePaymentsRequestForPaymentCreateParams.Debtor.Address.builder()
                            .country("US")
                            .build()
                    )
                    .name("Ian Crease")
                    .build()
            )
        assertThat(body.destinationAccountNumberId())
            .isEqualTo("account_number_v18nkfqm6afpsrvy82b2")
        assertThat(body.expiresAt()).isEqualTo(LocalDate.parse("2026-12-31"))
        assertThat(body.remittanceInformation()).isEqualTo("Invoice 29582")
        assertThat(body.sourceAccountNumber()).isEqualTo("987654321")
        assertThat(body.sourceRoutingNumber()).isEqualTo("101050001")
    }
}
