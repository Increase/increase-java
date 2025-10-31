// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking.simulations

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.simulations.carddisputes.CardDisputeActionParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CardDisputeServiceTest {

    @Test
    fun action() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val cardDisputeService = client.simulations().cardDisputes()

        val cardDispute =
            cardDisputeService.action(
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
                                CardDisputeActionParams.Visa.DeclineUserPrearbitration.builder()
                                    .build()
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
                                CardDisputeActionParams.Visa.TimeOutUserPrearbitration.builder()
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )

        cardDispute.validate()
    }
}
