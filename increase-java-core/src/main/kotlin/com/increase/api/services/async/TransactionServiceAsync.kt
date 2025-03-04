// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.Transaction
import com.increase.api.models.TransactionListPageAsync
import com.increase.api.models.TransactionListParams
import com.increase.api.models.TransactionRetrieveParams
import java.util.concurrent.CompletableFuture

interface TransactionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Retrieve a Transaction */
    @JvmOverloads
    fun retrieve(
        params: TransactionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Transaction>

    /** List Transactions */
    @JvmOverloads
    fun list(
        params: TransactionListParams = TransactionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TransactionListPageAsync>

    /** List Transactions */
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
        @JvmOverloads
        @MustBeClosed
        fun retrieve(
            params: TransactionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Transaction>>

        /**
         * Returns a raw HTTP response for `get /transactions`, but is otherwise the same as
         * [TransactionServiceAsync.list].
         */
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: TransactionListParams = TransactionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TransactionListPageAsync>>

        /**
         * Returns a raw HTTP response for `get /transactions`, but is otherwise the same as
         * [TransactionServiceAsync.list].
         */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<TransactionListPageAsync>> =
            list(TransactionListParams.none(), requestOptions)
    }
}
