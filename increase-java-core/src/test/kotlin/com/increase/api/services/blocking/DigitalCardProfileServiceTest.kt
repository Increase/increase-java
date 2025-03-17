// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.digitalcardprofiles.DigitalCardProfileArchiveParams
import com.increase.api.models.digitalcardprofiles.DigitalCardProfileCloneParams
import com.increase.api.models.digitalcardprofiles.DigitalCardProfileCreateParams
import com.increase.api.models.digitalcardprofiles.DigitalCardProfileRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class DigitalCardProfileServiceTest {

    @Test
    fun create() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val digitalCardProfileService = client.digitalCardProfiles()

        val digitalCardProfile =
            digitalCardProfileService.create(
                DigitalCardProfileCreateParams.builder()
                    .appIconFileId("file_8zxqkwlh43wo144u8yec")
                    .backgroundImageFileId("file_1ai913suu1zfn1pdetru")
                    .cardDescription("MyBank Signature Card")
                    .description("My Card Profile")
                    .issuerName("MyBank")
                    .contactEmail("user@example.com")
                    .contactPhone("+18885551212")
                    .contactWebsite("https://example.com")
                    .textColor(
                        DigitalCardProfileCreateParams.TextColor.builder()
                            .blue(59L)
                            .green(43L)
                            .red(26L)
                            .build()
                    )
                    .build()
            )

        digitalCardProfile.validate()
    }

    @Test
    fun retrieve() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val digitalCardProfileService = client.digitalCardProfiles()

        val digitalCardProfile =
            digitalCardProfileService.retrieve(
                DigitalCardProfileRetrieveParams.builder()
                    .digitalCardProfileId("digital_card_profile_s3puplu90f04xhcwkiga")
                    .build()
            )

        digitalCardProfile.validate()
    }

    @Test
    fun list() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val digitalCardProfileService = client.digitalCardProfiles()

        val page = digitalCardProfileService.list()

        page.response().validate()
    }

    @Test
    fun archive() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val digitalCardProfileService = client.digitalCardProfiles()

        val digitalCardProfile =
            digitalCardProfileService.archive(
                DigitalCardProfileArchiveParams.builder()
                    .digitalCardProfileId("digital_card_profile_s3puplu90f04xhcwkiga")
                    .build()
            )

        digitalCardProfile.validate()
    }

    @Test
    fun clone() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val digitalCardProfileService = client.digitalCardProfiles()

        val digitalCardProfile =
            digitalCardProfileService.clone(
                DigitalCardProfileCloneParams.builder()
                    .digitalCardProfileId("digital_card_profile_s3puplu90f04xhcwkiga")
                    .appIconFileId("app_icon_file_id")
                    .backgroundImageFileId("file_1ai913suu1zfn1pdetru")
                    .cardDescription("x")
                    .contactEmail("x")
                    .contactPhone("x")
                    .contactWebsite("contact_website")
                    .description("x")
                    .issuerName("x")
                    .textColor(
                        DigitalCardProfileCloneParams.TextColor.builder()
                            .blue(0L)
                            .green(0L)
                            .red(0L)
                            .build()
                    )
                    .build()
            )

        digitalCardProfile.validate()
    }
}
