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
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .deletedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .groupId("group_id")
                .status(OAuthConnection.Status.ACTIVE)
                .type(OAuthConnection.Type.OAUTH_CONNECTION)
                .build()
        assertThat(oauthConnection).isNotNull
        assertThat(oauthConnection.id()).isEqualTo("id")
        assertThat(oauthConnection.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(oauthConnection.deletedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(oauthConnection.groupId()).isEqualTo("group_id")
        assertThat(oauthConnection.status()).isEqualTo(OAuthConnection.Status.ACTIVE)
        assertThat(oauthConnection.type()).isEqualTo(OAuthConnection.Type.OAUTH_CONNECTION)
    }
}
