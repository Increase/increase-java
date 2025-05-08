// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.pendingtransactions.PendingTransaction
import com.increase.api.models.pendingtransactions.PendingTransactionListPage
import com.increase.api.models.pendingtransactions.PendingTransactionListParams
import com.increase.api.models.pendingtransactions.PendingTransactionRetrieveParams

interface PendingTransactionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Retrieve a Pending Transaction */
    fun retrieve(pendingTransactionId: String): PendingTransaction =
        retrieve(pendingTransactionId, PendingTransactionRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        pendingTransactionId: String,
        params: PendingTransactionRetrieveParams = PendingTransactionRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PendingTransaction =
        retrieve(
            params.toBuilder().pendingTransactionId(pendingTransactionId).build(),
            requestOptions,
        )

    /** @see [retrieve] */
    fun retrieve(
        pendingTransactionId: String,
        params: PendingTransactionRetrieveParams = PendingTransactionRetrieveParams.none(),
    ): PendingTransaction = retrieve(pendingTransactionId, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: PendingTransactionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PendingTransaction

    /** @see [retrieve] */
    fun retrieve(params: PendingTransactionRetrieveParams): PendingTransaction =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(pendingTransactionId: String, requestOptions: RequestOptions): PendingTransaction =
        retrieve(pendingTransactionId, PendingTransactionRetrieveParams.none(), requestOptions)

    /** List Pending Transactions */
    fun list(): PendingTransactionListPage = list(PendingTransactionListParams.none())

    /** @see [list] */
    fun list(
        params: PendingTransactionListParams = PendingTransactionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PendingTransactionListPage

    /** @see [list] */
    fun list(
        params: PendingTransactionListParams = PendingTransactionListParams.none()
    ): PendingTransactionListPage = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): PendingTransactionListPage =
        list(PendingTransactionListParams.none(), requestOptions)

    /**
     * A view of [PendingTransactionService] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /pending_transactions/{pending_transaction_id}`, but
         * is otherwise the same as [PendingTransactionService.retrieve].
         */
        @MustBeClosed
        fun retrieve(pendingTransactionId: String): HttpResponseFor<PendingTransaction> =
            retrieve(pendingTransactionId, PendingTransactionRetrieveParams.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            pendingTransactionId: String,
            params: PendingTransactionRetrieveParams = PendingTransactionRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PendingTransaction> =
            retrieve(
                params.toBuilder().pendingTransactionId(pendingTransactionId).build(),
                requestOptions,
            )

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            pendingTransactionId: String,
            params: PendingTransactionRetrieveParams = PendingTransactionRetrieveParams.none(),
        ): HttpResponseFor<PendingTransaction> =
            retrieve(pendingTransactionId, params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: PendingTransactionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PendingTransaction>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: PendingTransactionRetrieveParams
        ): HttpResponseFor<PendingTransaction> = retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            pendingTransactionId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PendingTransaction> =
            retrieve(pendingTransactionId, PendingTransactionRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /pending_transactions`, but is otherwise the same as
         * [PendingTransactionService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<PendingTransactionListPage> =
            list(PendingTransactionListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: PendingTransactionListParams = PendingTransactionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PendingTransactionListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: PendingTransactionListParams = PendingTransactionListParams.none()
        ): HttpResponseFor<PendingTransactionListPage> = list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<PendingTransactionListPage> =
            list(PendingTransactionListParams.none(), requestOptions)
    }
}
