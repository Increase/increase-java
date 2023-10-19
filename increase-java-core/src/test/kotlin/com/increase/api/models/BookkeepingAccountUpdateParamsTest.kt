// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.increase.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class BookkeepingAccountUpdateParamsTest {

    @Test
    fun createBookkeepingAccountUpdateParams() {
        BookkeepingAccountUpdateParams.builder().bookkeepingAccountId("string").name("x").build()
    }

    @Test
    fun getBody() {
        val params =
            BookkeepingAccountUpdateParams.builder()
                .bookkeepingAccountId("string")
                .name("x")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.name()).isEqualTo("x")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            BookkeepingAccountUpdateParams.builder()
                .bookkeepingAccountId("string")
                .name("x")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.name()).isEqualTo("x")
    }

    @Test
    fun getPathParam() {
        val params =
            BookkeepingAccountUpdateParams.builder()
                .bookkeepingAccountId("string")
                .name("x")
                .build()
        assertThat(params).isNotNull
        // path param "bookkeepingAccountId"
        assertThat(params.getPathParam(0)).isEqualTo("string")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
