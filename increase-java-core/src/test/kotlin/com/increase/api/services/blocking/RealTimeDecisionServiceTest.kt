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
import com.increase.api.services.blocking.RealTimeDecisionService
import com.increase.api.models.*

@ExtendWith(TestServerExtension::class)
class RealTimeDecisionServiceTest {

    @Test
    fun callRetrieve() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("test-api-key")
          .build()
      val realTimeDecisionService = client.realTimeDecisions()
      val realTimeDecision = realTimeDecisionService.retrieve(RealTimeDecisionRetrieveParams.builder()
          .realTimeDecisionId("string")
          .build())
      println(realTimeDecision)
      realTimeDecision.validate()
    }

    @Test
    fun callAction() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("test-api-key")
          .build()
      val realTimeDecisionService = client.realTimeDecisions()
      val realTimeDecision = realTimeDecisionService.action(RealTimeDecisionActionParams.builder()
          .realTimeDecisionId("string")
          .cardAuthorization(RealTimeDecisionActionParams.CardAuthorization.builder()
              .decision(RealTimeDecisionActionParams.CardAuthorization.Decision.APPROVE)
              .build())
          .digitalWalletToken(RealTimeDecisionActionParams.DigitalWalletToken.builder()
              .approval(RealTimeDecisionActionParams.DigitalWalletToken.Approval.builder()
                  .cardProfileId("string")
                  .phone("x")
                  .email("x")
                  .build())
              .decline(RealTimeDecisionActionParams.DigitalWalletToken.Decline.builder()
                  .reason("x")
                  .build())
              .build())
          .digitalWalletAuthentication(RealTimeDecisionActionParams.DigitalWalletAuthentication.builder()
              .result(RealTimeDecisionActionParams.DigitalWalletAuthentication.Result.SUCCESS)
              .build())
          .build())
      println(realTimeDecision)
      realTimeDecision.validate()
    }
}
