// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class EntityArchiveBeneficialOwnerParamsTest {

    @Test
    fun create() {
        EntityArchiveBeneficialOwnerParams.builder()
            .entityId("entity_n8y8tnk2p9339ti393yi")
            .beneficialOwnerId("entity_setup_beneficial_owner_submission_vgkyk7dj5eb4sfhdbkx7")
            .build()
    }

    @Test
    fun body() {
        val params =
            EntityArchiveBeneficialOwnerParams.builder()
                .entityId("entity_n8y8tnk2p9339ti393yi")
                .beneficialOwnerId("entity_setup_beneficial_owner_submission_vgkyk7dj5eb4sfhdbkx7")
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.beneficialOwnerId())
            .isEqualTo("entity_setup_beneficial_owner_submission_vgkyk7dj5eb4sfhdbkx7")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            EntityArchiveBeneficialOwnerParams.builder()
                .entityId("entity_n8y8tnk2p9339ti393yi")
                .beneficialOwnerId("entity_setup_beneficial_owner_submission_vgkyk7dj5eb4sfhdbkx7")
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.beneficialOwnerId())
            .isEqualTo("entity_setup_beneficial_owner_submission_vgkyk7dj5eb4sfhdbkx7")
    }

    @Test
    fun getPathParam() {
        val params =
            EntityArchiveBeneficialOwnerParams.builder()
                .entityId("entity_n8y8tnk2p9339ti393yi")
                .beneficialOwnerId("entity_setup_beneficial_owner_submission_vgkyk7dj5eb4sfhdbkx7")
                .build()
        assertThat(params).isNotNull
        // path param "entityId"
        assertThat(params.getPathParam(0)).isEqualTo("entity_n8y8tnk2p9339ti393yi")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
