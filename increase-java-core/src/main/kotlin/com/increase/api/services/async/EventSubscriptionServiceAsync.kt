// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.google.errorprone.annotations.MustBeClosed
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
    fun retrieve(params: EventSubscriptionRetrieveParams): CompletableFuture<EventSubscription> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: EventSubscriptionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EventSubscription>

    /** Update an Event Subscription */
    fun update(params: EventSubscriptionUpdateParams): CompletableFuture<EventSubscription> =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: EventSubscriptionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EventSubscription>

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
        @MustBeClosed
        fun create(
            params: EventSubscriptionCreateParams
        ): CompletableFuture<HttpResponseFor<EventSubscription>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: EventSubscriptionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EventSubscription>>

        /**
         * Returns a raw HTTP response for `get /event_subscriptions/{event_subscription_id}`, but
         * is otherwise the same as [EventSubscriptionServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: EventSubscriptionRetrieveParams
        ): CompletableFuture<HttpResponseFor<EventSubscription>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: EventSubscriptionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EventSubscription>>

        /**
         * Returns a raw HTTP response for `patch /event_subscriptions/{event_subscription_id}`, but
         * is otherwise the same as [EventSubscriptionServiceAsync.update].
         */
        @MustBeClosed
        fun update(
            params: EventSubscriptionUpdateParams
        ): CompletableFuture<HttpResponseFor<EventSubscription>> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: EventSubscriptionUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EventSubscription>>

        /**
         * Returns a raw HTTP response for `get /event_subscriptions`, but is otherwise the same as
         * [EventSubscriptionServiceAsync.list].
         */
        @MustBeClosed
        fun list(): CompletableFuture<HttpResponseFor<EventSubscriptionListPageAsync>> =
            list(EventSubscriptionListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: EventSubscriptionListParams = EventSubscriptionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EventSubscriptionListPageAsync>>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: EventSubscriptionListParams = EventSubscriptionListParams.none()
        ): CompletableFuture<HttpResponseFor<EventSubscriptionListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<EventSubscriptionListPageAsync>> =
            list(EventSubscriptionListParams.none(), requestOptions)
    }
}
