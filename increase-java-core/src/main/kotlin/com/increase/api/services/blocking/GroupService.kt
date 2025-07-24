// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.groups.Group
import com.increase.api.models.groups.GroupRetrieveParams
import java.util.function.Consumer

interface GroupService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): GroupService

    /** Returns details for the currently authenticated Group. */
    fun retrieve(): Group = retrieve(GroupRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        params: GroupRetrieveParams = GroupRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Group

    /** @see retrieve */
    fun retrieve(params: GroupRetrieveParams = GroupRetrieveParams.none()): Group =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(requestOptions: RequestOptions): Group =
        retrieve(GroupRetrieveParams.none(), requestOptions)

    /** A view of [GroupService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): GroupService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /groups/current`, but is otherwise the same as
         * [GroupService.retrieve].
         */
        @MustBeClosed fun retrieve(): HttpResponseFor<Group> = retrieve(GroupRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: GroupRetrieveParams = GroupRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Group>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: GroupRetrieveParams = GroupRetrieveParams.none()
        ): HttpResponseFor<Group> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(requestOptions: RequestOptions): HttpResponseFor<Group> =
            retrieve(GroupRetrieveParams.none(), requestOptions)
    }
}
