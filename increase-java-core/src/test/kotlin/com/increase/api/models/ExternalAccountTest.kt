// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ExternalAccountTest {

    @Test
    fun createExternalAccount() {
        val externalAccount =
            ExternalAccount.builder()
                .id("string")
                .accountNumber("string")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("string")
                .funding(ExternalAccount.Funding.CHECKING)
                .routingNumber("string")
                .status(ExternalAccount.Status.ACTIVE)
                .type(ExternalAccount.Type.EXTERNAL_ACCOUNT)
                .verificationStatus(ExternalAccount.VerificationStatus.UNVERIFIED)
                .build()
        assertThat(externalAccount).isNotNull
        assertThat(externalAccount.id()).isEqualTo("string")
        assertThat(externalAccount.accountNumber()).isEqualTo("string")
        assertThat(externalAccount.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(externalAccount.description()).isEqualTo("string")
        assertThat(externalAccount.funding()).isEqualTo(ExternalAccount.Funding.CHECKING)
        assertThat(externalAccount.routingNumber()).isEqualTo("string")
        assertThat(externalAccount.status()).isEqualTo(ExternalAccount.Status.ACTIVE)
        assertThat(externalAccount.type()).isEqualTo(ExternalAccount.Type.EXTERNAL_ACCOUNT)
        assertThat(externalAccount.verificationStatus())
            .isEqualTo(ExternalAccount.VerificationStatus.UNVERIFIED)
    }
}
