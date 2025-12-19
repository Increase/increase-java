// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.simulations.exports

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExportCreateParamsTest {

    @Test
    fun create() {
        ExportCreateParams.builder()
            .category(ExportCreateParams.Category.FORM_1099_INT)
            .form1099Int(
                ExportCreateParams.Form1099Int.builder()
                    .accountId("account_in71c4amph0vgo2qllky")
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            ExportCreateParams.builder()
                .category(ExportCreateParams.Category.FORM_1099_INT)
                .form1099Int(
                    ExportCreateParams.Form1099Int.builder()
                        .accountId("account_in71c4amph0vgo2qllky")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.category()).isEqualTo(ExportCreateParams.Category.FORM_1099_INT)
        assertThat(body.form1099Int())
            .contains(
                ExportCreateParams.Form1099Int.builder()
                    .accountId("account_in71c4amph0vgo2qllky")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ExportCreateParams.builder().category(ExportCreateParams.Category.FORM_1099_INT).build()

        val body = params._body()

        assertThat(body.category()).isEqualTo(ExportCreateParams.Category.FORM_1099_INT)
    }
}
