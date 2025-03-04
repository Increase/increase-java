// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.async.simulations

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.PhysicalCard
import com.increase.api.models.SimulationPhysicalCardAdvanceShipmentParams
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
    @JvmOverloads
    fun advanceShipment(
        params: SimulationPhysicalCardAdvanceShipmentParams,
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
        @JvmOverloads
        @MustBeClosed
        fun advanceShipment(
            params: SimulationPhysicalCardAdvanceShipmentParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PhysicalCard>>
    }
}
