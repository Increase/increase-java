// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SupplementalDocumentCreateParamsTest {

    @Test
    fun createSupplementalDocumentCreateParams() {
        SupplementalDocumentCreateParams.builder().entityId("entity_id").fileId("file_id").build()
    }

    @Test
    fun getBody() {
        val params =
            SupplementalDocumentCreateParams.builder()
                .entityId("entity_id")
                .fileId("file_id")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.entityId()).isEqualTo("entity_id")
        assertThat(body.fileId()).isEqualTo("file_id")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            SupplementalDocumentCreateParams.builder()
                .entityId("entity_id")
                .fileId("file_id")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.entityId()).isEqualTo("entity_id")
        assertThat(body.fileId()).isEqualTo("file_id")
    }
}
