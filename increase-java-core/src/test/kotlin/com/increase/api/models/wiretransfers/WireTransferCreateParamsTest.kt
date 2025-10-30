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
            .creditor(
                WireTransferCreateParams.Creditor.builder()
                    .name("Ian Crease")
                    .address(
                        WireTransferCreateParams.Creditor.Address.builder()
                            .unstructured(
                                WireTransferCreateParams.Creditor.Address.Unstructured.builder()
                                    .line1("33 Liberty Street")
                                    .line2("New York")
                                    .line3("NY 10045")
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )
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
            .accountNumber("987654321")
            .debtor(
                WireTransferCreateParams.Debtor.builder()
                    .name("x")
                    .address(
                        WireTransferCreateParams.Debtor.Address.builder()
                            .unstructured(
                                WireTransferCreateParams.Debtor.Address.Unstructured.builder()
                                    .line1("x")
                                    .line2("x")
                                    .line3("x")
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )
            .externalAccountId("external_account_id")
            .inboundWireDrawdownRequestId("inbound_wire_drawdown_request_id")
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
                .creditor(
                    WireTransferCreateParams.Creditor.builder()
                        .name("Ian Crease")
                        .address(
                            WireTransferCreateParams.Creditor.Address.builder()
                                .unstructured(
                                    WireTransferCreateParams.Creditor.Address.Unstructured.builder()
                                        .line1("33 Liberty Street")
                                        .line2("New York")
                                        .line3("NY 10045")
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
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
                .accountNumber("987654321")
                .debtor(
                    WireTransferCreateParams.Debtor.builder()
                        .name("x")
                        .address(
                            WireTransferCreateParams.Debtor.Address.builder()
                                .unstructured(
                                    WireTransferCreateParams.Debtor.Address.Unstructured.builder()
                                        .line1("x")
                                        .line2("x")
                                        .line3("x")
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
                .externalAccountId("external_account_id")
                .inboundWireDrawdownRequestId("inbound_wire_drawdown_request_id")
                .requireApproval(true)
                .routingNumber("101050001")
                .sourceAccountNumberId("source_account_number_id")
                .build()

        val body = params._body()

        assertThat(body.accountId()).isEqualTo("account_in71c4amph0vgo2qllky")
        assertThat(body.amount()).isEqualTo(100L)
        assertThat(body.creditor())
            .isEqualTo(
                WireTransferCreateParams.Creditor.builder()
                    .name("Ian Crease")
                    .address(
                        WireTransferCreateParams.Creditor.Address.builder()
                            .unstructured(
                                WireTransferCreateParams.Creditor.Address.Unstructured.builder()
                                    .line1("33 Liberty Street")
                                    .line2("New York")
                                    .line3("NY 10045")
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )
        assertThat(body.remittance())
            .isEqualTo(
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
        assertThat(body.accountNumber()).contains("987654321")
        assertThat(body.debtor())
            .contains(
                WireTransferCreateParams.Debtor.builder()
                    .name("x")
                    .address(
                        WireTransferCreateParams.Debtor.Address.builder()
                            .unstructured(
                                WireTransferCreateParams.Debtor.Address.Unstructured.builder()
                                    .line1("x")
                                    .line2("x")
                                    .line3("x")
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )
        assertThat(body.externalAccountId()).contains("external_account_id")
        assertThat(body.inboundWireDrawdownRequestId()).contains("inbound_wire_drawdown_request_id")
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
                .creditor(WireTransferCreateParams.Creditor.builder().name("Ian Crease").build())
                .remittance(
                    WireTransferCreateParams.Remittance.builder()
                        .category(WireTransferCreateParams.Remittance.Category.UNSTRUCTURED)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.accountId()).isEqualTo("account_in71c4amph0vgo2qllky")
        assertThat(body.amount()).isEqualTo(100L)
        assertThat(body.creditor())
            .isEqualTo(WireTransferCreateParams.Creditor.builder().name("Ian Crease").build())
        assertThat(body.remittance())
            .isEqualTo(
                WireTransferCreateParams.Remittance.builder()
                    .category(WireTransferCreateParams.Remittance.Category.UNSTRUCTURED)
                    .build()
            )
    }
}
