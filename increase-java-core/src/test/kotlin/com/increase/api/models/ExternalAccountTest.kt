package com.increase.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.UUID
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat
import com.increase.api.models.ExternalAccount

class ExternalAccountTest {

    @Test
    fun createExternalAccount() {
      val externalAccount = ExternalAccount.builder()
          .id("string")
          .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .description("string")
          .status(ExternalAccount.Status.ACTIVE)
          .routingNumber("string")
          .accountNumber("string")
          .funding(ExternalAccount.Funding.CHECKING)
          .verificationStatus(ExternalAccount.VerificationStatus.UNVERIFIED)
          .type(ExternalAccount.Type.EXTERNAL_ACCOUNT)
          .build()
      assertThat(externalAccount).isNotNull
      assertThat(externalAccount.id()).isEqualTo("string")
      assertThat(externalAccount.createdAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
      assertThat(externalAccount.description()).isEqualTo("string")
      assertThat(externalAccount.status()).isEqualTo(ExternalAccount.Status.ACTIVE)
      assertThat(externalAccount.routingNumber()).isEqualTo("string")
      assertThat(externalAccount.accountNumber()).isEqualTo("string")
      assertThat(externalAccount.funding()).isEqualTo(ExternalAccount.Funding.CHECKING)
      assertThat(externalAccount.verificationStatus()).isEqualTo(ExternalAccount.VerificationStatus.UNVERIFIED)
      assertThat(externalAccount.type()).isEqualTo(ExternalAccount.Type.EXTERNAL_ACCOUNT)
    }
}
