// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.inboundwiredrawdownrequests.InboundWireDrawdownRequest
import com.increase.api.models.inboundwiredrawdownrequests.InboundWireDrawdownRequestListPageAsync
import com.increase.api.models.inboundwiredrawdownrequests.InboundWireDrawdownRequestListParams
import com.increase.api.models.inboundwiredrawdownrequests.InboundWireDrawdownRequestRetrieveParams
import java.util.concurrent.CompletableFuture

interface InboundWireDrawdownRequestServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Retrieve an Inbound Wire Drawdown Request */
    fun retrieve(
        inboundWireDrawdownRequestId: String
    ): CompletableFuture<InboundWireDrawdownRequest> =
        retrieve(inboundWireDrawdownRequestId, InboundWireDrawdownRequestRetrieveParams.none())

    /** @see [retrieve] */
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

    /** @see [retrieve] */
    fun retrieve(
        inboundWireDrawdownRequestId: String,
        params: InboundWireDrawdownRequestRetrieveParams =
            InboundWireDrawdownRequestRetrieveParams.none(),
    ): CompletableFuture<InboundWireDrawdownRequest> =
        retrieve(inboundWireDrawdownRequestId, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: InboundWireDrawdownRequestRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InboundWireDrawdownRequest>

    /** @see [retrieve] */
    fun retrieve(
        params: InboundWireDrawdownRequestRetrieveParams
    ): CompletableFuture<InboundWireDrawdownRequest> = retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
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
    fun list(): CompletableFuture<InboundWireDrawdownRequestListPageAsync> =
        list(InboundWireDrawdownRequestListParams.none())

    /** @see [list] */
    fun list(
        params: InboundWireDrawdownRequestListParams = InboundWireDrawdownRequestListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InboundWireDrawdownRequestListPageAsync>

    /** @see [list] */
    fun list(
        params: InboundWireDrawdownRequestListParams = InboundWireDrawdownRequestListParams.none()
    ): CompletableFuture<InboundWireDrawdownRequestListPageAsync> =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(
        requestOptions: RequestOptions
    ): CompletableFuture<InboundWireDrawdownRequestListPageAsync> =
        list(InboundWireDrawdownRequestListParams.none(), requestOptions)

    /**
     * A view of [InboundWireDrawdownRequestServiceAsync] that provides access to raw HTTP responses
     * for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get
         * /inbound_wire_drawdown_requests/{inbound_wire_drawdown_request_id}`, but is otherwise the
         * same as [InboundWireDrawdownRequestServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            inboundWireDrawdownRequestId: String
        ): CompletableFuture<HttpResponseFor<InboundWireDrawdownRequest>> =
            retrieve(inboundWireDrawdownRequestId, InboundWireDrawdownRequestRetrieveParams.none())

        /** @see [retrieve] */
        @MustBeClosed
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

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            inboundWireDrawdownRequestId: String,
            params: InboundWireDrawdownRequestRetrieveParams =
                InboundWireDrawdownRequestRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<InboundWireDrawdownRequest>> =
            retrieve(inboundWireDrawdownRequestId, params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: InboundWireDrawdownRequestRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InboundWireDrawdownRequest>>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: InboundWireDrawdownRequestRetrieveParams
        ): CompletableFuture<HttpResponseFor<InboundWireDrawdownRequest>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
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
        @MustBeClosed
        fun list(): CompletableFuture<HttpResponseFor<InboundWireDrawdownRequestListPageAsync>> =
            list(InboundWireDrawdownRequestListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: InboundWireDrawdownRequestListParams =
                InboundWireDrawdownRequestListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InboundWireDrawdownRequestListPageAsync>>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: InboundWireDrawdownRequestListParams =
                InboundWireDrawdownRequestListParams.none()
        ): CompletableFuture<HttpResponseFor<InboundWireDrawdownRequestListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<InboundWireDrawdownRequestListPageAsync>> =
            list(InboundWireDrawdownRequestListParams.none(), requestOptions)
    }
}
