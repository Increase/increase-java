// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.accounttransfers.AccountTransfer
import com.increase.api.models.accounttransfers.AccountTransferApproveParams
import com.increase.api.models.accounttransfers.AccountTransferCancelParams
import com.increase.api.models.accounttransfers.AccountTransferCreateParams
import com.increase.api.models.accounttransfers.AccountTransferListPage
import com.increase.api.models.accounttransfers.AccountTransferListParams
import com.increase.api.models.accounttransfers.AccountTransferRetrieveParams

interface AccountTransferService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create an Account Transfer */
    fun create(params: AccountTransferCreateParams): AccountTransfer =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: AccountTransferCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountTransfer

    /** Retrieve an Account Transfer */
    fun retrieve(accountTransferId: String): AccountTransfer =
        retrieve(accountTransferId, AccountTransferRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        accountTransferId: String,
        params: AccountTransferRetrieveParams = AccountTransferRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountTransfer =
        retrieve(params.toBuilder().accountTransferId(accountTransferId).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        accountTransferId: String,
        params: AccountTransferRetrieveParams = AccountTransferRetrieveParams.none(),
    ): AccountTransfer = retrieve(accountTransferId, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: AccountTransferRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountTransfer

    /** @see [retrieve] */
    fun retrieve(params: AccountTransferRetrieveParams): AccountTransfer =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(accountTransferId: String, requestOptions: RequestOptions): AccountTransfer =
        retrieve(accountTransferId, AccountTransferRetrieveParams.none(), requestOptions)

    /** List Account Transfers */
    fun list(): AccountTransferListPage = list(AccountTransferListParams.none())

    /** @see [list] */
    fun list(
        params: AccountTransferListParams = AccountTransferListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountTransferListPage

    /** @see [list] */
    fun list(
        params: AccountTransferListParams = AccountTransferListParams.none()
    ): AccountTransferListPage = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): AccountTransferListPage =
        list(AccountTransferListParams.none(), requestOptions)

    /** Approve an Account Transfer */
    fun approve(accountTransferId: String): AccountTransfer =
        approve(accountTransferId, AccountTransferApproveParams.none())

    /** @see [approve] */
    fun approve(
        accountTransferId: String,
        params: AccountTransferApproveParams = AccountTransferApproveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountTransfer =
        approve(params.toBuilder().accountTransferId(accountTransferId).build(), requestOptions)

    /** @see [approve] */
    fun approve(
        accountTransferId: String,
        params: AccountTransferApproveParams = AccountTransferApproveParams.none(),
    ): AccountTransfer = approve(accountTransferId, params, RequestOptions.none())

    /** @see [approve] */
    fun approve(
        params: AccountTransferApproveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountTransfer

    /** @see [approve] */
    fun approve(params: AccountTransferApproveParams): AccountTransfer =
        approve(params, RequestOptions.none())

    /** @see [approve] */
    fun approve(accountTransferId: String, requestOptions: RequestOptions): AccountTransfer =
        approve(accountTransferId, AccountTransferApproveParams.none(), requestOptions)

    /** Cancel an Account Transfer */
    fun cancel(accountTransferId: String): AccountTransfer =
        cancel(accountTransferId, AccountTransferCancelParams.none())

    /** @see [cancel] */
    fun cancel(
        accountTransferId: String,
        params: AccountTransferCancelParams = AccountTransferCancelParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountTransfer =
        cancel(params.toBuilder().accountTransferId(accountTransferId).build(), requestOptions)

    /** @see [cancel] */
    fun cancel(
        accountTransferId: String,
        params: AccountTransferCancelParams = AccountTransferCancelParams.none(),
    ): AccountTransfer = cancel(accountTransferId, params, RequestOptions.none())

    /** @see [cancel] */
    fun cancel(
        params: AccountTransferCancelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountTransfer

    /** @see [cancel] */
    fun cancel(params: AccountTransferCancelParams): AccountTransfer =
        cancel(params, RequestOptions.none())

    /** @see [cancel] */
    fun cancel(accountTransferId: String, requestOptions: RequestOptions): AccountTransfer =
        cancel(accountTransferId, AccountTransferCancelParams.none(), requestOptions)

    /**
     * A view of [AccountTransferService] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /account_transfers`, but is otherwise the same as
         * [AccountTransferService.create].
         */
        @MustBeClosed
        fun create(params: AccountTransferCreateParams): HttpResponseFor<AccountTransfer> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: AccountTransferCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountTransfer>

        /**
         * Returns a raw HTTP response for `get /account_transfers/{account_transfer_id}`, but is
         * otherwise the same as [AccountTransferService.retrieve].
         */
        @MustBeClosed
        fun retrieve(accountTransferId: String): HttpResponseFor<AccountTransfer> =
            retrieve(accountTransferId, AccountTransferRetrieveParams.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            accountTransferId: String,
            params: AccountTransferRetrieveParams = AccountTransferRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountTransfer> =
            retrieve(
                params.toBuilder().accountTransferId(accountTransferId).build(),
                requestOptions,
            )

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            accountTransferId: String,
            params: AccountTransferRetrieveParams = AccountTransferRetrieveParams.none(),
        ): HttpResponseFor<AccountTransfer> =
            retrieve(accountTransferId, params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: AccountTransferRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountTransfer>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(params: AccountTransferRetrieveParams): HttpResponseFor<AccountTransfer> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            accountTransferId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AccountTransfer> =
            retrieve(accountTransferId, AccountTransferRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /account_transfers`, but is otherwise the same as
         * [AccountTransferService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<AccountTransferListPage> =
            list(AccountTransferListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: AccountTransferListParams = AccountTransferListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountTransferListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: AccountTransferListParams = AccountTransferListParams.none()
        ): HttpResponseFor<AccountTransferListPage> = list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<AccountTransferListPage> =
            list(AccountTransferListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /account_transfers/{account_transfer_id}/approve`,
         * but is otherwise the same as [AccountTransferService.approve].
         */
        @MustBeClosed
        fun approve(accountTransferId: String): HttpResponseFor<AccountTransfer> =
            approve(accountTransferId, AccountTransferApproveParams.none())

        /** @see [approve] */
        @MustBeClosed
        fun approve(
            accountTransferId: String,
            params: AccountTransferApproveParams = AccountTransferApproveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountTransfer> =
            approve(params.toBuilder().accountTransferId(accountTransferId).build(), requestOptions)

        /** @see [approve] */
        @MustBeClosed
        fun approve(
            accountTransferId: String,
            params: AccountTransferApproveParams = AccountTransferApproveParams.none(),
        ): HttpResponseFor<AccountTransfer> =
            approve(accountTransferId, params, RequestOptions.none())

        /** @see [approve] */
        @MustBeClosed
        fun approve(
            params: AccountTransferApproveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountTransfer>

        /** @see [approve] */
        @MustBeClosed
        fun approve(params: AccountTransferApproveParams): HttpResponseFor<AccountTransfer> =
            approve(params, RequestOptions.none())

        /** @see [approve] */
        @MustBeClosed
        fun approve(
            accountTransferId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AccountTransfer> =
            approve(accountTransferId, AccountTransferApproveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /account_transfers/{account_transfer_id}/cancel`,
         * but is otherwise the same as [AccountTransferService.cancel].
         */
        @MustBeClosed
        fun cancel(accountTransferId: String): HttpResponseFor<AccountTransfer> =
            cancel(accountTransferId, AccountTransferCancelParams.none())

        /** @see [cancel] */
        @MustBeClosed
        fun cancel(
            accountTransferId: String,
            params: AccountTransferCancelParams = AccountTransferCancelParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountTransfer> =
            cancel(params.toBuilder().accountTransferId(accountTransferId).build(), requestOptions)

        /** @see [cancel] */
        @MustBeClosed
        fun cancel(
            accountTransferId: String,
            params: AccountTransferCancelParams = AccountTransferCancelParams.none(),
        ): HttpResponseFor<AccountTransfer> =
            cancel(accountTransferId, params, RequestOptions.none())

        /** @see [cancel] */
        @MustBeClosed
        fun cancel(
            params: AccountTransferCancelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountTransfer>

        /** @see [cancel] */
        @MustBeClosed
        fun cancel(params: AccountTransferCancelParams): HttpResponseFor<AccountTransfer> =
            cancel(params, RequestOptions.none())

        /** @see [cancel] */
        @MustBeClosed
        fun cancel(
            accountTransferId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AccountTransfer> =
            cancel(accountTransferId, AccountTransferCancelParams.none(), requestOptions)
    }
}
