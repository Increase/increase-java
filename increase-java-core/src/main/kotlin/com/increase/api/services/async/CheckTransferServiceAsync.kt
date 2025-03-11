// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.checktransfers.CheckTransfer
import com.increase.api.models.checktransfers.CheckTransferApproveParams
import com.increase.api.models.checktransfers.CheckTransferCancelParams
import com.increase.api.models.checktransfers.CheckTransferCreateParams
import com.increase.api.models.checktransfers.CheckTransferListPageAsync
import com.increase.api.models.checktransfers.CheckTransferListParams
import com.increase.api.models.checktransfers.CheckTransferRetrieveParams
import com.increase.api.models.checktransfers.CheckTransferStopPaymentParams
import java.util.concurrent.CompletableFuture

interface CheckTransferServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for
     * each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create a Check Transfer */
    fun create(params: CheckTransferCreateParams): CompletableFuture<CheckTransfer> =
        create(
          params, RequestOptions.none()
        )

    /** @see [create] */
    fun create(params: CheckTransferCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<CheckTransfer>

    /** Retrieve a Check Transfer */
    fun retrieve(params: CheckTransferRetrieveParams): CompletableFuture<CheckTransfer> =
        retrieve(
          params, RequestOptions.none()
        )

    /** @see [retrieve] */
    fun retrieve(params: CheckTransferRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<CheckTransfer>

    /** List Check Transfers */
    fun list(): CompletableFuture<CheckTransferListPageAsync> = list(CheckTransferListParams.none())

    /** @see [list] */
    fun list(params: CheckTransferListParams = CheckTransferListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<CheckTransferListPageAsync>

    /** @see [list] */
    fun list(params: CheckTransferListParams = CheckTransferListParams.none()): CompletableFuture<CheckTransferListPageAsync> =
        list(
          params, RequestOptions.none()
        )

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<CheckTransferListPageAsync> = list(CheckTransferListParams.none(), requestOptions)

    /** Approve a Check Transfer */
    fun approve(params: CheckTransferApproveParams): CompletableFuture<CheckTransfer> =
        approve(
          params, RequestOptions.none()
        )

    /** @see [approve] */
    fun approve(params: CheckTransferApproveParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<CheckTransfer>

    /** Cancel a pending Check Transfer */
    fun cancel(params: CheckTransferCancelParams): CompletableFuture<CheckTransfer> =
        cancel(
          params, RequestOptions.none()
        )

    /** @see [cancel] */
    fun cancel(params: CheckTransferCancelParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<CheckTransfer>

    /** Request a stop payment on a Check Transfer */
    fun stopPayment(params: CheckTransferStopPaymentParams): CompletableFuture<CheckTransfer> =
        stopPayment(
          params, RequestOptions.none()
        )

    /** @see [stopPayment] */
    fun stopPayment(params: CheckTransferStopPaymentParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<CheckTransfer>

    /**
     * A view of [CheckTransferServiceAsync] that provides access to raw HTTP responses
     * for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /check_transfers`, but is otherwise the
         * same as [CheckTransferServiceAsync.create].
         */
        @MustBeClosed
        fun create(params: CheckTransferCreateParams): CompletableFuture<HttpResponseFor<CheckTransfer>> =
            create(
              params, RequestOptions.none()
            )

        /** @see [create] */
        @MustBeClosed
        fun create(params: CheckTransferCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<CheckTransfer>>

        /**
         * Returns a raw HTTP response for `get /check_transfers/{check_transfer_id}`, but
         * is otherwise the same as [CheckTransferServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(params: CheckTransferRetrieveParams): CompletableFuture<HttpResponseFor<CheckTransfer>> =
            retrieve(
              params, RequestOptions.none()
            )

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(params: CheckTransferRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<CheckTransfer>>

        /**
         * Returns a raw HTTP response for `get /check_transfers`, but is otherwise the
         * same as [CheckTransferServiceAsync.list].
         */
        @MustBeClosed
        fun list(): CompletableFuture<HttpResponseFor<CheckTransferListPageAsync>> = list(CheckTransferListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(params: CheckTransferListParams = CheckTransferListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<CheckTransferListPageAsync>>

        /** @see [list] */
        @MustBeClosed
        fun list(params: CheckTransferListParams = CheckTransferListParams.none()): CompletableFuture<HttpResponseFor<CheckTransferListPageAsync>> =
            list(
              params, RequestOptions.none()
            )

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<CheckTransferListPageAsync>> = list(CheckTransferListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for
         * `post /check_transfers/{check_transfer_id}/approve`, but is otherwise the same
         * as [CheckTransferServiceAsync.approve].
         */
        @MustBeClosed
        fun approve(params: CheckTransferApproveParams): CompletableFuture<HttpResponseFor<CheckTransfer>> =
            approve(
              params, RequestOptions.none()
            )

        /** @see [approve] */
        @MustBeClosed
        fun approve(params: CheckTransferApproveParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<CheckTransfer>>

        /**
         * Returns a raw HTTP response for
         * `post /check_transfers/{check_transfer_id}/cancel`, but is otherwise the same as
         * [CheckTransferServiceAsync.cancel].
         */
        @MustBeClosed
        fun cancel(params: CheckTransferCancelParams): CompletableFuture<HttpResponseFor<CheckTransfer>> =
            cancel(
              params, RequestOptions.none()
            )

        /** @see [cancel] */
        @MustBeClosed
        fun cancel(params: CheckTransferCancelParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<CheckTransfer>>

        /**
         * Returns a raw HTTP response for
         * `post /check_transfers/{check_transfer_id}/stop_payment`, but is otherwise the
         * same as [CheckTransferServiceAsync.stopPayment].
         */
        @MustBeClosed
        fun stopPayment(params: CheckTransferStopPaymentParams): CompletableFuture<HttpResponseFor<CheckTransfer>> =
            stopPayment(
              params, RequestOptions.none()
            )

        /** @see [stopPayment] */
        @MustBeClosed
        fun stopPayment(params: CheckTransferStopPaymentParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<CheckTransfer>>
    }
}
