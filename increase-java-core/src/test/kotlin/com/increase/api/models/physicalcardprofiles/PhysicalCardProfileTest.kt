// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.physicalcardprofiles

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.increase.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PhysicalCardProfileTest {

    @Test
    fun create() {
        val physicalCardProfile =
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

        assertThat(physicalCardProfile.id()).isEqualTo("physical_card_profile_m534d5rn9qyy9ufqxoec")
        assertThat(physicalCardProfile.backImageFileId()).contains("file_makxrc67oh9l6sg7w9yc")
        assertThat(physicalCardProfile.carrierImageFileId()).contains("file_makxrc67oh9l6sg7w9yc")
        assertThat(physicalCardProfile.contactPhone()).contains("+16505046304")
        assertThat(physicalCardProfile.createdAt())
            .isEqualTo(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
        assertThat(physicalCardProfile.creator()).isEqualTo(PhysicalCardProfile.Creator.USER)
        assertThat(physicalCardProfile.description()).isEqualTo("Corporate logo card")
        assertThat(physicalCardProfile.frontImageFileId()).contains("file_makxrc67oh9l6sg7w9yc")
        assertThat(physicalCardProfile.idempotencyKey()).isEmpty
        assertThat(physicalCardProfile.isDefault()).isEqualTo(false)
        assertThat(physicalCardProfile.programId()).isEqualTo("program_i2v2os4mwza1oetokh9i")
        assertThat(physicalCardProfile.status()).isEqualTo(PhysicalCardProfile.Status.ACTIVE)
        assertThat(physicalCardProfile.type())
            .isEqualTo(PhysicalCardProfile.Type.PHYSICAL_CARD_PROFILE)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val physicalCardProfile =
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

        val roundtrippedPhysicalCardProfile =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(physicalCardProfile),
                jacksonTypeRef<PhysicalCardProfile>(),
            )

        assertThat(roundtrippedPhysicalCardProfile).isEqualTo(physicalCardProfile)
    }
}
