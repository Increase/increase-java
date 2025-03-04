// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.Lockbox
import com.increase.api.models.LockboxCreateParams
import com.increase.api.models.LockboxListPageAsync
import com.increase.api.models.LockboxListParams
import com.increase.api.models.LockboxRetrieveParams
import com.increase.api.models.LockboxUpdateParams
import java.util.concurrent.CompletableFuture

interface LockboxServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create a Lockbox */
    @JvmOverloads
    fun create(
        params: LockboxCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Lockbox>

    /** Retrieve a Lockbox */
    @JvmOverloads
    fun retrieve(
        params: LockboxRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Lockbox>

    /** Update a Lockbox */
    @JvmOverloads
    fun update(
        params: LockboxUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Lockbox>

    /** List Lockboxes */
    @JvmOverloads
    fun list(
        params: LockboxListParams = LockboxListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LockboxListPageAsync>

    /** List Lockboxes */
    fun list(requestOptions: RequestOptions): CompletableFuture<LockboxListPageAsync> =
        list(LockboxListParams.none(), requestOptions)

    /**
     * A view of [LockboxServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /lockboxes`, but is otherwise the same as
         * [LockboxServiceAsync.create].
         */
        @JvmOverloads
        @MustBeClosed
        fun create(
            params: LockboxCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Lockbox>>

        /**
         * Returns a raw HTTP response for `get /lockboxes/{lockbox_id}`, but is otherwise the same
         * as [LockboxServiceAsync.retrieve].
         */
        @JvmOverloads
        @MustBeClosed
        fun retrieve(
            params: LockboxRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Lockbox>>

        /**
         * Returns a raw HTTP response for `patch /lockboxes/{lockbox_id}`, but is otherwise the
         * same as [LockboxServiceAsync.update].
         */
        @JvmOverloads
        @MustBeClosed
        fun update(
            params: LockboxUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Lockbox>>

        /**
         * Returns a raw HTTP response for `get /lockboxes`, but is otherwise the same as
         * [LockboxServiceAsync.list].
         */
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: LockboxListParams = LockboxListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LockboxListPageAsync>>

        /**
         * Returns a raw HTTP response for `get /lockboxes`, but is otherwise the same as
         * [LockboxServiceAsync.list].
         */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<LockboxListPageAsync>> =
            list(LockboxListParams.none(), requestOptions)
    }
}
