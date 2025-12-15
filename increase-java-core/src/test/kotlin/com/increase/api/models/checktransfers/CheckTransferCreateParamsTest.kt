// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.checktransfers

import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CheckTransferCreateParamsTest {

    @Test
    fun create() {
        CheckTransferCreateParams.builder()
            .accountId("account_in71c4amph0vgo2qllky")
            .amount(1000L)
            .fulfillmentMethod(CheckTransferCreateParams.FulfillmentMethod.PHYSICAL_CHECK)
            .sourceAccountNumberId("account_number_v18nkfqm6afpsrvy82b2")
            .balanceCheck(CheckTransferCreateParams.BalanceCheck.FULL)
            .checkNumber("x")
            .physicalCheck(
                CheckTransferCreateParams.PhysicalCheck.builder()
                    .mailingAddress(
                        CheckTransferCreateParams.PhysicalCheck.MailingAddress.builder()
                            .city("New York")
                            .line1("33 Liberty Street")
                            .postalCode("10045")
                            .state("NY")
                            .line2("x")
                            .name("Ian Crease")
                            .phone("+16505046304")
                            .build()
                    )
                    .memo("Check payment")
                    .recipientName("Ian Crease")
                    .attachmentFileId("attachment_file_id")
                    .checkVoucherImageFileId("check_voucher_image_file_id")
                    .note("x")
                    .addPayer(
                        CheckTransferCreateParams.PhysicalCheck.Payer.builder()
                            .contents("x")
                            .build()
                    )
                    .returnAddress(
                        CheckTransferCreateParams.PhysicalCheck.ReturnAddress.builder()
                            .city("x")
                            .line1("x")
                            .name("x")
                            .postalCode("x")
                            .state("x")
                            .line2("x")
                            .phone("x")
                            .build()
                    )
                    .shippingMethod(
                        CheckTransferCreateParams.PhysicalCheck.ShippingMethod.USPS_FIRST_CLASS
                    )
                    .signatureText("Ian Crease")
                    .build()
            )
            .requireApproval(true)
            .thirdParty(CheckTransferCreateParams.ThirdParty.builder().recipientName("x").build())
            .validUntilDate(LocalDate.parse("2025-12-31"))
            .build()
    }

    @Test
    fun body() {
        val params =
            CheckTransferCreateParams.builder()
                .accountId("account_in71c4amph0vgo2qllky")
                .amount(1000L)
                .fulfillmentMethod(CheckTransferCreateParams.FulfillmentMethod.PHYSICAL_CHECK)
                .sourceAccountNumberId("account_number_v18nkfqm6afpsrvy82b2")
                .balanceCheck(CheckTransferCreateParams.BalanceCheck.FULL)
                .checkNumber("x")
                .physicalCheck(
                    CheckTransferCreateParams.PhysicalCheck.builder()
                        .mailingAddress(
                            CheckTransferCreateParams.PhysicalCheck.MailingAddress.builder()
                                .city("New York")
                                .line1("33 Liberty Street")
                                .postalCode("10045")
                                .state("NY")
                                .line2("x")
                                .name("Ian Crease")
                                .phone("+16505046304")
                                .build()
                        )
                        .memo("Check payment")
                        .recipientName("Ian Crease")
                        .attachmentFileId("attachment_file_id")
                        .checkVoucherImageFileId("check_voucher_image_file_id")
                        .note("x")
                        .addPayer(
                            CheckTransferCreateParams.PhysicalCheck.Payer.builder()
                                .contents("x")
                                .build()
                        )
                        .returnAddress(
                            CheckTransferCreateParams.PhysicalCheck.ReturnAddress.builder()
                                .city("x")
                                .line1("x")
                                .name("x")
                                .postalCode("x")
                                .state("x")
                                .line2("x")
                                .phone("x")
                                .build()
                        )
                        .shippingMethod(
                            CheckTransferCreateParams.PhysicalCheck.ShippingMethod.USPS_FIRST_CLASS
                        )
                        .signatureText("Ian Crease")
                        .build()
                )
                .requireApproval(true)
                .thirdParty(
                    CheckTransferCreateParams.ThirdParty.builder().recipientName("x").build()
                )
                .validUntilDate(LocalDate.parse("2025-12-31"))
                .build()

        val body = params._body()

        assertThat(body.accountId()).isEqualTo("account_in71c4amph0vgo2qllky")
        assertThat(body.amount()).isEqualTo(1000L)
        assertThat(body.fulfillmentMethod())
            .isEqualTo(CheckTransferCreateParams.FulfillmentMethod.PHYSICAL_CHECK)
        assertThat(body.sourceAccountNumberId()).isEqualTo("account_number_v18nkfqm6afpsrvy82b2")
        assertThat(body.balanceCheck()).contains(CheckTransferCreateParams.BalanceCheck.FULL)
        assertThat(body.checkNumber()).contains("x")
        assertThat(body.physicalCheck())
            .contains(
                CheckTransferCreateParams.PhysicalCheck.builder()
                    .mailingAddress(
                        CheckTransferCreateParams.PhysicalCheck.MailingAddress.builder()
                            .city("New York")
                            .line1("33 Liberty Street")
                            .postalCode("10045")
                            .state("NY")
                            .line2("x")
                            .name("Ian Crease")
                            .phone("+16505046304")
                            .build()
                    )
                    .memo("Check payment")
                    .recipientName("Ian Crease")
                    .attachmentFileId("attachment_file_id")
                    .checkVoucherImageFileId("check_voucher_image_file_id")
                    .note("x")
                    .addPayer(
                        CheckTransferCreateParams.PhysicalCheck.Payer.builder()
                            .contents("x")
                            .build()
                    )
                    .returnAddress(
                        CheckTransferCreateParams.PhysicalCheck.ReturnAddress.builder()
                            .city("x")
                            .line1("x")
                            .name("x")
                            .postalCode("x")
                            .state("x")
                            .line2("x")
                            .phone("x")
                            .build()
                    )
                    .shippingMethod(
                        CheckTransferCreateParams.PhysicalCheck.ShippingMethod.USPS_FIRST_CLASS
                    )
                    .signatureText("Ian Crease")
                    .build()
            )
        assertThat(body.requireApproval()).contains(true)
        assertThat(body.thirdParty())
            .contains(CheckTransferCreateParams.ThirdParty.builder().recipientName("x").build())
        assertThat(body.validUntilDate()).contains(LocalDate.parse("2025-12-31"))
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            CheckTransferCreateParams.builder()
                .accountId("account_in71c4amph0vgo2qllky")
                .amount(1000L)
                .fulfillmentMethod(CheckTransferCreateParams.FulfillmentMethod.PHYSICAL_CHECK)
                .sourceAccountNumberId("account_number_v18nkfqm6afpsrvy82b2")
                .build()

        val body = params._body()

        assertThat(body.accountId()).isEqualTo("account_in71c4amph0vgo2qllky")
        assertThat(body.amount()).isEqualTo(1000L)
        assertThat(body.fulfillmentMethod())
            .isEqualTo(CheckTransferCreateParams.FulfillmentMethod.PHYSICAL_CHECK)
        assertThat(body.sourceAccountNumberId()).isEqualTo("account_number_v18nkfqm6afpsrvy82b2")
    }
}
