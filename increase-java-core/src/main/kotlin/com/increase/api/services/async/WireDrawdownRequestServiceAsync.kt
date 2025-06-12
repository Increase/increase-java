// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.wiredrawdownrequests.WireDrawdownRequest
import com.increase.api.models.wiredrawdownrequests.WireDrawdownRequestCreateParams
import com.increase.api.models.wiredrawdownrequests.WireDrawdownRequestListPageAsync
import com.increase.api.models.wiredrawdownrequests.WireDrawdownRequestListParams
import com.increase.api.models.wiredrawdownrequests.WireDrawdownRequestRetrieveParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface WireDrawdownRequestServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): WireDrawdownRequestServiceAsync

    /** Create a Wire Drawdown Request */
    fun create(params: WireDrawdownRequestCreateParams): CompletableFuture<WireDrawdownRequest> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: WireDrawdownRequestCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WireDrawdownRequest>

    /** Retrieve a Wire Drawdown Request */
    fun retrieve(wireDrawdownRequestId: String): CompletableFuture<WireDrawdownRequest> =
        retrieve(wireDrawdownRequestId, WireDrawdownRequestRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        wireDrawdownRequestId: String,
        params: WireDrawdownRequestRetrieveParams = WireDrawdownRequestRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WireDrawdownRequest> =
        retrieve(
            params.toBuilder().wireDrawdownRequestId(wireDrawdownRequestId).build(),
            requestOptions,
        )

    /** @see [retrieve] */
    fun retrieve(
        wireDrawdownRequestId: String,
        params: WireDrawdownRequestRetrieveParams = WireDrawdownRequestRetrieveParams.none(),
    ): CompletableFuture<WireDrawdownRequest> =
        retrieve(wireDrawdownRequestId, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: WireDrawdownRequestRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WireDrawdownRequest>

    /** @see [retrieve] */
    fun retrieve(
        params: WireDrawdownRequestRetrieveParams
    ): CompletableFuture<WireDrawdownRequest> = retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        wireDrawdownRequestId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<WireDrawdownRequest> =
        retrieve(wireDrawdownRequestId, WireDrawdownRequestRetrieveParams.none(), requestOptions)

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
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): WireDrawdownRequestServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /wire_drawdown_requests`, but is otherwise the same
         * as [WireDrawdownRequestServiceAsync.create].
         */
        fun create(
            params: WireDrawdownRequestCreateParams
        ): CompletableFuture<HttpResponseFor<WireDrawdownRequest>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        fun create(
            params: WireDrawdownRequestCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WireDrawdownRequest>>

        /**
         * Returns a raw HTTP response for `get /wire_drawdown_requests/{wire_drawdown_request_id}`,
         * but is otherwise the same as [WireDrawdownRequestServiceAsync.retrieve].
         */
        fun retrieve(
            wireDrawdownRequestId: String
        ): CompletableFuture<HttpResponseFor<WireDrawdownRequest>> =
            retrieve(wireDrawdownRequestId, WireDrawdownRequestRetrieveParams.none())

        /** @see [retrieve] */
        fun retrieve(
            wireDrawdownRequestId: String,
            params: WireDrawdownRequestRetrieveParams = WireDrawdownRequestRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WireDrawdownRequest>> =
            retrieve(
                params.toBuilder().wireDrawdownRequestId(wireDrawdownRequestId).build(),
                requestOptions,
            )

        /** @see [retrieve] */
        fun retrieve(
            wireDrawdownRequestId: String,
            params: WireDrawdownRequestRetrieveParams = WireDrawdownRequestRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<WireDrawdownRequest>> =
            retrieve(wireDrawdownRequestId, params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            params: WireDrawdownRequestRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WireDrawdownRequest>>

        /** @see [retrieve] */
        fun retrieve(
            params: WireDrawdownRequestRetrieveParams
        ): CompletableFuture<HttpResponseFor<WireDrawdownRequest>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            wireDrawdownRequestId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<WireDrawdownRequest>> =
            retrieve(
                wireDrawdownRequestId,
                WireDrawdownRequestRetrieveParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /wire_drawdown_requests`, but is otherwise the same
         * as [WireDrawdownRequestServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<WireDrawdownRequestListPageAsync>> =
            list(WireDrawdownRequestListParams.none())

        /** @see [list] */
        fun list(
            params: WireDrawdownRequestListParams = WireDrawdownRequestListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WireDrawdownRequestListPageAsync>>

        /** @see [list] */
        fun list(
            params: WireDrawdownRequestListParams = WireDrawdownRequestListParams.none()
        ): CompletableFuture<HttpResponseFor<WireDrawdownRequestListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<WireDrawdownRequestListPageAsync>> =
            list(WireDrawdownRequestListParams.none(), requestOptions)
    }
}
