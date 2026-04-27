// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.lockboxrecipients

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LockboxRecipientCreateParamsTest {

    @Test
    fun create() {
        LockboxRecipientCreateParams.builder()
            .accountId("account_in71c4amph0vgo2qllky")
            .lockboxAddressId("lockbox_address_lw6sbzl9ol5dfd8hdml6")
            .description("x")
            .recipientName("Ian Crease")
            .build()
    }

    @Test
    fun body() {
        val params =
            LockboxRecipientCreateParams.builder()
                .accountId("account_in71c4amph0vgo2qllky")
                .lockboxAddressId("lockbox_address_lw6sbzl9ol5dfd8hdml6")
                .description("x")
                .recipientName("Ian Crease")
                .build()

        val body = params._body()

        assertThat(body.accountId()).isEqualTo("account_in71c4amph0vgo2qllky")
        assertThat(body.lockboxAddressId()).isEqualTo("lockbox_address_lw6sbzl9ol5dfd8hdml6")
        assertThat(body.description()).contains("x")
        assertThat(body.recipientName()).contains("Ian Crease")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            LockboxRecipientCreateParams.builder()
                .accountId("account_in71c4amph0vgo2qllky")
                .lockboxAddressId("lockbox_address_lw6sbzl9ol5dfd8hdml6")
                .build()

        val body = params._body()

        assertThat(body.accountId()).isEqualTo("account_in71c4amph0vgo2qllky")
        assertThat(body.lockboxAddressId()).isEqualTo("lockbox_address_lw6sbzl9ol5dfd8hdml6")
    }
}
