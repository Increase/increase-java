// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking.simulations

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.accounttransfers.AccountTransfer
import com.increase.api.models.simulations.accounttransfers.AccountTransferCompleteParams
import java.util.function.Consumer

interface AccountTransferService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AccountTransferService

    /**
     * If your account is configured to require approval for each transfer, this endpoint simulates
     * the approval of an [Account Transfer](#account-transfers). You can also approve sandbox
     * Account Transfers in the dashboard. This transfer must first have a `status` of
     * `pending_approval`.
     */
    fun complete(accountTransferId: String): AccountTransfer =
        complete(accountTransferId, AccountTransferCompleteParams.none())

    /** @see [complete] */
    fun complete(
        accountTransferId: String,
        params: AccountTransferCompleteParams = AccountTransferCompleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountTransfer =
        complete(params.toBuilder().accountTransferId(accountTransferId).build(), requestOptions)

    /** @see [complete] */
    fun complete(
        accountTransferId: String,
        params: AccountTransferCompleteParams = AccountTransferCompleteParams.none(),
    ): AccountTransfer = complete(accountTransferId, params, RequestOptions.none())

    /** @see [complete] */
    fun complete(
        params: AccountTransferCompleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountTransfer

    /** @see [complete] */
    fun complete(params: AccountTransferCompleteParams): AccountTransfer =
        complete(params, RequestOptions.none())

    /** @see [complete] */
    fun complete(accountTransferId: String, requestOptions: RequestOptions): AccountTransfer =
        complete(accountTransferId, AccountTransferCompleteParams.none(), requestOptions)

    /**
     * A view of [AccountTransferService] that provides access to raw HTTP responses for each
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
        ): AccountTransferService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /simulations/account_transfers/{account_transfer_id}/complete`, but is otherwise the same
         * as [AccountTransferService.complete].
         */
        @MustBeClosed
        fun complete(accountTransferId: String): HttpResponseFor<AccountTransfer> =
            complete(accountTransferId, AccountTransferCompleteParams.none())

        /** @see [complete] */
        @MustBeClosed
        fun complete(
            accountTransferId: String,
            params: AccountTransferCompleteParams = AccountTransferCompleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountTransfer> =
            complete(
                params.toBuilder().accountTransferId(accountTransferId).build(),
                requestOptions,
            )

        /** @see [complete] */
        @MustBeClosed
        fun complete(
            accountTransferId: String,
            params: AccountTransferCompleteParams = AccountTransferCompleteParams.none(),
        ): HttpResponseFor<AccountTransfer> =
            complete(accountTransferId, params, RequestOptions.none())

        /** @see [complete] */
        @MustBeClosed
        fun complete(
            params: AccountTransferCompleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountTransfer>

        /** @see [complete] */
        @MustBeClosed
        fun complete(params: AccountTransferCompleteParams): HttpResponseFor<AccountTransfer> =
            complete(params, RequestOptions.none())

        /** @see [complete] */
        @MustBeClosed
        fun complete(
            accountTransferId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AccountTransfer> =
            complete(accountTransferId, AccountTransferCompleteParams.none(), requestOptions)
    }
}
