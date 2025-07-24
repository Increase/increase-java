// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.accounttransfers.AccountTransfer
import com.increase.api.models.accounttransfers.AccountTransferApproveParams
import com.increase.api.models.accounttransfers.AccountTransferCancelParams
import com.increase.api.models.accounttransfers.AccountTransferCreateParams
import com.increase.api.models.accounttransfers.AccountTransferListPageAsync
import com.increase.api.models.accounttransfers.AccountTransferListParams
import com.increase.api.models.accounttransfers.AccountTransferRetrieveParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface AccountTransferServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AccountTransferServiceAsync

    /** Create an Account Transfer */
    fun create(params: AccountTransferCreateParams): CompletableFuture<AccountTransfer> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: AccountTransferCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccountTransfer>

    /** Retrieve an Account Transfer */
    fun retrieve(accountTransferId: String): CompletableFuture<AccountTransfer> =
        retrieve(accountTransferId, AccountTransferRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        accountTransferId: String,
        params: AccountTransferRetrieveParams = AccountTransferRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccountTransfer> =
        retrieve(params.toBuilder().accountTransferId(accountTransferId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        accountTransferId: String,
        params: AccountTransferRetrieveParams = AccountTransferRetrieveParams.none(),
    ): CompletableFuture<AccountTransfer> =
        retrieve(accountTransferId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: AccountTransferRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccountTransfer>

    /** @see retrieve */
    fun retrieve(params: AccountTransferRetrieveParams): CompletableFuture<AccountTransfer> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        accountTransferId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<AccountTransfer> =
        retrieve(accountTransferId, AccountTransferRetrieveParams.none(), requestOptions)

    /** List Account Transfers */
    fun list(): CompletableFuture<AccountTransferListPageAsync> =
        list(AccountTransferListParams.none())

    /** @see list */
    fun list(
        params: AccountTransferListParams = AccountTransferListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccountTransferListPageAsync>

    /** @see list */
    fun list(
        params: AccountTransferListParams = AccountTransferListParams.none()
    ): CompletableFuture<AccountTransferListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<AccountTransferListPageAsync> =
        list(AccountTransferListParams.none(), requestOptions)

    /** Approve an Account Transfer */
    fun approve(accountTransferId: String): CompletableFuture<AccountTransfer> =
        approve(accountTransferId, AccountTransferApproveParams.none())

    /** @see approve */
    fun approve(
        accountTransferId: String,
        params: AccountTransferApproveParams = AccountTransferApproveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccountTransfer> =
        approve(params.toBuilder().accountTransferId(accountTransferId).build(), requestOptions)

    /** @see approve */
    fun approve(
        accountTransferId: String,
        params: AccountTransferApproveParams = AccountTransferApproveParams.none(),
    ): CompletableFuture<AccountTransfer> =
        approve(accountTransferId, params, RequestOptions.none())

    /** @see approve */
    fun approve(
        params: AccountTransferApproveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccountTransfer>

    /** @see approve */
    fun approve(params: AccountTransferApproveParams): CompletableFuture<AccountTransfer> =
        approve(params, RequestOptions.none())

    /** @see approve */
    fun approve(
        accountTransferId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<AccountTransfer> =
        approve(accountTransferId, AccountTransferApproveParams.none(), requestOptions)

    /** Cancel an Account Transfer */
    fun cancel(accountTransferId: String): CompletableFuture<AccountTransfer> =
        cancel(accountTransferId, AccountTransferCancelParams.none())

    /** @see cancel */
    fun cancel(
        accountTransferId: String,
        params: AccountTransferCancelParams = AccountTransferCancelParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccountTransfer> =
        cancel(params.toBuilder().accountTransferId(accountTransferId).build(), requestOptions)

    /** @see cancel */
    fun cancel(
        accountTransferId: String,
        params: AccountTransferCancelParams = AccountTransferCancelParams.none(),
    ): CompletableFuture<AccountTransfer> = cancel(accountTransferId, params, RequestOptions.none())

    /** @see cancel */
    fun cancel(
        params: AccountTransferCancelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccountTransfer>

    /** @see cancel */
    fun cancel(params: AccountTransferCancelParams): CompletableFuture<AccountTransfer> =
        cancel(params, RequestOptions.none())

    /** @see cancel */
    fun cancel(
        accountTransferId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<AccountTransfer> =
        cancel(accountTransferId, AccountTransferCancelParams.none(), requestOptions)

    /**
     * A view of [AccountTransferServiceAsync] that provides access to raw HTTP responses for each
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
        ): AccountTransferServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /account_transfers`, but is otherwise the same as
         * [AccountTransferServiceAsync.create].
         */
        fun create(
            params: AccountTransferCreateParams
        ): CompletableFuture<HttpResponseFor<AccountTransfer>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: AccountTransferCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccountTransfer>>

        /**
         * Returns a raw HTTP response for `get /account_transfers/{account_transfer_id}`, but is
         * otherwise the same as [AccountTransferServiceAsync.retrieve].
         */
        fun retrieve(
            accountTransferId: String
        ): CompletableFuture<HttpResponseFor<AccountTransfer>> =
            retrieve(accountTransferId, AccountTransferRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            accountTransferId: String,
            params: AccountTransferRetrieveParams = AccountTransferRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccountTransfer>> =
            retrieve(
                params.toBuilder().accountTransferId(accountTransferId).build(),
                requestOptions,
            )

        /** @see retrieve */
        fun retrieve(
            accountTransferId: String,
            params: AccountTransferRetrieveParams = AccountTransferRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<AccountTransfer>> =
            retrieve(accountTransferId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: AccountTransferRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccountTransfer>>

        /** @see retrieve */
        fun retrieve(
            params: AccountTransferRetrieveParams
        ): CompletableFuture<HttpResponseFor<AccountTransfer>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            accountTransferId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AccountTransfer>> =
            retrieve(accountTransferId, AccountTransferRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /account_transfers`, but is otherwise the same as
         * [AccountTransferServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<AccountTransferListPageAsync>> =
            list(AccountTransferListParams.none())

        /** @see list */
        fun list(
            params: AccountTransferListParams = AccountTransferListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccountTransferListPageAsync>>

        /** @see list */
        fun list(
            params: AccountTransferListParams = AccountTransferListParams.none()
        ): CompletableFuture<HttpResponseFor<AccountTransferListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<AccountTransferListPageAsync>> =
            list(AccountTransferListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /account_transfers/{account_transfer_id}/approve`,
         * but is otherwise the same as [AccountTransferServiceAsync.approve].
         */
        fun approve(
            accountTransferId: String
        ): CompletableFuture<HttpResponseFor<AccountTransfer>> =
            approve(accountTransferId, AccountTransferApproveParams.none())

        /** @see approve */
        fun approve(
            accountTransferId: String,
            params: AccountTransferApproveParams = AccountTransferApproveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccountTransfer>> =
            approve(params.toBuilder().accountTransferId(accountTransferId).build(), requestOptions)

        /** @see approve */
        fun approve(
            accountTransferId: String,
            params: AccountTransferApproveParams = AccountTransferApproveParams.none(),
        ): CompletableFuture<HttpResponseFor<AccountTransfer>> =
            approve(accountTransferId, params, RequestOptions.none())

        /** @see approve */
        fun approve(
            params: AccountTransferApproveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccountTransfer>>

        /** @see approve */
        fun approve(
            params: AccountTransferApproveParams
        ): CompletableFuture<HttpResponseFor<AccountTransfer>> =
            approve(params, RequestOptions.none())

        /** @see approve */
        fun approve(
            accountTransferId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AccountTransfer>> =
            approve(accountTransferId, AccountTransferApproveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /account_transfers/{account_transfer_id}/cancel`,
         * but is otherwise the same as [AccountTransferServiceAsync.cancel].
         */
        fun cancel(accountTransferId: String): CompletableFuture<HttpResponseFor<AccountTransfer>> =
            cancel(accountTransferId, AccountTransferCancelParams.none())

        /** @see cancel */
        fun cancel(
            accountTransferId: String,
            params: AccountTransferCancelParams = AccountTransferCancelParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccountTransfer>> =
            cancel(params.toBuilder().accountTransferId(accountTransferId).build(), requestOptions)

        /** @see cancel */
        fun cancel(
            accountTransferId: String,
            params: AccountTransferCancelParams = AccountTransferCancelParams.none(),
        ): CompletableFuture<HttpResponseFor<AccountTransfer>> =
            cancel(accountTransferId, params, RequestOptions.none())

        /** @see cancel */
        fun cancel(
            params: AccountTransferCancelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccountTransfer>>

        /** @see cancel */
        fun cancel(
            params: AccountTransferCancelParams
        ): CompletableFuture<HttpResponseFor<AccountTransfer>> =
            cancel(params, RequestOptions.none())

        /** @see cancel */
        fun cancel(
            accountTransferId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AccountTransfer>> =
            cancel(accountTransferId, AccountTransferCancelParams.none(), requestOptions)
    }
}
