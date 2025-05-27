// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async.simulations

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.physicalcards.PhysicalCard
import com.increase.api.models.simulations.physicalcards.PhysicalCardAdvanceShipmentParams
import com.increase.api.models.simulations.physicalcards.PhysicalCardTrackingUpdatesParams
import java.util.concurrent.CompletableFuture

interface PhysicalCardServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * This endpoint allows you to simulate advancing the shipment status of a Physical Card, to
     * simulate e.g., that a physical card was attempted shipped but then failed delivery.
     */
    fun advanceShipment(
        physicalCardId: String,
        params: PhysicalCardAdvanceShipmentParams,
    ): CompletableFuture<PhysicalCard> =
        advanceShipment(physicalCardId, params, RequestOptions.none())

    /** @see [advanceShipment] */
    fun advanceShipment(
        physicalCardId: String,
        params: PhysicalCardAdvanceShipmentParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PhysicalCard> =
        advanceShipment(params.toBuilder().physicalCardId(physicalCardId).build(), requestOptions)

    /** @see [advanceShipment] */
    fun advanceShipment(
        params: PhysicalCardAdvanceShipmentParams
    ): CompletableFuture<PhysicalCard> = advanceShipment(params, RequestOptions.none())

    /** @see [advanceShipment] */
    fun advanceShipment(
        params: PhysicalCardAdvanceShipmentParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PhysicalCard>

    /**
     * This endpoint allows you to simulate receiving a tracking update for a Physical Card, to
     * simulate the progress of a shipment.
     */
    fun trackingUpdates(
        physicalCardId: String,
        params: PhysicalCardTrackingUpdatesParams,
    ): CompletableFuture<PhysicalCard> =
        trackingUpdates(physicalCardId, params, RequestOptions.none())

    /** @see [trackingUpdates] */
    fun trackingUpdates(
        physicalCardId: String,
        params: PhysicalCardTrackingUpdatesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PhysicalCard> =
        trackingUpdates(params.toBuilder().physicalCardId(physicalCardId).build(), requestOptions)

    /** @see [trackingUpdates] */
    fun trackingUpdates(
        params: PhysicalCardTrackingUpdatesParams
    ): CompletableFuture<PhysicalCard> = trackingUpdates(params, RequestOptions.none())

    /** @see [trackingUpdates] */
    fun trackingUpdates(
        params: PhysicalCardTrackingUpdatesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PhysicalCard>

    /**
     * A view of [PhysicalCardServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post
         * /simulations/physical_cards/{physical_card_id}/advance_shipment`, but is otherwise the
         * same as [PhysicalCardServiceAsync.advanceShipment].
         */
        @MustBeClosed
        fun advanceShipment(
            physicalCardId: String,
            params: PhysicalCardAdvanceShipmentParams,
        ): CompletableFuture<HttpResponseFor<PhysicalCard>> =
            advanceShipment(physicalCardId, params, RequestOptions.none())

        /** @see [advanceShipment] */
        @MustBeClosed
        fun advanceShipment(
            physicalCardId: String,
            params: PhysicalCardAdvanceShipmentParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PhysicalCard>> =
            advanceShipment(
                params.toBuilder().physicalCardId(physicalCardId).build(),
                requestOptions,
            )

        /** @see [advanceShipment] */
        @MustBeClosed
        fun advanceShipment(
            params: PhysicalCardAdvanceShipmentParams
        ): CompletableFuture<HttpResponseFor<PhysicalCard>> =
            advanceShipment(params, RequestOptions.none())

        /** @see [advanceShipment] */
        @MustBeClosed
        fun advanceShipment(
            params: PhysicalCardAdvanceShipmentParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PhysicalCard>>

        /**
         * Returns a raw HTTP response for `post
         * /simulations/physical_cards/{physical_card_id}/tracking_updates`, but is otherwise the
         * same as [PhysicalCardServiceAsync.trackingUpdates].
         */
        @MustBeClosed
        fun trackingUpdates(
            physicalCardId: String,
            params: PhysicalCardTrackingUpdatesParams,
        ): CompletableFuture<HttpResponseFor<PhysicalCard>> =
            trackingUpdates(physicalCardId, params, RequestOptions.none())

        /** @see [trackingUpdates] */
        @MustBeClosed
        fun trackingUpdates(
            physicalCardId: String,
            params: PhysicalCardTrackingUpdatesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PhysicalCard>> =
            trackingUpdates(
                params.toBuilder().physicalCardId(physicalCardId).build(),
                requestOptions,
            )

        /** @see [trackingUpdates] */
        @MustBeClosed
        fun trackingUpdates(
            params: PhysicalCardTrackingUpdatesParams
        ): CompletableFuture<HttpResponseFor<PhysicalCard>> =
            trackingUpdates(params, RequestOptions.none())

        /** @see [trackingUpdates] */
        @MustBeClosed
        fun trackingUpdates(
            params: PhysicalCardTrackingUpdatesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PhysicalCard>>
    }
}
