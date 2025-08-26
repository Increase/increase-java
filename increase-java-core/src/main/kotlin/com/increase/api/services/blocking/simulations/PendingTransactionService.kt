// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking.simulations

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.pendingtransactions.PendingTransaction
import com.increase.api.models.simulations.pendingtransactions.PendingTransactionReleaseInboundFundsHoldParams
import java.util.function.Consumer

interface PendingTransactionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PendingTransactionService

    /**
     * This endpoint simulates immediately releasing an Inbound Funds Hold, which might be created
     * as a result of, for example, an ACH debit.
     */
    fun releaseInboundFundsHold(pendingTransactionId: String): PendingTransaction =
        releaseInboundFundsHold(
            pendingTransactionId,
            PendingTransactionReleaseInboundFundsHoldParams.none(),
        )

    /** @see releaseInboundFundsHold */
    fun releaseInboundFundsHold(
        pendingTransactionId: String,
        params: PendingTransactionReleaseInboundFundsHoldParams =
            PendingTransactionReleaseInboundFundsHoldParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PendingTransaction =
        releaseInboundFundsHold(
            params.toBuilder().pendingTransactionId(pendingTransactionId).build(),
            requestOptions,
        )

    /** @see releaseInboundFundsHold */
    fun releaseInboundFundsHold(
        pendingTransactionId: String,
        params: PendingTransactionReleaseInboundFundsHoldParams =
            PendingTransactionReleaseInboundFundsHoldParams.none(),
    ): PendingTransaction =
        releaseInboundFundsHold(pendingTransactionId, params, RequestOptions.none())

    /** @see releaseInboundFundsHold */
    fun releaseInboundFundsHold(
        params: PendingTransactionReleaseInboundFundsHoldParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PendingTransaction

    /** @see releaseInboundFundsHold */
    fun releaseInboundFundsHold(
        params: PendingTransactionReleaseInboundFundsHoldParams
    ): PendingTransaction = releaseInboundFundsHold(params, RequestOptions.none())

    /** @see releaseInboundFundsHold */
    fun releaseInboundFundsHold(
        pendingTransactionId: String,
        requestOptions: RequestOptions,
    ): PendingTransaction =
        releaseInboundFundsHold(
            pendingTransactionId,
            PendingTransactionReleaseInboundFundsHoldParams.none(),
            requestOptions,
        )

    /**
     * A view of [PendingTransactionService] that provides access to raw HTTP responses for each
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
        ): PendingTransactionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /simulations/pending_transactions/{pending_transaction_id}/release_inbound_funds_hold`,
         * but is otherwise the same as [PendingTransactionService.releaseInboundFundsHold].
         */
        @MustBeClosed
        fun releaseInboundFundsHold(
            pendingTransactionId: String
        ): HttpResponseFor<PendingTransaction> =
            releaseInboundFundsHold(
                pendingTransactionId,
                PendingTransactionReleaseInboundFundsHoldParams.none(),
            )

        /** @see releaseInboundFundsHold */
        @MustBeClosed
        fun releaseInboundFundsHold(
            pendingTransactionId: String,
            params: PendingTransactionReleaseInboundFundsHoldParams =
                PendingTransactionReleaseInboundFundsHoldParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PendingTransaction> =
            releaseInboundFundsHold(
                params.toBuilder().pendingTransactionId(pendingTransactionId).build(),
                requestOptions,
            )

        /** @see releaseInboundFundsHold */
        @MustBeClosed
        fun releaseInboundFundsHold(
            pendingTransactionId: String,
            params: PendingTransactionReleaseInboundFundsHoldParams =
                PendingTransactionReleaseInboundFundsHoldParams.none(),
        ): HttpResponseFor<PendingTransaction> =
            releaseInboundFundsHold(pendingTransactionId, params, RequestOptions.none())

        /** @see releaseInboundFundsHold */
        @MustBeClosed
        fun releaseInboundFundsHold(
            params: PendingTransactionReleaseInboundFundsHoldParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PendingTransaction>

        /** @see releaseInboundFundsHold */
        @MustBeClosed
        fun releaseInboundFundsHold(
            params: PendingTransactionReleaseInboundFundsHoldParams
        ): HttpResponseFor<PendingTransaction> =
            releaseInboundFundsHold(params, RequestOptions.none())

        /** @see releaseInboundFundsHold */
        @MustBeClosed
        fun releaseInboundFundsHold(
            pendingTransactionId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PendingTransaction> =
            releaseInboundFundsHold(
                pendingTransactionId,
                PendingTransactionReleaseInboundFundsHoldParams.none(),
                requestOptions,
            )
    }
}
