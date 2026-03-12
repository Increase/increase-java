// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.beneficialowners

import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BeneficialOwnerUpdateParamsTest {

    @Test
    fun create() {
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
                        BeneficialOwnerUpdateParams.Identification.Method.SOCIAL_SECURITY_NUMBER
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
    }

    @Test
    fun pathParams() {
        val params =
            BeneficialOwnerUpdateParams.builder()
                .entityBeneficialOwnerId(
                    "entity_setup_beneficial_owner_submission_vgkyk7dj5eb4sfhdbkx7"
                )
                .build()

        assertThat(params._pathParam(0))
            .isEqualTo("entity_setup_beneficial_owner_submission_vgkyk7dj5eb4sfhdbkx7")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
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
                            BeneficialOwnerUpdateParams.Identification.Method.SOCIAL_SECURITY_NUMBER
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

        val body = params._body()

        assertThat(body.address())
            .contains(
                BeneficialOwnerUpdateParams.Address.builder()
                    .city("New York")
                    .country("US")
                    .line1("33 Liberty Street")
                    .line2("Unit 2")
                    .state("NY")
                    .zip("10045")
                    .build()
            )
        assertThat(body.confirmedNoUsTaxId()).contains(true)
        assertThat(body.identification())
            .contains(
                BeneficialOwnerUpdateParams.Identification.builder()
                    .method(
                        BeneficialOwnerUpdateParams.Identification.Method.SOCIAL_SECURITY_NUMBER
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
        assertThat(body.name()).contains("x")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            BeneficialOwnerUpdateParams.builder()
                .entityBeneficialOwnerId(
                    "entity_setup_beneficial_owner_submission_vgkyk7dj5eb4sfhdbkx7"
                )
                .build()

        val body = params._body()
    }
}
