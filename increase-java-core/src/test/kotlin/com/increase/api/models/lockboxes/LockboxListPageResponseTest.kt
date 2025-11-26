// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.lockboxes

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.increase.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LockboxListPageResponseTest {

    @Test
    fun create() {
        val lockboxListPageResponse =
            LockboxListPageResponse.builder()
                .addData(
                    Lockbox.builder()
                        .id("lockbox_3xt21ok13q19advds4t5")
                        .accountId("account_in71c4amph0vgo2qllky")
                        .address(
                            Lockbox.Address.builder()
                                .city("San Francisco")
                                .line1("1234 Market St")
                                .line2("Ste 567")
                                .postalCode("94114")
                                .recipient("Company Inc. ATTN: VRE6P")
                                .state("CA")
                                .build()
                        )
                        .checkDepositBehavior(Lockbox.CheckDepositBehavior.ENABLED)
                        .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .description("Lockbox 1")
                        .idempotencyKey(null)
                        .recipientName("Company Inc.")
                        .type(Lockbox.Type.LOCKBOX)
                        .build()
                )
                .nextCursor("v57w5d")
                .build()

        assertThat(lockboxListPageResponse.data())
            .containsExactly(
                Lockbox.builder()
                    .id("lockbox_3xt21ok13q19advds4t5")
                    .accountId("account_in71c4amph0vgo2qllky")
                    .address(
                        Lockbox.Address.builder()
                            .city("San Francisco")
                            .line1("1234 Market St")
                            .line2("Ste 567")
                            .postalCode("94114")
                            .recipient("Company Inc. ATTN: VRE6P")
                            .state("CA")
                            .build()
                    )
                    .checkDepositBehavior(Lockbox.CheckDepositBehavior.ENABLED)
                    .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                    .description("Lockbox 1")
                    .idempotencyKey(null)
                    .recipientName("Company Inc.")
                    .type(Lockbox.Type.LOCKBOX)
                    .build()
            )
        assertThat(lockboxListPageResponse.nextCursor()).contains("v57w5d")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val lockboxListPageResponse =
            LockboxListPageResponse.builder()
                .addData(
                    Lockbox.builder()
                        .id("lockbox_3xt21ok13q19advds4t5")
                        .accountId("account_in71c4amph0vgo2qllky")
                        .address(
                            Lockbox.Address.builder()
                                .city("San Francisco")
                                .line1("1234 Market St")
                                .line2("Ste 567")
                                .postalCode("94114")
                                .recipient("Company Inc. ATTN: VRE6P")
                                .state("CA")
                                .build()
                        )
                        .checkDepositBehavior(Lockbox.CheckDepositBehavior.ENABLED)
                        .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .description("Lockbox 1")
                        .idempotencyKey(null)
                        .recipientName("Company Inc.")
                        .type(Lockbox.Type.LOCKBOX)
                        .build()
                )
                .nextCursor("v57w5d")
                .build()

        val roundtrippedLockboxListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(lockboxListPageResponse),
                jacksonTypeRef<LockboxListPageResponse>(),
            )

        assertThat(roundtrippedLockboxListPageResponse).isEqualTo(lockboxListPageResponse)
    }
}
