// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.transactions.Transaction
import com.increase.api.models.transactions.TransactionListPageAsync
import com.increase.api.models.transactions.TransactionListParams
import com.increase.api.models.transactions.TransactionRetrieveParams
import java.util.concurrent.CompletableFuture

interface TransactionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Retrieve a Transaction */
    fun retrieve(transactionId: String): CompletableFuture<Transaction> =
        retrieve(transactionId, TransactionRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        transactionId: String,
        params: TransactionRetrieveParams = TransactionRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Transaction> =
        retrieve(params.toBuilder().transactionId(transactionId).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        transactionId: String,
        params: TransactionRetrieveParams = TransactionRetrieveParams.none(),
    ): CompletableFuture<Transaction> = retrieve(transactionId, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: TransactionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Transaction>

    /** @see [retrieve] */
    fun retrieve(params: TransactionRetrieveParams): CompletableFuture<Transaction> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        transactionId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<Transaction> =
        retrieve(transactionId, TransactionRetrieveParams.none(), requestOptions)

    /** List Transactions */
    fun list(): CompletableFuture<TransactionListPageAsync> = list(TransactionListParams.none())

    /** @see [list] */
    fun list(
        params: TransactionListParams = TransactionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TransactionListPageAsync>

    /** @see [list] */
    fun list(
        params: TransactionListParams = TransactionListParams.none()
    ): CompletableFuture<TransactionListPageAsync> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<TransactionListPageAsync> =
        list(TransactionListParams.none(), requestOptions)

    /**
     * A view of [TransactionServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /transactions/{transaction_id}`, but is otherwise
         * the same as [TransactionServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(transactionId: String): CompletableFuture<HttpResponseFor<Transaction>> =
            retrieve(transactionId, TransactionRetrieveParams.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            transactionId: String,
            params: TransactionRetrieveParams = TransactionRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Transaction>> =
            retrieve(params.toBuilder().transactionId(transactionId).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            transactionId: String,
            params: TransactionRetrieveParams = TransactionRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<Transaction>> =
            retrieve(transactionId, params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: TransactionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Transaction>>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: TransactionRetrieveParams
        ): CompletableFuture<HttpResponseFor<Transaction>> = retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            transactionId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Transaction>> =
            retrieve(transactionId, TransactionRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /transactions`, but is otherwise the same as
         * [TransactionServiceAsync.list].
         */
        @MustBeClosed
        fun list(): CompletableFuture<HttpResponseFor<TransactionListPageAsync>> =
            list(TransactionListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: TransactionListParams = TransactionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TransactionListPageAsync>>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: TransactionListParams = TransactionListParams.none()
        ): CompletableFuture<HttpResponseFor<TransactionListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<TransactionListPageAsync>> =
            list(TransactionListParams.none(), requestOptions)
    }
}
