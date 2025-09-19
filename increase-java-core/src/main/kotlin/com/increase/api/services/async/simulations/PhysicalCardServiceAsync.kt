// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async.simulations

import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.physicalcards.PhysicalCard
import com.increase.api.models.simulations.physicalcards.PhysicalCardAdvanceShipmentParams
import com.increase.api.models.simulations.physicalcards.PhysicalCardCreateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface PhysicalCardServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PhysicalCardServiceAsync

    /**
     * This endpoint allows you to simulate receiving a tracking update for a Physical Card, to
     * simulate the progress of a shipment.
     */
    fun create(
        physicalCardId: String,
        params: PhysicalCardCreateParams,
    ): CompletableFuture<PhysicalCard> = create(physicalCardId, params, RequestOptions.none())

    /** @see create */
    fun create(
        physicalCardId: String,
        params: PhysicalCardCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PhysicalCard> =
        create(params.toBuilder().physicalCardId(physicalCardId).build(), requestOptions)

    /** @see create */
    fun create(params: PhysicalCardCreateParams): CompletableFuture<PhysicalCard> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: PhysicalCardCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PhysicalCard>

    /**
     * This endpoint allows you to simulate advancing the shipment status of a Physical Card, to
     * simulate e.g., that a physical card was attempted shipped but then failed delivery.
     */
    fun advanceShipment(
        physicalCardId: String,
        params: PhysicalCardAdvanceShipmentParams,
    ): CompletableFuture<PhysicalCard> =
        advanceShipment(physicalCardId, params, RequestOptions.none())

    /** @see advanceShipment */
    fun advanceShipment(
        physicalCardId: String,
        params: PhysicalCardAdvanceShipmentParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PhysicalCard> =
        advanceShipment(params.toBuilder().physicalCardId(physicalCardId).build(), requestOptions)

    /** @see advanceShipment */
    fun advanceShipment(
        params: PhysicalCardAdvanceShipmentParams
    ): CompletableFuture<PhysicalCard> = advanceShipment(params, RequestOptions.none())

    /** @see advanceShipment */
    fun advanceShipment(
        params: PhysicalCardAdvanceShipmentParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PhysicalCard>

    /**
     * A view of [PhysicalCardServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PhysicalCardServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /simulations/physical_cards/{physical_card_id}/tracking_updates`, but is otherwise the
         * same as [PhysicalCardServiceAsync.create].
         */
        fun create(
            physicalCardId: String,
            params: PhysicalCardCreateParams,
        ): CompletableFuture<HttpResponseFor<PhysicalCard>> =
            create(physicalCardId, params, RequestOptions.none())

        /** @see create */
        fun create(
            physicalCardId: String,
            params: PhysicalCardCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PhysicalCard>> =
            create(params.toBuilder().physicalCardId(physicalCardId).build(), requestOptions)

        /** @see create */
        fun create(
            params: PhysicalCardCreateParams
        ): CompletableFuture<HttpResponseFor<PhysicalCard>> = create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: PhysicalCardCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PhysicalCard>>

        /**
         * Returns a raw HTTP response for `post
         * /simulations/physical_cards/{physical_card_id}/advance_shipment`, but is otherwise the
         * same as [PhysicalCardServiceAsync.advanceShipment].
         */
        fun advanceShipment(
            physicalCardId: String,
            params: PhysicalCardAdvanceShipmentParams,
        ): CompletableFuture<HttpResponseFor<PhysicalCard>> =
            advanceShipment(physicalCardId, params, RequestOptions.none())

        /** @see advanceShipment */
        fun advanceShipment(
            physicalCardId: String,
            params: PhysicalCardAdvanceShipmentParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PhysicalCard>> =
            advanceShipment(
                params.toBuilder().physicalCardId(physicalCardId).build(),
                requestOptions,
            )

        /** @see advanceShipment */
        fun advanceShipment(
            params: PhysicalCardAdvanceShipmentParams
        ): CompletableFuture<HttpResponseFor<PhysicalCard>> =
            advanceShipment(params, RequestOptions.none())

        /** @see advanceShipment */
        fun advanceShipment(
            params: PhysicalCardAdvanceShipmentParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PhysicalCard>>
    }
}
