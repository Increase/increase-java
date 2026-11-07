// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.checkbookchecks.CheckbookCheck
import com.increase.api.models.checkbookchecks.CheckbookCheckListPageAsync
import com.increase.api.models.checkbookchecks.CheckbookCheckListParams
import com.increase.api.models.checkbookchecks.CheckbookCheckRetrieveParams
import com.increase.api.models.checkbookchecks.CheckbookCheckStopParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface CheckbookCheckServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CheckbookCheckServiceAsync

    /** Retrieve a Checkbook Check */
    fun retrieve(checkbookCheckId: String): CompletableFuture<CheckbookCheck> =
        retrieve(checkbookCheckId, CheckbookCheckRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        checkbookCheckId: String,
        params: CheckbookCheckRetrieveParams = CheckbookCheckRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CheckbookCheck> =
        retrieve(params.toBuilder().checkbookCheckId(checkbookCheckId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        checkbookCheckId: String,
        params: CheckbookCheckRetrieveParams = CheckbookCheckRetrieveParams.none(),
    ): CompletableFuture<CheckbookCheck> = retrieve(checkbookCheckId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: CheckbookCheckRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CheckbookCheck>

    /** @see retrieve */
    fun retrieve(params: CheckbookCheckRetrieveParams): CompletableFuture<CheckbookCheck> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        checkbookCheckId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CheckbookCheck> =
        retrieve(checkbookCheckId, CheckbookCheckRetrieveParams.none(), requestOptions)

    /** List Checkbook Checks */
    fun list(): CompletableFuture<CheckbookCheckListPageAsync> =
        list(CheckbookCheckListParams.none())

    /** @see list */
    fun list(
        params: CheckbookCheckListParams = CheckbookCheckListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CheckbookCheckListPageAsync>

    /** @see list */
    fun list(
        params: CheckbookCheckListParams = CheckbookCheckListParams.none()
    ): CompletableFuture<CheckbookCheckListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<CheckbookCheckListPageAsync> =
        list(CheckbookCheckListParams.none(), requestOptions)

    /** Stop a Checkbook Check. A stopped check cannot be deposited. */
    fun stop(checkbookCheckId: String): CompletableFuture<CheckbookCheck> =
        stop(checkbookCheckId, CheckbookCheckStopParams.none())

    /** @see stop */
    fun stop(
        checkbookCheckId: String,
        params: CheckbookCheckStopParams = CheckbookCheckStopParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CheckbookCheck> =
        stop(params.toBuilder().checkbookCheckId(checkbookCheckId).build(), requestOptions)

    /** @see stop */
    fun stop(
        checkbookCheckId: String,
        params: CheckbookCheckStopParams = CheckbookCheckStopParams.none(),
    ): CompletableFuture<CheckbookCheck> = stop(checkbookCheckId, params, RequestOptions.none())

    /** @see stop */
    fun stop(
        params: CheckbookCheckStopParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CheckbookCheck>

    /** @see stop */
    fun stop(params: CheckbookCheckStopParams): CompletableFuture<CheckbookCheck> =
        stop(params, RequestOptions.none())

    /** @see stop */
    fun stop(
        checkbookCheckId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CheckbookCheck> =
        stop(checkbookCheckId, CheckbookCheckStopParams.none(), requestOptions)

    /**
     * A view of [CheckbookCheckServiceAsync] that provides access to raw HTTP responses for each
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
        ): CheckbookCheckServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /checkbook_checks/{checkbook_check_id}`, but is
         * otherwise the same as [CheckbookCheckServiceAsync.retrieve].
         */
        fun retrieve(checkbookCheckId: String): CompletableFuture<HttpResponseFor<CheckbookCheck>> =
            retrieve(checkbookCheckId, CheckbookCheckRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            checkbookCheckId: String,
            params: CheckbookCheckRetrieveParams = CheckbookCheckRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CheckbookCheck>> =
            retrieve(params.toBuilder().checkbookCheckId(checkbookCheckId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            checkbookCheckId: String,
            params: CheckbookCheckRetrieveParams = CheckbookCheckRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<CheckbookCheck>> =
            retrieve(checkbookCheckId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: CheckbookCheckRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CheckbookCheck>>

        /** @see retrieve */
        fun retrieve(
            params: CheckbookCheckRetrieveParams
        ): CompletableFuture<HttpResponseFor<CheckbookCheck>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            checkbookCheckId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CheckbookCheck>> =
            retrieve(checkbookCheckId, CheckbookCheckRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /checkbook_checks`, but is otherwise the same as
         * [CheckbookCheckServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<CheckbookCheckListPageAsync>> =
            list(CheckbookCheckListParams.none())

        /** @see list */
        fun list(
            params: CheckbookCheckListParams = CheckbookCheckListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CheckbookCheckListPageAsync>>

        /** @see list */
        fun list(
            params: CheckbookCheckListParams = CheckbookCheckListParams.none()
        ): CompletableFuture<HttpResponseFor<CheckbookCheckListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<CheckbookCheckListPageAsync>> =
            list(CheckbookCheckListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /checkbook_checks/{checkbook_check_id}/stop`, but
         * is otherwise the same as [CheckbookCheckServiceAsync.stop].
         */
        fun stop(checkbookCheckId: String): CompletableFuture<HttpResponseFor<CheckbookCheck>> =
            stop(checkbookCheckId, CheckbookCheckStopParams.none())

        /** @see stop */
        fun stop(
            checkbookCheckId: String,
            params: CheckbookCheckStopParams = CheckbookCheckStopParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CheckbookCheck>> =
            stop(params.toBuilder().checkbookCheckId(checkbookCheckId).build(), requestOptions)

        /** @see stop */
        fun stop(
            checkbookCheckId: String,
            params: CheckbookCheckStopParams = CheckbookCheckStopParams.none(),
        ): CompletableFuture<HttpResponseFor<CheckbookCheck>> =
            stop(checkbookCheckId, params, RequestOptions.none())

        /** @see stop */
        fun stop(
            params: CheckbookCheckStopParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CheckbookCheck>>

        /** @see stop */
        fun stop(
            params: CheckbookCheckStopParams
        ): CompletableFuture<HttpResponseFor<CheckbookCheck>> = stop(params, RequestOptions.none())

        /** @see stop */
        fun stop(
            checkbookCheckId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CheckbookCheck>> =
            stop(checkbookCheckId, CheckbookCheckStopParams.none(), requestOptions)
    }
}
