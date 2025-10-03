// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async.simulations

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import com.increase.api.core.JsonValue
import com.increase.api.models.simulations.carddisputes.CardDisputeActionParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CardDisputeServiceAsyncTest {

    @Test
    fun action() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val cardDisputeServiceAsync = client.simulations().cardDisputes()

        val cardDisputeFuture =
            cardDisputeServiceAsync.action(
                CardDisputeActionParams.builder()
                    .cardDisputeId("card_dispute_h9sc95nbl1cgltpp7men")
                    .network(CardDisputeActionParams.Network.VISA)
                    .visa(
                        CardDisputeActionParams.Visa.builder()
                            .action(CardDisputeActionParams.Visa.Action.ACCEPT_USER_SUBMISSION)
                            .acceptChargeback(JsonValue.from(mapOf<String, Any>()))
                            .acceptUserSubmission(JsonValue.from(mapOf<String, Any>()))
                            .declineUserPrearbitration(JsonValue.from(mapOf<String, Any>()))
                            .receiveMerchantPrearbitration(JsonValue.from(mapOf<String, Any>()))
                            .represent(JsonValue.from(mapOf<String, Any>()))
                            .requestFurtherInformation(
                                CardDisputeActionParams.Visa.RequestFurtherInformation.builder()
                                    .reason("x")
                                    .build()
                            )
                            .timeOutChargeback(JsonValue.from(mapOf<String, Any>()))
                            .timeOutMerchantPrearbitration(JsonValue.from(mapOf<String, Any>()))
                            .timeOutRepresentment(JsonValue.from(mapOf<String, Any>()))
                            .timeOutUserPrearbitration(JsonValue.from(mapOf<String, Any>()))
                            .build()
                    )
                    .build()
            )

        val cardDispute = cardDisputeFuture.get()
        cardDispute.validate()
    }
}
