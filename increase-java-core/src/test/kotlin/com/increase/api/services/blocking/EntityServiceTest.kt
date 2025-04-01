// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.entities.EntityArchiveBeneficialOwnerParams
import com.increase.api.models.entities.EntityArchiveParams
import com.increase.api.models.entities.EntityConfirmParams
import com.increase.api.models.entities.EntityCreateBeneficialOwnerParams
import com.increase.api.models.entities.EntityCreateParams
import com.increase.api.models.entities.EntityRetrieveParams
import com.increase.api.models.entities.EntityUpdateAddressParams
import com.increase.api.models.entities.EntityUpdateBeneficialOwnerAddressParams
import com.increase.api.models.entities.EntityUpdateIndustryCodeParams
import java.time.LocalDate
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class EntityServiceTest {

    @Test
    fun create() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val entityService = client.entities()

        val entity =
            entityService.create(
                EntityCreateParams.builder()
                    .structure(EntityCreateParams.Structure.CORPORATION)
                    .corporation(
                        EntityCreateParams.Corporation.builder()
                            .address(
                                EntityCreateParams.Corporation.Address.builder()
                                    .city("New York")
                                    .line1("33 Liberty Street")
                                    .state("NY")
                                    .zip("10045")
                                    .line2("x")
                                    .build()
                            )
                            .addBeneficialOwner(
                                EntityCreateParams.Corporation.BeneficialOwner.builder()
                                    .individual(
                                        EntityCreateParams.Corporation.BeneficialOwner.Individual
                                            .builder()
                                            .address(
                                                EntityCreateParams.Corporation.BeneficialOwner
                                                    .Individual
                                                    .Address
                                                    .builder()
                                                    .country("x")
                                                    .line1("33 Liberty Street")
                                                    .city("New York")
                                                    .line2("x")
                                                    .state("NY")
                                                    .zip("10045")
                                                    .build()
                                            )
                                            .dateOfBirth(LocalDate.parse("1970-01-31"))
                                            .identification(
                                                EntityCreateParams.Corporation.BeneficialOwner
                                                    .Individual
                                                    .Identification
                                                    .builder()
                                                    .method(
                                                        EntityCreateParams.Corporation
                                                            .BeneficialOwner
                                                            .Individual
                                                            .Identification
                                                            .Method
                                                            .SOCIAL_SECURITY_NUMBER
                                                    )
                                                    .number("078051120")
                                                    .driversLicense(
                                                        EntityCreateParams.Corporation
                                                            .BeneficialOwner
                                                            .Individual
                                                            .Identification
                                                            .DriversLicense
                                                            .builder()
                                                            .expirationDate(
                                                                LocalDate.parse("2019-12-27")
                                                            )
                                                            .fileId("file_id")
                                                            .state("x")
                                                            .backFileId("back_file_id")
                                                            .build()
                                                    )
                                                    .other(
                                                        EntityCreateParams.Corporation
                                                            .BeneficialOwner
                                                            .Individual
                                                            .Identification
                                                            .Other
                                                            .builder()
                                                            .country("x")
                                                            .description("x")
                                                            .fileId("file_id")
                                                            .backFileId("back_file_id")
                                                            .expirationDate(
                                                                LocalDate.parse("2019-12-27")
                                                            )
                                                            .build()
                                                    )
                                                    .passport(
                                                        EntityCreateParams.Corporation
                                                            .BeneficialOwner
                                                            .Individual
                                                            .Identification
                                                            .Passport
                                                            .builder()
                                                            .country("x")
                                                            .expirationDate(
                                                                LocalDate.parse("2019-12-27")
                                                            )
                                                            .fileId("file_id")
                                                            .build()
                                                    )
                                                    .build()
                                            )
                                            .name("Ian Crease")
                                            .confirmedNoUsTaxId(true)
                                            .build()
                                    )
                                    .addProng(
                                        EntityCreateParams.Corporation.BeneficialOwner.Prong
                                            .OWNERSHIP
                                    )
                                    .companyTitle("CEO")
                                    .build()
                            )
                            .name("National Phonograph Company")
                            .taxIdentifier("602214076")
                            .incorporationState("NY")
                            .industryCode("x")
                            .website("https://example.com")
                            .build()
                    )
                    .description("x")
                    .governmentAuthority(
                        EntityCreateParams.GovernmentAuthority.builder()
                            .address(
                                EntityCreateParams.GovernmentAuthority.Address.builder()
                                    .city("x")
                                    .line1("x")
                                    .state("x")
                                    .zip("x")
                                    .line2("x")
                                    .build()
                            )
                            .addAuthorizedPerson(
                                EntityCreateParams.GovernmentAuthority.AuthorizedPerson.builder()
                                    .name("x")
                                    .build()
                            )
                            .category(EntityCreateParams.GovernmentAuthority.Category.MUNICIPALITY)
                            .name("x")
                            .taxIdentifier("x")
                            .website("website")
                            .build()
                    )
                    .joint(
                        EntityCreateParams.Joint.builder()
                            .addIndividual(
                                EntityCreateParams.Joint.Individual.builder()
                                    .address(
                                        EntityCreateParams.Joint.Individual.Address.builder()
                                            .city("x")
                                            .line1("x")
                                            .state("x")
                                            .zip("x")
                                            .line2("x")
                                            .build()
                                    )
                                    .dateOfBirth(LocalDate.parse("2019-12-27"))
                                    .identification(
                                        EntityCreateParams.Joint.Individual.Identification.builder()
                                            .method(
                                                EntityCreateParams.Joint.Individual.Identification
                                                    .Method
                                                    .SOCIAL_SECURITY_NUMBER
                                            )
                                            .number("xxxx")
                                            .driversLicense(
                                                EntityCreateParams.Joint.Individual.Identification
                                                    .DriversLicense
                                                    .builder()
                                                    .expirationDate(LocalDate.parse("2019-12-27"))
                                                    .fileId("file_id")
                                                    .state("x")
                                                    .backFileId("back_file_id")
                                                    .build()
                                            )
                                            .other(
                                                EntityCreateParams.Joint.Individual.Identification
                                                    .Other
                                                    .builder()
                                                    .country("x")
                                                    .description("x")
                                                    .fileId("file_id")
                                                    .backFileId("back_file_id")
                                                    .expirationDate(LocalDate.parse("2019-12-27"))
                                                    .build()
                                            )
                                            .passport(
                                                EntityCreateParams.Joint.Individual.Identification
                                                    .Passport
                                                    .builder()
                                                    .country("x")
                                                    .expirationDate(LocalDate.parse("2019-12-27"))
                                                    .fileId("file_id")
                                                    .build()
                                            )
                                            .build()
                                    )
                                    .name("x")
                                    .confirmedNoUsTaxId(true)
                                    .build()
                            )
                            .name("x")
                            .build()
                    )
                    .naturalPerson(
                        EntityCreateParams.NaturalPerson.builder()
                            .address(
                                EntityCreateParams.NaturalPerson.Address.builder()
                                    .city("x")
                                    .line1("x")
                                    .state("x")
                                    .zip("x")
                                    .line2("x")
                                    .build()
                            )
                            .dateOfBirth(LocalDate.parse("2019-12-27"))
                            .identification(
                                EntityCreateParams.NaturalPerson.Identification.builder()
                                    .method(
                                        EntityCreateParams.NaturalPerson.Identification.Method
                                            .SOCIAL_SECURITY_NUMBER
                                    )
                                    .number("xxxx")
                                    .driversLicense(
                                        EntityCreateParams.NaturalPerson.Identification
                                            .DriversLicense
                                            .builder()
                                            .expirationDate(LocalDate.parse("2019-12-27"))
                                            .fileId("file_id")
                                            .state("x")
                                            .backFileId("back_file_id")
                                            .build()
                                    )
                                    .other(
                                        EntityCreateParams.NaturalPerson.Identification.Other
                                            .builder()
                                            .country("x")
                                            .description("x")
                                            .fileId("file_id")
                                            .backFileId("back_file_id")
                                            .expirationDate(LocalDate.parse("2019-12-27"))
                                            .build()
                                    )
                                    .passport(
                                        EntityCreateParams.NaturalPerson.Identification.Passport
                                            .builder()
                                            .country("x")
                                            .expirationDate(LocalDate.parse("2019-12-27"))
                                            .fileId("file_id")
                                            .build()
                                    )
                                    .build()
                            )
                            .name("x")
                            .confirmedNoUsTaxId(true)
                            .build()
                    )
                    .addSupplementalDocument(
                        EntityCreateParams.SupplementalDocument.builder()
                            .fileId("file_makxrc67oh9l6sg7w9yc")
                            .build()
                    )
                    .thirdPartyVerification(
                        EntityCreateParams.ThirdPartyVerification.builder()
                            .reference("x")
                            .vendor(EntityCreateParams.ThirdPartyVerification.Vendor.ALLOY)
                            .build()
                    )
                    .trust(
                        EntityCreateParams.Trust.builder()
                            .address(
                                EntityCreateParams.Trust.Address.builder()
                                    .city("x")
                                    .line1("x")
                                    .state("x")
                                    .zip("x")
                                    .line2("x")
                                    .build()
                            )
                            .category(EntityCreateParams.Trust.Category.REVOCABLE)
                            .name("x")
                            .addTrustee(
                                EntityCreateParams.Trust.Trustee.builder()
                                    .structure(
                                        EntityCreateParams.Trust.Trustee.Structure.INDIVIDUAL
                                    )
                                    .individual(
                                        EntityCreateParams.Trust.Trustee.Individual.builder()
                                            .address(
                                                EntityCreateParams.Trust.Trustee.Individual.Address
                                                    .builder()
                                                    .city("x")
                                                    .line1("x")
                                                    .state("x")
                                                    .zip("x")
                                                    .line2("x")
                                                    .build()
                                            )
                                            .dateOfBirth(LocalDate.parse("2019-12-27"))
                                            .identification(
                                                EntityCreateParams.Trust.Trustee.Individual
                                                    .Identification
                                                    .builder()
                                                    .method(
                                                        EntityCreateParams.Trust.Trustee.Individual
                                                            .Identification
                                                            .Method
                                                            .SOCIAL_SECURITY_NUMBER
                                                    )
                                                    .number("xxxx")
                                                    .driversLicense(
                                                        EntityCreateParams.Trust.Trustee.Individual
                                                            .Identification
                                                            .DriversLicense
                                                            .builder()
                                                            .expirationDate(
                                                                LocalDate.parse("2019-12-27")
                                                            )
                                                            .fileId("file_id")
                                                            .state("x")
                                                            .backFileId("back_file_id")
                                                            .build()
                                                    )
                                                    .other(
                                                        EntityCreateParams.Trust.Trustee.Individual
                                                            .Identification
                                                            .Other
                                                            .builder()
                                                            .country("x")
                                                            .description("x")
                                                            .fileId("file_id")
                                                            .backFileId("back_file_id")
                                                            .expirationDate(
                                                                LocalDate.parse("2019-12-27")
                                                            )
                                                            .build()
                                                    )
                                                    .passport(
                                                        EntityCreateParams.Trust.Trustee.Individual
                                                            .Identification
                                                            .Passport
                                                            .builder()
                                                            .country("x")
                                                            .expirationDate(
                                                                LocalDate.parse("2019-12-27")
                                                            )
                                                            .fileId("file_id")
                                                            .build()
                                                    )
                                                    .build()
                                            )
                                            .name("x")
                                            .confirmedNoUsTaxId(true)
                                            .build()
                                    )
                                    .build()
                            )
                            .formationDocumentFileId("formation_document_file_id")
                            .formationState("x")
                            .grantor(
                                EntityCreateParams.Trust.Grantor.builder()
                                    .address(
                                        EntityCreateParams.Trust.Grantor.Address.builder()
                                            .city("x")
                                            .line1("x")
                                            .state("x")
                                            .zip("x")
                                            .line2("x")
                                            .build()
                                    )
                                    .dateOfBirth(LocalDate.parse("2019-12-27"))
                                    .identification(
                                        EntityCreateParams.Trust.Grantor.Identification.builder()
                                            .method(
                                                EntityCreateParams.Trust.Grantor.Identification
                                                    .Method
                                                    .SOCIAL_SECURITY_NUMBER
                                            )
                                            .number("xxxx")
                                            .driversLicense(
                                                EntityCreateParams.Trust.Grantor.Identification
                                                    .DriversLicense
                                                    .builder()
                                                    .expirationDate(LocalDate.parse("2019-12-27"))
                                                    .fileId("file_id")
                                                    .state("x")
                                                    .backFileId("back_file_id")
                                                    .build()
                                            )
                                            .other(
                                                EntityCreateParams.Trust.Grantor.Identification
                                                    .Other
                                                    .builder()
                                                    .country("x")
                                                    .description("x")
                                                    .fileId("file_id")
                                                    .backFileId("back_file_id")
                                                    .expirationDate(LocalDate.parse("2019-12-27"))
                                                    .build()
                                            )
                                            .passport(
                                                EntityCreateParams.Trust.Grantor.Identification
                                                    .Passport
                                                    .builder()
                                                    .country("x")
                                                    .expirationDate(LocalDate.parse("2019-12-27"))
                                                    .fileId("file_id")
                                                    .build()
                                            )
                                            .build()
                                    )
                                    .name("x")
                                    .confirmedNoUsTaxId(true)
                                    .build()
                            )
                            .taxIdentifier("x")
                            .build()
                    )
                    .build()
            )

        entity.validate()
    }

    @Test
    fun retrieve() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val entityService = client.entities()

        val entity =
            entityService.retrieve(
                EntityRetrieveParams.builder().entityId("entity_n8y8tnk2p9339ti393yi").build()
            )

        entity.validate()
    }

    @Test
    fun list() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val entityService = client.entities()

        val page = entityService.list()

        page.response().validate()
    }

    @Test
    fun archive() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val entityService = client.entities()

        val entity =
            entityService.archive(
                EntityArchiveParams.builder().entityId("entity_n8y8tnk2p9339ti393yi").build()
            )

        entity.validate()
    }

    @Test
    fun archiveBeneficialOwner() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val entityService = client.entities()

        val entity =
            entityService.archiveBeneficialOwner(
                EntityArchiveBeneficialOwnerParams.builder()
                    .entityId("entity_n8y8tnk2p9339ti393yi")
                    .beneficialOwnerId(
                        "entity_setup_beneficial_owner_submission_vgkyk7dj5eb4sfhdbkx7"
                    )
                    .build()
            )

        entity.validate()
    }

    @Test
    fun confirm() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val entityService = client.entities()

        val entity =
            entityService.confirm(
                EntityConfirmParams.builder()
                    .entityId("entity_n8y8tnk2p9339ti393yi")
                    .confirmedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )

        entity.validate()
    }

    @Test
    fun createBeneficialOwner() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val entityService = client.entities()

        val entity =
            entityService.createBeneficialOwner(
                EntityCreateBeneficialOwnerParams.builder()
                    .entityId("entity_n8y8tnk2p9339ti393yi")
                    .beneficialOwner(
                        EntityCreateBeneficialOwnerParams.BeneficialOwner.builder()
                            .individual(
                                EntityCreateBeneficialOwnerParams.BeneficialOwner.Individual
                                    .builder()
                                    .address(
                                        EntityCreateBeneficialOwnerParams.BeneficialOwner.Individual
                                            .Address
                                            .builder()
                                            .country("US")
                                            .line1("33 Liberty Street")
                                            .city("New York")
                                            .line2("x")
                                            .state("NY")
                                            .zip("10045")
                                            .build()
                                    )
                                    .dateOfBirth(LocalDate.parse("1970-01-31"))
                                    .identification(
                                        EntityCreateBeneficialOwnerParams.BeneficialOwner.Individual
                                            .Identification
                                            .builder()
                                            .method(
                                                EntityCreateBeneficialOwnerParams.BeneficialOwner
                                                    .Individual
                                                    .Identification
                                                    .Method
                                                    .SOCIAL_SECURITY_NUMBER
                                            )
                                            .number("078051120")
                                            .driversLicense(
                                                EntityCreateBeneficialOwnerParams.BeneficialOwner
                                                    .Individual
                                                    .Identification
                                                    .DriversLicense
                                                    .builder()
                                                    .expirationDate(LocalDate.parse("2019-12-27"))
                                                    .fileId("file_id")
                                                    .state("x")
                                                    .backFileId("back_file_id")
                                                    .build()
                                            )
                                            .other(
                                                EntityCreateBeneficialOwnerParams.BeneficialOwner
                                                    .Individual
                                                    .Identification
                                                    .Other
                                                    .builder()
                                                    .country("x")
                                                    .description("x")
                                                    .fileId("file_id")
                                                    .backFileId("back_file_id")
                                                    .expirationDate(LocalDate.parse("2019-12-27"))
                                                    .build()
                                            )
                                            .passport(
                                                EntityCreateBeneficialOwnerParams.BeneficialOwner
                                                    .Individual
                                                    .Identification
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
                            .addProng(
                                EntityCreateBeneficialOwnerParams.BeneficialOwner.Prong.OWNERSHIP
                            )
                            .companyTitle("CEO")
                            .build()
                    )
                    .build()
            )

        entity.validate()
    }

    @Test
    fun updateAddress() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val entityService = client.entities()

        val entity =
            entityService.updateAddress(
                EntityUpdateAddressParams.builder()
                    .entityId("entity_n8y8tnk2p9339ti393yi")
                    .address(
                        EntityUpdateAddressParams.Address.builder()
                            .city("New York")
                            .line1("33 Liberty Street")
                            .state("NY")
                            .zip("10045")
                            .line2("Unit 2")
                            .build()
                    )
                    .build()
            )

        entity.validate()
    }

    @Test
    fun updateBeneficialOwnerAddress() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val entityService = client.entities()

        val entity =
            entityService.updateBeneficialOwnerAddress(
                EntityUpdateBeneficialOwnerAddressParams.builder()
                    .entityId("entity_n8y8tnk2p9339ti393yi")
                    .address(
                        EntityUpdateBeneficialOwnerAddressParams.Address.builder()
                            .country("US")
                            .line1("33 Liberty Street")
                            .city("New York")
                            .line2("Unit 2")
                            .state("NY")
                            .zip("10045")
                            .build()
                    )
                    .beneficialOwnerId(
                        "entity_setup_beneficial_owner_submission_vgkyk7dj5eb4sfhdbkx7"
                    )
                    .build()
            )

        entity.validate()
    }

    @Test
    fun updateIndustryCode() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val entityService = client.entities()

        val entity =
            entityService.updateIndustryCode(
                EntityUpdateIndustryCodeParams.builder()
                    .entityId("entity_n8y8tnk2p9339ti393yi")
                    .industryCode("5132")
                    .build()
            )

        entity.validate()
    }
}
