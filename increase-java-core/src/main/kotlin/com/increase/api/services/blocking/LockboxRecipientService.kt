// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.lockboxrecipients.LockboxRecipient
import com.increase.api.models.lockboxrecipients.LockboxRecipientCreateParams
import com.increase.api.models.lockboxrecipients.LockboxRecipientListPage
import com.increase.api.models.lockboxrecipients.LockboxRecipientListParams
import com.increase.api.models.lockboxrecipients.LockboxRecipientRetrieveParams
import com.increase.api.models.lockboxrecipients.LockboxRecipientUpdateParams
import java.util.function.Consumer

interface LockboxRecipientService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): LockboxRecipientService

    /** Create a Lockbox Recipient */
    fun create(params: LockboxRecipientCreateParams): LockboxRecipient =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: LockboxRecipientCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LockboxRecipient

    /** Retrieve a Lockbox Recipient */
    fun retrieve(lockboxRecipientId: String): LockboxRecipient =
        retrieve(lockboxRecipientId, LockboxRecipientRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        lockboxRecipientId: String,
        params: LockboxRecipientRetrieveParams = LockboxRecipientRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LockboxRecipient =
        retrieve(params.toBuilder().lockboxRecipientId(lockboxRecipientId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        lockboxRecipientId: String,
        params: LockboxRecipientRetrieveParams = LockboxRecipientRetrieveParams.none(),
    ): LockboxRecipient = retrieve(lockboxRecipientId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: LockboxRecipientRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LockboxRecipient

    /** @see retrieve */
    fun retrieve(params: LockboxRecipientRetrieveParams): LockboxRecipient =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(lockboxRecipientId: String, requestOptions: RequestOptions): LockboxRecipient =
        retrieve(lockboxRecipientId, LockboxRecipientRetrieveParams.none(), requestOptions)

    /** Update a Lockbox Recipient */
    fun update(lockboxRecipientId: String): LockboxRecipient =
        update(lockboxRecipientId, LockboxRecipientUpdateParams.none())

    /** @see update */
    fun update(
        lockboxRecipientId: String,
        params: LockboxRecipientUpdateParams = LockboxRecipientUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LockboxRecipient =
        update(params.toBuilder().lockboxRecipientId(lockboxRecipientId).build(), requestOptions)

    /** @see update */
    fun update(
        lockboxRecipientId: String,
        params: LockboxRecipientUpdateParams = LockboxRecipientUpdateParams.none(),
    ): LockboxRecipient = update(lockboxRecipientId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: LockboxRecipientUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LockboxRecipient

    /** @see update */
    fun update(params: LockboxRecipientUpdateParams): LockboxRecipient =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(lockboxRecipientId: String, requestOptions: RequestOptions): LockboxRecipient =
        update(lockboxRecipientId, LockboxRecipientUpdateParams.none(), requestOptions)

    /** List Lockbox Recipients */
    fun list(): LockboxRecipientListPage = list(LockboxRecipientListParams.none())

    /** @see list */
    fun list(
        params: LockboxRecipientListParams = LockboxRecipientListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LockboxRecipientListPage

    /** @see list */
    fun list(
        params: LockboxRecipientListParams = LockboxRecipientListParams.none()
    ): LockboxRecipientListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): LockboxRecipientListPage =
        list(LockboxRecipientListParams.none(), requestOptions)

    /**
     * A view of [LockboxRecipientService] that provides access to raw HTTP responses for each
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
        ): LockboxRecipientService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /lockbox_recipients`, but is otherwise the same as
         * [LockboxRecipientService.create].
         */
        @MustBeClosed
        fun create(params: LockboxRecipientCreateParams): HttpResponseFor<LockboxRecipient> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: LockboxRecipientCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LockboxRecipient>

        /**
         * Returns a raw HTTP response for `get /lockbox_recipients/{lockbox_recipient_id}`, but is
         * otherwise the same as [LockboxRecipientService.retrieve].
         */
        @MustBeClosed
        fun retrieve(lockboxRecipientId: String): HttpResponseFor<LockboxRecipient> =
            retrieve(lockboxRecipientId, LockboxRecipientRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            lockboxRecipientId: String,
            params: LockboxRecipientRetrieveParams = LockboxRecipientRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LockboxRecipient> =
            retrieve(
                params.toBuilder().lockboxRecipientId(lockboxRecipientId).build(),
                requestOptions,
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            lockboxRecipientId: String,
            params: LockboxRecipientRetrieveParams = LockboxRecipientRetrieveParams.none(),
        ): HttpResponseFor<LockboxRecipient> =
            retrieve(lockboxRecipientId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: LockboxRecipientRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LockboxRecipient>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: LockboxRecipientRetrieveParams): HttpResponseFor<LockboxRecipient> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            lockboxRecipientId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LockboxRecipient> =
            retrieve(lockboxRecipientId, LockboxRecipientRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /lockbox_recipients/{lockbox_recipient_id}`, but
         * is otherwise the same as [LockboxRecipientService.update].
         */
        @MustBeClosed
        fun update(lockboxRecipientId: String): HttpResponseFor<LockboxRecipient> =
            update(lockboxRecipientId, LockboxRecipientUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            lockboxRecipientId: String,
            params: LockboxRecipientUpdateParams = LockboxRecipientUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LockboxRecipient> =
            update(
                params.toBuilder().lockboxRecipientId(lockboxRecipientId).build(),
                requestOptions,
            )

        /** @see update */
        @MustBeClosed
        fun update(
            lockboxRecipientId: String,
            params: LockboxRecipientUpdateParams = LockboxRecipientUpdateParams.none(),
        ): HttpResponseFor<LockboxRecipient> =
            update(lockboxRecipientId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: LockboxRecipientUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LockboxRecipient>

        /** @see update */
        @MustBeClosed
        fun update(params: LockboxRecipientUpdateParams): HttpResponseFor<LockboxRecipient> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            lockboxRecipientId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LockboxRecipient> =
            update(lockboxRecipientId, LockboxRecipientUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /lockbox_recipients`, but is otherwise the same as
         * [LockboxRecipientService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<LockboxRecipientListPage> =
            list(LockboxRecipientListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: LockboxRecipientListParams = LockboxRecipientListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LockboxRecipientListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: LockboxRecipientListParams = LockboxRecipientListParams.none()
        ): HttpResponseFor<LockboxRecipientListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<LockboxRecipientListPage> =
            list(LockboxRecipientListParams.none(), requestOptions)
    }
}
