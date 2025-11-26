// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.pendingtransactions.PendingTransaction
import com.increase.api.models.pendingtransactions.PendingTransactionCreateParams
import com.increase.api.models.pendingtransactions.PendingTransactionListPage
import com.increase.api.models.pendingtransactions.PendingTransactionListParams
import com.increase.api.models.pendingtransactions.PendingTransactionReleaseParams
import com.increase.api.models.pendingtransactions.PendingTransactionRetrieveParams
import java.util.function.Consumer

interface PendingTransactionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PendingTransactionService

    /**
     * Creates a pending transaction on an account. This can be useful to hold funds for an external
     * payment or known future transaction outside of Increase. The resulting Pending Transaction
     * will have a `category` of `user_initiated_hold` and can be released via the API to unlock the
     * held funds.
     */
    fun create(params: PendingTransactionCreateParams): PendingTransaction =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: PendingTransactionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PendingTransaction

    /** Retrieve a Pending Transaction */
    fun retrieve(pendingTransactionId: String): PendingTransaction =
        retrieve(pendingTransactionId, PendingTransactionRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        pendingTransactionId: String,
        params: PendingTransactionRetrieveParams = PendingTransactionRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PendingTransaction =
        retrieve(
            params.toBuilder().pendingTransactionId(pendingTransactionId).build(),
            requestOptions,
        )

    /** @see retrieve */
    fun retrieve(
        pendingTransactionId: String,
        params: PendingTransactionRetrieveParams = PendingTransactionRetrieveParams.none(),
    ): PendingTransaction = retrieve(pendingTransactionId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: PendingTransactionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PendingTransaction

    /** @see retrieve */
    fun retrieve(params: PendingTransactionRetrieveParams): PendingTransaction =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(pendingTransactionId: String, requestOptions: RequestOptions): PendingTransaction =
        retrieve(pendingTransactionId, PendingTransactionRetrieveParams.none(), requestOptions)

    /** List Pending Transactions */
    fun list(): PendingTransactionListPage = list(PendingTransactionListParams.none())

    /** @see list */
    fun list(
        params: PendingTransactionListParams = PendingTransactionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PendingTransactionListPage

    /** @see list */
    fun list(
        params: PendingTransactionListParams = PendingTransactionListParams.none()
    ): PendingTransactionListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): PendingTransactionListPage =
        list(PendingTransactionListParams.none(), requestOptions)

    /**
     * Release a Pending Transaction you had previously created. The Pending Transaction must have a
     * `category` of `user_initiated_hold` and a `status` of `pending`. This will unlock the held
     * funds and mark the Pending Transaction as complete.
     */
    fun release(pendingTransactionId: String): PendingTransaction =
        release(pendingTransactionId, PendingTransactionReleaseParams.none())

    /** @see release */
    fun release(
        pendingTransactionId: String,
        params: PendingTransactionReleaseParams = PendingTransactionReleaseParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PendingTransaction =
        release(
            params.toBuilder().pendingTransactionId(pendingTransactionId).build(),
            requestOptions,
        )

    /** @see release */
    fun release(
        pendingTransactionId: String,
        params: PendingTransactionReleaseParams = PendingTransactionReleaseParams.none(),
    ): PendingTransaction = release(pendingTransactionId, params, RequestOptions.none())

    /** @see release */
    fun release(
        params: PendingTransactionReleaseParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PendingTransaction

    /** @see release */
    fun release(params: PendingTransactionReleaseParams): PendingTransaction =
        release(params, RequestOptions.none())

    /** @see release */
    fun release(pendingTransactionId: String, requestOptions: RequestOptions): PendingTransaction =
        release(pendingTransactionId, PendingTransactionReleaseParams.none(), requestOptions)

    /**
     * A view of [PendingTransactionService] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PendingTransactionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /pending_transactions`, but is otherwise the same
         * as [PendingTransactionService.create].
         */
        @MustBeClosed
        fun create(params: PendingTransactionCreateParams): HttpResponseFor<PendingTransaction> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: PendingTransactionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PendingTransaction>

        /**
         * Returns a raw HTTP response for `get /pending_transactions/{pending_transaction_id}`, but
         * is otherwise the same as [PendingTransactionService.retrieve].
         */
        @MustBeClosed
        fun retrieve(pendingTransactionId: String): HttpResponseFor<PendingTransaction> =
            retrieve(pendingTransactionId, PendingTransactionRetrieveParams.none())

        /** @see retrieve */
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

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            pendingTransactionId: String,
            params: PendingTransactionRetrieveParams = PendingTransactionRetrieveParams.none(),
        ): HttpResponseFor<PendingTransaction> =
            retrieve(pendingTransactionId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: PendingTransactionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PendingTransaction>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: PendingTransactionRetrieveParams
        ): HttpResponseFor<PendingTransaction> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
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

        /** @see list */
        @MustBeClosed
        fun list(
            params: PendingTransactionListParams = PendingTransactionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PendingTransactionListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: PendingTransactionListParams = PendingTransactionListParams.none()
        ): HttpResponseFor<PendingTransactionListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<PendingTransactionListPage> =
            list(PendingTransactionListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /pending_transactions/{pending_transaction_id}/release`, but is otherwise the same as
         * [PendingTransactionService.release].
         */
        @MustBeClosed
        fun release(pendingTransactionId: String): HttpResponseFor<PendingTransaction> =
            release(pendingTransactionId, PendingTransactionReleaseParams.none())

        /** @see release */
        @MustBeClosed
        fun release(
            pendingTransactionId: String,
            params: PendingTransactionReleaseParams = PendingTransactionReleaseParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PendingTransaction> =
            release(
                params.toBuilder().pendingTransactionId(pendingTransactionId).build(),
                requestOptions,
            )

        /** @see release */
        @MustBeClosed
        fun release(
            pendingTransactionId: String,
            params: PendingTransactionReleaseParams = PendingTransactionReleaseParams.none(),
        ): HttpResponseFor<PendingTransaction> =
            release(pendingTransactionId, params, RequestOptions.none())

        /** @see release */
        @MustBeClosed
        fun release(
            params: PendingTransactionReleaseParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PendingTransaction>

        /** @see release */
        @MustBeClosed
        fun release(params: PendingTransactionReleaseParams): HttpResponseFor<PendingTransaction> =
            release(params, RequestOptions.none())

        /** @see release */
        @MustBeClosed
        fun release(
            pendingTransactionId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PendingTransaction> =
            release(pendingTransactionId, PendingTransactionReleaseParams.none(), requestOptions)
    }
}
