// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async.simulations

import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.inboundmailitems.InboundMailItem
import com.increase.api.models.simulations.inboundmailitems.InboundMailItemCreateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface InboundMailItemServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): InboundMailItemServiceAsync

    /**
     * Simulates an Inbound Mail Item to one of your Lockbox Addresses or Lockbox Recipients, as if
     * someone had mailed a physical check. Increase automatically deposits a check mailed to a
     * Lockbox Recipient into the recipient's Account. A check mailed to a Lockbox Address must be
     * deposited or ignored with the [Action an Inbound Mail Item](#inbound-mail-items) endpoint.
     */
    fun create(params: InboundMailItemCreateParams): CompletableFuture<InboundMailItem> =
        create(params, RequestOptions.none())

    /** @see create */
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
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): InboundMailItemServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /simulations/inbound_mail_items`, but is otherwise
         * the same as [InboundMailItemServiceAsync.create].
         */
        fun create(
            params: InboundMailItemCreateParams
        ): CompletableFuture<HttpResponseFor<InboundMailItem>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: InboundMailItemCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InboundMailItem>>
    }
}
