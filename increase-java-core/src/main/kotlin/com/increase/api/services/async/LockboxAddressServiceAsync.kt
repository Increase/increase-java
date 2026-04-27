// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.lockboxaddresses.LockboxAddress
import com.increase.api.models.lockboxaddresses.LockboxAddressCreateParams
import com.increase.api.models.lockboxaddresses.LockboxAddressListPageAsync
import com.increase.api.models.lockboxaddresses.LockboxAddressListParams
import com.increase.api.models.lockboxaddresses.LockboxAddressRetrieveParams
import com.increase.api.models.lockboxaddresses.LockboxAddressUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface LockboxAddressServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): LockboxAddressServiceAsync

    /** Create a Lockbox Address */
    fun create(): CompletableFuture<LockboxAddress> = create(LockboxAddressCreateParams.none())

    /** @see create */
    fun create(
        params: LockboxAddressCreateParams = LockboxAddressCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LockboxAddress>

    /** @see create */
    fun create(
        params: LockboxAddressCreateParams = LockboxAddressCreateParams.none()
    ): CompletableFuture<LockboxAddress> = create(params, RequestOptions.none())

    /** @see create */
    fun create(requestOptions: RequestOptions): CompletableFuture<LockboxAddress> =
        create(LockboxAddressCreateParams.none(), requestOptions)

    /** Retrieve a Lockbox Address */
    fun retrieve(lockboxAddressId: String): CompletableFuture<LockboxAddress> =
        retrieve(lockboxAddressId, LockboxAddressRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        lockboxAddressId: String,
        params: LockboxAddressRetrieveParams = LockboxAddressRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LockboxAddress> =
        retrieve(params.toBuilder().lockboxAddressId(lockboxAddressId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        lockboxAddressId: String,
        params: LockboxAddressRetrieveParams = LockboxAddressRetrieveParams.none(),
    ): CompletableFuture<LockboxAddress> = retrieve(lockboxAddressId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: LockboxAddressRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LockboxAddress>

    /** @see retrieve */
    fun retrieve(params: LockboxAddressRetrieveParams): CompletableFuture<LockboxAddress> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        lockboxAddressId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<LockboxAddress> =
        retrieve(lockboxAddressId, LockboxAddressRetrieveParams.none(), requestOptions)

    /** Update a Lockbox Address */
    fun update(lockboxAddressId: String): CompletableFuture<LockboxAddress> =
        update(lockboxAddressId, LockboxAddressUpdateParams.none())

    /** @see update */
    fun update(
        lockboxAddressId: String,
        params: LockboxAddressUpdateParams = LockboxAddressUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LockboxAddress> =
        update(params.toBuilder().lockboxAddressId(lockboxAddressId).build(), requestOptions)

    /** @see update */
    fun update(
        lockboxAddressId: String,
        params: LockboxAddressUpdateParams = LockboxAddressUpdateParams.none(),
    ): CompletableFuture<LockboxAddress> = update(lockboxAddressId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: LockboxAddressUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LockboxAddress>

    /** @see update */
    fun update(params: LockboxAddressUpdateParams): CompletableFuture<LockboxAddress> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        lockboxAddressId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<LockboxAddress> =
        update(lockboxAddressId, LockboxAddressUpdateParams.none(), requestOptions)

    /** List Lockbox Addresses */
    fun list(): CompletableFuture<LockboxAddressListPageAsync> =
        list(LockboxAddressListParams.none())

    /** @see list */
    fun list(
        params: LockboxAddressListParams = LockboxAddressListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LockboxAddressListPageAsync>

    /** @see list */
    fun list(
        params: LockboxAddressListParams = LockboxAddressListParams.none()
    ): CompletableFuture<LockboxAddressListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<LockboxAddressListPageAsync> =
        list(LockboxAddressListParams.none(), requestOptions)

    /**
     * A view of [LockboxAddressServiceAsync] that provides access to raw HTTP responses for each
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
        ): LockboxAddressServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /lockbox_addresses`, but is otherwise the same as
         * [LockboxAddressServiceAsync.create].
         */
        fun create(): CompletableFuture<HttpResponseFor<LockboxAddress>> =
            create(LockboxAddressCreateParams.none())

        /** @see create */
        fun create(
            params: LockboxAddressCreateParams = LockboxAddressCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LockboxAddress>>

        /** @see create */
        fun create(
            params: LockboxAddressCreateParams = LockboxAddressCreateParams.none()
        ): CompletableFuture<HttpResponseFor<LockboxAddress>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<LockboxAddress>> =
            create(LockboxAddressCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /lockbox_addresses/{lockbox_address_id}`, but is
         * otherwise the same as [LockboxAddressServiceAsync.retrieve].
         */
        fun retrieve(lockboxAddressId: String): CompletableFuture<HttpResponseFor<LockboxAddress>> =
            retrieve(lockboxAddressId, LockboxAddressRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            lockboxAddressId: String,
            params: LockboxAddressRetrieveParams = LockboxAddressRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LockboxAddress>> =
            retrieve(params.toBuilder().lockboxAddressId(lockboxAddressId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            lockboxAddressId: String,
            params: LockboxAddressRetrieveParams = LockboxAddressRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<LockboxAddress>> =
            retrieve(lockboxAddressId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: LockboxAddressRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LockboxAddress>>

        /** @see retrieve */
        fun retrieve(
            params: LockboxAddressRetrieveParams
        ): CompletableFuture<HttpResponseFor<LockboxAddress>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            lockboxAddressId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LockboxAddress>> =
            retrieve(lockboxAddressId, LockboxAddressRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /lockbox_addresses/{lockbox_address_id}`, but is
         * otherwise the same as [LockboxAddressServiceAsync.update].
         */
        fun update(lockboxAddressId: String): CompletableFuture<HttpResponseFor<LockboxAddress>> =
            update(lockboxAddressId, LockboxAddressUpdateParams.none())

        /** @see update */
        fun update(
            lockboxAddressId: String,
            params: LockboxAddressUpdateParams = LockboxAddressUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LockboxAddress>> =
            update(params.toBuilder().lockboxAddressId(lockboxAddressId).build(), requestOptions)

        /** @see update */
        fun update(
            lockboxAddressId: String,
            params: LockboxAddressUpdateParams = LockboxAddressUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<LockboxAddress>> =
            update(lockboxAddressId, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: LockboxAddressUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LockboxAddress>>

        /** @see update */
        fun update(
            params: LockboxAddressUpdateParams
        ): CompletableFuture<HttpResponseFor<LockboxAddress>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            lockboxAddressId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LockboxAddress>> =
            update(lockboxAddressId, LockboxAddressUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /lockbox_addresses`, but is otherwise the same as
         * [LockboxAddressServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<LockboxAddressListPageAsync>> =
            list(LockboxAddressListParams.none())

        /** @see list */
        fun list(
            params: LockboxAddressListParams = LockboxAddressListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LockboxAddressListPageAsync>>

        /** @see list */
        fun list(
            params: LockboxAddressListParams = LockboxAddressListParams.none()
        ): CompletableFuture<HttpResponseFor<LockboxAddressListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<LockboxAddressListPageAsync>> =
            list(LockboxAddressListParams.none(), requestOptions)
    }
}
