// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CheckTransferCreateParamsTest {

    @Test
    fun createCheckTransferCreateParams() {
        CheckTransferCreateParams.builder()
            .accountId("account_id")
            .amount(1L)
            .sourceAccountNumberId("source_account_number_id")
            .fulfillmentMethod(CheckTransferCreateParams.FulfillmentMethod.PHYSICAL_CHECK)
            .physicalCheck(
                CheckTransferCreateParams.PhysicalCheck.builder()
                    .mailingAddress(
                        CheckTransferCreateParams.PhysicalCheck.MailingAddress.builder()
                            .city("x")
                            .line1("x")
                            .postalCode("x")
                            .state("x")
                            .line2("x")
                            .name("x")
                            .build()
                    )
                    .memo("x")
                    .recipientName("x")
                    .note("x")
                    .returnAddress(
                        CheckTransferCreateParams.PhysicalCheck.ReturnAddress.builder()
                            .city("x")
                            .line1("x")
                            .name("x")
                            .postalCode("x")
                            .state("x")
                            .line2("x")
                            .build()
                    )
                    .signatureText("x")
                    .build()
            )
            .requireApproval(true)
            .thirdParty(CheckTransferCreateParams.ThirdParty.builder().checkNumber("x").build())
            .build()
    }

    @Test
    fun getBody() {
        val params =
            CheckTransferCreateParams.builder()
                .accountId("account_id")
                .amount(1L)
                .sourceAccountNumberId("source_account_number_id")
                .fulfillmentMethod(CheckTransferCreateParams.FulfillmentMethod.PHYSICAL_CHECK)
                .physicalCheck(
                    CheckTransferCreateParams.PhysicalCheck.builder()
                        .mailingAddress(
                            CheckTransferCreateParams.PhysicalCheck.MailingAddress.builder()
                                .city("x")
                                .line1("x")
                                .postalCode("x")
                                .state("x")
                                .line2("x")
                                .name("x")
                                .build()
                        )
                        .memo("x")
                        .recipientName("x")
                        .note("x")
                        .returnAddress(
                            CheckTransferCreateParams.PhysicalCheck.ReturnAddress.builder()
                                .city("x")
                                .line1("x")
                                .name("x")
                                .postalCode("x")
                                .state("x")
                                .line2("x")
                                .build()
                        )
                        .signatureText("x")
                        .build()
                )
                .requireApproval(true)
                .thirdParty(CheckTransferCreateParams.ThirdParty.builder().checkNumber("x").build())
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.accountId()).isEqualTo("account_id")
        assertThat(body.amount()).isEqualTo(1L)
        assertThat(body.sourceAccountNumberId()).isEqualTo("source_account_number_id")
        assertThat(body.fulfillmentMethod())
            .isEqualTo(CheckTransferCreateParams.FulfillmentMethod.PHYSICAL_CHECK)
        assertThat(body.physicalCheck())
            .isEqualTo(
                CheckTransferCreateParams.PhysicalCheck.builder()
                    .mailingAddress(
                        CheckTransferCreateParams.PhysicalCheck.MailingAddress.builder()
                            .city("x")
                            .line1("x")
                            .postalCode("x")
                            .state("x")
                            .line2("x")
                            .name("x")
                            .build()
                    )
                    .memo("x")
                    .recipientName("x")
                    .note("x")
                    .returnAddress(
                        CheckTransferCreateParams.PhysicalCheck.ReturnAddress.builder()
                            .city("x")
                            .line1("x")
                            .name("x")
                            .postalCode("x")
                            .state("x")
                            .line2("x")
                            .build()
                    )
                    .signatureText("x")
                    .build()
            )
        assertThat(body.requireApproval()).isEqualTo(true)
        assertThat(body.thirdParty())
            .isEqualTo(CheckTransferCreateParams.ThirdParty.builder().checkNumber("x").build())
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            CheckTransferCreateParams.builder()
                .accountId("account_id")
                .amount(1L)
                .sourceAccountNumberId("source_account_number_id")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.accountId()).isEqualTo("account_id")
        assertThat(body.amount()).isEqualTo(1L)
        assertThat(body.sourceAccountNumberId()).isEqualTo("source_account_number_id")
    }
}
