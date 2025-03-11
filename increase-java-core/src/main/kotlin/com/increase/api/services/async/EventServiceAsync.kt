// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.events.Event
import com.increase.api.models.events.EventListPageAsync
import com.increase.api.models.events.EventListParams
import com.increase.api.models.events.EventRetrieveParams
import java.util.concurrent.CompletableFuture

interface EventServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for
     * each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Retrieve an Event */
    fun retrieve(params: EventRetrieveParams): CompletableFuture<Event> =
        retrieve(
          params, RequestOptions.none()
        )

    /** @see [retrieve] */
    fun retrieve(params: EventRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Event>

    /** List Events */
    fun list(): CompletableFuture<EventListPageAsync> = list(EventListParams.none())

    /** @see [list] */
    fun list(params: EventListParams = EventListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<EventListPageAsync>

    /** @see [list] */
    fun list(params: EventListParams = EventListParams.none()): CompletableFuture<EventListPageAsync> =
        list(
          params, RequestOptions.none()
        )

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<EventListPageAsync> = list(EventListParams.none(), requestOptions)

    /**
     * A view of [EventServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /events/{event_id}`, but is otherwise the
         * same as [EventServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(params: EventRetrieveParams): CompletableFuture<HttpResponseFor<Event>> =
            retrieve(
              params, RequestOptions.none()
            )

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(params: EventRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<Event>>

        /**
         * Returns a raw HTTP response for `get /events`, but is otherwise the same as
         * [EventServiceAsync.list].
         */
        @MustBeClosed
        fun list(): CompletableFuture<HttpResponseFor<EventListPageAsync>> = list(EventListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(params: EventListParams = EventListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<EventListPageAsync>>

        /** @see [list] */
        @MustBeClosed
        fun list(params: EventListParams = EventListParams.none()): CompletableFuture<HttpResponseFor<EventListPageAsync>> =
            list(
              params, RequestOptions.none()
            )

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<EventListPageAsync>> = list(EventListParams.none(), requestOptions)
    }
}
