// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.lockboxaddresses

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.increase.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LockboxAddressListPageResponseTest {

    @Test
    fun create() {
        val lockboxAddressListPageResponse =
            LockboxAddressListPageResponse.builder()
                .addData(
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
                )
                .nextCursor("v57w5d")
                .build()

        assertThat(lockboxAddressListPageResponse.data())
            .containsExactly(
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
            )
        assertThat(lockboxAddressListPageResponse.nextCursor()).contains("v57w5d")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val lockboxAddressListPageResponse =
            LockboxAddressListPageResponse.builder()
                .addData(
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
                )
                .nextCursor("v57w5d")
                .build()

        val roundtrippedLockboxAddressListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(lockboxAddressListPageResponse),
                jacksonTypeRef<LockboxAddressListPageResponse>(),
            )

        assertThat(roundtrippedLockboxAddressListPageResponse)
            .isEqualTo(lockboxAddressListPageResponse)
    }
}
