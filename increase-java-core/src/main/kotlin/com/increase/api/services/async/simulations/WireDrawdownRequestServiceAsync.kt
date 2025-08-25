// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async.simulations

import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.simulations.wiredrawdownrequests.WireDrawdownRequestRefuseParams
import com.increase.api.models.simulations.wiredrawdownrequests.WireDrawdownRequestSubmitParams
import com.increase.api.models.wiredrawdownrequests.WireDrawdownRequest
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

    /** Simulates a Wire Drawdown Request being refused by the debtor. */
    fun refuse(wireDrawdownRequestId: String): CompletableFuture<WireDrawdownRequest> =
        refuse(wireDrawdownRequestId, WireDrawdownRequestRefuseParams.none())

    /** @see refuse */
    fun refuse(
        wireDrawdownRequestId: String,
        params: WireDrawdownRequestRefuseParams = WireDrawdownRequestRefuseParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WireDrawdownRequest> =
        refuse(
            params.toBuilder().wireDrawdownRequestId(wireDrawdownRequestId).build(),
            requestOptions,
        )

    /** @see refuse */
    fun refuse(
        wireDrawdownRequestId: String,
        params: WireDrawdownRequestRefuseParams = WireDrawdownRequestRefuseParams.none(),
    ): CompletableFuture<WireDrawdownRequest> =
        refuse(wireDrawdownRequestId, params, RequestOptions.none())

    /** @see refuse */
    fun refuse(
        params: WireDrawdownRequestRefuseParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WireDrawdownRequest>

    /** @see refuse */
    fun refuse(params: WireDrawdownRequestRefuseParams): CompletableFuture<WireDrawdownRequest> =
        refuse(params, RequestOptions.none())

    /** @see refuse */
    fun refuse(
        wireDrawdownRequestId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<WireDrawdownRequest> =
        refuse(wireDrawdownRequestId, WireDrawdownRequestRefuseParams.none(), requestOptions)

    /** Simulates a Wire Drawdown Request being submitted to Fedwire. */
    fun submit(wireDrawdownRequestId: String): CompletableFuture<WireDrawdownRequest> =
        submit(wireDrawdownRequestId, WireDrawdownRequestSubmitParams.none())

    /** @see submit */
    fun submit(
        wireDrawdownRequestId: String,
        params: WireDrawdownRequestSubmitParams = WireDrawdownRequestSubmitParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WireDrawdownRequest> =
        submit(
            params.toBuilder().wireDrawdownRequestId(wireDrawdownRequestId).build(),
            requestOptions,
        )

    /** @see submit */
    fun submit(
        wireDrawdownRequestId: String,
        params: WireDrawdownRequestSubmitParams = WireDrawdownRequestSubmitParams.none(),
    ): CompletableFuture<WireDrawdownRequest> =
        submit(wireDrawdownRequestId, params, RequestOptions.none())

    /** @see submit */
    fun submit(
        params: WireDrawdownRequestSubmitParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WireDrawdownRequest>

    /** @see submit */
    fun submit(params: WireDrawdownRequestSubmitParams): CompletableFuture<WireDrawdownRequest> =
        submit(params, RequestOptions.none())

    /** @see submit */
    fun submit(
        wireDrawdownRequestId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<WireDrawdownRequest> =
        submit(wireDrawdownRequestId, WireDrawdownRequestSubmitParams.none(), requestOptions)

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
         * Returns a raw HTTP response for `post
         * /simulations/wire_drawdown_requests/{wire_drawdown_request_id}/refuse`, but is otherwise
         * the same as [WireDrawdownRequestServiceAsync.refuse].
         */
        fun refuse(
            wireDrawdownRequestId: String
        ): CompletableFuture<HttpResponseFor<WireDrawdownRequest>> =
            refuse(wireDrawdownRequestId, WireDrawdownRequestRefuseParams.none())

        /** @see refuse */
        fun refuse(
            wireDrawdownRequestId: String,
            params: WireDrawdownRequestRefuseParams = WireDrawdownRequestRefuseParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WireDrawdownRequest>> =
            refuse(
                params.toBuilder().wireDrawdownRequestId(wireDrawdownRequestId).build(),
                requestOptions,
            )

        /** @see refuse */
        fun refuse(
            wireDrawdownRequestId: String,
            params: WireDrawdownRequestRefuseParams = WireDrawdownRequestRefuseParams.none(),
        ): CompletableFuture<HttpResponseFor<WireDrawdownRequest>> =
            refuse(wireDrawdownRequestId, params, RequestOptions.none())

        /** @see refuse */
        fun refuse(
            params: WireDrawdownRequestRefuseParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WireDrawdownRequest>>

        /** @see refuse */
        fun refuse(
            params: WireDrawdownRequestRefuseParams
        ): CompletableFuture<HttpResponseFor<WireDrawdownRequest>> =
            refuse(params, RequestOptions.none())

        /** @see refuse */
        fun refuse(
            wireDrawdownRequestId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<WireDrawdownRequest>> =
            refuse(wireDrawdownRequestId, WireDrawdownRequestRefuseParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /simulations/wire_drawdown_requests/{wire_drawdown_request_id}/submit`, but is otherwise
         * the same as [WireDrawdownRequestServiceAsync.submit].
         */
        fun submit(
            wireDrawdownRequestId: String
        ): CompletableFuture<HttpResponseFor<WireDrawdownRequest>> =
            submit(wireDrawdownRequestId, WireDrawdownRequestSubmitParams.none())

        /** @see submit */
        fun submit(
            wireDrawdownRequestId: String,
            params: WireDrawdownRequestSubmitParams = WireDrawdownRequestSubmitParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WireDrawdownRequest>> =
            submit(
                params.toBuilder().wireDrawdownRequestId(wireDrawdownRequestId).build(),
                requestOptions,
            )

        /** @see submit */
        fun submit(
            wireDrawdownRequestId: String,
            params: WireDrawdownRequestSubmitParams = WireDrawdownRequestSubmitParams.none(),
        ): CompletableFuture<HttpResponseFor<WireDrawdownRequest>> =
            submit(wireDrawdownRequestId, params, RequestOptions.none())

        /** @see submit */
        fun submit(
            params: WireDrawdownRequestSubmitParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WireDrawdownRequest>>

        /** @see submit */
        fun submit(
            params: WireDrawdownRequestSubmitParams
        ): CompletableFuture<HttpResponseFor<WireDrawdownRequest>> =
            submit(params, RequestOptions.none())

        /** @see submit */
        fun submit(
            wireDrawdownRequestId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<WireDrawdownRequest>> =
            submit(wireDrawdownRequestId, WireDrawdownRequestSubmitParams.none(), requestOptions)
    }
}
