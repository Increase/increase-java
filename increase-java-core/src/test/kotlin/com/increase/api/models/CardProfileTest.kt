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
                .description("string")
                .digitalWallets(
                    CardProfile.DigitalWallets.builder()
                        .appIconFileId("string")
                        .backgroundImageFileId("string")
                        .cardDescription("string")
                        .contactEmail("string")
                        .contactPhone("string")
                        .contactWebsite("string")
                        .issuerName("string")
                        .textColor(
                            CardProfile.DigitalWallets.TextColor.builder()
                                .blue(123L)
                                .green(123L)
                                .red(123L)
                                .build()
                        )
                        .build()
                )
                .isDefault(true)
                .physicalCards(
                    CardProfile.PhysicalCards.builder()
                        .backImageFileId("string")
                        .carrierImageFileId("string")
                        .contactPhone("string")
                        .frontImageFileId("string")
                        .status(CardProfile.PhysicalCards.Status.NOT_ELIGIBLE)
                        .build()
                )
                .status(CardProfile.Status.PENDING)
                .type(CardProfile.Type.CARD_PROFILE)
                .build()
        assertThat(cardProfile).isNotNull
        assertThat(cardProfile.id()).isEqualTo("string")
        assertThat(cardProfile.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(cardProfile.description()).isEqualTo("string")
        assertThat(cardProfile.digitalWallets())
            .isEqualTo(
                CardProfile.DigitalWallets.builder()
                    .appIconFileId("string")
                    .backgroundImageFileId("string")
                    .cardDescription("string")
                    .contactEmail("string")
                    .contactPhone("string")
                    .contactWebsite("string")
                    .issuerName("string")
                    .textColor(
                        CardProfile.DigitalWallets.TextColor.builder()
                            .blue(123L)
                            .green(123L)
                            .red(123L)
                            .build()
                    )
                    .build()
            )
        assertThat(cardProfile.isDefault()).isEqualTo(true)
        assertThat(cardProfile.physicalCards())
            .contains(
                CardProfile.PhysicalCards.builder()
                    .backImageFileId("string")
                    .carrierImageFileId("string")
                    .contactPhone("string")
                    .frontImageFileId("string")
                    .status(CardProfile.PhysicalCards.Status.NOT_ELIGIBLE)
                    .build()
            )
        assertThat(cardProfile.status()).isEqualTo(CardProfile.Status.PENDING)
        assertThat(cardProfile.type()).isEqualTo(CardProfile.Type.CARD_PROFILE)
    }
}
