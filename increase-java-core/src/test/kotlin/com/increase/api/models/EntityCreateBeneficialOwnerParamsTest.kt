// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class EntityCreateBeneficialOwnerParamsTest {

    @Test
    fun createEntityCreateBeneficialOwnerParams() {
        EntityCreateBeneficialOwnerParams.builder()
            .entityId("entity_n8y8tnk2p9339ti393yi")
            .beneficialOwner(
                EntityCreateBeneficialOwnerParams.BeneficialOwner.builder()
                    .individual(
                        EntityCreateBeneficialOwnerParams.BeneficialOwner.Individual.builder()
                            .address(
                                EntityCreateBeneficialOwnerParams.BeneficialOwner.Individual.Address
                                    .builder()
                                    .city("New York")
                                    .line1("33 Liberty Street")
                                    .state("NY")
                                    .zip("10045")
                                    .line2("x")
                                    .build()
                            )
                            .dateOfBirth(LocalDate.parse("1970-01-31"))
                            .identification(
                                EntityCreateBeneficialOwnerParams.BeneficialOwner.Individual
                                    .Identification
                                    .builder()
                                    .method(
                                        EntityCreateBeneficialOwnerParams.BeneficialOwner.Individual
                                            .Identification
                                            .Method
                                            .SOCIAL_SECURITY_NUMBER
                                    )
                                    .number("078051120")
                                    .driversLicense(
                                        EntityCreateBeneficialOwnerParams.BeneficialOwner.Individual
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
                                        EntityCreateBeneficialOwnerParams.BeneficialOwner.Individual
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
                                        EntityCreateBeneficialOwnerParams.BeneficialOwner.Individual
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
                    .addProng(EntityCreateBeneficialOwnerParams.BeneficialOwner.Prong.OWNERSHIP)
                    .companyTitle("CEO")
                    .build()
            )
            .build()
    }

    @Test
    fun getBody() {
        val params =
            EntityCreateBeneficialOwnerParams.builder()
                .entityId("entity_n8y8tnk2p9339ti393yi")
                .beneficialOwner(
                    EntityCreateBeneficialOwnerParams.BeneficialOwner.builder()
                        .individual(
                            EntityCreateBeneficialOwnerParams.BeneficialOwner.Individual.builder()
                                .address(
                                    EntityCreateBeneficialOwnerParams.BeneficialOwner.Individual
                                        .Address
                                        .builder()
                                        .city("New York")
                                        .line1("33 Liberty Street")
                                        .state("NY")
                                        .zip("10045")
                                        .line2("x")
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
                        .addProng(EntityCreateBeneficialOwnerParams.BeneficialOwner.Prong.OWNERSHIP)
                        .companyTitle("CEO")
                        .build()
                )
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.beneficialOwner())
            .isEqualTo(
                EntityCreateBeneficialOwnerParams.BeneficialOwner.builder()
                    .individual(
                        EntityCreateBeneficialOwnerParams.BeneficialOwner.Individual.builder()
                            .address(
                                EntityCreateBeneficialOwnerParams.BeneficialOwner.Individual.Address
                                    .builder()
                                    .city("New York")
                                    .line1("33 Liberty Street")
                                    .state("NY")
                                    .zip("10045")
                                    .line2("x")
                                    .build()
                            )
                            .dateOfBirth(LocalDate.parse("1970-01-31"))
                            .identification(
                                EntityCreateBeneficialOwnerParams.BeneficialOwner.Individual
                                    .Identification
                                    .builder()
                                    .method(
                                        EntityCreateBeneficialOwnerParams.BeneficialOwner.Individual
                                            .Identification
                                            .Method
                                            .SOCIAL_SECURITY_NUMBER
                                    )
                                    .number("078051120")
                                    .driversLicense(
                                        EntityCreateBeneficialOwnerParams.BeneficialOwner.Individual
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
                                        EntityCreateBeneficialOwnerParams.BeneficialOwner.Individual
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
                                        EntityCreateBeneficialOwnerParams.BeneficialOwner.Individual
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
                    .addProng(EntityCreateBeneficialOwnerParams.BeneficialOwner.Prong.OWNERSHIP)
                    .companyTitle("CEO")
                    .build()
            )
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            EntityCreateBeneficialOwnerParams.builder()
                .entityId("entity_n8y8tnk2p9339ti393yi")
                .beneficialOwner(
                    EntityCreateBeneficialOwnerParams.BeneficialOwner.builder()
                        .individual(
                            EntityCreateBeneficialOwnerParams.BeneficialOwner.Individual.builder()
                                .address(
                                    EntityCreateBeneficialOwnerParams.BeneficialOwner.Individual
                                        .Address
                                        .builder()
                                        .city("New York")
                                        .line1("33 Liberty Street")
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
                                        .build()
                                )
                                .name("Ian Crease")
                                .build()
                        )
                        .addProng(EntityCreateBeneficialOwnerParams.BeneficialOwner.Prong.OWNERSHIP)
                        .build()
                )
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.beneficialOwner())
            .isEqualTo(
                EntityCreateBeneficialOwnerParams.BeneficialOwner.builder()
                    .individual(
                        EntityCreateBeneficialOwnerParams.BeneficialOwner.Individual.builder()
                            .address(
                                EntityCreateBeneficialOwnerParams.BeneficialOwner.Individual.Address
                                    .builder()
                                    .city("New York")
                                    .line1("33 Liberty Street")
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
                                        EntityCreateBeneficialOwnerParams.BeneficialOwner.Individual
                                            .Identification
                                            .Method
                                            .SOCIAL_SECURITY_NUMBER
                                    )
                                    .number("078051120")
                                    .build()
                            )
                            .name("Ian Crease")
                            .build()
                    )
                    .addProng(EntityCreateBeneficialOwnerParams.BeneficialOwner.Prong.OWNERSHIP)
                    .build()
            )
    }

    @Test
    fun getPathParam() {
        val params =
            EntityCreateBeneficialOwnerParams.builder()
                .entityId("entity_n8y8tnk2p9339ti393yi")
                .beneficialOwner(
                    EntityCreateBeneficialOwnerParams.BeneficialOwner.builder()
                        .individual(
                            EntityCreateBeneficialOwnerParams.BeneficialOwner.Individual.builder()
                                .address(
                                    EntityCreateBeneficialOwnerParams.BeneficialOwner.Individual
                                        .Address
                                        .builder()
                                        .city("New York")
                                        .line1("33 Liberty Street")
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
                                        .build()
                                )
                                .name("Ian Crease")
                                .build()
                        )
                        .addProng(EntityCreateBeneficialOwnerParams.BeneficialOwner.Prong.OWNERSHIP)
                        .build()
                )
                .build()
        assertThat(params).isNotNull
        // path param "entityId"
        assertThat(params.getPathParam(0)).isEqualTo("entity_n8y8tnk2p9339ti393yi")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
