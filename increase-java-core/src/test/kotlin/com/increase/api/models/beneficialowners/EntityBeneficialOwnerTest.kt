// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.beneficialowners

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.increase.api.core.jsonMapper
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EntityBeneficialOwnerTest {

    @Test
    fun create() {
        val entityBeneficialOwner =
            EntityBeneficialOwner.builder()
                .id("entity_setup_beneficial_owner_submission_vgkyk7dj5eb4sfhdbkx7")
                .companyTitle("CEO")
                .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                .idempotencyKey(null)
                .individual(
                    EntityBeneficialOwner.Individual.builder()
                        .address(
                            EntityBeneficialOwner.Individual.Address.builder()
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
                            EntityBeneficialOwner.Individual.Identification.builder()
                                .method(
                                    EntityBeneficialOwner.Individual.Identification.Method
                                        .SOCIAL_SECURITY_NUMBER
                                )
                                .numberLast4("1120")
                                .build()
                        )
                        .name("Ian Crease")
                        .build()
                )
                .addProng(EntityBeneficialOwner.Prong.CONTROL)
                .addProng(EntityBeneficialOwner.Prong.OWNERSHIP)
                .type(EntityBeneficialOwner.Type.ENTITY_BENEFICIAL_OWNER)
                .build()

        assertThat(entityBeneficialOwner.id())
            .isEqualTo("entity_setup_beneficial_owner_submission_vgkyk7dj5eb4sfhdbkx7")
        assertThat(entityBeneficialOwner.companyTitle()).contains("CEO")
        assertThat(entityBeneficialOwner.createdAt())
            .isEqualTo(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
        assertThat(entityBeneficialOwner.idempotencyKey()).isEmpty
        assertThat(entityBeneficialOwner.individual())
            .isEqualTo(
                EntityBeneficialOwner.Individual.builder()
                    .address(
                        EntityBeneficialOwner.Individual.Address.builder()
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
                        EntityBeneficialOwner.Individual.Identification.builder()
                            .method(
                                EntityBeneficialOwner.Individual.Identification.Method
                                    .SOCIAL_SECURITY_NUMBER
                            )
                            .numberLast4("1120")
                            .build()
                    )
                    .name("Ian Crease")
                    .build()
            )
        assertThat(entityBeneficialOwner.prongs())
            .containsExactly(
                EntityBeneficialOwner.Prong.CONTROL,
                EntityBeneficialOwner.Prong.OWNERSHIP,
            )
        assertThat(entityBeneficialOwner.type())
            .isEqualTo(EntityBeneficialOwner.Type.ENTITY_BENEFICIAL_OWNER)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val entityBeneficialOwner =
            EntityBeneficialOwner.builder()
                .id("entity_setup_beneficial_owner_submission_vgkyk7dj5eb4sfhdbkx7")
                .companyTitle("CEO")
                .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                .idempotencyKey(null)
                .individual(
                    EntityBeneficialOwner.Individual.builder()
                        .address(
                            EntityBeneficialOwner.Individual.Address.builder()
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
                            EntityBeneficialOwner.Individual.Identification.builder()
                                .method(
                                    EntityBeneficialOwner.Individual.Identification.Method
                                        .SOCIAL_SECURITY_NUMBER
                                )
                                .numberLast4("1120")
                                .build()
                        )
                        .name("Ian Crease")
                        .build()
                )
                .addProng(EntityBeneficialOwner.Prong.CONTROL)
                .addProng(EntityBeneficialOwner.Prong.OWNERSHIP)
                .type(EntityBeneficialOwner.Type.ENTITY_BENEFICIAL_OWNER)
                .build()

        val roundtrippedEntityBeneficialOwner =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(entityBeneficialOwner),
                jacksonTypeRef<EntityBeneficialOwner>(),
            )

        assertThat(roundtrippedEntityBeneficialOwner).isEqualTo(entityBeneficialOwner)
    }
}
