// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.simulations.carddisputes

import com.increase.api.core.JsonValue
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

        val body = params._body()

        assertThat(body.network()).isEqualTo(CardDisputeActionParams.Network.VISA)
        assertThat(body.visa())
            .contains(
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
