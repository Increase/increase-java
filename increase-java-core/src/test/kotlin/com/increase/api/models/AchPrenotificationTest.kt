package com.increase.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AchPrenotificationTest {

    @Test
    fun createAchPrenotification() {
        val achPrenotification =
            AchPrenotification.builder()
                .id("string")
                .accountNumber("string")
                .addendum("string")
                .companyDescriptiveDate("string")
                .companyDiscretionaryData("string")
                .companyEntryDescription("string")
                .companyName("string")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .creditDebitIndicator(AchPrenotification.CreditDebitIndicator.CREDIT)
                .effectiveDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .notificationsOfChange(
                    listOf(
                        AchPrenotification.NotificationsOfChange.builder()
                            .changeCode(
                                AchPrenotification.NotificationsOfChange.ChangeCode
                                    .INCORRECT_ACCOUNT_NUMBER
                            )
                            .correctedData("string")
                            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                )
                .prenotificationReturn(
                    AchPrenotification.PrenotificationReturn.builder()
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .returnReasonCode(
                            AchPrenotification.PrenotificationReturn.ReturnReasonCode
                                .INSUFFICIENT_FUND
                        )
                        .build()
                )
                .routingNumber("string")
                .status(AchPrenotification.Status.PENDING_SUBMITTING)
                .type(AchPrenotification.Type.ACH_PRENOTIFICATION)
                .build()
        assertThat(achPrenotification).isNotNull
        assertThat(achPrenotification.id()).isEqualTo("string")
        assertThat(achPrenotification.accountNumber()).isEqualTo("string")
        assertThat(achPrenotification.addendum()).contains("string")
        assertThat(achPrenotification.companyDescriptiveDate()).contains("string")
        assertThat(achPrenotification.companyDiscretionaryData()).contains("string")
        assertThat(achPrenotification.companyEntryDescription()).contains("string")
        assertThat(achPrenotification.companyName()).contains("string")
        assertThat(achPrenotification.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(achPrenotification.creditDebitIndicator())
            .contains(AchPrenotification.CreditDebitIndicator.CREDIT)
        assertThat(achPrenotification.effectiveDate())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(achPrenotification.notificationsOfChange())
            .containsExactly(
                AchPrenotification.NotificationsOfChange.builder()
                    .changeCode(
                        AchPrenotification.NotificationsOfChange.ChangeCode.INCORRECT_ACCOUNT_NUMBER
                    )
                    .correctedData("string")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(achPrenotification.prenotificationReturn())
            .contains(
                AchPrenotification.PrenotificationReturn.builder()
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .returnReasonCode(
                        AchPrenotification.PrenotificationReturn.ReturnReasonCode.INSUFFICIENT_FUND
                    )
                    .build()
            )
        assertThat(achPrenotification.routingNumber()).isEqualTo("string")
        assertThat(achPrenotification.status())
            .isEqualTo(AchPrenotification.Status.PENDING_SUBMITTING)
        assertThat(achPrenotification.type()).isEqualTo(AchPrenotification.Type.ACH_PRENOTIFICATION)
    }
}
