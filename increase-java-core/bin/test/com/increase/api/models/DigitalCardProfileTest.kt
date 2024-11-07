// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DigitalCardProfileTest {

    @Test
    fun createDigitalCardProfile() {
        val digitalCardProfile =
            DigitalCardProfile.builder()
                .id("id")
                .appIconFileId("app_icon_file_id")
                .backgroundImageFileId("background_image_file_id")
                .cardDescription("card_description")
                .contactEmail("contact_email")
                .contactPhone("contact_phone")
                .contactWebsite("contact_website")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("description")
                .idempotencyKey("idempotency_key")
                .issuerName("issuer_name")
                .status(DigitalCardProfile.Status.PENDING)
                .textColor(
                    DigitalCardProfile.TextColor.builder().blue(123L).green(123L).red(123L).build()
                )
                .type(DigitalCardProfile.Type.DIGITAL_CARD_PROFILE)
                .build()
        assertThat(digitalCardProfile).isNotNull
        assertThat(digitalCardProfile.id()).isEqualTo("id")
        assertThat(digitalCardProfile.appIconFileId()).isEqualTo("app_icon_file_id")
        assertThat(digitalCardProfile.backgroundImageFileId()).isEqualTo("background_image_file_id")
        assertThat(digitalCardProfile.cardDescription()).isEqualTo("card_description")
        assertThat(digitalCardProfile.contactEmail()).contains("contact_email")
        assertThat(digitalCardProfile.contactPhone()).contains("contact_phone")
        assertThat(digitalCardProfile.contactWebsite()).contains("contact_website")
        assertThat(digitalCardProfile.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(digitalCardProfile.description()).isEqualTo("description")
        assertThat(digitalCardProfile.idempotencyKey()).contains("idempotency_key")
        assertThat(digitalCardProfile.issuerName()).isEqualTo("issuer_name")
        assertThat(digitalCardProfile.status()).isEqualTo(DigitalCardProfile.Status.PENDING)
        assertThat(digitalCardProfile.textColor())
            .isEqualTo(
                DigitalCardProfile.TextColor.builder().blue(123L).green(123L).red(123L).build()
            )
        assertThat(digitalCardProfile.type())
            .isEqualTo(DigitalCardProfile.Type.DIGITAL_CARD_PROFILE)
    }
}
