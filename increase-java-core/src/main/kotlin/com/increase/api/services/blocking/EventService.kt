// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.UnwrapWebhookParams
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.errors.IncreaseInvalidDataException
import com.increase.api.errors.IncreaseWebhookException
import com.increase.api.models.events.Event
import com.increase.api.models.events.EventListPage
import com.increase.api.models.events.EventListParams
import com.increase.api.models.events.EventRetrieveParams
import com.increase.api.models.events.UnwrapWebhookEvent
import java.util.function.Consumer

interface EventService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): EventService

    /** Retrieve an Event */
    fun retrieve(eventId: String): Event = retrieve(eventId, EventRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        eventId: String,
        params: EventRetrieveParams = EventRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Event = retrieve(params.toBuilder().eventId(eventId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(eventId: String, params: EventRetrieveParams = EventRetrieveParams.none()): Event =
        retrieve(eventId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: EventRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Event

    /** @see retrieve */
    fun retrieve(params: EventRetrieveParams): Event = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(eventId: String, requestOptions: RequestOptions): Event =
        retrieve(eventId, EventRetrieveParams.none(), requestOptions)

    /** List Events */
    fun list(): EventListPage = list(EventListParams.none())

    /** @see list */
    fun list(
        params: EventListParams = EventListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EventListPage

    /** @see list */
    fun list(params: EventListParams = EventListParams.none()): EventListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): EventListPage =
        list(EventListParams.none(), requestOptions)

    /**
     * Unwraps a webhook event from its JSON representation.
     *
     * @throws IncreaseInvalidDataException if the body could not be parsed.
     */
    fun unwrap(body: String): UnwrapWebhookEvent

    /**
     * Unwraps a webhook event from its JSON representation.
     *
     * @throws IncreaseInvalidDataException if the body could not be parsed.
     * @throws IncreaseWebhookException if the webhook signature could not be verified
     */
    fun unwrap(unwrapParams: UnwrapWebhookParams): UnwrapWebhookEvent

    /** A view of [EventService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): EventService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /events/{event_id}`, but is otherwise the same as
         * [EventService.retrieve].
         */
        @MustBeClosed
        fun retrieve(eventId: String): HttpResponseFor<Event> =
            retrieve(eventId, EventRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            eventId: String,
            params: EventRetrieveParams = EventRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Event> =
            retrieve(params.toBuilder().eventId(eventId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            eventId: String,
            params: EventRetrieveParams = EventRetrieveParams.none(),
        ): HttpResponseFor<Event> = retrieve(eventId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: EventRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Event>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: EventRetrieveParams): HttpResponseFor<Event> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(eventId: String, requestOptions: RequestOptions): HttpResponseFor<Event> =
            retrieve(eventId, EventRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /events`, but is otherwise the same as
         * [EventService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<EventListPage> = list(EventListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: EventListParams = EventListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EventListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: EventListParams = EventListParams.none()): HttpResponseFor<EventListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<EventListPage> =
            list(EventListParams.none(), requestOptions)
    }
}
