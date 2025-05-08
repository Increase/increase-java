// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.declinedtransactions.DeclinedTransaction
import com.increase.api.models.declinedtransactions.DeclinedTransactionListPage
import com.increase.api.models.declinedtransactions.DeclinedTransactionListParams
import com.increase.api.models.declinedtransactions.DeclinedTransactionRetrieveParams

interface DeclinedTransactionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Retrieve a Declined Transaction */
    fun retrieve(declinedTransactionId: String): DeclinedTransaction =
        retrieve(declinedTransactionId, DeclinedTransactionRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        declinedTransactionId: String,
        params: DeclinedTransactionRetrieveParams = DeclinedTransactionRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DeclinedTransaction =
        retrieve(
            params.toBuilder().declinedTransactionId(declinedTransactionId).build(),
            requestOptions,
        )

    /** @see [retrieve] */
    fun retrieve(
        declinedTransactionId: String,
        params: DeclinedTransactionRetrieveParams = DeclinedTransactionRetrieveParams.none(),
    ): DeclinedTransaction = retrieve(declinedTransactionId, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: DeclinedTransactionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DeclinedTransaction

    /** @see [retrieve] */
    fun retrieve(params: DeclinedTransactionRetrieveParams): DeclinedTransaction =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        declinedTransactionId: String,
        requestOptions: RequestOptions,
    ): DeclinedTransaction =
        retrieve(declinedTransactionId, DeclinedTransactionRetrieveParams.none(), requestOptions)

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
        fun retrieve(declinedTransactionId: String): HttpResponseFor<DeclinedTransaction> =
            retrieve(declinedTransactionId, DeclinedTransactionRetrieveParams.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            declinedTransactionId: String,
            params: DeclinedTransactionRetrieveParams = DeclinedTransactionRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DeclinedTransaction> =
            retrieve(
                params.toBuilder().declinedTransactionId(declinedTransactionId).build(),
                requestOptions,
            )

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            declinedTransactionId: String,
            params: DeclinedTransactionRetrieveParams = DeclinedTransactionRetrieveParams.none(),
        ): HttpResponseFor<DeclinedTransaction> =
            retrieve(declinedTransactionId, params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: DeclinedTransactionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DeclinedTransaction>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: DeclinedTransactionRetrieveParams
        ): HttpResponseFor<DeclinedTransaction> = retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            declinedTransactionId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DeclinedTransaction> =
            retrieve(
                declinedTransactionId,
                DeclinedTransactionRetrieveParams.none(),
                requestOptions,
            )

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
