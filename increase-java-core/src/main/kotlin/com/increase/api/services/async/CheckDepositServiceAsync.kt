// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.CheckDeposit
import com.increase.api.models.CheckDepositCreateParams
import com.increase.api.models.CheckDepositListPageAsync
import com.increase.api.models.CheckDepositListParams
import com.increase.api.models.CheckDepositRetrieveParams
import java.util.concurrent.CompletableFuture

interface CheckDepositServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create a Check Deposit */
    fun create(params: CheckDepositCreateParams): CompletableFuture<CheckDeposit> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: CheckDepositCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CheckDeposit>

    /** Retrieve a Check Deposit */
    fun retrieve(params: CheckDepositRetrieveParams): CompletableFuture<CheckDeposit> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: CheckDepositRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CheckDeposit>

    /** List Check Deposits */
    fun list(): CompletableFuture<CheckDepositListPageAsync> = list(CheckDepositListParams.none())

    /** @see [list] */
    fun list(
        params: CheckDepositListParams = CheckDepositListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CheckDepositListPageAsync>

    /** @see [list] */
    fun list(
        params: CheckDepositListParams = CheckDepositListParams.none()
    ): CompletableFuture<CheckDepositListPageAsync> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<CheckDepositListPageAsync> =
        list(CheckDepositListParams.none(), requestOptions)

    /**
     * A view of [CheckDepositServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /check_deposits`, but is otherwise the same as
         * [CheckDepositServiceAsync.create].
         */
        @MustBeClosed
        fun create(
            params: CheckDepositCreateParams
        ): CompletableFuture<HttpResponseFor<CheckDeposit>> = create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: CheckDepositCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CheckDeposit>>

        /**
         * Returns a raw HTTP response for `get /check_deposits/{check_deposit_id}`, but is
         * otherwise the same as [CheckDepositServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: CheckDepositRetrieveParams
        ): CompletableFuture<HttpResponseFor<CheckDeposit>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: CheckDepositRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CheckDeposit>>

        /**
         * Returns a raw HTTP response for `get /check_deposits`, but is otherwise the same as
         * [CheckDepositServiceAsync.list].
         */
        @MustBeClosed
        fun list(): CompletableFuture<HttpResponseFor<CheckDepositListPageAsync>> =
            list(CheckDepositListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: CheckDepositListParams = CheckDepositListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CheckDepositListPageAsync>>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: CheckDepositListParams = CheckDepositListParams.none()
        ): CompletableFuture<HttpResponseFor<CheckDepositListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<CheckDepositListPageAsync>> =
            list(CheckDepositListParams.none(), requestOptions)
    }
}
