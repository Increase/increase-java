// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.core.ClientOptions
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
import java.util.function.Consumer

interface CheckTransferServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CheckTransferServiceAsync

    /** Create a Check Transfer */
    fun create(params: CheckTransferCreateParams): CompletableFuture<CheckTransfer> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: CheckTransferCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CheckTransfer>

    /** Retrieve a Check Transfer */
    fun retrieve(checkTransferId: String): CompletableFuture<CheckTransfer> =
        retrieve(checkTransferId, CheckTransferRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        checkTransferId: String,
        params: CheckTransferRetrieveParams = CheckTransferRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CheckTransfer> =
        retrieve(params.toBuilder().checkTransferId(checkTransferId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        checkTransferId: String,
        params: CheckTransferRetrieveParams = CheckTransferRetrieveParams.none(),
    ): CompletableFuture<CheckTransfer> = retrieve(checkTransferId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: CheckTransferRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CheckTransfer>

    /** @see retrieve */
    fun retrieve(params: CheckTransferRetrieveParams): CompletableFuture<CheckTransfer> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        checkTransferId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CheckTransfer> =
        retrieve(checkTransferId, CheckTransferRetrieveParams.none(), requestOptions)

    /** List Check Transfers */
    fun list(): CompletableFuture<CheckTransferListPageAsync> = list(CheckTransferListParams.none())

    /** @see list */
    fun list(
        params: CheckTransferListParams = CheckTransferListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CheckTransferListPageAsync>

    /** @see list */
    fun list(
        params: CheckTransferListParams = CheckTransferListParams.none()
    ): CompletableFuture<CheckTransferListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<CheckTransferListPageAsync> =
        list(CheckTransferListParams.none(), requestOptions)

    /** Approve a Check Transfer */
    fun approve(checkTransferId: String): CompletableFuture<CheckTransfer> =
        approve(checkTransferId, CheckTransferApproveParams.none())

    /** @see approve */
    fun approve(
        checkTransferId: String,
        params: CheckTransferApproveParams = CheckTransferApproveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CheckTransfer> =
        approve(params.toBuilder().checkTransferId(checkTransferId).build(), requestOptions)

    /** @see approve */
    fun approve(
        checkTransferId: String,
        params: CheckTransferApproveParams = CheckTransferApproveParams.none(),
    ): CompletableFuture<CheckTransfer> = approve(checkTransferId, params, RequestOptions.none())

    /** @see approve */
    fun approve(
        params: CheckTransferApproveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CheckTransfer>

    /** @see approve */
    fun approve(params: CheckTransferApproveParams): CompletableFuture<CheckTransfer> =
        approve(params, RequestOptions.none())

    /** @see approve */
    fun approve(
        checkTransferId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CheckTransfer> =
        approve(checkTransferId, CheckTransferApproveParams.none(), requestOptions)

    /** Cancel a pending Check Transfer */
    fun cancel(checkTransferId: String): CompletableFuture<CheckTransfer> =
        cancel(checkTransferId, CheckTransferCancelParams.none())

    /** @see cancel */
    fun cancel(
        checkTransferId: String,
        params: CheckTransferCancelParams = CheckTransferCancelParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CheckTransfer> =
        cancel(params.toBuilder().checkTransferId(checkTransferId).build(), requestOptions)

    /** @see cancel */
    fun cancel(
        checkTransferId: String,
        params: CheckTransferCancelParams = CheckTransferCancelParams.none(),
    ): CompletableFuture<CheckTransfer> = cancel(checkTransferId, params, RequestOptions.none())

    /** @see cancel */
    fun cancel(
        params: CheckTransferCancelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CheckTransfer>

    /** @see cancel */
    fun cancel(params: CheckTransferCancelParams): CompletableFuture<CheckTransfer> =
        cancel(params, RequestOptions.none())

    /** @see cancel */
    fun cancel(
        checkTransferId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CheckTransfer> =
        cancel(checkTransferId, CheckTransferCancelParams.none(), requestOptions)

    /** Stop payment on a Check Transfer */
    fun stopPayment(checkTransferId: String): CompletableFuture<CheckTransfer> =
        stopPayment(checkTransferId, CheckTransferStopPaymentParams.none())

    /** @see stopPayment */
    fun stopPayment(
        checkTransferId: String,
        params: CheckTransferStopPaymentParams = CheckTransferStopPaymentParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CheckTransfer> =
        stopPayment(params.toBuilder().checkTransferId(checkTransferId).build(), requestOptions)

    /** @see stopPayment */
    fun stopPayment(
        checkTransferId: String,
        params: CheckTransferStopPaymentParams = CheckTransferStopPaymentParams.none(),
    ): CompletableFuture<CheckTransfer> =
        stopPayment(checkTransferId, params, RequestOptions.none())

    /** @see stopPayment */
    fun stopPayment(
        params: CheckTransferStopPaymentParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CheckTransfer>

    /** @see stopPayment */
    fun stopPayment(params: CheckTransferStopPaymentParams): CompletableFuture<CheckTransfer> =
        stopPayment(params, RequestOptions.none())

    /** @see stopPayment */
    fun stopPayment(
        checkTransferId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CheckTransfer> =
        stopPayment(checkTransferId, CheckTransferStopPaymentParams.none(), requestOptions)

    /**
     * A view of [CheckTransferServiceAsync] that provides access to raw HTTP responses for each
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
        ): CheckTransferServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /check_transfers`, but is otherwise the same as
         * [CheckTransferServiceAsync.create].
         */
        fun create(
            params: CheckTransferCreateParams
        ): CompletableFuture<HttpResponseFor<CheckTransfer>> = create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: CheckTransferCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CheckTransfer>>

        /**
         * Returns a raw HTTP response for `get /check_transfers/{check_transfer_id}`, but is
         * otherwise the same as [CheckTransferServiceAsync.retrieve].
         */
        fun retrieve(checkTransferId: String): CompletableFuture<HttpResponseFor<CheckTransfer>> =
            retrieve(checkTransferId, CheckTransferRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            checkTransferId: String,
            params: CheckTransferRetrieveParams = CheckTransferRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CheckTransfer>> =
            retrieve(params.toBuilder().checkTransferId(checkTransferId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            checkTransferId: String,
            params: CheckTransferRetrieveParams = CheckTransferRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<CheckTransfer>> =
            retrieve(checkTransferId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: CheckTransferRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CheckTransfer>>

        /** @see retrieve */
        fun retrieve(
            params: CheckTransferRetrieveParams
        ): CompletableFuture<HttpResponseFor<CheckTransfer>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            checkTransferId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CheckTransfer>> =
            retrieve(checkTransferId, CheckTransferRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /check_transfers`, but is otherwise the same as
         * [CheckTransferServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<CheckTransferListPageAsync>> =
            list(CheckTransferListParams.none())

        /** @see list */
        fun list(
            params: CheckTransferListParams = CheckTransferListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CheckTransferListPageAsync>>

        /** @see list */
        fun list(
            params: CheckTransferListParams = CheckTransferListParams.none()
        ): CompletableFuture<HttpResponseFor<CheckTransferListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<CheckTransferListPageAsync>> =
            list(CheckTransferListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /check_transfers/{check_transfer_id}/approve`, but
         * is otherwise the same as [CheckTransferServiceAsync.approve].
         */
        fun approve(checkTransferId: String): CompletableFuture<HttpResponseFor<CheckTransfer>> =
            approve(checkTransferId, CheckTransferApproveParams.none())

        /** @see approve */
        fun approve(
            checkTransferId: String,
            params: CheckTransferApproveParams = CheckTransferApproveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CheckTransfer>> =
            approve(params.toBuilder().checkTransferId(checkTransferId).build(), requestOptions)

        /** @see approve */
        fun approve(
            checkTransferId: String,
            params: CheckTransferApproveParams = CheckTransferApproveParams.none(),
        ): CompletableFuture<HttpResponseFor<CheckTransfer>> =
            approve(checkTransferId, params, RequestOptions.none())

        /** @see approve */
        fun approve(
            params: CheckTransferApproveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CheckTransfer>>

        /** @see approve */
        fun approve(
            params: CheckTransferApproveParams
        ): CompletableFuture<HttpResponseFor<CheckTransfer>> =
            approve(params, RequestOptions.none())

        /** @see approve */
        fun approve(
            checkTransferId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CheckTransfer>> =
            approve(checkTransferId, CheckTransferApproveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /check_transfers/{check_transfer_id}/cancel`, but
         * is otherwise the same as [CheckTransferServiceAsync.cancel].
         */
        fun cancel(checkTransferId: String): CompletableFuture<HttpResponseFor<CheckTransfer>> =
            cancel(checkTransferId, CheckTransferCancelParams.none())

        /** @see cancel */
        fun cancel(
            checkTransferId: String,
            params: CheckTransferCancelParams = CheckTransferCancelParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CheckTransfer>> =
            cancel(params.toBuilder().checkTransferId(checkTransferId).build(), requestOptions)

        /** @see cancel */
        fun cancel(
            checkTransferId: String,
            params: CheckTransferCancelParams = CheckTransferCancelParams.none(),
        ): CompletableFuture<HttpResponseFor<CheckTransfer>> =
            cancel(checkTransferId, params, RequestOptions.none())

        /** @see cancel */
        fun cancel(
            params: CheckTransferCancelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CheckTransfer>>

        /** @see cancel */
        fun cancel(
            params: CheckTransferCancelParams
        ): CompletableFuture<HttpResponseFor<CheckTransfer>> = cancel(params, RequestOptions.none())

        /** @see cancel */
        fun cancel(
            checkTransferId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CheckTransfer>> =
            cancel(checkTransferId, CheckTransferCancelParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /check_transfers/{check_transfer_id}/stop_payment`,
         * but is otherwise the same as [CheckTransferServiceAsync.stopPayment].
         */
        fun stopPayment(
            checkTransferId: String
        ): CompletableFuture<HttpResponseFor<CheckTransfer>> =
            stopPayment(checkTransferId, CheckTransferStopPaymentParams.none())

        /** @see stopPayment */
        fun stopPayment(
            checkTransferId: String,
            params: CheckTransferStopPaymentParams = CheckTransferStopPaymentParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CheckTransfer>> =
            stopPayment(params.toBuilder().checkTransferId(checkTransferId).build(), requestOptions)

        /** @see stopPayment */
        fun stopPayment(
            checkTransferId: String,
            params: CheckTransferStopPaymentParams = CheckTransferStopPaymentParams.none(),
        ): CompletableFuture<HttpResponseFor<CheckTransfer>> =
            stopPayment(checkTransferId, params, RequestOptions.none())

        /** @see stopPayment */
        fun stopPayment(
            params: CheckTransferStopPaymentParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CheckTransfer>>

        /** @see stopPayment */
        fun stopPayment(
            params: CheckTransferStopPaymentParams
        ): CompletableFuture<HttpResponseFor<CheckTransfer>> =
            stopPayment(params, RequestOptions.none())

        /** @see stopPayment */
        fun stopPayment(
            checkTransferId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CheckTransfer>> =
            stopPayment(checkTransferId, CheckTransferStopPaymentParams.none(), requestOptions)
    }
}
