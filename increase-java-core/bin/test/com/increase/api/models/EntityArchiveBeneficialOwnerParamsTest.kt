// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.increase.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class EntityArchiveBeneficialOwnerParamsTest {

    @Test
    fun createEntityArchiveBeneficialOwnerParams() {
        EntityArchiveBeneficialOwnerParams.builder()
            .entityId("entity_id")
            .beneficialOwnerId("beneficial_owner_id")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            EntityArchiveBeneficialOwnerParams.builder()
                .entityId("entity_id")
                .beneficialOwnerId("beneficial_owner_id")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.beneficialOwnerId()).isEqualTo("beneficial_owner_id")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            EntityArchiveBeneficialOwnerParams.builder()
                .entityId("entity_id")
                .beneficialOwnerId("beneficial_owner_id")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.beneficialOwnerId()).isEqualTo("beneficial_owner_id")
    }

    @Test
    fun getPathParam() {
        val params =
            EntityArchiveBeneficialOwnerParams.builder()
                .entityId("entity_id")
                .beneficialOwnerId("beneficial_owner_id")
                .build()
        assertThat(params).isNotNull
        // path param "entityId"
        assertThat(params.getPathParam(0)).isEqualTo("entity_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
