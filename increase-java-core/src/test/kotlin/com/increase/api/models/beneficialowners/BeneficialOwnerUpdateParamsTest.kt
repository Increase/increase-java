// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.beneficialowners

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
