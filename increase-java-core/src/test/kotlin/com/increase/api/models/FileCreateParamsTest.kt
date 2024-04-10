// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.increase.api.core.ContentTypes
import com.increase.api.core.MultipartFormValue
import com.increase.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class FileCreateParamsTest {

    @Test
    fun createFileCreateParams() {
        FileCreateParams.builder()
            .file("some content".toByteArray())
            .purpose(FileCreateParams.Purpose.CHECK_IMAGE_FRONT)
            .description("x")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            FileCreateParams.builder()
                .file("some content".toByteArray())
                .purpose(FileCreateParams.Purpose.CHECK_IMAGE_FRONT)
                .description("x")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body)
            .containsExactly(
                MultipartFormValue.fromByteArray(
                    "file",
                    "some content".toByteArray(),
                    ContentTypes.DefaultBinary
                ),
                MultipartFormValue.fromEnum(
                    "purpose",
                    FileCreateParams.Purpose.CHECK_IMAGE_FRONT,
                    ContentTypes.DefaultText
                ),
                MultipartFormValue.fromString("description", "x", ContentTypes.DefaultText),
            )
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            FileCreateParams.builder()
                .file("some content".toByteArray())
                .purpose(FileCreateParams.Purpose.CHECK_IMAGE_FRONT)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body)
            .containsExactly(
                MultipartFormValue.fromByteArray(
                    "file",
                    "some content".toByteArray(),
                    ContentTypes.DefaultBinary
                ),
                MultipartFormValue.fromEnum(
                    "purpose",
                    FileCreateParams.Purpose.CHECK_IMAGE_FRONT,
                    ContentTypes.DefaultText
                ),
                null,
            )
    }
}
