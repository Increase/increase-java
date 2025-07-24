// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async.simulations

import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.inboundwiredrawdownrequests.InboundWireDrawdownRequest
import com.increase.api.models.simulations.inboundwiredrawdownrequests.InboundWireDrawdownRequestCreateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface InboundWireDrawdownRequestServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): InboundWireDrawdownRequestServiceAsync

    /** Simulates receiving an [Inbound Wire Drawdown Request](#inbound-wire-drawdown-requests). */
    fun create(
        params: InboundWireDrawdownRequestCreateParams
    ): CompletableFuture<InboundWireDrawdownRequest> = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: InboundWireDrawdownRequestCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InboundWireDrawdownRequest>

    /**
     * A view of [InboundWireDrawdownRequestServiceAsync] that provides access to raw HTTP responses
     * for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): InboundWireDrawdownRequestServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /simulations/inbound_wire_drawdown_requests`, but
         * is otherwise the same as [InboundWireDrawdownRequestServiceAsync.create].
         */
        fun create(
            params: InboundWireDrawdownRequestCreateParams
        ): CompletableFuture<HttpResponseFor<InboundWireDrawdownRequest>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: InboundWireDrawdownRequestCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InboundWireDrawdownRequest>>
    }
}
