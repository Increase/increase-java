// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.increase.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LockboxCreateParamsTest {

    @Test
    fun createLockboxCreateParams() {
        LockboxCreateParams.builder().accountId("account_id").description("x").build()
    }

    @Test
    fun getBody() {
        val params = LockboxCreateParams.builder().accountId("account_id").description("x").build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.accountId()).isEqualTo("account_id")
        assertThat(body.description()).isEqualTo("x")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = LockboxCreateParams.builder().accountId("account_id").build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.accountId()).isEqualTo("account_id")
    }
}
