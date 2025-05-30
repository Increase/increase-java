// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.lockboxes

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.increase.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LockboxTest {

    @Test
    fun create() {
        val lockbox =
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
                .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                .description("Lockbox 1")
                .idempotencyKey(null)
                .recipientName("Company Inc.")
                .status(Lockbox.Status.ACTIVE)
                .type(Lockbox.Type.LOCKBOX)
                .build()

        assertThat(lockbox.id()).isEqualTo("lockbox_3xt21ok13q19advds4t5")
        assertThat(lockbox.accountId()).isEqualTo("account_in71c4amph0vgo2qllky")
        assertThat(lockbox.address())
            .isEqualTo(
                Lockbox.Address.builder()
                    .city("San Francisco")
                    .line1("1234 Market St")
                    .line2("Ste 567")
                    .postalCode("94114")
                    .recipient("Company Inc. ATTN: VRE6P")
                    .state("CA")
                    .build()
            )
        assertThat(lockbox.createdAt()).isEqualTo(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
        assertThat(lockbox.description()).contains("Lockbox 1")
        assertThat(lockbox.idempotencyKey()).isEmpty
        assertThat(lockbox.recipientName()).contains("Company Inc.")
        assertThat(lockbox.status()).isEqualTo(Lockbox.Status.ACTIVE)
        assertThat(lockbox.type()).isEqualTo(Lockbox.Type.LOCKBOX)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val lockbox =
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
                .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                .description("Lockbox 1")
                .idempotencyKey(null)
                .recipientName("Company Inc.")
                .status(Lockbox.Status.ACTIVE)
                .type(Lockbox.Type.LOCKBOX)
                .build()

        val roundtrippedLockbox =
            jsonMapper.readValue(jsonMapper.writeValueAsString(lockbox), jacksonTypeRef<Lockbox>())

        assertThat(roundtrippedLockbox).isEqualTo(lockbox)
    }
}
