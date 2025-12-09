// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async.simulations

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import com.increase.api.models.simulations.cardbalanceinquiries.CardBalanceInquiryCreateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CardBalanceInquiryServiceAsyncTest {

    @Test
    fun create() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val cardBalanceInquiryServiceAsync = client.simulations().cardBalanceInquiries()

        val cardPaymentFuture =
            cardBalanceInquiryServiceAsync.create(
                CardBalanceInquiryCreateParams.builder()
                    .balance(1000000L)
                    .cardId("card_oubs0hwk5rn6knuecxg2")
                    .declineReason(CardBalanceInquiryCreateParams.DeclineReason.ACCOUNT_CLOSED)
                    .digitalWalletTokenId("digital_wallet_token_id")
                    .eventSubscriptionId("event_subscription_001dzz0r20rcdxgb013zqb8m04g")
                    .merchantAcceptorId("5665270011000168")
                    .merchantCategoryCode("5734")
                    .merchantCity("New York")
                    .merchantCountry("US")
                    .merchantDescriptor("CITIBANK")
                    .merchantState("NY")
                    .networkDetails(
                        CardBalanceInquiryCreateParams.NetworkDetails.builder()
                            .visa(
                                CardBalanceInquiryCreateParams.NetworkDetails.Visa.builder()
                                    .standInProcessingReason(
                                        CardBalanceInquiryCreateParams.NetworkDetails.Visa
                                            .StandInProcessingReason
                                            .ISSUER_ERROR
                                    )
                                    .build()
                            )
                            .build()
                    )
                    .networkRiskScore(0L)
                    .physicalCardId("physical_card_id")
                    .terminalId("x")
                    .build()
            )

        val cardPayment = cardPaymentFuture.get()
        cardPayment.validate()
    }
}
