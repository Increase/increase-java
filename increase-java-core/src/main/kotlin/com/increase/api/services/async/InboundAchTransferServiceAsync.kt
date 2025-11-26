// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.inboundachtransfers.InboundAchTransfer
import com.increase.api.models.inboundachtransfers.InboundAchTransferCreateNotificationOfChangeParams
import com.increase.api.models.inboundachtransfers.InboundAchTransferDeclineParams
import com.increase.api.models.inboundachtransfers.InboundAchTransferListParams
import com.increase.api.models.inboundachtransfers.InboundAchTransferListResponse
import com.increase.api.models.inboundachtransfers.InboundAchTransferRetrieveParams
import com.increase.api.models.inboundachtransfers.InboundAchTransferTransferReturnParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface InboundAchTransferServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): InboundAchTransferServiceAsync

    /** Retrieve an Inbound ACH Transfer */
    fun retrieve(inboundAchTransferId: String): CompletableFuture<InboundAchTransfer> =
        retrieve(inboundAchTransferId, InboundAchTransferRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        inboundAchTransferId: String,
        params: InboundAchTransferRetrieveParams = InboundAchTransferRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InboundAchTransfer> =
        retrieve(
            params.toBuilder().inboundAchTransferId(inboundAchTransferId).build(),
            requestOptions,
        )

    /** @see retrieve */
    fun retrieve(
        inboundAchTransferId: String,
        params: InboundAchTransferRetrieveParams = InboundAchTransferRetrieveParams.none(),
    ): CompletableFuture<InboundAchTransfer> =
        retrieve(inboundAchTransferId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: InboundAchTransferRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InboundAchTransfer>

    /** @see retrieve */
    fun retrieve(params: InboundAchTransferRetrieveParams): CompletableFuture<InboundAchTransfer> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        inboundAchTransferId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<InboundAchTransfer> =
        retrieve(inboundAchTransferId, InboundAchTransferRetrieveParams.none(), requestOptions)

    /** List Inbound ACH Transfers */
    fun list(): CompletableFuture<InboundAchTransferListResponse> =
        list(InboundAchTransferListParams.none())

    /** @see list */
    fun list(
        params: InboundAchTransferListParams = InboundAchTransferListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InboundAchTransferListResponse>

    /** @see list */
    fun list(
        params: InboundAchTransferListParams = InboundAchTransferListParams.none()
    ): CompletableFuture<InboundAchTransferListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<InboundAchTransferListResponse> =
        list(InboundAchTransferListParams.none(), requestOptions)

    /** Create a notification of change for an Inbound ACH Transfer */
    fun createNotificationOfChange(
        inboundAchTransferId: String
    ): CompletableFuture<InboundAchTransfer> =
        createNotificationOfChange(
            inboundAchTransferId,
            InboundAchTransferCreateNotificationOfChangeParams.none(),
        )

    /** @see createNotificationOfChange */
    fun createNotificationOfChange(
        inboundAchTransferId: String,
        params: InboundAchTransferCreateNotificationOfChangeParams =
            InboundAchTransferCreateNotificationOfChangeParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InboundAchTransfer> =
        createNotificationOfChange(
            params.toBuilder().inboundAchTransferId(inboundAchTransferId).build(),
            requestOptions,
        )

    /** @see createNotificationOfChange */
    fun createNotificationOfChange(
        inboundAchTransferId: String,
        params: InboundAchTransferCreateNotificationOfChangeParams =
            InboundAchTransferCreateNotificationOfChangeParams.none(),
    ): CompletableFuture<InboundAchTransfer> =
        createNotificationOfChange(inboundAchTransferId, params, RequestOptions.none())

    /** @see createNotificationOfChange */
    fun createNotificationOfChange(
        params: InboundAchTransferCreateNotificationOfChangeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InboundAchTransfer>

    /** @see createNotificationOfChange */
    fun createNotificationOfChange(
        params: InboundAchTransferCreateNotificationOfChangeParams
    ): CompletableFuture<InboundAchTransfer> =
        createNotificationOfChange(params, RequestOptions.none())

    /** @see createNotificationOfChange */
    fun createNotificationOfChange(
        inboundAchTransferId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<InboundAchTransfer> =
        createNotificationOfChange(
            inboundAchTransferId,
            InboundAchTransferCreateNotificationOfChangeParams.none(),
            requestOptions,
        )

    /** Decline an Inbound ACH Transfer */
    fun decline(inboundAchTransferId: String): CompletableFuture<InboundAchTransfer> =
        decline(inboundAchTransferId, InboundAchTransferDeclineParams.none())

    /** @see decline */
    fun decline(
        inboundAchTransferId: String,
        params: InboundAchTransferDeclineParams = InboundAchTransferDeclineParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InboundAchTransfer> =
        decline(
            params.toBuilder().inboundAchTransferId(inboundAchTransferId).build(),
            requestOptions,
        )

    /** @see decline */
    fun decline(
        inboundAchTransferId: String,
        params: InboundAchTransferDeclineParams = InboundAchTransferDeclineParams.none(),
    ): CompletableFuture<InboundAchTransfer> =
        decline(inboundAchTransferId, params, RequestOptions.none())

    /** @see decline */
    fun decline(
        params: InboundAchTransferDeclineParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InboundAchTransfer>

    /** @see decline */
    fun decline(params: InboundAchTransferDeclineParams): CompletableFuture<InboundAchTransfer> =
        decline(params, RequestOptions.none())

    /** @see decline */
    fun decline(
        inboundAchTransferId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<InboundAchTransfer> =
        decline(inboundAchTransferId, InboundAchTransferDeclineParams.none(), requestOptions)

    /** Return an Inbound ACH Transfer */
    fun transferReturn(
        inboundAchTransferId: String,
        params: InboundAchTransferTransferReturnParams,
    ): CompletableFuture<InboundAchTransfer> =
        transferReturn(inboundAchTransferId, params, RequestOptions.none())

    /** @see transferReturn */
    fun transferReturn(
        inboundAchTransferId: String,
        params: InboundAchTransferTransferReturnParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InboundAchTransfer> =
        transferReturn(
            params.toBuilder().inboundAchTransferId(inboundAchTransferId).build(),
            requestOptions,
        )

    /** @see transferReturn */
    fun transferReturn(
        params: InboundAchTransferTransferReturnParams
    ): CompletableFuture<InboundAchTransfer> = transferReturn(params, RequestOptions.none())

    /** @see transferReturn */
    fun transferReturn(
        params: InboundAchTransferTransferReturnParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InboundAchTransfer>

    /**
     * A view of [InboundAchTransferServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): InboundAchTransferServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /inbound_ach_transfers/{inbound_ach_transfer_id}`,
         * but is otherwise the same as [InboundAchTransferServiceAsync.retrieve].
         */
        fun retrieve(
            inboundAchTransferId: String
        ): CompletableFuture<HttpResponseFor<InboundAchTransfer>> =
            retrieve(inboundAchTransferId, InboundAchTransferRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            inboundAchTransferId: String,
            params: InboundAchTransferRetrieveParams = InboundAchTransferRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InboundAchTransfer>> =
            retrieve(
                params.toBuilder().inboundAchTransferId(inboundAchTransferId).build(),
                requestOptions,
            )

        /** @see retrieve */
        fun retrieve(
            inboundAchTransferId: String,
            params: InboundAchTransferRetrieveParams = InboundAchTransferRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<InboundAchTransfer>> =
            retrieve(inboundAchTransferId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: InboundAchTransferRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InboundAchTransfer>>

        /** @see retrieve */
        fun retrieve(
            params: InboundAchTransferRetrieveParams
        ): CompletableFuture<HttpResponseFor<InboundAchTransfer>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            inboundAchTransferId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InboundAchTransfer>> =
            retrieve(inboundAchTransferId, InboundAchTransferRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /inbound_ach_transfers`, but is otherwise the same
         * as [InboundAchTransferServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<InboundAchTransferListResponse>> =
            list(InboundAchTransferListParams.none())

        /** @see list */
        fun list(
            params: InboundAchTransferListParams = InboundAchTransferListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InboundAchTransferListResponse>>

        /** @see list */
        fun list(
            params: InboundAchTransferListParams = InboundAchTransferListParams.none()
        ): CompletableFuture<HttpResponseFor<InboundAchTransferListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<InboundAchTransferListResponse>> =
            list(InboundAchTransferListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /inbound_ach_transfers/{inbound_ach_transfer_id}/create_notification_of_change`, but is
         * otherwise the same as [InboundAchTransferServiceAsync.createNotificationOfChange].
         */
        fun createNotificationOfChange(
            inboundAchTransferId: String
        ): CompletableFuture<HttpResponseFor<InboundAchTransfer>> =
            createNotificationOfChange(
                inboundAchTransferId,
                InboundAchTransferCreateNotificationOfChangeParams.none(),
            )

        /** @see createNotificationOfChange */
        fun createNotificationOfChange(
            inboundAchTransferId: String,
            params: InboundAchTransferCreateNotificationOfChangeParams =
                InboundAchTransferCreateNotificationOfChangeParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InboundAchTransfer>> =
            createNotificationOfChange(
                params.toBuilder().inboundAchTransferId(inboundAchTransferId).build(),
                requestOptions,
            )

        /** @see createNotificationOfChange */
        fun createNotificationOfChange(
            inboundAchTransferId: String,
            params: InboundAchTransferCreateNotificationOfChangeParams =
                InboundAchTransferCreateNotificationOfChangeParams.none(),
        ): CompletableFuture<HttpResponseFor<InboundAchTransfer>> =
            createNotificationOfChange(inboundAchTransferId, params, RequestOptions.none())

        /** @see createNotificationOfChange */
        fun createNotificationOfChange(
            params: InboundAchTransferCreateNotificationOfChangeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InboundAchTransfer>>

        /** @see createNotificationOfChange */
        fun createNotificationOfChange(
            params: InboundAchTransferCreateNotificationOfChangeParams
        ): CompletableFuture<HttpResponseFor<InboundAchTransfer>> =
            createNotificationOfChange(params, RequestOptions.none())

        /** @see createNotificationOfChange */
        fun createNotificationOfChange(
            inboundAchTransferId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InboundAchTransfer>> =
            createNotificationOfChange(
                inboundAchTransferId,
                InboundAchTransferCreateNotificationOfChangeParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `post
         * /inbound_ach_transfers/{inbound_ach_transfer_id}/decline`, but is otherwise the same as
         * [InboundAchTransferServiceAsync.decline].
         */
        fun decline(
            inboundAchTransferId: String
        ): CompletableFuture<HttpResponseFor<InboundAchTransfer>> =
            decline(inboundAchTransferId, InboundAchTransferDeclineParams.none())

        /** @see decline */
        fun decline(
            inboundAchTransferId: String,
            params: InboundAchTransferDeclineParams = InboundAchTransferDeclineParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InboundAchTransfer>> =
            decline(
                params.toBuilder().inboundAchTransferId(inboundAchTransferId).build(),
                requestOptions,
            )

        /** @see decline */
        fun decline(
            inboundAchTransferId: String,
            params: InboundAchTransferDeclineParams = InboundAchTransferDeclineParams.none(),
        ): CompletableFuture<HttpResponseFor<InboundAchTransfer>> =
            decline(inboundAchTransferId, params, RequestOptions.none())

        /** @see decline */
        fun decline(
            params: InboundAchTransferDeclineParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InboundAchTransfer>>

        /** @see decline */
        fun decline(
            params: InboundAchTransferDeclineParams
        ): CompletableFuture<HttpResponseFor<InboundAchTransfer>> =
            decline(params, RequestOptions.none())

        /** @see decline */
        fun decline(
            inboundAchTransferId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InboundAchTransfer>> =
            decline(inboundAchTransferId, InboundAchTransferDeclineParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /inbound_ach_transfers/{inbound_ach_transfer_id}/transfer_return`, but is otherwise the
         * same as [InboundAchTransferServiceAsync.transferReturn].
         */
        fun transferReturn(
            inboundAchTransferId: String,
            params: InboundAchTransferTransferReturnParams,
        ): CompletableFuture<HttpResponseFor<InboundAchTransfer>> =
            transferReturn(inboundAchTransferId, params, RequestOptions.none())

        /** @see transferReturn */
        fun transferReturn(
            inboundAchTransferId: String,
            params: InboundAchTransferTransferReturnParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InboundAchTransfer>> =
            transferReturn(
                params.toBuilder().inboundAchTransferId(inboundAchTransferId).build(),
                requestOptions,
            )

        /** @see transferReturn */
        fun transferReturn(
            params: InboundAchTransferTransferReturnParams
        ): CompletableFuture<HttpResponseFor<InboundAchTransfer>> =
            transferReturn(params, RequestOptions.none())

        /** @see transferReturn */
        fun transferReturn(
            params: InboundAchTransferTransferReturnParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InboundAchTransfer>>
    }
}
