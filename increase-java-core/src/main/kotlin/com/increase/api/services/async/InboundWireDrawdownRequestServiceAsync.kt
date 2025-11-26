// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.inboundwiredrawdownrequests.InboundWireDrawdownRequest
import com.increase.api.models.inboundwiredrawdownrequests.InboundWireDrawdownRequestListParams
import com.increase.api.models.inboundwiredrawdownrequests.InboundWireDrawdownRequestListResponse
import com.increase.api.models.inboundwiredrawdownrequests.InboundWireDrawdownRequestRetrieveParams
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

    /** Retrieve an Inbound Wire Drawdown Request */
    fun retrieve(
        inboundWireDrawdownRequestId: String
    ): CompletableFuture<InboundWireDrawdownRequest> =
        retrieve(inboundWireDrawdownRequestId, InboundWireDrawdownRequestRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        inboundWireDrawdownRequestId: String,
        params: InboundWireDrawdownRequestRetrieveParams =
            InboundWireDrawdownRequestRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InboundWireDrawdownRequest> =
        retrieve(
            params.toBuilder().inboundWireDrawdownRequestId(inboundWireDrawdownRequestId).build(),
            requestOptions,
        )

    /** @see retrieve */
    fun retrieve(
        inboundWireDrawdownRequestId: String,
        params: InboundWireDrawdownRequestRetrieveParams =
            InboundWireDrawdownRequestRetrieveParams.none(),
    ): CompletableFuture<InboundWireDrawdownRequest> =
        retrieve(inboundWireDrawdownRequestId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: InboundWireDrawdownRequestRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InboundWireDrawdownRequest>

    /** @see retrieve */
    fun retrieve(
        params: InboundWireDrawdownRequestRetrieveParams
    ): CompletableFuture<InboundWireDrawdownRequest> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        inboundWireDrawdownRequestId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<InboundWireDrawdownRequest> =
        retrieve(
            inboundWireDrawdownRequestId,
            InboundWireDrawdownRequestRetrieveParams.none(),
            requestOptions,
        )

    /** List Inbound Wire Drawdown Requests */
    fun list(): CompletableFuture<InboundWireDrawdownRequestListResponse> =
        list(InboundWireDrawdownRequestListParams.none())

    /** @see list */
    fun list(
        params: InboundWireDrawdownRequestListParams = InboundWireDrawdownRequestListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InboundWireDrawdownRequestListResponse>

    /** @see list */
    fun list(
        params: InboundWireDrawdownRequestListParams = InboundWireDrawdownRequestListParams.none()
    ): CompletableFuture<InboundWireDrawdownRequestListResponse> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        requestOptions: RequestOptions
    ): CompletableFuture<InboundWireDrawdownRequestListResponse> =
        list(InboundWireDrawdownRequestListParams.none(), requestOptions)

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
         * Returns a raw HTTP response for `get
         * /inbound_wire_drawdown_requests/{inbound_wire_drawdown_request_id}`, but is otherwise the
         * same as [InboundWireDrawdownRequestServiceAsync.retrieve].
         */
        fun retrieve(
            inboundWireDrawdownRequestId: String
        ): CompletableFuture<HttpResponseFor<InboundWireDrawdownRequest>> =
            retrieve(inboundWireDrawdownRequestId, InboundWireDrawdownRequestRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            inboundWireDrawdownRequestId: String,
            params: InboundWireDrawdownRequestRetrieveParams =
                InboundWireDrawdownRequestRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InboundWireDrawdownRequest>> =
            retrieve(
                params
                    .toBuilder()
                    .inboundWireDrawdownRequestId(inboundWireDrawdownRequestId)
                    .build(),
                requestOptions,
            )

        /** @see retrieve */
        fun retrieve(
            inboundWireDrawdownRequestId: String,
            params: InboundWireDrawdownRequestRetrieveParams =
                InboundWireDrawdownRequestRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<InboundWireDrawdownRequest>> =
            retrieve(inboundWireDrawdownRequestId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: InboundWireDrawdownRequestRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InboundWireDrawdownRequest>>

        /** @see retrieve */
        fun retrieve(
            params: InboundWireDrawdownRequestRetrieveParams
        ): CompletableFuture<HttpResponseFor<InboundWireDrawdownRequest>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            inboundWireDrawdownRequestId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InboundWireDrawdownRequest>> =
            retrieve(
                inboundWireDrawdownRequestId,
                InboundWireDrawdownRequestRetrieveParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /inbound_wire_drawdown_requests`, but is otherwise
         * the same as [InboundWireDrawdownRequestServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<InboundWireDrawdownRequestListResponse>> =
            list(InboundWireDrawdownRequestListParams.none())

        /** @see list */
        fun list(
            params: InboundWireDrawdownRequestListParams =
                InboundWireDrawdownRequestListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InboundWireDrawdownRequestListResponse>>

        /** @see list */
        fun list(
            params: InboundWireDrawdownRequestListParams =
                InboundWireDrawdownRequestListParams.none()
        ): CompletableFuture<HttpResponseFor<InboundWireDrawdownRequestListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<InboundWireDrawdownRequestListResponse>> =
            list(InboundWireDrawdownRequestListParams.none(), requestOptions)
    }
}
