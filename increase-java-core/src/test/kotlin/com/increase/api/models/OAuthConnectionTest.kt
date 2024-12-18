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
                .id("connection_dauknoksyr4wilz4e6my")
                .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                .groupId("group_1g4mhziu6kvrs3vz35um")
                .status(OAuthConnection.Status.ACTIVE)
                .type(OAuthConnection.Type.OAUTH_CONNECTION)
                .build()
        assertThat(oauthConnection).isNotNull
        assertThat(oauthConnection.id()).isEqualTo("connection_dauknoksyr4wilz4e6my")
        assertThat(oauthConnection.createdAt())
            .isEqualTo(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
        assertThat(oauthConnection.groupId()).isEqualTo("group_1g4mhziu6kvrs3vz35um")
        assertThat(oauthConnection.status()).isEqualTo(OAuthConnection.Status.ACTIVE)
        assertThat(oauthConnection.type()).isEqualTo(OAuthConnection.Type.OAUTH_CONNECTION)
    }
}
