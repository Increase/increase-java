// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.google.errorprone.annotations.MustBeClosed
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

interface AccountTransferServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create an Account Transfer */
    fun create(params: AccountTransferCreateParams): CompletableFuture<AccountTransfer> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: AccountTransferCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccountTransfer>

    /** Retrieve an Account Transfer */
    fun retrieve(params: AccountTransferRetrieveParams): CompletableFuture<AccountTransfer> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: AccountTransferRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccountTransfer>

    /** List Account Transfers */
    fun list(): CompletableFuture<AccountTransferListPageAsync> =
        list(AccountTransferListParams.none())

    /** @see [list] */
    fun list(
        params: AccountTransferListParams = AccountTransferListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccountTransferListPageAsync>

    /** @see [list] */
    fun list(
        params: AccountTransferListParams = AccountTransferListParams.none()
    ): CompletableFuture<AccountTransferListPageAsync> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<AccountTransferListPageAsync> =
        list(AccountTransferListParams.none(), requestOptions)

    /** Approve an Account Transfer */
    fun approve(params: AccountTransferApproveParams): CompletableFuture<AccountTransfer> =
        approve(params, RequestOptions.none())

    /** @see [approve] */
    fun approve(
        params: AccountTransferApproveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccountTransfer>

    /** Cancel an Account Transfer */
    fun cancel(params: AccountTransferCancelParams): CompletableFuture<AccountTransfer> =
        cancel(params, RequestOptions.none())

    /** @see [cancel] */
    fun cancel(
        params: AccountTransferCancelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccountTransfer>

    /**
     * A view of [AccountTransferServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /account_transfers`, but is otherwise the same as
         * [AccountTransferServiceAsync.create].
         */
        @MustBeClosed
        fun create(
            params: AccountTransferCreateParams
        ): CompletableFuture<HttpResponseFor<AccountTransfer>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: AccountTransferCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccountTransfer>>

        /**
         * Returns a raw HTTP response for `get /account_transfers/{account_transfer_id}`, but is
         * otherwise the same as [AccountTransferServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: AccountTransferRetrieveParams
        ): CompletableFuture<HttpResponseFor<AccountTransfer>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: AccountTransferRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccountTransfer>>

        /**
         * Returns a raw HTTP response for `get /account_transfers`, but is otherwise the same as
         * [AccountTransferServiceAsync.list].
         */
        @MustBeClosed
        fun list(): CompletableFuture<HttpResponseFor<AccountTransferListPageAsync>> =
            list(AccountTransferListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: AccountTransferListParams = AccountTransferListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccountTransferListPageAsync>>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: AccountTransferListParams = AccountTransferListParams.none()
        ): CompletableFuture<HttpResponseFor<AccountTransferListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<AccountTransferListPageAsync>> =
            list(AccountTransferListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /account_transfers/{account_transfer_id}/approve`,
         * but is otherwise the same as [AccountTransferServiceAsync.approve].
         */
        @MustBeClosed
        fun approve(
            params: AccountTransferApproveParams
        ): CompletableFuture<HttpResponseFor<AccountTransfer>> =
            approve(params, RequestOptions.none())

        /** @see [approve] */
        @MustBeClosed
        fun approve(
            params: AccountTransferApproveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccountTransfer>>

        /**
         * Returns a raw HTTP response for `post /account_transfers/{account_transfer_id}/cancel`,
         * but is otherwise the same as [AccountTransferServiceAsync.cancel].
         */
        @MustBeClosed
        fun cancel(
            params: AccountTransferCancelParams
        ): CompletableFuture<HttpResponseFor<AccountTransfer>> =
            cancel(params, RequestOptions.none())

        /** @see [cancel] */
        @MustBeClosed
        fun cancel(
            params: AccountTransferCancelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccountTransfer>>
    }
}
