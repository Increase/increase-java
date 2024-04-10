// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.*
import com.increase.api.models.FileListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class FileServiceTest {

    @Disabled("multipart/form-data not yet supported")
    @Test
    fun callCreate() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val fileService = client.files()
        val file =
            fileService.create(
                FileCreateParams.builder()
                    .file("some content".toByteArray())
                    .purpose(FileCreateParams.Purpose.CHECK_IMAGE_FRONT)
                    .description("x")
                    .build()
            )
        println(file)
        file.validate()
    }

    @Test
    fun callRetrieve() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val fileService = client.files()
        val file = fileService.retrieve(FileRetrieveParams.builder().fileId("string").build())
        println(file)
        file.validate()
    }

    @Test
    fun callList() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val fileService = client.files()
        val fileList = fileService.list(FileListParams.builder().build())
        println(fileList)
        fileList.data().forEach { it.validate() }
    }
}
