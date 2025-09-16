// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.wiretransfers

import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WireTransferCreateParamsTest {

    @Test
    fun create() {
        WireTransferCreateParams.builder()
            .accountId("account_in71c4amph0vgo2qllky")
            .amount(100L)
            .beneficiaryName("Ian Crease")
            .accountNumber("987654321")
            .beneficiaryAddressLine1("33 Liberty Street")
            .beneficiaryAddressLine2("New York")
            .beneficiaryAddressLine3("NY 10045")
            .externalAccountId("external_account_id")
            .inboundWireDrawdownRequestId("inbound_wire_drawdown_request_id")
            .originatorAddressLine1("x")
            .originatorAddressLine2("x")
            .originatorAddressLine3("x")
            .originatorName("x")
            .remittance(
                WireTransferCreateParams.Remittance.builder()
                    .category(WireTransferCreateParams.Remittance.Category.UNSTRUCTURED)
                    .tax(
                        WireTransferCreateParams.Remittance.Tax.builder()
                            .date(LocalDate.parse("2019-12-27"))
                            .identificationNumber("xxxxxxxxx")
                            .typeCode("xxxxx")
                            .build()
                    )
                    .unstructured(
                        WireTransferCreateParams.Remittance.Unstructured.builder()
                            .message("New account transfer")
                            .build()
                    )
                    .build()
            )
            .requireApproval(true)
            .routingNumber("101050001")
            .sourceAccountNumberId("source_account_number_id")
            .build()
    }

    @Test
    fun body() {
        val params =
            WireTransferCreateParams.builder()
                .accountId("account_in71c4amph0vgo2qllky")
                .amount(100L)
                .beneficiaryName("Ian Crease")
                .accountNumber("987654321")
                .beneficiaryAddressLine1("33 Liberty Street")
                .beneficiaryAddressLine2("New York")
                .beneficiaryAddressLine3("NY 10045")
                .externalAccountId("external_account_id")
                .inboundWireDrawdownRequestId("inbound_wire_drawdown_request_id")
                .originatorAddressLine1("x")
                .originatorAddressLine2("x")
                .originatorAddressLine3("x")
                .originatorName("x")
                .remittance(
                    WireTransferCreateParams.Remittance.builder()
                        .category(WireTransferCreateParams.Remittance.Category.UNSTRUCTURED)
                        .tax(
                            WireTransferCreateParams.Remittance.Tax.builder()
                                .date(LocalDate.parse("2019-12-27"))
                                .identificationNumber("xxxxxxxxx")
                                .typeCode("xxxxx")
                                .build()
                        )
                        .unstructured(
                            WireTransferCreateParams.Remittance.Unstructured.builder()
                                .message("New account transfer")
                                .build()
                        )
                        .build()
                )
                .requireApproval(true)
                .routingNumber("101050001")
                .sourceAccountNumberId("source_account_number_id")
                .build()

        val body = params._body()

        assertThat(body.accountId()).isEqualTo("account_in71c4amph0vgo2qllky")
        assertThat(body.amount()).isEqualTo(100L)
        assertThat(body.beneficiaryName()).isEqualTo("Ian Crease")
        assertThat(body.accountNumber()).contains("987654321")
        assertThat(body.beneficiaryAddressLine1()).contains("33 Liberty Street")
        assertThat(body.beneficiaryAddressLine2()).contains("New York")
        assertThat(body.beneficiaryAddressLine3()).contains("NY 10045")
        assertThat(body.externalAccountId()).contains("external_account_id")
        assertThat(body.inboundWireDrawdownRequestId()).contains("inbound_wire_drawdown_request_id")
        assertThat(body.originatorAddressLine1()).contains("x")
        assertThat(body.originatorAddressLine2()).contains("x")
        assertThat(body.originatorAddressLine3()).contains("x")
        assertThat(body.originatorName()).contains("x")
        assertThat(body.remittance())
            .contains(
                WireTransferCreateParams.Remittance.builder()
                    .category(WireTransferCreateParams.Remittance.Category.UNSTRUCTURED)
                    .tax(
                        WireTransferCreateParams.Remittance.Tax.builder()
                            .date(LocalDate.parse("2019-12-27"))
                            .identificationNumber("xxxxxxxxx")
                            .typeCode("xxxxx")
                            .build()
                    )
                    .unstructured(
                        WireTransferCreateParams.Remittance.Unstructured.builder()
                            .message("New account transfer")
                            .build()
                    )
                    .build()
            )
        assertThat(body.requireApproval()).contains(true)
        assertThat(body.routingNumber()).contains("101050001")
        assertThat(body.sourceAccountNumberId()).contains("source_account_number_id")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            WireTransferCreateParams.builder()
                .accountId("account_in71c4amph0vgo2qllky")
                .amount(100L)
                .beneficiaryName("Ian Crease")
                .build()

        val body = params._body()

        assertThat(body.accountId()).isEqualTo("account_in71c4amph0vgo2qllky")
        assertThat(body.amount()).isEqualTo(100L)
        assertThat(body.beneficiaryName()).isEqualTo("Ian Crease")
    }
}
