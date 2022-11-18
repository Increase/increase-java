package com.increase.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CardProfileTest {

    @Test
    fun createCardProfile() {
        val cardProfile =
            CardProfile.builder()
                .id("string")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(CardProfile.Status.PENDING)
                .description("string")
                .digitalWallets(
                    CardProfile.DigitalWallets.builder()
                        .textColor(
                            CardProfile.DigitalWallets.TextColor.builder()
                                .red(123L)
                                .green(123L)
                                .blue(123L)
                                .build()
                        )
                        .issuerName("string")
                        .cardDescription("string")
                        .contactWebsite("string")
                        .contactEmail("string")
                        .contactPhone("string")
                        .backgroundImageFileId("string")
                        .appIconFileId("string")
                        .build()
                )
                .type(CardProfile.Type.CARD_PROFILE)
                .build()
        assertThat(cardProfile).isNotNull
        assertThat(cardProfile.id()).isEqualTo("string")
        assertThat(cardProfile.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(cardProfile.status()).isEqualTo(CardProfile.Status.PENDING)
        assertThat(cardProfile.description()).isEqualTo("string")
        assertThat(cardProfile.digitalWallets())
            .isEqualTo(
                CardProfile.DigitalWallets.builder()
                    .textColor(
                        CardProfile.DigitalWallets.TextColor.builder()
                            .red(123L)
                            .green(123L)
                            .blue(123L)
                            .build()
                    )
                    .issuerName("string")
                    .cardDescription("string")
                    .contactWebsite("string")
                    .contactEmail("string")
                    .contactPhone("string")
                    .backgroundImageFileId("string")
                    .appIconFileId("string")
                    .build()
            )
        assertThat(cardProfile.type()).isEqualTo(CardProfile.Type.CARD_PROFILE)
    }
}
