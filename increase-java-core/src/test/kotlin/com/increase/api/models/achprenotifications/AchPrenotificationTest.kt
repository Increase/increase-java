// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.achprenotifications

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.increase.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AchPrenotificationTest {

    @Test
    fun create() {
        val achPrenotification =
            AchPrenotification.builder()
                .id("ach_prenotification_ubjf9qqsxl3obbcn1u34")
                .accountNumber("987654321")
                .addendum(null)
                .companyDescriptiveDate(null)
                .companyDiscretionaryData(null)
                .companyEntryDescription(null)
                .companyName(null)
                .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                .creditDebitIndicator(AchPrenotification.CreditDebitIndicator.CREDIT)
                .effectiveDate(null)
                .idempotencyKey(null)
                .addNotificationsOfChange(
                    AchPrenotification.NotificationsOfChange.builder()
                        .changeCode(
                            AchPrenotification.NotificationsOfChange.ChangeCode
                                .INCORRECT_ACCOUNT_NUMBER
                        )
                        .correctedData("32")
                        .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .build()
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
                .routingNumber("101050001")
                .status(AchPrenotification.Status.PENDING_SUBMITTING)
                .type(AchPrenotification.Type.ACH_PRENOTIFICATION)
                .build()

        assertThat(achPrenotification.id()).isEqualTo("ach_prenotification_ubjf9qqsxl3obbcn1u34")
        assertThat(achPrenotification.accountNumber()).isEqualTo("987654321")
        assertThat(achPrenotification.addendum()).isEmpty
        assertThat(achPrenotification.companyDescriptiveDate()).isEmpty
        assertThat(achPrenotification.companyDiscretionaryData()).isEmpty
        assertThat(achPrenotification.companyEntryDescription()).isEmpty
        assertThat(achPrenotification.companyName()).isEmpty
        assertThat(achPrenotification.createdAt())
            .isEqualTo(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
        assertThat(achPrenotification.creditDebitIndicator())
            .contains(AchPrenotification.CreditDebitIndicator.CREDIT)
        assertThat(achPrenotification.effectiveDate()).isEmpty
        assertThat(achPrenotification.idempotencyKey()).isEmpty
        assertThat(achPrenotification.notificationsOfChange())
            .containsExactly(
                AchPrenotification.NotificationsOfChange.builder()
                    .changeCode(
                        AchPrenotification.NotificationsOfChange.ChangeCode.INCORRECT_ACCOUNT_NUMBER
                    )
                    .correctedData("32")
                    .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
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
        assertThat(achPrenotification.routingNumber()).isEqualTo("101050001")
        assertThat(achPrenotification.status())
            .isEqualTo(AchPrenotification.Status.PENDING_SUBMITTING)
        assertThat(achPrenotification.type()).isEqualTo(AchPrenotification.Type.ACH_PRENOTIFICATION)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val achPrenotification =
            AchPrenotification.builder()
                .id("ach_prenotification_ubjf9qqsxl3obbcn1u34")
                .accountNumber("987654321")
                .addendum(null)
                .companyDescriptiveDate(null)
                .companyDiscretionaryData(null)
                .companyEntryDescription(null)
                .companyName(null)
                .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                .creditDebitIndicator(AchPrenotification.CreditDebitIndicator.CREDIT)
                .effectiveDate(null)
                .idempotencyKey(null)
                .addNotificationsOfChange(
                    AchPrenotification.NotificationsOfChange.builder()
                        .changeCode(
                            AchPrenotification.NotificationsOfChange.ChangeCode
                                .INCORRECT_ACCOUNT_NUMBER
                        )
                        .correctedData("32")
                        .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .build()
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
                .routingNumber("101050001")
                .status(AchPrenotification.Status.PENDING_SUBMITTING)
                .type(AchPrenotification.Type.ACH_PRENOTIFICATION)
                .build()

        val roundtrippedAchPrenotification =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(achPrenotification),
                jacksonTypeRef<AchPrenotification>(),
            )

        assertThat(roundtrippedAchPrenotification).isEqualTo(achPrenotification)
    }
}
