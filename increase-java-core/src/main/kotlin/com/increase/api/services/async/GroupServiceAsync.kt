// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.groups.Group
import com.increase.api.models.groups.GroupRetrieveParams
import java.util.concurrent.CompletableFuture

interface GroupServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Returns details for the currently authenticated Group. */
    fun retrieve(): CompletableFuture<Group> = retrieve(GroupRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        params: GroupRetrieveParams = GroupRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Group>

    /** @see [retrieve] */
    fun retrieve(
        params: GroupRetrieveParams = GroupRetrieveParams.none()
    ): CompletableFuture<Group> = retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(requestOptions: RequestOptions): CompletableFuture<Group> =
        retrieve(GroupRetrieveParams.none(), requestOptions)

    /** A view of [GroupServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /groups/current`, but is otherwise the same as
         * [GroupServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(): CompletableFuture<HttpResponseFor<Group>> =
            retrieve(GroupRetrieveParams.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: GroupRetrieveParams = GroupRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Group>>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: GroupRetrieveParams = GroupRetrieveParams.none()
        ): CompletableFuture<HttpResponseFor<Group>> = retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<Group>> =
            retrieve(GroupRetrieveParams.none(), requestOptions)
    }
}
