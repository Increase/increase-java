// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.increase.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class EntityBeneficialOwnerUpdateAddressParamsTest {

    @Test
    fun createEntityBeneficialOwnerUpdateAddressParams() {
        EntityBeneficialOwnerUpdateAddressParams.builder()
            .address(
                EntityBeneficialOwnerUpdateAddressParams.Address.builder()
                    .city("x")
                    .line1("x")
                    .state("x")
                    .zip("x")
                    .line2("x")
                    .build()
            )
            .beneficialOwnerId("string")
            .entityId("string")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            EntityBeneficialOwnerUpdateAddressParams.builder()
                .address(
                    EntityBeneficialOwnerUpdateAddressParams.Address.builder()
                        .city("x")
                        .line1("x")
                        .state("x")
                        .zip("x")
                        .line2("x")
                        .build()
                )
                .beneficialOwnerId("string")
                .entityId("string")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.address())
            .isEqualTo(
                EntityBeneficialOwnerUpdateAddressParams.Address.builder()
                    .city("x")
                    .line1("x")
                    .state("x")
                    .zip("x")
                    .line2("x")
                    .build()
            )
        assertThat(body.beneficialOwnerId()).isEqualTo("string")
        assertThat(body.entityId()).isEqualTo("string")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            EntityBeneficialOwnerUpdateAddressParams.builder()
                .address(
                    EntityBeneficialOwnerUpdateAddressParams.Address.builder()
                        .city("x")
                        .line1("x")
                        .state("x")
                        .zip("x")
                        .build()
                )
                .beneficialOwnerId("string")
                .entityId("string")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.address())
            .isEqualTo(
                EntityBeneficialOwnerUpdateAddressParams.Address.builder()
                    .city("x")
                    .line1("x")
                    .state("x")
                    .zip("x")
                    .build()
            )
        assertThat(body.beneficialOwnerId()).isEqualTo("string")
        assertThat(body.entityId()).isEqualTo("string")
    }
}
