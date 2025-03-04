// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.Lockbox
import com.increase.api.models.LockboxCreateParams
import com.increase.api.models.LockboxListPage
import com.increase.api.models.LockboxListParams
import com.increase.api.models.LockboxRetrieveParams
import com.increase.api.models.LockboxUpdateParams

interface LockboxService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create a Lockbox */
    @JvmOverloads
    fun create(
        params: LockboxCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Lockbox

    /** Retrieve a Lockbox */
    @JvmOverloads
    fun retrieve(
        params: LockboxRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Lockbox

    /** Update a Lockbox */
    @JvmOverloads
    fun update(
        params: LockboxUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Lockbox

    /** List Lockboxes */
    @JvmOverloads
    fun list(
        params: LockboxListParams = LockboxListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LockboxListPage

    /** List Lockboxes */
    fun list(requestOptions: RequestOptions): LockboxListPage =
        list(LockboxListParams.none(), requestOptions)

    /** A view of [LockboxService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /lockboxes`, but is otherwise the same as
         * [LockboxService.create].
         */
        @JvmOverloads
        @MustBeClosed
        fun create(
            params: LockboxCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Lockbox>

        /**
         * Returns a raw HTTP response for `get /lockboxes/{lockbox_id}`, but is otherwise the same
         * as [LockboxService.retrieve].
         */
        @JvmOverloads
        @MustBeClosed
        fun retrieve(
            params: LockboxRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Lockbox>

        /**
         * Returns a raw HTTP response for `patch /lockboxes/{lockbox_id}`, but is otherwise the
         * same as [LockboxService.update].
         */
        @JvmOverloads
        @MustBeClosed
        fun update(
            params: LockboxUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Lockbox>

        /**
         * Returns a raw HTTP response for `get /lockboxes`, but is otherwise the same as
         * [LockboxService.list].
         */
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: LockboxListParams = LockboxListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LockboxListPage>

        /**
         * Returns a raw HTTP response for `get /lockboxes`, but is otherwise the same as
         * [LockboxService.list].
         */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<LockboxListPage> =
            list(LockboxListParams.none(), requestOptions)
    }
}
