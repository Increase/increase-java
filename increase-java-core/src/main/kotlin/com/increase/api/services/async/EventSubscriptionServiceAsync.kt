// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.async

import com.increase.api.core.RequestOptions
import com.increase.api.models.EventSubscription
import com.increase.api.models.EventSubscriptionCreateParams
import com.increase.api.models.EventSubscriptionListPageAsync
import com.increase.api.models.EventSubscriptionListParams
import com.increase.api.models.EventSubscriptionRetrieveParams
import com.increase.api.models.EventSubscriptionUpdateParams
import java.util.concurrent.CompletableFuture

interface EventSubscriptionServiceAsync {

    /** Create an Event Subscription */
    @JvmOverloads
    fun create(
        params: EventSubscriptionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EventSubscription>

    /** Retrieve an Event Subscription */
    @JvmOverloads
    fun retrieve(
        params: EventSubscriptionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EventSubscription>

    /** Update an Event Subscription */
    @JvmOverloads
    fun update(
        params: EventSubscriptionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EventSubscription>

    /** List Event Subscriptions */
    @JvmOverloads
    fun list(
        params: EventSubscriptionListParams = EventSubscriptionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EventSubscriptionListPageAsync>

    /** List Event Subscriptions */
    fun list(requestOptions: RequestOptions): CompletableFuture<EventSubscriptionListPageAsync> =
        list(EventSubscriptionListParams.none(), requestOptions)
}
