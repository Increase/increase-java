// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.oauthconnections

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.increase.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OAuthConnectionListPageResponseTest {

    @Test
    fun create() {
        val oauthConnectionListPageResponse =
            OAuthConnectionListPageResponse.builder()
                .addData(
                    OAuthConnection.builder()
                        .id("connection_dauknoksyr4wilz4e6my")
                        .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .deletedAt(null)
                        .groupId("group_1g4mhziu6kvrs3vz35um")
                        .oauthApplicationId("application_gj9ufmpgh5i56k4vyriy")
                        .status(OAuthConnection.Status.ACTIVE)
                        .type(OAuthConnection.Type.OAUTH_CONNECTION)
                        .build()
                )
                .nextCursor("v57w5d")
                .build()

        assertThat(oauthConnectionListPageResponse.data())
            .containsExactly(
                OAuthConnection.builder()
                    .id("connection_dauknoksyr4wilz4e6my")
                    .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                    .deletedAt(null)
                    .groupId("group_1g4mhziu6kvrs3vz35um")
                    .oauthApplicationId("application_gj9ufmpgh5i56k4vyriy")
                    .status(OAuthConnection.Status.ACTIVE)
                    .type(OAuthConnection.Type.OAUTH_CONNECTION)
                    .build()
            )
        assertThat(oauthConnectionListPageResponse.nextCursor()).contains("v57w5d")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val oauthConnectionListPageResponse =
            OAuthConnectionListPageResponse.builder()
                .addData(
                    OAuthConnection.builder()
                        .id("connection_dauknoksyr4wilz4e6my")
                        .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .deletedAt(null)
                        .groupId("group_1g4mhziu6kvrs3vz35um")
                        .oauthApplicationId("application_gj9ufmpgh5i56k4vyriy")
                        .status(OAuthConnection.Status.ACTIVE)
                        .type(OAuthConnection.Type.OAUTH_CONNECTION)
                        .build()
                )
                .nextCursor("v57w5d")
                .build()

        val roundtrippedOAuthConnectionListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(oauthConnectionListPageResponse),
                jacksonTypeRef<OAuthConnectionListPageResponse>(),
            )

        assertThat(roundtrippedOAuthConnectionListPageResponse)
            .isEqualTo(oauthConnectionListPageResponse)
    }
}
