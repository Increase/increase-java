// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.achtransfers.AchTransfer
import com.increase.api.models.achtransfers.AchTransferApproveParams
import com.increase.api.models.achtransfers.AchTransferCancelParams
import com.increase.api.models.achtransfers.AchTransferCreateParams
import com.increase.api.models.achtransfers.AchTransferListPageAsync
import com.increase.api.models.achtransfers.AchTransferListParams
import com.increase.api.models.achtransfers.AchTransferRetrieveParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface AchTransferServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AchTransferServiceAsync

    /** Create an ACH Transfer */
    fun create(params: AchTransferCreateParams): CompletableFuture<AchTransfer> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: AchTransferCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AchTransfer>

    /** Retrieve an ACH Transfer */
    fun retrieve(achTransferId: String): CompletableFuture<AchTransfer> =
        retrieve(achTransferId, AchTransferRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        achTransferId: String,
        params: AchTransferRetrieveParams = AchTransferRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AchTransfer> =
        retrieve(params.toBuilder().achTransferId(achTransferId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        achTransferId: String,
        params: AchTransferRetrieveParams = AchTransferRetrieveParams.none(),
    ): CompletableFuture<AchTransfer> = retrieve(achTransferId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: AchTransferRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AchTransfer>

    /** @see retrieve */
    fun retrieve(params: AchTransferRetrieveParams): CompletableFuture<AchTransfer> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        achTransferId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<AchTransfer> =
        retrieve(achTransferId, AchTransferRetrieveParams.none(), requestOptions)

    /** List ACH Transfers */
    fun list(): CompletableFuture<AchTransferListPageAsync> = list(AchTransferListParams.none())

    /** @see list */
    fun list(
        params: AchTransferListParams = AchTransferListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AchTransferListPageAsync>

    /** @see list */
    fun list(
        params: AchTransferListParams = AchTransferListParams.none()
    ): CompletableFuture<AchTransferListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<AchTransferListPageAsync> =
        list(AchTransferListParams.none(), requestOptions)

    /** Approves an ACH Transfer in a pending_approval state. */
    fun approve(achTransferId: String): CompletableFuture<AchTransfer> =
        approve(achTransferId, AchTransferApproveParams.none())

    /** @see approve */
    fun approve(
        achTransferId: String,
        params: AchTransferApproveParams = AchTransferApproveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AchTransfer> =
        approve(params.toBuilder().achTransferId(achTransferId).build(), requestOptions)

    /** @see approve */
    fun approve(
        achTransferId: String,
        params: AchTransferApproveParams = AchTransferApproveParams.none(),
    ): CompletableFuture<AchTransfer> = approve(achTransferId, params, RequestOptions.none())

    /** @see approve */
    fun approve(
        params: AchTransferApproveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AchTransfer>

    /** @see approve */
    fun approve(params: AchTransferApproveParams): CompletableFuture<AchTransfer> =
        approve(params, RequestOptions.none())

    /** @see approve */
    fun approve(
        achTransferId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<AchTransfer> =
        approve(achTransferId, AchTransferApproveParams.none(), requestOptions)

    /** Cancels an ACH Transfer in a pending_approval state. */
    fun cancel(achTransferId: String): CompletableFuture<AchTransfer> =
        cancel(achTransferId, AchTransferCancelParams.none())

    /** @see cancel */
    fun cancel(
        achTransferId: String,
        params: AchTransferCancelParams = AchTransferCancelParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AchTransfer> =
        cancel(params.toBuilder().achTransferId(achTransferId).build(), requestOptions)

    /** @see cancel */
    fun cancel(
        achTransferId: String,
        params: AchTransferCancelParams = AchTransferCancelParams.none(),
    ): CompletableFuture<AchTransfer> = cancel(achTransferId, params, RequestOptions.none())

    /** @see cancel */
    fun cancel(
        params: AchTransferCancelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AchTransfer>

    /** @see cancel */
    fun cancel(params: AchTransferCancelParams): CompletableFuture<AchTransfer> =
        cancel(params, RequestOptions.none())

    /** @see cancel */
    fun cancel(
        achTransferId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<AchTransfer> =
        cancel(achTransferId, AchTransferCancelParams.none(), requestOptions)

    /**
     * A view of [AchTransferServiceAsync] that provides access to raw HTTP responses for each
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
        ): AchTransferServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /ach_transfers`, but is otherwise the same as
         * [AchTransferServiceAsync.create].
         */
        fun create(
            params: AchTransferCreateParams
        ): CompletableFuture<HttpResponseFor<AchTransfer>> = create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: AchTransferCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AchTransfer>>

        /**
         * Returns a raw HTTP response for `get /ach_transfers/{ach_transfer_id}`, but is otherwise
         * the same as [AchTransferServiceAsync.retrieve].
         */
        fun retrieve(achTransferId: String): CompletableFuture<HttpResponseFor<AchTransfer>> =
            retrieve(achTransferId, AchTransferRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            achTransferId: String,
            params: AchTransferRetrieveParams = AchTransferRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AchTransfer>> =
            retrieve(params.toBuilder().achTransferId(achTransferId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            achTransferId: String,
            params: AchTransferRetrieveParams = AchTransferRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<AchTransfer>> =
            retrieve(achTransferId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: AchTransferRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AchTransfer>>

        /** @see retrieve */
        fun retrieve(
            params: AchTransferRetrieveParams
        ): CompletableFuture<HttpResponseFor<AchTransfer>> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            achTransferId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AchTransfer>> =
            retrieve(achTransferId, AchTransferRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /ach_transfers`, but is otherwise the same as
         * [AchTransferServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<AchTransferListPageAsync>> =
            list(AchTransferListParams.none())

        /** @see list */
        fun list(
            params: AchTransferListParams = AchTransferListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AchTransferListPageAsync>>

        /** @see list */
        fun list(
            params: AchTransferListParams = AchTransferListParams.none()
        ): CompletableFuture<HttpResponseFor<AchTransferListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<AchTransferListPageAsync>> =
            list(AchTransferListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /ach_transfers/{ach_transfer_id}/approve`, but is
         * otherwise the same as [AchTransferServiceAsync.approve].
         */
        fun approve(achTransferId: String): CompletableFuture<HttpResponseFor<AchTransfer>> =
            approve(achTransferId, AchTransferApproveParams.none())

        /** @see approve */
        fun approve(
            achTransferId: String,
            params: AchTransferApproveParams = AchTransferApproveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AchTransfer>> =
            approve(params.toBuilder().achTransferId(achTransferId).build(), requestOptions)

        /** @see approve */
        fun approve(
            achTransferId: String,
            params: AchTransferApproveParams = AchTransferApproveParams.none(),
        ): CompletableFuture<HttpResponseFor<AchTransfer>> =
            approve(achTransferId, params, RequestOptions.none())

        /** @see approve */
        fun approve(
            params: AchTransferApproveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AchTransfer>>

        /** @see approve */
        fun approve(
            params: AchTransferApproveParams
        ): CompletableFuture<HttpResponseFor<AchTransfer>> = approve(params, RequestOptions.none())

        /** @see approve */
        fun approve(
            achTransferId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AchTransfer>> =
            approve(achTransferId, AchTransferApproveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /ach_transfers/{ach_transfer_id}/cancel`, but is
         * otherwise the same as [AchTransferServiceAsync.cancel].
         */
        fun cancel(achTransferId: String): CompletableFuture<HttpResponseFor<AchTransfer>> =
            cancel(achTransferId, AchTransferCancelParams.none())

        /** @see cancel */
        fun cancel(
            achTransferId: String,
            params: AchTransferCancelParams = AchTransferCancelParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AchTransfer>> =
            cancel(params.toBuilder().achTransferId(achTransferId).build(), requestOptions)

        /** @see cancel */
        fun cancel(
            achTransferId: String,
            params: AchTransferCancelParams = AchTransferCancelParams.none(),
        ): CompletableFuture<HttpResponseFor<AchTransfer>> =
            cancel(achTransferId, params, RequestOptions.none())

        /** @see cancel */
        fun cancel(
            params: AchTransferCancelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AchTransfer>>

        /** @see cancel */
        fun cancel(
            params: AchTransferCancelParams
        ): CompletableFuture<HttpResponseFor<AchTransfer>> = cancel(params, RequestOptions.none())

        /** @see cancel */
        fun cancel(
            achTransferId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AchTransfer>> =
            cancel(achTransferId, AchTransferCancelParams.none(), requestOptions)
    }
}
