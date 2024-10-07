// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.increase.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class RealTimeDecisionActionParamsTest {

    @Test
    fun createRealTimeDecisionActionParams() {
        RealTimeDecisionActionParams.builder()
            .realTimeDecisionId("real_time_decision_id")
            .cardAuthentication(
                RealTimeDecisionActionParams.CardAuthentication.builder()
                    .decision(RealTimeDecisionActionParams.CardAuthentication.Decision.APPROVE)
                    .build()
            )
            .cardAuthorization(
                RealTimeDecisionActionParams.CardAuthorization.builder()
                    .decision(RealTimeDecisionActionParams.CardAuthorization.Decision.APPROVE)
                    .build()
            )
            .digitalWalletAuthentication(
                RealTimeDecisionActionParams.DigitalWalletAuthentication.builder()
                    .result(RealTimeDecisionActionParams.DigitalWalletAuthentication.Result.SUCCESS)
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
    fun getBody() {
        val params =
            RealTimeDecisionActionParams.builder()
                .realTimeDecisionId("real_time_decision_id")
                .cardAuthentication(
                    RealTimeDecisionActionParams.CardAuthentication.builder()
                        .decision(RealTimeDecisionActionParams.CardAuthentication.Decision.APPROVE)
                        .build()
                )
                .cardAuthorization(
                    RealTimeDecisionActionParams.CardAuthorization.builder()
                        .decision(RealTimeDecisionActionParams.CardAuthorization.Decision.APPROVE)
                        .build()
                )
                .digitalWalletAuthentication(
                    RealTimeDecisionActionParams.DigitalWalletAuthentication.builder()
                        .result(
                            RealTimeDecisionActionParams.DigitalWalletAuthentication.Result.SUCCESS
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
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.cardAuthentication())
            .isEqualTo(
                RealTimeDecisionActionParams.CardAuthentication.builder()
                    .decision(RealTimeDecisionActionParams.CardAuthentication.Decision.APPROVE)
                    .build()
            )
        assertThat(body.cardAuthorization())
            .isEqualTo(
                RealTimeDecisionActionParams.CardAuthorization.builder()
                    .decision(RealTimeDecisionActionParams.CardAuthorization.Decision.APPROVE)
                    .build()
            )
        assertThat(body.digitalWalletAuthentication())
            .isEqualTo(
                RealTimeDecisionActionParams.DigitalWalletAuthentication.builder()
                    .result(RealTimeDecisionActionParams.DigitalWalletAuthentication.Result.SUCCESS)
                    .build()
            )
        assertThat(body.digitalWalletToken())
            .isEqualTo(
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
    fun getBodyWithoutOptionalFields() {
        val params =
            RealTimeDecisionActionParams.builder()
                .realTimeDecisionId("real_time_decision_id")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
    }

    @Test
    fun getPathParam() {
        val params =
            RealTimeDecisionActionParams.builder()
                .realTimeDecisionId("real_time_decision_id")
                .build()
        assertThat(params).isNotNull
        // path param "realTimeDecisionId"
        assertThat(params.getPathParam(0)).isEqualTo("real_time_decision_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
