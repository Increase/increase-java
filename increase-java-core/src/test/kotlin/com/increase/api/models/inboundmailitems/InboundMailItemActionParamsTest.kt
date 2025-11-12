// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.inboundmailitems

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InboundMailItemActionParamsTest {

    @Test
    fun create() {
        InboundMailItemActionParams.builder()
            .inboundMailItemId("inbound_mail_item_q6rrg7mmqpplx80zceev")
            .addCheck(
                InboundMailItemActionParams.Check.builder()
                    .action(InboundMailItemActionParams.Check.Action.DEPOSIT)
                    .account("account_in71c4amph0vgo2qllky")
                    .build()
            )
            .addCheck(
                InboundMailItemActionParams.Check.builder()
                    .action(InboundMailItemActionParams.Check.Action.IGNORE)
                    .account("account")
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            InboundMailItemActionParams.builder()
                .inboundMailItemId("inbound_mail_item_q6rrg7mmqpplx80zceev")
                .addCheck(
                    InboundMailItemActionParams.Check.builder()
                        .action(InboundMailItemActionParams.Check.Action.DEPOSIT)
                        .build()
                )
                .addCheck(
                    InboundMailItemActionParams.Check.builder()
                        .action(InboundMailItemActionParams.Check.Action.IGNORE)
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("inbound_mail_item_q6rrg7mmqpplx80zceev")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            InboundMailItemActionParams.builder()
                .inboundMailItemId("inbound_mail_item_q6rrg7mmqpplx80zceev")
                .addCheck(
                    InboundMailItemActionParams.Check.builder()
                        .action(InboundMailItemActionParams.Check.Action.DEPOSIT)
                        .account("account_in71c4amph0vgo2qllky")
                        .build()
                )
                .addCheck(
                    InboundMailItemActionParams.Check.builder()
                        .action(InboundMailItemActionParams.Check.Action.IGNORE)
                        .account("account")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.checks())
            .containsExactly(
                InboundMailItemActionParams.Check.builder()
                    .action(InboundMailItemActionParams.Check.Action.DEPOSIT)
                    .account("account_in71c4amph0vgo2qllky")
                    .build(),
                InboundMailItemActionParams.Check.builder()
                    .action(InboundMailItemActionParams.Check.Action.IGNORE)
                    .account("account")
                    .build(),
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            InboundMailItemActionParams.builder()
                .inboundMailItemId("inbound_mail_item_q6rrg7mmqpplx80zceev")
                .addCheck(
                    InboundMailItemActionParams.Check.builder()
                        .action(InboundMailItemActionParams.Check.Action.DEPOSIT)
                        .build()
                )
                .addCheck(
                    InboundMailItemActionParams.Check.builder()
                        .action(InboundMailItemActionParams.Check.Action.IGNORE)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.checks())
            .containsExactly(
                InboundMailItemActionParams.Check.builder()
                    .action(InboundMailItemActionParams.Check.Action.DEPOSIT)
                    .build(),
                InboundMailItemActionParams.Check.builder()
                    .action(InboundMailItemActionParams.Check.Action.IGNORE)
                    .build(),
            )
    }
}
