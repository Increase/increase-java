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
                .accountId("account_in71c4amph0vgo2qllky")
                .accountNumber("987654321")
                .addendum(null)
                .companyDescriptiveDate(null)
                .companyDiscretionaryData(null)
                .companyEntryDescription("Account Funding")
                .companyName("National Phonograph Company")
                .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                .creditDebitIndicator(AchPrenotification.CreditDebitIndicator.CREDIT)
                .effectiveDate(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                .idempotencyKey(null)
                .individualId(null)
                .individualName("Ian Crease")
                .addNotificationsOfChange(
                    AchPrenotification.NotificationsOfChange.builder()
                        .changeCode(
                            AchPrenotification.NotificationsOfChange.ChangeCode
                                .INCORRECT_ROUTING_NUMBER_ACCOUNT_NUMBER_AND_TRANSACTION_CODE
                        )
                        .correctedAccountFunding(
                            AchPrenotification.NotificationsOfChange.CorrectedAccountFunding
                                .CHECKING
                        )
                        .correctedAccountNumber("987654321")
                        .correctedIndividualId(null)
                        .correctedRoutingNumber("123456789")
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
                .standardEntryClassCode(
                    AchPrenotification.StandardEntryClassCode.CORPORATE_CREDIT_OR_DEBIT
                )
                .status(AchPrenotification.Status.SUBMITTED)
                .type(AchPrenotification.Type.ACH_PRENOTIFICATION)
                .build()

        assertThat(achPrenotification.id()).isEqualTo("ach_prenotification_ubjf9qqsxl3obbcn1u34")
        assertThat(achPrenotification.accountId()).contains("account_in71c4amph0vgo2qllky")
        assertThat(achPrenotification.accountNumber()).isEqualTo("987654321")
        assertThat(achPrenotification.addendum()).isEmpty
        assertThat(achPrenotification.companyDescriptiveDate()).isEmpty
        assertThat(achPrenotification.companyDiscretionaryData()).isEmpty
        assertThat(achPrenotification.companyEntryDescription()).contains("Account Funding")
        assertThat(achPrenotification.companyName()).contains("National Phonograph Company")
        assertThat(achPrenotification.createdAt())
            .isEqualTo(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
        assertThat(achPrenotification.creditDebitIndicator())
            .contains(AchPrenotification.CreditDebitIndicator.CREDIT)
        assertThat(achPrenotification.effectiveDate())
            .contains(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
        assertThat(achPrenotification.idempotencyKey()).isEmpty
        assertThat(achPrenotification.individualId()).isEmpty
        assertThat(achPrenotification.individualName()).contains("Ian Crease")
        assertThat(achPrenotification.notificationsOfChange())
            .containsExactly(
                AchPrenotification.NotificationsOfChange.builder()
                    .changeCode(
                        AchPrenotification.NotificationsOfChange.ChangeCode
                            .INCORRECT_ROUTING_NUMBER_ACCOUNT_NUMBER_AND_TRANSACTION_CODE
                    )
                    .correctedAccountFunding(
                        AchPrenotification.NotificationsOfChange.CorrectedAccountFunding.CHECKING
                    )
                    .correctedAccountNumber("987654321")
                    .correctedIndividualId(null)
                    .correctedRoutingNumber("123456789")
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
        assertThat(achPrenotification.standardEntryClassCode())
            .contains(AchPrenotification.StandardEntryClassCode.CORPORATE_CREDIT_OR_DEBIT)
        assertThat(achPrenotification.status()).isEqualTo(AchPrenotification.Status.SUBMITTED)
        assertThat(achPrenotification.type()).isEqualTo(AchPrenotification.Type.ACH_PRENOTIFICATION)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val achPrenotification =
            AchPrenotification.builder()
                .id("ach_prenotification_ubjf9qqsxl3obbcn1u34")
                .accountId("account_in71c4amph0vgo2qllky")
                .accountNumber("987654321")
                .addendum(null)
                .companyDescriptiveDate(null)
                .companyDiscretionaryData(null)
                .companyEntryDescription("Account Funding")
                .companyName("National Phonograph Company")
                .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                .creditDebitIndicator(AchPrenotification.CreditDebitIndicator.CREDIT)
                .effectiveDate(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                .idempotencyKey(null)
                .individualId(null)
                .individualName("Ian Crease")
                .addNotificationsOfChange(
                    AchPrenotification.NotificationsOfChange.builder()
                        .changeCode(
                            AchPrenotification.NotificationsOfChange.ChangeCode
                                .INCORRECT_ROUTING_NUMBER_ACCOUNT_NUMBER_AND_TRANSACTION_CODE
                        )
                        .correctedAccountFunding(
                            AchPrenotification.NotificationsOfChange.CorrectedAccountFunding
                                .CHECKING
                        )
                        .correctedAccountNumber("987654321")
                        .correctedIndividualId(null)
                        .correctedRoutingNumber("123456789")
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
                .standardEntryClassCode(
                    AchPrenotification.StandardEntryClassCode.CORPORATE_CREDIT_OR_DEBIT
                )
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
