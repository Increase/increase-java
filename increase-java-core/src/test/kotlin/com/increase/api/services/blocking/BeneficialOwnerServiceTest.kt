// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.beneficialowners.BeneficialOwnerCreateParams
import com.increase.api.models.beneficialowners.BeneficialOwnerListParams
import com.increase.api.models.beneficialowners.BeneficialOwnerUpdateParams
import java.time.LocalDate
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class BeneficialOwnerServiceTest {

    @Test
    fun create() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val beneficialOwnerService = client.beneficialOwners()

        val entityBeneficialOwner =
            beneficialOwnerService.create(
                BeneficialOwnerCreateParams.builder()
                    .entityId("entity_n8y8tnk2p9339ti393yi")
                    .individual(
                        BeneficialOwnerCreateParams.Individual.builder()
                            .address(
                                BeneficialOwnerCreateParams.Individual.Address.builder()
                                    .city("New York")
                                    .country("US")
                                    .line1("33 Liberty Street")
                                    .line2("x")
                                    .state("NY")
                                    .zip("10045")
                                    .build()
                            )
                            .dateOfBirth(LocalDate.parse("1970-01-31"))
                            .identification(
                                BeneficialOwnerCreateParams.Individual.Identification.builder()
                                    .method(
                                        BeneficialOwnerCreateParams.Individual.Identification.Method
                                            .SOCIAL_SECURITY_NUMBER
                                    )
                                    .number("078051120")
                                    .driversLicense(
                                        BeneficialOwnerCreateParams.Individual.Identification
                                            .DriversLicense
                                            .builder()
                                            .expirationDate(LocalDate.parse("2019-12-27"))
                                            .fileId("file_id")
                                            .state("x")
                                            .backFileId("back_file_id")
                                            .build()
                                    )
                                    .other(
                                        BeneficialOwnerCreateParams.Individual.Identification.Other
                                            .builder()
                                            .country("x")
                                            .description("x")
                                            .fileId("file_id")
                                            .backFileId("back_file_id")
                                            .expirationDate(LocalDate.parse("2019-12-27"))
                                            .build()
                                    )
                                    .passport(
                                        BeneficialOwnerCreateParams.Individual.Identification
                                            .Passport
                                            .builder()
                                            .country("x")
                                            .expirationDate(LocalDate.parse("2019-12-27"))
                                            .fileId("file_id")
                                            .build()
                                    )
                                    .build()
                            )
                            .name("Ian Crease")
                            .confirmedNoUsTaxId(true)
                            .build()
                    )
                    .addProng(BeneficialOwnerCreateParams.Prong.CONTROL)
                    .companyTitle("CEO")
                    .build()
            )

        entityBeneficialOwner.validate()
    }

    @Test
    fun retrieve() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val beneficialOwnerService = client.beneficialOwners()

        val entityBeneficialOwner =
            beneficialOwnerService.retrieve(
                "entity_setup_beneficial_owner_submission_vgkyk7dj5eb4sfhdbkx7"
            )

        entityBeneficialOwner.validate()
    }

    @Test
    fun update() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val beneficialOwnerService = client.beneficialOwners()

        val entityBeneficialOwner =
            beneficialOwnerService.update(
                BeneficialOwnerUpdateParams.builder()
                    .entityBeneficialOwnerId(
                        "entity_setup_beneficial_owner_submission_vgkyk7dj5eb4sfhdbkx7"
                    )
                    .address(
                        BeneficialOwnerUpdateParams.Address.builder()
                            .city("New York")
                            .country("US")
                            .line1("33 Liberty Street")
                            .line2("Unit 2")
                            .state("NY")
                            .zip("10045")
                            .build()
                    )
                    .confirmedNoUsTaxId(true)
                    .identification(
                        BeneficialOwnerUpdateParams.Identification.builder()
                            .method(
                                BeneficialOwnerUpdateParams.Identification.Method
                                    .SOCIAL_SECURITY_NUMBER
                            )
                            .number("xxxx")
                            .driversLicense(
                                BeneficialOwnerUpdateParams.Identification.DriversLicense.builder()
                                    .expirationDate(LocalDate.parse("2019-12-27"))
                                    .fileId("file_id")
                                    .state("x")
                                    .backFileId("back_file_id")
                                    .build()
                            )
                            .other(
                                BeneficialOwnerUpdateParams.Identification.Other.builder()
                                    .country("x")
                                    .description("x")
                                    .fileId("file_id")
                                    .backFileId("back_file_id")
                                    .expirationDate(LocalDate.parse("2019-12-27"))
                                    .build()
                            )
                            .passport(
                                BeneficialOwnerUpdateParams.Identification.Passport.builder()
                                    .country("x")
                                    .expirationDate(LocalDate.parse("2019-12-27"))
                                    .fileId("file_id")
                                    .build()
                            )
                            .build()
                    )
                    .name("x")
                    .build()
            )

        entityBeneficialOwner.validate()
    }

    @Test
    fun list() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val beneficialOwnerService = client.beneficialOwners()

        val page =
            beneficialOwnerService.list(
                BeneficialOwnerListParams.builder().entityId("entity_id").build()
            )

        page.response().validate()
    }

    @Test
    fun archive() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val beneficialOwnerService = client.beneficialOwners()

        val entityBeneficialOwner =
            beneficialOwnerService.archive(
                "entity_setup_beneficial_owner_submission_vgkyk7dj5eb4sfhdbkx7"
            )

        entityBeneficialOwner.validate()
    }
}
