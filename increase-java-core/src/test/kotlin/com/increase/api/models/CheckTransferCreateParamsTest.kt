// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CheckTransferCreateParamsTest {

    @Test
    fun createCheckTransferCreateParams() {
        CheckTransferCreateParams.builder()
            .accountId("account_in71c4amph0vgo2qllky")
            .amount(1000L)
            .sourceAccountNumberId("account_number_v18nkfqm6afpsrvy82b2")
            .fulfillmentMethod(CheckTransferCreateParams.FulfillmentMethod.PHYSICAL_CHECK)
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
                            .build()
                    )
                    .memo("Check payment")
                    .recipientName("Ian Crease")
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
                    .signatureText("Ian Crease")
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
                .accountId("account_in71c4amph0vgo2qllky")
                .amount(1000L)
                .sourceAccountNumberId("account_number_v18nkfqm6afpsrvy82b2")
                .fulfillmentMethod(CheckTransferCreateParams.FulfillmentMethod.PHYSICAL_CHECK)
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
                                .build()
                        )
                        .memo("Check payment")
                        .recipientName("Ian Crease")
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
                        .signatureText("Ian Crease")
                        .build()
                )
                .requireApproval(true)
                .thirdParty(CheckTransferCreateParams.ThirdParty.builder().checkNumber("x").build())
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.accountId()).isEqualTo("account_in71c4amph0vgo2qllky")
        assertThat(body.amount()).isEqualTo(1000L)
        assertThat(body.sourceAccountNumberId()).isEqualTo("account_number_v18nkfqm6afpsrvy82b2")
        assertThat(body.fulfillmentMethod())
            .contains(CheckTransferCreateParams.FulfillmentMethod.PHYSICAL_CHECK)
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
                            .build()
                    )
                    .memo("Check payment")
                    .recipientName("Ian Crease")
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
                    .signatureText("Ian Crease")
                    .build()
            )
        assertThat(body.requireApproval()).contains(true)
        assertThat(body.thirdParty())
            .contains(CheckTransferCreateParams.ThirdParty.builder().checkNumber("x").build())
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            CheckTransferCreateParams.builder()
                .accountId("account_in71c4amph0vgo2qllky")
                .amount(1000L)
                .sourceAccountNumberId("account_number_v18nkfqm6afpsrvy82b2")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.accountId()).isEqualTo("account_in71c4amph0vgo2qllky")
        assertThat(body.amount()).isEqualTo(1000L)
        assertThat(body.sourceAccountNumberId()).isEqualTo("account_number_v18nkfqm6afpsrvy82b2")
    }
}
