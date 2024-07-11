// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.increase.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class EntitySupplementalDocumentCreateParamsTest {

    @Test
    fun createEntitySupplementalDocumentCreateParams() {
        EntitySupplementalDocumentCreateParams.builder()
            .entityId("entity_id")
            .fileId("file_id")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            EntitySupplementalDocumentCreateParams.builder()
                .entityId("entity_id")
                .fileId("file_id")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.fileId()).isEqualTo("file_id")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            EntitySupplementalDocumentCreateParams.builder()
                .entityId("entity_id")
                .fileId("file_id")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.fileId()).isEqualTo("file_id")
    }

    @Test
    fun getPathParam() {
        val params =
            EntitySupplementalDocumentCreateParams.builder()
                .entityId("entity_id")
                .fileId("file_id")
                .build()
        assertThat(params).isNotNull
        // path param "entityId"
        assertThat(params.getPathParam(0)).isEqualTo("entity_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
