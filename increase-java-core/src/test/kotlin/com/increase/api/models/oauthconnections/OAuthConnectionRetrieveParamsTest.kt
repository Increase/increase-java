// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.oauthconnections

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OAuthConnectionRetrieveParamsTest {

    @Test
    fun create() {
        OAuthConnectionRetrieveParams.builder()
            .oauthConnectionId("connection_dauknoksyr4wilz4e6my")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            OAuthConnectionRetrieveParams.builder()
                .oauthConnectionId("connection_dauknoksyr4wilz4e6my")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("connection_dauknoksyr4wilz4e6my")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
