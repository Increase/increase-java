// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.cardpushtransfers.CardPushTransfer
import com.increase.api.models.cardpushtransfers.CardPushTransferApproveParams
import com.increase.api.models.cardpushtransfers.CardPushTransferCancelParams
import com.increase.api.models.cardpushtransfers.CardPushTransferCreateParams
import com.increase.api.models.cardpushtransfers.CardPushTransferListPage
import com.increase.api.models.cardpushtransfers.CardPushTransferListParams
import com.increase.api.models.cardpushtransfers.CardPushTransferRetrieveParams
import java.util.function.Consumer

interface CardPushTransferService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CardPushTransferService

    /** Create a Card Push Transfer */
    fun create(params: CardPushTransferCreateParams): CardPushTransfer =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: CardPushTransferCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardPushTransfer

    /** Retrieve a Card Push Transfer */
    fun retrieve(cardPushTransferId: String): CardPushTransfer =
        retrieve(cardPushTransferId, CardPushTransferRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        cardPushTransferId: String,
        params: CardPushTransferRetrieveParams = CardPushTransferRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardPushTransfer =
        retrieve(params.toBuilder().cardPushTransferId(cardPushTransferId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        cardPushTransferId: String,
        params: CardPushTransferRetrieveParams = CardPushTransferRetrieveParams.none(),
    ): CardPushTransfer = retrieve(cardPushTransferId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: CardPushTransferRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardPushTransfer

    /** @see retrieve */
    fun retrieve(params: CardPushTransferRetrieveParams): CardPushTransfer =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(cardPushTransferId: String, requestOptions: RequestOptions): CardPushTransfer =
        retrieve(cardPushTransferId, CardPushTransferRetrieveParams.none(), requestOptions)

    /** List Card Push Transfers */
    fun list(): CardPushTransferListPage = list(CardPushTransferListParams.none())

    /** @see list */
    fun list(
        params: CardPushTransferListParams = CardPushTransferListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardPushTransferListPage

    /** @see list */
    fun list(
        params: CardPushTransferListParams = CardPushTransferListParams.none()
    ): CardPushTransferListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CardPushTransferListPage =
        list(CardPushTransferListParams.none(), requestOptions)

    /** Approves a Card Push Transfer in a pending_approval state. */
    fun approve(cardPushTransferId: String): CardPushTransfer =
        approve(cardPushTransferId, CardPushTransferApproveParams.none())

    /** @see approve */
    fun approve(
        cardPushTransferId: String,
        params: CardPushTransferApproveParams = CardPushTransferApproveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardPushTransfer =
        approve(params.toBuilder().cardPushTransferId(cardPushTransferId).build(), requestOptions)

    /** @see approve */
    fun approve(
        cardPushTransferId: String,
        params: CardPushTransferApproveParams = CardPushTransferApproveParams.none(),
    ): CardPushTransfer = approve(cardPushTransferId, params, RequestOptions.none())

    /** @see approve */
    fun approve(
        params: CardPushTransferApproveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardPushTransfer

    /** @see approve */
    fun approve(params: CardPushTransferApproveParams): CardPushTransfer =
        approve(params, RequestOptions.none())

    /** @see approve */
    fun approve(cardPushTransferId: String, requestOptions: RequestOptions): CardPushTransfer =
        approve(cardPushTransferId, CardPushTransferApproveParams.none(), requestOptions)

    /** Cancels a Card Push Transfer in a pending_approval state. */
    fun cancel(cardPushTransferId: String): CardPushTransfer =
        cancel(cardPushTransferId, CardPushTransferCancelParams.none())

    /** @see cancel */
    fun cancel(
        cardPushTransferId: String,
        params: CardPushTransferCancelParams = CardPushTransferCancelParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardPushTransfer =
        cancel(params.toBuilder().cardPushTransferId(cardPushTransferId).build(), requestOptions)

    /** @see cancel */
    fun cancel(
        cardPushTransferId: String,
        params: CardPushTransferCancelParams = CardPushTransferCancelParams.none(),
    ): CardPushTransfer = cancel(cardPushTransferId, params, RequestOptions.none())

    /** @see cancel */
    fun cancel(
        params: CardPushTransferCancelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardPushTransfer

    /** @see cancel */
    fun cancel(params: CardPushTransferCancelParams): CardPushTransfer =
        cancel(params, RequestOptions.none())

    /** @see cancel */
    fun cancel(cardPushTransferId: String, requestOptions: RequestOptions): CardPushTransfer =
        cancel(cardPushTransferId, CardPushTransferCancelParams.none(), requestOptions)

    /**
     * A view of [CardPushTransferService] that provides access to raw HTTP responses for each
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
        ): CardPushTransferService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /card_push_transfers`, but is otherwise the same as
         * [CardPushTransferService.create].
         */
        @MustBeClosed
        fun create(params: CardPushTransferCreateParams): HttpResponseFor<CardPushTransfer> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: CardPushTransferCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardPushTransfer>

        /**
         * Returns a raw HTTP response for `get /card_push_transfers/{card_push_transfer_id}`, but
         * is otherwise the same as [CardPushTransferService.retrieve].
         */
        @MustBeClosed
        fun retrieve(cardPushTransferId: String): HttpResponseFor<CardPushTransfer> =
            retrieve(cardPushTransferId, CardPushTransferRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            cardPushTransferId: String,
            params: CardPushTransferRetrieveParams = CardPushTransferRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardPushTransfer> =
            retrieve(
                params.toBuilder().cardPushTransferId(cardPushTransferId).build(),
                requestOptions,
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            cardPushTransferId: String,
            params: CardPushTransferRetrieveParams = CardPushTransferRetrieveParams.none(),
        ): HttpResponseFor<CardPushTransfer> =
            retrieve(cardPushTransferId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: CardPushTransferRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardPushTransfer>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: CardPushTransferRetrieveParams): HttpResponseFor<CardPushTransfer> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            cardPushTransferId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CardPushTransfer> =
            retrieve(cardPushTransferId, CardPushTransferRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /card_push_transfers`, but is otherwise the same as
         * [CardPushTransferService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<CardPushTransferListPage> =
            list(CardPushTransferListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: CardPushTransferListParams = CardPushTransferListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardPushTransferListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: CardPushTransferListParams = CardPushTransferListParams.none()
        ): HttpResponseFor<CardPushTransferListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<CardPushTransferListPage> =
            list(CardPushTransferListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /card_push_transfers/{card_push_transfer_id}/approve`, but is otherwise the same as
         * [CardPushTransferService.approve].
         */
        @MustBeClosed
        fun approve(cardPushTransferId: String): HttpResponseFor<CardPushTransfer> =
            approve(cardPushTransferId, CardPushTransferApproveParams.none())

        /** @see approve */
        @MustBeClosed
        fun approve(
            cardPushTransferId: String,
            params: CardPushTransferApproveParams = CardPushTransferApproveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardPushTransfer> =
            approve(
                params.toBuilder().cardPushTransferId(cardPushTransferId).build(),
                requestOptions,
            )

        /** @see approve */
        @MustBeClosed
        fun approve(
            cardPushTransferId: String,
            params: CardPushTransferApproveParams = CardPushTransferApproveParams.none(),
        ): HttpResponseFor<CardPushTransfer> =
            approve(cardPushTransferId, params, RequestOptions.none())

        /** @see approve */
        @MustBeClosed
        fun approve(
            params: CardPushTransferApproveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardPushTransfer>

        /** @see approve */
        @MustBeClosed
        fun approve(params: CardPushTransferApproveParams): HttpResponseFor<CardPushTransfer> =
            approve(params, RequestOptions.none())

        /** @see approve */
        @MustBeClosed
        fun approve(
            cardPushTransferId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CardPushTransfer> =
            approve(cardPushTransferId, CardPushTransferApproveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /card_push_transfers/{card_push_transfer_id}/cancel`, but is otherwise the same as
         * [CardPushTransferService.cancel].
         */
        @MustBeClosed
        fun cancel(cardPushTransferId: String): HttpResponseFor<CardPushTransfer> =
            cancel(cardPushTransferId, CardPushTransferCancelParams.none())

        /** @see cancel */
        @MustBeClosed
        fun cancel(
            cardPushTransferId: String,
            params: CardPushTransferCancelParams = CardPushTransferCancelParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardPushTransfer> =
            cancel(
                params.toBuilder().cardPushTransferId(cardPushTransferId).build(),
                requestOptions,
            )

        /** @see cancel */
        @MustBeClosed
        fun cancel(
            cardPushTransferId: String,
            params: CardPushTransferCancelParams = CardPushTransferCancelParams.none(),
        ): HttpResponseFor<CardPushTransfer> =
            cancel(cardPushTransferId, params, RequestOptions.none())

        /** @see cancel */
        @MustBeClosed
        fun cancel(
            params: CardPushTransferCancelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardPushTransfer>

        /** @see cancel */
        @MustBeClosed
        fun cancel(params: CardPushTransferCancelParams): HttpResponseFor<CardPushTransfer> =
            cancel(params, RequestOptions.none())

        /** @see cancel */
        @MustBeClosed
        fun cancel(
            cardPushTransferId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CardPushTransfer> =
            cancel(cardPushTransferId, CardPushTransferCancelParams.none(), requestOptions)
    }
}
