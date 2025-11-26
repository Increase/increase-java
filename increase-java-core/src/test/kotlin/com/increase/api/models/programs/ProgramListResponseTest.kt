// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.programs

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.increase.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProgramListResponseTest {

    @Test
    fun create() {
        val programListResponse =
            ProgramListResponse.builder()
                .addData(
                    Program.builder()
                        .id("program_i2v2os4mwza1oetokh9i")
                        .bank(Program.Bank.FIRST_INTERNET_BANK)
                        .billingAccountId(null)
                        .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .defaultDigitalCardProfileId(null)
                        .interestRate("0.01")
                        .name("Commercial Banking")
                        .type(Program.Type.PROGRAM)
                        .updatedAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .build()
                )
                .nextCursor("v57w5d")
                .build()

        assertThat(programListResponse.data())
            .containsExactly(
                Program.builder()
                    .id("program_i2v2os4mwza1oetokh9i")
                    .bank(Program.Bank.FIRST_INTERNET_BANK)
                    .billingAccountId(null)
                    .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                    .defaultDigitalCardProfileId(null)
                    .interestRate("0.01")
                    .name("Commercial Banking")
                    .type(Program.Type.PROGRAM)
                    .updatedAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                    .build()
            )
        assertThat(programListResponse.nextCursor()).contains("v57w5d")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val programListResponse =
            ProgramListResponse.builder()
                .addData(
                    Program.builder()
                        .id("program_i2v2os4mwza1oetokh9i")
                        .bank(Program.Bank.FIRST_INTERNET_BANK)
                        .billingAccountId(null)
                        .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .defaultDigitalCardProfileId(null)
                        .interestRate("0.01")
                        .name("Commercial Banking")
                        .type(Program.Type.PROGRAM)
                        .updatedAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .build()
                )
                .nextCursor("v57w5d")
                .build()

        val roundtrippedProgramListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(programListResponse),
                jacksonTypeRef<ProgramListResponse>(),
            )

        assertThat(roundtrippedProgramListResponse).isEqualTo(programListResponse)
    }
}
