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
                .accountId(null)
                .accountNumber("987654321")
                .addendum(null)
                .companyDescriptiveDate(null)
                .companyDiscretionaryData(null)
                .companyEntryDescription(null)
                .companyName(null)
                .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                .creditDebitIndicator(null)
                .effectiveDate(null)
                .idempotencyKey(null)
                .individualId(null)
                .individualName(null)
                .addNotificationsOfChange(
                    AchPrenotification.NotificationsOfChange.builder()
                        .changeCode(
                            AchPrenotification.NotificationsOfChange.ChangeCode
                                .INCORRECT_TRANSACTION_CODE
                        )
                        .correctedData("32")
                        .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .build()
                )
                .prenotificationReturn(
                    AchPrenotification.PrenotificationReturn.builder()
                        .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .returnReasonCode(
                            AchPrenotification.PrenotificationReturn.ReturnReasonCode
                                .CORPORATE_CUSTOMER_ADVISED_NOT_AUTHORIZED
                        )
                        .build()
                )
                .routingNumber("101050001")
                .standardEntryClassCode(null)
                .status(AchPrenotification.Status.SUBMITTED)
                .type(AchPrenotification.Type.ACH_PRENOTIFICATION)
                .build()

        assertThat(achPrenotification.id()).isEqualTo("ach_prenotification_ubjf9qqsxl3obbcn1u34")
        assertThat(achPrenotification.accountId()).isEmpty
        assertThat(achPrenotification.accountNumber()).isEqualTo("987654321")
        assertThat(achPrenotification.addendum()).isEmpty
        assertThat(achPrenotification.companyDescriptiveDate()).isEmpty
        assertThat(achPrenotification.companyDiscretionaryData()).isEmpty
        assertThat(achPrenotification.companyEntryDescription()).isEmpty
        assertThat(achPrenotification.companyName()).isEmpty
        assertThat(achPrenotification.createdAt())
            .isEqualTo(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
        assertThat(achPrenotification.creditDebitIndicator()).isEmpty
        assertThat(achPrenotification.effectiveDate()).isEmpty
        assertThat(achPrenotification.idempotencyKey()).isEmpty
        assertThat(achPrenotification.individualId()).isEmpty
        assertThat(achPrenotification.individualName()).isEmpty
        assertThat(achPrenotification.notificationsOfChange())
            .containsExactly(
                AchPrenotification.NotificationsOfChange.builder()
                    .changeCode(
                        AchPrenotification.NotificationsOfChange.ChangeCode
                            .INCORRECT_TRANSACTION_CODE
                    )
                    .correctedData("32")
                    .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                    .build()
            )
        assertThat(achPrenotification.prenotificationReturn())
            .contains(
                AchPrenotification.PrenotificationReturn.builder()
                    .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                    .returnReasonCode(
                        AchPrenotification.PrenotificationReturn.ReturnReasonCode
                            .CORPORATE_CUSTOMER_ADVISED_NOT_AUTHORIZED
                    )
                    .build()
            )
        assertThat(achPrenotification.routingNumber()).isEqualTo("101050001")
        assertThat(achPrenotification.standardEntryClassCode()).isEmpty
        assertThat(achPrenotification.status()).isEqualTo(AchPrenotification.Status.SUBMITTED)
        assertThat(achPrenotification.type()).isEqualTo(AchPrenotification.Type.ACH_PRENOTIFICATION)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val achPrenotification =
            AchPrenotification.builder()
                .id("ach_prenotification_ubjf9qqsxl3obbcn1u34")
                .accountId(null)
                .accountNumber("987654321")
                .addendum(null)
                .companyDescriptiveDate(null)
                .companyDiscretionaryData(null)
                .companyEntryDescription(null)
                .companyName(null)
                .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                .creditDebitIndicator(null)
                .effectiveDate(null)
                .idempotencyKey(null)
                .individualId(null)
                .individualName(null)
                .addNotificationsOfChange(
                    AchPrenotification.NotificationsOfChange.builder()
                        .changeCode(
                            AchPrenotification.NotificationsOfChange.ChangeCode
                                .INCORRECT_TRANSACTION_CODE
                        )
                        .correctedData("32")
                        .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .build()
                )
                .prenotificationReturn(
                    AchPrenotification.PrenotificationReturn.builder()
                        .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .returnReasonCode(
                            AchPrenotification.PrenotificationReturn.ReturnReasonCode
                                .CORPORATE_CUSTOMER_ADVISED_NOT_AUTHORIZED
                        )
                        .build()
                )
                .routingNumber("101050001")
                .standardEntryClassCode(null)
                .status(AchPrenotification.Status.SUBMITTED)
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
