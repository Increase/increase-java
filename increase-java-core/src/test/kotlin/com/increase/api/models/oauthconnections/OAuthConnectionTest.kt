// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.oauthconnections

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OAuthConnectionTest {

    @Test
    fun create() {
        val oauthConnection =
            OAuthConnection.builder()
                .id("connection_dauknoksyr4wilz4e6my")
                .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                .deletedAt(null)
                .groupId("group_1g4mhziu6kvrs3vz35um")
                .oauthApplicationId("application_gj9ufmpgh5i56k4vyriy")
                .status(OAuthConnection.Status.ACTIVE)
                .type(OAuthConnection.Type.OAUTH_CONNECTION)
                .build()

        assertThat(oauthConnection.id()).isEqualTo("connection_dauknoksyr4wilz4e6my")
        assertThat(oauthConnection.createdAt())
            .isEqualTo(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
        assertThat(oauthConnection.deletedAt()).isEmpty
        assertThat(oauthConnection.groupId()).isEqualTo("group_1g4mhziu6kvrs3vz35um")
        assertThat(oauthConnection.oauthApplicationId())
            .isEqualTo("application_gj9ufmpgh5i56k4vyriy")
        assertThat(oauthConnection.status()).isEqualTo(OAuthConnection.Status.ACTIVE)
        assertThat(oauthConnection.type()).isEqualTo(OAuthConnection.Type.OAUTH_CONNECTION)
    }
}
