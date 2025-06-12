// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async.simulations

import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.simulations.inboundfundsholds.InboundFundsHoldReleaseParams
import com.increase.api.models.simulations.inboundfundsholds.InboundFundsHoldReleaseResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface InboundFundsHoldServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): InboundFundsHoldServiceAsync

    /**
     * This endpoint simulates immediately releasing an Inbound Funds Hold, which might be created
     * as a result of e.g., an ACH debit.
     */
    fun release(inboundFundsHoldId: String): CompletableFuture<InboundFundsHoldReleaseResponse> =
        release(inboundFundsHoldId, InboundFundsHoldReleaseParams.none())

    /** @see [release] */
    fun release(
        inboundFundsHoldId: String,
        params: InboundFundsHoldReleaseParams = InboundFundsHoldReleaseParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InboundFundsHoldReleaseResponse> =
        release(params.toBuilder().inboundFundsHoldId(inboundFundsHoldId).build(), requestOptions)

    /** @see [release] */
    fun release(
        inboundFundsHoldId: String,
        params: InboundFundsHoldReleaseParams = InboundFundsHoldReleaseParams.none(),
    ): CompletableFuture<InboundFundsHoldReleaseResponse> =
        release(inboundFundsHoldId, params, RequestOptions.none())

    /** @see [release] */
    fun release(
        params: InboundFundsHoldReleaseParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InboundFundsHoldReleaseResponse>

    /** @see [release] */
    fun release(
        params: InboundFundsHoldReleaseParams
    ): CompletableFuture<InboundFundsHoldReleaseResponse> = release(params, RequestOptions.none())

    /** @see [release] */
    fun release(
        inboundFundsHoldId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<InboundFundsHoldReleaseResponse> =
        release(inboundFundsHoldId, InboundFundsHoldReleaseParams.none(), requestOptions)

    /**
     * A view of [InboundFundsHoldServiceAsync] that provides access to raw HTTP responses for each
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
        ): InboundFundsHoldServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /simulations/inbound_funds_holds/{inbound_funds_hold_id}/release`, but is otherwise the
         * same as [InboundFundsHoldServiceAsync.release].
         */
        fun release(
            inboundFundsHoldId: String
        ): CompletableFuture<HttpResponseFor<InboundFundsHoldReleaseResponse>> =
            release(inboundFundsHoldId, InboundFundsHoldReleaseParams.none())

        /** @see [release] */
        fun release(
            inboundFundsHoldId: String,
            params: InboundFundsHoldReleaseParams = InboundFundsHoldReleaseParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InboundFundsHoldReleaseResponse>> =
            release(
                params.toBuilder().inboundFundsHoldId(inboundFundsHoldId).build(),
                requestOptions,
            )

        /** @see [release] */
        fun release(
            inboundFundsHoldId: String,
            params: InboundFundsHoldReleaseParams = InboundFundsHoldReleaseParams.none(),
        ): CompletableFuture<HttpResponseFor<InboundFundsHoldReleaseResponse>> =
            release(inboundFundsHoldId, params, RequestOptions.none())

        /** @see [release] */
        fun release(
            params: InboundFundsHoldReleaseParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InboundFundsHoldReleaseResponse>>

        /** @see [release] */
        fun release(
            params: InboundFundsHoldReleaseParams
        ): CompletableFuture<HttpResponseFor<InboundFundsHoldReleaseResponse>> =
            release(params, RequestOptions.none())

        /** @see [release] */
        fun release(
            inboundFundsHoldId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InboundFundsHoldReleaseResponse>> =
            release(inboundFundsHoldId, InboundFundsHoldReleaseParams.none(), requestOptions)
    }
}
