// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ProgramTest {

    @Test
    fun createProgram() {
        val program =
            Program.builder()
                .id("string")
                .billingAccountId("string")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .defaultDigitalCardProfileId("string")
                .interestRate("string")
                .name("string")
                .type(Program.Type.PROGRAM)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()
        assertThat(program).isNotNull
        assertThat(program.id()).isEqualTo("string")
        assertThat(program.billingAccountId()).contains("string")
        assertThat(program.createdAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(program.defaultDigitalCardProfileId()).contains("string")
        assertThat(program.interestRate()).isEqualTo("string")
        assertThat(program.name()).isEqualTo("string")
        assertThat(program.type()).isEqualTo(Program.Type.PROGRAM)
        assertThat(program.updatedAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }
}
