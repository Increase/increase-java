// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LockboxTest {

    @Test
    fun createLockbox() {
        val lockbox =
            Lockbox.builder()
                .id("string")
                .accountId("string")
                .address(
                    Lockbox.Address.builder()
                        .city("string")
                        .line1("string")
                        .line2("string")
                        .postalCode("string")
                        .state("string")
                        .build()
                )
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("string")
                .idempotencyKey("string")
                .status(Lockbox.Status.ACTIVE)
                .type(Lockbox.Type.LOCKBOX)
                .build()
        assertThat(lockbox).isNotNull
        assertThat(lockbox.id()).isEqualTo("string")
        assertThat(lockbox.accountId()).isEqualTo("string")
        assertThat(lockbox.address())
            .isEqualTo(
                Lockbox.Address.builder()
                    .city("string")
                    .line1("string")
                    .line2("string")
                    .postalCode("string")
                    .state("string")
                    .build()
            )
        assertThat(lockbox.createdAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(lockbox.description()).contains("string")
        assertThat(lockbox.idempotencyKey()).contains("string")
        assertThat(lockbox.status()).isEqualTo(Lockbox.Status.ACTIVE)
        assertThat(lockbox.type()).isEqualTo(Lockbox.Type.LOCKBOX)
    }
}
