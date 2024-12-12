// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.EntityArchiveBeneficialOwnerParams
import com.increase.api.models.EntityArchiveParams
import com.increase.api.models.EntityConfirmParams
import com.increase.api.models.EntityCreateBeneficialOwnerParams
import com.increase.api.models.EntityCreateParams
import com.increase.api.models.EntityListParams
import com.increase.api.models.EntityRetrieveParams
import com.increase.api.models.EntityUpdateAddressParams
import com.increase.api.models.EntityUpdateBeneficialOwnerAddressParams
import com.increase.api.models.EntityUpdateIndustryCodeParams
import java.time.LocalDate
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class EntityServiceTest {

    @Test
    fun callCreate() {
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
                                    .city("x")
                                    .line1("x")
                                    .state("x")
                                    .zip("x")
                                    .line2("x")
                                    .build()
                            )
                            .beneficialOwners(
                                listOf(
                                    EntityCreateParams.Corporation.BeneficialOwner.builder()
                                        .individual(
                                            EntityCreateParams.Corporation.BeneficialOwner
                                                .Individual
                                                .builder()
                                                .address(
                                                    EntityCreateParams.Corporation.BeneficialOwner
                                                        .Individual
                                                        .Address
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
                                                        .number("xxxx")
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
                                                .name("x")
                                                .confirmedNoUsTaxId(true)
                                                .build()
                                        )
                                        .prongs(
                                            listOf(
                                                EntityCreateParams.Corporation.BeneficialOwner.Prong
                                                    .OWNERSHIP
                                            )
                                        )
                                        .companyTitle("x")
                                        .build()
                                )
                            )
                            .name("x")
                            .taxIdentifier("x")
                            .incorporationState("x")
                            .industryCode("x")
                            .website("website")
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
                            .authorizedPersons(
                                listOf(
                                    EntityCreateParams.GovernmentAuthority.AuthorizedPerson
                                        .builder()
                                        .name("x")
                                        .build()
                                )
                            )
                            .category(EntityCreateParams.GovernmentAuthority.Category.MUNICIPALITY)
                            .name("x")
                            .taxIdentifier("x")
                            .website("website")
                            .build()
                    )
                    .joint(
                        EntityCreateParams.Joint.builder()
                            .individuals(
                                listOf(
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
                                            EntityCreateParams.Joint.Individual.Identification
                                                .builder()
                                                .method(
                                                    EntityCreateParams.Joint.Individual
                                                        .Identification
                                                        .Method
                                                        .SOCIAL_SECURITY_NUMBER
                                                )
                                                .number("xxxx")
                                                .driversLicense(
                                                    EntityCreateParams.Joint.Individual
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
                                                    EntityCreateParams.Joint.Individual
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
                                                    EntityCreateParams.Joint.Individual
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
                    .supplementalDocuments(
                        listOf(
                            EntityCreateParams.SupplementalDocument.builder()
                                .fileId("file_id")
                                .build()
                        )
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
                            .trustees(
                                listOf(
                                    EntityCreateParams.Trust.Trustee.builder()
                                        .structure(
                                            EntityCreateParams.Trust.Trustee.Structure.INDIVIDUAL
                                        )
                                        .individual(
                                            EntityCreateParams.Trust.Trustee.Individual.builder()
                                                .address(
                                                    EntityCreateParams.Trust.Trustee.Individual
                                                        .Address
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
                                                            EntityCreateParams.Trust.Trustee
                                                                .Individual
                                                                .Identification
                                                                .Method
                                                                .SOCIAL_SECURITY_NUMBER
                                                        )
                                                        .number("xxxx")
                                                        .driversLicense(
                                                            EntityCreateParams.Trust.Trustee
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
                                                            EntityCreateParams.Trust.Trustee
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
                                                            EntityCreateParams.Trust.Trustee
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
                                                .name("x")
                                                .confirmedNoUsTaxId(true)
                                                .build()
                                        )
                                        .build()
                                )
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
        println(entity)
        entity.validate()
    }

    @Test
    fun callRetrieve() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val entityService = client.entities()
        val entity =
            entityService.retrieve(EntityRetrieveParams.builder().entityId("entity_id").build())
        println(entity)
        entity.validate()
    }

    @Test
    fun callList() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val entityService = client.entities()
        val entityList = entityService.list(EntityListParams.builder().build())
        println(entityList)
        entityList.data().forEach { it.validate() }
    }

    @Test
    fun callArchive() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val entityService = client.entities()
        val entity =
            entityService.archive(EntityArchiveParams.builder().entityId("entity_id").build())
        println(entity)
        entity.validate()
    }

    @Test
    fun callArchiveBeneficialOwner() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val entityService = client.entities()
        val entity =
            entityService.archiveBeneficialOwner(
                EntityArchiveBeneficialOwnerParams.builder()
                    .entityId("entity_id")
                    .beneficialOwnerId("beneficial_owner_id")
                    .build()
            )
        println(entity)
        entity.validate()
    }

    @Test
    fun callConfirm() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val entityService = client.entities()
        val entity =
            entityService.confirm(
                EntityConfirmParams.builder()
                    .entityId("entity_id")
                    .confirmedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        println(entity)
        entity.validate()
    }

    @Test
    fun callCreateBeneficialOwner() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val entityService = client.entities()
        val entity =
            entityService.createBeneficialOwner(
                EntityCreateBeneficialOwnerParams.builder()
                    .entityId("entity_id")
                    .beneficialOwner(
                        EntityCreateBeneficialOwnerParams.BeneficialOwner.builder()
                            .individual(
                                EntityCreateBeneficialOwnerParams.BeneficialOwner.Individual
                                    .builder()
                                    .address(
                                        EntityCreateBeneficialOwnerParams.BeneficialOwner.Individual
                                            .Address
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
                                            .number("xxxx")
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
                                    .name("x")
                                    .confirmedNoUsTaxId(true)
                                    .build()
                            )
                            .prongs(
                                listOf(
                                    EntityCreateBeneficialOwnerParams.BeneficialOwner.Prong
                                        .OWNERSHIP
                                )
                            )
                            .companyTitle("x")
                            .build()
                    )
                    .build()
            )
        println(entity)
        entity.validate()
    }

    @Test
    fun callUpdateAddress() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val entityService = client.entities()
        val entity =
            entityService.updateAddress(
                EntityUpdateAddressParams.builder()
                    .entityId("entity_id")
                    .address(
                        EntityUpdateAddressParams.Address.builder()
                            .city("x")
                            .line1("x")
                            .state("x")
                            .zip("x")
                            .line2("x")
                            .build()
                    )
                    .build()
            )
        println(entity)
        entity.validate()
    }

    @Test
    fun callUpdateBeneficialOwnerAddress() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val entityService = client.entities()
        val entity =
            entityService.updateBeneficialOwnerAddress(
                EntityUpdateBeneficialOwnerAddressParams.builder()
                    .entityId("entity_id")
                    .address(
                        EntityUpdateBeneficialOwnerAddressParams.Address.builder()
                            .city("x")
                            .line1("x")
                            .state("x")
                            .zip("x")
                            .line2("x")
                            .build()
                    )
                    .beneficialOwnerId("beneficial_owner_id")
                    .build()
            )
        println(entity)
        entity.validate()
    }

    @Test
    fun callUpdateIndustryCode() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val entityService = client.entities()
        val entity =
            entityService.updateIndustryCode(
                EntityUpdateIndustryCodeParams.builder()
                    .entityId("entity_id")
                    .industryCode("x")
                    .build()
            )
        println(entity)
        entity.validate()
    }
}
