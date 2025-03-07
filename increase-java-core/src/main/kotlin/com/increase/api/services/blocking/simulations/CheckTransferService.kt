// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking.simulations

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.CheckTransfer
import com.increase.api.models.SimulationCheckTransferMailParams

interface CheckTransferService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Simulates the mailing of a [Check Transfer](#check-transfers), which happens periodically
     * throughout the day in production but can be sped up in sandbox. This transfer must first have
     * a `status` of `pending_approval` or `pending_submission`.
     */
    fun mail(params: SimulationCheckTransferMailParams): CheckTransfer =
        mail(params, RequestOptions.none())

    /** @see [mail] */
    fun mail(
        params: SimulationCheckTransferMailParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CheckTransfer

    /**
     * A view of [CheckTransferService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post
         * /simulations/check_transfers/{check_transfer_id}/mail`, but is otherwise the same as
         * [CheckTransferService.mail].
         */
        @MustBeClosed
        fun mail(params: SimulationCheckTransferMailParams): HttpResponseFor<CheckTransfer> =
            mail(params, RequestOptions.none())

        /** @see [mail] */
        @MustBeClosed
        fun mail(
            params: SimulationCheckTransferMailParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CheckTransfer>
    }
}
