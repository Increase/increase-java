// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.increase.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class EntityBeneficialOwnerArchiveParamsTest {

    @Test
    fun createEntityBeneficialOwnerArchiveParams() {
        EntityBeneficialOwnerArchiveParams.builder()
            .beneficialOwnerId("beneficial_owner_id")
            .entityId("entity_id")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            EntityBeneficialOwnerArchiveParams.builder()
                .beneficialOwnerId("beneficial_owner_id")
                .entityId("entity_id")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.beneficialOwnerId()).isEqualTo("beneficial_owner_id")
        assertThat(body.entityId()).isEqualTo("entity_id")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            EntityBeneficialOwnerArchiveParams.builder()
                .beneficialOwnerId("beneficial_owner_id")
                .entityId("entity_id")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.beneficialOwnerId()).isEqualTo("beneficial_owner_id")
        assertThat(body.entityId()).isEqualTo("entity_id")
    }
}
