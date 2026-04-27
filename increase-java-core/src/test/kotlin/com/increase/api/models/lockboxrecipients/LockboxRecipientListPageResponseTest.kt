// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.lockboxrecipients

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.increase.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LockboxRecipientListPageResponseTest {

    @Test
    fun create() {
        val lockboxRecipientListPageResponse =
            LockboxRecipientListPageResponse.builder()
                .addData(
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
                )
                .nextCursor("v57w5d")
                .build()

        assertThat(lockboxRecipientListPageResponse.data())
            .containsExactly(
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
            )
        assertThat(lockboxRecipientListPageResponse.nextCursor()).contains("v57w5d")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val lockboxRecipientListPageResponse =
            LockboxRecipientListPageResponse.builder()
                .addData(
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
                )
                .nextCursor("v57w5d")
                .build()

        val roundtrippedLockboxRecipientListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(lockboxRecipientListPageResponse),
                jacksonTypeRef<LockboxRecipientListPageResponse>(),
            )

        assertThat(roundtrippedLockboxRecipientListPageResponse)
            .isEqualTo(lockboxRecipientListPageResponse)
    }
}
