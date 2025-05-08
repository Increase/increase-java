// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.wiretransfers.WireTransfer
import com.increase.api.models.wiretransfers.WireTransferApproveParams
import com.increase.api.models.wiretransfers.WireTransferCancelParams
import com.increase.api.models.wiretransfers.WireTransferCreateParams
import com.increase.api.models.wiretransfers.WireTransferListPage
import com.increase.api.models.wiretransfers.WireTransferListParams
import com.increase.api.models.wiretransfers.WireTransferRetrieveParams

interface WireTransferService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create a Wire Transfer */
    fun create(params: WireTransferCreateParams): WireTransfer =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: WireTransferCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WireTransfer

    /** Retrieve a Wire Transfer */
    fun retrieve(wireTransferId: String): WireTransfer =
        retrieve(wireTransferId, WireTransferRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        wireTransferId: String,
        params: WireTransferRetrieveParams = WireTransferRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WireTransfer =
        retrieve(params.toBuilder().wireTransferId(wireTransferId).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        wireTransferId: String,
        params: WireTransferRetrieveParams = WireTransferRetrieveParams.none(),
    ): WireTransfer = retrieve(wireTransferId, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: WireTransferRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WireTransfer

    /** @see [retrieve] */
    fun retrieve(params: WireTransferRetrieveParams): WireTransfer =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(wireTransferId: String, requestOptions: RequestOptions): WireTransfer =
        retrieve(wireTransferId, WireTransferRetrieveParams.none(), requestOptions)

    /** List Wire Transfers */
    fun list(): WireTransferListPage = list(WireTransferListParams.none())

    /** @see [list] */
    fun list(
        params: WireTransferListParams = WireTransferListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WireTransferListPage

    /** @see [list] */
    fun list(params: WireTransferListParams = WireTransferListParams.none()): WireTransferListPage =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): WireTransferListPage =
        list(WireTransferListParams.none(), requestOptions)

    /** Approve a Wire Transfer */
    fun approve(wireTransferId: String): WireTransfer =
        approve(wireTransferId, WireTransferApproveParams.none())

    /** @see [approve] */
    fun approve(
        wireTransferId: String,
        params: WireTransferApproveParams = WireTransferApproveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WireTransfer =
        approve(params.toBuilder().wireTransferId(wireTransferId).build(), requestOptions)

    /** @see [approve] */
    fun approve(
        wireTransferId: String,
        params: WireTransferApproveParams = WireTransferApproveParams.none(),
    ): WireTransfer = approve(wireTransferId, params, RequestOptions.none())

    /** @see [approve] */
    fun approve(
        params: WireTransferApproveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WireTransfer

    /** @see [approve] */
    fun approve(params: WireTransferApproveParams): WireTransfer =
        approve(params, RequestOptions.none())

    /** @see [approve] */
    fun approve(wireTransferId: String, requestOptions: RequestOptions): WireTransfer =
        approve(wireTransferId, WireTransferApproveParams.none(), requestOptions)

    /** Cancel a pending Wire Transfer */
    fun cancel(wireTransferId: String): WireTransfer =
        cancel(wireTransferId, WireTransferCancelParams.none())

    /** @see [cancel] */
    fun cancel(
        wireTransferId: String,
        params: WireTransferCancelParams = WireTransferCancelParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WireTransfer =
        cancel(params.toBuilder().wireTransferId(wireTransferId).build(), requestOptions)

    /** @see [cancel] */
    fun cancel(
        wireTransferId: String,
        params: WireTransferCancelParams = WireTransferCancelParams.none(),
    ): WireTransfer = cancel(wireTransferId, params, RequestOptions.none())

    /** @see [cancel] */
    fun cancel(
        params: WireTransferCancelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WireTransfer

    /** @see [cancel] */
    fun cancel(params: WireTransferCancelParams): WireTransfer =
        cancel(params, RequestOptions.none())

    /** @see [cancel] */
    fun cancel(wireTransferId: String, requestOptions: RequestOptions): WireTransfer =
        cancel(wireTransferId, WireTransferCancelParams.none(), requestOptions)

    /**
     * A view of [WireTransferService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /wire_transfers`, but is otherwise the same as
         * [WireTransferService.create].
         */
        @MustBeClosed
        fun create(params: WireTransferCreateParams): HttpResponseFor<WireTransfer> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: WireTransferCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WireTransfer>

        /**
         * Returns a raw HTTP response for `get /wire_transfers/{wire_transfer_id}`, but is
         * otherwise the same as [WireTransferService.retrieve].
         */
        @MustBeClosed
        fun retrieve(wireTransferId: String): HttpResponseFor<WireTransfer> =
            retrieve(wireTransferId, WireTransferRetrieveParams.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            wireTransferId: String,
            params: WireTransferRetrieveParams = WireTransferRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WireTransfer> =
            retrieve(params.toBuilder().wireTransferId(wireTransferId).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            wireTransferId: String,
            params: WireTransferRetrieveParams = WireTransferRetrieveParams.none(),
        ): HttpResponseFor<WireTransfer> = retrieve(wireTransferId, params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: WireTransferRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WireTransfer>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(params: WireTransferRetrieveParams): HttpResponseFor<WireTransfer> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            wireTransferId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<WireTransfer> =
            retrieve(wireTransferId, WireTransferRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /wire_transfers`, but is otherwise the same as
         * [WireTransferService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<WireTransferListPage> = list(WireTransferListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: WireTransferListParams = WireTransferListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WireTransferListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: WireTransferListParams = WireTransferListParams.none()
        ): HttpResponseFor<WireTransferListPage> = list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<WireTransferListPage> =
            list(WireTransferListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /wire_transfers/{wire_transfer_id}/approve`, but is
         * otherwise the same as [WireTransferService.approve].
         */
        @MustBeClosed
        fun approve(wireTransferId: String): HttpResponseFor<WireTransfer> =
            approve(wireTransferId, WireTransferApproveParams.none())

        /** @see [approve] */
        @MustBeClosed
        fun approve(
            wireTransferId: String,
            params: WireTransferApproveParams = WireTransferApproveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WireTransfer> =
            approve(params.toBuilder().wireTransferId(wireTransferId).build(), requestOptions)

        /** @see [approve] */
        @MustBeClosed
        fun approve(
            wireTransferId: String,
            params: WireTransferApproveParams = WireTransferApproveParams.none(),
        ): HttpResponseFor<WireTransfer> = approve(wireTransferId, params, RequestOptions.none())

        /** @see [approve] */
        @MustBeClosed
        fun approve(
            params: WireTransferApproveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WireTransfer>

        /** @see [approve] */
        @MustBeClosed
        fun approve(params: WireTransferApproveParams): HttpResponseFor<WireTransfer> =
            approve(params, RequestOptions.none())

        /** @see [approve] */
        @MustBeClosed
        fun approve(
            wireTransferId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<WireTransfer> =
            approve(wireTransferId, WireTransferApproveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /wire_transfers/{wire_transfer_id}/cancel`, but is
         * otherwise the same as [WireTransferService.cancel].
         */
        @MustBeClosed
        fun cancel(wireTransferId: String): HttpResponseFor<WireTransfer> =
            cancel(wireTransferId, WireTransferCancelParams.none())

        /** @see [cancel] */
        @MustBeClosed
        fun cancel(
            wireTransferId: String,
            params: WireTransferCancelParams = WireTransferCancelParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WireTransfer> =
            cancel(params.toBuilder().wireTransferId(wireTransferId).build(), requestOptions)

        /** @see [cancel] */
        @MustBeClosed
        fun cancel(
            wireTransferId: String,
            params: WireTransferCancelParams = WireTransferCancelParams.none(),
        ): HttpResponseFor<WireTransfer> = cancel(wireTransferId, params, RequestOptions.none())

        /** @see [cancel] */
        @MustBeClosed
        fun cancel(
            params: WireTransferCancelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WireTransfer>

        /** @see [cancel] */
        @MustBeClosed
        fun cancel(params: WireTransferCancelParams): HttpResponseFor<WireTransfer> =
            cancel(params, RequestOptions.none())

        /** @see [cancel] */
        @MustBeClosed
        fun cancel(
            wireTransferId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<WireTransfer> =
            cancel(wireTransferId, WireTransferCancelParams.none(), requestOptions)
    }
}
