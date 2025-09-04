// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import com.increase.api.models.physicalcardprofiles.PhysicalCardProfileCloneParams
import com.increase.api.models.physicalcardprofiles.PhysicalCardProfileCreateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PhysicalCardProfileServiceAsyncTest {

    @Test
    fun create() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val physicalCardProfileServiceAsync = client.physicalCardProfiles()

        val physicalCardProfileFuture =
            physicalCardProfileServiceAsync.create(
                PhysicalCardProfileCreateParams.builder()
                    .carrierImageFileId("file_h6v7mtipe119os47ehlu")
                    .contactPhone("+16505046304")
                    .description("My Card Profile")
                    .frontImageFileId("file_o6aex13wm1jcc36sgcj1")
                    .programId("program_i2v2os4mwza1oetokh9i")
                    .cardStockReference("x")
                    .carrierStockReference("x")
                    .frontText(
                        PhysicalCardProfileCreateParams.FrontText.builder()
                            .line1("x")
                            .line2("x")
                            .build()
                    )
                    .build()
            )

        val physicalCardProfile = physicalCardProfileFuture.get()
        physicalCardProfile.validate()
    }

    @Test
    fun retrieve() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val physicalCardProfileServiceAsync = client.physicalCardProfiles()

        val physicalCardProfileFuture =
            physicalCardProfileServiceAsync.retrieve("physical_card_profile_m534d5rn9qyy9ufqxoec")

        val physicalCardProfile = physicalCardProfileFuture.get()
        physicalCardProfile.validate()
    }

    @Test
    fun list() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val physicalCardProfileServiceAsync = client.physicalCardProfiles()

        val pageFuture = physicalCardProfileServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Test
    fun archive() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val physicalCardProfileServiceAsync = client.physicalCardProfiles()

        val physicalCardProfileFuture =
            physicalCardProfileServiceAsync.archive("physical_card_profile_m534d5rn9qyy9ufqxoec")

        val physicalCardProfile = physicalCardProfileFuture.get()
        physicalCardProfile.validate()
    }

    @Test
    fun clone() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val physicalCardProfileServiceAsync = client.physicalCardProfiles()

        val physicalCardProfileFuture =
            physicalCardProfileServiceAsync.clone(
                PhysicalCardProfileCloneParams.builder()
                    .physicalCardProfileId("physical_card_profile_m534d5rn9qyy9ufqxoec")
                    .carrierImageFileId("carrier_image_file_id")
                    .contactPhone("x")
                    .description("x")
                    .frontImageFileId("file_o6aex13wm1jcc36sgcj1")
                    .frontText(
                        PhysicalCardProfileCloneParams.FrontText.builder()
                            .line1("x")
                            .line2("x")
                            .build()
                    )
                    .programId("program_id")
                    .build()
            )

        val physicalCardProfile = physicalCardProfileFuture.get()
        physicalCardProfile.validate()
    }
}
