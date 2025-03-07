// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.WireDrawdownRequest
import com.increase.api.models.WireDrawdownRequestCreateParams
import com.increase.api.models.WireDrawdownRequestListPageAsync
import com.increase.api.models.WireDrawdownRequestListParams
import com.increase.api.models.WireDrawdownRequestRetrieveParams
import java.util.concurrent.CompletableFuture

interface WireDrawdownRequestServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create a Wire Drawdown Request */
    fun create(params: WireDrawdownRequestCreateParams): CompletableFuture<WireDrawdownRequest> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: WireDrawdownRequestCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WireDrawdownRequest>

    /** Retrieve a Wire Drawdown Request */
    fun retrieve(
        params: WireDrawdownRequestRetrieveParams
    ): CompletableFuture<WireDrawdownRequest> = retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: WireDrawdownRequestRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WireDrawdownRequest>

    /** List Wire Drawdown Requests */
    fun list(): CompletableFuture<WireDrawdownRequestListPageAsync> =
        list(WireDrawdownRequestListParams.none())

    /** @see [list] */
    fun list(
        params: WireDrawdownRequestListParams = WireDrawdownRequestListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WireDrawdownRequestListPageAsync>

    /** @see [list] */
    fun list(
        params: WireDrawdownRequestListParams = WireDrawdownRequestListParams.none()
    ): CompletableFuture<WireDrawdownRequestListPageAsync> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<WireDrawdownRequestListPageAsync> =
        list(WireDrawdownRequestListParams.none(), requestOptions)

    /**
     * A view of [WireDrawdownRequestServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /wire_drawdown_requests`, but is otherwise the same
         * as [WireDrawdownRequestServiceAsync.create].
         */
        @MustBeClosed
        fun create(
            params: WireDrawdownRequestCreateParams
        ): CompletableFuture<HttpResponseFor<WireDrawdownRequest>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: WireDrawdownRequestCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WireDrawdownRequest>>

        /**
         * Returns a raw HTTP response for `get /wire_drawdown_requests/{wire_drawdown_request_id}`,
         * but is otherwise the same as [WireDrawdownRequestServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: WireDrawdownRequestRetrieveParams
        ): CompletableFuture<HttpResponseFor<WireDrawdownRequest>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: WireDrawdownRequestRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WireDrawdownRequest>>

        /**
         * Returns a raw HTTP response for `get /wire_drawdown_requests`, but is otherwise the same
         * as [WireDrawdownRequestServiceAsync.list].
         */
        @MustBeClosed
        fun list(): CompletableFuture<HttpResponseFor<WireDrawdownRequestListPageAsync>> =
            list(WireDrawdownRequestListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: WireDrawdownRequestListParams = WireDrawdownRequestListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WireDrawdownRequestListPageAsync>>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: WireDrawdownRequestListParams = WireDrawdownRequestListParams.none()
        ): CompletableFuture<HttpResponseFor<WireDrawdownRequestListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<WireDrawdownRequestListPageAsync>> =
            list(WireDrawdownRequestListParams.none(), requestOptions)
    }
}
