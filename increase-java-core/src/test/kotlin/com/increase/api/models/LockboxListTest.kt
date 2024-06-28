// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LockboxListTest {

    @Test
    fun createLockboxList() {
        val lockboxList =
            LockboxList.builder()
                .data(
                    listOf(
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
                    )
                )
                .nextCursor("string")
                .build()
        assertThat(lockboxList).isNotNull
        assertThat(lockboxList.data())
            .containsExactly(
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
            )
        assertThat(lockboxList.nextCursor()).contains("string")
    }
}
