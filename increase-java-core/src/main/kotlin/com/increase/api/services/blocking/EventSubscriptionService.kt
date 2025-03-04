// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.EventSubscription
import com.increase.api.models.EventSubscriptionCreateParams
import com.increase.api.models.EventSubscriptionListPage
import com.increase.api.models.EventSubscriptionListParams
import com.increase.api.models.EventSubscriptionRetrieveParams
import com.increase.api.models.EventSubscriptionUpdateParams

interface EventSubscriptionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create an Event Subscription */
    @JvmOverloads
    fun create(
        params: EventSubscriptionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EventSubscription

    /** Retrieve an Event Subscription */
    @JvmOverloads
    fun retrieve(
        params: EventSubscriptionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EventSubscription

    /** Update an Event Subscription */
    @JvmOverloads
    fun update(
        params: EventSubscriptionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EventSubscription

    /** List Event Subscriptions */
    @JvmOverloads
    fun list(
        params: EventSubscriptionListParams = EventSubscriptionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EventSubscriptionListPage

    /** List Event Subscriptions */
    fun list(requestOptions: RequestOptions): EventSubscriptionListPage =
        list(EventSubscriptionListParams.none(), requestOptions)

    /**
     * A view of [EventSubscriptionService] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /event_subscriptions`, but is otherwise the same as
         * [EventSubscriptionService.create].
         */
        @JvmOverloads
        @MustBeClosed
        fun create(
            params: EventSubscriptionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EventSubscription>

        /**
         * Returns a raw HTTP response for `get /event_subscriptions/{event_subscription_id}`, but
         * is otherwise the same as [EventSubscriptionService.retrieve].
         */
        @JvmOverloads
        @MustBeClosed
        fun retrieve(
            params: EventSubscriptionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EventSubscription>

        /**
         * Returns a raw HTTP response for `patch /event_subscriptions/{event_subscription_id}`, but
         * is otherwise the same as [EventSubscriptionService.update].
         */
        @JvmOverloads
        @MustBeClosed
        fun update(
            params: EventSubscriptionUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EventSubscription>

        /**
         * Returns a raw HTTP response for `get /event_subscriptions`, but is otherwise the same as
         * [EventSubscriptionService.list].
         */
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: EventSubscriptionListParams = EventSubscriptionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EventSubscriptionListPage>

        /**
         * Returns a raw HTTP response for `get /event_subscriptions`, but is otherwise the same as
         * [EventSubscriptionService.list].
         */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<EventSubscriptionListPage> =
            list(EventSubscriptionListParams.none(), requestOptions)
    }
}
