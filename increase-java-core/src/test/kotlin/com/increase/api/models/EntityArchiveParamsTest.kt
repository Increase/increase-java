// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class EntityArchiveParamsTest {

    @Test
    fun createEntityArchiveParams() {
        EntityArchiveParams.builder().entityId("entity_id").build()
    }

    @Test
    fun getPathParam() {
        val params = EntityArchiveParams.builder().entityId("entity_id").build()
        assertThat(params).isNotNull
        // path param "entityId"
        assertThat(params.getPathParam(0)).isEqualTo("entity_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
