// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.lockboxes.Lockbox
import com.increase.api.models.lockboxes.LockboxCreateParams
import com.increase.api.models.lockboxes.LockboxListPageAsync
import com.increase.api.models.lockboxes.LockboxListParams
import com.increase.api.models.lockboxes.LockboxRetrieveParams
import com.increase.api.models.lockboxes.LockboxUpdateParams
import java.util.concurrent.CompletableFuture

interface LockboxServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for
     * each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create a Lockbox */
    fun create(params: LockboxCreateParams): CompletableFuture<Lockbox> =
        create(
          params, RequestOptions.none()
        )

    /** @see [create] */
    fun create(params: LockboxCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Lockbox>

    /** Retrieve a Lockbox */
    fun retrieve(params: LockboxRetrieveParams): CompletableFuture<Lockbox> =
        retrieve(
          params, RequestOptions.none()
        )

    /** @see [retrieve] */
    fun retrieve(params: LockboxRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Lockbox>

    /** Update a Lockbox */
    fun update(params: LockboxUpdateParams): CompletableFuture<Lockbox> =
        update(
          params, RequestOptions.none()
        )

    /** @see [update] */
    fun update(params: LockboxUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Lockbox>

    /** List Lockboxes */
    fun list(): CompletableFuture<LockboxListPageAsync> = list(LockboxListParams.none())

    /** @see [list] */
    fun list(params: LockboxListParams = LockboxListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<LockboxListPageAsync>

    /** @see [list] */
    fun list(params: LockboxListParams = LockboxListParams.none()): CompletableFuture<LockboxListPageAsync> =
        list(
          params, RequestOptions.none()
        )

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<LockboxListPageAsync> = list(LockboxListParams.none(), requestOptions)

    /**
     * A view of [LockboxServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /lockboxes`, but is otherwise the same as
         * [LockboxServiceAsync.create].
         */
        @MustBeClosed
        fun create(params: LockboxCreateParams): CompletableFuture<HttpResponseFor<Lockbox>> =
            create(
              params, RequestOptions.none()
            )

        /** @see [create] */
        @MustBeClosed
        fun create(params: LockboxCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<Lockbox>>

        /**
         * Returns a raw HTTP response for `get /lockboxes/{lockbox_id}`, but is otherwise
         * the same as [LockboxServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(params: LockboxRetrieveParams): CompletableFuture<HttpResponseFor<Lockbox>> =
            retrieve(
              params, RequestOptions.none()
            )

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(params: LockboxRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<Lockbox>>

        /**
         * Returns a raw HTTP response for `patch /lockboxes/{lockbox_id}`, but is
         * otherwise the same as [LockboxServiceAsync.update].
         */
        @MustBeClosed
        fun update(params: LockboxUpdateParams): CompletableFuture<HttpResponseFor<Lockbox>> =
            update(
              params, RequestOptions.none()
            )

        /** @see [update] */
        @MustBeClosed
        fun update(params: LockboxUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<Lockbox>>

        /**
         * Returns a raw HTTP response for `get /lockboxes`, but is otherwise the same as
         * [LockboxServiceAsync.list].
         */
        @MustBeClosed
        fun list(): CompletableFuture<HttpResponseFor<LockboxListPageAsync>> = list(LockboxListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(params: LockboxListParams = LockboxListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<LockboxListPageAsync>>

        /** @see [list] */
        @MustBeClosed
        fun list(params: LockboxListParams = LockboxListParams.none()): CompletableFuture<HttpResponseFor<LockboxListPageAsync>> =
            list(
              params, RequestOptions.none()
            )

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<LockboxListPageAsync>> = list(LockboxListParams.none(), requestOptions)
    }
}
