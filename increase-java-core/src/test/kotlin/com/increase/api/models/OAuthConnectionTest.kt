// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class OAuthConnectionTest {

    @Test
    fun createOAuthConnection() {
        val oauthConnection =
            OAuthConnection.builder()
                .id("string")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .groupId("string")
                .status(OAuthConnection.Status.ACTIVE)
                .type(OAuthConnection.Type.OAUTH_CONNECTION)
                .build()
        assertThat(oauthConnection).isNotNull
        assertThat(oauthConnection.id()).isEqualTo("string")
        assertThat(oauthConnection.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(oauthConnection.groupId()).isEqualTo("string")
        assertThat(oauthConnection.status()).isEqualTo(OAuthConnection.Status.ACTIVE)
        assertThat(oauthConnection.type()).isEqualTo(OAuthConnection.Type.OAUTH_CONNECTION)
    }
}
