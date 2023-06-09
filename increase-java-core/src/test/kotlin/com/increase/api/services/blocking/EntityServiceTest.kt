package com.increase.api.services.blocking

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.*
import com.increase.api.models.EntityListParams
import java.time.LocalDate
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class EntityServiceTest {

    @Test
    fun callCreate() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .build()
        val entityService = client.entities()
        val entity =
            entityService.create(
                EntityCreateParams.builder()
                    .structure(EntityCreateParams.Structure.CORPORATION)
                    .corporation(
                        EntityCreateParams.Corporation.builder()
                            .name("x")
                            .website("string")
                            .taxIdentifier("x")
                            .incorporationState("x")
                            .address(
                                EntityCreateParams.Corporation.Address.builder()
                                    .line1("x")
                                    .line2("x")
                                    .city("x")
                                    .state("x")
                                    .zip("x")
                                    .build()
                            )
                            .beneficialOwners(
                                listOf(
                                    EntityCreateParams.Corporation.BeneficialOwner.builder()
                                        .individual(
                                            EntityCreateParams.Corporation.BeneficialOwner
                                                .Individual
                                                .builder()
                                                .name("x")
                                                .dateOfBirth(LocalDate.parse("2019-12-27"))
                                                .address(
                                                    EntityCreateParams.Corporation.BeneficialOwner
                                                        .Individual
                                                        .Address
                                                        .builder()
                                                        .line1("x")
                                                        .line2("x")
                                                        .city("x")
                                                        .state("x")
                                                        .zip("x")
                                                        .build()
                                                )
                                                .confirmedNoUsTaxId(true)
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
                                                        .passport(
                                                            EntityCreateParams.Corporation
                                                                .BeneficialOwner
                                                                .Individual
                                                                .Identification
                                                                .Passport
                                                                .builder()
                                                                .fileId("string")
                                                                .expirationDate(
                                                                    LocalDate.parse("2019-12-27")
                                                                )
                                                                .country("x")
                                                                .build()
                                                        )
                                                        .driversLicense(
                                                            EntityCreateParams.Corporation
                                                                .BeneficialOwner
                                                                .Individual
                                                                .Identification
                                                                .DriversLicense
                                                                .builder()
                                                                .fileId("string")
                                                                .expirationDate(
                                                                    LocalDate.parse("2019-12-27")
                                                                )
                                                                .state("x")
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
                                                                .expirationDate(
                                                                    LocalDate.parse("2019-12-27")
                                                                )
                                                                .fileId("string")
                                                                .build()
                                                        )
                                                        .build()
                                                )
                                                .build()
                                        )
                                        .companyTitle("x")
                                        .prong(
                                            EntityCreateParams.Corporation.BeneficialOwner.Prong
                                                .OWNERSHIP
                                        )
                                        .build()
                                )
                            )
                            .build()
                    )
                    .naturalPerson(
                        EntityCreateParams.NaturalPerson.builder()
                            .name("x")
                            .dateOfBirth(LocalDate.parse("2019-12-27"))
                            .address(
                                EntityCreateParams.NaturalPerson.Address.builder()
                                    .line1("x")
                                    .line2("x")
                                    .city("x")
                                    .state("x")
                                    .zip("x")
                                    .build()
                            )
                            .confirmedNoUsTaxId(true)
                            .identification(
                                EntityCreateParams.NaturalPerson.Identification.builder()
                                    .method(
                                        EntityCreateParams.NaturalPerson.Identification.Method
                                            .SOCIAL_SECURITY_NUMBER
                                    )
                                    .number("xxxx")
                                    .passport(
                                        EntityCreateParams.NaturalPerson.Identification.Passport
                                            .builder()
                                            .fileId("string")
                                            .expirationDate(LocalDate.parse("2019-12-27"))
                                            .country("x")
                                            .build()
                                    )
                                    .driversLicense(
                                        EntityCreateParams.NaturalPerson.Identification
                                            .DriversLicense
                                            .builder()
                                            .fileId("string")
                                            .expirationDate(LocalDate.parse("2019-12-27"))
                                            .state("x")
                                            .build()
                                    )
                                    .other(
                                        EntityCreateParams.NaturalPerson.Identification.Other
                                            .builder()
                                            .country("x")
                                            .description("x")
                                            .expirationDate(LocalDate.parse("2019-12-27"))
                                            .fileId("string")
                                            .build()
                                    )
                                    .build()
                            )
                            .build()
                    )
                    .joint(
                        EntityCreateParams.Joint.builder()
                            .name("x")
                            .individuals(
                                listOf(
                                    EntityCreateParams.Joint.Individual.builder()
                                        .name("x")
                                        .dateOfBirth(LocalDate.parse("2019-12-27"))
                                        .address(
                                            EntityCreateParams.Joint.Individual.Address.builder()
                                                .line1("x")
                                                .line2("x")
                                                .city("x")
                                                .state("x")
                                                .zip("x")
                                                .build()
                                        )
                                        .confirmedNoUsTaxId(true)
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
                                                .passport(
                                                    EntityCreateParams.Joint.Individual
                                                        .Identification
                                                        .Passport
                                                        .builder()
                                                        .fileId("string")
                                                        .expirationDate(
                                                            LocalDate.parse("2019-12-27")
                                                        )
                                                        .country("x")
                                                        .build()
                                                )
                                                .driversLicense(
                                                    EntityCreateParams.Joint.Individual
                                                        .Identification
                                                        .DriversLicense
                                                        .builder()
                                                        .fileId("string")
                                                        .expirationDate(
                                                            LocalDate.parse("2019-12-27")
                                                        )
                                                        .state("x")
                                                        .build()
                                                )
                                                .other(
                                                    EntityCreateParams.Joint.Individual
                                                        .Identification
                                                        .Other
                                                        .builder()
                                                        .country("x")
                                                        .description("x")
                                                        .expirationDate(
                                                            LocalDate.parse("2019-12-27")
                                                        )
                                                        .fileId("string")
                                                        .build()
                                                )
                                                .build()
                                        )
                                        .build()
                                )
                            )
                            .build()
                    )
                    .trust(
                        EntityCreateParams.Trust.builder()
                            .name("x")
                            .category(EntityCreateParams.Trust.Category.REVOCABLE)
                            .taxIdentifier("x")
                            .formationState("x")
                            .address(
                                EntityCreateParams.Trust.Address.builder()
                                    .line1("x")
                                    .line2("x")
                                    .city("x")
                                    .state("x")
                                    .zip("x")
                                    .build()
                            )
                            .formationDocumentFileId("string")
                            .trustees(
                                listOf(
                                    EntityCreateParams.Trust.Trustee.builder()
                                        .structure(
                                            EntityCreateParams.Trust.Trustee.Structure.INDIVIDUAL
                                        )
                                        .individual(
                                            EntityCreateParams.Trust.Trustee.Individual.builder()
                                                .name("x")
                                                .dateOfBirth(LocalDate.parse("2019-12-27"))
                                                .address(
                                                    EntityCreateParams.Trust.Trustee.Individual
                                                        .Address
                                                        .builder()
                                                        .line1("x")
                                                        .line2("x")
                                                        .city("x")
                                                        .state("x")
                                                        .zip("x")
                                                        .build()
                                                )
                                                .confirmedNoUsTaxId(true)
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
                                                        .passport(
                                                            EntityCreateParams.Trust.Trustee
                                                                .Individual
                                                                .Identification
                                                                .Passport
                                                                .builder()
                                                                .fileId("string")
                                                                .expirationDate(
                                                                    LocalDate.parse("2019-12-27")
                                                                )
                                                                .country("x")
                                                                .build()
                                                        )
                                                        .driversLicense(
                                                            EntityCreateParams.Trust.Trustee
                                                                .Individual
                                                                .Identification
                                                                .DriversLicense
                                                                .builder()
                                                                .fileId("string")
                                                                .expirationDate(
                                                                    LocalDate.parse("2019-12-27")
                                                                )
                                                                .state("x")
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
                                                                .expirationDate(
                                                                    LocalDate.parse("2019-12-27")
                                                                )
                                                                .fileId("string")
                                                                .build()
                                                        )
                                                        .build()
                                                )
                                                .build()
                                        )
                                        .build()
                                )
                            )
                            .grantor(
                                EntityCreateParams.Trust.Grantor.builder()
                                    .name("x")
                                    .dateOfBirth(LocalDate.parse("2019-12-27"))
                                    .address(
                                        EntityCreateParams.Trust.Grantor.Address.builder()
                                            .line1("x")
                                            .line2("x")
                                            .city("x")
                                            .state("x")
                                            .zip("x")
                                            .build()
                                    )
                                    .confirmedNoUsTaxId(true)
                                    .identification(
                                        EntityCreateParams.Trust.Grantor.Identification.builder()
                                            .method(
                                                EntityCreateParams.Trust.Grantor.Identification
                                                    .Method
                                                    .SOCIAL_SECURITY_NUMBER
                                            )
                                            .number("xxxx")
                                            .passport(
                                                EntityCreateParams.Trust.Grantor.Identification
                                                    .Passport
                                                    .builder()
                                                    .fileId("string")
                                                    .expirationDate(LocalDate.parse("2019-12-27"))
                                                    .country("x")
                                                    .build()
                                            )
                                            .driversLicense(
                                                EntityCreateParams.Trust.Grantor.Identification
                                                    .DriversLicense
                                                    .builder()
                                                    .fileId("string")
                                                    .expirationDate(LocalDate.parse("2019-12-27"))
                                                    .state("x")
                                                    .build()
                                            )
                                            .other(
                                                EntityCreateParams.Trust.Grantor.Identification
                                                    .Other
                                                    .builder()
                                                    .country("x")
                                                    .description("x")
                                                    .expirationDate(LocalDate.parse("2019-12-27"))
                                                    .fileId("string")
                                                    .build()
                                            )
                                            .build()
                                    )
                                    .build()
                            )
                            .build()
                    )
                    .description("x")
                    .relationship(EntityCreateParams.Relationship.AFFILIATED)
                    .supplementalDocuments(
                        listOf(
                            EntityCreateParams.SupplementalDocument.builder()
                                .fileId("string")
                                .build()
                        )
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
                .apiKey("test-api-key")
                .build()
        val entityService = client.entities()
        val entity =
            entityService.retrieve(EntityRetrieveParams.builder().entityId("string").build())
        println(entity)
        entity.validate()
    }

    @Test
    fun callList() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .build()
        val entityService = client.entities()
        val entityList = entityService.list(EntityListParams.builder().build())
        println(entityList)
        entityList.data().forEach { it.validate() }
    }
}
