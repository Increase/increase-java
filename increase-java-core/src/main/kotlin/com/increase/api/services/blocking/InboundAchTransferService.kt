// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.InboundAchTransfer
import com.increase.api.models.InboundAchTransferCreateNotificationOfChangeParams
import com.increase.api.models.InboundAchTransferDeclineParams
import com.increase.api.models.InboundAchTransferListPage
import com.increase.api.models.InboundAchTransferListParams
import com.increase.api.models.InboundAchTransferRetrieveParams
import com.increase.api.models.InboundAchTransferTransferReturnParams

interface InboundAchTransferService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Retrieve an Inbound ACH Transfer */
    @JvmOverloads
    fun retrieve(
        params: InboundAchTransferRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InboundAchTransfer

    /** List Inbound ACH Transfers */
    @JvmOverloads
    fun list(
        params: InboundAchTransferListParams = InboundAchTransferListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InboundAchTransferListPage

    /** List Inbound ACH Transfers */
    fun list(requestOptions: RequestOptions): InboundAchTransferListPage =
        list(InboundAchTransferListParams.none(), requestOptions)

    /** Create a notification of change for an Inbound ACH Transfer */
    @JvmOverloads
    fun createNotificationOfChange(
        params: InboundAchTransferCreateNotificationOfChangeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InboundAchTransfer

    /** Decline an Inbound ACH Transfer */
    @JvmOverloads
    fun decline(
        params: InboundAchTransferDeclineParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InboundAchTransfer

    /** Return an Inbound ACH Transfer */
    @JvmOverloads
    fun transferReturn(
        params: InboundAchTransferTransferReturnParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InboundAchTransfer

    /**
     * A view of [InboundAchTransferService] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /inbound_ach_transfers/{inbound_ach_transfer_id}`,
         * but is otherwise the same as [InboundAchTransferService.retrieve].
         */
        @JvmOverloads
        @MustBeClosed
        fun retrieve(
            params: InboundAchTransferRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InboundAchTransfer>

        /**
         * Returns a raw HTTP response for `get /inbound_ach_transfers`, but is otherwise the same
         * as [InboundAchTransferService.list].
         */
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: InboundAchTransferListParams = InboundAchTransferListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InboundAchTransferListPage>

        /**
         * Returns a raw HTTP response for `get /inbound_ach_transfers`, but is otherwise the same
         * as [InboundAchTransferService.list].
         */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<InboundAchTransferListPage> =
            list(InboundAchTransferListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /inbound_ach_transfers/{inbound_ach_transfer_id}/create_notification_of_change`, but is
         * otherwise the same as [InboundAchTransferService.createNotificationOfChange].
         */
        @JvmOverloads
        @MustBeClosed
        fun createNotificationOfChange(
            params: InboundAchTransferCreateNotificationOfChangeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InboundAchTransfer>

        /**
         * Returns a raw HTTP response for `post
         * /inbound_ach_transfers/{inbound_ach_transfer_id}/decline`, but is otherwise the same as
         * [InboundAchTransferService.decline].
         */
        @JvmOverloads
        @MustBeClosed
        fun decline(
            params: InboundAchTransferDeclineParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InboundAchTransfer>

        /**
         * Returns a raw HTTP response for `post
         * /inbound_ach_transfers/{inbound_ach_transfer_id}/transfer_return`, but is otherwise the
         * same as [InboundAchTransferService.transferReturn].
         */
        @JvmOverloads
        @MustBeClosed
        fun transferReturn(
            params: InboundAchTransferTransferReturnParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InboundAchTransfer>
    }
}
