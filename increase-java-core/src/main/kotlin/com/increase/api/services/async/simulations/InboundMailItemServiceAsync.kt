// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async.simulations

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.inboundmailitems.InboundMailItem
import com.increase.api.models.simulations.inboundmailitems.InboundMailItemCreateParams
import java.util.concurrent.CompletableFuture

interface InboundMailItemServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Simulates an inbound mail item to your account, as if someone had mailed a physical check to
     * one of your account's Lockboxes.
     */
    fun create(params: InboundMailItemCreateParams): CompletableFuture<InboundMailItem> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: InboundMailItemCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InboundMailItem>

    /**
     * A view of [InboundMailItemServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /simulations/inbound_mail_items`, but is otherwise
         * the same as [InboundMailItemServiceAsync.create].
         */
        @MustBeClosed
        fun create(
            params: InboundMailItemCreateParams
        ): CompletableFuture<HttpResponseFor<InboundMailItem>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: InboundMailItemCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InboundMailItem>>
    }
}
