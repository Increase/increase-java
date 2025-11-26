// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.increase.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExternalAccountListPageResponseTest {

    @Test
    fun create() {
        val externalAccountListPageResponse =
            ExternalAccountListPageResponse.builder()
                .addData(
                    ExternalAccount.builder()
                        .id("external_account_ukk55lr923a3ac0pp7iv")
                        .accountHolder(ExternalAccount.AccountHolder.BUSINESS)
                        .accountNumber("987654321")
                        .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .description("Landlord")
                        .funding(ExternalAccount.Funding.CHECKING)
                        .idempotencyKey(null)
                        .routingNumber("101050001")
                        .status(ExternalAccount.Status.ACTIVE)
                        .type(ExternalAccount.Type.EXTERNAL_ACCOUNT)
                        .build()
                )
                .nextCursor("v57w5d")
                .build()

        assertThat(externalAccountListPageResponse.data())
            .containsExactly(
                ExternalAccount.builder()
                    .id("external_account_ukk55lr923a3ac0pp7iv")
                    .accountHolder(ExternalAccount.AccountHolder.BUSINESS)
                    .accountNumber("987654321")
                    .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                    .description("Landlord")
                    .funding(ExternalAccount.Funding.CHECKING)
                    .idempotencyKey(null)
                    .routingNumber("101050001")
                    .status(ExternalAccount.Status.ACTIVE)
                    .type(ExternalAccount.Type.EXTERNAL_ACCOUNT)
                    .build()
            )
        assertThat(externalAccountListPageResponse.nextCursor()).contains("v57w5d")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val externalAccountListPageResponse =
            ExternalAccountListPageResponse.builder()
                .addData(
                    ExternalAccount.builder()
                        .id("external_account_ukk55lr923a3ac0pp7iv")
                        .accountHolder(ExternalAccount.AccountHolder.BUSINESS)
                        .accountNumber("987654321")
                        .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .description("Landlord")
                        .funding(ExternalAccount.Funding.CHECKING)
                        .idempotencyKey(null)
                        .routingNumber("101050001")
                        .status(ExternalAccount.Status.ACTIVE)
                        .type(ExternalAccount.Type.EXTERNAL_ACCOUNT)
                        .build()
                )
                .nextCursor("v57w5d")
                .build()

        val roundtrippedExternalAccountListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(externalAccountListPageResponse),
                jacksonTypeRef<ExternalAccountListPageResponse>(),
            )

        assertThat(roundtrippedExternalAccountListPageResponse)
            .isEqualTo(externalAccountListPageResponse)
    }
}
