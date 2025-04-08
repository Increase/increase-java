// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.increase.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExternalAccountTest {

    @Test
    fun create() {
        val externalAccount =
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
                .verificationStatus(ExternalAccount.VerificationStatus.VERIFIED)
                .build()

        assertThat(externalAccount.id()).isEqualTo("external_account_ukk55lr923a3ac0pp7iv")
        assertThat(externalAccount.accountHolder())
            .isEqualTo(ExternalAccount.AccountHolder.BUSINESS)
        assertThat(externalAccount.accountNumber()).isEqualTo("987654321")
        assertThat(externalAccount.createdAt())
            .isEqualTo(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
        assertThat(externalAccount.description()).isEqualTo("Landlord")
        assertThat(externalAccount.funding()).isEqualTo(ExternalAccount.Funding.CHECKING)
        assertThat(externalAccount.idempotencyKey()).isEmpty
        assertThat(externalAccount.routingNumber()).isEqualTo("101050001")
        assertThat(externalAccount.status()).isEqualTo(ExternalAccount.Status.ACTIVE)
        assertThat(externalAccount.type()).isEqualTo(ExternalAccount.Type.EXTERNAL_ACCOUNT)
        assertThat(externalAccount.verificationStatus())
            .isEqualTo(ExternalAccount.VerificationStatus.VERIFIED)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val externalAccount =
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
                .verificationStatus(ExternalAccount.VerificationStatus.VERIFIED)
                .build()

        val roundtrippedExternalAccount =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(externalAccount),
                jacksonTypeRef<ExternalAccount>(),
            )

        assertThat(roundtrippedExternalAccount).isEqualTo(externalAccount)
    }
}
