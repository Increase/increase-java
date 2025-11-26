// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.files

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.increase.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FileListPageResponseTest {

    @Test
    fun create() {
        val fileListPageResponse =
            FileListPageResponse.builder()
                .addData(
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
                )
                .nextCursor("v57w5d")
                .build()

        assertThat(fileListPageResponse.data())
            .containsExactly(
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
            )
        assertThat(fileListPageResponse.nextCursor()).contains("v57w5d")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val fileListPageResponse =
            FileListPageResponse.builder()
                .addData(
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
                )
                .nextCursor("v57w5d")
                .build()

        val roundtrippedFileListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(fileListPageResponse),
                jacksonTypeRef<FileListPageResponse>(),
            )

        assertThat(roundtrippedFileListPageResponse).isEqualTo(fileListPageResponse)
    }
}
