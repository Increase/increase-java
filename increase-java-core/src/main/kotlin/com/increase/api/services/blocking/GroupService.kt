// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.Group
import com.increase.api.models.GroupRetrieveParams

interface GroupService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Returns details for the currently authenticated Group. */
    @JvmOverloads
    fun retrieve(
        params: GroupRetrieveParams = GroupRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Group

    /** Returns details for the currently authenticated Group. */
    fun retrieve(requestOptions: RequestOptions): Group =
        retrieve(GroupRetrieveParams.none(), requestOptions)

    /** A view of [GroupService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /groups/current`, but is otherwise the same as
         * [GroupService.retrieve].
         */
        @JvmOverloads
        @MustBeClosed
        fun retrieve(
            params: GroupRetrieveParams = GroupRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Group>

        /**
         * Returns a raw HTTP response for `get /groups/current`, but is otherwise the same as
         * [GroupService.retrieve].
         */
        @MustBeClosed
        fun retrieve(requestOptions: RequestOptions): HttpResponseFor<Group> =
            retrieve(GroupRetrieveParams.none(), requestOptions)
    }
}
