// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async.simulations

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.accounttransfers.AccountTransfer
import com.increase.api.models.simulations.accounttransfers.AccountTransferCompleteParams
import java.util.concurrent.CompletableFuture

interface AccountTransferServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * If your account is configured to require approval for each transfer, this endpoint simulates
     * the approval of an [Account Transfer](#account-transfers). You can also approve sandbox
     * Account Transfers in the dashboard. This transfer must first have a `status` of
     * `pending_approval`.
     */
    fun complete(accountTransferId: String): CompletableFuture<AccountTransfer> =
        complete(accountTransferId, AccountTransferCompleteParams.none())

    /** @see [complete] */
    fun complete(
        accountTransferId: String,
        params: AccountTransferCompleteParams = AccountTransferCompleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccountTransfer> =
        complete(params.toBuilder().accountTransferId(accountTransferId).build(), requestOptions)

    /** @see [complete] */
    fun complete(
        accountTransferId: String,
        params: AccountTransferCompleteParams = AccountTransferCompleteParams.none(),
    ): CompletableFuture<AccountTransfer> =
        complete(accountTransferId, params, RequestOptions.none())

    /** @see [complete] */
    fun complete(
        params: AccountTransferCompleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccountTransfer>

    /** @see [complete] */
    fun complete(params: AccountTransferCompleteParams): CompletableFuture<AccountTransfer> =
        complete(params, RequestOptions.none())

    /** @see [complete] */
    fun complete(
        accountTransferId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<AccountTransfer> =
        complete(accountTransferId, AccountTransferCompleteParams.none(), requestOptions)

    /**
     * A view of [AccountTransferServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post
         * /simulations/account_transfers/{account_transfer_id}/complete`, but is otherwise the same
         * as [AccountTransferServiceAsync.complete].
         */
        @MustBeClosed
        fun complete(
            accountTransferId: String
        ): CompletableFuture<HttpResponseFor<AccountTransfer>> =
            complete(accountTransferId, AccountTransferCompleteParams.none())

        /** @see [complete] */
        @MustBeClosed
        fun complete(
            accountTransferId: String,
            params: AccountTransferCompleteParams = AccountTransferCompleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccountTransfer>> =
            complete(
                params.toBuilder().accountTransferId(accountTransferId).build(),
                requestOptions,
            )

        /** @see [complete] */
        @MustBeClosed
        fun complete(
            accountTransferId: String,
            params: AccountTransferCompleteParams = AccountTransferCompleteParams.none(),
        ): CompletableFuture<HttpResponseFor<AccountTransfer>> =
            complete(accountTransferId, params, RequestOptions.none())

        /** @see [complete] */
        @MustBeClosed
        fun complete(
            params: AccountTransferCompleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccountTransfer>>

        /** @see [complete] */
        @MustBeClosed
        fun complete(
            params: AccountTransferCompleteParams
        ): CompletableFuture<HttpResponseFor<AccountTransfer>> =
            complete(params, RequestOptions.none())

        /** @see [complete] */
        @MustBeClosed
        fun complete(
            accountTransferId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AccountTransfer>> =
            complete(accountTransferId, AccountTransferCompleteParams.none(), requestOptions)
    }
}
