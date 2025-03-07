// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async.simulations

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.CheckTransfer
import com.increase.api.models.SimulationCheckTransferMailParams
import java.util.concurrent.CompletableFuture

interface CheckTransferServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Simulates the mailing of a [Check Transfer](#check-transfers), which happens periodically
     * throughout the day in production but can be sped up in sandbox. This transfer must first have
     * a `status` of `pending_approval` or `pending_submission`.
     */
    fun mail(params: SimulationCheckTransferMailParams): CompletableFuture<CheckTransfer> =
        mail(params, RequestOptions.none())

    /** @see [mail] */
    fun mail(
        params: SimulationCheckTransferMailParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CheckTransfer>

    /**
     * A view of [CheckTransferServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post
         * /simulations/check_transfers/{check_transfer_id}/mail`, but is otherwise the same as
         * [CheckTransferServiceAsync.mail].
         */
        @MustBeClosed
        fun mail(
            params: SimulationCheckTransferMailParams
        ): CompletableFuture<HttpResponseFor<CheckTransfer>> = mail(params, RequestOptions.none())

        /** @see [mail] */
        @MustBeClosed
        fun mail(
            params: SimulationCheckTransferMailParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CheckTransfer>>
    }
}
