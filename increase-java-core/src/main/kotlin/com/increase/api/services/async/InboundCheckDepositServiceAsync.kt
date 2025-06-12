// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.inboundcheckdeposits.InboundCheckDeposit
import com.increase.api.models.inboundcheckdeposits.InboundCheckDepositDeclineParams
import com.increase.api.models.inboundcheckdeposits.InboundCheckDepositListPageAsync
import com.increase.api.models.inboundcheckdeposits.InboundCheckDepositListParams
import com.increase.api.models.inboundcheckdeposits.InboundCheckDepositRetrieveParams
import com.increase.api.models.inboundcheckdeposits.InboundCheckDepositReturnParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface InboundCheckDepositServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): InboundCheckDepositServiceAsync

    /** Retrieve an Inbound Check Deposit */
    fun retrieve(inboundCheckDepositId: String): CompletableFuture<InboundCheckDeposit> =
        retrieve(inboundCheckDepositId, InboundCheckDepositRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        inboundCheckDepositId: String,
        params: InboundCheckDepositRetrieveParams = InboundCheckDepositRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InboundCheckDeposit> =
        retrieve(
            params.toBuilder().inboundCheckDepositId(inboundCheckDepositId).build(),
            requestOptions,
        )

    /** @see [retrieve] */
    fun retrieve(
        inboundCheckDepositId: String,
        params: InboundCheckDepositRetrieveParams = InboundCheckDepositRetrieveParams.none(),
    ): CompletableFuture<InboundCheckDeposit> =
        retrieve(inboundCheckDepositId, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: InboundCheckDepositRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InboundCheckDeposit>

    /** @see [retrieve] */
    fun retrieve(
        params: InboundCheckDepositRetrieveParams
    ): CompletableFuture<InboundCheckDeposit> = retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        inboundCheckDepositId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<InboundCheckDeposit> =
        retrieve(inboundCheckDepositId, InboundCheckDepositRetrieveParams.none(), requestOptions)

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
    fun decline(inboundCheckDepositId: String): CompletableFuture<InboundCheckDeposit> =
        decline(inboundCheckDepositId, InboundCheckDepositDeclineParams.none())

    /** @see [decline] */
    fun decline(
        inboundCheckDepositId: String,
        params: InboundCheckDepositDeclineParams = InboundCheckDepositDeclineParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InboundCheckDeposit> =
        decline(
            params.toBuilder().inboundCheckDepositId(inboundCheckDepositId).build(),
            requestOptions,
        )

    /** @see [decline] */
    fun decline(
        inboundCheckDepositId: String,
        params: InboundCheckDepositDeclineParams = InboundCheckDepositDeclineParams.none(),
    ): CompletableFuture<InboundCheckDeposit> =
        decline(inboundCheckDepositId, params, RequestOptions.none())

    /** @see [decline] */
    fun decline(
        params: InboundCheckDepositDeclineParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InboundCheckDeposit>

    /** @see [decline] */
    fun decline(params: InboundCheckDepositDeclineParams): CompletableFuture<InboundCheckDeposit> =
        decline(params, RequestOptions.none())

    /** @see [decline] */
    fun decline(
        inboundCheckDepositId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<InboundCheckDeposit> =
        decline(inboundCheckDepositId, InboundCheckDepositDeclineParams.none(), requestOptions)

    /** Return an Inbound Check Deposit */
    fun return_(
        inboundCheckDepositId: String,
        params: InboundCheckDepositReturnParams,
    ): CompletableFuture<InboundCheckDeposit> =
        return_(inboundCheckDepositId, params, RequestOptions.none())

    /** @see [return_] */
    fun return_(
        inboundCheckDepositId: String,
        params: InboundCheckDepositReturnParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InboundCheckDeposit> =
        return_(
            params.toBuilder().inboundCheckDepositId(inboundCheckDepositId).build(),
            requestOptions,
        )

    /** @see [return_] */
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
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): InboundCheckDepositServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /inbound_check_deposits/{inbound_check_deposit_id}`,
         * but is otherwise the same as [InboundCheckDepositServiceAsync.retrieve].
         */
        fun retrieve(
            inboundCheckDepositId: String
        ): CompletableFuture<HttpResponseFor<InboundCheckDeposit>> =
            retrieve(inboundCheckDepositId, InboundCheckDepositRetrieveParams.none())

        /** @see [retrieve] */
        fun retrieve(
            inboundCheckDepositId: String,
            params: InboundCheckDepositRetrieveParams = InboundCheckDepositRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InboundCheckDeposit>> =
            retrieve(
                params.toBuilder().inboundCheckDepositId(inboundCheckDepositId).build(),
                requestOptions,
            )

        /** @see [retrieve] */
        fun retrieve(
            inboundCheckDepositId: String,
            params: InboundCheckDepositRetrieveParams = InboundCheckDepositRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<InboundCheckDeposit>> =
            retrieve(inboundCheckDepositId, params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            params: InboundCheckDepositRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InboundCheckDeposit>>

        /** @see [retrieve] */
        fun retrieve(
            params: InboundCheckDepositRetrieveParams
        ): CompletableFuture<HttpResponseFor<InboundCheckDeposit>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            inboundCheckDepositId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InboundCheckDeposit>> =
            retrieve(
                inboundCheckDepositId,
                InboundCheckDepositRetrieveParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /inbound_check_deposits`, but is otherwise the same
         * as [InboundCheckDepositServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<InboundCheckDepositListPageAsync>> =
            list(InboundCheckDepositListParams.none())

        /** @see [list] */
        fun list(
            params: InboundCheckDepositListParams = InboundCheckDepositListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InboundCheckDepositListPageAsync>>

        /** @see [list] */
        fun list(
            params: InboundCheckDepositListParams = InboundCheckDepositListParams.none()
        ): CompletableFuture<HttpResponseFor<InboundCheckDepositListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<InboundCheckDepositListPageAsync>> =
            list(InboundCheckDepositListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /inbound_check_deposits/{inbound_check_deposit_id}/decline`, but is otherwise the same as
         * [InboundCheckDepositServiceAsync.decline].
         */
        fun decline(
            inboundCheckDepositId: String
        ): CompletableFuture<HttpResponseFor<InboundCheckDeposit>> =
            decline(inboundCheckDepositId, InboundCheckDepositDeclineParams.none())

        /** @see [decline] */
        fun decline(
            inboundCheckDepositId: String,
            params: InboundCheckDepositDeclineParams = InboundCheckDepositDeclineParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InboundCheckDeposit>> =
            decline(
                params.toBuilder().inboundCheckDepositId(inboundCheckDepositId).build(),
                requestOptions,
            )

        /** @see [decline] */
        fun decline(
            inboundCheckDepositId: String,
            params: InboundCheckDepositDeclineParams = InboundCheckDepositDeclineParams.none(),
        ): CompletableFuture<HttpResponseFor<InboundCheckDeposit>> =
            decline(inboundCheckDepositId, params, RequestOptions.none())

        /** @see [decline] */
        fun decline(
            params: InboundCheckDepositDeclineParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InboundCheckDeposit>>

        /** @see [decline] */
        fun decline(
            params: InboundCheckDepositDeclineParams
        ): CompletableFuture<HttpResponseFor<InboundCheckDeposit>> =
            decline(params, RequestOptions.none())

        /** @see [decline] */
        fun decline(
            inboundCheckDepositId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InboundCheckDeposit>> =
            decline(inboundCheckDepositId, InboundCheckDepositDeclineParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /inbound_check_deposits/{inbound_check_deposit_id}/return`, but is otherwise the same as
         * [InboundCheckDepositServiceAsync.return_].
         */
        fun return_(
            inboundCheckDepositId: String,
            params: InboundCheckDepositReturnParams,
        ): CompletableFuture<HttpResponseFor<InboundCheckDeposit>> =
            return_(inboundCheckDepositId, params, RequestOptions.none())

        /** @see [return_] */
        fun return_(
            inboundCheckDepositId: String,
            params: InboundCheckDepositReturnParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InboundCheckDeposit>> =
            return_(
                params.toBuilder().inboundCheckDepositId(inboundCheckDepositId).build(),
                requestOptions,
            )

        /** @see [return_] */
        fun return_(
            params: InboundCheckDepositReturnParams
        ): CompletableFuture<HttpResponseFor<InboundCheckDeposit>> =
            return_(params, RequestOptions.none())

        /** @see [return_] */
        fun return_(
            params: InboundCheckDepositReturnParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InboundCheckDeposit>>
    }
}
