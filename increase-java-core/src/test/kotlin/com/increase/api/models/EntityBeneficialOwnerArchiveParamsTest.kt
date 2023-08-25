package com.increase.api.models

import com.increase.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class EntityBeneficialOwnerArchiveParamsTest {

    @Test
    fun createEntityBeneficialOwnerArchiveParams() {
        EntityBeneficialOwnerArchiveParams.builder()
            .beneficialOwnerId("string")
            .entityId("string")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            EntityBeneficialOwnerArchiveParams.builder()
                .beneficialOwnerId("string")
                .entityId("string")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.beneficialOwnerId()).isEqualTo("string")
        assertThat(body.entityId()).isEqualTo("string")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            EntityBeneficialOwnerArchiveParams.builder()
                .beneficialOwnerId("string")
                .entityId("string")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.beneficialOwnerId()).isEqualTo("string")
        assertThat(body.entityId()).isEqualTo("string")
    }
}
