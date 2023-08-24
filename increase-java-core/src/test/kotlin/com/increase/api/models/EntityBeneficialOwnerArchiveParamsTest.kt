package com.increase.api.models

import com.increase.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class EntityBeneficialOwnerArchiveParamsTest {

    @Test
    fun createEntityBeneficialOwnerArchiveParams() {
        EntityBeneficialOwnerArchiveParams.builder()
            .entityId("string")
            .beneficialOwnerId("string")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            EntityBeneficialOwnerArchiveParams.builder()
                .entityId("string")
                .beneficialOwnerId("string")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.entityId()).isEqualTo("string")
        assertThat(body.beneficialOwnerId()).isEqualTo("string")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            EntityBeneficialOwnerArchiveParams.builder()
                .entityId("string")
                .beneficialOwnerId("string")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.entityId()).isEqualTo("string")
        assertThat(body.beneficialOwnerId()).isEqualTo("string")
    }
}
