package com.increase.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ProgramTest {

    @Test
    fun createProgram() {
        val program =
            Program.builder()
                .name("string")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .id("string")
                .type(Program.Type.PROGRAM)
                .build()
        assertThat(program).isNotNull
        assertThat(program.name()).isEqualTo("string")
        assertThat(program.createdAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(program.updatedAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(program.id()).isEqualTo("string")
        assertThat(program.type()).isEqualTo(Program.Type.PROGRAM)
    }
}
