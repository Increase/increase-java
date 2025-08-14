// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.entities

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EntityUpdateBeneficialOwnerAddressParamsTest {

    @Test
    fun create() {
        EntityUpdateBeneficialOwnerAddressParams.builder()
            .entityId("entity_n8y8tnk2p9339ti393yi")
            .address(
                EntityUpdateBeneficialOwnerAddressParams.Address.builder()
                    .city("New York")
                    .country("US")
                    .line1("33 Liberty Street")
                    .line2("Unit 2")
                    .state("NY")
                    .zip("10045")
                    .build()
            )
            .beneficialOwnerId("entity_setup_beneficial_owner_submission_vgkyk7dj5eb4sfhdbkx7")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            EntityUpdateBeneficialOwnerAddressParams.builder()
                .entityId("entity_n8y8tnk2p9339ti393yi")
                .address(
                    EntityUpdateBeneficialOwnerAddressParams.Address.builder()
                        .city("New York")
                        .country("US")
                        .line1("33 Liberty Street")
                        .build()
                )
                .beneficialOwnerId("entity_setup_beneficial_owner_submission_vgkyk7dj5eb4sfhdbkx7")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("entity_n8y8tnk2p9339ti393yi")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            EntityUpdateBeneficialOwnerAddressParams.builder()
                .entityId("entity_n8y8tnk2p9339ti393yi")
                .address(
                    EntityUpdateBeneficialOwnerAddressParams.Address.builder()
                        .city("New York")
                        .country("US")
                        .line1("33 Liberty Street")
                        .line2("Unit 2")
                        .state("NY")
                        .zip("10045")
                        .build()
                )
                .beneficialOwnerId("entity_setup_beneficial_owner_submission_vgkyk7dj5eb4sfhdbkx7")
                .build()

        val body = params._body()

        assertThat(body.address())
            .isEqualTo(
                EntityUpdateBeneficialOwnerAddressParams.Address.builder()
                    .city("New York")
                    .country("US")
                    .line1("33 Liberty Street")
                    .line2("Unit 2")
                    .state("NY")
                    .zip("10045")
                    .build()
            )
        assertThat(body.beneficialOwnerId())
            .isEqualTo("entity_setup_beneficial_owner_submission_vgkyk7dj5eb4sfhdbkx7")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            EntityUpdateBeneficialOwnerAddressParams.builder()
                .entityId("entity_n8y8tnk2p9339ti393yi")
                .address(
                    EntityUpdateBeneficialOwnerAddressParams.Address.builder()
                        .city("New York")
                        .country("US")
                        .line1("33 Liberty Street")
                        .build()
                )
                .beneficialOwnerId("entity_setup_beneficial_owner_submission_vgkyk7dj5eb4sfhdbkx7")
                .build()

        val body = params._body()

        assertThat(body.address())
            .isEqualTo(
                EntityUpdateBeneficialOwnerAddressParams.Address.builder()
                    .city("New York")
                    .country("US")
                    .line1("33 Liberty Street")
                    .build()
            )
        assertThat(body.beneficialOwnerId())
            .isEqualTo("entity_setup_beneficial_owner_submission_vgkyk7dj5eb4sfhdbkx7")
    }
}
