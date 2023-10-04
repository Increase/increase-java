// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.increase.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class FileCreateParamsTest {

    @Test
    fun createFileCreateParams() {
        FileCreateParams.builder()
            .file("file.txt")
            .purpose(FileCreateParams.Purpose.CHECK_IMAGE_FRONT)
            .description("x")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            FileCreateParams.builder()
                .file("file.txt")
                .purpose(FileCreateParams.Purpose.CHECK_IMAGE_FRONT)
                .description("x")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.file()).isEqualTo("file.txt")
        assertThat(body.purpose()).isEqualTo(FileCreateParams.Purpose.CHECK_IMAGE_FRONT)
        assertThat(body.description()).isEqualTo("x")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            FileCreateParams.builder()
                .file("file.txt")
                .purpose(FileCreateParams.Purpose.CHECK_IMAGE_FRONT)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.file()).isEqualTo("file.txt")
        assertThat(body.purpose()).isEqualTo(FileCreateParams.Purpose.CHECK_IMAGE_FRONT)
    }
}
