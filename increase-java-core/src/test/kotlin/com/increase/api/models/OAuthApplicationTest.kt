// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class OAuthApplicationTest {

    @Test
    fun createOAuthApplication() {
        val oauthApplication =
            OAuthApplication.builder()
                .id("application_gj9ufmpgh5i56k4vyriy")
                .clientId("client_id_ec79nb1bukwwafdewe88")
                .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                .deletedAt(null)
                .name("Ian Crease's App")
                .status(OAuthApplication.Status.ACTIVE)
                .type(OAuthApplication.Type.OAUTH_APPLICATION)
                .build()
        assertThat(oauthApplication).isNotNull
        assertThat(oauthApplication.id()).isEqualTo("application_gj9ufmpgh5i56k4vyriy")
        assertThat(oauthApplication.clientId()).isEqualTo("client_id_ec79nb1bukwwafdewe88")
        assertThat(oauthApplication.createdAt())
            .isEqualTo(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
        assertThat(oauthApplication.deletedAt()).isEmpty
        assertThat(oauthApplication.name()).contains("Ian Crease's App")
        assertThat(oauthApplication.status()).isEqualTo(OAuthApplication.Status.ACTIVE)
        assertThat(oauthApplication.type()).isEqualTo(OAuthApplication.Type.OAUTH_APPLICATION)
    }
}
