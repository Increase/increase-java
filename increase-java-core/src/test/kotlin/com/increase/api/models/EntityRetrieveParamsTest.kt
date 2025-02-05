// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class EntityRetrieveParamsTest {

    @Test
    fun create() {
        EntityRetrieveParams.builder().entityId("entity_n8y8tnk2p9339ti393yi").build()
    }

    @Test
    fun getPathParam() {
        val params = EntityRetrieveParams.builder().entityId("entity_n8y8tnk2p9339ti393yi").build()
        assertThat(params).isNotNull
        // path param "entityId"
        assertThat(params.getPathParam(0)).isEqualTo("entity_n8y8tnk2p9339ti393yi")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
