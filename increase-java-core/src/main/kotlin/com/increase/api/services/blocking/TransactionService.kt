// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.Transaction
import com.increase.api.models.TransactionListPage
import com.increase.api.models.TransactionListParams
import com.increase.api.models.TransactionRetrieveParams

interface TransactionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Retrieve a Transaction */
    @JvmOverloads
    fun retrieve(
        params: TransactionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Transaction

    /** List Transactions */
    @JvmOverloads
    fun list(
        params: TransactionListParams = TransactionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionListPage

    /** List Transactions */
    fun list(requestOptions: RequestOptions): TransactionListPage =
        list(TransactionListParams.none(), requestOptions)

    /**
     * A view of [TransactionService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /transactions/{transaction_id}`, but is otherwise
         * the same as [TransactionService.retrieve].
         */
        @JvmOverloads
        @MustBeClosed
        fun retrieve(
            params: TransactionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Transaction>

        /**
         * Returns a raw HTTP response for `get /transactions`, but is otherwise the same as
         * [TransactionService.list].
         */
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: TransactionListParams = TransactionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransactionListPage>

        /**
         * Returns a raw HTTP response for `get /transactions`, but is otherwise the same as
         * [TransactionService.list].
         */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<TransactionListPage> =
            list(TransactionListParams.none(), requestOptions)
    }
}
