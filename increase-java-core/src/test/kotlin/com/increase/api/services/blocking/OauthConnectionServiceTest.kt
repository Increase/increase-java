package com.increase.api.services.blocking

import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Base64
import java.util.Optional
import java.util.UUID
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.extension.ExtendWith
import com.increase.api.TestServerExtension
import com.increase.api.client.IncreaseClient
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.services.blocking.OauthConnectionService
import com.increase.api.models.OauthConnectionListPage
import com.increase.api.models.OauthConnectionListParams
import com.increase.api.models.*

@ExtendWith(TestServerExtension::class)
class OauthConnectionServiceTest {

    @Test
    fun callRetrieve() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("test-api-key")
          .build()
      val oauthConnectionService = client.oauthConnections()
      val oauthConnection = oauthConnectionService.retrieve(OauthConnectionRetrieveParams.builder()
          .oauthConnectionId("string")
          .build())
      println(oauthConnection)
      oauthConnection.validate()
    }

    @Test
    fun callList() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("test-api-key")
          .build()
      val oauthConnectionService = client.oauthConnections()
      val oauthConnectionList = oauthConnectionService.list(OauthConnectionListParams.builder().build())
      println(oauthConnectionList)
      oauthConnectionList.data().forEach {
          it.validate()
      }
    }
}
