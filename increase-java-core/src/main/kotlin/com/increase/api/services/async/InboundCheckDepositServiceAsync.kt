// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.inboundcheckdeposits.InboundCheckDeposit
import com.increase.api.models.inboundcheckdeposits.InboundCheckDepositDeclineParams
import com.increase.api.models.inboundcheckdeposits.InboundCheckDepositListPageAsync
import com.increase.api.models.inboundcheckdeposits.InboundCheckDepositListParams
import com.increase.api.models.inboundcheckdeposits.InboundCheckDepositRetrieveParams
import com.increase.api.models.inboundcheckdeposits.InboundCheckDepositReturnParams
import java.util.concurrent.CompletableFuture

interface InboundCheckDepositServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Retrieve an Inbound Check Deposit */
    fun retrieve(
        params: InboundCheckDepositRetrieveParams
    ): CompletableFuture<InboundCheckDeposit> = retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: InboundCheckDepositRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InboundCheckDeposit>

    /** List Inbound Check Deposits */
    fun list(): CompletableFuture<InboundCheckDepositListPageAsync> =
        list(InboundCheckDepositListParams.none())

    /** @see [list] */
    fun list(
        params: InboundCheckDepositListParams = InboundCheckDepositListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InboundCheckDepositListPageAsync>

    /** @see [list] */
    fun list(
        params: InboundCheckDepositListParams = InboundCheckDepositListParams.none()
    ): CompletableFuture<InboundCheckDepositListPageAsync> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<InboundCheckDepositListPageAsync> =
        list(InboundCheckDepositListParams.none(), requestOptions)

    /** Decline an Inbound Check Deposit */
    fun decline(params: InboundCheckDepositDeclineParams): CompletableFuture<InboundCheckDeposit> =
        decline(params, RequestOptions.none())

    /** @see [decline] */
    fun decline(
        params: InboundCheckDepositDeclineParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InboundCheckDeposit>

    /** Return an Inbound Check Deposit */
    fun return_(params: InboundCheckDepositReturnParams): CompletableFuture<InboundCheckDeposit> =
        return_(params, RequestOptions.none())

    /** @see [return_] */
    fun return_(
        params: InboundCheckDepositReturnParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InboundCheckDeposit>

    /**
     * A view of [InboundCheckDepositServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /inbound_check_deposits/{inbound_check_deposit_id}`,
         * but is otherwise the same as [InboundCheckDepositServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: InboundCheckDepositRetrieveParams
        ): CompletableFuture<HttpResponseFor<InboundCheckDeposit>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: InboundCheckDepositRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InboundCheckDeposit>>

        /**
         * Returns a raw HTTP response for `get /inbound_check_deposits`, but is otherwise the same
         * as [InboundCheckDepositServiceAsync.list].
         */
        @MustBeClosed
        fun list(): CompletableFuture<HttpResponseFor<InboundCheckDepositListPageAsync>> =
            list(InboundCheckDepositListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: InboundCheckDepositListParams = InboundCheckDepositListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InboundCheckDepositListPageAsync>>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: InboundCheckDepositListParams = InboundCheckDepositListParams.none()
        ): CompletableFuture<HttpResponseFor<InboundCheckDepositListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<InboundCheckDepositListPageAsync>> =
            list(InboundCheckDepositListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /inbound_check_deposits/{inbound_check_deposit_id}/decline`, but is otherwise the same as
         * [InboundCheckDepositServiceAsync.decline].
         */
        @MustBeClosed
        fun decline(
            params: InboundCheckDepositDeclineParams
        ): CompletableFuture<HttpResponseFor<InboundCheckDeposit>> =
            decline(params, RequestOptions.none())

        /** @see [decline] */
        @MustBeClosed
        fun decline(
            params: InboundCheckDepositDeclineParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InboundCheckDeposit>>

        /**
         * Returns a raw HTTP response for `post
         * /inbound_check_deposits/{inbound_check_deposit_id}/return`, but is otherwise the same as
         * [InboundCheckDepositServiceAsync.return_].
         */
        @MustBeClosed
        fun return_(
            params: InboundCheckDepositReturnParams
        ): CompletableFuture<HttpResponseFor<InboundCheckDeposit>> =
            return_(params, RequestOptions.none())

        /** @see [return_] */
        @MustBeClosed
        fun return_(
            params: InboundCheckDepositReturnParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InboundCheckDeposit>>
    }
}
