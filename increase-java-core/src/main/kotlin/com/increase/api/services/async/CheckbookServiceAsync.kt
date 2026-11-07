// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.checkbooks.Checkbook
import com.increase.api.models.checkbooks.CheckbookCreateParams
import com.increase.api.models.checkbooks.CheckbookListPageAsync
import com.increase.api.models.checkbooks.CheckbookListParams
import com.increase.api.models.checkbooks.CheckbookRetrieveParams
import com.increase.api.models.checkbooks.CheckbookStopParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface CheckbookServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CheckbookServiceAsync

    /** Create a Checkbook */
    fun create(params: CheckbookCreateParams): CompletableFuture<Checkbook> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: CheckbookCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Checkbook>

    /** Retrieve a Checkbook */
    fun retrieve(checkbookId: String): CompletableFuture<Checkbook> =
        retrieve(checkbookId, CheckbookRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        checkbookId: String,
        params: CheckbookRetrieveParams = CheckbookRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Checkbook> =
        retrieve(params.toBuilder().checkbookId(checkbookId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        checkbookId: String,
        params: CheckbookRetrieveParams = CheckbookRetrieveParams.none(),
    ): CompletableFuture<Checkbook> = retrieve(checkbookId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: CheckbookRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Checkbook>

    /** @see retrieve */
    fun retrieve(params: CheckbookRetrieveParams): CompletableFuture<Checkbook> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        checkbookId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<Checkbook> =
        retrieve(checkbookId, CheckbookRetrieveParams.none(), requestOptions)

    /** List Checkbooks */
    fun list(): CompletableFuture<CheckbookListPageAsync> = list(CheckbookListParams.none())

    /** @see list */
    fun list(
        params: CheckbookListParams = CheckbookListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CheckbookListPageAsync>

    /** @see list */
    fun list(
        params: CheckbookListParams = CheckbookListParams.none()
    ): CompletableFuture<CheckbookListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<CheckbookListPageAsync> =
        list(CheckbookListParams.none(), requestOptions)

    /**
     * Stop a Checkbook. Stopping a Checkbook stops all of its checks that have not yet been
     * deposited.
     */
    fun stop(checkbookId: String): CompletableFuture<Checkbook> =
        stop(checkbookId, CheckbookStopParams.none())

    /** @see stop */
    fun stop(
        checkbookId: String,
        params: CheckbookStopParams = CheckbookStopParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Checkbook> =
        stop(params.toBuilder().checkbookId(checkbookId).build(), requestOptions)

    /** @see stop */
    fun stop(
        checkbookId: String,
        params: CheckbookStopParams = CheckbookStopParams.none(),
    ): CompletableFuture<Checkbook> = stop(checkbookId, params, RequestOptions.none())

    /** @see stop */
    fun stop(
        params: CheckbookStopParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Checkbook>

    /** @see stop */
    fun stop(params: CheckbookStopParams): CompletableFuture<Checkbook> =
        stop(params, RequestOptions.none())

    /** @see stop */
    fun stop(checkbookId: String, requestOptions: RequestOptions): CompletableFuture<Checkbook> =
        stop(checkbookId, CheckbookStopParams.none(), requestOptions)

    /**
     * A view of [CheckbookServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CheckbookServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /checkbooks`, but is otherwise the same as
         * [CheckbookServiceAsync.create].
         */
        fun create(params: CheckbookCreateParams): CompletableFuture<HttpResponseFor<Checkbook>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: CheckbookCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Checkbook>>

        /**
         * Returns a raw HTTP response for `get /checkbooks/{checkbook_id}`, but is otherwise the
         * same as [CheckbookServiceAsync.retrieve].
         */
        fun retrieve(checkbookId: String): CompletableFuture<HttpResponseFor<Checkbook>> =
            retrieve(checkbookId, CheckbookRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            checkbookId: String,
            params: CheckbookRetrieveParams = CheckbookRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Checkbook>> =
            retrieve(params.toBuilder().checkbookId(checkbookId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            checkbookId: String,
            params: CheckbookRetrieveParams = CheckbookRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<Checkbook>> =
            retrieve(checkbookId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: CheckbookRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Checkbook>>

        /** @see retrieve */
        fun retrieve(
            params: CheckbookRetrieveParams
        ): CompletableFuture<HttpResponseFor<Checkbook>> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            checkbookId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Checkbook>> =
            retrieve(checkbookId, CheckbookRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /checkbooks`, but is otherwise the same as
         * [CheckbookServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<CheckbookListPageAsync>> =
            list(CheckbookListParams.none())

        /** @see list */
        fun list(
            params: CheckbookListParams = CheckbookListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CheckbookListPageAsync>>

        /** @see list */
        fun list(
            params: CheckbookListParams = CheckbookListParams.none()
        ): CompletableFuture<HttpResponseFor<CheckbookListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<CheckbookListPageAsync>> =
            list(CheckbookListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /checkbooks/{checkbook_id}/stop`, but is otherwise
         * the same as [CheckbookServiceAsync.stop].
         */
        fun stop(checkbookId: String): CompletableFuture<HttpResponseFor<Checkbook>> =
            stop(checkbookId, CheckbookStopParams.none())

        /** @see stop */
        fun stop(
            checkbookId: String,
            params: CheckbookStopParams = CheckbookStopParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Checkbook>> =
            stop(params.toBuilder().checkbookId(checkbookId).build(), requestOptions)

        /** @see stop */
        fun stop(
            checkbookId: String,
            params: CheckbookStopParams = CheckbookStopParams.none(),
        ): CompletableFuture<HttpResponseFor<Checkbook>> =
            stop(checkbookId, params, RequestOptions.none())

        /** @see stop */
        fun stop(
            params: CheckbookStopParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Checkbook>>

        /** @see stop */
        fun stop(params: CheckbookStopParams): CompletableFuture<HttpResponseFor<Checkbook>> =
            stop(params, RequestOptions.none())

        /** @see stop */
        fun stop(
            checkbookId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Checkbook>> =
            stop(checkbookId, CheckbookStopParams.none(), requestOptions)
    }
}
