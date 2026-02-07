// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.swifttransfers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.increase.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SwiftTransferTest {

    @Test
    fun create() {
        val swiftTransfer =
            SwiftTransfer.builder()
                .id("swift_transfer_29h21xkng03788zwd3fh")
                .accountId("account_in71c4amph0vgo2qllky")
                .accountNumber("987654321")
                .amount(100L)
                .bankIdentificationCode("ECBFDEFFTPP")
                .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                .createdBy(
                    SwiftTransfer.CreatedBy.builder()
                        .category(SwiftTransfer.CreatedBy.Category.USER)
                        .apiKey(
                            SwiftTransfer.CreatedBy.ApiKey.builder()
                                .description("description")
                                .build()
                        )
                        .oauthApplication(
                            SwiftTransfer.CreatedBy.OAuthApplication.builder().name("name").build()
                        )
                        .user(
                            SwiftTransfer.CreatedBy.User.builder().email("user@example.com").build()
                        )
                        .build()
                )
                .creditorAddress(
                    SwiftTransfer.CreditorAddress.builder()
                        .city("Frankfurt")
                        .country("DE")
                        .line1("Sonnemannstrasse 20")
                        .line2(null)
                        .postalCode("60314")
                        .state(null)
                        .build()
                )
                .creditorName("Ian Crease")
                .debtorAddress(
                    SwiftTransfer.DebtorAddress.builder()
                        .city("New York")
                        .country("US")
                        .line1("33 Liberty Street")
                        .line2(null)
                        .postalCode("10045")
                        .state(null)
                        .build()
                )
                .debtorName("National Phonograph Company")
                .idempotencyKey(null)
                .instructedAmount(100L)
                .instructedCurrency(SwiftTransfer.InstructedCurrency.USD)
                .pendingTransactionId("pending_transaction_k1sfetcau2qbvjbzgju4")
                .routingNumber(null)
                .sourceAccountNumberId("account_number_v18nkfqm6afpsrvy82b2")
                .status(SwiftTransfer.Status.INITIATED)
                .transactionId("transaction_uyrp7fld2ium70oa7oi")
                .type(SwiftTransfer.Type.SWIFT_TRANSFER)
                .uniqueEndToEndTransactionReference("9a21e10a-7600-4a24-8ff3-2cbc5943c27a")
                .unstructuredRemittanceInformation("Remittance information")
                .build()

        assertThat(swiftTransfer.id()).isEqualTo("swift_transfer_29h21xkng03788zwd3fh")
        assertThat(swiftTransfer.accountId()).isEqualTo("account_in71c4amph0vgo2qllky")
        assertThat(swiftTransfer.accountNumber()).isEqualTo("987654321")
        assertThat(swiftTransfer.amount()).isEqualTo(100L)
        assertThat(swiftTransfer.bankIdentificationCode()).isEqualTo("ECBFDEFFTPP")
        assertThat(swiftTransfer.createdAt())
            .isEqualTo(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
        assertThat(swiftTransfer.createdBy())
            .isEqualTo(
                SwiftTransfer.CreatedBy.builder()
                    .category(SwiftTransfer.CreatedBy.Category.USER)
                    .apiKey(
                        SwiftTransfer.CreatedBy.ApiKey.builder().description("description").build()
                    )
                    .oauthApplication(
                        SwiftTransfer.CreatedBy.OAuthApplication.builder().name("name").build()
                    )
                    .user(SwiftTransfer.CreatedBy.User.builder().email("user@example.com").build())
                    .build()
            )
        assertThat(swiftTransfer.creditorAddress())
            .isEqualTo(
                SwiftTransfer.CreditorAddress.builder()
                    .city("Frankfurt")
                    .country("DE")
                    .line1("Sonnemannstrasse 20")
                    .line2(null)
                    .postalCode("60314")
                    .state(null)
                    .build()
            )
        assertThat(swiftTransfer.creditorName()).isEqualTo("Ian Crease")
        assertThat(swiftTransfer.debtorAddress())
            .isEqualTo(
                SwiftTransfer.DebtorAddress.builder()
                    .city("New York")
                    .country("US")
                    .line1("33 Liberty Street")
                    .line2(null)
                    .postalCode("10045")
                    .state(null)
                    .build()
            )
        assertThat(swiftTransfer.debtorName()).isEqualTo("National Phonograph Company")
        assertThat(swiftTransfer.idempotencyKey()).isEmpty
        assertThat(swiftTransfer.instructedAmount()).isEqualTo(100L)
        assertThat(swiftTransfer.instructedCurrency())
            .isEqualTo(SwiftTransfer.InstructedCurrency.USD)
        assertThat(swiftTransfer.pendingTransactionId())
            .contains("pending_transaction_k1sfetcau2qbvjbzgju4")
        assertThat(swiftTransfer.routingNumber()).isEmpty
        assertThat(swiftTransfer.sourceAccountNumberId())
            .isEqualTo("account_number_v18nkfqm6afpsrvy82b2")
        assertThat(swiftTransfer.status()).isEqualTo(SwiftTransfer.Status.INITIATED)
        assertThat(swiftTransfer.transactionId()).contains("transaction_uyrp7fld2ium70oa7oi")
        assertThat(swiftTransfer.type()).isEqualTo(SwiftTransfer.Type.SWIFT_TRANSFER)
        assertThat(swiftTransfer.uniqueEndToEndTransactionReference())
            .isEqualTo("9a21e10a-7600-4a24-8ff3-2cbc5943c27a")
        assertThat(swiftTransfer.unstructuredRemittanceInformation())
            .isEqualTo("Remittance information")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val swiftTransfer =
            SwiftTransfer.builder()
                .id("swift_transfer_29h21xkng03788zwd3fh")
                .accountId("account_in71c4amph0vgo2qllky")
                .accountNumber("987654321")
                .amount(100L)
                .bankIdentificationCode("ECBFDEFFTPP")
                .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                .createdBy(
                    SwiftTransfer.CreatedBy.builder()
                        .category(SwiftTransfer.CreatedBy.Category.USER)
                        .apiKey(
                            SwiftTransfer.CreatedBy.ApiKey.builder()
                                .description("description")
                                .build()
                        )
                        .oauthApplication(
                            SwiftTransfer.CreatedBy.OAuthApplication.builder().name("name").build()
                        )
                        .user(
                            SwiftTransfer.CreatedBy.User.builder().email("user@example.com").build()
                        )
                        .build()
                )
                .creditorAddress(
                    SwiftTransfer.CreditorAddress.builder()
                        .city("Frankfurt")
                        .country("DE")
                        .line1("Sonnemannstrasse 20")
                        .line2(null)
                        .postalCode("60314")
                        .state(null)
                        .build()
                )
                .creditorName("Ian Crease")
                .debtorAddress(
                    SwiftTransfer.DebtorAddress.builder()
                        .city("New York")
                        .country("US")
                        .line1("33 Liberty Street")
                        .line2(null)
                        .postalCode("10045")
                        .state(null)
                        .build()
                )
                .debtorName("National Phonograph Company")
                .idempotencyKey(null)
                .instructedAmount(100L)
                .instructedCurrency(SwiftTransfer.InstructedCurrency.USD)
                .pendingTransactionId("pending_transaction_k1sfetcau2qbvjbzgju4")
                .routingNumber(null)
                .sourceAccountNumberId("account_number_v18nkfqm6afpsrvy82b2")
                .status(SwiftTransfer.Status.INITIATED)
                .transactionId("transaction_uyrp7fld2ium70oa7oi")
                .type(SwiftTransfer.Type.SWIFT_TRANSFER)
                .uniqueEndToEndTransactionReference("9a21e10a-7600-4a24-8ff3-2cbc5943c27a")
                .unstructuredRemittanceInformation("Remittance information")
                .build()

        val roundtrippedSwiftTransfer =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(swiftTransfer),
                jacksonTypeRef<SwiftTransfer>(),
            )

        assertThat(roundtrippedSwiftTransfer).isEqualTo(swiftTransfer)
    }
}
