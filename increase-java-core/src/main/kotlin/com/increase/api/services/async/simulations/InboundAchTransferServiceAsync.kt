// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.async.simulations

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.InboundAchTransfer
import com.increase.api.models.SimulationInboundAchTransferCreateParams
import java.util.concurrent.CompletableFuture

interface InboundAchTransferServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

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
    @JvmOverloads
    fun create(
        params: SimulationInboundAchTransferCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InboundAchTransfer>

    /**
     * A view of [InboundAchTransferServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /simulations/inbound_ach_transfers`, but is
         * otherwise the same as [InboundAchTransferServiceAsync.create].
         */
        @JvmOverloads
        @MustBeClosed
        fun create(
            params: SimulationInboundAchTransferCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InboundAchTransfer>>
    }
}
