// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import com.increase.api.models.filelinks.FileLinkCreateParams
import com.increase.api.models.filelinks.FileLinkListParams
import com.increase.api.models.filelinks.FileLinkRetrieveParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class FileLinkServiceAsyncTest {

    @Test
    fun create() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val fileLinkServiceAsync = client.fileLinks()

        val fileLinkFuture =
            fileLinkServiceAsync.create(
                FileLinkCreateParams.builder()
                    .fileId("file_makxrc67oh9l6sg7w9yc")
                    .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )

        val fileLink = fileLinkFuture.get()
        fileLink.validate()
    }

    @Test
    fun retrieve() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val fileLinkServiceAsync = client.fileLinks()

        val fileLinkFuture =
            fileLinkServiceAsync.retrieve(
                FileLinkRetrieveParams.builder()
                    .fileLinkId("file_link_roapsuicj7kp1lzyus04")
                    .build()
            )

        val fileLink = fileLinkFuture.get()
        fileLink.validate()
    }

    @Test
    fun list() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val fileLinkServiceAsync = client.fileLinks()

        val pageFuture =
            fileLinkServiceAsync.list(FileLinkListParams.builder().fileId("file_id").build())

        val page = pageFuture.get()
        page.response().validate()
    }
}
