// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.oauthtokens

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.increase.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OAuthTokenTest {

    @Test
    fun create() {
        val oauthToken =
            OAuthToken.builder()
                .accessToken("12345")
                .groupId("group_1g4mhziu6kvrs3vz35um")
                .tokenType(OAuthToken.TokenType.BEARER)
                .type(OAuthToken.Type.OAUTH_TOKEN)
                .build()

        assertThat(oauthToken.accessToken()).isEqualTo("12345")
        assertThat(oauthToken.groupId()).isEqualTo("group_1g4mhziu6kvrs3vz35um")
        assertThat(oauthToken.tokenType()).isEqualTo(OAuthToken.TokenType.BEARER)
        assertThat(oauthToken.type()).isEqualTo(OAuthToken.Type.OAUTH_TOKEN)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val oauthToken =
            OAuthToken.builder()
                .accessToken("12345")
                .groupId("group_1g4mhziu6kvrs3vz35um")
                .tokenType(OAuthToken.TokenType.BEARER)
                .type(OAuthToken.Type.OAUTH_TOKEN)
                .build()

        val roundtrippedOAuthToken =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(oauthToken),
                jacksonTypeRef<OAuthToken>(),
            )

        assertThat(roundtrippedOAuthToken).isEqualTo(oauthToken)
    }
}
