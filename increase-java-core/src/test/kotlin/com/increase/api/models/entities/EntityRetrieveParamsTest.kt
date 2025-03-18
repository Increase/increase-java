// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.entities

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EntityRetrieveParamsTest {

    @Test
    fun create() {
        EntityRetrieveParams.builder().entityId("entity_n8y8tnk2p9339ti393yi").build()
    }

    @Test
    fun pathParams() {
        val params = EntityRetrieveParams.builder().entityId("entity_n8y8tnk2p9339ti393yi").build()

        assertThat(params._pathParam(0)).isEqualTo("entity_n8y8tnk2p9339ti393yi")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
