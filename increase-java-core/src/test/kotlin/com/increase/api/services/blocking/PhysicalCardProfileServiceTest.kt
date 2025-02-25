// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.PhysicalCardProfileArchiveParams
import com.increase.api.models.PhysicalCardProfileCloneParams
import com.increase.api.models.PhysicalCardProfileCreateParams
import com.increase.api.models.PhysicalCardProfileRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class PhysicalCardProfileServiceTest {

    @Test
    fun callCreate() {
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
                    .build()
            )
        println(physicalCardProfile)
        physicalCardProfile.validate()
    }

    @Test
    fun callRetrieve() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val physicalCardProfileService = client.physicalCardProfiles()
        val physicalCardProfile =
            physicalCardProfileService.retrieve(
                PhysicalCardProfileRetrieveParams.builder()
                    .physicalCardProfileId("physical_card_profile_m534d5rn9qyy9ufqxoec")
                    .build()
            )
        println(physicalCardProfile)
        physicalCardProfile.validate()
    }

    @Test
    fun callList() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val physicalCardProfileService = client.physicalCardProfiles()
        val physicalCardProfileList = physicalCardProfileService.list()
        println(physicalCardProfileList)
        physicalCardProfileList.data().forEach { it.validate() }
    }

    @Test
    fun callArchive() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val physicalCardProfileService = client.physicalCardProfiles()
        val physicalCardProfile =
            physicalCardProfileService.archive(
                PhysicalCardProfileArchiveParams.builder()
                    .physicalCardProfileId("physical_card_profile_m534d5rn9qyy9ufqxoec")
                    .build()
            )
        println(physicalCardProfile)
        physicalCardProfile.validate()
    }

    @Test
    fun callClone() {
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
                    .build()
            )
        println(physicalCardProfile)
        physicalCardProfile.validate()
    }
}
