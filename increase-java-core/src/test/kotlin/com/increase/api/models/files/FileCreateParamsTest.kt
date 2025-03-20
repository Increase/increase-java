// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.files

import com.increase.api.core.MultipartField
import java.io.InputStream
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FileCreateParamsTest {

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

        assertThat(body.filterValues { !it.value.isNull() })
            .usingRecursiveComparison()
            // TODO(AssertJ): Replace this and the `mapValues` below with:
            // https://github.com/assertj/assertj/issues/3165
            .withEqualsForType(
                { a, b -> a.readBytes() contentEquals b.readBytes() },
                InputStream::class.java,
            )
            .isEqualTo(
                mapOf(
                        "file" to MultipartField.of("some content".toByteArray()),
                        "purpose" to MultipartField.of(FileCreateParams.Purpose.CHECK_IMAGE_FRONT),
                        "description" to MultipartField.of("x"),
                    )
                    .mapValues { (_, field) ->
                        field.map { (it as? ByteArray)?.inputStream() ?: it }
                    }
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

        assertThat(body.filterValues { !it.value.isNull() })
            .usingRecursiveComparison()
            // TODO(AssertJ): Replace this and the `mapValues` below with:
            // https://github.com/assertj/assertj/issues/3165
            .withEqualsForType(
                { a, b -> a.readBytes() contentEquals b.readBytes() },
                InputStream::class.java,
            )
            .isEqualTo(
                mapOf(
                        "file" to MultipartField.of("some content".toByteArray()),
                        "purpose" to MultipartField.of(FileCreateParams.Purpose.CHECK_IMAGE_FRONT),
                    )
                    .mapValues { (_, field) ->
                        field.map { (it as? ByteArray)?.inputStream() ?: it }
                    }
            )
    }
}
