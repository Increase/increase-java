// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.digitalcardprofiles.DigitalCardProfileCloneParams
import com.increase.api.models.digitalcardprofiles.DigitalCardProfileCreateParams
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
                    .cardDescription("National Phonograph Card")
                    .description("My Card Profile")
                    .applePay(
                        DigitalCardProfileCreateParams.ApplePay.builder()
                            .addAssociatedApplicationIdentifier(
                                DigitalCardProfileCreateParams.ApplePay
                                    .AssociatedApplicationIdentifier
                                    .builder()
                                    .identifier(
                                        "210B9798AD.---aH0O-6L.8tjDQ-3.-K-h.8asJ.WN--u-kX-Q.l3VU-F.-i-5p54n-N"
                                    )
                                    .build()
                            )
                            .addAssociatedStoreIdentifier(
                                DigitalCardProfileCreateParams.ApplePay.AssociatedStoreIdentifier
                                    .builder()
                                    .identifier("26")
                                    .build()
                            )
                            .build()
                    )
                    .contactEmail("user@example.com")
                    .contactName("National Phonograph Company")
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
            digitalCardProfileService.retrieve("digital_card_profile_s3puplu90f04xhcwkiga")

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
            digitalCardProfileService.archive("digital_card_profile_s3puplu90f04xhcwkiga")

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
                    .applePay(
                        DigitalCardProfileCloneParams.ApplePay.builder()
                            .addAssociatedApplicationIdentifier(
                                DigitalCardProfileCloneParams.ApplePay
                                    .AssociatedApplicationIdentifier
                                    .builder()
                                    .identifier(
                                        "210B9798AD.---aH0O-6L.8tjDQ-3.-K-h.8asJ.WN--u-kX-Q.l3VU-F.-i-5p54n-N"
                                    )
                                    .build()
                            )
                            .addAssociatedStoreIdentifier(
                                DigitalCardProfileCloneParams.ApplePay.AssociatedStoreIdentifier
                                    .builder()
                                    .identifier("26")
                                    .build()
                            )
                            .build()
                    )
                    .backgroundImageFileId("file_1ai913suu1zfn1pdetru")
                    .cardDescription("x")
                    .contactEmail("dev@stainless.com")
                    .contactName("x")
                    .contactPhone("x")
                    .contactWebsite("contact_website")
                    .description("x")
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
