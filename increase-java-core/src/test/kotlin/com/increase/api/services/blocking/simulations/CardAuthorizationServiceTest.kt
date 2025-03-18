// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking.simulations

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.simulations.cardauthorizations.CardAuthorizationCreateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CardAuthorizationServiceTest {

    @Test
    fun create() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val cardAuthorizationService = client.simulations().cardAuthorizations()

        val cardAuthorization =
            cardAuthorizationService.create(
                CardAuthorizationCreateParams.builder()
                    .amount(1000L)
                    .authenticatedCardPaymentId("authenticated_card_payment_id")
                    .cardId("card_oubs0hwk5rn6knuecxg2")
                    .declineReason(CardAuthorizationCreateParams.DeclineReason.ACCOUNT_CLOSED)
                    .digitalWalletTokenId("digital_wallet_token_id")
                    .direction(CardAuthorizationCreateParams.Direction.SETTLEMENT)
                    .eventSubscriptionId("event_subscription_001dzz0r20rcdxgb013zqb8m04g")
                    .merchantAcceptorId("5665270011000168")
                    .merchantCategoryCode("5734")
                    .merchantCity("New York")
                    .merchantCountry("US")
                    .merchantDescriptor("AMAZON.COM")
                    .merchantState("NY")
                    .networkDetails(
                        CardAuthorizationCreateParams.NetworkDetails.builder()
                            .visa(
                                CardAuthorizationCreateParams.NetworkDetails.Visa.builder()
                                    .standInProcessingReason(
                                        CardAuthorizationCreateParams.NetworkDetails.Visa
                                            .StandInProcessingReason
                                            .ISSUER_ERROR
                                    )
                                    .build()
                            )
                            .build()
                    )
                    .physicalCardId("physical_card_id")
                    .terminalId("x")
                    .build()
            )

        cardAuthorization.validate()
    }
}
