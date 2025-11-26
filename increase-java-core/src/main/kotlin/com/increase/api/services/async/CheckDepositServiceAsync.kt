// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.checkdeposits.CheckDeposit
import com.increase.api.models.checkdeposits.CheckDepositCreateParams
import com.increase.api.models.checkdeposits.CheckDepositListParams
import com.increase.api.models.checkdeposits.CheckDepositListResponse
import com.increase.api.models.checkdeposits.CheckDepositRetrieveParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface CheckDepositServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CheckDepositServiceAsync

    /** Create a Check Deposit */
    fun create(params: CheckDepositCreateParams): CompletableFuture<CheckDeposit> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: CheckDepositCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CheckDeposit>

    /** Retrieve a Check Deposit */
    fun retrieve(checkDepositId: String): CompletableFuture<CheckDeposit> =
        retrieve(checkDepositId, CheckDepositRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        checkDepositId: String,
        params: CheckDepositRetrieveParams = CheckDepositRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CheckDeposit> =
        retrieve(params.toBuilder().checkDepositId(checkDepositId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        checkDepositId: String,
        params: CheckDepositRetrieveParams = CheckDepositRetrieveParams.none(),
    ): CompletableFuture<CheckDeposit> = retrieve(checkDepositId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: CheckDepositRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CheckDeposit>

    /** @see retrieve */
    fun retrieve(params: CheckDepositRetrieveParams): CompletableFuture<CheckDeposit> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        checkDepositId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CheckDeposit> =
        retrieve(checkDepositId, CheckDepositRetrieveParams.none(), requestOptions)

    /** List Check Deposits */
    fun list(): CompletableFuture<CheckDepositListResponse> = list(CheckDepositListParams.none())

    /** @see list */
    fun list(
        params: CheckDepositListParams = CheckDepositListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CheckDepositListResponse>

    /** @see list */
    fun list(
        params: CheckDepositListParams = CheckDepositListParams.none()
    ): CompletableFuture<CheckDepositListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<CheckDepositListResponse> =
        list(CheckDepositListParams.none(), requestOptions)

    /**
     * A view of [CheckDepositServiceAsync] that provides access to raw HTTP responses for each
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
        ): CheckDepositServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /check_deposits`, but is otherwise the same as
         * [CheckDepositServiceAsync.create].
         */
        fun create(
            params: CheckDepositCreateParams
        ): CompletableFuture<HttpResponseFor<CheckDeposit>> = create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: CheckDepositCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CheckDeposit>>

        /**
         * Returns a raw HTTP response for `get /check_deposits/{check_deposit_id}`, but is
         * otherwise the same as [CheckDepositServiceAsync.retrieve].
         */
        fun retrieve(checkDepositId: String): CompletableFuture<HttpResponseFor<CheckDeposit>> =
            retrieve(checkDepositId, CheckDepositRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            checkDepositId: String,
            params: CheckDepositRetrieveParams = CheckDepositRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CheckDeposit>> =
            retrieve(params.toBuilder().checkDepositId(checkDepositId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            checkDepositId: String,
            params: CheckDepositRetrieveParams = CheckDepositRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<CheckDeposit>> =
            retrieve(checkDepositId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: CheckDepositRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CheckDeposit>>

        /** @see retrieve */
        fun retrieve(
            params: CheckDepositRetrieveParams
        ): CompletableFuture<HttpResponseFor<CheckDeposit>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            checkDepositId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CheckDeposit>> =
            retrieve(checkDepositId, CheckDepositRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /check_deposits`, but is otherwise the same as
         * [CheckDepositServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<CheckDepositListResponse>> =
            list(CheckDepositListParams.none())

        /** @see list */
        fun list(
            params: CheckDepositListParams = CheckDepositListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CheckDepositListResponse>>

        /** @see list */
        fun list(
            params: CheckDepositListParams = CheckDepositListParams.none()
        ): CompletableFuture<HttpResponseFor<CheckDepositListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<CheckDepositListResponse>> =
            list(CheckDepositListParams.none(), requestOptions)
    }
}
