// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.increase.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CheckTransferCreateParamsTest {

    @Test
    fun createCheckTransferCreateParams() {
        CheckTransferCreateParams.builder()
            .accountId("string")
            .amount(123L)
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
                    .build()
            )
            .requireApproval(true)
            .sourceAccountNumberId("string")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            CheckTransferCreateParams.builder()
                .accountId("string")
                .amount(123L)
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
                        .build()
                )
                .requireApproval(true)
                .sourceAccountNumberId("string")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.accountId()).isEqualTo("string")
        assertThat(body.amount()).isEqualTo(123L)
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
                    .build()
            )
        assertThat(body.requireApproval()).isEqualTo(true)
        assertThat(body.sourceAccountNumberId()).isEqualTo("string")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = CheckTransferCreateParams.builder().accountId("string").amount(123L).build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.accountId()).isEqualTo("string")
        assertThat(body.amount()).isEqualTo(123L)
    }
}
