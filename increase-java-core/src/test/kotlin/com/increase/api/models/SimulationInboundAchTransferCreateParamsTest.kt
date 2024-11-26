// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.increase.api.models.*
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SimulationInboundAchTransferCreateParamsTest {

    @Test
    fun createSimulationInboundAchTransferCreateParams() {
        SimulationInboundAchTransferCreateParams.builder()
            .accountNumberId("account_number_id")
            .amount(0L)
            .companyDescriptiveDate("x")
            .companyDiscretionaryData("x")
            .companyEntryDescription("x")
            .companyId("x")
            .companyName("x")
            .receiverIdNumber("x")
            .receiverName("x")
            .resolveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .standardEntryClassCode(
                SimulationInboundAchTransferCreateParams.StandardEntryClassCode
                    .CORPORATE_CREDIT_OR_DEBIT
            )
            .build()
    }

    @Test
    fun getBody() {
        val params =
            SimulationInboundAchTransferCreateParams.builder()
                .accountNumberId("account_number_id")
                .amount(0L)
                .companyDescriptiveDate("x")
                .companyDiscretionaryData("x")
                .companyEntryDescription("x")
                .companyId("x")
                .companyName("x")
                .receiverIdNumber("x")
                .receiverName("x")
                .resolveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .standardEntryClassCode(
                    SimulationInboundAchTransferCreateParams.StandardEntryClassCode
                        .CORPORATE_CREDIT_OR_DEBIT
                )
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.accountNumberId()).isEqualTo("account_number_id")
        assertThat(body.amount()).isEqualTo(0L)
        assertThat(body.companyDescriptiveDate()).isEqualTo("x")
        assertThat(body.companyDiscretionaryData()).isEqualTo("x")
        assertThat(body.companyEntryDescription()).isEqualTo("x")
        assertThat(body.companyId()).isEqualTo("x")
        assertThat(body.companyName()).isEqualTo("x")
        assertThat(body.receiverIdNumber()).isEqualTo("x")
        assertThat(body.receiverName()).isEqualTo("x")
        assertThat(body.resolveAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.standardEntryClassCode())
            .isEqualTo(
                SimulationInboundAchTransferCreateParams.StandardEntryClassCode
                    .CORPORATE_CREDIT_OR_DEBIT
            )
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            SimulationInboundAchTransferCreateParams.builder()
                .accountNumberId("account_number_id")
                .amount(0L)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.accountNumberId()).isEqualTo("account_number_id")
        assertThat(body.amount()).isEqualTo(0L)
    }
}
