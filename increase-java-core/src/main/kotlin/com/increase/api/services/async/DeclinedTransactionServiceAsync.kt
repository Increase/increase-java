// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.declinedtransactions.DeclinedTransaction
import com.increase.api.models.declinedtransactions.DeclinedTransactionListParams
import com.increase.api.models.declinedtransactions.DeclinedTransactionListResponse
import com.increase.api.models.declinedtransactions.DeclinedTransactionRetrieveParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface DeclinedTransactionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DeclinedTransactionServiceAsync

    /** Retrieve a Declined Transaction */
    fun retrieve(declinedTransactionId: String): CompletableFuture<DeclinedTransaction> =
        retrieve(declinedTransactionId, DeclinedTransactionRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        declinedTransactionId: String,
        params: DeclinedTransactionRetrieveParams = DeclinedTransactionRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DeclinedTransaction> =
        retrieve(
            params.toBuilder().declinedTransactionId(declinedTransactionId).build(),
            requestOptions,
        )

    /** @see retrieve */
    fun retrieve(
        declinedTransactionId: String,
        params: DeclinedTransactionRetrieveParams = DeclinedTransactionRetrieveParams.none(),
    ): CompletableFuture<DeclinedTransaction> =
        retrieve(declinedTransactionId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: DeclinedTransactionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DeclinedTransaction>

    /** @see retrieve */
    fun retrieve(
        params: DeclinedTransactionRetrieveParams
    ): CompletableFuture<DeclinedTransaction> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        declinedTransactionId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<DeclinedTransaction> =
        retrieve(declinedTransactionId, DeclinedTransactionRetrieveParams.none(), requestOptions)

    /** List Declined Transactions */
    fun list(): CompletableFuture<DeclinedTransactionListResponse> =
        list(DeclinedTransactionListParams.none())

    /** @see list */
    fun list(
        params: DeclinedTransactionListParams = DeclinedTransactionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DeclinedTransactionListResponse>

    /** @see list */
    fun list(
        params: DeclinedTransactionListParams = DeclinedTransactionListParams.none()
    ): CompletableFuture<DeclinedTransactionListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<DeclinedTransactionListResponse> =
        list(DeclinedTransactionListParams.none(), requestOptions)

    /**
     * A view of [DeclinedTransactionServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DeclinedTransactionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /declined_transactions/{declined_transaction_id}`,
         * but is otherwise the same as [DeclinedTransactionServiceAsync.retrieve].
         */
        fun retrieve(
            declinedTransactionId: String
        ): CompletableFuture<HttpResponseFor<DeclinedTransaction>> =
            retrieve(declinedTransactionId, DeclinedTransactionRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            declinedTransactionId: String,
            params: DeclinedTransactionRetrieveParams = DeclinedTransactionRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DeclinedTransaction>> =
            retrieve(
                params.toBuilder().declinedTransactionId(declinedTransactionId).build(),
                requestOptions,
            )

        /** @see retrieve */
        fun retrieve(
            declinedTransactionId: String,
            params: DeclinedTransactionRetrieveParams = DeclinedTransactionRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<DeclinedTransaction>> =
            retrieve(declinedTransactionId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: DeclinedTransactionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DeclinedTransaction>>

        /** @see retrieve */
        fun retrieve(
            params: DeclinedTransactionRetrieveParams
        ): CompletableFuture<HttpResponseFor<DeclinedTransaction>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            declinedTransactionId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DeclinedTransaction>> =
            retrieve(
                declinedTransactionId,
                DeclinedTransactionRetrieveParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /declined_transactions`, but is otherwise the same
         * as [DeclinedTransactionServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<DeclinedTransactionListResponse>> =
            list(DeclinedTransactionListParams.none())

        /** @see list */
        fun list(
            params: DeclinedTransactionListParams = DeclinedTransactionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DeclinedTransactionListResponse>>

        /** @see list */
        fun list(
            params: DeclinedTransactionListParams = DeclinedTransactionListParams.none()
        ): CompletableFuture<HttpResponseFor<DeclinedTransactionListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<DeclinedTransactionListResponse>> =
            list(DeclinedTransactionListParams.none(), requestOptions)
    }
}
