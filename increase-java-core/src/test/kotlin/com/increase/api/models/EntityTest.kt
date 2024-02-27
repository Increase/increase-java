// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class EntityTest {

    @Test
    fun createEntity() {
        val entity =
            Entity.builder()
                .id("string")
                .corporation(
                    Entity.Corporation.builder()
                        .address(
                            Entity.Corporation.Address.builder()
                                .city("string")
                                .line1("string")
                                .line2("string")
                                .state("string")
                                .zip("string")
                                .build()
                        )
                        .beneficialOwners(
                            listOf(
                                Entity.Corporation.BeneficialOwner.builder()
                                    .beneficialOwnerId("string")
                                    .companyTitle("string")
                                    .individual(
                                        Entity.Corporation.BeneficialOwner.Individual.builder()
                                            .address(
                                                Entity.Corporation.BeneficialOwner.Individual
                                                    .Address
                                                    .builder()
                                                    .city("string")
                                                    .line1("string")
                                                    .line2("string")
                                                    .state("string")
                                                    .zip("string")
                                                    .build()
                                            )
                                            .dateOfBirth(LocalDate.parse("2019-12-27"))
                                            .identification(
                                                Entity.Corporation.BeneficialOwner.Individual
                                                    .Identification
                                                    .builder()
                                                    .method(
                                                        Entity.Corporation.BeneficialOwner
                                                            .Individual
                                                            .Identification
                                                            .Method
                                                            .SOCIAL_SECURITY_NUMBER
                                                    )
                                                    .numberLast4("string")
                                                    .build()
                                            )
                                            .name("string")
                                            .build()
                                    )
                                    .prong(Entity.Corporation.BeneficialOwner.Prong.OWNERSHIP)
                                    .build()
                            )
                        )
                        .incorporationState("string")
                        .industryCode("string")
                        .name("string")
                        .taxIdentifier("string")
                        .website("string")
                        .build()
                )
                .description("string")
                .idempotencyKey("string")
                .joint(
                    Entity.Joint.builder()
                        .individuals(
                            listOf(
                                Entity.Joint.Individual.builder()
                                    .address(
                                        Entity.Joint.Individual.Address.builder()
                                            .city("string")
                                            .line1("string")
                                            .line2("string")
                                            .state("string")
                                            .zip("string")
                                            .build()
                                    )
                                    .dateOfBirth(LocalDate.parse("2019-12-27"))
                                    .identification(
                                        Entity.Joint.Individual.Identification.builder()
                                            .method(
                                                Entity.Joint.Individual.Identification.Method
                                                    .SOCIAL_SECURITY_NUMBER
                                            )
                                            .numberLast4("string")
                                            .build()
                                    )
                                    .name("string")
                                    .build()
                            )
                        )
                        .name("string")
                        .build()
                )
                .naturalPerson(
                    Entity.NaturalPerson.builder()
                        .address(
                            Entity.NaturalPerson.Address.builder()
                                .city("string")
                                .line1("string")
                                .line2("string")
                                .state("string")
                                .zip("string")
                                .build()
                        )
                        .dateOfBirth(LocalDate.parse("2019-12-27"))
                        .identification(
                            Entity.NaturalPerson.Identification.builder()
                                .method(
                                    Entity.NaturalPerson.Identification.Method
                                        .SOCIAL_SECURITY_NUMBER
                                )
                                .numberLast4("string")
                                .build()
                        )
                        .name("string")
                        .build()
                )
                .status(Entity.Status.ACTIVE)
                .structure(Entity.Structure.CORPORATION)
                .supplementalDocuments(
                    listOf(
                        Entity.SupplementalDocument.builder()
                            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .fileId("string")
                            .idempotencyKey("string")
                            .type(Entity.SupplementalDocument.Type.ENTITY_SUPPLEMENTAL_DOCUMENT)
                            .build()
                    )
                )
                .trust(
                    Entity.Trust.builder()
                        .address(
                            Entity.Trust.Address.builder()
                                .city("string")
                                .line1("string")
                                .line2("string")
                                .state("string")
                                .zip("string")
                                .build()
                        )
                        .category(Entity.Trust.Category.REVOCABLE)
                        .formationDocumentFileId("string")
                        .formationState("string")
                        .grantor(
                            Entity.Trust.Grantor.builder()
                                .address(
                                    Entity.Trust.Grantor.Address.builder()
                                        .city("string")
                                        .line1("string")
                                        .line2("string")
                                        .state("string")
                                        .zip("string")
                                        .build()
                                )
                                .dateOfBirth(LocalDate.parse("2019-12-27"))
                                .identification(
                                    Entity.Trust.Grantor.Identification.builder()
                                        .method(
                                            Entity.Trust.Grantor.Identification.Method
                                                .SOCIAL_SECURITY_NUMBER
                                        )
                                        .numberLast4("string")
                                        .build()
                                )
                                .name("string")
                                .build()
                        )
                        .name("string")
                        .taxIdentifier("string")
                        .trustees(
                            listOf(
                                Entity.Trust.Trustee.builder()
                                    .individual(
                                        Entity.Trust.Trustee.Individual.builder()
                                            .address(
                                                Entity.Trust.Trustee.Individual.Address.builder()
                                                    .city("string")
                                                    .line1("string")
                                                    .line2("string")
                                                    .state("string")
                                                    .zip("string")
                                                    .build()
                                            )
                                            .dateOfBirth(LocalDate.parse("2019-12-27"))
                                            .identification(
                                                Entity.Trust.Trustee.Individual.Identification
                                                    .builder()
                                                    .method(
                                                        Entity.Trust.Trustee.Individual
                                                            .Identification
                                                            .Method
                                                            .SOCIAL_SECURITY_NUMBER
                                                    )
                                                    .numberLast4("string")
                                                    .build()
                                            )
                                            .name("string")
                                            .build()
                                    )
                                    .structure(Entity.Trust.Trustee.Structure.INDIVIDUAL)
                                    .build()
                            )
                        )
                        .build()
                )
                .type(Entity.Type.ENTITY)
                .build()
        assertThat(entity).isNotNull
        assertThat(entity.id()).isEqualTo("string")
        assertThat(entity.corporation())
            .contains(
                Entity.Corporation.builder()
                    .address(
                        Entity.Corporation.Address.builder()
                            .city("string")
                            .line1("string")
                            .line2("string")
                            .state("string")
                            .zip("string")
                            .build()
                    )
                    .beneficialOwners(
                        listOf(
                            Entity.Corporation.BeneficialOwner.builder()
                                .beneficialOwnerId("string")
                                .companyTitle("string")
                                .individual(
                                    Entity.Corporation.BeneficialOwner.Individual.builder()
                                        .address(
                                            Entity.Corporation.BeneficialOwner.Individual.Address
                                                .builder()
                                                .city("string")
                                                .line1("string")
                                                .line2("string")
                                                .state("string")
                                                .zip("string")
                                                .build()
                                        )
                                        .dateOfBirth(LocalDate.parse("2019-12-27"))
                                        .identification(
                                            Entity.Corporation.BeneficialOwner.Individual
                                                .Identification
                                                .builder()
                                                .method(
                                                    Entity.Corporation.BeneficialOwner.Individual
                                                        .Identification
                                                        .Method
                                                        .SOCIAL_SECURITY_NUMBER
                                                )
                                                .numberLast4("string")
                                                .build()
                                        )
                                        .name("string")
                                        .build()
                                )
                                .prong(Entity.Corporation.BeneficialOwner.Prong.OWNERSHIP)
                                .build()
                        )
                    )
                    .incorporationState("string")
                    .industryCode("string")
                    .name("string")
                    .taxIdentifier("string")
                    .website("string")
                    .build()
            )
        assertThat(entity.description()).contains("string")
        assertThat(entity.idempotencyKey()).contains("string")
        assertThat(entity.joint())
            .contains(
                Entity.Joint.builder()
                    .individuals(
                        listOf(
                            Entity.Joint.Individual.builder()
                                .address(
                                    Entity.Joint.Individual.Address.builder()
                                        .city("string")
                                        .line1("string")
                                        .line2("string")
                                        .state("string")
                                        .zip("string")
                                        .build()
                                )
                                .dateOfBirth(LocalDate.parse("2019-12-27"))
                                .identification(
                                    Entity.Joint.Individual.Identification.builder()
                                        .method(
                                            Entity.Joint.Individual.Identification.Method
                                                .SOCIAL_SECURITY_NUMBER
                                        )
                                        .numberLast4("string")
                                        .build()
                                )
                                .name("string")
                                .build()
                        )
                    )
                    .name("string")
                    .build()
            )
        assertThat(entity.naturalPerson())
            .contains(
                Entity.NaturalPerson.builder()
                    .address(
                        Entity.NaturalPerson.Address.builder()
                            .city("string")
                            .line1("string")
                            .line2("string")
                            .state("string")
                            .zip("string")
                            .build()
                    )
                    .dateOfBirth(LocalDate.parse("2019-12-27"))
                    .identification(
                        Entity.NaturalPerson.Identification.builder()
                            .method(
                                Entity.NaturalPerson.Identification.Method.SOCIAL_SECURITY_NUMBER
                            )
                            .numberLast4("string")
                            .build()
                    )
                    .name("string")
                    .build()
            )
        assertThat(entity.status()).isEqualTo(Entity.Status.ACTIVE)
        assertThat(entity.structure()).isEqualTo(Entity.Structure.CORPORATION)
        assertThat(entity.supplementalDocuments())
            .containsExactly(
                Entity.SupplementalDocument.builder()
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .fileId("string")
                    .idempotencyKey("string")
                    .type(Entity.SupplementalDocument.Type.ENTITY_SUPPLEMENTAL_DOCUMENT)
                    .build()
            )
        assertThat(entity.trust())
            .contains(
                Entity.Trust.builder()
                    .address(
                        Entity.Trust.Address.builder()
                            .city("string")
                            .line1("string")
                            .line2("string")
                            .state("string")
                            .zip("string")
                            .build()
                    )
                    .category(Entity.Trust.Category.REVOCABLE)
                    .formationDocumentFileId("string")
                    .formationState("string")
                    .grantor(
                        Entity.Trust.Grantor.builder()
                            .address(
                                Entity.Trust.Grantor.Address.builder()
                                    .city("string")
                                    .line1("string")
                                    .line2("string")
                                    .state("string")
                                    .zip("string")
                                    .build()
                            )
                            .dateOfBirth(LocalDate.parse("2019-12-27"))
                            .identification(
                                Entity.Trust.Grantor.Identification.builder()
                                    .method(
                                        Entity.Trust.Grantor.Identification.Method
                                            .SOCIAL_SECURITY_NUMBER
                                    )
                                    .numberLast4("string")
                                    .build()
                            )
                            .name("string")
                            .build()
                    )
                    .name("string")
                    .taxIdentifier("string")
                    .trustees(
                        listOf(
                            Entity.Trust.Trustee.builder()
                                .individual(
                                    Entity.Trust.Trustee.Individual.builder()
                                        .address(
                                            Entity.Trust.Trustee.Individual.Address.builder()
                                                .city("string")
                                                .line1("string")
                                                .line2("string")
                                                .state("string")
                                                .zip("string")
                                                .build()
                                        )
                                        .dateOfBirth(LocalDate.parse("2019-12-27"))
                                        .identification(
                                            Entity.Trust.Trustee.Individual.Identification.builder()
                                                .method(
                                                    Entity.Trust.Trustee.Individual.Identification
                                                        .Method
                                                        .SOCIAL_SECURITY_NUMBER
                                                )
                                                .numberLast4("string")
                                                .build()
                                        )
                                        .name("string")
                                        .build()
                                )
                                .structure(Entity.Trust.Trustee.Structure.INDIVIDUAL)
                                .build()
                        )
                    )
                    .build()
            )
        assertThat(entity.type()).isEqualTo(Entity.Type.ENTITY)
    }
}
