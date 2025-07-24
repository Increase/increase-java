// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.pendingtransactions.PendingTransaction
import com.increase.api.models.pendingtransactions.PendingTransactionCreateParams
import com.increase.api.models.pendingtransactions.PendingTransactionListPageAsync
import com.increase.api.models.pendingtransactions.PendingTransactionListParams
import com.increase.api.models.pendingtransactions.PendingTransactionReleaseParams
import com.increase.api.models.pendingtransactions.PendingTransactionRetrieveParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface PendingTransactionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PendingTransactionServiceAsync

    /**
     * Creates a pending transaction on an account. This can be useful to hold funds for an external
     * payment or known future transaction outside of Increase. The resulting Pending Transaction
     * will have a `category` of `user_initiated_hold` and can be released via the API to unlock the
     * held funds.
     */
    fun create(params: PendingTransactionCreateParams): CompletableFuture<PendingTransaction> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: PendingTransactionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PendingTransaction>

    /** Retrieve a Pending Transaction */
    fun retrieve(pendingTransactionId: String): CompletableFuture<PendingTransaction> =
        retrieve(pendingTransactionId, PendingTransactionRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        pendingTransactionId: String,
        params: PendingTransactionRetrieveParams = PendingTransactionRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PendingTransaction> =
        retrieve(
            params.toBuilder().pendingTransactionId(pendingTransactionId).build(),
            requestOptions,
        )

    /** @see retrieve */
    fun retrieve(
        pendingTransactionId: String,
        params: PendingTransactionRetrieveParams = PendingTransactionRetrieveParams.none(),
    ): CompletableFuture<PendingTransaction> =
        retrieve(pendingTransactionId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: PendingTransactionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PendingTransaction>

    /** @see retrieve */
    fun retrieve(params: PendingTransactionRetrieveParams): CompletableFuture<PendingTransaction> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        pendingTransactionId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<PendingTransaction> =
        retrieve(pendingTransactionId, PendingTransactionRetrieveParams.none(), requestOptions)

    /** List Pending Transactions */
    fun list(): CompletableFuture<PendingTransactionListPageAsync> =
        list(PendingTransactionListParams.none())

    /** @see list */
    fun list(
        params: PendingTransactionListParams = PendingTransactionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PendingTransactionListPageAsync>

    /** @see list */
    fun list(
        params: PendingTransactionListParams = PendingTransactionListParams.none()
    ): CompletableFuture<PendingTransactionListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<PendingTransactionListPageAsync> =
        list(PendingTransactionListParams.none(), requestOptions)

    /**
     * Release a Pending Transaction you had previously created. The Pending Transaction must have a
     * `category` of `user_initiated_hold` and a `status` of `pending`. This will unlock the held
     * funds and mark the Pending Transaction as complete.
     */
    fun release(pendingTransactionId: String): CompletableFuture<PendingTransaction> =
        release(pendingTransactionId, PendingTransactionReleaseParams.none())

    /** @see release */
    fun release(
        pendingTransactionId: String,
        params: PendingTransactionReleaseParams = PendingTransactionReleaseParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PendingTransaction> =
        release(
            params.toBuilder().pendingTransactionId(pendingTransactionId).build(),
            requestOptions,
        )

    /** @see release */
    fun release(
        pendingTransactionId: String,
        params: PendingTransactionReleaseParams = PendingTransactionReleaseParams.none(),
    ): CompletableFuture<PendingTransaction> =
        release(pendingTransactionId, params, RequestOptions.none())

    /** @see release */
    fun release(
        params: PendingTransactionReleaseParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PendingTransaction>

    /** @see release */
    fun release(params: PendingTransactionReleaseParams): CompletableFuture<PendingTransaction> =
        release(params, RequestOptions.none())

    /** @see release */
    fun release(
        pendingTransactionId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<PendingTransaction> =
        release(pendingTransactionId, PendingTransactionReleaseParams.none(), requestOptions)

    /**
     * A view of [PendingTransactionServiceAsync] that provides access to raw HTTP responses for
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
        ): PendingTransactionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /pending_transactions`, but is otherwise the same
         * as [PendingTransactionServiceAsync.create].
         */
        fun create(
            params: PendingTransactionCreateParams
        ): CompletableFuture<HttpResponseFor<PendingTransaction>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: PendingTransactionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PendingTransaction>>

        /**
         * Returns a raw HTTP response for `get /pending_transactions/{pending_transaction_id}`, but
         * is otherwise the same as [PendingTransactionServiceAsync.retrieve].
         */
        fun retrieve(
            pendingTransactionId: String
        ): CompletableFuture<HttpResponseFor<PendingTransaction>> =
            retrieve(pendingTransactionId, PendingTransactionRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            pendingTransactionId: String,
            params: PendingTransactionRetrieveParams = PendingTransactionRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PendingTransaction>> =
            retrieve(
                params.toBuilder().pendingTransactionId(pendingTransactionId).build(),
                requestOptions,
            )

        /** @see retrieve */
        fun retrieve(
            pendingTransactionId: String,
            params: PendingTransactionRetrieveParams = PendingTransactionRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<PendingTransaction>> =
            retrieve(pendingTransactionId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: PendingTransactionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PendingTransaction>>

        /** @see retrieve */
        fun retrieve(
            params: PendingTransactionRetrieveParams
        ): CompletableFuture<HttpResponseFor<PendingTransaction>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            pendingTransactionId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PendingTransaction>> =
            retrieve(pendingTransactionId, PendingTransactionRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /pending_transactions`, but is otherwise the same as
         * [PendingTransactionServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<PendingTransactionListPageAsync>> =
            list(PendingTransactionListParams.none())

        /** @see list */
        fun list(
            params: PendingTransactionListParams = PendingTransactionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PendingTransactionListPageAsync>>

        /** @see list */
        fun list(
            params: PendingTransactionListParams = PendingTransactionListParams.none()
        ): CompletableFuture<HttpResponseFor<PendingTransactionListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<PendingTransactionListPageAsync>> =
            list(PendingTransactionListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /pending_transactions/{pending_transaction_id}/release`, but is otherwise the same as
         * [PendingTransactionServiceAsync.release].
         */
        fun release(
            pendingTransactionId: String
        ): CompletableFuture<HttpResponseFor<PendingTransaction>> =
            release(pendingTransactionId, PendingTransactionReleaseParams.none())

        /** @see release */
        fun release(
            pendingTransactionId: String,
            params: PendingTransactionReleaseParams = PendingTransactionReleaseParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PendingTransaction>> =
            release(
                params.toBuilder().pendingTransactionId(pendingTransactionId).build(),
                requestOptions,
            )

        /** @see release */
        fun release(
            pendingTransactionId: String,
            params: PendingTransactionReleaseParams = PendingTransactionReleaseParams.none(),
        ): CompletableFuture<HttpResponseFor<PendingTransaction>> =
            release(pendingTransactionId, params, RequestOptions.none())

        /** @see release */
        fun release(
            params: PendingTransactionReleaseParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PendingTransaction>>

        /** @see release */
        fun release(
            params: PendingTransactionReleaseParams
        ): CompletableFuture<HttpResponseFor<PendingTransaction>> =
            release(params, RequestOptions.none())

        /** @see release */
        fun release(
            pendingTransactionId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PendingTransaction>> =
            release(pendingTransactionId, PendingTransactionReleaseParams.none(), requestOptions)
    }
}
