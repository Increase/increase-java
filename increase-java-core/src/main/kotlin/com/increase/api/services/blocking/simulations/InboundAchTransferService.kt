// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking.simulations

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.inboundachtransfers.InboundAchTransfer
import com.increase.api.models.simulations.inboundachtransfers.InboundAchTransferCreateParams
import java.util.function.Consumer

interface InboundAchTransferService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): InboundAchTransferService

    /**
     * Simulates an inbound ACH transfer to your account. This imitates initiating a transfer to an
     * Increase account from a different financial institution. The transfer may be either a credit
     * or a debit depending on if the `amount` is positive or negative. The result of calling this
     * API will contain the created transfer. You can pass a `resolve_at` parameter to allow for a
     * window to
     * [action on the Inbound ACH Transfer](https://increase.com/documentation/receiving-ach-transfers).
     * Alternatively, if you don't pass the `resolve_at` parameter the result will contain either a
     * [Transaction](#transactions) or a [Declined Transaction](#declined-transactions) depending on
     * whether or not the transfer is allowed.
     */
    fun create(params: InboundAchTransferCreateParams): InboundAchTransfer =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: InboundAchTransferCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InboundAchTransfer

    /**
     * A view of [InboundAchTransferService] that provides access to raw HTTP responses for each
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
        ): InboundAchTransferService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /simulations/inbound_ach_transfers`, but is
         * otherwise the same as [InboundAchTransferService.create].
         */
        @MustBeClosed
        fun create(params: InboundAchTransferCreateParams): HttpResponseFor<InboundAchTransfer> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: InboundAchTransferCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InboundAchTransfer>
    }
}
