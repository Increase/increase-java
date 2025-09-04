// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.physicalcardprofiles.PhysicalCardProfileCloneParams
import com.increase.api.models.physicalcardprofiles.PhysicalCardProfileCreateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PhysicalCardProfileServiceTest {

    @Test
    fun create() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val physicalCardProfileService = client.physicalCardProfiles()

        val physicalCardProfile =
            physicalCardProfileService.create(
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

        physicalCardProfile.validate()
    }

    @Test
    fun retrieve() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val physicalCardProfileService = client.physicalCardProfiles()

        val physicalCardProfile =
            physicalCardProfileService.retrieve("physical_card_profile_m534d5rn9qyy9ufqxoec")

        physicalCardProfile.validate()
    }

    @Test
    fun list() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val physicalCardProfileService = client.physicalCardProfiles()

        val page = physicalCardProfileService.list()

        page.response().validate()
    }

    @Test
    fun archive() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val physicalCardProfileService = client.physicalCardProfiles()

        val physicalCardProfile =
            physicalCardProfileService.archive("physical_card_profile_m534d5rn9qyy9ufqxoec")

        physicalCardProfile.validate()
    }

    @Test
    fun clone() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val physicalCardProfileService = client.physicalCardProfiles()

        val physicalCardProfile =
            physicalCardProfileService.clone(
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

        physicalCardProfile.validate()
    }
}
