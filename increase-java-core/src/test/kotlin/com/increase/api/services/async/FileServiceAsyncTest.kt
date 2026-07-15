// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.get
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import com.increase.api.models.files.FileCreateParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.junit.jupiter.api.parallel.ResourceLock

@ExtendWith(TestServerExtension::class)
@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
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
                    .file("Example data".byteInputStream())
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

        val pageFuture = fileServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Test
    fun contents(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .apiKey("My API Key")
                .build()
        val fileServiceAsync = client.files()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val responseFuture = fileServiceAsync.contents("file_makxrc67oh9l6sg7w9yc")

        val response = responseFuture.get()
        assertThat(response.body()).hasContent("abc")
    }
}
