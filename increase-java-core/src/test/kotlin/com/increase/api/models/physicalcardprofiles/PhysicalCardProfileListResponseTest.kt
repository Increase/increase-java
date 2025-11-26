// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.physicalcardprofiles

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.increase.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PhysicalCardProfileListResponseTest {

    @Test
    fun create() {
        val physicalCardProfileListResponse =
            PhysicalCardProfileListResponse.builder()
                .addData(
                    PhysicalCardProfile.builder()
                        .id("physical_card_profile_m534d5rn9qyy9ufqxoec")
                        .backImageFileId("file_makxrc67oh9l6sg7w9yc")
                        .carrierImageFileId("file_makxrc67oh9l6sg7w9yc")
                        .contactPhone("+16505046304")
                        .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .creator(PhysicalCardProfile.Creator.USER)
                        .description("Corporate logo card")
                        .frontImageFileId("file_makxrc67oh9l6sg7w9yc")
                        .idempotencyKey(null)
                        .isDefault(false)
                        .programId("program_i2v2os4mwza1oetokh9i")
                        .status(PhysicalCardProfile.Status.ACTIVE)
                        .type(PhysicalCardProfile.Type.PHYSICAL_CARD_PROFILE)
                        .build()
                )
                .nextCursor("v57w5d")
                .build()

        assertThat(physicalCardProfileListResponse.data())
            .containsExactly(
                PhysicalCardProfile.builder()
                    .id("physical_card_profile_m534d5rn9qyy9ufqxoec")
                    .backImageFileId("file_makxrc67oh9l6sg7w9yc")
                    .carrierImageFileId("file_makxrc67oh9l6sg7w9yc")
                    .contactPhone("+16505046304")
                    .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                    .creator(PhysicalCardProfile.Creator.USER)
                    .description("Corporate logo card")
                    .frontImageFileId("file_makxrc67oh9l6sg7w9yc")
                    .idempotencyKey(null)
                    .isDefault(false)
                    .programId("program_i2v2os4mwza1oetokh9i")
                    .status(PhysicalCardProfile.Status.ACTIVE)
                    .type(PhysicalCardProfile.Type.PHYSICAL_CARD_PROFILE)
                    .build()
            )
        assertThat(physicalCardProfileListResponse.nextCursor()).contains("v57w5d")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val physicalCardProfileListResponse =
            PhysicalCardProfileListResponse.builder()
                .addData(
                    PhysicalCardProfile.builder()
                        .id("physical_card_profile_m534d5rn9qyy9ufqxoec")
                        .backImageFileId("file_makxrc67oh9l6sg7w9yc")
                        .carrierImageFileId("file_makxrc67oh9l6sg7w9yc")
                        .contactPhone("+16505046304")
                        .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .creator(PhysicalCardProfile.Creator.USER)
                        .description("Corporate logo card")
                        .frontImageFileId("file_makxrc67oh9l6sg7w9yc")
                        .idempotencyKey(null)
                        .isDefault(false)
                        .programId("program_i2v2os4mwza1oetokh9i")
                        .status(PhysicalCardProfile.Status.ACTIVE)
                        .type(PhysicalCardProfile.Type.PHYSICAL_CARD_PROFILE)
                        .build()
                )
                .nextCursor("v57w5d")
                .build()

        val roundtrippedPhysicalCardProfileListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(physicalCardProfileListResponse),
                jacksonTypeRef<PhysicalCardProfileListResponse>(),
            )

        assertThat(roundtrippedPhysicalCardProfileListResponse)
            .isEqualTo(physicalCardProfileListResponse)
    }
}
