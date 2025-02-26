// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.RealTimeDecisionActionParams
import com.increase.api.models.RealTimeDecisionRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class RealTimeDecisionServiceTest {

    @Test
    fun retrieve() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val realTimeDecisionService = client.realTimeDecisions()

        val realTimeDecision =
            realTimeDecisionService.retrieve(
                RealTimeDecisionRetrieveParams.builder()
                    .realTimeDecisionId("real_time_decision_j76n2e810ezcg3zh5qtn")
                    .build()
            )

        realTimeDecision.validate()
    }

    @Test
    fun action() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val realTimeDecisionService = client.realTimeDecisions()

        val realTimeDecision =
            realTimeDecisionService.action(
                RealTimeDecisionActionParams.builder()
                    .realTimeDecisionId("real_time_decision_j76n2e810ezcg3zh5qtn")
                    .cardAuthentication(
                        RealTimeDecisionActionParams.CardAuthentication.builder()
                            .decision(
                                RealTimeDecisionActionParams.CardAuthentication.Decision.APPROVE
                            )
                            .build()
                    )
                    .cardAuthenticationChallenge(
                        RealTimeDecisionActionParams.CardAuthenticationChallenge.builder()
                            .result(
                                RealTimeDecisionActionParams.CardAuthenticationChallenge.Result
                                    .SUCCESS
                            )
                            .build()
                    )
                    .cardAuthorization(
                        RealTimeDecisionActionParams.CardAuthorization.builder()
                            .decision(
                                RealTimeDecisionActionParams.CardAuthorization.Decision.APPROVE
                            )
                            .declineReason(
                                RealTimeDecisionActionParams.CardAuthorization.DeclineReason
                                    .INSUFFICIENT_FUNDS
                            )
                            .build()
                    )
                    .digitalWalletAuthentication(
                        RealTimeDecisionActionParams.DigitalWalletAuthentication.builder()
                            .result(
                                RealTimeDecisionActionParams.DigitalWalletAuthentication.Result
                                    .SUCCESS
                            )
                            .success(
                                RealTimeDecisionActionParams.DigitalWalletAuthentication.Success
                                    .builder()
                                    .email("x")
                                    .phone("x")
                                    .build()
                            )
                            .build()
                    )
                    .digitalWalletToken(
                        RealTimeDecisionActionParams.DigitalWalletToken.builder()
                            .approval(
                                RealTimeDecisionActionParams.DigitalWalletToken.Approval.builder()
                                    .email("x")
                                    .phone("x")
                                    .build()
                            )
                            .decline(
                                RealTimeDecisionActionParams.DigitalWalletToken.Decline.builder()
                                    .reason("x")
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )

        realTimeDecision.validate()
    }
}
