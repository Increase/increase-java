// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.DeclinedTransaction
import com.increase.api.models.DeclinedTransactionListPage
import com.increase.api.models.DeclinedTransactionListParams
import com.increase.api.models.DeclinedTransactionRetrieveParams

interface DeclinedTransactionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Retrieve a Declined Transaction */
    fun retrieve(params: DeclinedTransactionRetrieveParams): DeclinedTransaction =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: DeclinedTransactionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DeclinedTransaction

    /** List Declined Transactions */
    fun list(): DeclinedTransactionListPage = list(DeclinedTransactionListParams.none())

    /** @see [list] */
    fun list(
        params: DeclinedTransactionListParams = DeclinedTransactionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DeclinedTransactionListPage

    /** @see [list] */
    fun list(
        params: DeclinedTransactionListParams = DeclinedTransactionListParams.none()
    ): DeclinedTransactionListPage = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): DeclinedTransactionListPage =
        list(DeclinedTransactionListParams.none(), requestOptions)

    /**
     * A view of [DeclinedTransactionService] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /declined_transactions/{declined_transaction_id}`,
         * but is otherwise the same as [DeclinedTransactionService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: DeclinedTransactionRetrieveParams
        ): HttpResponseFor<DeclinedTransaction> = retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: DeclinedTransactionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DeclinedTransaction>

        /**
         * Returns a raw HTTP response for `get /declined_transactions`, but is otherwise the same
         * as [DeclinedTransactionService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<DeclinedTransactionListPage> =
            list(DeclinedTransactionListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: DeclinedTransactionListParams = DeclinedTransactionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DeclinedTransactionListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: DeclinedTransactionListParams = DeclinedTransactionListParams.none()
        ): HttpResponseFor<DeclinedTransactionListPage> = list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<DeclinedTransactionListPage> =
            list(DeclinedTransactionListParams.none(), requestOptions)
    }
}
