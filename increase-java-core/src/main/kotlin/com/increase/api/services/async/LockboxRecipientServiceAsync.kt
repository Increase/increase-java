// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.lockboxrecipients.LockboxRecipient
import com.increase.api.models.lockboxrecipients.LockboxRecipientCreateParams
import com.increase.api.models.lockboxrecipients.LockboxRecipientListPageAsync
import com.increase.api.models.lockboxrecipients.LockboxRecipientListParams
import com.increase.api.models.lockboxrecipients.LockboxRecipientRetrieveParams
import com.increase.api.models.lockboxrecipients.LockboxRecipientUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface LockboxRecipientServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): LockboxRecipientServiceAsync

    /** Create a Lockbox Recipient */
    fun create(params: LockboxRecipientCreateParams): CompletableFuture<LockboxRecipient> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: LockboxRecipientCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LockboxRecipient>

    /** Retrieve a Lockbox Recipient */
    fun retrieve(lockboxRecipientId: String): CompletableFuture<LockboxRecipient> =
        retrieve(lockboxRecipientId, LockboxRecipientRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        lockboxRecipientId: String,
        params: LockboxRecipientRetrieveParams = LockboxRecipientRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LockboxRecipient> =
        retrieve(params.toBuilder().lockboxRecipientId(lockboxRecipientId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        lockboxRecipientId: String,
        params: LockboxRecipientRetrieveParams = LockboxRecipientRetrieveParams.none(),
    ): CompletableFuture<LockboxRecipient> =
        retrieve(lockboxRecipientId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: LockboxRecipientRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LockboxRecipient>

    /** @see retrieve */
    fun retrieve(params: LockboxRecipientRetrieveParams): CompletableFuture<LockboxRecipient> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        lockboxRecipientId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<LockboxRecipient> =
        retrieve(lockboxRecipientId, LockboxRecipientRetrieveParams.none(), requestOptions)

    /** Update a Lockbox Recipient */
    fun update(lockboxRecipientId: String): CompletableFuture<LockboxRecipient> =
        update(lockboxRecipientId, LockboxRecipientUpdateParams.none())

    /** @see update */
    fun update(
        lockboxRecipientId: String,
        params: LockboxRecipientUpdateParams = LockboxRecipientUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LockboxRecipient> =
        update(params.toBuilder().lockboxRecipientId(lockboxRecipientId).build(), requestOptions)

    /** @see update */
    fun update(
        lockboxRecipientId: String,
        params: LockboxRecipientUpdateParams = LockboxRecipientUpdateParams.none(),
    ): CompletableFuture<LockboxRecipient> =
        update(lockboxRecipientId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: LockboxRecipientUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LockboxRecipient>

    /** @see update */
    fun update(params: LockboxRecipientUpdateParams): CompletableFuture<LockboxRecipient> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        lockboxRecipientId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<LockboxRecipient> =
        update(lockboxRecipientId, LockboxRecipientUpdateParams.none(), requestOptions)

    /** List Lockbox Recipients */
    fun list(): CompletableFuture<LockboxRecipientListPageAsync> =
        list(LockboxRecipientListParams.none())

    /** @see list */
    fun list(
        params: LockboxRecipientListParams = LockboxRecipientListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LockboxRecipientListPageAsync>

    /** @see list */
    fun list(
        params: LockboxRecipientListParams = LockboxRecipientListParams.none()
    ): CompletableFuture<LockboxRecipientListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<LockboxRecipientListPageAsync> =
        list(LockboxRecipientListParams.none(), requestOptions)

    /**
     * A view of [LockboxRecipientServiceAsync] that provides access to raw HTTP responses for each
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
        ): LockboxRecipientServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /lockbox_recipients`, but is otherwise the same as
         * [LockboxRecipientServiceAsync.create].
         */
        fun create(
            params: LockboxRecipientCreateParams
        ): CompletableFuture<HttpResponseFor<LockboxRecipient>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: LockboxRecipientCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LockboxRecipient>>

        /**
         * Returns a raw HTTP response for `get /lockbox_recipients/{lockbox_recipient_id}`, but is
         * otherwise the same as [LockboxRecipientServiceAsync.retrieve].
         */
        fun retrieve(
            lockboxRecipientId: String
        ): CompletableFuture<HttpResponseFor<LockboxRecipient>> =
            retrieve(lockboxRecipientId, LockboxRecipientRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            lockboxRecipientId: String,
            params: LockboxRecipientRetrieveParams = LockboxRecipientRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LockboxRecipient>> =
            retrieve(
                params.toBuilder().lockboxRecipientId(lockboxRecipientId).build(),
                requestOptions,
            )

        /** @see retrieve */
        fun retrieve(
            lockboxRecipientId: String,
            params: LockboxRecipientRetrieveParams = LockboxRecipientRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<LockboxRecipient>> =
            retrieve(lockboxRecipientId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: LockboxRecipientRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LockboxRecipient>>

        /** @see retrieve */
        fun retrieve(
            params: LockboxRecipientRetrieveParams
        ): CompletableFuture<HttpResponseFor<LockboxRecipient>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            lockboxRecipientId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LockboxRecipient>> =
            retrieve(lockboxRecipientId, LockboxRecipientRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /lockbox_recipients/{lockbox_recipient_id}`, but
         * is otherwise the same as [LockboxRecipientServiceAsync.update].
         */
        fun update(
            lockboxRecipientId: String
        ): CompletableFuture<HttpResponseFor<LockboxRecipient>> =
            update(lockboxRecipientId, LockboxRecipientUpdateParams.none())

        /** @see update */
        fun update(
            lockboxRecipientId: String,
            params: LockboxRecipientUpdateParams = LockboxRecipientUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LockboxRecipient>> =
            update(
                params.toBuilder().lockboxRecipientId(lockboxRecipientId).build(),
                requestOptions,
            )

        /** @see update */
        fun update(
            lockboxRecipientId: String,
            params: LockboxRecipientUpdateParams = LockboxRecipientUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<LockboxRecipient>> =
            update(lockboxRecipientId, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: LockboxRecipientUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LockboxRecipient>>

        /** @see update */
        fun update(
            params: LockboxRecipientUpdateParams
        ): CompletableFuture<HttpResponseFor<LockboxRecipient>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            lockboxRecipientId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LockboxRecipient>> =
            update(lockboxRecipientId, LockboxRecipientUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /lockbox_recipients`, but is otherwise the same as
         * [LockboxRecipientServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<LockboxRecipientListPageAsync>> =
            list(LockboxRecipientListParams.none())

        /** @see list */
        fun list(
            params: LockboxRecipientListParams = LockboxRecipientListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LockboxRecipientListPageAsync>>

        /** @see list */
        fun list(
            params: LockboxRecipientListParams = LockboxRecipientListParams.none()
        ): CompletableFuture<HttpResponseFor<LockboxRecipientListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<LockboxRecipientListPageAsync>> =
            list(LockboxRecipientListParams.none(), requestOptions)
    }
}
