// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import com.increase.api.models.eventsubscriptions.EventSubscriptionCreateParams
import com.increase.api.models.eventsubscriptions.EventSubscriptionUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class EventSubscriptionServiceAsyncTest {

    @Test
    fun create() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val eventSubscriptionServiceAsync = client.eventSubscriptions()

        val eventSubscriptionFuture =
            eventSubscriptionServiceAsync.create(
                EventSubscriptionCreateParams.builder()
                    .url("https://website.com/webhooks")
                    .oauthConnectionId("x")
                    .selectedEventCategory(
                        EventSubscriptionCreateParams.SelectedEventCategory.ACCOUNT_CREATED
                    )
                    .sharedSecret("x")
                    .status(EventSubscriptionCreateParams.Status.ACTIVE)
                    .build()
            )

        val eventSubscription = eventSubscriptionFuture.get()
        eventSubscription.validate()
    }

    @Test
    fun retrieve() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val eventSubscriptionServiceAsync = client.eventSubscriptions()

        val eventSubscriptionFuture =
            eventSubscriptionServiceAsync.retrieve("event_subscription_001dzz0r20rcdxgb013zqb8m04g")

        val eventSubscription = eventSubscriptionFuture.get()
        eventSubscription.validate()
    }

    @Test
    fun update() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val eventSubscriptionServiceAsync = client.eventSubscriptions()

        val eventSubscriptionFuture =
            eventSubscriptionServiceAsync.update(
                EventSubscriptionUpdateParams.builder()
                    .eventSubscriptionId("event_subscription_001dzz0r20rcdxgb013zqb8m04g")
                    .status(EventSubscriptionUpdateParams.Status.ACTIVE)
                    .build()
            )

        val eventSubscription = eventSubscriptionFuture.get()
        eventSubscription.validate()
    }

    @Test
    fun list() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val eventSubscriptionServiceAsync = client.eventSubscriptions()

        val pageFuture = eventSubscriptionServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }
}
