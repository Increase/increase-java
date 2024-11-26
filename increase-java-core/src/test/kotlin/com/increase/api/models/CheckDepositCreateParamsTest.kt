// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.increase.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CheckDepositCreateParamsTest {

    @Test
    fun createCheckDepositCreateParams() {
        CheckDepositCreateParams.builder()
            .accountId("account_id")
            .amount(0L)
            .backImageFileId("back_image_file_id")
            .frontImageFileId("front_image_file_id")
            .description("x")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            CheckDepositCreateParams.builder()
                .accountId("account_id")
                .amount(0L)
                .backImageFileId("back_image_file_id")
                .frontImageFileId("front_image_file_id")
                .description("x")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.accountId()).isEqualTo("account_id")
        assertThat(body.amount()).isEqualTo(0L)
        assertThat(body.backImageFileId()).isEqualTo("back_image_file_id")
        assertThat(body.frontImageFileId()).isEqualTo("front_image_file_id")
        assertThat(body.description()).isEqualTo("x")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            CheckDepositCreateParams.builder()
                .accountId("account_id")
                .amount(0L)
                .backImageFileId("back_image_file_id")
                .frontImageFileId("front_image_file_id")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.accountId()).isEqualTo("account_id")
        assertThat(body.amount()).isEqualTo(0L)
        assertThat(body.backImageFileId()).isEqualTo("back_image_file_id")
        assertThat(body.frontImageFileId()).isEqualTo("front_image_file_id")
    }
}
