// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.files.FileCreateParams
import com.increase.api.models.files.FileListParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class FileServiceTest {

    @Test
    fun create() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val fileService = client.files()

        val file =
            fileService.create(
                FileCreateParams.builder()
                    .file("some content".byteInputStream())
                    .purpose(FileCreateParams.Purpose.CHECK_IMAGE_FRONT)
                    .description("x")
                    .build()
            )

        file.validate()
    }

    @Test
    fun retrieve() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val fileService = client.files()

        val file = fileService.retrieve("file_makxrc67oh9l6sg7w9yc")

        file.validate()
    }

    @Test
    fun list() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val fileService = client.files()

        val files =
            fileService.list(
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

        files.validate()
    }
}
