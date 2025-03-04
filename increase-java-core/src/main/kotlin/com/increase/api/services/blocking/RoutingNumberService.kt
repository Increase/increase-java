// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.RoutingNumberListPage
import com.increase.api.models.RoutingNumberListParams

interface RoutingNumberService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * You can use this API to confirm if a routing number is valid, such as when a user is
     * providing you with bank account details. Since routing numbers uniquely identify a bank, this
     * will always return 0 or 1 entry. In Sandbox, the only valid routing number for this method
     * is 110000000.
     */
    @JvmOverloads
    fun list(
        params: RoutingNumberListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RoutingNumberListPage

    /**
     * A view of [RoutingNumberService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /routing_numbers`, but is otherwise the same as
         * [RoutingNumberService.list].
         */
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: RoutingNumberListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RoutingNumberListPage>
    }
}
