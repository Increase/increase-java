// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.beneficialowners

import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BeneficialOwnerCreateParamsTest {

    @Test
    fun create() {
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
                                BeneficialOwnerCreateParams.Individual.Identification.DriversLicense
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
                                BeneficialOwnerCreateParams.Individual.Identification.Passport
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
    }

    @Test
    fun body() {
        val params =
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
                                    BeneficialOwnerCreateParams.Individual.Identification.Passport
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

        val body = params._body()

        assertThat(body.entityId()).isEqualTo("entity_n8y8tnk2p9339ti393yi")
        assertThat(body.individual())
            .isEqualTo(
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
                                BeneficialOwnerCreateParams.Individual.Identification.DriversLicense
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
                                BeneficialOwnerCreateParams.Individual.Identification.Passport
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
        assertThat(body.prongs()).containsExactly(BeneficialOwnerCreateParams.Prong.CONTROL)
        assertThat(body.companyTitle()).contains("CEO")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            BeneficialOwnerCreateParams.builder()
                .entityId("entity_n8y8tnk2p9339ti393yi")
                .individual(
                    BeneficialOwnerCreateParams.Individual.builder()
                        .address(
                            BeneficialOwnerCreateParams.Individual.Address.builder()
                                .city("New York")
                                .country("US")
                                .line1("33 Liberty Street")
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
                                .build()
                        )
                        .name("Ian Crease")
                        .build()
                )
                .addProng(BeneficialOwnerCreateParams.Prong.CONTROL)
                .build()

        val body = params._body()

        assertThat(body.entityId()).isEqualTo("entity_n8y8tnk2p9339ti393yi")
        assertThat(body.individual())
            .isEqualTo(
                BeneficialOwnerCreateParams.Individual.builder()
                    .address(
                        BeneficialOwnerCreateParams.Individual.Address.builder()
                            .city("New York")
                            .country("US")
                            .line1("33 Liberty Street")
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
                            .build()
                    )
                    .name("Ian Crease")
                    .build()
            )
        assertThat(body.prongs()).containsExactly(BeneficialOwnerCreateParams.Prong.CONTROL)
    }
}
