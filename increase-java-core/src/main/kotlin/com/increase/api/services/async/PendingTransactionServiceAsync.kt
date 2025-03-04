// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.PendingTransaction
import com.increase.api.models.PendingTransactionListPageAsync
import com.increase.api.models.PendingTransactionListParams
import com.increase.api.models.PendingTransactionRetrieveParams
import java.util.concurrent.CompletableFuture

interface PendingTransactionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Retrieve a Pending Transaction */
    @JvmOverloads
    fun retrieve(
        params: PendingTransactionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PendingTransaction>

    /** List Pending Transactions */
    @JvmOverloads
    fun list(
        params: PendingTransactionListParams = PendingTransactionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PendingTransactionListPageAsync>

    /** List Pending Transactions */
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
        @JvmOverloads
        @MustBeClosed
        fun retrieve(
            params: PendingTransactionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PendingTransaction>>

        /**
         * Returns a raw HTTP response for `get /pending_transactions`, but is otherwise the same as
         * [PendingTransactionServiceAsync.list].
         */
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: PendingTransactionListParams = PendingTransactionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PendingTransactionListPageAsync>>

        /**
         * Returns a raw HTTP response for `get /pending_transactions`, but is otherwise the same as
         * [PendingTransactionServiceAsync.list].
         */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<PendingTransactionListPageAsync>> =
            list(PendingTransactionListParams.none(), requestOptions)
    }
}
