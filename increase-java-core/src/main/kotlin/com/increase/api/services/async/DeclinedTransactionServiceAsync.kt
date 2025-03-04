// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.DeclinedTransaction
import com.increase.api.models.DeclinedTransactionListPageAsync
import com.increase.api.models.DeclinedTransactionListParams
import com.increase.api.models.DeclinedTransactionRetrieveParams
import java.util.concurrent.CompletableFuture

interface DeclinedTransactionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Retrieve a Declined Transaction */
    @JvmOverloads
    fun retrieve(
        params: DeclinedTransactionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DeclinedTransaction>

    /** List Declined Transactions */
    @JvmOverloads
    fun list(
        params: DeclinedTransactionListParams = DeclinedTransactionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DeclinedTransactionListPageAsync>

    /** List Declined Transactions */
    fun list(requestOptions: RequestOptions): CompletableFuture<DeclinedTransactionListPageAsync> =
        list(DeclinedTransactionListParams.none(), requestOptions)

    /**
     * A view of [DeclinedTransactionServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /declined_transactions/{declined_transaction_id}`,
         * but is otherwise the same as [DeclinedTransactionServiceAsync.retrieve].
         */
        @JvmOverloads
        @MustBeClosed
        fun retrieve(
            params: DeclinedTransactionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DeclinedTransaction>>

        /**
         * Returns a raw HTTP response for `get /declined_transactions`, but is otherwise the same
         * as [DeclinedTransactionServiceAsync.list].
         */
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: DeclinedTransactionListParams = DeclinedTransactionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DeclinedTransactionListPageAsync>>

        /**
         * Returns a raw HTTP response for `get /declined_transactions`, but is otherwise the same
         * as [DeclinedTransactionServiceAsync.list].
         */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<DeclinedTransactionListPageAsync>> =
            list(DeclinedTransactionListParams.none(), requestOptions)
    }
}
