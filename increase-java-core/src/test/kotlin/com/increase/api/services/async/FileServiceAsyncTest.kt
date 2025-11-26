// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import com.increase.api.models.files.FileCreateParams
import com.increase.api.models.files.FileListParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class FileServiceAsyncTest {

    @Test
    fun create() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val fileServiceAsync = client.files()

        val fileFuture =
            fileServiceAsync.create(
                FileCreateParams.builder()
                    .file("some content".byteInputStream())
                    .purpose(FileCreateParams.Purpose.CHECK_IMAGE_FRONT)
                    .description("x")
                    .build()
            )

        val file = fileFuture.get()
        file.validate()
    }

    @Test
    fun retrieve() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val fileServiceAsync = client.files()

        val fileFuture = fileServiceAsync.retrieve("file_makxrc67oh9l6sg7w9yc")

        val file = fileFuture.get()
        file.validate()
    }

    @Test
    fun list() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val fileServiceAsync = client.files()

        val filesFuture =
            fileServiceAsync.list(
                FileListParams.builder()
                    .createdAt(
                        FileListParams.CreatedAt.builder()
                            .after(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .before(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .onOrAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .onOrBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .cursor("cursor")
                    .idempotencyKey("x")
                    .limit(1L)
                    .purpose(
                        FileListParams.Purpose.builder()
                            .addIn(FileListParams.Purpose.In.CARD_DISPUTE_ATTACHMENT)
                            .build()
                    )
                    .build()
            )

        val files = filesFuture.get()
        files.validate()
    }
}
