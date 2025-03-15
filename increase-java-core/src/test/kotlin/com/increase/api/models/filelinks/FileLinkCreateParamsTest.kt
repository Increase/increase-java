// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.filelinks

import java.time.OffsetDateTime
import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class FileLinkCreateParamsTest {

    @Test
    fun create() {
        FileLinkCreateParams.builder()
            .fileId("file_makxrc67oh9l6sg7w9yc")
            .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .build()
    }

    @Test
    fun body() {
        val params =
            FileLinkCreateParams.builder()
                .fileId("file_makxrc67oh9l6sg7w9yc")
                .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.fileId()).isEqualTo("file_makxrc67oh9l6sg7w9yc")
        assertThat(body.expiresAt()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = FileLinkCreateParams.builder().fileId("file_makxrc67oh9l6sg7w9yc").build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.fileId()).isEqualTo("file_makxrc67oh9l6sg7w9yc")
    }
}
