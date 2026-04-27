// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.lockboxaddresses

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.increase.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LockboxAddressTest {

    @Test
    fun create() {
        val lockboxAddress =
            LockboxAddress.builder()
                .id("lockbox_address_lw6sbzl9ol5dfd8hdml6")
                .address(
                    LockboxAddress.Address.builder()
                        .city("San Francisco")
                        .line1("1234 Market St")
                        .line2("Ste 567")
                        .postalCode("94114")
                        .state("CA")
                        .build()
                )
                .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                .description("Lockbox Address 1")
                .idempotencyKey(null)
                .status(LockboxAddress.Status.ACTIVE)
                .type(LockboxAddress.Type.LOCKBOX_ADDRESS)
                .build()

        assertThat(lockboxAddress.id()).isEqualTo("lockbox_address_lw6sbzl9ol5dfd8hdml6")
        assertThat(lockboxAddress.address())
            .contains(
                LockboxAddress.Address.builder()
                    .city("San Francisco")
                    .line1("1234 Market St")
                    .line2("Ste 567")
                    .postalCode("94114")
                    .state("CA")
                    .build()
            )
        assertThat(lockboxAddress.createdAt())
            .isEqualTo(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
        assertThat(lockboxAddress.description()).contains("Lockbox Address 1")
        assertThat(lockboxAddress.idempotencyKey()).isEmpty
        assertThat(lockboxAddress.status()).isEqualTo(LockboxAddress.Status.ACTIVE)
        assertThat(lockboxAddress.type()).isEqualTo(LockboxAddress.Type.LOCKBOX_ADDRESS)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val lockboxAddress =
            LockboxAddress.builder()
                .id("lockbox_address_lw6sbzl9ol5dfd8hdml6")
                .address(
                    LockboxAddress.Address.builder()
                        .city("San Francisco")
                        .line1("1234 Market St")
                        .line2("Ste 567")
                        .postalCode("94114")
                        .state("CA")
                        .build()
                )
                .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                .description("Lockbox Address 1")
                .idempotencyKey(null)
                .status(LockboxAddress.Status.ACTIVE)
                .type(LockboxAddress.Type.LOCKBOX_ADDRESS)
                .build()

        val roundtrippedLockboxAddress =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(lockboxAddress),
                jacksonTypeRef<LockboxAddress>(),
            )

        assertThat(roundtrippedLockboxAddress).isEqualTo(lockboxAddress)
    }
}
