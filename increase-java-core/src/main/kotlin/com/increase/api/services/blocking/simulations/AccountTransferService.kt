// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking.simulations

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.accounttransfers.AccountTransfer
import com.increase.api.models.simulations.accounttransfers.AccountTransferCompleteParams

interface AccountTransferService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for
     * each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * If your account is configured to require approval for each transfer, this
     * endpoint simulates the approval of an [Account Transfer](#account-transfers).
     * You can also approve sandbox Account Transfers in the dashboard. This transfer
     * must first have a `status` of `pending_approval`.
     */
    fun complete(params: AccountTransferCompleteParams): AccountTransfer =
        complete(
          params, RequestOptions.none()
        )

    /** @see [complete] */
    fun complete(params: AccountTransferCompleteParams, requestOptions: RequestOptions = RequestOptions.none()): AccountTransfer

    /**
     * A view of [AccountTransferService] that provides access to raw HTTP responses
     * for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for
         * `post /simulations/account_transfers/{account_transfer_id}/complete`, but is
         * otherwise the same as [AccountTransferService.complete].
         */
        @MustBeClosed
        fun complete(params: AccountTransferCompleteParams): HttpResponseFor<AccountTransfer> =
            complete(
              params, RequestOptions.none()
            )

        /** @see [complete] */
        @MustBeClosed
        fun complete(params: AccountTransferCompleteParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<AccountTransfer>
    }
}
