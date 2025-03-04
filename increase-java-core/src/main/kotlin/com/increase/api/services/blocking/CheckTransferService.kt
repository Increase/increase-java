// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.CheckTransfer
import com.increase.api.models.CheckTransferApproveParams
import com.increase.api.models.CheckTransferCancelParams
import com.increase.api.models.CheckTransferCreateParams
import com.increase.api.models.CheckTransferListPage
import com.increase.api.models.CheckTransferListParams
import com.increase.api.models.CheckTransferRetrieveParams
import com.increase.api.models.CheckTransferStopPaymentParams

interface CheckTransferService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create a Check Transfer */
    @JvmOverloads
    fun create(
        params: CheckTransferCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CheckTransfer

    /** Retrieve a Check Transfer */
    @JvmOverloads
    fun retrieve(
        params: CheckTransferRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CheckTransfer

    /** List Check Transfers */
    @JvmOverloads
    fun list(
        params: CheckTransferListParams = CheckTransferListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CheckTransferListPage

    /** List Check Transfers */
    fun list(requestOptions: RequestOptions): CheckTransferListPage =
        list(CheckTransferListParams.none(), requestOptions)

    /** Approve a Check Transfer */
    @JvmOverloads
    fun approve(
        params: CheckTransferApproveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CheckTransfer

    /** Cancel a pending Check Transfer */
    @JvmOverloads
    fun cancel(
        params: CheckTransferCancelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CheckTransfer

    /** Request a stop payment on a Check Transfer */
    @JvmOverloads
    fun stopPayment(
        params: CheckTransferStopPaymentParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CheckTransfer

    /**
     * A view of [CheckTransferService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /check_transfers`, but is otherwise the same as
         * [CheckTransferService.create].
         */
        @JvmOverloads
        @MustBeClosed
        fun create(
            params: CheckTransferCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CheckTransfer>

        /**
         * Returns a raw HTTP response for `get /check_transfers/{check_transfer_id}`, but is
         * otherwise the same as [CheckTransferService.retrieve].
         */
        @JvmOverloads
        @MustBeClosed
        fun retrieve(
            params: CheckTransferRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CheckTransfer>

        /**
         * Returns a raw HTTP response for `get /check_transfers`, but is otherwise the same as
         * [CheckTransferService.list].
         */
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: CheckTransferListParams = CheckTransferListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CheckTransferListPage>

        /**
         * Returns a raw HTTP response for `get /check_transfers`, but is otherwise the same as
         * [CheckTransferService.list].
         */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<CheckTransferListPage> =
            list(CheckTransferListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /check_transfers/{check_transfer_id}/approve`, but
         * is otherwise the same as [CheckTransferService.approve].
         */
        @JvmOverloads
        @MustBeClosed
        fun approve(
            params: CheckTransferApproveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CheckTransfer>

        /**
         * Returns a raw HTTP response for `post /check_transfers/{check_transfer_id}/cancel`, but
         * is otherwise the same as [CheckTransferService.cancel].
         */
        @JvmOverloads
        @MustBeClosed
        fun cancel(
            params: CheckTransferCancelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CheckTransfer>

        /**
         * Returns a raw HTTP response for `post /check_transfers/{check_transfer_id}/stop_payment`,
         * but is otherwise the same as [CheckTransferService.stopPayment].
         */
        @JvmOverloads
        @MustBeClosed
        fun stopPayment(
            params: CheckTransferStopPaymentParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CheckTransfer>
    }
}
