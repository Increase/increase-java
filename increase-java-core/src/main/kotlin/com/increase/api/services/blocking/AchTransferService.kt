// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.achtransfers.AchTransfer
import com.increase.api.models.achtransfers.AchTransferApproveParams
import com.increase.api.models.achtransfers.AchTransferCancelParams
import com.increase.api.models.achtransfers.AchTransferCreateParams
import com.increase.api.models.achtransfers.AchTransferListPage
import com.increase.api.models.achtransfers.AchTransferListParams
import com.increase.api.models.achtransfers.AchTransferRetrieveParams
import java.util.function.Consumer

interface AchTransferService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AchTransferService

    /** Create an ACH Transfer */
    fun create(params: AchTransferCreateParams): AchTransfer = create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: AchTransferCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AchTransfer

    /** Retrieve an ACH Transfer */
    fun retrieve(achTransferId: String): AchTransfer =
        retrieve(achTransferId, AchTransferRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        achTransferId: String,
        params: AchTransferRetrieveParams = AchTransferRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AchTransfer =
        retrieve(params.toBuilder().achTransferId(achTransferId).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        achTransferId: String,
        params: AchTransferRetrieveParams = AchTransferRetrieveParams.none(),
    ): AchTransfer = retrieve(achTransferId, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: AchTransferRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AchTransfer

    /** @see [retrieve] */
    fun retrieve(params: AchTransferRetrieveParams): AchTransfer =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(achTransferId: String, requestOptions: RequestOptions): AchTransfer =
        retrieve(achTransferId, AchTransferRetrieveParams.none(), requestOptions)

    /** List ACH Transfers */
    fun list(): AchTransferListPage = list(AchTransferListParams.none())

    /** @see [list] */
    fun list(
        params: AchTransferListParams = AchTransferListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AchTransferListPage

    /** @see [list] */
    fun list(params: AchTransferListParams = AchTransferListParams.none()): AchTransferListPage =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): AchTransferListPage =
        list(AchTransferListParams.none(), requestOptions)

    /** Approves an ACH Transfer in a pending_approval state. */
    fun approve(achTransferId: String): AchTransfer =
        approve(achTransferId, AchTransferApproveParams.none())

    /** @see [approve] */
    fun approve(
        achTransferId: String,
        params: AchTransferApproveParams = AchTransferApproveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AchTransfer =
        approve(params.toBuilder().achTransferId(achTransferId).build(), requestOptions)

    /** @see [approve] */
    fun approve(
        achTransferId: String,
        params: AchTransferApproveParams = AchTransferApproveParams.none(),
    ): AchTransfer = approve(achTransferId, params, RequestOptions.none())

    /** @see [approve] */
    fun approve(
        params: AchTransferApproveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AchTransfer

    /** @see [approve] */
    fun approve(params: AchTransferApproveParams): AchTransfer =
        approve(params, RequestOptions.none())

    /** @see [approve] */
    fun approve(achTransferId: String, requestOptions: RequestOptions): AchTransfer =
        approve(achTransferId, AchTransferApproveParams.none(), requestOptions)

    /** Cancels an ACH Transfer in a pending_approval state. */
    fun cancel(achTransferId: String): AchTransfer =
        cancel(achTransferId, AchTransferCancelParams.none())

    /** @see [cancel] */
    fun cancel(
        achTransferId: String,
        params: AchTransferCancelParams = AchTransferCancelParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AchTransfer = cancel(params.toBuilder().achTransferId(achTransferId).build(), requestOptions)

    /** @see [cancel] */
    fun cancel(
        achTransferId: String,
        params: AchTransferCancelParams = AchTransferCancelParams.none(),
    ): AchTransfer = cancel(achTransferId, params, RequestOptions.none())

    /** @see [cancel] */
    fun cancel(
        params: AchTransferCancelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AchTransfer

    /** @see [cancel] */
    fun cancel(params: AchTransferCancelParams): AchTransfer = cancel(params, RequestOptions.none())

    /** @see [cancel] */
    fun cancel(achTransferId: String, requestOptions: RequestOptions): AchTransfer =
        cancel(achTransferId, AchTransferCancelParams.none(), requestOptions)

    /**
     * A view of [AchTransferService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AchTransferService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /ach_transfers`, but is otherwise the same as
         * [AchTransferService.create].
         */
        @MustBeClosed
        fun create(params: AchTransferCreateParams): HttpResponseFor<AchTransfer> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: AchTransferCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AchTransfer>

        /**
         * Returns a raw HTTP response for `get /ach_transfers/{ach_transfer_id}`, but is otherwise
         * the same as [AchTransferService.retrieve].
         */
        @MustBeClosed
        fun retrieve(achTransferId: String): HttpResponseFor<AchTransfer> =
            retrieve(achTransferId, AchTransferRetrieveParams.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            achTransferId: String,
            params: AchTransferRetrieveParams = AchTransferRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AchTransfer> =
            retrieve(params.toBuilder().achTransferId(achTransferId).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            achTransferId: String,
            params: AchTransferRetrieveParams = AchTransferRetrieveParams.none(),
        ): HttpResponseFor<AchTransfer> = retrieve(achTransferId, params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: AchTransferRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AchTransfer>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(params: AchTransferRetrieveParams): HttpResponseFor<AchTransfer> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            achTransferId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AchTransfer> =
            retrieve(achTransferId, AchTransferRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /ach_transfers`, but is otherwise the same as
         * [AchTransferService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<AchTransferListPage> = list(AchTransferListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: AchTransferListParams = AchTransferListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AchTransferListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: AchTransferListParams = AchTransferListParams.none()
        ): HttpResponseFor<AchTransferListPage> = list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<AchTransferListPage> =
            list(AchTransferListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /ach_transfers/{ach_transfer_id}/approve`, but is
         * otherwise the same as [AchTransferService.approve].
         */
        @MustBeClosed
        fun approve(achTransferId: String): HttpResponseFor<AchTransfer> =
            approve(achTransferId, AchTransferApproveParams.none())

        /** @see [approve] */
        @MustBeClosed
        fun approve(
            achTransferId: String,
            params: AchTransferApproveParams = AchTransferApproveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AchTransfer> =
            approve(params.toBuilder().achTransferId(achTransferId).build(), requestOptions)

        /** @see [approve] */
        @MustBeClosed
        fun approve(
            achTransferId: String,
            params: AchTransferApproveParams = AchTransferApproveParams.none(),
        ): HttpResponseFor<AchTransfer> = approve(achTransferId, params, RequestOptions.none())

        /** @see [approve] */
        @MustBeClosed
        fun approve(
            params: AchTransferApproveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AchTransfer>

        /** @see [approve] */
        @MustBeClosed
        fun approve(params: AchTransferApproveParams): HttpResponseFor<AchTransfer> =
            approve(params, RequestOptions.none())

        /** @see [approve] */
        @MustBeClosed
        fun approve(
            achTransferId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AchTransfer> =
            approve(achTransferId, AchTransferApproveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /ach_transfers/{ach_transfer_id}/cancel`, but is
         * otherwise the same as [AchTransferService.cancel].
         */
        @MustBeClosed
        fun cancel(achTransferId: String): HttpResponseFor<AchTransfer> =
            cancel(achTransferId, AchTransferCancelParams.none())

        /** @see [cancel] */
        @MustBeClosed
        fun cancel(
            achTransferId: String,
            params: AchTransferCancelParams = AchTransferCancelParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AchTransfer> =
            cancel(params.toBuilder().achTransferId(achTransferId).build(), requestOptions)

        /** @see [cancel] */
        @MustBeClosed
        fun cancel(
            achTransferId: String,
            params: AchTransferCancelParams = AchTransferCancelParams.none(),
        ): HttpResponseFor<AchTransfer> = cancel(achTransferId, params, RequestOptions.none())

        /** @see [cancel] */
        @MustBeClosed
        fun cancel(
            params: AchTransferCancelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AchTransfer>

        /** @see [cancel] */
        @MustBeClosed
        fun cancel(params: AchTransferCancelParams): HttpResponseFor<AchTransfer> =
            cancel(params, RequestOptions.none())

        /** @see [cancel] */
        @MustBeClosed
        fun cancel(
            achTransferId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AchTransfer> =
            cancel(achTransferId, AchTransferCancelParams.none(), requestOptions)
    }
}
