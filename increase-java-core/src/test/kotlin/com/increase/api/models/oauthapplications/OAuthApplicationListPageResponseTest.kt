// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.oauthapplications

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.increase.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OAuthApplicationListPageResponseTest {

    @Test
    fun create() {
        val oauthApplicationListPageResponse =
            OAuthApplicationListPageResponse.builder()
                .addData(
                    OAuthApplication.builder()
                        .id("application_gj9ufmpgh5i56k4vyriy")
                        .clientId("client_id_ec79nb1bukwwafdewe88")
                        .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .deletedAt(null)
                        .name("Ian Crease's App")
                        .status(OAuthApplication.Status.ACTIVE)
                        .type(OAuthApplication.Type.OAUTH_APPLICATION)
                        .build()
                )
                .nextCursor("v57w5d")
                .build()

        assertThat(oauthApplicationListPageResponse.data())
            .containsExactly(
                OAuthApplication.builder()
                    .id("application_gj9ufmpgh5i56k4vyriy")
                    .clientId("client_id_ec79nb1bukwwafdewe88")
                    .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                    .deletedAt(null)
                    .name("Ian Crease's App")
                    .status(OAuthApplication.Status.ACTIVE)
                    .type(OAuthApplication.Type.OAUTH_APPLICATION)
                    .build()
            )
        assertThat(oauthApplicationListPageResponse.nextCursor()).contains("v57w5d")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val oauthApplicationListPageResponse =
            OAuthApplicationListPageResponse.builder()
                .addData(
                    OAuthApplication.builder()
                        .id("application_gj9ufmpgh5i56k4vyriy")
                        .clientId("client_id_ec79nb1bukwwafdewe88")
                        .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .deletedAt(null)
                        .name("Ian Crease's App")
                        .status(OAuthApplication.Status.ACTIVE)
                        .type(OAuthApplication.Type.OAUTH_APPLICATION)
                        .build()
                )
                .nextCursor("v57w5d")
                .build()

        val roundtrippedOAuthApplicationListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(oauthApplicationListPageResponse),
                jacksonTypeRef<OAuthApplicationListPageResponse>(),
            )

        assertThat(roundtrippedOAuthApplicationListPageResponse)
            .isEqualTo(oauthApplicationListPageResponse)
    }
}
