// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.files

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.increase.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FileTest {

    @Test
    fun create() {
        val file =
            File.builder()
                .id("file_makxrc67oh9l6sg7w9yc")
                .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                .description("2022-05 statement for checking account")
                .direction(File.Direction.FROM_INCREASE)
                .filename("statement.pdf")
                .idempotencyKey(null)
                .mimeType("application/pdf")
                .purpose(File.Purpose.INCREASE_STATEMENT)
                .type(File.Type.FILE)
                .build()

        assertThat(file.id()).isEqualTo("file_makxrc67oh9l6sg7w9yc")
        assertThat(file.createdAt()).isEqualTo(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
        assertThat(file.description()).contains("2022-05 statement for checking account")
        assertThat(file.direction()).isEqualTo(File.Direction.FROM_INCREASE)
        assertThat(file.filename()).contains("statement.pdf")
        assertThat(file.idempotencyKey()).isEmpty
        assertThat(file.mimeType()).isEqualTo("application/pdf")
        assertThat(file.purpose()).isEqualTo(File.Purpose.INCREASE_STATEMENT)
        assertThat(file.type()).isEqualTo(File.Type.FILE)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val file =
            File.builder()
                .id("file_makxrc67oh9l6sg7w9yc")
                .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                .description("2022-05 statement for checking account")
                .direction(File.Direction.FROM_INCREASE)
                .filename("statement.pdf")
                .idempotencyKey(null)
                .mimeType("application/pdf")
                .purpose(File.Purpose.INCREASE_STATEMENT)
                .type(File.Type.FILE)
                .build()

        val roundtrippedFile =
            jsonMapper.readValue(jsonMapper.writeValueAsString(file), jacksonTypeRef<File>())

        assertThat(roundtrippedFile).isEqualTo(file)
    }
}
