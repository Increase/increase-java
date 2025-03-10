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
    fun retrieve(params: AccountTransferRetrieveParams): AccountTransfer =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: AccountTransferRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountTransfer

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
    fun approve(params: AccountTransferApproveParams): AccountTransfer =
        approve(params, RequestOptions.none())

    /** @see [approve] */
    fun approve(
        params: AccountTransferApproveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountTransfer

    /** Cancel an Account Transfer */
    fun cancel(params: AccountTransferCancelParams): AccountTransfer =
        cancel(params, RequestOptions.none())

    /** @see [cancel] */
    fun cancel(
        params: AccountTransferCancelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountTransfer

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
        fun retrieve(params: AccountTransferRetrieveParams): HttpResponseFor<AccountTransfer> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: AccountTransferRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountTransfer>

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
        fun approve(params: AccountTransferApproveParams): HttpResponseFor<AccountTransfer> =
            approve(params, RequestOptions.none())

        /** @see [approve] */
        @MustBeClosed
        fun approve(
            params: AccountTransferApproveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountTransfer>

        /**
         * Returns a raw HTTP response for `post /account_transfers/{account_transfer_id}/cancel`,
         * but is otherwise the same as [AccountTransferService.cancel].
         */
        @MustBeClosed
        fun cancel(params: AccountTransferCancelParams): HttpResponseFor<AccountTransfer> =
            cancel(params, RequestOptions.none())

        /** @see [cancel] */
        @MustBeClosed
        fun cancel(
            params: AccountTransferCancelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountTransfer>
    }
}
