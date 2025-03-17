// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.checkdeposits

import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CheckDepositCreateParamsTest {

    @Test
    fun create() {
        CheckDepositCreateParams.builder()
            .accountId("account_in71c4amph0vgo2qllky")
            .amount(1000L)
            .backImageFileId("file_26khfk98mzfz90a11oqx")
            .frontImageFileId("file_hkv175ovmc2tb2v2zbrm")
            .description("Vendor payment")
            .build()
    }

    @Test
    fun body() {
        val params =
            CheckDepositCreateParams.builder()
                .accountId("account_in71c4amph0vgo2qllky")
                .amount(1000L)
                .backImageFileId("file_26khfk98mzfz90a11oqx")
                .frontImageFileId("file_hkv175ovmc2tb2v2zbrm")
                .description("Vendor payment")
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.accountId()).isEqualTo("account_in71c4amph0vgo2qllky")
        assertThat(body.amount()).isEqualTo(1000L)
        assertThat(body.backImageFileId()).isEqualTo("file_26khfk98mzfz90a11oqx")
        assertThat(body.frontImageFileId()).isEqualTo("file_hkv175ovmc2tb2v2zbrm")
        assertThat(body.description()).contains("Vendor payment")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            CheckDepositCreateParams.builder()
                .accountId("account_in71c4amph0vgo2qllky")
                .amount(1000L)
                .backImageFileId("file_26khfk98mzfz90a11oqx")
                .frontImageFileId("file_hkv175ovmc2tb2v2zbrm")
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.accountId()).isEqualTo("account_in71c4amph0vgo2qllky")
        assertThat(body.amount()).isEqualTo(1000L)
        assertThat(body.backImageFileId()).isEqualTo("file_26khfk98mzfz90a11oqx")
        assertThat(body.frontImageFileId()).isEqualTo("file_hkv175ovmc2tb2v2zbrm")
    }
}
