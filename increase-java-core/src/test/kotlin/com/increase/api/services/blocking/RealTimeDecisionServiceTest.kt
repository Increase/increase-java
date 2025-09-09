// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.realtimedecisions.RealTimeDecisionActionParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class RealTimeDecisionServiceTest {

    @Test
    fun retrieve() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val realTimeDecisionService = client.realTimeDecisions()

        val realTimeDecision =
            realTimeDecisionService.retrieve("real_time_decision_j76n2e810ezcg3zh5qtn")

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
                            .approval(
                                RealTimeDecisionActionParams.CardAuthorization.Approval.builder()
                                    .cardholderAddressVerificationResult(
                                        RealTimeDecisionActionParams.CardAuthorization.Approval
                                            .CardholderAddressVerificationResult
                                            .builder()
                                            .line1(
                                                RealTimeDecisionActionParams.CardAuthorization
                                                    .Approval
                                                    .CardholderAddressVerificationResult
                                                    .Line1
                                                    .MATCH
                                            )
                                            .postalCode(
                                                RealTimeDecisionActionParams.CardAuthorization
                                                    .Approval
                                                    .CardholderAddressVerificationResult
                                                    .PostalCode
                                                    .NO_MATCH
                                            )
                                            .build()
                                    )
                                    .build()
                            )
                            .decline(
                                RealTimeDecisionActionParams.CardAuthorization.Decline.builder()
                                    .reason(
                                        RealTimeDecisionActionParams.CardAuthorization.Decline
                                            .Reason
                                            .INSUFFICIENT_FUNDS
                                    )
                                    .build()
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
