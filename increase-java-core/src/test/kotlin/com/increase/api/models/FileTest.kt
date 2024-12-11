// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class FileTest {

    @Test
    fun createFile() {
        val file =
            File.builder()
                .id("file_makxrc67oh9l6sg7w9yc")
                .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                .description("2022-05 statement for checking account")
                .direction(File.Direction.TO_INCREASE)
                .downloadUrl("https://api.increase.com/files/file_makxrc67oh9l6sg7w9yc/download")
                .filename("statement.pdf")
                .mimeType("application/pdf")
                .purpose(File.Purpose.CHECK_IMAGE_FRONT)
                .type(File.Type.FILE)
                .build()
        assertThat(file).isNotNull
        assertThat(file.id()).isEqualTo("file_makxrc67oh9l6sg7w9yc")
        assertThat(file.createdAt()).isEqualTo(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
        assertThat(file.description()).contains("2022-05 statement for checking account")
        assertThat(file.direction()).isEqualTo(File.Direction.TO_INCREASE)
        assertThat(file.downloadUrl())
            .contains("https://api.increase.com/files/file_makxrc67oh9l6sg7w9yc/download")
        assertThat(file.filename()).contains("statement.pdf")
        assertThat(file.mimeType()).isEqualTo("application/pdf")
        assertThat(file.purpose()).isEqualTo(File.Purpose.CHECK_IMAGE_FRONT)
        assertThat(file.type()).isEqualTo(File.Type.FILE)
    }
}
