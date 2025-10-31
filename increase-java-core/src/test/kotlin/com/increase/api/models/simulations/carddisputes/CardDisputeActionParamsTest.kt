// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.simulations.carddisputes

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CardDisputeActionParamsTest {

    @Test
    fun create() {
        CardDisputeActionParams.builder()
            .cardDisputeId("card_dispute_h9sc95nbl1cgltpp7men")
            .network(CardDisputeActionParams.Network.VISA)
            .visa(
                CardDisputeActionParams.Visa.builder()
                    .action(CardDisputeActionParams.Visa.Action.ACCEPT_USER_SUBMISSION)
                    .acceptChargeback(
                        CardDisputeActionParams.Visa.AcceptChargeback.builder().build()
                    )
                    .acceptUserSubmission(
                        CardDisputeActionParams.Visa.AcceptUserSubmission.builder().build()
                    )
                    .declineUserPrearbitration(
                        CardDisputeActionParams.Visa.DeclineUserPrearbitration.builder().build()
                    )
                    .receiveMerchantPrearbitration(
                        CardDisputeActionParams.Visa.ReceiveMerchantPrearbitration.builder().build()
                    )
                    .represent(CardDisputeActionParams.Visa.Represent.builder().build())
                    .requestFurtherInformation(
                        CardDisputeActionParams.Visa.RequestFurtherInformation.builder()
                            .reason("x")
                            .build()
                    )
                    .timeOutChargeback(
                        CardDisputeActionParams.Visa.TimeOutChargeback.builder().build()
                    )
                    .timeOutMerchantPrearbitration(
                        CardDisputeActionParams.Visa.TimeOutMerchantPrearbitration.builder().build()
                    )
                    .timeOutRepresentment(
                        CardDisputeActionParams.Visa.TimeOutRepresentment.builder().build()
                    )
                    .timeOutUserPrearbitration(
                        CardDisputeActionParams.Visa.TimeOutUserPrearbitration.builder().build()
                    )
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            CardDisputeActionParams.builder()
                .cardDisputeId("card_dispute_h9sc95nbl1cgltpp7men")
                .network(CardDisputeActionParams.Network.VISA)
                .build()

        assertThat(params._pathParam(0)).isEqualTo("card_dispute_h9sc95nbl1cgltpp7men")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            CardDisputeActionParams.builder()
                .cardDisputeId("card_dispute_h9sc95nbl1cgltpp7men")
                .network(CardDisputeActionParams.Network.VISA)
                .visa(
                    CardDisputeActionParams.Visa.builder()
                        .action(CardDisputeActionParams.Visa.Action.ACCEPT_USER_SUBMISSION)
                        .acceptChargeback(
                            CardDisputeActionParams.Visa.AcceptChargeback.builder().build()
                        )
                        .acceptUserSubmission(
                            CardDisputeActionParams.Visa.AcceptUserSubmission.builder().build()
                        )
                        .declineUserPrearbitration(
                            CardDisputeActionParams.Visa.DeclineUserPrearbitration.builder().build()
                        )
                        .receiveMerchantPrearbitration(
                            CardDisputeActionParams.Visa.ReceiveMerchantPrearbitration.builder()
                                .build()
                        )
                        .represent(CardDisputeActionParams.Visa.Represent.builder().build())
                        .requestFurtherInformation(
                            CardDisputeActionParams.Visa.RequestFurtherInformation.builder()
                                .reason("x")
                                .build()
                        )
                        .timeOutChargeback(
                            CardDisputeActionParams.Visa.TimeOutChargeback.builder().build()
                        )
                        .timeOutMerchantPrearbitration(
                            CardDisputeActionParams.Visa.TimeOutMerchantPrearbitration.builder()
                                .build()
                        )
                        .timeOutRepresentment(
                            CardDisputeActionParams.Visa.TimeOutRepresentment.builder().build()
                        )
                        .timeOutUserPrearbitration(
                            CardDisputeActionParams.Visa.TimeOutUserPrearbitration.builder().build()
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.network()).isEqualTo(CardDisputeActionParams.Network.VISA)
        assertThat(body.visa())
            .contains(
                CardDisputeActionParams.Visa.builder()
                    .action(CardDisputeActionParams.Visa.Action.ACCEPT_USER_SUBMISSION)
                    .acceptChargeback(
                        CardDisputeActionParams.Visa.AcceptChargeback.builder().build()
                    )
                    .acceptUserSubmission(
                        CardDisputeActionParams.Visa.AcceptUserSubmission.builder().build()
                    )
                    .declineUserPrearbitration(
                        CardDisputeActionParams.Visa.DeclineUserPrearbitration.builder().build()
                    )
                    .receiveMerchantPrearbitration(
                        CardDisputeActionParams.Visa.ReceiveMerchantPrearbitration.builder().build()
                    )
                    .represent(CardDisputeActionParams.Visa.Represent.builder().build())
                    .requestFurtherInformation(
                        CardDisputeActionParams.Visa.RequestFurtherInformation.builder()
                            .reason("x")
                            .build()
                    )
                    .timeOutChargeback(
                        CardDisputeActionParams.Visa.TimeOutChargeback.builder().build()
                    )
                    .timeOutMerchantPrearbitration(
                        CardDisputeActionParams.Visa.TimeOutMerchantPrearbitration.builder().build()
                    )
                    .timeOutRepresentment(
                        CardDisputeActionParams.Visa.TimeOutRepresentment.builder().build()
                    )
                    .timeOutUserPrearbitration(
                        CardDisputeActionParams.Visa.TimeOutUserPrearbitration.builder().build()
                    )
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            CardDisputeActionParams.builder()
                .cardDisputeId("card_dispute_h9sc95nbl1cgltpp7men")
                .network(CardDisputeActionParams.Network.VISA)
                .build()

        val body = params._body()

        assertThat(body.network()).isEqualTo(CardDisputeActionParams.Network.VISA)
    }
}
