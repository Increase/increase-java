// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.lockboxes.Lockbox
import com.increase.api.models.lockboxes.LockboxCreateParams
import com.increase.api.models.lockboxes.LockboxListPage
import com.increase.api.models.lockboxes.LockboxListParams
import com.increase.api.models.lockboxes.LockboxRetrieveParams
import com.increase.api.models.lockboxes.LockboxUpdateParams

interface LockboxService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create a Lockbox */
    fun create(params: LockboxCreateParams): Lockbox = create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: LockboxCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Lockbox

    /** Retrieve a Lockbox */
    fun retrieve(params: LockboxRetrieveParams): Lockbox = retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: LockboxRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Lockbox

    /** Update a Lockbox */
    fun update(params: LockboxUpdateParams): Lockbox = update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: LockboxUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Lockbox

    /** List Lockboxes */
    fun list(): LockboxListPage = list(LockboxListParams.none())

    /** @see [list] */
    fun list(
        params: LockboxListParams = LockboxListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LockboxListPage

    /** @see [list] */
    fun list(params: LockboxListParams = LockboxListParams.none()): LockboxListPage =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): LockboxListPage =
        list(LockboxListParams.none(), requestOptions)

    /** A view of [LockboxService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /lockboxes`, but is otherwise the same as
         * [LockboxService.create].
         */
        @MustBeClosed
        fun create(params: LockboxCreateParams): HttpResponseFor<Lockbox> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: LockboxCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Lockbox>

        /**
         * Returns a raw HTTP response for `get /lockboxes/{lockbox_id}`, but is otherwise the same
         * as [LockboxService.retrieve].
         */
        @MustBeClosed
        fun retrieve(params: LockboxRetrieveParams): HttpResponseFor<Lockbox> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: LockboxRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Lockbox>

        /**
         * Returns a raw HTTP response for `patch /lockboxes/{lockbox_id}`, but is otherwise the
         * same as [LockboxService.update].
         */
        @MustBeClosed
        fun update(params: LockboxUpdateParams): HttpResponseFor<Lockbox> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: LockboxUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Lockbox>

        /**
         * Returns a raw HTTP response for `get /lockboxes`, but is otherwise the same as
         * [LockboxService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<LockboxListPage> = list(LockboxListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: LockboxListParams = LockboxListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LockboxListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: LockboxListParams = LockboxListParams.none()
        ): HttpResponseFor<LockboxListPage> = list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<LockboxListPage> =
            list(LockboxListParams.none(), requestOptions)
    }
}
