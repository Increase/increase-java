// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class OAuthConnectionRetrieveParamsTest {

    @Test
    fun createOAuthConnectionRetrieveParams() {
        OAuthConnectionRetrieveParams.builder().oauthConnectionId("oauth_connection_id").build()
    }

    @Test
    fun getPathParam() {
        val params =
            OAuthConnectionRetrieveParams.builder().oauthConnectionId("oauth_connection_id").build()
        assertThat(params).isNotNull
        // path param "oauthConnectionId"
        assertThat(params.getPathParam(0)).isEqualTo("oauth_connection_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
