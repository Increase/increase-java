// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class RealTimeDecisionActionParamsTest {

    @Test
    fun createRealTimeDecisionActionParams() {
        RealTimeDecisionActionParams.builder()
            .realTimeDecisionId("real_time_decision_j76n2e810ezcg3zh5qtn")
            .cardAuthentication(
                RealTimeDecisionActionParams.CardAuthentication.builder()
                    .decision(RealTimeDecisionActionParams.CardAuthentication.Decision.APPROVE)
                    .build()
            )
            .cardAuthenticationChallenge(
                RealTimeDecisionActionParams.CardAuthenticationChallenge.builder()
                    .result(RealTimeDecisionActionParams.CardAuthenticationChallenge.Result.SUCCESS)
                    .build()
            )
            .cardAuthorization(
                RealTimeDecisionActionParams.CardAuthorization.builder()
                    .decision(RealTimeDecisionActionParams.CardAuthorization.Decision.APPROVE)
                    .declineReason(
                        RealTimeDecisionActionParams.CardAuthorization.DeclineReason
                            .INSUFFICIENT_FUNDS
                    )
                    .build()
            )
            .digitalWalletAuthentication(
                RealTimeDecisionActionParams.DigitalWalletAuthentication.builder()
                    .result(RealTimeDecisionActionParams.DigitalWalletAuthentication.Result.SUCCESS)
                    .success(
                        RealTimeDecisionActionParams.DigitalWalletAuthentication.Success.builder()
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
    }

    @Test
    fun body() {
        val params =
            RealTimeDecisionActionParams.builder()
                .realTimeDecisionId("real_time_decision_j76n2e810ezcg3zh5qtn")
                .cardAuthentication(
                    RealTimeDecisionActionParams.CardAuthentication.builder()
                        .decision(RealTimeDecisionActionParams.CardAuthentication.Decision.APPROVE)
                        .build()
                )
                .cardAuthenticationChallenge(
                    RealTimeDecisionActionParams.CardAuthenticationChallenge.builder()
                        .result(
                            RealTimeDecisionActionParams.CardAuthenticationChallenge.Result.SUCCESS
                        )
                        .build()
                )
                .cardAuthorization(
                    RealTimeDecisionActionParams.CardAuthorization.builder()
                        .decision(RealTimeDecisionActionParams.CardAuthorization.Decision.APPROVE)
                        .declineReason(
                            RealTimeDecisionActionParams.CardAuthorization.DeclineReason
                                .INSUFFICIENT_FUNDS
                        )
                        .build()
                )
                .digitalWalletAuthentication(
                    RealTimeDecisionActionParams.DigitalWalletAuthentication.builder()
                        .result(
                            RealTimeDecisionActionParams.DigitalWalletAuthentication.Result.SUCCESS
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
        val body = params._body()
        assertThat(body).isNotNull
        assertThat(body.cardAuthentication())
            .contains(
                RealTimeDecisionActionParams.CardAuthentication.builder()
                    .decision(RealTimeDecisionActionParams.CardAuthentication.Decision.APPROVE)
                    .build()
            )
        assertThat(body.cardAuthenticationChallenge())
            .contains(
                RealTimeDecisionActionParams.CardAuthenticationChallenge.builder()
                    .result(RealTimeDecisionActionParams.CardAuthenticationChallenge.Result.SUCCESS)
                    .build()
            )
        assertThat(body.cardAuthorization())
            .contains(
                RealTimeDecisionActionParams.CardAuthorization.builder()
                    .decision(RealTimeDecisionActionParams.CardAuthorization.Decision.APPROVE)
                    .declineReason(
                        RealTimeDecisionActionParams.CardAuthorization.DeclineReason
                            .INSUFFICIENT_FUNDS
                    )
                    .build()
            )
        assertThat(body.digitalWalletAuthentication())
            .contains(
                RealTimeDecisionActionParams.DigitalWalletAuthentication.builder()
                    .result(RealTimeDecisionActionParams.DigitalWalletAuthentication.Result.SUCCESS)
                    .success(
                        RealTimeDecisionActionParams.DigitalWalletAuthentication.Success.builder()
                            .email("x")
                            .phone("x")
                            .build()
                    )
                    .build()
            )
        assertThat(body.digitalWalletToken())
            .contains(
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
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            RealTimeDecisionActionParams.builder()
                .realTimeDecisionId("real_time_decision_j76n2e810ezcg3zh5qtn")
                .build()
        val body = params._body()
        assertThat(body).isNotNull
    }

    @Test
    fun getPathParam() {
        val params =
            RealTimeDecisionActionParams.builder()
                .realTimeDecisionId("real_time_decision_j76n2e810ezcg3zh5qtn")
                .build()
        assertThat(params).isNotNull
        // path param "realTimeDecisionId"
        assertThat(params.getPathParam(0)).isEqualTo("real_time_decision_j76n2e810ezcg3zh5qtn")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
