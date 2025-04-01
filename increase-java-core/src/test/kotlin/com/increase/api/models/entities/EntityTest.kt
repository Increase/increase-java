// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.entities

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.increase.api.core.jsonMapper
import com.increase.api.models.supplementaldocuments.EntitySupplementalDocument
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EntityTest {

    @Test
    fun create() {
        val entity =
            Entity.builder()
                .id("entity_n8y8tnk2p9339ti393yi")
                .corporation(
                    Entity.Corporation.builder()
                        .address(
                            Entity.Corporation.Address.builder()
                                .city("New York")
                                .line1("33 Liberty Street")
                                .line2(null)
                                .state("NY")
                                .zip("10045")
                                .build()
                        )
                        .addBeneficialOwner(
                            Entity.Corporation.BeneficialOwner.builder()
                                .beneficialOwnerId(
                                    "entity_setup_beneficial_owner_submission_vgkyk7dj5eb4sfhdbkx7"
                                )
                                .companyTitle("CEO")
                                .individual(
                                    Entity.Corporation.BeneficialOwner.Individual.builder()
                                        .address(
                                            Entity.Corporation.BeneficialOwner.Individual.Address
                                                .builder()
                                                .city("New York")
                                                .country("US")
                                                .line1("33 Liberty Street")
                                                .line2(null)
                                                .state("NY")
                                                .zip("10045")
                                                .build()
                                        )
                                        .dateOfBirth(LocalDate.parse("1970-01-31"))
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
                                                .numberLast4("1120")
                                                .build()
                                        )
                                        .name("Ian Crease")
                                        .build()
                                )
                                .prong(Entity.Corporation.BeneficialOwner.Prong.OWNERSHIP)
                                .build()
                        )
                        .incorporationState("NY")
                        .industryCode(null)
                        .name("National Phonograph Company")
                        .taxIdentifier("602214076")
                        .website("https://example.com")
                        .build()
                )
                .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                .description(null)
                .detailsConfirmedAt(null)
                .governmentAuthority(
                    Entity.GovernmentAuthority.builder()
                        .address(
                            Entity.GovernmentAuthority.Address.builder()
                                .city("New York")
                                .line1("33 Liberty Street")
                                .line2(null)
                                .state("NY")
                                .zip("10045")
                                .build()
                        )
                        .addAuthorizedPerson(
                            Entity.GovernmentAuthority.AuthorizedPerson.builder()
                                .authorizedPersonId("authorized_person_id")
                                .name("name")
                                .build()
                        )
                        .category(Entity.GovernmentAuthority.Category.MUNICIPALITY)
                        .name("name")
                        .taxIdentifier("tax_identifier")
                        .website("website")
                        .build()
                )
                .idempotencyKey(null)
                .joint(
                    Entity.Joint.builder()
                        .addIndividual(
                            Entity.Joint.Individual.builder()
                                .address(
                                    Entity.Joint.Individual.Address.builder()
                                        .city("New York")
                                        .line1("33 Liberty Street")
                                        .line2(null)
                                        .state("NY")
                                        .zip("10045")
                                        .build()
                                )
                                .dateOfBirth(LocalDate.parse("2019-12-27"))
                                .identification(
                                    Entity.Joint.Individual.Identification.builder()
                                        .method(
                                            Entity.Joint.Individual.Identification.Method
                                                .SOCIAL_SECURITY_NUMBER
                                        )
                                        .numberLast4("number_last4")
                                        .build()
                                )
                                .name("name")
                                .build()
                        )
                        .name("name")
                        .build()
                )
                .naturalPerson(
                    Entity.NaturalPerson.builder()
                        .address(
                            Entity.NaturalPerson.Address.builder()
                                .city("New York")
                                .line1("33 Liberty Street")
                                .line2(null)
                                .state("NY")
                                .zip("10045")
                                .build()
                        )
                        .dateOfBirth(LocalDate.parse("2019-12-27"))
                        .identification(
                            Entity.NaturalPerson.Identification.builder()
                                .method(
                                    Entity.NaturalPerson.Identification.Method
                                        .SOCIAL_SECURITY_NUMBER
                                )
                                .numberLast4("number_last4")
                                .build()
                        )
                        .name("name")
                        .build()
                )
                .status(Entity.Status.ACTIVE)
                .structure(Entity.Structure.CORPORATION)
                .addSupplementalDocument(
                    EntitySupplementalDocument.builder()
                        .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .entityId("entity_n8y8tnk2p9339ti393yi")
                        .fileId("file_makxrc67oh9l6sg7w9yc")
                        .idempotencyKey(null)
                        .type(EntitySupplementalDocument.Type.ENTITY_SUPPLEMENTAL_DOCUMENT)
                        .build()
                )
                .thirdPartyVerification(
                    Entity.ThirdPartyVerification.builder()
                        .reference("reference")
                        .vendor(Entity.ThirdPartyVerification.Vendor.ALLOY)
                        .build()
                )
                .trust(
                    Entity.Trust.builder()
                        .address(
                            Entity.Trust.Address.builder()
                                .city("New York")
                                .line1("33 Liberty Street")
                                .line2(null)
                                .state("NY")
                                .zip("10045")
                                .build()
                        )
                        .category(Entity.Trust.Category.REVOCABLE)
                        .formationDocumentFileId("formation_document_file_id")
                        .formationState("formation_state")
                        .grantor(
                            Entity.Trust.Grantor.builder()
                                .address(
                                    Entity.Trust.Grantor.Address.builder()
                                        .city("New York")
                                        .line1("33 Liberty Street")
                                        .line2(null)
                                        .state("NY")
                                        .zip("10045")
                                        .build()
                                )
                                .dateOfBirth(LocalDate.parse("2019-12-27"))
                                .identification(
                                    Entity.Trust.Grantor.Identification.builder()
                                        .method(
                                            Entity.Trust.Grantor.Identification.Method
                                                .SOCIAL_SECURITY_NUMBER
                                        )
                                        .numberLast4("number_last4")
                                        .build()
                                )
                                .name("name")
                                .build()
                        )
                        .name("name")
                        .taxIdentifier("tax_identifier")
                        .addTrustee(
                            Entity.Trust.Trustee.builder()
                                .individual(
                                    Entity.Trust.Trustee.Individual.builder()
                                        .address(
                                            Entity.Trust.Trustee.Individual.Address.builder()
                                                .city("New York")
                                                .line1("33 Liberty Street")
                                                .line2(null)
                                                .state("NY")
                                                .zip("10045")
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
                                                .numberLast4("number_last4")
                                                .build()
                                        )
                                        .name("name")
                                        .build()
                                )
                                .structure(Entity.Trust.Trustee.Structure.INDIVIDUAL)
                                .build()
                        )
                        .build()
                )
                .type(Entity.Type.ENTITY)
                .build()

        assertThat(entity.id()).isEqualTo("entity_n8y8tnk2p9339ti393yi")
        assertThat(entity.corporation())
            .contains(
                Entity.Corporation.builder()
                    .address(
                        Entity.Corporation.Address.builder()
                            .city("New York")
                            .line1("33 Liberty Street")
                            .line2(null)
                            .state("NY")
                            .zip("10045")
                            .build()
                    )
                    .addBeneficialOwner(
                        Entity.Corporation.BeneficialOwner.builder()
                            .beneficialOwnerId(
                                "entity_setup_beneficial_owner_submission_vgkyk7dj5eb4sfhdbkx7"
                            )
                            .companyTitle("CEO")
                            .individual(
                                Entity.Corporation.BeneficialOwner.Individual.builder()
                                    .address(
                                        Entity.Corporation.BeneficialOwner.Individual.Address
                                            .builder()
                                            .city("New York")
                                            .country("US")
                                            .line1("33 Liberty Street")
                                            .line2(null)
                                            .state("NY")
                                            .zip("10045")
                                            .build()
                                    )
                                    .dateOfBirth(LocalDate.parse("1970-01-31"))
                                    .identification(
                                        Entity.Corporation.BeneficialOwner.Individual.Identification
                                            .builder()
                                            .method(
                                                Entity.Corporation.BeneficialOwner.Individual
                                                    .Identification
                                                    .Method
                                                    .SOCIAL_SECURITY_NUMBER
                                            )
                                            .numberLast4("1120")
                                            .build()
                                    )
                                    .name("Ian Crease")
                                    .build()
                            )
                            .prong(Entity.Corporation.BeneficialOwner.Prong.OWNERSHIP)
                            .build()
                    )
                    .incorporationState("NY")
                    .industryCode(null)
                    .name("National Phonograph Company")
                    .taxIdentifier("602214076")
                    .website("https://example.com")
                    .build()
            )
        assertThat(entity.createdAt()).isEqualTo(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
        assertThat(entity.description()).isEmpty
        assertThat(entity.detailsConfirmedAt()).isEmpty
        assertThat(entity.governmentAuthority())
            .contains(
                Entity.GovernmentAuthority.builder()
                    .address(
                        Entity.GovernmentAuthority.Address.builder()
                            .city("New York")
                            .line1("33 Liberty Street")
                            .line2(null)
                            .state("NY")
                            .zip("10045")
                            .build()
                    )
                    .addAuthorizedPerson(
                        Entity.GovernmentAuthority.AuthorizedPerson.builder()
                            .authorizedPersonId("authorized_person_id")
                            .name("name")
                            .build()
                    )
                    .category(Entity.GovernmentAuthority.Category.MUNICIPALITY)
                    .name("name")
                    .taxIdentifier("tax_identifier")
                    .website("website")
                    .build()
            )
        assertThat(entity.idempotencyKey()).isEmpty
        assertThat(entity.joint())
            .contains(
                Entity.Joint.builder()
                    .addIndividual(
                        Entity.Joint.Individual.builder()
                            .address(
                                Entity.Joint.Individual.Address.builder()
                                    .city("New York")
                                    .line1("33 Liberty Street")
                                    .line2(null)
                                    .state("NY")
                                    .zip("10045")
                                    .build()
                            )
                            .dateOfBirth(LocalDate.parse("2019-12-27"))
                            .identification(
                                Entity.Joint.Individual.Identification.builder()
                                    .method(
                                        Entity.Joint.Individual.Identification.Method
                                            .SOCIAL_SECURITY_NUMBER
                                    )
                                    .numberLast4("number_last4")
                                    .build()
                            )
                            .name("name")
                            .build()
                    )
                    .name("name")
                    .build()
            )
        assertThat(entity.naturalPerson())
            .contains(
                Entity.NaturalPerson.builder()
                    .address(
                        Entity.NaturalPerson.Address.builder()
                            .city("New York")
                            .line1("33 Liberty Street")
                            .line2(null)
                            .state("NY")
                            .zip("10045")
                            .build()
                    )
                    .dateOfBirth(LocalDate.parse("2019-12-27"))
                    .identification(
                        Entity.NaturalPerson.Identification.builder()
                            .method(
                                Entity.NaturalPerson.Identification.Method.SOCIAL_SECURITY_NUMBER
                            )
                            .numberLast4("number_last4")
                            .build()
                    )
                    .name("name")
                    .build()
            )
        assertThat(entity.status()).isEqualTo(Entity.Status.ACTIVE)
        assertThat(entity.structure()).isEqualTo(Entity.Structure.CORPORATION)
        assertThat(entity.supplementalDocuments())
            .containsExactly(
                EntitySupplementalDocument.builder()
                    .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                    .entityId("entity_n8y8tnk2p9339ti393yi")
                    .fileId("file_makxrc67oh9l6sg7w9yc")
                    .idempotencyKey(null)
                    .type(EntitySupplementalDocument.Type.ENTITY_SUPPLEMENTAL_DOCUMENT)
                    .build()
            )
        assertThat(entity.thirdPartyVerification())
            .contains(
                Entity.ThirdPartyVerification.builder()
                    .reference("reference")
                    .vendor(Entity.ThirdPartyVerification.Vendor.ALLOY)
                    .build()
            )
        assertThat(entity.trust())
            .contains(
                Entity.Trust.builder()
                    .address(
                        Entity.Trust.Address.builder()
                            .city("New York")
                            .line1("33 Liberty Street")
                            .line2(null)
                            .state("NY")
                            .zip("10045")
                            .build()
                    )
                    .category(Entity.Trust.Category.REVOCABLE)
                    .formationDocumentFileId("formation_document_file_id")
                    .formationState("formation_state")
                    .grantor(
                        Entity.Trust.Grantor.builder()
                            .address(
                                Entity.Trust.Grantor.Address.builder()
                                    .city("New York")
                                    .line1("33 Liberty Street")
                                    .line2(null)
                                    .state("NY")
                                    .zip("10045")
                                    .build()
                            )
                            .dateOfBirth(LocalDate.parse("2019-12-27"))
                            .identification(
                                Entity.Trust.Grantor.Identification.builder()
                                    .method(
                                        Entity.Trust.Grantor.Identification.Method
                                            .SOCIAL_SECURITY_NUMBER
                                    )
                                    .numberLast4("number_last4")
                                    .build()
                            )
                            .name("name")
                            .build()
                    )
                    .name("name")
                    .taxIdentifier("tax_identifier")
                    .addTrustee(
                        Entity.Trust.Trustee.builder()
                            .individual(
                                Entity.Trust.Trustee.Individual.builder()
                                    .address(
                                        Entity.Trust.Trustee.Individual.Address.builder()
                                            .city("New York")
                                            .line1("33 Liberty Street")
                                            .line2(null)
                                            .state("NY")
                                            .zip("10045")
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
                                            .numberLast4("number_last4")
                                            .build()
                                    )
                                    .name("name")
                                    .build()
                            )
                            .structure(Entity.Trust.Trustee.Structure.INDIVIDUAL)
                            .build()
                    )
                    .build()
            )
        assertThat(entity.type()).isEqualTo(Entity.Type.ENTITY)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val entity =
            Entity.builder()
                .id("entity_n8y8tnk2p9339ti393yi")
                .corporation(
                    Entity.Corporation.builder()
                        .address(
                            Entity.Corporation.Address.builder()
                                .city("New York")
                                .line1("33 Liberty Street")
                                .line2(null)
                                .state("NY")
                                .zip("10045")
                                .build()
                        )
                        .addBeneficialOwner(
                            Entity.Corporation.BeneficialOwner.builder()
                                .beneficialOwnerId(
                                    "entity_setup_beneficial_owner_submission_vgkyk7dj5eb4sfhdbkx7"
                                )
                                .companyTitle("CEO")
                                .individual(
                                    Entity.Corporation.BeneficialOwner.Individual.builder()
                                        .address(
                                            Entity.Corporation.BeneficialOwner.Individual.Address
                                                .builder()
                                                .city("New York")
                                                .country("US")
                                                .line1("33 Liberty Street")
                                                .line2(null)
                                                .state("NY")
                                                .zip("10045")
                                                .build()
                                        )
                                        .dateOfBirth(LocalDate.parse("1970-01-31"))
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
                                                .numberLast4("1120")
                                                .build()
                                        )
                                        .name("Ian Crease")
                                        .build()
                                )
                                .prong(Entity.Corporation.BeneficialOwner.Prong.OWNERSHIP)
                                .build()
                        )
                        .incorporationState("NY")
                        .industryCode(null)
                        .name("National Phonograph Company")
                        .taxIdentifier("602214076")
                        .website("https://example.com")
                        .build()
                )
                .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                .description(null)
                .detailsConfirmedAt(null)
                .governmentAuthority(
                    Entity.GovernmentAuthority.builder()
                        .address(
                            Entity.GovernmentAuthority.Address.builder()
                                .city("New York")
                                .line1("33 Liberty Street")
                                .line2(null)
                                .state("NY")
                                .zip("10045")
                                .build()
                        )
                        .addAuthorizedPerson(
                            Entity.GovernmentAuthority.AuthorizedPerson.builder()
                                .authorizedPersonId("authorized_person_id")
                                .name("name")
                                .build()
                        )
                        .category(Entity.GovernmentAuthority.Category.MUNICIPALITY)
                        .name("name")
                        .taxIdentifier("tax_identifier")
                        .website("website")
                        .build()
                )
                .idempotencyKey(null)
                .joint(
                    Entity.Joint.builder()
                        .addIndividual(
                            Entity.Joint.Individual.builder()
                                .address(
                                    Entity.Joint.Individual.Address.builder()
                                        .city("New York")
                                        .line1("33 Liberty Street")
                                        .line2(null)
                                        .state("NY")
                                        .zip("10045")
                                        .build()
                                )
                                .dateOfBirth(LocalDate.parse("2019-12-27"))
                                .identification(
                                    Entity.Joint.Individual.Identification.builder()
                                        .method(
                                            Entity.Joint.Individual.Identification.Method
                                                .SOCIAL_SECURITY_NUMBER
                                        )
                                        .numberLast4("number_last4")
                                        .build()
                                )
                                .name("name")
                                .build()
                        )
                        .name("name")
                        .build()
                )
                .naturalPerson(
                    Entity.NaturalPerson.builder()
                        .address(
                            Entity.NaturalPerson.Address.builder()
                                .city("New York")
                                .line1("33 Liberty Street")
                                .line2(null)
                                .state("NY")
                                .zip("10045")
                                .build()
                        )
                        .dateOfBirth(LocalDate.parse("2019-12-27"))
                        .identification(
                            Entity.NaturalPerson.Identification.builder()
                                .method(
                                    Entity.NaturalPerson.Identification.Method
                                        .SOCIAL_SECURITY_NUMBER
                                )
                                .numberLast4("number_last4")
                                .build()
                        )
                        .name("name")
                        .build()
                )
                .status(Entity.Status.ACTIVE)
                .structure(Entity.Structure.CORPORATION)
                .addSupplementalDocument(
                    EntitySupplementalDocument.builder()
                        .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .entityId("entity_n8y8tnk2p9339ti393yi")
                        .fileId("file_makxrc67oh9l6sg7w9yc")
                        .idempotencyKey(null)
                        .type(EntitySupplementalDocument.Type.ENTITY_SUPPLEMENTAL_DOCUMENT)
                        .build()
                )
                .thirdPartyVerification(
                    Entity.ThirdPartyVerification.builder()
                        .reference("reference")
                        .vendor(Entity.ThirdPartyVerification.Vendor.ALLOY)
                        .build()
                )
                .trust(
                    Entity.Trust.builder()
                        .address(
                            Entity.Trust.Address.builder()
                                .city("New York")
                                .line1("33 Liberty Street")
                                .line2(null)
                                .state("NY")
                                .zip("10045")
                                .build()
                        )
                        .category(Entity.Trust.Category.REVOCABLE)
                        .formationDocumentFileId("formation_document_file_id")
                        .formationState("formation_state")
                        .grantor(
                            Entity.Trust.Grantor.builder()
                                .address(
                                    Entity.Trust.Grantor.Address.builder()
                                        .city("New York")
                                        .line1("33 Liberty Street")
                                        .line2(null)
                                        .state("NY")
                                        .zip("10045")
                                        .build()
                                )
                                .dateOfBirth(LocalDate.parse("2019-12-27"))
                                .identification(
                                    Entity.Trust.Grantor.Identification.builder()
                                        .method(
                                            Entity.Trust.Grantor.Identification.Method
                                                .SOCIAL_SECURITY_NUMBER
                                        )
                                        .numberLast4("number_last4")
                                        .build()
                                )
                                .name("name")
                                .build()
                        )
                        .name("name")
                        .taxIdentifier("tax_identifier")
                        .addTrustee(
                            Entity.Trust.Trustee.builder()
                                .individual(
                                    Entity.Trust.Trustee.Individual.builder()
                                        .address(
                                            Entity.Trust.Trustee.Individual.Address.builder()
                                                .city("New York")
                                                .line1("33 Liberty Street")
                                                .line2(null)
                                                .state("NY")
                                                .zip("10045")
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
                                                .numberLast4("number_last4")
                                                .build()
                                        )
                                        .name("name")
                                        .build()
                                )
                                .structure(Entity.Trust.Trustee.Structure.INDIVIDUAL)
                                .build()
                        )
                        .build()
                )
                .type(Entity.Type.ENTITY)
                .build()

        val roundtrippedEntity =
            jsonMapper.readValue(jsonMapper.writeValueAsString(entity), jacksonTypeRef<Entity>())

        assertThat(roundtrippedEntity).isEqualTo(entity)
    }
}
