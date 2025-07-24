// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking.simulations

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.inboundmailitems.InboundMailItem
import com.increase.api.models.simulations.inboundmailitems.InboundMailItemCreateParams
import java.util.function.Consumer

interface InboundMailItemService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): InboundMailItemService

    /**
     * Simulates an inbound mail item to your account, as if someone had mailed a physical check to
     * one of your account's Lockboxes.
     */
    fun create(params: InboundMailItemCreateParams): InboundMailItem =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: InboundMailItemCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InboundMailItem

    /**
     * A view of [InboundMailItemService] that provides access to raw HTTP responses for each
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
        ): InboundMailItemService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /simulations/inbound_mail_items`, but is otherwise
         * the same as [InboundMailItemService.create].
         */
        @MustBeClosed
        fun create(params: InboundMailItemCreateParams): HttpResponseFor<InboundMailItem> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: InboundMailItemCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InboundMailItem>
    }
}
