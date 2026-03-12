// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.beneficialowners

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.increase.api.core.jsonMapper
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BeneficialOwnerListPageResponseTest {

    @Test
    fun create() {
        val beneficialOwnerListPageResponse =
            BeneficialOwnerListPageResponse.builder()
                .addData(
                    EntityBeneficialOwner.builder()
                        .id("entity_beneficial_owner_vozma8szzu1sxezp5zq6")
                        .companyTitle("CEO")
                        .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .entityId("entity_n8y8tnk2p9339ti393yi")
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
                )
                .nextCursor("v57w5d")
                .build()

        assertThat(beneficialOwnerListPageResponse.data())
            .containsExactly(
                EntityBeneficialOwner.builder()
                    .id("entity_beneficial_owner_vozma8szzu1sxezp5zq6")
                    .companyTitle("CEO")
                    .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                    .entityId("entity_n8y8tnk2p9339ti393yi")
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
            )
        assertThat(beneficialOwnerListPageResponse.nextCursor()).contains("v57w5d")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val beneficialOwnerListPageResponse =
            BeneficialOwnerListPageResponse.builder()
                .addData(
                    EntityBeneficialOwner.builder()
                        .id("entity_beneficial_owner_vozma8szzu1sxezp5zq6")
                        .companyTitle("CEO")
                        .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .entityId("entity_n8y8tnk2p9339ti393yi")
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
                )
                .nextCursor("v57w5d")
                .build()

        val roundtrippedBeneficialOwnerListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(beneficialOwnerListPageResponse),
                jacksonTypeRef<BeneficialOwnerListPageResponse>(),
            )

        assertThat(roundtrippedBeneficialOwnerListPageResponse)
            .isEqualTo(beneficialOwnerListPageResponse)
    }
}
