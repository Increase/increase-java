package com.increase.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.UUID
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat
import com.increase.api.models.OauthConnection

class OauthConnectionTest {

    @Test
    fun createOauthConnection() {
      val oauthConnection = OauthConnection.builder()
          .id("string")
          .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .groupId("string")
          .status(OauthConnection.Status.ACTIVE)
          .type(OauthConnection.Type.OAUTH_CONNECTION)
          .build()
      assertThat(oauthConnection).isNotNull
      assertThat(oauthConnection.id()).isEqualTo("string")
      assertThat(oauthConnection.createdAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
      assertThat(oauthConnection.groupId()).isEqualTo("string")
      assertThat(oauthConnection.status()).isEqualTo(OauthConnection.Status.ACTIVE)
      assertThat(oauthConnection.type()).isEqualTo(OauthConnection.Type.OAUTH_CONNECTION)
    }
}
