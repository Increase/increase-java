// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.lockboxrecipients

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.increase.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LockboxRecipientTest {

    @Test
    fun create() {
        val lockboxRecipient =
            LockboxRecipient.builder()
                .id("lockbox_3xt21ok13q19advds4t5")
                .accountId("account_in71c4amph0vgo2qllky")
                .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                .description(null)
                .idempotencyKey(null)
                .lockboxAddressId("lockbox_address_lw6sbzl9ol5dfd8hdml6")
                .mailStopCode("VRE6P")
                .recipientName("Company Inc.")
                .status(LockboxRecipient.Status.ACTIVE)
                .type(LockboxRecipient.Type.LOCKBOX_RECIPIENT)
                .build()

        assertThat(lockboxRecipient.id()).isEqualTo("lockbox_3xt21ok13q19advds4t5")
        assertThat(lockboxRecipient.accountId()).isEqualTo("account_in71c4amph0vgo2qllky")
        assertThat(lockboxRecipient.createdAt())
            .isEqualTo(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
        assertThat(lockboxRecipient.description()).isEmpty
        assertThat(lockboxRecipient.idempotencyKey()).isEmpty
        assertThat(lockboxRecipient.lockboxAddressId())
            .isEqualTo("lockbox_address_lw6sbzl9ol5dfd8hdml6")
        assertThat(lockboxRecipient.mailStopCode()).isEqualTo("VRE6P")
        assertThat(lockboxRecipient.recipientName()).contains("Company Inc.")
        assertThat(lockboxRecipient.status()).contains(LockboxRecipient.Status.ACTIVE)
        assertThat(lockboxRecipient.type()).isEqualTo(LockboxRecipient.Type.LOCKBOX_RECIPIENT)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val lockboxRecipient =
            LockboxRecipient.builder()
                .id("lockbox_3xt21ok13q19advds4t5")
                .accountId("account_in71c4amph0vgo2qllky")
                .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                .description(null)
                .idempotencyKey(null)
                .lockboxAddressId("lockbox_address_lw6sbzl9ol5dfd8hdml6")
                .mailStopCode("VRE6P")
                .recipientName("Company Inc.")
                .status(LockboxRecipient.Status.ACTIVE)
                .type(LockboxRecipient.Type.LOCKBOX_RECIPIENT)
                .build()

        val roundtrippedLockboxRecipient =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(lockboxRecipient),
                jacksonTypeRef<LockboxRecipient>(),
            )

        assertThat(roundtrippedLockboxRecipient).isEqualTo(lockboxRecipient)
    }
}
