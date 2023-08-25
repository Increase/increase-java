package com.increase.api.models

import com.increase.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CheckDepositCreateParamsTest {

    @Test
    fun createCheckDepositCreateParams() {
        CheckDepositCreateParams.builder()
            .accountId("string")
            .amount(123L)
            .backImageFileId("string")
            .currency("x")
            .frontImageFileId("string")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            CheckDepositCreateParams.builder()
                .accountId("string")
                .amount(123L)
                .backImageFileId("string")
                .currency("x")
                .frontImageFileId("string")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.accountId()).isEqualTo("string")
        assertThat(body.amount()).isEqualTo(123L)
        assertThat(body.backImageFileId()).isEqualTo("string")
        assertThat(body.currency()).isEqualTo("x")
        assertThat(body.frontImageFileId()).isEqualTo("string")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            CheckDepositCreateParams.builder()
                .accountId("string")
                .amount(123L)
                .backImageFileId("string")
                .currency("x")
                .frontImageFileId("string")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.accountId()).isEqualTo("string")
        assertThat(body.amount()).isEqualTo(123L)
        assertThat(body.backImageFileId()).isEqualTo("string")
        assertThat(body.currency()).isEqualTo("x")
        assertThat(body.frontImageFileId()).isEqualTo("string")
    }
}
