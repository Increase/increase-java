// File generated from our OpenAPI spec by Stainless.

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
    fun retrieve(params: InboundAchTransferRetrieveParams): InboundAchTransfer =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: InboundAchTransferRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InboundAchTransfer

    /** List Inbound ACH Transfers */
    fun list(): InboundAchTransferListPage = list(InboundAchTransferListParams.none())

    /** @see [list] */
    fun list(
        params: InboundAchTransferListParams = InboundAchTransferListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InboundAchTransferListPage

    /** @see [list] */
    fun list(
        params: InboundAchTransferListParams = InboundAchTransferListParams.none()
    ): InboundAchTransferListPage = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): InboundAchTransferListPage =
        list(InboundAchTransferListParams.none(), requestOptions)

    /** Create a notification of change for an Inbound ACH Transfer */
    fun createNotificationOfChange(
        params: InboundAchTransferCreateNotificationOfChangeParams
    ): InboundAchTransfer = createNotificationOfChange(params, RequestOptions.none())

    /** @see [createNotificationOfChange] */
    fun createNotificationOfChange(
        params: InboundAchTransferCreateNotificationOfChangeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InboundAchTransfer

    /** Decline an Inbound ACH Transfer */
    fun decline(params: InboundAchTransferDeclineParams): InboundAchTransfer =
        decline(params, RequestOptions.none())

    /** @see [decline] */
    fun decline(
        params: InboundAchTransferDeclineParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InboundAchTransfer

    /** Return an Inbound ACH Transfer */
    fun transferReturn(params: InboundAchTransferTransferReturnParams): InboundAchTransfer =
        transferReturn(params, RequestOptions.none())

    /** @see [transferReturn] */
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
        @MustBeClosed
        fun retrieve(
            params: InboundAchTransferRetrieveParams
        ): HttpResponseFor<InboundAchTransfer> = retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: InboundAchTransferRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InboundAchTransfer>

        /**
         * Returns a raw HTTP response for `get /inbound_ach_transfers`, but is otherwise the same
         * as [InboundAchTransferService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<InboundAchTransferListPage> =
            list(InboundAchTransferListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: InboundAchTransferListParams = InboundAchTransferListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InboundAchTransferListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: InboundAchTransferListParams = InboundAchTransferListParams.none()
        ): HttpResponseFor<InboundAchTransferListPage> = list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<InboundAchTransferListPage> =
            list(InboundAchTransferListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /inbound_ach_transfers/{inbound_ach_transfer_id}/create_notification_of_change`, but is
         * otherwise the same as [InboundAchTransferService.createNotificationOfChange].
         */
        @MustBeClosed
        fun createNotificationOfChange(
            params: InboundAchTransferCreateNotificationOfChangeParams
        ): HttpResponseFor<InboundAchTransfer> =
            createNotificationOfChange(params, RequestOptions.none())

        /** @see [createNotificationOfChange] */
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
        @MustBeClosed
        fun decline(params: InboundAchTransferDeclineParams): HttpResponseFor<InboundAchTransfer> =
            decline(params, RequestOptions.none())

        /** @see [decline] */
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
        @MustBeClosed
        fun transferReturn(
            params: InboundAchTransferTransferReturnParams
        ): HttpResponseFor<InboundAchTransfer> = transferReturn(params, RequestOptions.none())

        /** @see [transferReturn] */
        @MustBeClosed
        fun transferReturn(
            params: InboundAchTransferTransferReturnParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InboundAchTransfer>
    }
}
