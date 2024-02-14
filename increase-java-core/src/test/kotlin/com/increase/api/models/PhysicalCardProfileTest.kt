// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PhysicalCardProfileTest {

    @Test
    fun createPhysicalCardProfile() {
        val physicalCardProfile =
            PhysicalCardProfile.builder()
                .id("string")
                .backImageFileId("string")
                .carrierImageFileId("string")
                .contactPhone("string")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .creator(PhysicalCardProfile.Creator.INCREASE)
                .description("string")
                .frontImageFileId("string")
                .idempotencyKey("string")
                .isDefault(true)
                .status(PhysicalCardProfile.Status.PENDING_CREATING)
                .type(PhysicalCardProfile.Type.PHYSICAL_CARD_PROFILE)
                .build()
        assertThat(physicalCardProfile).isNotNull
        assertThat(physicalCardProfile.id()).isEqualTo("string")
        assertThat(physicalCardProfile.backImageFileId()).contains("string")
        assertThat(physicalCardProfile.carrierImageFileId()).contains("string")
        assertThat(physicalCardProfile.contactPhone()).contains("string")
        assertThat(physicalCardProfile.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(physicalCardProfile.creator()).isEqualTo(PhysicalCardProfile.Creator.INCREASE)
        assertThat(physicalCardProfile.description()).isEqualTo("string")
        assertThat(physicalCardProfile.frontImageFileId()).contains("string")
        assertThat(physicalCardProfile.idempotencyKey()).contains("string")
        assertThat(physicalCardProfile.isDefault()).isEqualTo(true)
        assertThat(physicalCardProfile.status())
            .isEqualTo(PhysicalCardProfile.Status.PENDING_CREATING)
        assertThat(physicalCardProfile.type())
            .isEqualTo(PhysicalCardProfile.Type.PHYSICAL_CARD_PROFILE)
    }
}
