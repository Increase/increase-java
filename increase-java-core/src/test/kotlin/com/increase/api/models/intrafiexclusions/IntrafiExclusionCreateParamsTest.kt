// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.intrafiexclusions

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IntrafiExclusionCreateParamsTest {

    @Test
    fun create() {
        IntrafiExclusionCreateParams.builder()
            .entityId("entity_n8y8tnk2p9339ti393yi")
            .fdicCertificateNumber("314159")
            .build()
    }

    @Test
    fun body() {
        val params =
            IntrafiExclusionCreateParams.builder()
                .entityId("entity_n8y8tnk2p9339ti393yi")
                .fdicCertificateNumber("314159")
                .build()

        val body = params._body()

        assertThat(body.entityId()).isEqualTo("entity_n8y8tnk2p9339ti393yi")
        assertThat(body.fdicCertificateNumber()).isEqualTo("314159")
    }
}
