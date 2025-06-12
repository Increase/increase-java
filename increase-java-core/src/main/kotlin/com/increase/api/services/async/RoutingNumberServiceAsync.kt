// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.routingnumbers.RoutingNumberListPageAsync
import com.increase.api.models.routingnumbers.RoutingNumberListParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface RoutingNumberServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RoutingNumberServiceAsync

    /**
     * You can use this API to confirm if a routing number is valid, such as when a user is
     * providing you with bank account details. Since routing numbers uniquely identify a bank, this
     * will always return 0 or 1 entry. In Sandbox, the only valid routing number for this method
     * is 110000000.
     */
    fun list(params: RoutingNumberListParams): CompletableFuture<RoutingNumberListPageAsync> =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(
        params: RoutingNumberListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RoutingNumberListPageAsync>

    /**
     * A view of [RoutingNumberServiceAsync] that provides access to raw HTTP responses for each
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
        ): RoutingNumberServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /routing_numbers`, but is otherwise the same as
         * [RoutingNumberServiceAsync.list].
         */
        fun list(
            params: RoutingNumberListParams
        ): CompletableFuture<HttpResponseFor<RoutingNumberListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        fun list(
            params: RoutingNumberListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RoutingNumberListPageAsync>>
    }
}
