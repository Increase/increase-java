// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class OAuthConnectionRetrieveParamsTest {

    @Test
    fun create() {
        OAuthConnectionRetrieveParams.builder()
            .oauthConnectionId("connection_dauknoksyr4wilz4e6my")
            .build()
    }

    @Test
    fun getPathParam() {
        val params =
            OAuthConnectionRetrieveParams.builder()
                .oauthConnectionId("connection_dauknoksyr4wilz4e6my")
                .build()
        assertThat(params).isNotNull
        // path param "oauthConnectionId"
        assertThat(params.getPathParam(0)).isEqualTo("connection_dauknoksyr4wilz4e6my")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
