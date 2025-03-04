// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.WireTransfer
import com.increase.api.models.WireTransferApproveParams
import com.increase.api.models.WireTransferCancelParams
import com.increase.api.models.WireTransferCreateParams
import com.increase.api.models.WireTransferListPage
import com.increase.api.models.WireTransferListParams
import com.increase.api.models.WireTransferRetrieveParams

interface WireTransferService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create a Wire Transfer */
    @JvmOverloads
    fun create(
        params: WireTransferCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WireTransfer

    /** Retrieve a Wire Transfer */
    @JvmOverloads
    fun retrieve(
        params: WireTransferRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WireTransfer

    /** List Wire Transfers */
    @JvmOverloads
    fun list(
        params: WireTransferListParams = WireTransferListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WireTransferListPage

    /** List Wire Transfers */
    fun list(requestOptions: RequestOptions): WireTransferListPage =
        list(WireTransferListParams.none(), requestOptions)

    /** Approve a Wire Transfer */
    @JvmOverloads
    fun approve(
        params: WireTransferApproveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WireTransfer

    /** Cancel a pending Wire Transfer */
    @JvmOverloads
    fun cancel(
        params: WireTransferCancelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WireTransfer

    /**
     * A view of [WireTransferService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /wire_transfers`, but is otherwise the same as
         * [WireTransferService.create].
         */
        @JvmOverloads
        @MustBeClosed
        fun create(
            params: WireTransferCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WireTransfer>

        /**
         * Returns a raw HTTP response for `get /wire_transfers/{wire_transfer_id}`, but is
         * otherwise the same as [WireTransferService.retrieve].
         */
        @JvmOverloads
        @MustBeClosed
        fun retrieve(
            params: WireTransferRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WireTransfer>

        /**
         * Returns a raw HTTP response for `get /wire_transfers`, but is otherwise the same as
         * [WireTransferService.list].
         */
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: WireTransferListParams = WireTransferListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WireTransferListPage>

        /**
         * Returns a raw HTTP response for `get /wire_transfers`, but is otherwise the same as
         * [WireTransferService.list].
         */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<WireTransferListPage> =
            list(WireTransferListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /wire_transfers/{wire_transfer_id}/approve`, but is
         * otherwise the same as [WireTransferService.approve].
         */
        @JvmOverloads
        @MustBeClosed
        fun approve(
            params: WireTransferApproveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WireTransfer>

        /**
         * Returns a raw HTTP response for `post /wire_transfers/{wire_transfer_id}/cancel`, but is
         * otherwise the same as [WireTransferService.cancel].
         */
        @JvmOverloads
        @MustBeClosed
        fun cancel(
            params: WireTransferCancelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WireTransfer>
    }
}
