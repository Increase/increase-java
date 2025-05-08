// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.pendingtransactions.PendingTransaction
import com.increase.api.models.pendingtransactions.PendingTransactionListPageAsync
import com.increase.api.models.pendingtransactions.PendingTransactionListParams
import com.increase.api.models.pendingtransactions.PendingTransactionRetrieveParams
import java.util.concurrent.CompletableFuture

interface PendingTransactionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Retrieve a Pending Transaction */
    fun retrieve(pendingTransactionId: String): CompletableFuture<PendingTransaction> =
        retrieve(pendingTransactionId, PendingTransactionRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        pendingTransactionId: String,
        params: PendingTransactionRetrieveParams = PendingTransactionRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PendingTransaction> =
        retrieve(
            params.toBuilder().pendingTransactionId(pendingTransactionId).build(),
            requestOptions,
        )

    /** @see [retrieve] */
    fun retrieve(
        pendingTransactionId: String,
        params: PendingTransactionRetrieveParams = PendingTransactionRetrieveParams.none(),
    ): CompletableFuture<PendingTransaction> =
        retrieve(pendingTransactionId, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: PendingTransactionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PendingTransaction>

    /** @see [retrieve] */
    fun retrieve(params: PendingTransactionRetrieveParams): CompletableFuture<PendingTransaction> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        pendingTransactionId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<PendingTransaction> =
        retrieve(pendingTransactionId, PendingTransactionRetrieveParams.none(), requestOptions)

    /** List Pending Transactions */
    fun list(): CompletableFuture<PendingTransactionListPageAsync> =
        list(PendingTransactionListParams.none())

    /** @see [list] */
    fun list(
        params: PendingTransactionListParams = PendingTransactionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PendingTransactionListPageAsync>

    /** @see [list] */
    fun list(
        params: PendingTransactionListParams = PendingTransactionListParams.none()
    ): CompletableFuture<PendingTransactionListPageAsync> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<PendingTransactionListPageAsync> =
        list(PendingTransactionListParams.none(), requestOptions)

    /**
     * A view of [PendingTransactionServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /pending_transactions/{pending_transaction_id}`, but
         * is otherwise the same as [PendingTransactionServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            pendingTransactionId: String
        ): CompletableFuture<HttpResponseFor<PendingTransaction>> =
            retrieve(pendingTransactionId, PendingTransactionRetrieveParams.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            pendingTransactionId: String,
            params: PendingTransactionRetrieveParams = PendingTransactionRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PendingTransaction>> =
            retrieve(
                params.toBuilder().pendingTransactionId(pendingTransactionId).build(),
                requestOptions,
            )

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            pendingTransactionId: String,
            params: PendingTransactionRetrieveParams = PendingTransactionRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<PendingTransaction>> =
            retrieve(pendingTransactionId, params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: PendingTransactionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PendingTransaction>>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: PendingTransactionRetrieveParams
        ): CompletableFuture<HttpResponseFor<PendingTransaction>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            pendingTransactionId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PendingTransaction>> =
            retrieve(pendingTransactionId, PendingTransactionRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /pending_transactions`, but is otherwise the same as
         * [PendingTransactionServiceAsync.list].
         */
        @MustBeClosed
        fun list(): CompletableFuture<HttpResponseFor<PendingTransactionListPageAsync>> =
            list(PendingTransactionListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: PendingTransactionListParams = PendingTransactionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PendingTransactionListPageAsync>>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: PendingTransactionListParams = PendingTransactionListParams.none()
        ): CompletableFuture<HttpResponseFor<PendingTransactionListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<PendingTransactionListPageAsync>> =
            list(PendingTransactionListParams.none(), requestOptions)
    }
}
