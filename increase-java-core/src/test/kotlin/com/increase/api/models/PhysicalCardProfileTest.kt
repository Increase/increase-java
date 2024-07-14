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
                .id("id")
                .backImageFileId("back_image_file_id")
                .carrierImageFileId("carrier_image_file_id")
                .contactPhone("contact_phone")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .creator(PhysicalCardProfile.Creator.INCREASE)
                .description("description")
                .frontImageFileId("front_image_file_id")
                .idempotencyKey("idempotency_key")
                .isDefault(true)
                .status(PhysicalCardProfile.Status.PENDING_CREATING)
                .type(PhysicalCardProfile.Type.PHYSICAL_CARD_PROFILE)
                .build()
        assertThat(physicalCardProfile).isNotNull
        assertThat(physicalCardProfile.id()).isEqualTo("id")
        assertThat(physicalCardProfile.backImageFileId()).contains("back_image_file_id")
        assertThat(physicalCardProfile.carrierImageFileId()).contains("carrier_image_file_id")
        assertThat(physicalCardProfile.contactPhone()).contains("contact_phone")
        assertThat(physicalCardProfile.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(physicalCardProfile.creator()).isEqualTo(PhysicalCardProfile.Creator.INCREASE)
        assertThat(physicalCardProfile.description()).isEqualTo("description")
        assertThat(physicalCardProfile.frontImageFileId()).contains("front_image_file_id")
        assertThat(physicalCardProfile.idempotencyKey()).contains("idempotency_key")
        assertThat(physicalCardProfile.isDefault()).isEqualTo(true)
        assertThat(physicalCardProfile.status())
            .isEqualTo(PhysicalCardProfile.Status.PENDING_CREATING)
        assertThat(physicalCardProfile.type())
            .isEqualTo(PhysicalCardProfile.Type.PHYSICAL_CARD_PROFILE)
    }
}
