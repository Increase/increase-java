// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.AchTransfer
import com.increase.api.models.AchTransferApproveParams
import com.increase.api.models.AchTransferCancelParams
import com.increase.api.models.AchTransferCreateParams
import com.increase.api.models.AchTransferListPage
import com.increase.api.models.AchTransferListParams
import com.increase.api.models.AchTransferRetrieveParams

interface AchTransferService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create an ACH Transfer */
    @JvmOverloads
    fun create(
        params: AchTransferCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AchTransfer

    /** Retrieve an ACH Transfer */
    @JvmOverloads
    fun retrieve(
        params: AchTransferRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AchTransfer

    /** List ACH Transfers */
    @JvmOverloads
    fun list(
        params: AchTransferListParams = AchTransferListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AchTransferListPage

    /** List ACH Transfers */
    fun list(requestOptions: RequestOptions): AchTransferListPage =
        list(AchTransferListParams.none(), requestOptions)

    /** Approves an ACH Transfer in a pending_approval state. */
    @JvmOverloads
    fun approve(
        params: AchTransferApproveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AchTransfer

    /** Cancels an ACH Transfer in a pending_approval state. */
    @JvmOverloads
    fun cancel(
        params: AchTransferCancelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AchTransfer

    /**
     * A view of [AchTransferService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /ach_transfers`, but is otherwise the same as
         * [AchTransferService.create].
         */
        @JvmOverloads
        @MustBeClosed
        fun create(
            params: AchTransferCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AchTransfer>

        /**
         * Returns a raw HTTP response for `get /ach_transfers/{ach_transfer_id}`, but is otherwise
         * the same as [AchTransferService.retrieve].
         */
        @JvmOverloads
        @MustBeClosed
        fun retrieve(
            params: AchTransferRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AchTransfer>

        /**
         * Returns a raw HTTP response for `get /ach_transfers`, but is otherwise the same as
         * [AchTransferService.list].
         */
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: AchTransferListParams = AchTransferListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AchTransferListPage>

        /**
         * Returns a raw HTTP response for `get /ach_transfers`, but is otherwise the same as
         * [AchTransferService.list].
         */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<AchTransferListPage> =
            list(AchTransferListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /ach_transfers/{ach_transfer_id}/approve`, but is
         * otherwise the same as [AchTransferService.approve].
         */
        @JvmOverloads
        @MustBeClosed
        fun approve(
            params: AchTransferApproveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AchTransfer>

        /**
         * Returns a raw HTTP response for `post /ach_transfers/{ach_transfer_id}/cancel`, but is
         * otherwise the same as [AchTransferService.cancel].
         */
        @JvmOverloads
        @MustBeClosed
        fun cancel(
            params: AchTransferCancelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AchTransfer>
    }
}
