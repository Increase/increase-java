// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.declinedtransactions.DeclinedTransaction
import com.increase.api.models.declinedtransactions.DeclinedTransactionListPageAsync
import com.increase.api.models.declinedtransactions.DeclinedTransactionListParams
import com.increase.api.models.declinedtransactions.DeclinedTransactionRetrieveParams
import java.util.concurrent.CompletableFuture

interface DeclinedTransactionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Retrieve a Declined Transaction */
    fun retrieve(
        params: DeclinedTransactionRetrieveParams
    ): CompletableFuture<DeclinedTransaction> = retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: DeclinedTransactionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DeclinedTransaction>

    /** List Declined Transactions */
    fun list(): CompletableFuture<DeclinedTransactionListPageAsync> =
        list(DeclinedTransactionListParams.none())

    /** @see [list] */
    fun list(
        params: DeclinedTransactionListParams = DeclinedTransactionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DeclinedTransactionListPageAsync>

    /** @see [list] */
    fun list(
        params: DeclinedTransactionListParams = DeclinedTransactionListParams.none()
    ): CompletableFuture<DeclinedTransactionListPageAsync> = list(params, RequestOptions.none())

    /** @see [list] */
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
        @MustBeClosed
        fun retrieve(
            params: DeclinedTransactionRetrieveParams
        ): CompletableFuture<HttpResponseFor<DeclinedTransaction>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: DeclinedTransactionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DeclinedTransaction>>

        /**
         * Returns a raw HTTP response for `get /declined_transactions`, but is otherwise the same
         * as [DeclinedTransactionServiceAsync.list].
         */
        @MustBeClosed
        fun list(): CompletableFuture<HttpResponseFor<DeclinedTransactionListPageAsync>> =
            list(DeclinedTransactionListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: DeclinedTransactionListParams = DeclinedTransactionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DeclinedTransactionListPageAsync>>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: DeclinedTransactionListParams = DeclinedTransactionListParams.none()
        ): CompletableFuture<HttpResponseFor<DeclinedTransactionListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<DeclinedTransactionListPageAsync>> =
            list(DeclinedTransactionListParams.none(), requestOptions)
    }
}
