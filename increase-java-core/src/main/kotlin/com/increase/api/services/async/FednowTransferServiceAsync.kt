// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.fednowtransfers.FednowTransfer
import com.increase.api.models.fednowtransfers.FednowTransferApproveParams
import com.increase.api.models.fednowtransfers.FednowTransferCancelParams
import com.increase.api.models.fednowtransfers.FednowTransferCreateParams
import com.increase.api.models.fednowtransfers.FednowTransferListParams
import com.increase.api.models.fednowtransfers.FednowTransferListResponse
import com.increase.api.models.fednowtransfers.FednowTransferRetrieveParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface FednowTransferServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): FednowTransferServiceAsync

    /** Create a FedNow Transfer */
    fun create(params: FednowTransferCreateParams): CompletableFuture<FednowTransfer> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: FednowTransferCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FednowTransfer>

    /** Retrieve a FedNow Transfer */
    fun retrieve(fednowTransferId: String): CompletableFuture<FednowTransfer> =
        retrieve(fednowTransferId, FednowTransferRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        fednowTransferId: String,
        params: FednowTransferRetrieveParams = FednowTransferRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FednowTransfer> =
        retrieve(params.toBuilder().fednowTransferId(fednowTransferId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        fednowTransferId: String,
        params: FednowTransferRetrieveParams = FednowTransferRetrieveParams.none(),
    ): CompletableFuture<FednowTransfer> = retrieve(fednowTransferId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: FednowTransferRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FednowTransfer>

    /** @see retrieve */
    fun retrieve(params: FednowTransferRetrieveParams): CompletableFuture<FednowTransfer> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        fednowTransferId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<FednowTransfer> =
        retrieve(fednowTransferId, FednowTransferRetrieveParams.none(), requestOptions)

    /** List FedNow Transfers */
    fun list(): CompletableFuture<FednowTransferListResponse> =
        list(FednowTransferListParams.none())

    /** @see list */
    fun list(
        params: FednowTransferListParams = FednowTransferListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FednowTransferListResponse>

    /** @see list */
    fun list(
        params: FednowTransferListParams = FednowTransferListParams.none()
    ): CompletableFuture<FednowTransferListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<FednowTransferListResponse> =
        list(FednowTransferListParams.none(), requestOptions)

    /** Approve a FedNow Transfer */
    fun approve(fednowTransferId: String): CompletableFuture<FednowTransfer> =
        approve(fednowTransferId, FednowTransferApproveParams.none())

    /** @see approve */
    fun approve(
        fednowTransferId: String,
        params: FednowTransferApproveParams = FednowTransferApproveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FednowTransfer> =
        approve(params.toBuilder().fednowTransferId(fednowTransferId).build(), requestOptions)

    /** @see approve */
    fun approve(
        fednowTransferId: String,
        params: FednowTransferApproveParams = FednowTransferApproveParams.none(),
    ): CompletableFuture<FednowTransfer> = approve(fednowTransferId, params, RequestOptions.none())

    /** @see approve */
    fun approve(
        params: FednowTransferApproveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FednowTransfer>

    /** @see approve */
    fun approve(params: FednowTransferApproveParams): CompletableFuture<FednowTransfer> =
        approve(params, RequestOptions.none())

    /** @see approve */
    fun approve(
        fednowTransferId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<FednowTransfer> =
        approve(fednowTransferId, FednowTransferApproveParams.none(), requestOptions)

    /** Cancel a pending FedNow Transfer */
    fun cancel(fednowTransferId: String): CompletableFuture<FednowTransfer> =
        cancel(fednowTransferId, FednowTransferCancelParams.none())

    /** @see cancel */
    fun cancel(
        fednowTransferId: String,
        params: FednowTransferCancelParams = FednowTransferCancelParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FednowTransfer> =
        cancel(params.toBuilder().fednowTransferId(fednowTransferId).build(), requestOptions)

    /** @see cancel */
    fun cancel(
        fednowTransferId: String,
        params: FednowTransferCancelParams = FednowTransferCancelParams.none(),
    ): CompletableFuture<FednowTransfer> = cancel(fednowTransferId, params, RequestOptions.none())

    /** @see cancel */
    fun cancel(
        params: FednowTransferCancelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FednowTransfer>

    /** @see cancel */
    fun cancel(params: FednowTransferCancelParams): CompletableFuture<FednowTransfer> =
        cancel(params, RequestOptions.none())

    /** @see cancel */
    fun cancel(
        fednowTransferId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<FednowTransfer> =
        cancel(fednowTransferId, FednowTransferCancelParams.none(), requestOptions)

    /**
     * A view of [FednowTransferServiceAsync] that provides access to raw HTTP responses for each
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
        ): FednowTransferServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /fednow_transfers`, but is otherwise the same as
         * [FednowTransferServiceAsync.create].
         */
        fun create(
            params: FednowTransferCreateParams
        ): CompletableFuture<HttpResponseFor<FednowTransfer>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: FednowTransferCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FednowTransfer>>

        /**
         * Returns a raw HTTP response for `get /fednow_transfers/{fednow_transfer_id}`, but is
         * otherwise the same as [FednowTransferServiceAsync.retrieve].
         */
        fun retrieve(fednowTransferId: String): CompletableFuture<HttpResponseFor<FednowTransfer>> =
            retrieve(fednowTransferId, FednowTransferRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            fednowTransferId: String,
            params: FednowTransferRetrieveParams = FednowTransferRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FednowTransfer>> =
            retrieve(params.toBuilder().fednowTransferId(fednowTransferId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            fednowTransferId: String,
            params: FednowTransferRetrieveParams = FednowTransferRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<FednowTransfer>> =
            retrieve(fednowTransferId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: FednowTransferRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FednowTransfer>>

        /** @see retrieve */
        fun retrieve(
            params: FednowTransferRetrieveParams
        ): CompletableFuture<HttpResponseFor<FednowTransfer>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            fednowTransferId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FednowTransfer>> =
            retrieve(fednowTransferId, FednowTransferRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /fednow_transfers`, but is otherwise the same as
         * [FednowTransferServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<FednowTransferListResponse>> =
            list(FednowTransferListParams.none())

        /** @see list */
        fun list(
            params: FednowTransferListParams = FednowTransferListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FednowTransferListResponse>>

        /** @see list */
        fun list(
            params: FednowTransferListParams = FednowTransferListParams.none()
        ): CompletableFuture<HttpResponseFor<FednowTransferListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<FednowTransferListResponse>> =
            list(FednowTransferListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /fednow_transfers/{fednow_transfer_id}/approve`,
         * but is otherwise the same as [FednowTransferServiceAsync.approve].
         */
        fun approve(fednowTransferId: String): CompletableFuture<HttpResponseFor<FednowTransfer>> =
            approve(fednowTransferId, FednowTransferApproveParams.none())

        /** @see approve */
        fun approve(
            fednowTransferId: String,
            params: FednowTransferApproveParams = FednowTransferApproveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FednowTransfer>> =
            approve(params.toBuilder().fednowTransferId(fednowTransferId).build(), requestOptions)

        /** @see approve */
        fun approve(
            fednowTransferId: String,
            params: FednowTransferApproveParams = FednowTransferApproveParams.none(),
        ): CompletableFuture<HttpResponseFor<FednowTransfer>> =
            approve(fednowTransferId, params, RequestOptions.none())

        /** @see approve */
        fun approve(
            params: FednowTransferApproveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FednowTransfer>>

        /** @see approve */
        fun approve(
            params: FednowTransferApproveParams
        ): CompletableFuture<HttpResponseFor<FednowTransfer>> =
            approve(params, RequestOptions.none())

        /** @see approve */
        fun approve(
            fednowTransferId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FednowTransfer>> =
            approve(fednowTransferId, FednowTransferApproveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /fednow_transfers/{fednow_transfer_id}/cancel`, but
         * is otherwise the same as [FednowTransferServiceAsync.cancel].
         */
        fun cancel(fednowTransferId: String): CompletableFuture<HttpResponseFor<FednowTransfer>> =
            cancel(fednowTransferId, FednowTransferCancelParams.none())

        /** @see cancel */
        fun cancel(
            fednowTransferId: String,
            params: FednowTransferCancelParams = FednowTransferCancelParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FednowTransfer>> =
            cancel(params.toBuilder().fednowTransferId(fednowTransferId).build(), requestOptions)

        /** @see cancel */
        fun cancel(
            fednowTransferId: String,
            params: FednowTransferCancelParams = FednowTransferCancelParams.none(),
        ): CompletableFuture<HttpResponseFor<FednowTransfer>> =
            cancel(fednowTransferId, params, RequestOptions.none())

        /** @see cancel */
        fun cancel(
            params: FednowTransferCancelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FednowTransfer>>

        /** @see cancel */
        fun cancel(
            params: FednowTransferCancelParams
        ): CompletableFuture<HttpResponseFor<FednowTransfer>> =
            cancel(params, RequestOptions.none())

        /** @see cancel */
        fun cancel(
            fednowTransferId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FednowTransfer>> =
            cancel(fednowTransferId, FednowTransferCancelParams.none(), requestOptions)
    }
}
