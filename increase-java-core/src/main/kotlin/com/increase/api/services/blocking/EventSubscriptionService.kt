// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.eventsubscriptions.EventSubscription
import com.increase.api.models.eventsubscriptions.EventSubscriptionCreateParams
import com.increase.api.models.eventsubscriptions.EventSubscriptionListPage
import com.increase.api.models.eventsubscriptions.EventSubscriptionListParams
import com.increase.api.models.eventsubscriptions.EventSubscriptionRetrieveParams
import com.increase.api.models.eventsubscriptions.EventSubscriptionUpdateParams

interface EventSubscriptionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for
     * each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create an Event Subscription */
    fun create(params: EventSubscriptionCreateParams): EventSubscription =
        create(
          params, RequestOptions.none()
        )

    /** @see [create] */
    fun create(params: EventSubscriptionCreateParams, requestOptions: RequestOptions = RequestOptions.none()): EventSubscription

    /** Retrieve an Event Subscription */
    fun retrieve(params: EventSubscriptionRetrieveParams): EventSubscription =
        retrieve(
          params, RequestOptions.none()
        )

    /** @see [retrieve] */
    fun retrieve(params: EventSubscriptionRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): EventSubscription

    /** Update an Event Subscription */
    fun update(params: EventSubscriptionUpdateParams): EventSubscription =
        update(
          params, RequestOptions.none()
        )

    /** @see [update] */
    fun update(params: EventSubscriptionUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): EventSubscription

    /** List Event Subscriptions */
    fun list(): EventSubscriptionListPage = list(EventSubscriptionListParams.none())

    /** @see [list] */
    fun list(params: EventSubscriptionListParams = EventSubscriptionListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): EventSubscriptionListPage

    /** @see [list] */
    fun list(params: EventSubscriptionListParams = EventSubscriptionListParams.none()): EventSubscriptionListPage =
        list(
          params, RequestOptions.none()
        )

    /** @see [list] */
    fun list(requestOptions: RequestOptions): EventSubscriptionListPage = list(EventSubscriptionListParams.none(), requestOptions)

    /**
     * A view of [EventSubscriptionService] that provides access to raw HTTP responses
     * for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /event_subscriptions`, but is otherwise
         * the same as [EventSubscriptionService.create].
         */
        @MustBeClosed
        fun create(params: EventSubscriptionCreateParams): HttpResponseFor<EventSubscription> =
            create(
              params, RequestOptions.none()
            )

        /** @see [create] */
        @MustBeClosed
        fun create(params: EventSubscriptionCreateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<EventSubscription>

        /**
         * Returns a raw HTTP response for
         * `get /event_subscriptions/{event_subscription_id}`, but is otherwise the same as
         * [EventSubscriptionService.retrieve].
         */
        @MustBeClosed
        fun retrieve(params: EventSubscriptionRetrieveParams): HttpResponseFor<EventSubscription> =
            retrieve(
              params, RequestOptions.none()
            )

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(params: EventSubscriptionRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<EventSubscription>

        /**
         * Returns a raw HTTP response for
         * `patch /event_subscriptions/{event_subscription_id}`, but is otherwise the same
         * as [EventSubscriptionService.update].
         */
        @MustBeClosed
        fun update(params: EventSubscriptionUpdateParams): HttpResponseFor<EventSubscription> =
            update(
              params, RequestOptions.none()
            )

        /** @see [update] */
        @MustBeClosed
        fun update(params: EventSubscriptionUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<EventSubscription>

        /**
         * Returns a raw HTTP response for `get /event_subscriptions`, but is otherwise the
         * same as [EventSubscriptionService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<EventSubscriptionListPage> = list(EventSubscriptionListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(params: EventSubscriptionListParams = EventSubscriptionListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<EventSubscriptionListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(params: EventSubscriptionListParams = EventSubscriptionListParams.none()): HttpResponseFor<EventSubscriptionListPage> =
            list(
              params, RequestOptions.none()
            )

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<EventSubscriptionListPage> = list(EventSubscriptionListParams.none(), requestOptions)
    }
}
