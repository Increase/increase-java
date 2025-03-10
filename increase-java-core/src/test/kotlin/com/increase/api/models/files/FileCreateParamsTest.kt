// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.files

import com.increase.api.core.MultipartField
import java.io.InputStream
import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class FileCreateParamsTest {

    @Test
    fun create() {
        FileCreateParams.builder()
            .file("some content".toByteArray())
            .purpose(FileCreateParams.Purpose.CHECK_IMAGE_FRONT)
            .description("x")
            .build()
    }

    @Test
    fun body() {
        val params =
            FileCreateParams.builder()
                .file("some content".toByteArray())
                .purpose(FileCreateParams.Purpose.CHECK_IMAGE_FRONT)
                .description("x")
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(
                body
                    .filterValues { !it.value.isNull() }
                    .mapValues { (_, field) ->
                        field.map { if (it is InputStream) it.readBytes() else it }
                    }
            )
            .isEqualTo(
                mapOf(
                    "file" to MultipartField.of("some content".toByteArray()),
                    "purpose" to MultipartField.of(FileCreateParams.Purpose.CHECK_IMAGE_FRONT),
                    "description" to MultipartField.of("x"),
                )
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            FileCreateParams.builder()
                .file("some content".toByteArray())
                .purpose(FileCreateParams.Purpose.CHECK_IMAGE_FRONT)
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(
                body
                    .filterValues { !it.value.isNull() }
                    .mapValues { (_, field) ->
                        field.map { if (it is InputStream) it.readBytes() else it }
                    }
            )
            .isEqualTo(
                mapOf(
                    "file" to MultipartField.of("some content".toByteArray()),
                    "purpose" to MultipartField.of(FileCreateParams.Purpose.CHECK_IMAGE_FRONT),
                )
            )
    }
}
