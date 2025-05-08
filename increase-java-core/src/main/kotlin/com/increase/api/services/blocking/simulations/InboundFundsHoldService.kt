// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking.simulations

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.simulations.inboundfundsholds.InboundFundsHoldReleaseParams
import com.increase.api.models.simulations.inboundfundsholds.InboundFundsHoldReleaseResponse

interface InboundFundsHoldService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * This endpoint simulates immediately releasing an Inbound Funds Hold, which might be created
     * as a result of e.g., an ACH debit.
     */
    fun release(inboundFundsHoldId: String): InboundFundsHoldReleaseResponse =
        release(inboundFundsHoldId, InboundFundsHoldReleaseParams.none())

    /** @see [release] */
    fun release(
        inboundFundsHoldId: String,
        params: InboundFundsHoldReleaseParams = InboundFundsHoldReleaseParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InboundFundsHoldReleaseResponse =
        release(params.toBuilder().inboundFundsHoldId(inboundFundsHoldId).build(), requestOptions)

    /** @see [release] */
    fun release(
        inboundFundsHoldId: String,
        params: InboundFundsHoldReleaseParams = InboundFundsHoldReleaseParams.none(),
    ): InboundFundsHoldReleaseResponse = release(inboundFundsHoldId, params, RequestOptions.none())

    /** @see [release] */
    fun release(
        params: InboundFundsHoldReleaseParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InboundFundsHoldReleaseResponse

    /** @see [release] */
    fun release(params: InboundFundsHoldReleaseParams): InboundFundsHoldReleaseResponse =
        release(params, RequestOptions.none())

    /** @see [release] */
    fun release(
        inboundFundsHoldId: String,
        requestOptions: RequestOptions,
    ): InboundFundsHoldReleaseResponse =
        release(inboundFundsHoldId, InboundFundsHoldReleaseParams.none(), requestOptions)

    /**
     * A view of [InboundFundsHoldService] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post
         * /simulations/inbound_funds_holds/{inbound_funds_hold_id}/release`, but is otherwise the
         * same as [InboundFundsHoldService.release].
         */
        @MustBeClosed
        fun release(inboundFundsHoldId: String): HttpResponseFor<InboundFundsHoldReleaseResponse> =
            release(inboundFundsHoldId, InboundFundsHoldReleaseParams.none())

        /** @see [release] */
        @MustBeClosed
        fun release(
            inboundFundsHoldId: String,
            params: InboundFundsHoldReleaseParams = InboundFundsHoldReleaseParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InboundFundsHoldReleaseResponse> =
            release(
                params.toBuilder().inboundFundsHoldId(inboundFundsHoldId).build(),
                requestOptions,
            )

        /** @see [release] */
        @MustBeClosed
        fun release(
            inboundFundsHoldId: String,
            params: InboundFundsHoldReleaseParams = InboundFundsHoldReleaseParams.none(),
        ): HttpResponseFor<InboundFundsHoldReleaseResponse> =
            release(inboundFundsHoldId, params, RequestOptions.none())

        /** @see [release] */
        @MustBeClosed
        fun release(
            params: InboundFundsHoldReleaseParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InboundFundsHoldReleaseResponse>

        /** @see [release] */
        @MustBeClosed
        fun release(
            params: InboundFundsHoldReleaseParams
        ): HttpResponseFor<InboundFundsHoldReleaseResponse> = release(params, RequestOptions.none())

        /** @see [release] */
        @MustBeClosed
        fun release(
            inboundFundsHoldId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InboundFundsHoldReleaseResponse> =
            release(inboundFundsHoldId, InboundFundsHoldReleaseParams.none(), requestOptions)
    }
}
