// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.lockboxes.Lockbox
import com.increase.api.models.lockboxes.LockboxCreateParams
import com.increase.api.models.lockboxes.LockboxListPageAsync
import com.increase.api.models.lockboxes.LockboxListParams
import com.increase.api.models.lockboxes.LockboxRetrieveParams
import com.increase.api.models.lockboxes.LockboxUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface LockboxServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): LockboxServiceAsync

    /** Create a Lockbox */
    fun create(params: LockboxCreateParams): CompletableFuture<Lockbox> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: LockboxCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Lockbox>

    /** Retrieve a Lockbox */
    fun retrieve(lockboxId: String): CompletableFuture<Lockbox> =
        retrieve(lockboxId, LockboxRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        lockboxId: String,
        params: LockboxRetrieveParams = LockboxRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Lockbox> =
        retrieve(params.toBuilder().lockboxId(lockboxId).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        lockboxId: String,
        params: LockboxRetrieveParams = LockboxRetrieveParams.none(),
    ): CompletableFuture<Lockbox> = retrieve(lockboxId, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: LockboxRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Lockbox>

    /** @see [retrieve] */
    fun retrieve(params: LockboxRetrieveParams): CompletableFuture<Lockbox> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(lockboxId: String, requestOptions: RequestOptions): CompletableFuture<Lockbox> =
        retrieve(lockboxId, LockboxRetrieveParams.none(), requestOptions)

    /** Update a Lockbox */
    fun update(lockboxId: String): CompletableFuture<Lockbox> =
        update(lockboxId, LockboxUpdateParams.none())

    /** @see [update] */
    fun update(
        lockboxId: String,
        params: LockboxUpdateParams = LockboxUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Lockbox> =
        update(params.toBuilder().lockboxId(lockboxId).build(), requestOptions)

    /** @see [update] */
    fun update(
        lockboxId: String,
        params: LockboxUpdateParams = LockboxUpdateParams.none(),
    ): CompletableFuture<Lockbox> = update(lockboxId, params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: LockboxUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Lockbox>

    /** @see [update] */
    fun update(params: LockboxUpdateParams): CompletableFuture<Lockbox> =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(lockboxId: String, requestOptions: RequestOptions): CompletableFuture<Lockbox> =
        update(lockboxId, LockboxUpdateParams.none(), requestOptions)

    /** List Lockboxes */
    fun list(): CompletableFuture<LockboxListPageAsync> = list(LockboxListParams.none())

    /** @see [list] */
    fun list(
        params: LockboxListParams = LockboxListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LockboxListPageAsync>

    /** @see [list] */
    fun list(
        params: LockboxListParams = LockboxListParams.none()
    ): CompletableFuture<LockboxListPageAsync> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<LockboxListPageAsync> =
        list(LockboxListParams.none(), requestOptions)

    /**
     * A view of [LockboxServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): LockboxServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /lockboxes`, but is otherwise the same as
         * [LockboxServiceAsync.create].
         */
        fun create(params: LockboxCreateParams): CompletableFuture<HttpResponseFor<Lockbox>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        fun create(
            params: LockboxCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Lockbox>>

        /**
         * Returns a raw HTTP response for `get /lockboxes/{lockbox_id}`, but is otherwise the same
         * as [LockboxServiceAsync.retrieve].
         */
        fun retrieve(lockboxId: String): CompletableFuture<HttpResponseFor<Lockbox>> =
            retrieve(lockboxId, LockboxRetrieveParams.none())

        /** @see [retrieve] */
        fun retrieve(
            lockboxId: String,
            params: LockboxRetrieveParams = LockboxRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Lockbox>> =
            retrieve(params.toBuilder().lockboxId(lockboxId).build(), requestOptions)

        /** @see [retrieve] */
        fun retrieve(
            lockboxId: String,
            params: LockboxRetrieveParams = LockboxRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<Lockbox>> =
            retrieve(lockboxId, params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            params: LockboxRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Lockbox>>

        /** @see [retrieve] */
        fun retrieve(params: LockboxRetrieveParams): CompletableFuture<HttpResponseFor<Lockbox>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            lockboxId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Lockbox>> =
            retrieve(lockboxId, LockboxRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /lockboxes/{lockbox_id}`, but is otherwise the
         * same as [LockboxServiceAsync.update].
         */
        fun update(lockboxId: String): CompletableFuture<HttpResponseFor<Lockbox>> =
            update(lockboxId, LockboxUpdateParams.none())

        /** @see [update] */
        fun update(
            lockboxId: String,
            params: LockboxUpdateParams = LockboxUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Lockbox>> =
            update(params.toBuilder().lockboxId(lockboxId).build(), requestOptions)

        /** @see [update] */
        fun update(
            lockboxId: String,
            params: LockboxUpdateParams = LockboxUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<Lockbox>> =
            update(lockboxId, params, RequestOptions.none())

        /** @see [update] */
        fun update(
            params: LockboxUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Lockbox>>

        /** @see [update] */
        fun update(params: LockboxUpdateParams): CompletableFuture<HttpResponseFor<Lockbox>> =
            update(params, RequestOptions.none())

        /** @see [update] */
        fun update(
            lockboxId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Lockbox>> =
            update(lockboxId, LockboxUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /lockboxes`, but is otherwise the same as
         * [LockboxServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<LockboxListPageAsync>> =
            list(LockboxListParams.none())

        /** @see [list] */
        fun list(
            params: LockboxListParams = LockboxListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LockboxListPageAsync>>

        /** @see [list] */
        fun list(
            params: LockboxListParams = LockboxListParams.none()
        ): CompletableFuture<HttpResponseFor<LockboxListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<LockboxListPageAsync>> =
            list(LockboxListParams.none(), requestOptions)
    }
}
