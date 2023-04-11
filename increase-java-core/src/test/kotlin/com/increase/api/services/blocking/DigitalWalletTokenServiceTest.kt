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
import com.increase.api.services.blocking.DigitalWalletTokenService
import com.increase.api.models.DigitalWalletTokenListPage
import com.increase.api.models.DigitalWalletTokenListParams
import com.increase.api.models.*

@ExtendWith(TestServerExtension::class)
class DigitalWalletTokenServiceTest {

    @Test
    fun callRetrieve() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("test-api-key")
          .build()
      val digitalWalletTokenService = client.digitalWalletTokens()
      val digitalWalletToken = digitalWalletTokenService.retrieve(DigitalWalletTokenRetrieveParams.builder()
          .digitalWalletTokenId("string")
          .build())
      println(digitalWalletToken)
      digitalWalletToken.validate()
    }

    @Test
    fun callList() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("test-api-key")
          .build()
      val digitalWalletTokenService = client.digitalWalletTokens()
      val digitalWalletTokenList = digitalWalletTokenService.list(DigitalWalletTokenListParams.builder().build())
      println(digitalWalletTokenList)
      digitalWalletTokenList.data().forEach {
          it.validate()
      }
    }
}
