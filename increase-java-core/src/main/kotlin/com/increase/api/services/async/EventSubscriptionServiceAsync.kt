// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.eventsubscriptions.EventSubscription
import com.increase.api.models.eventsubscriptions.EventSubscriptionCreateParams
import com.increase.api.models.eventsubscriptions.EventSubscriptionListPageAsync
import com.increase.api.models.eventsubscriptions.EventSubscriptionListParams
import com.increase.api.models.eventsubscriptions.EventSubscriptionRetrieveParams
import com.increase.api.models.eventsubscriptions.EventSubscriptionUpdateParams
import java.util.concurrent.CompletableFuture

interface EventSubscriptionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create an Event Subscription */
    fun create(params: EventSubscriptionCreateParams): CompletableFuture<EventSubscription> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: EventSubscriptionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EventSubscription>

    /** Retrieve an Event Subscription */
    fun retrieve(eventSubscriptionId: String): CompletableFuture<EventSubscription> =
        retrieve(eventSubscriptionId, EventSubscriptionRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        eventSubscriptionId: String,
        params: EventSubscriptionRetrieveParams = EventSubscriptionRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EventSubscription> =
        retrieve(
            params.toBuilder().eventSubscriptionId(eventSubscriptionId).build(),
            requestOptions,
        )

    /** @see [retrieve] */
    fun retrieve(
        eventSubscriptionId: String,
        params: EventSubscriptionRetrieveParams = EventSubscriptionRetrieveParams.none(),
    ): CompletableFuture<EventSubscription> =
        retrieve(eventSubscriptionId, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: EventSubscriptionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EventSubscription>

    /** @see [retrieve] */
    fun retrieve(params: EventSubscriptionRetrieveParams): CompletableFuture<EventSubscription> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        eventSubscriptionId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<EventSubscription> =
        retrieve(eventSubscriptionId, EventSubscriptionRetrieveParams.none(), requestOptions)

    /** Update an Event Subscription */
    fun update(eventSubscriptionId: String): CompletableFuture<EventSubscription> =
        update(eventSubscriptionId, EventSubscriptionUpdateParams.none())

    /** @see [update] */
    fun update(
        eventSubscriptionId: String,
        params: EventSubscriptionUpdateParams = EventSubscriptionUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EventSubscription> =
        update(params.toBuilder().eventSubscriptionId(eventSubscriptionId).build(), requestOptions)

    /** @see [update] */
    fun update(
        eventSubscriptionId: String,
        params: EventSubscriptionUpdateParams = EventSubscriptionUpdateParams.none(),
    ): CompletableFuture<EventSubscription> =
        update(eventSubscriptionId, params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: EventSubscriptionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EventSubscription>

    /** @see [update] */
    fun update(params: EventSubscriptionUpdateParams): CompletableFuture<EventSubscription> =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        eventSubscriptionId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<EventSubscription> =
        update(eventSubscriptionId, EventSubscriptionUpdateParams.none(), requestOptions)

    /** List Event Subscriptions */
    fun list(): CompletableFuture<EventSubscriptionListPageAsync> =
        list(EventSubscriptionListParams.none())

    /** @see [list] */
    fun list(
        params: EventSubscriptionListParams = EventSubscriptionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EventSubscriptionListPageAsync>

    /** @see [list] */
    fun list(
        params: EventSubscriptionListParams = EventSubscriptionListParams.none()
    ): CompletableFuture<EventSubscriptionListPageAsync> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<EventSubscriptionListPageAsync> =
        list(EventSubscriptionListParams.none(), requestOptions)

    /**
     * A view of [EventSubscriptionServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /event_subscriptions`, but is otherwise the same as
         * [EventSubscriptionServiceAsync.create].
         */
        fun create(
            params: EventSubscriptionCreateParams
        ): CompletableFuture<HttpResponseFor<EventSubscription>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        fun create(
            params: EventSubscriptionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EventSubscription>>

        /**
         * Returns a raw HTTP response for `get /event_subscriptions/{event_subscription_id}`, but
         * is otherwise the same as [EventSubscriptionServiceAsync.retrieve].
         */
        fun retrieve(
            eventSubscriptionId: String
        ): CompletableFuture<HttpResponseFor<EventSubscription>> =
            retrieve(eventSubscriptionId, EventSubscriptionRetrieveParams.none())

        /** @see [retrieve] */
        fun retrieve(
            eventSubscriptionId: String,
            params: EventSubscriptionRetrieveParams = EventSubscriptionRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EventSubscription>> =
            retrieve(
                params.toBuilder().eventSubscriptionId(eventSubscriptionId).build(),
                requestOptions,
            )

        /** @see [retrieve] */
        fun retrieve(
            eventSubscriptionId: String,
            params: EventSubscriptionRetrieveParams = EventSubscriptionRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<EventSubscription>> =
            retrieve(eventSubscriptionId, params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            params: EventSubscriptionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EventSubscription>>

        /** @see [retrieve] */
        fun retrieve(
            params: EventSubscriptionRetrieveParams
        ): CompletableFuture<HttpResponseFor<EventSubscription>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            eventSubscriptionId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EventSubscription>> =
            retrieve(eventSubscriptionId, EventSubscriptionRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /event_subscriptions/{event_subscription_id}`, but
         * is otherwise the same as [EventSubscriptionServiceAsync.update].
         */
        fun update(
            eventSubscriptionId: String
        ): CompletableFuture<HttpResponseFor<EventSubscription>> =
            update(eventSubscriptionId, EventSubscriptionUpdateParams.none())

        /** @see [update] */
        fun update(
            eventSubscriptionId: String,
            params: EventSubscriptionUpdateParams = EventSubscriptionUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EventSubscription>> =
            update(
                params.toBuilder().eventSubscriptionId(eventSubscriptionId).build(),
                requestOptions,
            )

        /** @see [update] */
        fun update(
            eventSubscriptionId: String,
            params: EventSubscriptionUpdateParams = EventSubscriptionUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<EventSubscription>> =
            update(eventSubscriptionId, params, RequestOptions.none())

        /** @see [update] */
        fun update(
            params: EventSubscriptionUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EventSubscription>>

        /** @see [update] */
        fun update(
            params: EventSubscriptionUpdateParams
        ): CompletableFuture<HttpResponseFor<EventSubscription>> =
            update(params, RequestOptions.none())

        /** @see [update] */
        fun update(
            eventSubscriptionId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EventSubscription>> =
            update(eventSubscriptionId, EventSubscriptionUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /event_subscriptions`, but is otherwise the same as
         * [EventSubscriptionServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<EventSubscriptionListPageAsync>> =
            list(EventSubscriptionListParams.none())

        /** @see [list] */
        fun list(
            params: EventSubscriptionListParams = EventSubscriptionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EventSubscriptionListPageAsync>>

        /** @see [list] */
        fun list(
            params: EventSubscriptionListParams = EventSubscriptionListParams.none()
        ): CompletableFuture<HttpResponseFor<EventSubscriptionListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<EventSubscriptionListPageAsync>> =
            list(EventSubscriptionListParams.none(), requestOptions)
    }
}
