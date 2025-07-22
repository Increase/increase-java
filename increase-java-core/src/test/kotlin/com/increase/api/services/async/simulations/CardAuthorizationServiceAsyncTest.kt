// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async.simulations

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import com.increase.api.models.simulations.cardauthorizations.CardAuthorizationCreateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CardAuthorizationServiceAsyncTest {

    @Test
    fun create() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val cardAuthorizationServiceAsync = client.simulations().cardAuthorizations()

        val cardAuthorizationFuture =
            cardAuthorizationServiceAsync.create(
                CardAuthorizationCreateParams.builder()
                    .amount(1000L)
                    .authenticatedCardPaymentId("authenticated_card_payment_id")
                    .cardId("card_oubs0hwk5rn6knuecxg2")
                    .declineReason(CardAuthorizationCreateParams.DeclineReason.ACCOUNT_CLOSED)
                    .digitalWalletTokenId("digital_wallet_token_id")
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
                    .networkRiskScore(0L)
                    .physicalCardId("physical_card_id")
                    .processingCategory(
                        CardAuthorizationCreateParams.ProcessingCategory.builder()
                            .category(
                                CardAuthorizationCreateParams.ProcessingCategory.Category
                                    .ACCOUNT_FUNDING
                            )
                            .build()
                    )
                    .terminalId("x")
                    .build()
            )

        val cardAuthorization = cardAuthorizationFuture.get()
        cardAuthorization.validate()
    }
}
