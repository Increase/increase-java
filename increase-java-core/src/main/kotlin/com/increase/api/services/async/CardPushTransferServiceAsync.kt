// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.cardpushtransfers.CardPushTransfer
import com.increase.api.models.cardpushtransfers.CardPushTransferApproveParams
import com.increase.api.models.cardpushtransfers.CardPushTransferCancelParams
import com.increase.api.models.cardpushtransfers.CardPushTransferCreateParams
import com.increase.api.models.cardpushtransfers.CardPushTransferListPageAsync
import com.increase.api.models.cardpushtransfers.CardPushTransferListParams
import com.increase.api.models.cardpushtransfers.CardPushTransferRetrieveParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface CardPushTransferServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CardPushTransferServiceAsync

    /** Create a Card Push Transfer */
    fun create(params: CardPushTransferCreateParams): CompletableFuture<CardPushTransfer> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: CardPushTransferCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CardPushTransfer>

    /** Retrieve a Card Push Transfer */
    fun retrieve(cardPushTransferId: String): CompletableFuture<CardPushTransfer> =
        retrieve(cardPushTransferId, CardPushTransferRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        cardPushTransferId: String,
        params: CardPushTransferRetrieveParams = CardPushTransferRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CardPushTransfer> =
        retrieve(params.toBuilder().cardPushTransferId(cardPushTransferId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        cardPushTransferId: String,
        params: CardPushTransferRetrieveParams = CardPushTransferRetrieveParams.none(),
    ): CompletableFuture<CardPushTransfer> =
        retrieve(cardPushTransferId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: CardPushTransferRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CardPushTransfer>

    /** @see retrieve */
    fun retrieve(params: CardPushTransferRetrieveParams): CompletableFuture<CardPushTransfer> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        cardPushTransferId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CardPushTransfer> =
        retrieve(cardPushTransferId, CardPushTransferRetrieveParams.none(), requestOptions)

    /** List Card Push Transfers */
    fun list(): CompletableFuture<CardPushTransferListPageAsync> =
        list(CardPushTransferListParams.none())

    /** @see list */
    fun list(
        params: CardPushTransferListParams = CardPushTransferListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CardPushTransferListPageAsync>

    /** @see list */
    fun list(
        params: CardPushTransferListParams = CardPushTransferListParams.none()
    ): CompletableFuture<CardPushTransferListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<CardPushTransferListPageAsync> =
        list(CardPushTransferListParams.none(), requestOptions)

    /** Approves a Card Push Transfer in a pending_approval state. */
    fun approve(cardPushTransferId: String): CompletableFuture<CardPushTransfer> =
        approve(cardPushTransferId, CardPushTransferApproveParams.none())

    /** @see approve */
    fun approve(
        cardPushTransferId: String,
        params: CardPushTransferApproveParams = CardPushTransferApproveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CardPushTransfer> =
        approve(params.toBuilder().cardPushTransferId(cardPushTransferId).build(), requestOptions)

    /** @see approve */
    fun approve(
        cardPushTransferId: String,
        params: CardPushTransferApproveParams = CardPushTransferApproveParams.none(),
    ): CompletableFuture<CardPushTransfer> =
        approve(cardPushTransferId, params, RequestOptions.none())

    /** @see approve */
    fun approve(
        params: CardPushTransferApproveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CardPushTransfer>

    /** @see approve */
    fun approve(params: CardPushTransferApproveParams): CompletableFuture<CardPushTransfer> =
        approve(params, RequestOptions.none())

    /** @see approve */
    fun approve(
        cardPushTransferId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CardPushTransfer> =
        approve(cardPushTransferId, CardPushTransferApproveParams.none(), requestOptions)

    /** Cancels a Card Push Transfer in a pending_approval state. */
    fun cancel(cardPushTransferId: String): CompletableFuture<CardPushTransfer> =
        cancel(cardPushTransferId, CardPushTransferCancelParams.none())

    /** @see cancel */
    fun cancel(
        cardPushTransferId: String,
        params: CardPushTransferCancelParams = CardPushTransferCancelParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CardPushTransfer> =
        cancel(params.toBuilder().cardPushTransferId(cardPushTransferId).build(), requestOptions)

    /** @see cancel */
    fun cancel(
        cardPushTransferId: String,
        params: CardPushTransferCancelParams = CardPushTransferCancelParams.none(),
    ): CompletableFuture<CardPushTransfer> =
        cancel(cardPushTransferId, params, RequestOptions.none())

    /** @see cancel */
    fun cancel(
        params: CardPushTransferCancelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CardPushTransfer>

    /** @see cancel */
    fun cancel(params: CardPushTransferCancelParams): CompletableFuture<CardPushTransfer> =
        cancel(params, RequestOptions.none())

    /** @see cancel */
    fun cancel(
        cardPushTransferId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CardPushTransfer> =
        cancel(cardPushTransferId, CardPushTransferCancelParams.none(), requestOptions)

    /**
     * A view of [CardPushTransferServiceAsync] that provides access to raw HTTP responses for each
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
        ): CardPushTransferServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /card_push_transfers`, but is otherwise the same as
         * [CardPushTransferServiceAsync.create].
         */
        fun create(
            params: CardPushTransferCreateParams
        ): CompletableFuture<HttpResponseFor<CardPushTransfer>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: CardPushTransferCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CardPushTransfer>>

        /**
         * Returns a raw HTTP response for `get /card_push_transfers/{card_push_transfer_id}`, but
         * is otherwise the same as [CardPushTransferServiceAsync.retrieve].
         */
        fun retrieve(
            cardPushTransferId: String
        ): CompletableFuture<HttpResponseFor<CardPushTransfer>> =
            retrieve(cardPushTransferId, CardPushTransferRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            cardPushTransferId: String,
            params: CardPushTransferRetrieveParams = CardPushTransferRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CardPushTransfer>> =
            retrieve(
                params.toBuilder().cardPushTransferId(cardPushTransferId).build(),
                requestOptions,
            )

        /** @see retrieve */
        fun retrieve(
            cardPushTransferId: String,
            params: CardPushTransferRetrieveParams = CardPushTransferRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<CardPushTransfer>> =
            retrieve(cardPushTransferId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: CardPushTransferRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CardPushTransfer>>

        /** @see retrieve */
        fun retrieve(
            params: CardPushTransferRetrieveParams
        ): CompletableFuture<HttpResponseFor<CardPushTransfer>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            cardPushTransferId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CardPushTransfer>> =
            retrieve(cardPushTransferId, CardPushTransferRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /card_push_transfers`, but is otherwise the same as
         * [CardPushTransferServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<CardPushTransferListPageAsync>> =
            list(CardPushTransferListParams.none())

        /** @see list */
        fun list(
            params: CardPushTransferListParams = CardPushTransferListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CardPushTransferListPageAsync>>

        /** @see list */
        fun list(
            params: CardPushTransferListParams = CardPushTransferListParams.none()
        ): CompletableFuture<HttpResponseFor<CardPushTransferListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<CardPushTransferListPageAsync>> =
            list(CardPushTransferListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /card_push_transfers/{card_push_transfer_id}/approve`, but is otherwise the same as
         * [CardPushTransferServiceAsync.approve].
         */
        fun approve(
            cardPushTransferId: String
        ): CompletableFuture<HttpResponseFor<CardPushTransfer>> =
            approve(cardPushTransferId, CardPushTransferApproveParams.none())

        /** @see approve */
        fun approve(
            cardPushTransferId: String,
            params: CardPushTransferApproveParams = CardPushTransferApproveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CardPushTransfer>> =
            approve(
                params.toBuilder().cardPushTransferId(cardPushTransferId).build(),
                requestOptions,
            )

        /** @see approve */
        fun approve(
            cardPushTransferId: String,
            params: CardPushTransferApproveParams = CardPushTransferApproveParams.none(),
        ): CompletableFuture<HttpResponseFor<CardPushTransfer>> =
            approve(cardPushTransferId, params, RequestOptions.none())

        /** @see approve */
        fun approve(
            params: CardPushTransferApproveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CardPushTransfer>>

        /** @see approve */
        fun approve(
            params: CardPushTransferApproveParams
        ): CompletableFuture<HttpResponseFor<CardPushTransfer>> =
            approve(params, RequestOptions.none())

        /** @see approve */
        fun approve(
            cardPushTransferId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CardPushTransfer>> =
            approve(cardPushTransferId, CardPushTransferApproveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /card_push_transfers/{card_push_transfer_id}/cancel`, but is otherwise the same as
         * [CardPushTransferServiceAsync.cancel].
         */
        fun cancel(
            cardPushTransferId: String
        ): CompletableFuture<HttpResponseFor<CardPushTransfer>> =
            cancel(cardPushTransferId, CardPushTransferCancelParams.none())

        /** @see cancel */
        fun cancel(
            cardPushTransferId: String,
            params: CardPushTransferCancelParams = CardPushTransferCancelParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CardPushTransfer>> =
            cancel(
                params.toBuilder().cardPushTransferId(cardPushTransferId).build(),
                requestOptions,
            )

        /** @see cancel */
        fun cancel(
            cardPushTransferId: String,
            params: CardPushTransferCancelParams = CardPushTransferCancelParams.none(),
        ): CompletableFuture<HttpResponseFor<CardPushTransfer>> =
            cancel(cardPushTransferId, params, RequestOptions.none())

        /** @see cancel */
        fun cancel(
            params: CardPushTransferCancelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CardPushTransfer>>

        /** @see cancel */
        fun cancel(
            params: CardPushTransferCancelParams
        ): CompletableFuture<HttpResponseFor<CardPushTransfer>> =
            cancel(params, RequestOptions.none())

        /** @see cancel */
        fun cancel(
            cardPushTransferId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CardPushTransfer>> =
            cancel(cardPushTransferId, CardPushTransferCancelParams.none(), requestOptions)
    }
}
