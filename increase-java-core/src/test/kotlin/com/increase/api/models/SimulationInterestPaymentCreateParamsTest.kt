// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SimulationInterestPaymentCreateParamsTest {

    @Test
    fun createSimulationInterestPaymentCreateParams() {
        SimulationInterestPaymentCreateParams.builder()
            .accountId("account_id")
            .amount(1L)
            .periodEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .periodStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .build()
    }

    @Test
    fun getBody() {
        val params =
            SimulationInterestPaymentCreateParams.builder()
                .accountId("account_id")
                .amount(1L)
                .periodEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .periodStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.accountId()).isEqualTo("account_id")
        assertThat(body.amount()).isEqualTo(1L)
        assertThat(body.periodEnd()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.periodStart()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            SimulationInterestPaymentCreateParams.builder()
                .accountId("account_id")
                .amount(1L)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.accountId()).isEqualTo("account_id")
        assertThat(body.amount()).isEqualTo(1L)
    }
}
