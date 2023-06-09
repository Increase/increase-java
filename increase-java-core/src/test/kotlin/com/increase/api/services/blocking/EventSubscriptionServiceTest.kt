package com.increase.api.services.blocking

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.*
import com.increase.api.models.EventSubscriptionListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class EventSubscriptionServiceTest {

    @Test
    fun callCreate() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .build()
        val eventSubscriptionService = client.eventSubscriptions()
        val eventSubscription =
            eventSubscriptionService.create(
                EventSubscriptionCreateParams.builder()
                    .url("string")
                    .sharedSecret("x")
                    .selectedEventCategory(
                        EventSubscriptionCreateParams.SelectedEventCategory.ACCOUNT_CREATED
                    )
                    .build()
            )
        println(eventSubscription)
        eventSubscription.validate()
    }

    @Test
    fun callRetrieve() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .build()
        val eventSubscriptionService = client.eventSubscriptions()
        val eventSubscription =
            eventSubscriptionService.retrieve(
                EventSubscriptionRetrieveParams.builder().eventSubscriptionId("string").build()
            )
        println(eventSubscription)
        eventSubscription.validate()
    }

    @Test
    fun callUpdate() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .build()
        val eventSubscriptionService = client.eventSubscriptions()
        val eventSubscription =
            eventSubscriptionService.update(
                EventSubscriptionUpdateParams.builder()
                    .eventSubscriptionId("string")
                    .status(EventSubscriptionUpdateParams.Status.ACTIVE)
                    .build()
            )
        println(eventSubscription)
        eventSubscription.validate()
    }

    @Test
    fun callList() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .build()
        val eventSubscriptionService = client.eventSubscriptions()
        val eventSubscriptionList =
            eventSubscriptionService.list(EventSubscriptionListParams.builder().build())
        println(eventSubscriptionList)
        eventSubscriptionList.data().forEach { it.validate() }
    }
}
