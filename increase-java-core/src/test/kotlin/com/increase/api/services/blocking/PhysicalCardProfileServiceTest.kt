// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.*
import com.increase.api.models.PhysicalCardProfileListParams
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
                    .carrierImageFileId("string")
                    .contactPhone("x")
                    .description("x")
                    .frontImageFileId("string")
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
                PhysicalCardProfileRetrieveParams.builder().physicalCardProfileId("string").build()
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
        val physicalCardProfileList =
            physicalCardProfileService.list(PhysicalCardProfileListParams.builder().build())
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
                PhysicalCardProfileArchiveParams.builder().physicalCardProfileId("string").build()
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
                    .physicalCardProfileId("string")
                    .carrierImageFileId("string")
                    .contactPhone("x")
                    .description("x")
                    .frontImageFileId("string")
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
