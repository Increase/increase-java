// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.programs

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.increase.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProgramTest {

    @Test
    fun create() {
        val program =
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

        assertThat(program.id()).isEqualTo("program_i2v2os4mwza1oetokh9i")
        assertThat(program.bank()).isEqualTo(Program.Bank.FIRST_INTERNET_BANK)
        assertThat(program.billingAccountId()).isEmpty
        assertThat(program.createdAt()).isEqualTo(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
        assertThat(program.defaultDigitalCardProfileId()).isEmpty
        assertThat(program.interestRate()).isEqualTo("0.01")
        assertThat(program.name()).isEqualTo("Commercial Banking")
        assertThat(program.type()).isEqualTo(Program.Type.PROGRAM)
        assertThat(program.updatedAt()).isEqualTo(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val program =
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

        val roundtrippedProgram =
            jsonMapper.readValue(jsonMapper.writeValueAsString(program), jacksonTypeRef<Program>())

        assertThat(roundtrippedProgram).isEqualTo(program)
    }
}
