// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking.simulations

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.simulations.wiredrawdownrequests.WireDrawdownRequestRefuseParams
import com.increase.api.models.wiredrawdownrequests.WireDrawdownRequest
import java.util.function.Consumer

interface WireDrawdownRequestService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): WireDrawdownRequestService

    /** Simulates a Wire Drawdown Request being refused by the debtor. */
    fun refuse(wireDrawdownRequestId: String): WireDrawdownRequest =
        refuse(wireDrawdownRequestId, WireDrawdownRequestRefuseParams.none())

    /** @see refuse */
    fun refuse(
        wireDrawdownRequestId: String,
        params: WireDrawdownRequestRefuseParams = WireDrawdownRequestRefuseParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WireDrawdownRequest =
        refuse(
            params.toBuilder().wireDrawdownRequestId(wireDrawdownRequestId).build(),
            requestOptions,
        )

    /** @see refuse */
    fun refuse(
        wireDrawdownRequestId: String,
        params: WireDrawdownRequestRefuseParams = WireDrawdownRequestRefuseParams.none(),
    ): WireDrawdownRequest = refuse(wireDrawdownRequestId, params, RequestOptions.none())

    /** @see refuse */
    fun refuse(
        params: WireDrawdownRequestRefuseParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WireDrawdownRequest

    /** @see refuse */
    fun refuse(params: WireDrawdownRequestRefuseParams): WireDrawdownRequest =
        refuse(params, RequestOptions.none())

    /** @see refuse */
    fun refuse(wireDrawdownRequestId: String, requestOptions: RequestOptions): WireDrawdownRequest =
        refuse(wireDrawdownRequestId, WireDrawdownRequestRefuseParams.none(), requestOptions)

    /**
     * A view of [WireDrawdownRequestService] that provides access to raw HTTP responses for each
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
        ): WireDrawdownRequestService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /simulations/wire_drawdown_requests/{wire_drawdown_request_id}/refuse`, but is otherwise
         * the same as [WireDrawdownRequestService.refuse].
         */
        @MustBeClosed
        fun refuse(wireDrawdownRequestId: String): HttpResponseFor<WireDrawdownRequest> =
            refuse(wireDrawdownRequestId, WireDrawdownRequestRefuseParams.none())

        /** @see refuse */
        @MustBeClosed
        fun refuse(
            wireDrawdownRequestId: String,
            params: WireDrawdownRequestRefuseParams = WireDrawdownRequestRefuseParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WireDrawdownRequest> =
            refuse(
                params.toBuilder().wireDrawdownRequestId(wireDrawdownRequestId).build(),
                requestOptions,
            )

        /** @see refuse */
        @MustBeClosed
        fun refuse(
            wireDrawdownRequestId: String,
            params: WireDrawdownRequestRefuseParams = WireDrawdownRequestRefuseParams.none(),
        ): HttpResponseFor<WireDrawdownRequest> =
            refuse(wireDrawdownRequestId, params, RequestOptions.none())

        /** @see refuse */
        @MustBeClosed
        fun refuse(
            params: WireDrawdownRequestRefuseParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WireDrawdownRequest>

        /** @see refuse */
        @MustBeClosed
        fun refuse(params: WireDrawdownRequestRefuseParams): HttpResponseFor<WireDrawdownRequest> =
            refuse(params, RequestOptions.none())

        /** @see refuse */
        @MustBeClosed
        fun refuse(
            wireDrawdownRequestId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<WireDrawdownRequest> =
            refuse(wireDrawdownRequestId, WireDrawdownRequestRefuseParams.none(), requestOptions)
    }
}
