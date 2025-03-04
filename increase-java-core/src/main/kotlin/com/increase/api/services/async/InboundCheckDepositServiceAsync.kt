// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.InboundCheckDeposit
import com.increase.api.models.InboundCheckDepositDeclineParams
import com.increase.api.models.InboundCheckDepositListPageAsync
import com.increase.api.models.InboundCheckDepositListParams
import com.increase.api.models.InboundCheckDepositRetrieveParams
import com.increase.api.models.InboundCheckDepositReturnParams
import java.util.concurrent.CompletableFuture

interface InboundCheckDepositServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Retrieve an Inbound Check Deposit */
    @JvmOverloads
    fun retrieve(
        params: InboundCheckDepositRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InboundCheckDeposit>

    /** List Inbound Check Deposits */
    @JvmOverloads
    fun list(
        params: InboundCheckDepositListParams = InboundCheckDepositListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InboundCheckDepositListPageAsync>

    /** List Inbound Check Deposits */
    fun list(requestOptions: RequestOptions): CompletableFuture<InboundCheckDepositListPageAsync> =
        list(InboundCheckDepositListParams.none(), requestOptions)

    /** Decline an Inbound Check Deposit */
    @JvmOverloads
    fun decline(
        params: InboundCheckDepositDeclineParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InboundCheckDeposit>

    /** Return an Inbound Check Deposit */
    @JvmOverloads
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
        @JvmOverloads
        @MustBeClosed
        fun retrieve(
            params: InboundCheckDepositRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InboundCheckDeposit>>

        /**
         * Returns a raw HTTP response for `get /inbound_check_deposits`, but is otherwise the same
         * as [InboundCheckDepositServiceAsync.list].
         */
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: InboundCheckDepositListParams = InboundCheckDepositListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InboundCheckDepositListPageAsync>>

        /**
         * Returns a raw HTTP response for `get /inbound_check_deposits`, but is otherwise the same
         * as [InboundCheckDepositServiceAsync.list].
         */
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
        @JvmOverloads
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
        @JvmOverloads
        @MustBeClosed
        fun return_(
            params: InboundCheckDepositReturnParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InboundCheckDeposit>>
    }
}
