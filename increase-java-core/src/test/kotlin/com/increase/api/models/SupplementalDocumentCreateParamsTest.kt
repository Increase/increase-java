// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SupplementalDocumentCreateParamsTest {

    @Test
    fun create() {
        SupplementalDocumentCreateParams.builder()
            .entityId("entity_n8y8tnk2p9339ti393yi")
            .fileId("file_makxrc67oh9l6sg7w9yc")
            .build()
    }

    @Test
    fun body() {
        val params =
            SupplementalDocumentCreateParams.builder()
                .entityId("entity_n8y8tnk2p9339ti393yi")
                .fileId("file_makxrc67oh9l6sg7w9yc")
                .build()

        val body = params._body()

        assertThat(body).isNotNull
        assertThat(body.entityId()).isEqualTo("entity_n8y8tnk2p9339ti393yi")
        assertThat(body.fileId()).isEqualTo("file_makxrc67oh9l6sg7w9yc")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            SupplementalDocumentCreateParams.builder()
                .entityId("entity_n8y8tnk2p9339ti393yi")
                .fileId("file_makxrc67oh9l6sg7w9yc")
                .build()

        val body = params._body()

        assertThat(body).isNotNull
        assertThat(body.entityId()).isEqualTo("entity_n8y8tnk2p9339ti393yi")
        assertThat(body.fileId()).isEqualTo("file_makxrc67oh9l6sg7w9yc")
    }
}
