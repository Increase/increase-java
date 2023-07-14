package com.increase.api.models

import com.increase.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class RealTimeDecisionActionParamsTest {

    @Test
    fun createRealTimeDecisionActionParams() {
        RealTimeDecisionActionParams.builder()
            .realTimeDecisionId("string")
            .cardAuthorization(
                RealTimeDecisionActionParams.CardAuthorization.builder()
                    .decision(RealTimeDecisionActionParams.CardAuthorization.Decision.APPROVE)
                    .build()
            )
            .digitalWalletToken(
                RealTimeDecisionActionParams.DigitalWalletToken.builder()
                    .approval(
                        RealTimeDecisionActionParams.DigitalWalletToken.Approval.builder()
                            .cardProfileId("string")
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
            .digitalWalletAuthentication(
                RealTimeDecisionActionParams.DigitalWalletAuthentication.builder()
                    .result(RealTimeDecisionActionParams.DigitalWalletAuthentication.Result.SUCCESS)
                    .build()
            )
            .build()
    }

    @Test
    fun getBody() {
        val params =
            RealTimeDecisionActionParams.builder()
                .realTimeDecisionId("string")
                .cardAuthorization(
                    RealTimeDecisionActionParams.CardAuthorization.builder()
                        .decision(RealTimeDecisionActionParams.CardAuthorization.Decision.APPROVE)
                        .build()
                )
                .digitalWalletToken(
                    RealTimeDecisionActionParams.DigitalWalletToken.builder()
                        .approval(
                            RealTimeDecisionActionParams.DigitalWalletToken.Approval.builder()
                                .cardProfileId("string")
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
                .digitalWalletAuthentication(
                    RealTimeDecisionActionParams.DigitalWalletAuthentication.builder()
                        .result(
                            RealTimeDecisionActionParams.DigitalWalletAuthentication.Result.SUCCESS
                        )
                        .build()
                )
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.cardAuthorization())
            .isEqualTo(
                RealTimeDecisionActionParams.CardAuthorization.builder()
                    .decision(RealTimeDecisionActionParams.CardAuthorization.Decision.APPROVE)
                    .build()
            )
        assertThat(body.digitalWalletToken())
            .isEqualTo(
                RealTimeDecisionActionParams.DigitalWalletToken.builder()
                    .approval(
                        RealTimeDecisionActionParams.DigitalWalletToken.Approval.builder()
                            .cardProfileId("string")
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
        assertThat(body.digitalWalletAuthentication())
            .isEqualTo(
                RealTimeDecisionActionParams.DigitalWalletAuthentication.builder()
                    .result(RealTimeDecisionActionParams.DigitalWalletAuthentication.Result.SUCCESS)
                    .build()
            )
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = RealTimeDecisionActionParams.builder().realTimeDecisionId("string").build()
        val body = params.getBody()
        assertThat(body).isNotNull
    }

    @Test
    fun getPathParam() {
        val params = RealTimeDecisionActionParams.builder().realTimeDecisionId("string").build()
        assertThat(params).isNotNull
        // path param "realTimeDecisionId"
        assertThat(params.getPathParam(0)).isEqualTo("string")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
