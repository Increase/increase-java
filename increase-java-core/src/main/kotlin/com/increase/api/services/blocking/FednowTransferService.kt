// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.fednowtransfers.FednowTransfer
import com.increase.api.models.fednowtransfers.FednowTransferApproveParams
import com.increase.api.models.fednowtransfers.FednowTransferCancelParams
import com.increase.api.models.fednowtransfers.FednowTransferCreateParams
import com.increase.api.models.fednowtransfers.FednowTransferListPage
import com.increase.api.models.fednowtransfers.FednowTransferListParams
import com.increase.api.models.fednowtransfers.FednowTransferRetrieveParams
import java.util.function.Consumer

interface FednowTransferService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): FednowTransferService

    /** Create a FedNow Transfer */
    fun create(params: FednowTransferCreateParams): FednowTransfer =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: FednowTransferCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FednowTransfer

    /** Retrieve a FedNow Transfer */
    fun retrieve(fednowTransferId: String): FednowTransfer =
        retrieve(fednowTransferId, FednowTransferRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        fednowTransferId: String,
        params: FednowTransferRetrieveParams = FednowTransferRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FednowTransfer =
        retrieve(params.toBuilder().fednowTransferId(fednowTransferId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        fednowTransferId: String,
        params: FednowTransferRetrieveParams = FednowTransferRetrieveParams.none(),
    ): FednowTransfer = retrieve(fednowTransferId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: FednowTransferRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FednowTransfer

    /** @see retrieve */
    fun retrieve(params: FednowTransferRetrieveParams): FednowTransfer =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(fednowTransferId: String, requestOptions: RequestOptions): FednowTransfer =
        retrieve(fednowTransferId, FednowTransferRetrieveParams.none(), requestOptions)

    /** List FedNow Transfers */
    fun list(): FednowTransferListPage = list(FednowTransferListParams.none())

    /** @see list */
    fun list(
        params: FednowTransferListParams = FednowTransferListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FednowTransferListPage

    /** @see list */
    fun list(
        params: FednowTransferListParams = FednowTransferListParams.none()
    ): FednowTransferListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): FednowTransferListPage =
        list(FednowTransferListParams.none(), requestOptions)

    /** Approve a FedNow Transfer */
    fun approve(fednowTransferId: String): FednowTransfer =
        approve(fednowTransferId, FednowTransferApproveParams.none())

    /** @see approve */
    fun approve(
        fednowTransferId: String,
        params: FednowTransferApproveParams = FednowTransferApproveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FednowTransfer =
        approve(params.toBuilder().fednowTransferId(fednowTransferId).build(), requestOptions)

    /** @see approve */
    fun approve(
        fednowTransferId: String,
        params: FednowTransferApproveParams = FednowTransferApproveParams.none(),
    ): FednowTransfer = approve(fednowTransferId, params, RequestOptions.none())

    /** @see approve */
    fun approve(
        params: FednowTransferApproveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FednowTransfer

    /** @see approve */
    fun approve(params: FednowTransferApproveParams): FednowTransfer =
        approve(params, RequestOptions.none())

    /** @see approve */
    fun approve(fednowTransferId: String, requestOptions: RequestOptions): FednowTransfer =
        approve(fednowTransferId, FednowTransferApproveParams.none(), requestOptions)

    /** Cancel a pending FedNow Transfer */
    fun cancel(fednowTransferId: String): FednowTransfer =
        cancel(fednowTransferId, FednowTransferCancelParams.none())

    /** @see cancel */
    fun cancel(
        fednowTransferId: String,
        params: FednowTransferCancelParams = FednowTransferCancelParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FednowTransfer =
        cancel(params.toBuilder().fednowTransferId(fednowTransferId).build(), requestOptions)

    /** @see cancel */
    fun cancel(
        fednowTransferId: String,
        params: FednowTransferCancelParams = FednowTransferCancelParams.none(),
    ): FednowTransfer = cancel(fednowTransferId, params, RequestOptions.none())

    /** @see cancel */
    fun cancel(
        params: FednowTransferCancelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FednowTransfer

    /** @see cancel */
    fun cancel(params: FednowTransferCancelParams): FednowTransfer =
        cancel(params, RequestOptions.none())

    /** @see cancel */
    fun cancel(fednowTransferId: String, requestOptions: RequestOptions): FednowTransfer =
        cancel(fednowTransferId, FednowTransferCancelParams.none(), requestOptions)

    /**
     * A view of [FednowTransferService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): FednowTransferService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /fednow_transfers`, but is otherwise the same as
         * [FednowTransferService.create].
         */
        @MustBeClosed
        fun create(params: FednowTransferCreateParams): HttpResponseFor<FednowTransfer> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: FednowTransferCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FednowTransfer>

        /**
         * Returns a raw HTTP response for `get /fednow_transfers/{fednow_transfer_id}`, but is
         * otherwise the same as [FednowTransferService.retrieve].
         */
        @MustBeClosed
        fun retrieve(fednowTransferId: String): HttpResponseFor<FednowTransfer> =
            retrieve(fednowTransferId, FednowTransferRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            fednowTransferId: String,
            params: FednowTransferRetrieveParams = FednowTransferRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FednowTransfer> =
            retrieve(params.toBuilder().fednowTransferId(fednowTransferId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            fednowTransferId: String,
            params: FednowTransferRetrieveParams = FednowTransferRetrieveParams.none(),
        ): HttpResponseFor<FednowTransfer> =
            retrieve(fednowTransferId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: FednowTransferRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FednowTransfer>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: FednowTransferRetrieveParams): HttpResponseFor<FednowTransfer> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            fednowTransferId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FednowTransfer> =
            retrieve(fednowTransferId, FednowTransferRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /fednow_transfers`, but is otherwise the same as
         * [FednowTransferService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<FednowTransferListPage> = list(FednowTransferListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: FednowTransferListParams = FednowTransferListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FednowTransferListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: FednowTransferListParams = FednowTransferListParams.none()
        ): HttpResponseFor<FednowTransferListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<FednowTransferListPage> =
            list(FednowTransferListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /fednow_transfers/{fednow_transfer_id}/approve`,
         * but is otherwise the same as [FednowTransferService.approve].
         */
        @MustBeClosed
        fun approve(fednowTransferId: String): HttpResponseFor<FednowTransfer> =
            approve(fednowTransferId, FednowTransferApproveParams.none())

        /** @see approve */
        @MustBeClosed
        fun approve(
            fednowTransferId: String,
            params: FednowTransferApproveParams = FednowTransferApproveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FednowTransfer> =
            approve(params.toBuilder().fednowTransferId(fednowTransferId).build(), requestOptions)

        /** @see approve */
        @MustBeClosed
        fun approve(
            fednowTransferId: String,
            params: FednowTransferApproveParams = FednowTransferApproveParams.none(),
        ): HttpResponseFor<FednowTransfer> =
            approve(fednowTransferId, params, RequestOptions.none())

        /** @see approve */
        @MustBeClosed
        fun approve(
            params: FednowTransferApproveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FednowTransfer>

        /** @see approve */
        @MustBeClosed
        fun approve(params: FednowTransferApproveParams): HttpResponseFor<FednowTransfer> =
            approve(params, RequestOptions.none())

        /** @see approve */
        @MustBeClosed
        fun approve(
            fednowTransferId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FednowTransfer> =
            approve(fednowTransferId, FednowTransferApproveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /fednow_transfers/{fednow_transfer_id}/cancel`, but
         * is otherwise the same as [FednowTransferService.cancel].
         */
        @MustBeClosed
        fun cancel(fednowTransferId: String): HttpResponseFor<FednowTransfer> =
            cancel(fednowTransferId, FednowTransferCancelParams.none())

        /** @see cancel */
        @MustBeClosed
        fun cancel(
            fednowTransferId: String,
            params: FednowTransferCancelParams = FednowTransferCancelParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FednowTransfer> =
            cancel(params.toBuilder().fednowTransferId(fednowTransferId).build(), requestOptions)

        /** @see cancel */
        @MustBeClosed
        fun cancel(
            fednowTransferId: String,
            params: FednowTransferCancelParams = FednowTransferCancelParams.none(),
        ): HttpResponseFor<FednowTransfer> = cancel(fednowTransferId, params, RequestOptions.none())

        /** @see cancel */
        @MustBeClosed
        fun cancel(
            params: FednowTransferCancelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FednowTransfer>

        /** @see cancel */
        @MustBeClosed
        fun cancel(params: FednowTransferCancelParams): HttpResponseFor<FednowTransfer> =
            cancel(params, RequestOptions.none())

        /** @see cancel */
        @MustBeClosed
        fun cancel(
            fednowTransferId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FednowTransfer> =
            cancel(fednowTransferId, FednowTransferCancelParams.none(), requestOptions)
    }
}
