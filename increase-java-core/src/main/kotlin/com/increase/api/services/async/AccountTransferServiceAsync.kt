// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.AccountTransfer
import com.increase.api.models.AccountTransferApproveParams
import com.increase.api.models.AccountTransferCancelParams
import com.increase.api.models.AccountTransferCreateParams
import com.increase.api.models.AccountTransferListPageAsync
import com.increase.api.models.AccountTransferListParams
import com.increase.api.models.AccountTransferRetrieveParams
import java.util.concurrent.CompletableFuture

interface AccountTransferServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create an Account Transfer */
    @JvmOverloads
    fun create(
        params: AccountTransferCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccountTransfer>

    /** Retrieve an Account Transfer */
    @JvmOverloads
    fun retrieve(
        params: AccountTransferRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccountTransfer>

    /** List Account Transfers */
    @JvmOverloads
    fun list(
        params: AccountTransferListParams = AccountTransferListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccountTransferListPageAsync>

    /** List Account Transfers */
    fun list(requestOptions: RequestOptions): CompletableFuture<AccountTransferListPageAsync> =
        list(AccountTransferListParams.none(), requestOptions)

    /** Approve an Account Transfer */
    @JvmOverloads
    fun approve(
        params: AccountTransferApproveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccountTransfer>

    /** Cancel an Account Transfer */
    @JvmOverloads
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
        @JvmOverloads
        @MustBeClosed
        fun create(
            params: AccountTransferCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccountTransfer>>

        /**
         * Returns a raw HTTP response for `get /account_transfers/{account_transfer_id}`, but is
         * otherwise the same as [AccountTransferServiceAsync.retrieve].
         */
        @JvmOverloads
        @MustBeClosed
        fun retrieve(
            params: AccountTransferRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccountTransfer>>

        /**
         * Returns a raw HTTP response for `get /account_transfers`, but is otherwise the same as
         * [AccountTransferServiceAsync.list].
         */
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: AccountTransferListParams = AccountTransferListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccountTransferListPageAsync>>

        /**
         * Returns a raw HTTP response for `get /account_transfers`, but is otherwise the same as
         * [AccountTransferServiceAsync.list].
         */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<AccountTransferListPageAsync>> =
            list(AccountTransferListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /account_transfers/{account_transfer_id}/approve`,
         * but is otherwise the same as [AccountTransferServiceAsync.approve].
         */
        @JvmOverloads
        @MustBeClosed
        fun approve(
            params: AccountTransferApproveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccountTransfer>>

        /**
         * Returns a raw HTTP response for `post /account_transfers/{account_transfer_id}/cancel`,
         * but is otherwise the same as [AccountTransferServiceAsync.cancel].
         */
        @JvmOverloads
        @MustBeClosed
        fun cancel(
            params: AccountTransferCancelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccountTransfer>>
    }
}
